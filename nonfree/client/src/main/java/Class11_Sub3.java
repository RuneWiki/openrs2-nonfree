import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gb")
public final class Class11_Sub3 extends Class11 {

	@OriginalMember(owner = "client!gb", name = "f", descriptor = "D")
	private double aDouble1;

	@OriginalMember(owner = "client!gb", name = "l", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!gb", name = "m", descriptor = "Lclient!dh;")
	private Class22_Sub3 aClass22_Sub3_3;

	@OriginalMember(owner = "client!gb", name = "s", descriptor = "D")
	public double aDouble3;

	@OriginalMember(owner = "client!gb", name = "x", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!gb", name = "C", descriptor = "I")
	public int anInt1816;

	@OriginalMember(owner = "client!gb", name = "H", descriptor = "I")
	private int anInt1821;

	@OriginalMember(owner = "client!gb", name = "N", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!gb", name = "O", descriptor = "D")
	public double aDouble6;

	@OriginalMember(owner = "client!gb", name = "Q", descriptor = "D")
	public double aDouble7;

	@OriginalMember(owner = "client!gb", name = "W", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!gb", name = "j", descriptor = "Z")
	private boolean aBoolean177 = false;

	@OriginalMember(owner = "client!gb", name = "u", descriptor = "Z")
	private boolean aBoolean178 = false;

	@OriginalMember(owner = "client!gb", name = "y", descriptor = "I")
	private int anInt1813 = 0;

	@OriginalMember(owner = "client!gb", name = "T", descriptor = "I")
	private int anInt1829 = -1;

	@OriginalMember(owner = "client!gb", name = "J", descriptor = "I")
	private int anInt1823 = 0;

	@OriginalMember(owner = "client!gb", name = "I", descriptor = "I")
	private int anInt1822 = -32768;

	@OriginalMember(owner = "client!gb", name = "q", descriptor = "I")
	public int anInt1809;

	@OriginalMember(owner = "client!gb", name = "o", descriptor = "I")
	private int anInt1808;

	@OriginalMember(owner = "client!gb", name = "E", descriptor = "I")
	private int anInt1818;

	@OriginalMember(owner = "client!gb", name = "L", descriptor = "I")
	public int anInt1825;

	@OriginalMember(owner = "client!gb", name = "D", descriptor = "I")
	public int anInt1817;

	@OriginalMember(owner = "client!gb", name = "A", descriptor = "I")
	private int anInt1815;

	@OriginalMember(owner = "client!gb", name = "S", descriptor = "I")
	public int anInt1828;

	@OriginalMember(owner = "client!gb", name = "n", descriptor = "I")
	private int anInt1807;

	@OriginalMember(owner = "client!gb", name = "k", descriptor = "I")
	public int anInt1806;

	@OriginalMember(owner = "client!gb", name = "i", descriptor = "I")
	private int anInt1805;

	@OriginalMember(owner = "client!gb", name = "z", descriptor = "I")
	private int anInt1814;

	@OriginalMember(owner = "client!gb", name = "B", descriptor = "Lclient!sb;")
	private Class152 aClass152_2;

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class11_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		this.anInt1809 = arg6;
		this.anInt1808 = arg7;
		this.anInt1818 = arg3;
		this.anInt1825 = arg1;
		this.anInt1817 = arg5;
		this.anInt1815 = arg8;
		this.anInt1828 = arg10;
		this.aBoolean178 = false;
		this.anInt1807 = arg0;
		this.anInt1806 = arg9;
		this.anInt1805 = arg4;
		this.anInt1814 = arg2;
		@Pc(61) int local61 = Static226.method3632(this.anInt1807).anInt518;
		if (local61 == -1) {
			this.aClass152_2 = null;
		} else {
			this.aClass152_2 = Static107.method2016(local61);
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "()I")
	@Override
	public int method4297() {
		return this.anInt1822;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method4302(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (!this.aBoolean177) {
			@Pc(10) Class11_Sub1 local10 = this.method1682();
			if (local10 == null) {
				return;
			}
			this.method1681(local10);
		}
		if (this.aClass22_Sub3_3 != null) {
			this.aClass22_Sub3_3.method972(arg0, arg1, arg3, arg2, arg4);
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lclient!sm;I)V")
	private void method1681(@OriginalArg(0) Class11_Sub1 arg0) {
		if (Static71.aBoolean165) {
			@Pc(49) Class11_Sub1_Sub1 local49 = (Class11_Sub1_Sub1) arg0;
			if ((this.aClass22_Sub3_3 == null || this.aClass22_Sub3_3.aBoolean111) && (local49.aClass146Array1 != null || local49.aClass76Array1 != null)) {
				this.aClass22_Sub3_3 = new Class22_Sub3(Static167.anInt637, 1, 1);
			}
			if (this.aClass22_Sub3_3 != null) {
				this.aClass22_Sub3_3.method971(local49.aClass146Array1, local49.aClass76Array1, false, local49.anIntArray46, local49.anIntArray45, local49.anIntArray41);
			}
		} else {
			@Pc(4) Class11_Sub1_Sub2 local4 = (Class11_Sub1_Sub2) arg0;
			if ((this.aClass22_Sub3_3 == null || this.aClass22_Sub3_3.aBoolean111) && (local4.aClass146Array2 != null || local4.aClass76Array2 != null)) {
				this.aClass22_Sub3_3 = new Class22_Sub3(Static167.anInt637, 1, 1);
			}
			if (this.aClass22_Sub3_3 != null) {
				this.aClass22_Sub3_3.method971(local4.aClass146Array2, local4.aClass76Array2, false, local4.anIntArray312, local4.anIntArray311, local4.anIntArray319);
			}
		}
		this.aBoolean177 = true;
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(I)Lclient!sm;")
	private Class11_Sub1 method1682() {
		@Pc(13) Class15 local13 = Static226.method3632(this.anInt1807);
		@Pc(23) Class11_Sub1 local23 = local13.method496(this.anInt1813, this.anInt1823, this.anInt1829);
		if (local23 == null) {
			return null;
		} else {
			local23.method2896(this.anInt1821);
			return local23;
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(BIIII)V")
	public void method1683(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) double local9;
		if (!this.aBoolean178) {
			local9 = arg3 - this.anInt1814;
			@Pc(16) double local16 = (double) (arg0 - this.anInt1818);
			@Pc(25) double local25 = Math.sqrt(local16 * local16 + local9 * local9);
			this.aDouble3 = this.anInt1805;
			this.aDouble7 = (double) this.anInt1814 + local9 * (double) this.anInt1815 / local25;
			this.aDouble6 = local16 * (double) this.anInt1815 / local25 + (double) this.anInt1818;
		}
		local9 = this.anInt1809 + 1 - arg2;
		this.aDouble1 = ((double) arg0 - this.aDouble6) / local9;
		this.aDouble4 = ((double) arg3 - this.aDouble7) / local9;
		this.aDouble2 = Math.sqrt(this.aDouble4 * this.aDouble4 + this.aDouble1 * this.aDouble1);
		if (this.anInt1808 == -1) {
			this.aDouble5 = ((double) arg1 - this.aDouble3) / local9;
		} else {
			if (!this.aBoolean178) {
				this.aDouble5 = -this.aDouble2 * Math.tan((double) this.anInt1808 * 0.02454369D);
			}
			this.aDouble8 = ((double) arg1 - this.aDouble5 * local9 - this.aDouble3) * 2.0D / (local9 * local9);
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIIIIIIJILclient!dh;)V")
	@Override
	public void method4299(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class22_Sub3 arg10) {
		@Pc(7) Class11_Sub1 local7 = this.method1682();
		if (local7 != null) {
			this.method1681(local7);
			local7.method4299(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass22_Sub3_3);
			this.anInt1822 = local7.method4297();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IZ)V")
	public void method1684(@OriginalArg(0) int arg0) {
		if (this.anInt1808 == -1) {
			this.aDouble3 += (double) arg0 * this.aDouble5;
		} else {
			this.aDouble3 += (double) arg0 * 0.5D * this.aDouble8 * (double) arg0 + (double) arg0 * this.aDouble5;
			this.aDouble5 += (double) arg0 * this.aDouble8;
		}
		this.aDouble7 += this.aDouble4 * (double) arg0;
		this.aBoolean178 = true;
		this.aDouble6 += (double) arg0 * this.aDouble1;
		this.anInt1816 = (int) (Math.atan2(this.aDouble4, this.aDouble1) * 325.949D) + 1024 & 0x7FF;
		this.anInt1821 = (int) (Math.atan2(this.aDouble5, this.aDouble2) * 325.949D) & 0x7FF;
		if (this.aClass152_2 == null) {
			return;
		}
		this.anInt1823 += arg0;
		while (true) {
			do {
				do {
					if (this.anInt1823 <= this.aClass152_2.anIntArray512[this.anInt1813]) {
						return;
					}
					this.anInt1823 -= this.aClass152_2.anIntArray512[this.anInt1813];
					this.anInt1813++;
					if (this.anInt1813 >= this.aClass152_2.anIntArray509.length) {
						this.anInt1813 -= this.aClass152_2.anInt4594;
						if (this.anInt1813 < 0 || this.anInt1813 >= this.aClass152_2.anIntArray509.length) {
							this.anInt1813 = 0;
						}
					}
					this.anInt1829 = this.anInt1813 + 1;
				} while (this.anInt1829 < this.aClass152_2.anIntArray509.length);
				this.anInt1829 -= this.aClass152_2.anInt4594;
			} while (this.anInt1829 >= 0 && this.aClass152_2.anIntArray509.length > this.anInt1829);
			this.anInt1829 = -1;
		}
	}
}
