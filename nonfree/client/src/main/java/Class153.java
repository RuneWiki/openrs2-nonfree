import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!me")
public final class Class153 {

	@OriginalMember(owner = "client!me", name = "n", descriptor = "I")
	private int anInt4649 = 0;

	@OriginalMember(owner = "client!me", name = "j", descriptor = "Lclient!rh;")
	private Class42 aClass42_1 = null;

	@OriginalMember(owner = "client!me", name = "p", descriptor = "I")
	private int anInt4650 = 0;

	@OriginalMember(owner = "client!me", name = "m", descriptor = "I")
	private int anInt4648 = 0;

	@OriginalMember(owner = "client!me", name = "i", descriptor = "Lclient!gk;")
	private final Class75_Sub2 aClass75_Sub2_29;

	@OriginalMember(owner = "client!me", name = "h", descriptor = "Lclient!wl;")
	private final Class264 aClass264_4;

	@OriginalMember(owner = "client!me", name = "l", descriptor = "[Lclient!re;")
	private final Class51[] aClass51Array1;

	@OriginalMember(owner = "client!me", name = "c", descriptor = "Lclient!di;")
	public final Class51_Sub1 aClass51_Sub1_1;

	@OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Lclient!gk;)V")
	public Class153(@OriginalArg(0) Class75_Sub2 arg0) {
		this.aClass75_Sub2_29 = arg0;
		this.aClass264_4 = new Class264(arg0);
		this.aClass51Array1 = new Class51[10];
		this.aClass51Array1[1] = new Class51_Sub8(arg0);
		this.aClass51Array1[2] = new Class51_Sub6(arg0, this.aClass264_4);
		this.aClass51Array1[4] = new Class51_Sub3(arg0, this.aClass264_4);
		this.aClass51Array1[5] = new Class51_Sub2(arg0, this.aClass264_4);
		this.aClass51Array1[6] = new Class51_Sub9(arg0);
		this.aClass51Array1[7] = new Class51_Sub4(arg0);
		this.aClass51Array1[3] = this.aClass51_Sub1_1 = new Class51_Sub1(arg0);
		this.aClass51Array1[8] = new Class51_Sub5(arg0, this.aClass264_4);
		this.aClass51Array1[9] = new Class51_Sub7(arg0, this.aClass264_4);
		if (!this.aClass51Array1[8].method4955()) {
			this.aClass51Array1[8] = this.aClass51Array1[4];
		}
		if (!this.aClass51Array1[9].method4955()) {
			this.aClass51Array1[9] = this.aClass51Array1[8];
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IBI)V")
	public void method3786(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anInt4649 != 0 & (arg0 != this.anInt4650 | this.anInt4648 != arg1)) {
			this.aClass51Array1[Integer.MAX_VALUE & this.anInt4649].method4958(arg0, arg1);
			this.anInt4648 = arg1;
			this.anInt4650 = arg0;
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(Lclient!rh;BI)Z")
	public boolean method3787(@OriginalArg(0) Class42 arg0, @OriginalArg(2) int arg1) {
		if (this.anInt4649 == 0) {
			return false;
		}
		if (this.aClass42_1 != arg0) {
			this.aClass51Array1[Integer.MAX_VALUE & this.anInt4649].method4960(arg0, arg1);
			this.aClass42_1 = arg0;
		}
		return true;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(ZZII)V")
	public void method3789(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		@Pc(5) boolean local5 = arg0 & this.aClass75_Sub2_29.method2624();
		if (!local5 && (arg2 == 4 || arg2 == 8)) {
			arg2 = 2;
		}
		if (arg2 != 0 && arg1) {
			arg2 |= Integer.MIN_VALUE;
		}
		if (this.anInt4649 != arg2) {
			if (this.anInt4649 != 0) {
				this.aClass51Array1[Integer.MAX_VALUE & this.anInt4649].method4957();
			}
			if (arg2 != 0) {
				this.aClass51Array1[Integer.MAX_VALUE & arg2].method4961(arg1);
				this.aClass51Array1[arg2 & Integer.MAX_VALUE].method4956(arg1);
			}
			this.anInt4648 = Integer.MIN_VALUE;
			this.aClass42_1 = null;
			this.anInt4649 = arg2;
			this.anInt4650 = Integer.MIN_VALUE;
		} else if (this.anInt4649 != 0) {
			this.aClass51Array1[this.anInt4649 & Integer.MAX_VALUE].method4956(arg1);
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(BI)Z")
	public boolean method3791() {
		return this.aClass51Array1[3].method4955();
	}
}
