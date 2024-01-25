import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fl")
public final class Class5_Sub3_Sub1 extends Class5_Sub3 {

	@OriginalMember(owner = "client!fl", name = "A", descriptor = "D")
	private double aDouble1;

	@OriginalMember(owner = "client!fl", name = "C", descriptor = "Lclient!jl;")
	private Class15_Sub5 aClass15_Sub5_1;

	@OriginalMember(owner = "client!fl", name = "F", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!fl", name = "J", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!fl", name = "K", descriptor = "I")
	private int anInt1879;

	@OriginalMember(owner = "client!fl", name = "U", descriptor = "I")
	private int anInt1889;

	@OriginalMember(owner = "client!fl", name = "W", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!fl", name = "ab", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!fl", name = "eb", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!fl", name = "gb", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!fl", name = "jb", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!fl", name = "P", descriptor = "I")
	private int anInt1884 = 0;

	@OriginalMember(owner = "client!fl", name = "Y", descriptor = "I")
	private int anInt1892 = -1;

	@OriginalMember(owner = "client!fl", name = "mb", descriptor = "Z")
	private boolean aBoolean168 = false;

	@OriginalMember(owner = "client!fl", name = "X", descriptor = "I")
	private int anInt1891 = -32768;

	@OriginalMember(owner = "client!fl", name = "nb", descriptor = "I")
	private int anInt1900 = 0;

	@OriginalMember(owner = "client!fl", name = "ob", descriptor = "I")
	public final int anInt1901;

	@OriginalMember(owner = "client!fl", name = "V", descriptor = "I")
	private final int anInt1890;

	@OriginalMember(owner = "client!fl", name = "S", descriptor = "I")
	public final int anInt1887;

	@OriginalMember(owner = "client!fl", name = "M", descriptor = "I")
	public final int anInt1881;

	@OriginalMember(owner = "client!fl", name = "G", descriptor = "I")
	private final int anInt1877;

	@OriginalMember(owner = "client!fl", name = "fb", descriptor = "I")
	public final int anInt1896;

	@OriginalMember(owner = "client!fl", name = "Z", descriptor = "I")
	private final int anInt1893;

	@OriginalMember(owner = "client!fl", name = "db", descriptor = "Lclient!lo;")
	private final Class121 aClass121_1;

	@OriginalMember(owner = "client!fl", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class5_Sub3_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg1, arg2, arg4, arg3, arg2 >> 7, arg2 >> 7, arg3 >> 7, arg3 >> 7, false, (byte) 0);
		this.anInt1901 = arg10;
		this.aBoolean168 = false;
		this.anInt1890 = arg0;
		this.anInt1887 = arg9;
		this.anInt1881 = arg6;
		this.anInt1877 = arg7;
		this.anInt1896 = arg5;
		this.anInt1893 = arg8;
		@Pc(64) int local64 = Static183.method3571(this.anInt1890).anInt3913;
		if (local64 == -1) {
			this.aClass121_1 = null;
		} else {
			this.aClass121_1 = Static133.method2520(local64);
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(B)V")
	public void method1777() {
		if (this.aClass15_Sub5_1 != null) {
			this.aClass15_Sub5_1.method2858();
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(Lclient!aa;Z)V")
	@Override
	public void method5686(@OriginalArg(0) Class2 arg0) {
		@Pc(13) Class78 local13 = this.method1782(0, arg0);
		if (local13 == null) {
			return;
		}
		@Pc(19) Class21 local19 = arg0.method3284();
		local19.method2805(this.anInt1879);
		local19.method2802(this.anInt1889);
		local19.method2810((int) this.aDouble5, (int) this.aDouble2, (int) this.aDouble6);
		this.anInt1891 = local13.method4388();
		this.method1779(arg0, local13);
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(IZIILclient!aa;ILclient!qh;)V")
	@Override
	public void method5677(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class2 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class5 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(BLclient!aa;Lclient!hc;)V")
	private void method1779(@OriginalArg(1) Class2 arg0, @OriginalArg(2) Class78 arg1) {
		@Pc(6) Class154[] local6 = arg1.method4383();
		@Pc(9) Class85[] local9 = arg1.method4376();
		if ((this.aClass15_Sub5_1 == null || this.aClass15_Sub5_1.aBoolean259) && (local6 != null || local9 != null)) {
			this.aClass15_Sub5_1 = new Class15_Sub5(Static215.anInt4246);
		}
		if (this.aClass15_Sub5_1 != null) {
			this.aClass15_Sub5_1.method2859(arg0, (long) Static215.anInt4246, local6, local9);
			this.aClass15_Sub5_1.method2861(super.aByte53, super.aShort75, super.aShort78, super.aShort77, super.aShort76);
		}
	}

	@OriginalMember(owner = "client!fl", name = "c", descriptor = "(B)V")
	@Override
	public void method5678() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(Lclient!aa;I)Lclient!cn;")
	@Override
	public Class15_Sub3 method5680(@OriginalArg(0) Class2 arg0) {
		@Pc(15) Class78 local15 = this.method1782(1024, arg0);
		if (local15 == null) {
			return null;
		}
		@Pc(22) Class21 local22 = arg0.method3284();
		local22.method2805(this.anInt1879);
		local22.method2802(this.anInt1889);
		local22.method2810((int) this.aDouble5, (int) this.aDouble2, (int) this.aDouble6);
		if (this.aClass15_Sub5_1 == null) {
			local15.method4379(local22, null, 0);
		} else {
			@Pc(55) Class162 local55 = this.aClass15_Sub5_1.method2868();
			arg0.method3236(local15, local55, local22, null);
		}
		this.anInt1891 = local15.method4388();
		this.method1779(arg0, local15);
		return null;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(IBIII)V")
	public void method1780(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) double local9;
		if (!this.aBoolean168) {
			local9 = arg2 - super.anInt5050;
			@Pc(15) double local15 = (double) (arg1 - super.anInt5047);
			@Pc(24) double local24 = Math.sqrt(local15 * local15 + local9 * local9);
			this.aDouble5 = (double) super.anInt5050 + (double) this.anInt1893 * local9 / local24;
			this.aDouble6 = local15 * (double) this.anInt1893 / local24 + (double) super.anInt5047;
			this.aDouble2 = super.anInt5046;
		}
		local9 = this.anInt1881 + 1 - arg3;
		this.aDouble8 = ((double) arg2 - this.aDouble5) / local9;
		this.aDouble1 = ((double) arg1 - this.aDouble6) / local9;
		this.aDouble7 = Math.sqrt(this.aDouble8 * this.aDouble8 + this.aDouble1 * this.aDouble1);
		if (this.anInt1877 == -1) {
			this.aDouble4 = ((double) arg0 - this.aDouble2) / local9;
		} else {
			if (!this.aBoolean168) {
				this.aDouble4 = -this.aDouble7 * Math.tan((double) this.anInt1877 * 0.02454369D);
			}
			this.aDouble3 = ((double) arg0 - local9 * this.aDouble4 - this.aDouble2) * 2.0D / (local9 * local9);
		}
	}

	@OriginalMember(owner = "client!fl", name = "b", descriptor = "(Z)I")
	@Override
	public int method4586() {
		return this.anInt1891;
	}

	@OriginalMember(owner = "client!fl", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass15_Sub5_1 != null) {
			this.aClass15_Sub5_1.method2858();
		}
	}

	@OriginalMember(owner = "client!fl", name = "e", descriptor = "(B)V")
	@Override
	public void method4584() {
		super.aShort75 = super.aShort78 = (short) (this.aDouble5 / 128.0D);
		super.aShort77 = super.aShort76 = (short) (this.aDouble6 / 128.0D);
	}

	@OriginalMember(owner = "client!fl", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method5681() {
		return false;
	}

	@OriginalMember(owner = "client!fl", name = "c", descriptor = "(II)V")
	public void method1781(@OriginalArg(0) int arg0) {
		this.aDouble5 += this.aDouble8 * (double) arg0;
		this.aDouble6 += this.aDouble1 * (double) arg0;
		this.aBoolean168 = true;
		if (this.anInt1877 == -1) {
			this.aDouble2 += (double) arg0 * this.aDouble4;
		} else {
			this.aDouble2 += (double) arg0 * this.aDouble4 + (double) arg0 * 0.5D * this.aDouble3 * (double) arg0;
			this.aDouble4 += this.aDouble3 * (double) arg0;
		}
		this.anInt1889 = (int) (Math.atan2(this.aDouble8, this.aDouble1) * 2607.5945876176133D) + 8192 & 0x3FFF;
		this.anInt1879 = (int) (Math.atan2(this.aDouble4, this.aDouble7) * 2607.5945876176133D) & 0x3FFF;
		if (this.aClass121_1 == null) {
			return;
		}
		this.anInt1884 += arg0;
		while (true) {
			do {
				do {
					if (this.anInt1884 <= this.aClass121_1.anIntArray444[this.anInt1900]) {
						return;
					}
					this.anInt1884 -= this.aClass121_1.anIntArray444[this.anInt1900];
					this.anInt1900++;
					if (this.aClass121_1.anIntArray446.length <= this.anInt1900) {
						this.anInt1900 -= this.aClass121_1.anInt3769;
						if (this.anInt1900 < 0 || this.anInt1900 >= this.aClass121_1.anIntArray446.length) {
							this.anInt1900 = 0;
						}
					}
					this.anInt1892 = this.anInt1900 + 1;
				} while (this.anInt1892 < this.aClass121_1.anIntArray446.length);
				this.anInt1892 -= this.aClass121_1.anInt3769;
			} while (this.anInt1892 >= 0 && this.aClass121_1.anIntArray446.length > this.anInt1892);
			this.anInt1892 = -1;
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(ILclient!aa;I)Lclient!hc;")
	private Class78 method1782(@OriginalArg(0) int arg0, @OriginalArg(1) Class2 arg1) {
		@Pc(8) Class125 local8 = Static183.method3571(this.anInt1890);
		return local8.method3646(this.anInt1900, this.anInt1884, this.anInt1892, arg1, arg0);
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIILclient!aa;)Z")
	@Override
	public boolean method5684(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class2 arg2) {
		return false;
	}
}
