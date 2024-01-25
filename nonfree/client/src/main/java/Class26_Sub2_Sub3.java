import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jp")
public final class Class26_Sub2_Sub3 extends Class26_Sub2 {

	@OriginalMember(owner = "client!jp", name = "L", descriptor = "D")
	private double aDouble1;

	@OriginalMember(owner = "client!jp", name = "N", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!jp", name = "O", descriptor = "I")
	private int anInt3508;

	@OriginalMember(owner = "client!jp", name = "S", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!jp", name = "X", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!jp", name = "eb", descriptor = "I")
	private int anInt3518;

	@OriginalMember(owner = "client!jp", name = "gb", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!jp", name = "jb", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!jp", name = "kb", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!jp", name = "mb", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!jp", name = "rb", descriptor = "Lclient!li;")
	private Class28_Sub3 aClass28_Sub3_3;

	@OriginalMember(owner = "client!jp", name = "D", descriptor = "I")
	private int anInt3500 = -32768;

	@OriginalMember(owner = "client!jp", name = "R", descriptor = "I")
	private int anInt3511 = -1;

	@OriginalMember(owner = "client!jp", name = "U", descriptor = "Z")
	private boolean aBoolean212 = false;

	@OriginalMember(owner = "client!jp", name = "cb", descriptor = "I")
	private int anInt3516 = 0;

	@OriginalMember(owner = "client!jp", name = "P", descriptor = "I")
	private int anInt3509 = 0;

	@OriginalMember(owner = "client!jp", name = "W", descriptor = "Z")
	private final boolean aBoolean213;

	@OriginalMember(owner = "client!jp", name = "G", descriptor = "I")
	public final int anInt3503;

	@OriginalMember(owner = "client!jp", name = "I", descriptor = "I")
	public final int anInt3505;

	@OriginalMember(owner = "client!jp", name = "bb", descriptor = "I")
	private final int anInt3515;

	@OriginalMember(owner = "client!jp", name = "M", descriptor = "I")
	public final int anInt3507;

	@OriginalMember(owner = "client!jp", name = "qb", descriptor = "I")
	private final int anInt3525;

	@OriginalMember(owner = "client!jp", name = "db", descriptor = "I")
	private final int anInt3517;

	@OriginalMember(owner = "client!jp", name = "pb", descriptor = "I")
	private final int anInt3524;

	@OriginalMember(owner = "client!jp", name = "lb", descriptor = "I")
	public final int lb;

	@OriginalMember(owner = "client!jp", name = "A", descriptor = "Lclient!lc;")
	private final Class139 aClass139_3;

	@OriginalMember(owner = "client!jp", name = "<init>", descriptor = "(IIIIIIIIIIIZ)V")
	public Class26_Sub2_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11) {
		super(arg1, arg2, Static333.method2748(arg1, arg3, arg2) - arg4, arg3, arg2 >> 7, arg2 >> 7, arg3 >> 7, arg3 >> 7, false, (byte) 0);
		this.aBoolean213 = arg11;
		this.anInt3503 = arg10;
		this.aBoolean212 = false;
		this.anInt3505 = arg9;
		this.anInt3515 = arg8;
		this.anInt3507 = arg5;
		this.anInt3525 = arg7;
		this.anInt3517 = arg0;
		this.anInt3524 = arg4;
		this.lb = arg6;
		@Pc(78) int local78 = Static79.aClass231_1.method4830(this.anInt3517).anInt2900;
		if (local78 == -1) {
			this.aClass139_3 = null;
		} else {
			this.aClass139_3 = Static364.aClass151_2.method3293(local78);
		}
	}

