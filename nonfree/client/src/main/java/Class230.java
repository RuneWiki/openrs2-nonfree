import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sb")
public final class Class230 {

	@OriginalMember(owner = "client!sb", name = "h", descriptor = "I")
	private int anInt6375 = 0;

	@OriginalMember(owner = "client!sb", name = "j", descriptor = "I")
	private int anInt6377 = 0;

	@OriginalMember(owner = "client!sb", name = "f", descriptor = "I")
	private int anInt6373 = 0;

	@OriginalMember(owner = "client!sb", name = "s", descriptor = "Lclient!ei;")
	private Class62 aClass62_1 = null;

	@OriginalMember(owner = "client!sb", name = "r", descriptor = "Lclient!bt;")
	private final Class30_Sub1 aClass30_Sub1_39;

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "Lclient!pt;")
	private final Class201 aClass201_6;

	@OriginalMember(owner = "client!sb", name = "p", descriptor = "[Lclient!sa;")
	private final Class39[] aClass39Array1;

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "Lclient!ma;")
	public final Class39_Sub5 aClass39_Sub5_1;

	@OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Lclient!bt;)V")
	public Class230(@OriginalArg(0) Class30_Sub1 arg0) {
		this.aClass30_Sub1_39 = arg0;
		this.aClass201_6 = new Class201(arg0);
		this.aClass39Array1 = new Class39[10];
		this.aClass39Array1[1] = new Class39_Sub8(arg0);
		this.aClass39Array1[2] = new Class39_Sub6(arg0, this.aClass201_6);
		this.aClass39Array1[4] = new Class39_Sub7(arg0, this.aClass201_6);
		this.aClass39Array1[5] = new Class39_Sub1(arg0, this.aClass201_6);
		this.aClass39Array1[6] = new Class39_Sub3(arg0);
		this.aClass39Array1[7] = new Class39_Sub9(arg0);
		this.aClass39Array1[3] = this.aClass39_Sub5_1 = new Class39_Sub5(arg0);
		this.aClass39Array1[8] = new Class39_Sub2(arg0, this.aClass201_6);
		this.aClass39Array1[9] = new Class39_Sub4(arg0, this.aClass201_6);
		if (!this.aClass39Array1[8].method6000()) {
			this.aClass39Array1[8] = this.aClass39Array1[4];
		}
		if (!this.aClass39Array1[9].method6000()) {
			this.aClass39Array1[9] = this.aClass39Array1[8];
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIIIZZ)V")
	public void method5231(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) boolean arg4) {
		@Pc(9) boolean local9 = arg3 & this.aClass30_Sub1_39.method2101();
		if (!local9 && (arg1 == 4 || arg1 == 8 || arg1 == 9)) {
			if (arg1 == 4) {
				arg2 = arg0;
			}
			arg1 = 2;
		}
		if (arg1 != 0 && arg4) {
			arg1 |= Integer.MIN_VALUE;
		}
		if (arg1 != this.anInt6377) {
			if (this.anInt6377 != 0) {
				this.aClass39Array1[this.anInt6377 & Integer.MAX_VALUE].method5994();
			}
			if (arg1 != 0) {
				this.aClass39Array1[arg1 & Integer.MAX_VALUE].method5999(arg4);
				this.aClass39Array1[Integer.MAX_VALUE & arg1].method5996(arg4);
				this.aClass39Array1[Integer.MAX_VALUE & arg1].method5995(arg2, arg0);
			}
			this.anInt6373 = arg0;
			this.anInt6375 = arg2;
			this.aClass62_1 = null;
			this.anInt6377 = arg1;
		} else if (this.anInt6377 != 0) {
			this.aClass39Array1[this.anInt6377 & Integer.MAX_VALUE].method5996(arg4);
			if (arg0 != this.anInt6373 || arg2 != this.anInt6375) {
				this.aClass39Array1[this.anInt6377 & Integer.MAX_VALUE].method5995(arg2, arg0);
				this.anInt6375 = arg2;
				this.anInt6373 = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(ZI)Z")
	public boolean method5232() {
		return this.aClass39Array1[3].method6000();
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IBLclient!ei;)Z")
	public boolean method5233(@OriginalArg(0) int arg0, @OriginalArg(2) Class62 arg1) {
		if (this.anInt6377 == 0) {
			return false;
		}
		if (arg1 != this.aClass62_1) {
			this.aClass39Array1[this.anInt6377 & Integer.MAX_VALUE].method5997(arg1, arg0);
			this.aClass62_1 = arg1;
		}
		return true;
	}
}
