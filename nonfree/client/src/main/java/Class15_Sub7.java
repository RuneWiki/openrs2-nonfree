import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!si")
public final class Class15_Sub7 extends Class15 {

	@OriginalMember(owner = "client!si", name = "t", descriptor = "I")
	public int anInt4673;

	@OriginalMember(owner = "client!si", name = "v", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!si", name = "A", descriptor = "D")
	public double aDouble3;

	@OriginalMember(owner = "client!si", name = "E", descriptor = "D")
	public double aDouble4;

	@OriginalMember(owner = "client!si", name = "I", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!si", name = "J", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!si", name = "K", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!si", name = "P", descriptor = "I")
	private int anInt4686;

	@OriginalMember(owner = "client!si", name = "S", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!si", name = "T", descriptor = "Lclient!lg;")
	private Class87_Sub2 aClass87_Sub2_5;

	@OriginalMember(owner = "client!si", name = "ab", descriptor = "D")
	public double aDouble9;

	@OriginalMember(owner = "client!si", name = "p", descriptor = "I")
	private int anInt4669 = -32768;

	@OriginalMember(owner = "client!si", name = "u", descriptor = "I")
	private int anInt4674 = 0;

	@OriginalMember(owner = "client!si", name = "x", descriptor = "I")
	private int anInt4676 = 0;

	@OriginalMember(owner = "client!si", name = "F", descriptor = "Z")
	private boolean aBoolean318 = false;

	@OriginalMember(owner = "client!si", name = "B", descriptor = "Z")
	private boolean aBoolean317 = false;

	@OriginalMember(owner = "client!si", name = "M", descriptor = "I")
	private int anInt4684 = -1;

	@OriginalMember(owner = "client!si", name = "o", descriptor = "I")
	public int anInt4668;

	@OriginalMember(owner = "client!si", name = "H", descriptor = "I")
	public int anInt4682;

	@OriginalMember(owner = "client!si", name = "C", descriptor = "I")
	public int anInt4679;

	@OriginalMember(owner = "client!si", name = "R", descriptor = "I")
	private int anInt4688;

	@OriginalMember(owner = "client!si", name = "cb", descriptor = "I")
	private int anInt4696;

	@OriginalMember(owner = "client!si", name = "N", descriptor = "I")
	private int anInt4685;

	@OriginalMember(owner = "client!si", name = "X", descriptor = "I")
	public int anInt4692;

	@OriginalMember(owner = "client!si", name = "db", descriptor = "I")
	public int anInt4697;

	@OriginalMember(owner = "client!si", name = "j", descriptor = "I")
	private int anInt4664;

	@OriginalMember(owner = "client!si", name = "y", descriptor = "I")
	private int anInt4677;

	@OriginalMember(owner = "client!si", name = "Q", descriptor = "I")
	private int anInt4687;

	@OriginalMember(owner = "client!si", name = "n", descriptor = "Lclient!ro;")
	private Class157 aClass157_3;

	@OriginalMember(owner = "client!si", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class15_Sub7(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		this.anInt4668 = arg10;
		this.anInt4682 = arg1;
		this.anInt4679 = arg6;
		this.anInt4688 = arg2;
		this.anInt4696 = arg4;
		this.anInt4685 = arg3;
		this.aBoolean317 = false;
		this.anInt4692 = arg9;
		this.anInt4697 = arg5;
		this.anInt4664 = arg8;
		this.anInt4677 = arg7;
		this.anInt4687 = arg0;
		@Pc(61) int local61 = Static55.method978(this.anInt4687).anInt3473;
		if (local61 == -1) {
			this.aClass157_3 = null;
		} else {
			this.aClass157_3 = Static80.method1561(local61);
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(IIIIIIIIJILclient!lg;)V")
	@Override
	public void method4678(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class87_Sub2 arg10) {
		@Pc(3) Class15_Sub2 local3 = this.method4076();
		if (local3 != null) {
			this.method4073(local3);
			local3.method4678(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass87_Sub2_5);
			this.anInt4669 = local3.method4676();
		}
	}

	@OriginalMember(owner = "client!si", name = "b", descriptor = "(IIIII)V")
	public void method4071(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(20) double local20;
		if (!this.aBoolean317) {
			local20 = arg0 - this.anInt4688;
			@Pc(26) double local26 = (double) (arg3 - this.anInt4685);
			@Pc(35) double local35 = Math.sqrt(local20 * local20 + local26 * local26);
			this.aDouble3 = this.anInt4696;
			this.aDouble4 = (double) this.anInt4685 + (double) this.anInt4664 * local26 / local35;
			this.aDouble9 = (double) this.anInt4664 * local20 / local35 + (double) this.anInt4688;
		}
		local20 = this.anInt4679 + 1 - arg1;
		this.aDouble2 = ((double) arg0 - this.aDouble9) / local20;
		this.aDouble5 = ((double) arg3 - this.aDouble4) / local20;
		this.aDouble6 = Math.sqrt(this.aDouble5 * this.aDouble5 + this.aDouble2 * this.aDouble2);
		if (this.anInt4677 == -1) {
			this.aDouble8 = ((double) arg2 - this.aDouble3) / local20;
		} else {
			if (!this.aBoolean317) {
				this.aDouble8 = -this.aDouble6 * Math.tan((double) this.anInt4677 * 0.02454369D);
			}
			this.aDouble7 = ((double) arg2 - local20 * this.aDouble8 - this.aDouble3) * 2.0D / (local20 * local20);
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method4679(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (!this.aBoolean318) {
			@Pc(11) Class15_Sub2 local11 = this.method4076();
			if (local11 == null) {
				return;
			}
			this.method4073(local11);
		}
		if (this.aClass87_Sub2_5 != null) {
			this.aClass87_Sub2_5.method2719(arg0, arg1, arg3, arg2, arg4);
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(Lclient!bf;B)V")
	private void method4073(@OriginalArg(0) Class15_Sub2 arg0) {
		if (Static156.aBoolean211) {
			@Pc(14) Class15_Sub2_Sub1 local14 = (Class15_Sub2_Sub1) arg0;
			if ((this.aClass87_Sub2_5 == null || this.aClass87_Sub2_5.aBoolean213) && (local14.aClass180Array1 != null || local14.aClass176Array1 != null)) {
				this.aClass87_Sub2_5 = new Class87_Sub2(Static313.anInt2966, 1, 1);
			}
			if (this.aClass87_Sub2_5 != null) {
				this.aClass87_Sub2_5.method2718(local14.aClass180Array1, local14.aClass176Array1, false, local14.anIntArray53, local14.anIntArray51, local14.anIntArray49);
			}
		} else {
			@Pc(60) Class15_Sub2_Sub2 local60 = (Class15_Sub2_Sub2) arg0;
			if ((this.aClass87_Sub2_5 == null || this.aClass87_Sub2_5.aBoolean213) && (local60.aClass180Array2 != null || local60.aClass176Array2 != null)) {
				this.aClass87_Sub2_5 = new Class87_Sub2(Static313.anInt2966, 1, 1);
			}
			if (this.aClass87_Sub2_5 != null) {
				this.aClass87_Sub2_5.method2718(local60.aClass180Array2, local60.aClass176Array2, false, local60.anIntArray70, local60.anIntArray69, local60.anIntArray71);
			}
		}
		this.aBoolean318 = true;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "()I")
	@Override
	public int method4676() {
		return this.anInt4669;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(B)Lclient!bf;")
	private Class15_Sub2 method4076() {
		@Pc(8) Class114 local8 = Static55.method978(this.anInt4687);
		@Pc(18) Class15_Sub2 local18 = local8.method2985(this.anInt4676, this.anInt4684, this.anInt4674);
		if (local18 == null) {
			return null;
		} else {
			local18.method1041(this.anInt4686);
			return local18;
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(II)V")
	public void method4077(@OriginalArg(1) int arg0) {
		if (this.anInt4677 == -1) {
			this.aDouble3 += (double) arg0 * this.aDouble8;
		} else {
			this.aDouble3 += this.aDouble8 * (double) arg0 + (double) arg0 * (double) arg0 * 0.5D * this.aDouble7;
			this.aDouble8 += this.aDouble7 * (double) arg0;
		}
		this.aDouble9 += (double) arg0 * this.aDouble2;
		this.aBoolean317 = true;
		this.aDouble4 += (double) arg0 * this.aDouble5;
		this.anInt4673 = (int) (Math.atan2(this.aDouble2, this.aDouble5) * 325.949D) + 1024 & 0x7FF;
		this.anInt4686 = (int) (Math.atan2(this.aDouble8, this.aDouble6) * 325.949D) & 0x7FF;
		if (this.aClass157_3 == null) {
			return;
		}
		this.anInt4676 += arg0;
		while (true) {
			do {
				do {
					if (this.aClass157_3.anIntArray395[this.anInt4674] >= this.anInt4676) {
						return;
					}
					this.anInt4676 -= this.aClass157_3.anIntArray395[this.anInt4674];
					this.anInt4674++;
					if (this.anInt4674 >= this.aClass157_3.anIntArray396.length) {
						this.anInt4674 -= this.aClass157_3.anInt4530;
						if (this.anInt4674 < 0 || this.aClass157_3.anIntArray396.length <= this.anInt4674) {
							this.anInt4674 = 0;
						}
					}
					this.anInt4684 = this.anInt4674 + 1;
				} while (this.anInt4684 < this.aClass157_3.anIntArray396.length);
				this.anInt4684 -= this.aClass157_3.anInt4530;
			} while (this.anInt4684 >= 0 && this.anInt4684 < this.aClass157_3.anIntArray396.length);
			this.anInt4684 = -1;
		}
	}
}