	@OriginalMember(owner = "client!jp", name = "f", descriptor = "(I)V")
	@Override
	public void method5694() {
		super.aShort105 = super.aShort104 = (short) (this.aDouble3 / 128.0D);
		super.aShort103 = super.aShort102 = (short) (this.aDouble4 / 128.0D);
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(Lclient!t;Lclient!ya;I)V")
	private void method2847(@OriginalArg(0) Class163 arg0, @OriginalArg(1) Class51 arg1) {
		@Pc(6) Class167[] local6 = arg0.method4661();
		@Pc(9) Class52[] local9 = arg0.method4663();
		if ((this.aClass28_Sub3_3 == null || this.aClass28_Sub3_3.aBoolean248) && (local6 != null || local9 != null)) {
			this.aClass28_Sub3_3 = new Class28_Sub3(Static274.anInt4617);
		}
		if (this.aClass28_Sub3_3 != null) {
			this.aClass28_Sub3_3.method3166(arg1, (long) Static274.anInt4617, local6, local9);
			this.aClass28_Sub3_3.method3172(super.aByte102, super.aShort105, super.aShort104, super.aShort103, super.aShort102);
		}
	}

	@OriginalMember(owner = "client!jp", name = "g", descriptor = "(I)I")
	@Override
	public int method5695() {
		return this.anInt3500;
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(Lclient!ya;IIILclient!qj;IZ)V")
	@Override
	public void method5712(@OriginalArg(0) Class51 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class26 arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!jp", name = "c", descriptor = "(I)V")
	@Override
	public void method5715() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!jp", name = "b", descriptor = "(Lclient!ya;I)Lclient!mo;")
	@Override
	public Class28_Sub4 method5714(@OriginalArg(0) Class51 arg0) {
		@Pc(9) Class163 local9 = this.method2853(2048, arg0);
		if (local9 == null) {
			return null;
		}
		@Pc(21) Class33 local21 = arg0.method5285();
		local21.N(this.anInt3508);
		local21.ja(this.anInt3518);
		local21.o((int) this.aDouble3, (int) this.aDouble7, (int) this.aDouble4);
		if (this.aClass28_Sub3_3 == null) {
			local9.method4667(local21, null, 0);
		} else {
			@Pc(47) Class201 local47 = this.aClass28_Sub3_3.method3164();
			arg0.method5291(local9, local47, local21, null);
		}
		this.anInt3500 = local9.MA();
		this.method2847(local9, arg0);
		return null;
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(IIBII)V")
	public void method2848(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(15) double local15;
		if (!this.aBoolean212) {
			local15 = arg1 - super.anInt7388;
			@Pc(22) double local22 = (double) (arg3 - super.anInt7383);
			@Pc(31) double local31 = Math.sqrt(local15 * local15 + local22 * local22);
			this.aDouble4 = (double) super.anInt7383 + local22 * (double) this.anInt3515 / local31;
			this.aDouble3 = (double) super.anInt7388 + local15 * (double) this.anInt3515 / local31;
			if (this.aBoolean213) {
				this.aDouble7 = Static333.method2748(super.aByte102, (int) this.aDouble4, (int) this.aDouble3) - this.anInt3524;
			} else {
				this.aDouble7 = super.anInt7390;
			}
		}
		local15 = this.lb + 1 - arg2;
		this.aDouble2 = ((double) arg1 - this.aDouble3) / local15;
		this.aDouble1 = ((double) arg3 - this.aDouble4) / local15;
		this.aDouble6 = Math.sqrt(this.aDouble2 * this.aDouble2 + this.aDouble1 * this.aDouble1);
		if (this.anInt3525 == -1) {
			this.aDouble8 = ((double) arg0 - this.aDouble7) / local15;
		} else {
			if (!this.aBoolean212) {
				this.aDouble8 = -this.aDouble6 * Math.tan((double) this.anInt3525 * 0.02454369D);
			}
			this.aDouble5 = ((double) arg0 - this.aDouble8 * local15 - this.aDouble7) * 2.0D / (local15 * local15);
		}
	}

	@OriginalMember(owner = "client!jp", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass28_Sub3_3 != null) {
			this.aClass28_Sub3_3.method3171();
		}
	}

	@OriginalMember(owner = "client!jp", name = "b", descriptor = "(II)V")
	public void method2850(@OriginalArg(1) int arg0) {
		this.aBoolean212 = true;
		this.aDouble3 += this.aDouble2 * (double) arg0;
		this.aDouble4 += this.aDouble1 * (double) arg0;
		if (this.aBoolean213) {
			this.aDouble7 = Static333.method2748(super.aByte102, (int) this.aDouble4, (int) this.aDouble3) - this.anInt3524;
		} else if (this.anInt3525 == -1) {
			this.aDouble7 += (double) arg0 * this.aDouble8;
		} else {
			this.aDouble7 += (double) arg0 * this.aDouble5 * 0.5D * (double) arg0 + this.aDouble8 * (double) arg0;
			this.aDouble8 += this.aDouble5 * (double) arg0;
		}
		this.anInt3518 = (int) (Math.atan2(this.aDouble2, this.aDouble1) * 2607.5945876176133D) + 8192 & 0x3FFF;
		this.anInt3508 = (int) (Math.atan2(this.aDouble8, this.aDouble6) * 2607.5945876176133D) & 0x3FFF;
		if (this.aClass139_3 == null) {
			return;
		}
		this.anInt3509 += arg0;
		while (true) {
			do {
				do {
					if (this.aClass139_3.anIntArray345[this.anInt3516] >= this.anInt3509) {
						return;
					}
					this.anInt3509 -= this.aClass139_3.anIntArray345[this.anInt3516];
					this.anInt3516++;
					if (this.aClass139_3.anIntArray344.length <= this.anInt3516) {
						this.anInt3516 -= this.aClass139_3.anInt3945;
						if (this.anInt3516 < 0 || this.anInt3516 >= this.aClass139_3.anIntArray344.length) {
							this.anInt3516 = 0;
						}
					}
					this.anInt3511 = this.anInt3516 + 1;
				} while (this.anInt3511 < this.aClass139_3.anIntArray344.length);
				this.anInt3511 -= this.aClass139_3.anInt3945;
			} while (this.anInt3511 >= 0 && this.aClass139_3.anIntArray344.length > this.anInt3511);
			this.anInt3511 = -1;
		}
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(I)V")
	public void method2851() {
		if (this.aClass28_Sub3_3 != null) {
			this.aClass28_Sub3_3.method3171();
		}
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(Lclient!ya;I)V")
	@Override
	public void method5713(@OriginalArg(0) Class51 arg0) {
		@Pc(9) Class163 local9 = this.method2853(0, arg0);
		if (local9 == null) {
			return;
		}
		@Pc(15) Class33 local15 = arg0.method5285();
		local15.N(this.anInt3508);
		local15.ja(this.anInt3518);
		local15.o((int) this.aDouble3, (int) this.aDouble7, (int) this.aDouble4);
		this.anInt3500 = local9.MA();
		this.method2847(local9, arg0);
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(ILclient!ya;II)Z")
	@Override
	public boolean method5711(@OriginalArg(0) int arg0, @OriginalArg(1) Class51 arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(IILclient!ya;)Lclient!t;")
	private Class163 method2853(@OriginalArg(0) int arg0, @OriginalArg(2) Class51 arg1) {
		@Pc(15) Class105 local15 = Static79.aClass231_1.method4830(this.anInt3517);
		return local15.method2333(this.anInt3509, arg0, this.anInt3511, this.anInt3516, arg1, Static364.aClass151_2);
	}

	@OriginalMember(owner = "client!jp", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method5721() {
		return false;
	}
}
