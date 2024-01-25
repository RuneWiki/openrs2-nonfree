import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!se")
public final class Class1_Sub2_Sub5 extends Class1_Sub2 {

	@OriginalMember(owner = "client!se", name = "E", descriptor = "D")
	private double aDouble1;

	@OriginalMember(owner = "client!se", name = "I", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!se", name = "J", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!se", name = "L", descriptor = "Lclient!bt;")
	private Class7_Sub3 aClass7_Sub3_5;

	@OriginalMember(owner = "client!se", name = "R", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!se", name = "W", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!se", name = "Z", descriptor = "I")
	private int anInt5803;

	@OriginalMember(owner = "client!se", name = "db", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!se", name = "fb", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!se", name = "pb", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!se", name = "tb", descriptor = "I")
	private int anInt5817;

	@OriginalMember(owner = "client!se", name = "G", descriptor = "I")
	private int anInt5791 = 0;

	@OriginalMember(owner = "client!se", name = "X", descriptor = "I")
	private int anInt5801 = -32768;

	@OriginalMember(owner = "client!se", name = "Q", descriptor = "I")
	private int anInt5798 = 0;

	@OriginalMember(owner = "client!se", name = "S", descriptor = "Z")
	private boolean aBoolean425 = false;

	@OriginalMember(owner = "client!se", name = "ub", descriptor = "I")
	private int anInt5818 = -1;

	@OriginalMember(owner = "client!se", name = "mb", descriptor = "I")
	private final int anInt5812;

	@OriginalMember(owner = "client!se", name = "H", descriptor = "I")
	public final int anInt5792;

	@OriginalMember(owner = "client!se", name = "ob", descriptor = "I")
	public final int anInt5814;

	@OriginalMember(owner = "client!se", name = "cb", descriptor = "I")
	private final int anInt5806;

	@OriginalMember(owner = "client!se", name = "F", descriptor = "I")
	public final int anInt5790;

	@OriginalMember(owner = "client!se", name = "qb", descriptor = "I")
	private final int anInt5815;

	@OriginalMember(owner = "client!se", name = "hb", descriptor = "I")
	public final int anInt5809;

	@OriginalMember(owner = "client!se", name = "kb", descriptor = "Lclient!hu;")
	private final Class102 aClass102_2;

	@OriginalMember(owner = "client!se", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class1_Sub2_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg1, arg2, arg4, arg3, arg2 >> 7, arg2 >> 7, arg3 >> 7, arg3 >> 7, false, (byte) 0);
		this.anInt5812 = arg8;
		this.aBoolean425 = false;
		this.anInt5792 = arg5;
		this.anInt5814 = arg10;
		this.anInt5806 = arg0;
		this.anInt5790 = arg9;
		this.anInt5815 = arg7;
		this.anInt5809 = arg6;
		@Pc(65) int local65 = Static153.aClass116_1.method2791(this.anInt5806).anInt5101;
		if (local65 == -1) {
			this.aClass102_2 = null;
		} else {
			this.aClass102_2 = Static333.aClass50_2.method1175(local65);
		}
	}

	@OriginalMember(owner = "client!se", name = "d", descriptor = "(ILclient!oj;)V")
	@Override
	public void method6023(@OriginalArg(1) Class48 arg0) {
		@Pc(9) Class159 local9 = this.method5126(arg0, 0);
		if (local9 == null) {
			return;
		}
		@Pc(15) Class21 local15 = arg0.method2445();
		local15.method3707(this.anInt5817);
		local15.method3706(this.anInt5803);
		local15.method3701((int) this.aDouble8, (int) this.aDouble6, (int) this.aDouble1);
		this.anInt5801 = local9.method4941();
		this.method5130(local9, arg0);
	}

