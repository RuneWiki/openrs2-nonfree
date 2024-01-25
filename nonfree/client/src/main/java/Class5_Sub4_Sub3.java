import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ia")
public final class Class5_Sub4_Sub3 extends Class5_Sub4 {

	@OriginalMember(owner = "client!ia", name = "B", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!ia", name = "O", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!ia", name = "P", descriptor = "I")
	private int anInt2691;

	@OriginalMember(owner = "client!ia", name = "R", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!ia", name = "S", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!ia", name = "U", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!ia", name = "V", descriptor = "Lclient!nd;")
	private Class8_Sub5 aClass8_Sub5_3;

	@OriginalMember(owner = "client!ia", name = "db", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!ia", name = "gb", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!ia", name = "ib", descriptor = "D")
	private double aDouble9;

	@OriginalMember(owner = "client!ia", name = "qb", descriptor = "I")
	private int anInt2709;

	@OriginalMember(owner = "client!ia", name = "H", descriptor = "Z")
	private boolean aBoolean152 = false;

	@OriginalMember(owner = "client!ia", name = "G", descriptor = "I")
	private int anInt2685 = 0;

	@OriginalMember(owner = "client!ia", name = "ab", descriptor = "I")
	private int anInt2697 = -32768;

	@OriginalMember(owner = "client!ia", name = "cb", descriptor = "I")
	private int anInt2699 = -1;

	@OriginalMember(owner = "client!ia", name = "T", descriptor = "I")
	private int anInt2693 = 0;

	@OriginalMember(owner = "client!ia", name = "ob", descriptor = "I")
	public final int anInt2707;

	@OriginalMember(owner = "client!ia", name = "M", descriptor = "I")
	private final int anInt2690;

	@OriginalMember(owner = "client!ia", name = "I", descriptor = "I")
	public final int anInt2686;

	@OriginalMember(owner = "client!ia", name = "eb", descriptor = "I")
	public final int anInt2700;

	@OriginalMember(owner = "client!ia", name = "mb", descriptor = "I")
	private final int anInt2705;

	@OriginalMember(owner = "client!ia", name = "J", descriptor = "I")
	public final int anInt2687;

	@OriginalMember(owner = "client!ia", name = "Z", descriptor = "I")
	private final int anInt2696;

	@OriginalMember(owner = "client!ia", name = "Y", descriptor = "Lclient!md;")
	private final Class131 aClass131_2;

	@OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class5_Sub4_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg1, arg2, arg4, arg3, arg2 >> 7, arg2 >> 7, arg3 >> 7, arg3 >> 7, false, (byte) 0);
		this.aBoolean152 = false;
		this.anInt2707 = arg9;
		this.anInt2690 = arg7;
		this.anInt2686 = arg10;
		this.anInt2700 = arg6;
		this.anInt2705 = arg8;
		this.anInt2687 = arg5;
		this.anInt2696 = arg0;
		@Pc(64) int local64 = Static155.method1566(this.anInt2696).anInt22;
		if (local64 == -1) {
			this.aClass131_2 = null;
		} else {
			this.aClass131_2 = Static343.method5604(local64);
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(BLclient!tj;)V")
	@Override
	public void method5331(@OriginalArg(1) Class122 arg0) {
		@Pc(9) Class124 local9 = this.method2191(0, arg0);
		if (local9 == null) {
			return;
		}
		@Pc(15) Class56 local15 = arg0.method4739();
		local15.method4686(this.anInt2709);
		local15.method4690(this.anInt2691);
		local15.method4691((int) this.aDouble3, (int) this.aDouble4, (int) this.aDouble7);
		this.anInt2697 = local9.method4106();
		this.method2187(arg0, local9);
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lclient!tj;I)Lclient!ri;")
	@Override
	public Class8_Sub7 method5329(@OriginalArg(0) Class122 arg0) {
		@Pc(18) Class124 local18 = this.method2191(1024, arg0);
		if (local18 == null) {
			return null;
		}
		@Pc(25) Class56 local25 = arg0.method4739();
		local25.method4686(this.anInt2709);
		local25.method4690(this.anInt2691);
		local25.method4691((int) this.aDouble3, (int) this.aDouble4, (int) this.aDouble7);
		if (this.aClass8_Sub5_3 == null) {
			local18.method4079(local25, null, 0);
		} else {
			@Pc(58) Class9 local58 = this.aClass8_Sub5_3.method3570();
			arg0.method4756(local18, local58, local25, null);
		}
		this.anInt2697 = local18.method4106();
		this.method2187(arg0, local18);
		return null;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lclient!tj;BLclient!qb;)V")
	private void method2187(@OriginalArg(0) Class122 arg0, @OriginalArg(2) Class124 arg1) {
		@Pc(6) Class112[] local6 = arg1.method4074();
		@Pc(9) Class191[] local9 = arg1.method4112();
		if ((this.aClass8_Sub5_3 == null || this.aClass8_Sub5_3.aBoolean239) && (local6 != null || local9 != null)) {
			this.aClass8_Sub5_3 = new Class8_Sub5(Static51.anInt1101);
		}
		if (this.aClass8_Sub5_3 != null) {
			this.aClass8_Sub5_3.method3574(arg0, (long) Static51.anInt1101, local6, local9);
			this.aClass8_Sub5_3.method3571(super.aByte69, super.aShort86, super.aShort89, super.aShort87, super.aShort88);
		}
	}

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5327() {
		return false;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(ZI)V")
	public void method2188(@OriginalArg(1) int arg0) {
		this.aDouble7 += this.aDouble5 * (double) arg0;
		this.aDouble3 += (double) arg0 * this.aDouble8;
		this.aBoolean152 = true;
		if (this.anInt2690 == -1) {
			this.aDouble4 += (double) arg0 * this.aDouble2;
		} else {
			this.aDouble4 += (double) arg0 * this.aDouble6 * 0.5D * (double) arg0 + this.aDouble2 * (double) arg0;
			this.aDouble2 += this.aDouble6 * (double) arg0;
		}
		this.anInt2691 = (int) (Math.atan2(this.aDouble8, this.aDouble5) * 2607.5945876176133D) + 8192 & 0x3FFF;
		this.anInt2709 = (int) (Math.atan2(this.aDouble2, this.aDouble9) * 2607.5945876176133D) & 0x3FFF;
		if (this.aClass131_2 == null) {
			return;
		}
		this.anInt2685 += arg0;
		while (true) {
			do {
				do {
					if (this.anInt2685 <= this.aClass131_2.anIntArray337[this.anInt2693]) {
						return;
					}
					this.anInt2685 -= this.aClass131_2.anIntArray337[this.anInt2693];
					this.anInt2693++;
					if (this.aClass131_2.anIntArray335.length <= this.anInt2693) {
						this.anInt2693 -= this.aClass131_2.anInt3989;
						if (this.anInt2693 < 0 || this.aClass131_2.anIntArray335.length <= this.anInt2693) {
							this.anInt2693 = 0;
						}
					}
					this.anInt2699 = this.anInt2693 + 1;
				} while (this.aClass131_2.anIntArray335.length > this.anInt2699);
				this.anInt2699 -= this.aClass131_2.anInt3989;
			} while (this.anInt2699 >= 0 && this.aClass131_2.anIntArray335.length > this.anInt2699);
			this.anInt2699 = -1;
		}
	}

	@OriginalMember(owner = "client!ia", name = "g", descriptor = "(I)I")
	@Override
	public int method5039() {
		return this.anInt2697;
	}

	@OriginalMember(owner = "client!ia", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass8_Sub5_3 != null) {
			this.aClass8_Sub5_3.method3569();
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(ILclient!tj;II)Z")
	@Override
	public boolean method5330(@OriginalArg(0) int arg0, @OriginalArg(1) Class122 arg1, @OriginalArg(2) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(ILclient!tj;B)Lclient!qb;")
	private Class124 method2191(@OriginalArg(0) int arg0, @OriginalArg(1) Class122 arg1) {
		@Pc(12) Class2 local12 = Static155.method1566(this.anInt2696);
		return local12.method9(this.anInt2699, arg0, arg1, this.anInt2685, this.anInt2693);
	}

	@OriginalMember(owner = "client!ia", name = "d", descriptor = "(B)V")
	@Override
	public void method5040() {
		super.aShort86 = super.aShort89 = (short) (this.aDouble3 / 128.0D);
		super.aShort87 = super.aShort88 = (short) (this.aDouble7 / 128.0D);
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(ILclient!tj;BIZLclient!km;I)V")
	@Override
	public void method5333(@OriginalArg(0) int arg0, @OriginalArg(1) Class122 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class5 arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ia", name = "e", descriptor = "(B)V")
	public void method2192() {
		if (this.aClass8_Sub5_3 != null) {
			this.aClass8_Sub5_3.method3569();
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIBI)V")
	public void method2193(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(13) double local13;
		if (!this.aBoolean152) {
			local13 = arg2 - super.anInt5901;
			@Pc(20) double local20 = (double) (arg1 - super.anInt5905);
			@Pc(29) double local29 = Math.sqrt(local13 * local13 + local20 * local20);
			this.aDouble4 = super.anInt5907;
			this.aDouble3 = (double) super.anInt5901 + local13 * (double) this.anInt2705 / local29;
			this.aDouble7 = (double) this.anInt2705 * local20 / local29 + (double) super.anInt5905;
		}
		local13 = this.anInt2700 + 1 - arg0;
		this.aDouble5 = ((double) arg1 - this.aDouble7) / local13;
		this.aDouble8 = ((double) arg2 - this.aDouble3) / local13;
		this.aDouble9 = Math.sqrt(this.aDouble5 * this.aDouble5 + this.aDouble8 * this.aDouble8);
		if (this.anInt2690 == -1) {
			this.aDouble2 = ((double) arg3 - this.aDouble4) / local13;
		} else {
			if (!this.aBoolean152) {
				this.aDouble2 = -this.aDouble9 * Math.tan((double) this.anInt2690 * 0.02454369D);
			}
			this.aDouble6 = ((double) arg3 - this.aDouble2 * local13 - this.aDouble4) * 2.0D / (local13 * local13);
		}
	}

	@OriginalMember(owner = "client!ia", name = "e", descriptor = "(I)V")
	@Override
	public void method5328() {
		throw new IllegalStateException();
	}
}
