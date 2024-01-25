import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!g")
public final class Class16_Sub1_Sub3 extends Class16_Sub1 {

	@OriginalMember(owner = "client!g", name = "x", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!g", name = "C", descriptor = "Lclient!ao;")
	private Class3_Sub2 aClass3_Sub2_3;

	@OriginalMember(owner = "client!g", name = "G", descriptor = "I")
	private int anInt2580;

	@OriginalMember(owner = "client!g", name = "J", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!g", name = "K", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!g", name = "N", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!g", name = "P", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!g", name = "Y", descriptor = "I")
	private int anInt2592;

	@OriginalMember(owner = "client!g", name = "Z", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!g", name = "db", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!g", name = "jb", descriptor = "D")
	private double aDouble9;

	@OriginalMember(owner = "client!g", name = "D", descriptor = "Z")
	private boolean aBoolean239 = false;

	@OriginalMember(owner = "client!g", name = "F", descriptor = "I")
	private int anInt2579 = -1;

	@OriginalMember(owner = "client!g", name = "z", descriptor = "I")
	private int anInt2576 = 0;

	@OriginalMember(owner = "client!g", name = "gb", descriptor = "I")
	private int anInt2598 = -32768;

	@OriginalMember(owner = "client!g", name = "eb", descriptor = "I")
	private int anInt2596 = 0;

	@OriginalMember(owner = "client!g", name = "H", descriptor = "I")
	public final int anInt2581;

	@OriginalMember(owner = "client!g", name = "mb", descriptor = "I")
	private final int anInt2602;

	@OriginalMember(owner = "client!g", name = "M", descriptor = "Z")
	private final boolean aBoolean240;

	@OriginalMember(owner = "client!g", name = "U", descriptor = "I")
	private final int anInt2589;

	@OriginalMember(owner = "client!g", name = "S", descriptor = "I")
	public final int anInt2587;

	@OriginalMember(owner = "client!g", name = "X", descriptor = "I")
	private final int anInt2591;

	@OriginalMember(owner = "client!g", name = "ab", descriptor = "I")
	private final int anInt2593;

	@OriginalMember(owner = "client!g", name = "hb", descriptor = "I")
	public final int anInt2599;

	@OriginalMember(owner = "client!g", name = "R", descriptor = "I")
	public final int anInt2586;

	@OriginalMember(owner = "client!g", name = "W", descriptor = "Lclient!lp;")
	private final Class138 aClass138_3;

	@OriginalMember(owner = "client!g", name = "<init>", descriptor = "(IIIIIIIIIIIZ)V")
	public Class16_Sub1_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11) {
		super(arg1, arg2, Static13.method135(arg2, arg1, arg3) - arg4, arg3, arg2 >> 7, arg2 >> 7, arg3 >> 7, arg3 >> 7, false, (byte) 0);
		this.anInt2581 = arg6;
		this.anInt2602 = arg4;
		this.aBoolean239 = false;
		this.aBoolean240 = arg11;
		this.anInt2589 = arg7;
		this.anInt2587 = arg9;
		this.anInt2591 = arg0;
		this.anInt2593 = arg8;
		this.anInt2599 = arg5;
		this.anInt2586 = arg10;
		@Pc(78) int local78 = Static352.aClass194_2.method4421(this.anInt2591).anInt5002;
		if (local78 == -1) {
			this.aClass138_3 = null;
		} else {
			this.aClass138_3 = Static182.aClass55_1.method1397(local78);
		}
	}

	@OriginalMember(owner = "client!g", name = "c", descriptor = "(Lclient!ya;I)Lclient!fk;")
	@Override
	public Class3_Sub3 method5339(@OriginalArg(0) Class19 arg0) {
		@Pc(9) Class110 local9 = this.method2196(2048, arg0);
		if (local9 == null) {
			return null;
		}
		@Pc(16) Class31 local16 = arg0.method4289();
		local16.N(this.anInt2580);
		local16.ja(this.anInt2592);
		local16.o((int) this.aDouble2, (int) this.aDouble4, (int) this.aDouble7);
		if (this.aClass3_Sub2_3 == null) {
			local9.method4889(local16, null, 0);
		} else {
			@Pc(49) Class146 local49 = this.aClass3_Sub2_3.method171();
			arg0.method4262(local9, local49, local16, null);
		}
		this.anInt2598 = local9.MA();
		this.method2195(local9, arg0);
		return null;
	}

