import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ls")
public final class Class210 {

	@OriginalMember(owner = "client!ls", name = "b", descriptor = "I")
	private int anInt6174 = 0;

	@OriginalMember(owner = "client!ls", name = "d", descriptor = "I")
	private int anInt6175 = 0;

	@OriginalMember(owner = "client!ls", name = "h", descriptor = "Lclient!jf;")
	private Class77 aClass77_1 = null;

	@OriginalMember(owner = "client!ls", name = "l", descriptor = "I")
	private int anInt6178 = 0;

	@OriginalMember(owner = "client!ls", name = "c", descriptor = "Lclient!kga;")
	private final Class44_Sub3 aClass44_Sub3_21;

	@OriginalMember(owner = "client!ls", name = "g", descriptor = "Lclient!wca;")
	private final Class353 aClass353_4;

	@OriginalMember(owner = "client!ls", name = "f", descriptor = "[Lclient!rw;")
	private final Class20[] aClass20Array1;

	@OriginalMember(owner = "client!ls", name = "i", descriptor = "Lclient!sda;")
	public final Class20_Sub8 aClass20_Sub8_1;

	@OriginalMember(owner = "client!ls", name = "<init>", descriptor = "(Lclient!kga;)V")
	public Class210(@OriginalArg(0) Class44_Sub3 arg0) {
		this.aClass44_Sub3_21 = arg0;
		this.aClass353_4 = new Class353(arg0);
		this.aClass20Array1 = new Class20[10];
		this.aClass20Array1[1] = new Class20_Sub5(arg0);
		this.aClass20Array1[2] = new Class20_Sub7(arg0, this.aClass353_4);
		this.aClass20Array1[4] = new Class20_Sub1(arg0, this.aClass353_4);
		this.aClass20Array1[5] = new Class20_Sub9(arg0, this.aClass353_4);
		this.aClass20Array1[6] = new Class20_Sub2(arg0);
		this.aClass20Array1[7] = new Class20_Sub6(arg0);
		this.aClass20Array1[3] = this.aClass20_Sub8_1 = new Class20_Sub8(arg0);
		this.aClass20Array1[8] = new Class20_Sub3(arg0, this.aClass353_4);
		this.aClass20Array1[9] = new Class20_Sub4(arg0, this.aClass353_4);
		if (!this.aClass20Array1[8].method7868()) {
			this.aClass20Array1[8] = this.aClass20Array1[4];
		}
		if (!this.aClass20Array1[9].method7868()) {
			this.aClass20Array1[9] = this.aClass20Array1[8];
		}
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(IZIIIZ)V")
	public void method5253(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		@Pc(9) boolean local9 = arg4 & this.aClass44_Sub3_21.method5008();
		if (!local9 && (arg3 == 4 || arg3 == 8 || arg3 == 9)) {
			if (arg3 == 4) {
				arg2 = arg0;
			}
			arg3 = 2;
		}
		if (arg3 != 0 && arg1) {
			arg3 |= Integer.MIN_VALUE;
		}
		if (arg3 != this.anInt6174) {
			if (this.anInt6174 != 0) {
				this.aClass20Array1[Integer.MAX_VALUE & this.anInt6174].method7867();
			}
			if (arg3 != 0) {
				this.aClass20Array1[arg3 & Integer.MAX_VALUE].method7862(arg1);
				this.aClass20Array1[arg3 & Integer.MAX_VALUE].method7870(arg1);
				this.aClass20Array1[Integer.MAX_VALUE & arg3].method7864(arg0, arg2);
			}
			this.aClass77_1 = null;
			this.anInt6175 = arg2;
			this.anInt6174 = arg3;
			this.anInt6178 = arg0;
		} else if (this.anInt6174 != 0) {
			this.aClass20Array1[Integer.MAX_VALUE & this.anInt6174].method7870(arg1);
			if (this.anInt6178 != arg0 || this.anInt6175 != arg2) {
				this.aClass20Array1[Integer.MAX_VALUE & this.anInt6174].method7864(arg0, arg2);
				this.anInt6175 = arg2;
				this.anInt6178 = arg0;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(II)Z")
	public boolean method5255() {
		return this.aClass20Array1[3].method7868();
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(ZLclient!jf;I)Z")
	public boolean method5256(@OriginalArg(1) Class77 arg0, @OriginalArg(2) int arg1) {
		if (this.anInt6174 == 0) {
			return false;
		}
		if (arg0 != this.aClass77_1) {
			this.aClass20Array1[this.anInt6174 & Integer.MAX_VALUE].method7863(arg0, arg1);
			this.aClass77_1 = arg0;
		}
		return true;
	}
}
