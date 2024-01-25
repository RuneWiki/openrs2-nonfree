import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rj")
public final class Class3_Sub4_Sub4 extends Class3_Sub4 {

	@OriginalMember(owner = "client!rj", name = "B", descriptor = "Lclient!bv;")
	private Class21_Sub2 aClass21_Sub2_7;

	@OriginalMember(owner = "client!rj", name = "C", descriptor = "D")
	private double aDouble1;

	@OriginalMember(owner = "client!rj", name = "D", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!rj", name = "L", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!rj", name = "O", descriptor = "I")
	private int anInt5872;

	@OriginalMember(owner = "client!rj", name = "P", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!rj", name = "R", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!rj", name = "V", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!rj", name = "bb", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!rj", name = "ob", descriptor = "I")
	private int anInt5890;

	@OriginalMember(owner = "client!rj", name = "qb", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!rj", name = "F", descriptor = "I")
	private int anInt5865 = -1;

	@OriginalMember(owner = "client!rj", name = "Z", descriptor = "I")
	private int anInt5878 = -32768;

	@OriginalMember(owner = "client!rj", name = "T", descriptor = "Z")
	private boolean aBoolean430 = false;

	@OriginalMember(owner = "client!rj", name = "fb", descriptor = "I")
	private int anInt5883 = 0;

	@OriginalMember(owner = "client!rj", name = "jb", descriptor = "I")
	private int anInt5886 = 0;

	@OriginalMember(owner = "client!rj", name = "J", descriptor = "I")
	public final int anInt5869;

	@OriginalMember(owner = "client!rj", name = "S", descriptor = "I")
	private final int anInt5873;

	@OriginalMember(owner = "client!rj", name = "X", descriptor = "I")
	public final int anInt5876;

	@OriginalMember(owner = "client!rj", name = "cb", descriptor = "I")
	private final int anInt5880;

	@OriginalMember(owner = "client!rj", name = "ib", descriptor = "I")
	public final int anInt5885;

	@OriginalMember(owner = "client!rj", name = "mb", descriptor = "I")
	private final int anInt5888;

	@OriginalMember(owner = "client!rj", name = "N", descriptor = "I")
	private final int anInt5871;

	@OriginalMember(owner = "client!rj", name = "eb", descriptor = "I")
	public final int anInt5882;

	@OriginalMember(owner = "client!rj", name = "M", descriptor = "Z")
	private final boolean aBoolean429;

	@OriginalMember(owner = "client!rj", name = "pb", descriptor = "Lclient!jp;")
	private final Class128 aClass128_3;

	@OriginalMember(owner = "client!rj", name = "<init>", descriptor = "(IIIIIIIIIIIZ)V")
	public Class3_Sub4_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11) {
		super(arg1, arg2, Static302.method3973(arg3, arg2, arg1) - arg4, arg3, arg2 >> 7, arg2 >> 7, arg3 >> 7, arg3 >> 7, false, (byte) 0);
		this.anInt5869 = arg10;
		this.anInt5873 = arg4;
		this.anInt5876 = arg5;
		this.aBoolean430 = false;
		this.anInt5880 = arg0;
		this.anInt5885 = arg6;
		this.anInt5888 = arg8;
		this.anInt5871 = arg7;
		this.anInt5882 = arg9;
		this.aBoolean429 = arg11;
		@Pc(78) int local78 = Static431.aClass36_2.method696(this.anInt5880).anInt6240;
		if (local78 == -1) {
			this.aClass128_3 = null;
		} else {
			this.aClass128_3 = Static334.aClass62_2.method1418(local78);
		}
	}