	@OriginalMember(owner = "client!g", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method5338() {
		return false;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(B)V")
	public void method2194() {
		if (this.aClass3_Sub2_3 != null) {
			this.aClass3_Sub2_3.method166();
		}
	}

	@OriginalMember(owner = "client!g", name = "b", descriptor = "(Lclient!ya;I)V")
	@Override
	public void method5335(@OriginalArg(0) Class19 arg0) {
		@Pc(9) Class110 local9 = this.method2196(0, arg0);
		if (local9 == null) {
			return;
		}
		@Pc(15) Class31 local15 = arg0.method4289();
		local15.N(this.anInt2580);
		local15.ja(this.anInt2592);
		local15.o((int) this.aDouble2, (int) this.aDouble4, (int) this.aDouble7);
		this.anInt2598 = local9.MA();
		this.method2195(local9, arg0);
	}

	@OriginalMember(owner = "client!g", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass3_Sub2_3 != null) {
			this.aClass3_Sub2_3.method166();
		}
	}

	@OriginalMember(owner = "client!g", name = "f", descriptor = "(I)V")
	@Override
	public void method5346() {
		super.aShort94 = super.aShort97 = (short) (this.aDouble2 / 128.0D);
		super.aShort96 = super.aShort95 = (short) (this.aDouble7 / 128.0D);
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(ILclient!t;Lclient!ya;)V")
	private void method2195(@OriginalArg(1) Class110 arg0, @OriginalArg(2) Class19 arg1) {
		@Pc(11) Class29[] local11 = arg0.method4881();
		@Pc(14) Class179[] local14 = arg0.method4885();
		if ((this.aClass3_Sub2_3 == null || this.aClass3_Sub2_3.aBoolean24) && (local11 != null || local14 != null)) {
			this.aClass3_Sub2_3 = new Class3_Sub2(Static24.anInt5323);
		}
		if (this.aClass3_Sub2_3 != null) {
			this.aClass3_Sub2_3.method169(arg1, (long) Static24.anInt5323, local11, local14);
			this.aClass3_Sub2_3.method174(super.aByte82, super.aShort94, super.aShort97, super.aShort96, super.aShort95);
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(ILclient!ya;I)Lclient!t;")
	private Class110 method2196(@OriginalArg(0) int arg0, @OriginalArg(1) Class19 arg1) {
		@Pc(15) Class161 local15 = Static352.aClass194_2.method4421(this.anInt2591);
		return local15.method3830(this.anInt2576, this.anInt2596, Static182.aClass55_1, this.anInt2579, arg0, arg1);
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IILclient!ya;I)Z")
	@Override
	public boolean method5341(@OriginalArg(0) int arg0, @OriginalArg(2) Class19 arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IILclient!fi;BZLclient!ya;I)V")
	@Override
	public void method5337(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class16 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class19 arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIII)V")
	public void method2197(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(13) double local13;
		if (!this.aBoolean239) {
			local13 = arg1 - super.anInt6893;
			@Pc(20) double local20 = (double) (arg3 - super.anInt6892);
			@Pc(29) double local29 = Math.sqrt(local13 * local13 + local20 * local20);
			this.aDouble7 = local20 * (double) this.anInt2593 / local29 + (double) super.anInt6892;
			this.aDouble2 = local13 * (double) this.anInt2593 / local29 + (double) super.anInt6893;
			if (this.aBoolean240) {
				this.aDouble4 = Static13.method135((int) this.aDouble2, super.aByte82, (int) this.aDouble7) - this.anInt2602;
			} else {
				this.aDouble4 = super.anInt6889;
			}
		}
		local13 = this.anInt2581 + 1 - arg0;
		this.aDouble5 = ((double) arg1 - this.aDouble2) / local13;
		this.aDouble8 = ((double) arg3 - this.aDouble7) / local13;
		this.aDouble6 = Math.sqrt(this.aDouble8 * this.aDouble8 + this.aDouble5 * this.aDouble5);
		if (this.anInt2589 == -1) {
			this.aDouble9 = ((double) arg2 - this.aDouble4) / local13;
		} else {
			if (!this.aBoolean239) {
				this.aDouble9 = -this.aDouble6 * Math.tan((double) this.anInt2589 * 0.02454369D);
			}
			this.aDouble3 = ((double) arg2 - this.aDouble4 - local13 * this.aDouble9) * 2.0D / (local13 * local13);
		}
	}

	@OriginalMember(owner = "client!g", name = "d", descriptor = "(I)V")
	@Override
	public void method5333() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(BI)V")
	public void method2198(@OriginalArg(1) int arg0) {
		this.aDouble7 += (double) arg0 * this.aDouble8;
		this.aBoolean239 = true;
		this.aDouble2 += this.aDouble5 * (double) arg0;
		if (this.aBoolean240) {
			this.aDouble4 = Static13.method135((int) this.aDouble2, super.aByte82, (int) this.aDouble7) - this.anInt2602;
		} else if (this.anInt2589 == -1) {
			this.aDouble4 += this.aDouble9 * (double) arg0;
		} else {
			this.aDouble4 += (double) arg0 * (double) arg0 * this.aDouble3 * 0.5D + this.aDouble9 * (double) arg0;
			this.aDouble9 += this.aDouble3 * (double) arg0;
		}
		this.anInt2592 = (int) (Math.atan2(this.aDouble5, this.aDouble8) * 2607.5945876176133D) + 8192 & 0x3FFF;
		this.anInt2580 = (int) (Math.atan2(this.aDouble9, this.aDouble6) * 2607.5945876176133D) & 0x3FFF;
		if (this.aClass138_3 == null) {
			return;
		}
		this.anInt2596 += arg0;
		while (true) {
			do {
				do {
					if (this.aClass138_3.anIntArray296[this.anInt2576] >= this.anInt2596) {
						return;
					}
					this.anInt2596 -= this.aClass138_3.anIntArray296[this.anInt2576];
					this.anInt2576++;
					if (this.anInt2576 >= this.aClass138_3.anIntArray295.length) {
						this.anInt2576 -= this.aClass138_3.anInt4405;
						if (this.anInt2576 < 0 || this.aClass138_3.anIntArray295.length <= this.anInt2576) {
							this.anInt2576 = 0;
						}
					}
					this.anInt2579 = this.anInt2576 + 1;
				} while (this.anInt2579 < this.aClass138_3.anIntArray295.length);
				this.anInt2579 -= this.aClass138_3.anInt4405;
			} while (this.anInt2579 >= 0 && this.anInt2579 < this.aClass138_3.anIntArray295.length);
			this.anInt2579 = -1;
		}
	}

	@OriginalMember(owner = "client!g", name = "e", descriptor = "(I)I")
	@Override
	public int method5342() {
		return this.anInt2598;
	}
}
