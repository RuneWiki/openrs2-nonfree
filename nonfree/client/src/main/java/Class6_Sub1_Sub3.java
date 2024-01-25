import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fl")
public final class Class6_Sub1_Sub3 extends Class6_Sub1 {

	@OriginalMember(owner = "client!fl", name = "lb", descriptor = "Lclient!cw;")
	public static Class55 lb;

	@OriginalMember(owner = "client!fl", name = "A", descriptor = "D")
	private double aDouble1;

	@OriginalMember(owner = "client!fl", name = "B", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!fl", name = "E", descriptor = "Lclient!kw;")
	private Class4_Sub4 aClass4_Sub4_4;

	@OriginalMember(owner = "client!fl", name = "G", descriptor = "I")
	private int anInt2856;

	@OriginalMember(owner = "client!fl", name = "P", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!fl", name = "Q", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!fl", name = "T", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!fl", name = "X", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!fl", name = "fb", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!fl", name = "jb", descriptor = "I")
	private int anInt2879;

	@OriginalMember(owner = "client!fl", name = "mb", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!fl", name = "S", descriptor = "I")
	private int anInt2865 = 0;

	@OriginalMember(owner = "client!fl", name = "W", descriptor = "I")
	private int anInt2868 = -32768;

	@OriginalMember(owner = "client!fl", name = "R", descriptor = "Z")
	private boolean aBoolean212 = false;

	@OriginalMember(owner = "client!fl", name = "K", descriptor = "I")
	private int anInt2860 = 0;

	@OriginalMember(owner = "client!fl", name = "ib", descriptor = "I")
	private int anInt2878 = -1;

	@OriginalMember(owner = "client!fl", name = "db", descriptor = "I")
	public final int anInt2874;

	@OriginalMember(owner = "client!fl", name = "bb", descriptor = "I")
	private final int anInt2872;

	@OriginalMember(owner = "client!fl", name = "ab", descriptor = "I")
	public final int anInt2871;

	@OriginalMember(owner = "client!fl", name = "z", descriptor = "I")
	public final int anInt2853;

	@OriginalMember(owner = "client!fl", name = "H", descriptor = "I")
	private final int anInt2857;

	@OriginalMember(owner = "client!fl", name = "ob", descriptor = "I")
	private final int anInt2881;

	@OriginalMember(owner = "client!fl", name = "M", descriptor = "I")
	private final int anInt2862;

	@OriginalMember(owner = "client!fl", name = "D", descriptor = "I")
	public final int anInt2855;

	@OriginalMember(owner = "client!fl", name = "kb", descriptor = "Z")
	private final boolean aBoolean213;

	@OriginalMember(owner = "client!fl", name = "F", descriptor = "Lclient!hi;")
	private final Class122 aClass122_2;

	@OriginalMember(owner = "client!fl", name = "<init>", descriptor = "(IIIIIIIIIIIZ)V")
	public Class6_Sub1_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11) {
		super(arg1, arg2, Static58.method1166(arg3, arg2, arg1) - arg4, arg3, arg2 >> 9, arg2 >> 9, arg3 >> 9, arg3 >> 9, false, (byte) 0);
		this.anInt2874 = arg10;
		this.anInt2872 = arg7;
		this.anInt2871 = arg9;
		this.anInt2853 = arg5;
		this.anInt2857 = arg0;
		this.anInt2881 = arg4;
		this.anInt2862 = arg8;
		this.anInt2855 = arg6;
		this.aBoolean213 = arg11;
		this.aBoolean212 = false;
		@Pc(78) int local78 = Static17.aClass231_2.method5905(this.anInt2857).anInt5838;
		if (local78 == -1) {
			this.aClass122_2 = null;
		} else {
			this.aClass122_2 = Static46.aClass247_1.method6029(local78);
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIIII)V")
	public void method2451(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) double local9;
		if (!this.aBoolean212) {
			local9 = arg0 - super.anInt8811;
			@Pc(16) double local16 = (double) (arg3 - super.anInt8813);
			@Pc(25) double local25 = Math.sqrt(local16 * local16 + local9 * local9);
			this.aDouble8 = (double) super.anInt8811 + local9 * (double) this.anInt2862 / local25;
			this.aDouble2 = local16 * (double) this.anInt2862 / local25 + (double) super.anInt8813;
			if (this.aBoolean213) {
				this.aDouble5 = Static58.method1166((int) this.aDouble2, (int) this.aDouble8, super.aByte100) - this.anInt2881;
			} else {
				this.aDouble5 = super.anInt8814;
			}
		}
		local9 = this.anInt2855 + 1 - arg2;
		this.aDouble7 = ((double) arg0 - this.aDouble8) / local9;
		this.aDouble3 = ((double) arg3 - this.aDouble2) / local9;
		this.aDouble6 = Math.sqrt(this.aDouble3 * this.aDouble3 + this.aDouble7 * this.aDouble7);
		if (this.anInt2872 == -1) {
			this.aDouble1 = ((double) arg1 - this.aDouble5) / local9;
		} else {
			if (!this.aBoolean212) {
				this.aDouble1 = -this.aDouble6 * Math.tan((double) this.anInt2872 * 0.02454369D);
			}
			this.aDouble4 = ((double) arg1 - this.aDouble5 - local9 * this.aDouble1) * 2.0D / (local9 * local9);
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(IILclient!oa;I)Z")
	@Override
	public boolean method7744(@OriginalArg(1) int arg0, @OriginalArg(2) Class5 arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!fl", name = "b", descriptor = "(B)V")
	@Override
	public void method7752() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!fl", name = "c", descriptor = "(B)V")
	@Override
	public void method7237() {
		super.aShort123 = super.aShort122 = (short) (this.aDouble8 / 512.0D);
		super.aShort120 = super.aShort121 = (short) (this.aDouble2 / 512.0D);
	}

	@OriginalMember(owner = "client!fl", name = "e", descriptor = "(B)I")
	@Override
	public int method7240() {
		return this.anInt2868;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIILclient!va;Lclient!oa;ZI)V")
	@Override
	public void method7749(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class6 arg2, @OriginalArg(4) Class5 arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(BILclient!oa;)Lclient!ba;")
	private Class2 method2452(@OriginalArg(1) int arg0, @OriginalArg(2) Class5 arg1) {
		@Pc(14) Class186 local14 = Static17.aClass231_2.method5905(this.anInt2857);
		return local14.method4868(this.anInt2860, arg0, Static46.aClass247_1, arg1, this.anInt2878, this.anInt2865);
	}

	@OriginalMember(owner = "client!fl", name = "b", descriptor = "(Lclient!oa;I)Lclient!ew;")
	@Override
	public Class81 method7751(@OriginalArg(0) Class5 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(I)V")
	public void method2453() {
		if (this.aClass4_Sub4_4 != null) {
			this.aClass4_Sub4_4.method4600();
		}
	}

	@OriginalMember(owner = "client!fl", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass4_Sub4_4 != null) {
			this.aClass4_Sub4_4.method4600();
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(Lclient!oa;I)V")
	@Override
	public void method7746(@OriginalArg(0) Class5 arg0) {
		@Pc(9) Class2 local9 = this.method2452(0, arg0);
		if (local9 == null) {
			return;
		}
		@Pc(15) Class205 local15 = arg0.method7448();
		local15.XA(this.anInt2856);
		local15.P(this.anInt2879);
		local15.G((int) this.aDouble8, (int) this.aDouble5, (int) this.aDouble2);
		this.anInt2868 = local9.DA();
		this.method2454(local15, arg0, local9);
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(Lclient!q;ZLclient!oa;Lclient!ba;)V")
	private void method2454(@OriginalArg(0) Class205 arg0, @OriginalArg(2) Class5 arg1, @OriginalArg(3) Class2 arg2) {
		arg2.method5770(arg0);
		@Pc(9) Class83[] local9 = arg2.method5778();
		@Pc(18) Class109[] local18 = arg2.method5789();
		if ((this.aClass4_Sub4_4 == null || this.aClass4_Sub4_4.aBoolean359) && (local9 != null || local18 != null)) {
			this.aClass4_Sub4_4 = Static261.method4593(Static223.anInt4829, true);
		}
		if (this.aClass4_Sub4_4 != null) {
			this.aClass4_Sub4_4.method4599(arg1, (long) Static223.anInt4829, local9, local18);
			this.aClass4_Sub4_4.method4588(super.aByte100, super.aShort123, super.aShort122, super.aShort120, super.aShort121);
		}
	}

	@OriginalMember(owner = "client!fl", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method7743() {
		return false;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(Lclient!oa;B)Lclient!aca;")
	@Override
	public Class4_Sub1 method7745(@OriginalArg(0) Class5 arg0) {
		@Pc(9) Class2 local9 = this.method2452(2048, arg0);
		if (local9 == null) {
			return null;
		}
		@Pc(16) Class205 local16 = arg0.method7448();
		local16.XA(this.anInt2856);
		local16.P(this.anInt2879);
		local16.G((int) this.aDouble8, (int) this.aDouble5, (int) this.aDouble2);
		this.method2454(local16, arg0, local9);
		if (this.aClass4_Sub4_4 == null) {
			local9.method5774(local16, null, 0);
		} else {
			@Pc(60) Class26 local60 = this.aClass4_Sub4_4.method4590();
			arg0.method7464(local9, local60, local16, null, 0);
		}
		this.anInt2868 = local9.DA();
		return null;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(II)V")
	public void method2458(@OriginalArg(0) int arg0) {
		this.aDouble2 += (double) arg0 * this.aDouble3;
		this.aDouble8 += this.aDouble7 * (double) arg0;
		this.aBoolean212 = true;
		if (this.aBoolean213) {
			this.aDouble5 = Static58.method1166((int) this.aDouble2, (int) this.aDouble8, super.aByte100) - this.anInt2881;
		} else if (this.anInt2872 == -1) {
			this.aDouble5 += (double) arg0 * this.aDouble1;
		} else {
			this.aDouble5 += (double) arg0 * this.aDouble4 * 0.5D * (double) arg0 + (double) arg0 * this.aDouble1;
			this.aDouble1 += this.aDouble4 * (double) arg0;
		}
		this.anInt2879 = (int) (Math.atan2(this.aDouble7, this.aDouble3) * 2607.5945876176133D) + 8192 & 0x3FFF;
		this.anInt2856 = (int) (Math.atan2(this.aDouble1, this.aDouble6) * 2607.5945876176133D) & 0x3FFF;
		if (this.aClass122_2 == null) {
			return;
		}
		this.anInt2865 += arg0;
		while (true) {
			do {
				do {
					if (this.anInt2865 <= this.aClass122_2.anIntArray394[this.anInt2860]) {
						return;
					}
					this.anInt2865 -= this.aClass122_2.anIntArray394[this.anInt2860];
					this.anInt2860++;
					if (this.anInt2860 >= this.aClass122_2.anIntArray396.length) {
						this.anInt2860 -= this.aClass122_2.anInt4152;
						if (this.anInt2860 < 0 || this.anInt2860 >= this.aClass122_2.anIntArray396.length) {
							this.anInt2860 = 0;
						}
					}
					this.anInt2878 = this.anInt2860 + 1;
				} while (this.anInt2878 < this.aClass122_2.anIntArray396.length);
				this.anInt2878 -= this.aClass122_2.anInt4152;
			} while (this.anInt2878 >= 0 && this.anInt2878 < this.aClass122_2.anIntArray396.length);
			this.anInt2878 = -1;
		}
	}
}
