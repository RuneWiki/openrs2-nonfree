import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rga")
public final class Class298 {

	@OriginalMember(owner = "client!rga", name = "b", descriptor = "Lclient!vaa;")
	private Class3 aClass3_1 = null;

	@OriginalMember(owner = "client!rga", name = "c", descriptor = "I")
	private int anInt7405 = 0;

	@OriginalMember(owner = "client!rga", name = "i", descriptor = "I")
	private int anInt7409 = 0;

	@OriginalMember(owner = "client!rga", name = "l", descriptor = "I")
	private int anInt7410 = 0;

	@OriginalMember(owner = "client!rga", name = "h", descriptor = "Lclient!uca;")
	private final Class162_Sub3 aClass162_Sub3_35;

	@OriginalMember(owner = "client!rga", name = "a", descriptor = "Lclient!al;")
	private final Class14 aClass14_5;

	@OriginalMember(owner = "client!rga", name = "k", descriptor = "[Lclient!or;")
	private final Class42[] aClass42Array1;

	@OriginalMember(owner = "client!rga", name = "e", descriptor = "Lclient!waa;")
	public final Class42_Sub8 aClass42_Sub8_1;

	@OriginalMember(owner = "client!rga", name = "<init>", descriptor = "(Lclient!uca;)V")
	public Class298(@OriginalArg(0) Class162_Sub3 arg0) {
		this.aClass162_Sub3_35 = arg0;
		this.aClass14_5 = new Class14(arg0);
		this.aClass42Array1 = new Class42[10];
		this.aClass42Array1[1] = new Class42_Sub6(arg0);
		this.aClass42Array1[2] = new Class42_Sub3(arg0, this.aClass14_5);
		this.aClass42Array1[4] = new Class42_Sub7(arg0, this.aClass14_5);
		this.aClass42Array1[5] = new Class42_Sub1(arg0, this.aClass14_5);
		this.aClass42Array1[6] = new Class42_Sub5(arg0);
		this.aClass42Array1[7] = new Class42_Sub9(arg0);
		this.aClass42Array1[3] = this.aClass42_Sub8_1 = new Class42_Sub8(arg0);
		this.aClass42Array1[8] = new Class42_Sub4(arg0, this.aClass14_5);
		this.aClass42Array1[9] = new Class42_Sub2(arg0, this.aClass14_5);
		if (!this.aClass42Array1[8].method7735()) {
			this.aClass42Array1[8] = this.aClass42Array1[4];
		}
		if (!this.aClass42Array1[9].method7735()) {
			this.aClass42Array1[9] = this.aClass42Array1[8];
		}
	}

	@OriginalMember(owner = "client!rga", name = "a", descriptor = "(IILclient!vaa;)Z")
	public boolean method5973(@OriginalArg(0) int arg0, @OriginalArg(2) Class3 arg1) {
		if (this.anInt7409 == 0) {
			return false;
		}
		if (arg1 != this.aClass3_1) {
			this.aClass42Array1[this.anInt7409 & Integer.MAX_VALUE].method7742(arg0, arg1);
			this.aClass3_1 = arg1;
		}
		return true;
	}

	@OriginalMember(owner = "client!rga", name = "a", descriptor = "(II)Z")
	public boolean method5974() {
		return this.aClass42Array1[3].method7735();
	}

	@OriginalMember(owner = "client!rga", name = "a", descriptor = "(IIIZZI)V")
	public void method5976(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		@Pc(9) boolean local9 = arg3 & this.aClass162_Sub3_35.method6837();
		if (!local9 && (arg1 == 4 || arg1 == 8 || arg1 == 9)) {
			if (arg1 == 4) {
				arg0 = arg2;
			}
			arg1 = 2;
		}
		if (arg1 != 0 && arg4) {
			arg1 |= Integer.MIN_VALUE;
		}
		if (arg1 != this.anInt7409) {
			if (this.anInt7409 != 0) {
				this.aClass42Array1[this.anInt7409 & Integer.MAX_VALUE].method7741();
			}
			if (arg1 != 0) {
				this.aClass42Array1[arg1 & Integer.MAX_VALUE].method7739(arg4);
				this.aClass42Array1[arg1 & Integer.MAX_VALUE].method7737(arg4);
				this.aClass42Array1[Integer.MAX_VALUE & arg1].method7738(arg0, arg2);
			}
			this.anInt7409 = arg1;
			this.anInt7410 = arg2;
			this.aClass3_1 = null;
			this.anInt7405 = arg0;
		} else if (this.anInt7409 != 0) {
			this.aClass42Array1[Integer.MAX_VALUE & this.anInt7409].method7737(arg4);
			if (this.anInt7410 != arg2 || arg0 != this.anInt7405) {
				this.aClass42Array1[this.anInt7409 & Integer.MAX_VALUE].method7738(arg0, arg2);
				this.anInt7405 = arg0;
				this.anInt7410 = arg2;
			}
		}
	}
}
