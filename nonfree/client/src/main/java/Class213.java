import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lt")
public final class Class213 {

	@OriginalMember(owner = "client!lt", name = "h", descriptor = "I")
	private int anInt5678 = 0;

	@OriginalMember(owner = "client!lt", name = "m", descriptor = "Lclient!vf;")
	private Class46 aClass46_1 = null;

	@OriginalMember(owner = "client!lt", name = "k", descriptor = "I")
	private int anInt5680 = 0;

	@OriginalMember(owner = "client!lt", name = "r", descriptor = "I")
	private int anInt5684 = 0;

	@OriginalMember(owner = "client!lt", name = "l", descriptor = "Lclient!lj;")
	private final Class78_Sub3 aClass78_Sub3_23;

	@OriginalMember(owner = "client!lt", name = "q", descriptor = "Lclient!ud;")
	private final Class329 aClass329_2;

	@OriginalMember(owner = "client!lt", name = "i", descriptor = "[Lclient!uc;")
	private final Class85[] aClass85Array1;

	@OriginalMember(owner = "client!lt", name = "f", descriptor = "Lclient!eo;")
	public final Class85_Sub1 aClass85_Sub1_1;

	@OriginalMember(owner = "client!lt", name = "<init>", descriptor = "(Lclient!lj;)V")
	public Class213(@OriginalArg(0) Class78_Sub3 arg0) {
		this.aClass78_Sub3_23 = arg0;
		this.aClass329_2 = new Class329(arg0);
		this.aClass85Array1 = new Class85[10];
		this.aClass85Array1[1] = new Class85_Sub4(arg0);
		this.aClass85Array1[2] = new Class85_Sub7(arg0, this.aClass329_2);
		this.aClass85Array1[4] = new Class85_Sub3(arg0, this.aClass329_2);
		this.aClass85Array1[5] = new Class85_Sub6(arg0, this.aClass329_2);
		this.aClass85Array1[6] = new Class85_Sub5(arg0);
		this.aClass85Array1[7] = new Class85_Sub2(arg0);
		this.aClass85Array1[3] = this.aClass85_Sub1_1 = new Class85_Sub1(arg0);
		this.aClass85Array1[8] = new Class85_Sub9(arg0, this.aClass329_2);
		this.aClass85Array1[9] = new Class85_Sub8(arg0, this.aClass329_2);
		if (!this.aClass85Array1[8].method6291()) {
			this.aClass85Array1[8] = this.aClass85Array1[4];
		}
		if (!this.aClass85Array1[9].method6291()) {
			this.aClass85Array1[9] = this.aClass85Array1[8];
		}
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(BZIZII)V")
	public void method4622(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(9) boolean local9 = arg0 & this.aClass78_Sub3_23.method6851();
		if (!local9 && (arg3 == 4 || arg3 == 8 || arg3 == 9)) {
			if (arg3 == 4) {
				arg4 = arg1;
			}
			arg3 = 2;
		}
		if (arg3 != 0 && arg2) {
			arg3 |= Integer.MIN_VALUE;
		}
		if (this.anInt5680 != arg3) {
			if (this.anInt5680 != 0) {
				this.aClass85Array1[this.anInt5680 & Integer.MAX_VALUE].method6287();
			}
			if (arg3 != 0) {
				this.aClass85Array1[arg3 & Integer.MAX_VALUE].method6289(arg2);
				this.aClass85Array1[Integer.MAX_VALUE & arg3].method6294(arg2);
				this.aClass85Array1[Integer.MAX_VALUE & arg3].method6292(arg1, arg4);
			}
			this.anInt5684 = arg4;
			this.aClass46_1 = null;
			this.anInt5678 = arg1;
			this.anInt5680 = arg3;
		} else if (this.anInt5680 != 0) {
			this.aClass85Array1[Integer.MAX_VALUE & this.anInt5680].method6294(arg2);
			if (arg1 != this.anInt5678 || this.anInt5684 != arg4) {
				this.aClass85Array1[this.anInt5680 & Integer.MAX_VALUE].method6292(arg1, arg4);
				this.anInt5684 = arg4;
				this.anInt5678 = arg1;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(IB)Z")
	public boolean method4626() {
		return this.aClass85Array1[3].method6291();
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(Lclient!vf;IB)Z")
	public boolean method4629(@OriginalArg(0) Class46 arg0, @OriginalArg(1) int arg1) {
		if (this.anInt5680 == 0) {
			return false;
		}
		if (arg0 != this.aClass46_1) {
			this.aClass85Array1[Integer.MAX_VALUE & this.anInt5680].method6288(arg1, arg0);
			this.aClass46_1 = arg0;
		}
		return true;
	}
}