	@OriginalMember(owner = "client!se", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass7_Sub3_5 != null) {
			this.aClass7_Sub3_5.method528();
		}
	}

	@OriginalMember(owner = "client!se", name = "e", descriptor = "(I)V")
	@Override
	public void method6020() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IIIII)V")
	public void method5124(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) double local9;
		if (!this.aBoolean425) {
			local9 = arg3 - super.anInt6800;
			@Pc(16) double local16 = (double) (arg1 - super.anInt6798);
			@Pc(25) double local25 = Math.sqrt(local16 * local16 + local9 * local9);
			this.aDouble6 = super.anInt6797;
			this.aDouble8 = local9 * (double) this.anInt5812 / local25 + (double) super.anInt6800;
			this.aDouble1 = (double) this.anInt5812 * local16 / local25 + (double) super.anInt6798;
		}
		local9 = this.anInt5809 + 1 - arg0;
		this.aDouble4 = ((double) arg3 - this.aDouble8) / local9;
		this.aDouble3 = ((double) arg1 - this.aDouble1) / local9;
		this.aDouble5 = Math.sqrt(this.aDouble4 * this.aDouble4 + this.aDouble3 * this.aDouble3);
		if (this.anInt5815 == -1) {
			this.aDouble7 = ((double) arg2 - this.aDouble6) / local9;
		} else {
			if (!this.aBoolean425) {
				this.aDouble7 = -this.aDouble5 * Math.tan((double) this.anInt5815 * 0.02454369D);
			}
			this.aDouble2 = ((double) arg2 - this.aDouble6 - this.aDouble7 * local9) * 2.0D / (local9 * local9);
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Lclient!oj;II)Lclient!qh;")
	private Class159 method5126(@OriginalArg(0) Class48 arg0, @OriginalArg(1) int arg1) {
		@Pc(14) Class182 local14 = Static153.aClass116_1.method2791(this.anInt5806);
		return local14.method4568(this.anInt5798, this.anInt5791, Static333.aClass50_2, this.anInt5818, arg1, arg0);
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IIZLclient!a;IBLclient!oj;)V")
	@Override
	public void method6019(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class1 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class48 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(II)V")
	public void method5128(@OriginalArg(1) int arg0) {
		this.aDouble8 += this.aDouble4 * (double) arg0;
		this.aDouble1 += (double) arg0 * this.aDouble3;
		if (this.anInt5815 == -1) {
			this.aDouble6 += this.aDouble7 * (double) arg0;
		} else {
			this.aDouble6 += (double) arg0 * this.aDouble2 * 0.5D * (double) arg0 + (double) arg0 * this.aDouble7;
			this.aDouble7 += (double) arg0 * this.aDouble2;
		}
		this.aBoolean425 = true;
		this.anInt5803 = (int) (Math.atan2(this.aDouble4, this.aDouble3) * 2607.5945876176133D) + 8192 & 0x3FFF;
		this.anInt5817 = (int) (Math.atan2(this.aDouble7, this.aDouble5) * 2607.5945876176133D) & 0x3FFF;
		if (this.aClass102_2 == null) {
			return;
		}
		this.anInt5798 += arg0;
		while (true) {
			do {
				do {
					if (this.aClass102_2.anIntArray229[this.anInt5791] >= this.anInt5798) {
						return;
					}
					this.anInt5798 -= this.aClass102_2.anIntArray229[this.anInt5791];
					this.anInt5791++;
					if (this.anInt5791 >= this.aClass102_2.anIntArray231.length) {
						this.anInt5791 -= this.aClass102_2.anInt2996;
						if (this.anInt5791 < 0 || this.anInt5791 >= this.aClass102_2.anIntArray231.length) {
							this.anInt5791 = 0;
						}
					}
					this.anInt5818 = this.anInt5791 + 1;
				} while (this.anInt5818 < this.aClass102_2.anIntArray231.length);
				this.anInt5818 -= this.aClass102_2.anInt2996;
			} while (this.anInt5818 >= 0 && this.anInt5818 < this.aClass102_2.anIntArray231.length);
			this.anInt5818 = -1;
		}
	}

	@OriginalMember(owner = "client!se", name = "g", descriptor = "(I)I")
	@Override
	public int method5894() {
		return this.anInt5801;
	}

	@OriginalMember(owner = "client!se", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method6015() {
		return false;
	}

	@OriginalMember(owner = "client!se", name = "c", descriptor = "(B)V")
	public void method5129() {
		if (this.aClass7_Sub3_5 != null) {
			this.aClass7_Sub3_5.method528();
		}
	}

	@OriginalMember(owner = "client!se", name = "c", descriptor = "(ILclient!oj;)Lclient!mg;")
	@Override
	public Class7_Sub5 method6013(@OriginalArg(1) Class48 arg0) {
		@Pc(9) Class159 local9 = this.method5126(arg0, 1024);
		if (local9 == null) {
			return null;
		}
		@Pc(16) Class21 local16 = arg0.method2445();
		local16.method3707(this.anInt5817);
		local16.method3706(this.anInt5803);
		local16.method3701((int) this.aDouble8, (int) this.aDouble6, (int) this.aDouble1);
		if (this.aClass7_Sub3_5 == null) {
			local9.method4952(local16, null, 0);
		} else {
			@Pc(55) Class34 local55 = this.aClass7_Sub3_5.method519();
			arg0.method2520(local9, local55, local16, null);
		}
		this.anInt5801 = local9.method4941();
		this.method5130(local9, arg0);
		return null;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(BLclient!qh;Lclient!oj;)V")
	private void method5130(@OriginalArg(1) Class159 arg0, @OriginalArg(2) Class48 arg1) {
		@Pc(6) Class218[] local6 = arg0.method4962();
		@Pc(9) Class88[] local9 = arg0.method4960();
		if ((this.aClass7_Sub3_5 == null || this.aClass7_Sub3_5.aBoolean46) && (local6 != null || local9 != null)) {
			this.aClass7_Sub3_5 = new Class7_Sub3(Static339.anInt6265);
		}
		if (this.aClass7_Sub3_5 != null) {
			this.aClass7_Sub3_5.method518(arg1, (long) Static339.anInt6265, local6, local9);
			this.aClass7_Sub3_5.method521(super.aByte73, super.aShort95, super.aShort97, super.aShort96, super.aShort94);
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(ILclient!oj;II)Z")
	@Override
	public boolean method6016(@OriginalArg(0) int arg0, @OriginalArg(1) Class48 arg1, @OriginalArg(2) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!se", name = "h", descriptor = "(I)V")
	@Override
	public void method5898() {
		super.aShort96 = super.aShort94 = (short) (this.aDouble1 / 128.0D);
		super.aShort95 = super.aShort97 = (short) (this.aDouble8 / 128.0D);
	}
}