	@OriginalMember(owner = "client!rj", name = "c", descriptor = "(Lclient!za;I)V")
	@Override
	public void method5285(@OriginalArg(0) Class163 arg0) {
		@Pc(9) Class59 local9 = this.method4604(arg0, 0);
		if (local9 == null) {
			return;
		}
		@Pc(15) Class31 local15 = arg0.method5539();
		local15.g(this.anInt5872);
		local15.EA(this.anInt5890);
		local15.W((int) this.aDouble3, (int) this.aDouble7, (int) this.aDouble6);
		this.anInt5878 = local9.B();
		this.method4606(local9, arg0);
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lclient!lb;IZIBILclient!za;)V")
	@Override
	public void method5281(@OriginalArg(0) Class3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class163 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lclient!za;IB)Lclient!e;")
	private Class59 method4604(@OriginalArg(0) Class163 arg0, @OriginalArg(1) int arg1) {
		@Pc(14) Class229 local14 = Static431.aClass36_2.method696(this.anInt5880);
		return local14.method4862(this.anInt5883, this.anInt5886, arg1, arg0, Static334.aClass62_2, this.anInt5865);
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(BI)V")
	public void method4605(@OriginalArg(1) int arg0) {
		this.aDouble3 += (double) arg0 * this.aDouble4;
		this.aDouble6 += this.aDouble1 * (double) arg0;
		this.aBoolean430 = true;
		if (this.aBoolean429) {
			this.aDouble7 = Static302.method3973((int) this.aDouble6, (int) this.aDouble3, super.aByte91) - this.anInt5873;
		} else if (this.anInt5871 == -1) {
			this.aDouble7 += (double) arg0 * this.aDouble5;
		} else {
			this.aDouble7 += this.aDouble5 * (double) arg0 + this.aDouble2 * 0.5D * (double) arg0 * (double) arg0;
			this.aDouble5 += (double) arg0 * this.aDouble2;
		}
		this.anInt5890 = (int) (Math.atan2(this.aDouble4, this.aDouble1) * 2607.5945876176133D) + 8192 & 0x3FFF;
		this.anInt5872 = (int) (Math.atan2(this.aDouble5, this.aDouble8) * 2607.5945876176133D) & 0x3FFF;
		if (this.aClass128_3 == null) {
			return;
		}
		this.anInt5883 += arg0;
		while (true) {
			do {
				do {
					if (this.anInt5883 <= this.aClass128_3.anIntArray276[this.anInt5886]) {
						return;
					}
					this.anInt5883 -= this.aClass128_3.anIntArray276[this.anInt5886];
					this.anInt5886++;
					if (this.aClass128_3.anIntArray278.length <= this.anInt5886) {
						this.anInt5886 -= this.aClass128_3.anInt3335;
						if (this.anInt5886 < 0 || this.aClass128_3.anIntArray278.length <= this.anInt5886) {
							this.anInt5886 = 0;
						}
					}
					this.anInt5865 = this.anInt5886 + 1;
				} while (this.anInt5865 < this.aClass128_3.anIntArray278.length);
				this.anInt5865 -= this.aClass128_3.anInt3335;
			} while (this.anInt5865 >= 0 && this.aClass128_3.anIntArray278.length > this.anInt5865);
			this.anInt5865 = -1;
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IBILclient!za;)Z")
	@Override
	public boolean method5282(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class163 arg2) {
		return false;
	}

	@OriginalMember(owner = "client!rj", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method5277() {
		return false;
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(BLclient!za;)Lclient!ql;")
	@Override
	public Class21_Sub6 method5280(@OriginalArg(1) Class163 arg0) {
		@Pc(18) Class59 local18 = this.method4604(arg0, 2048);
		if (local18 == null) {
			return null;
		}
		@Pc(25) Class31 local25 = arg0.method5539();
		local25.g(this.anInt5872);
		local25.EA(this.anInt5890);
		local25.W((int) this.aDouble3, (int) this.aDouble7, (int) this.aDouble6);
		if (this.aClass21_Sub2_7 == null) {
			local18.method5736(local25, null, 0);
		} else {
			@Pc(58) Class256 local58 = this.aClass21_Sub2_7.method634();
			arg0.method5551(local18, local58, local25, null);
		}
		this.anInt5878 = local18.B();
		this.method4606(local18, arg0);
		return null;
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(ILclient!e;Lclient!za;)V")
	private void method4606(@OriginalArg(1) Class59 arg0, @OriginalArg(2) Class163 arg1) {
		@Pc(6) Class155[] local6 = arg0.method5742();
		@Pc(9) Class199[] local9 = arg0.method5749();
		if ((this.aClass21_Sub2_7 == null || this.aClass21_Sub2_7.aBoolean68) && (local6 != null || local9 != null)) {
			this.aClass21_Sub2_7 = new Class21_Sub2(Static266.anInt4392);
		}
		if (this.aClass21_Sub2_7 != null) {
			this.aClass21_Sub2_7.method641(arg1, (long) Static266.anInt4392, local6, local9);
			this.aClass21_Sub2_7.method637(super.aByte91, super.aShort92, super.aShort91, super.aShort89, super.aShort90);
		}
	}

	@OriginalMember(owner = "client!rj", name = "e", descriptor = "(I)V")
	@Override
	public void method5284() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!rj", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass21_Sub2_7 != null) {
			this.aClass21_Sub2_7.method635();
		}
	}

	@OriginalMember(owner = "client!rj", name = "f", descriptor = "(I)I")
	@Override
	public int method5286() {
		return this.anInt5878;
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIBII)V")
	public void method4607(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) double local9;
		if (!this.aBoolean430) {
			local9 = arg1 - super.anInt6833;
			@Pc(16) double local16 = (double) (arg0 - super.anInt6835);
			@Pc(25) double local25 = Math.sqrt(local16 * local16 + local9 * local9);
			this.aDouble3 = (double) super.anInt6833 + local9 * (double) this.anInt5888 / local25;
			this.aDouble6 = local16 * (double) this.anInt5888 / local25 + (double) super.anInt6835;
			if (this.aBoolean429) {
				this.aDouble7 = Static302.method3973((int) this.aDouble6, (int) this.aDouble3, super.aByte91) - this.anInt5873;
			} else {
				this.aDouble7 = super.anInt6832;
			}
		}
		local9 = this.anInt5885 + 1 - arg3;
		this.aDouble4 = ((double) arg1 - this.aDouble3) / local9;
		this.aDouble1 = ((double) arg0 - this.aDouble6) / local9;
		this.aDouble8 = Math.sqrt(this.aDouble4 * this.aDouble4 + this.aDouble1 * this.aDouble1);
		if (this.anInt5871 == -1) {
			this.aDouble5 = ((double) arg2 - this.aDouble7) / local9;
		} else {
			if (!this.aBoolean430) {
				this.aDouble5 = -this.aDouble8 * Math.tan((double) this.anInt5871 * 0.02454369D);
			}
			this.aDouble2 = ((double) arg2 - this.aDouble5 * local9 - this.aDouble7) * 2.0D / (local9 * local9);
		}
	}

	@OriginalMember(owner = "client!rj", name = "g", descriptor = "(I)V")
	@Override
	public void method5288() {
		super.aShort89 = super.aShort90 = (short) (this.aDouble6 / 128.0D);
		super.aShort92 = super.aShort91 = (short) (this.aDouble3 / 128.0D);
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(I)V")
	public void method4608() {
		if (this.aClass21_Sub2_7 != null) {
			this.aClass21_Sub2_7.method635();
		}
	}
}
