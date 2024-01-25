import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ii")
public final class Class8_Sub3_Sub3_Sub2 extends Class8_Sub3_Sub3 {

	@OriginalMember(owner = "client!ii", name = "D", descriptor = "D")
	private double aDouble1;

	@OriginalMember(owner = "client!ii", name = "G", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!ii", name = "O", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!ii", name = "T", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!ii", name = "hb", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!ii", name = "ib", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!ii", name = "pb", descriptor = "I")
	private int anInt4195;

	@OriginalMember(owner = "client!ii", name = "sb", descriptor = "I")
	private int anInt4198;

	@OriginalMember(owner = "client!ii", name = "wb", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!ii", name = "xb", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!ii", name = "Db", descriptor = "Lclient!mca;")
	private Class8_Sub7 aClass8_Sub7_3;

	@OriginalMember(owner = "client!ii", name = "Q", descriptor = "I")
	private int anInt4177 = 0;

	@OriginalMember(owner = "client!ii", name = "U", descriptor = "I")
	private int anInt4179 = 0;

	@OriginalMember(owner = "client!ii", name = "J", descriptor = "Z")
	private boolean aBoolean322 = false;

	@OriginalMember(owner = "client!ii", name = "lb", descriptor = "I")
	private int lb = 0;

	@OriginalMember(owner = "client!ii", name = "E", descriptor = "I")
	private int anInt4170 = -1;

	@OriginalMember(owner = "client!ii", name = "N", descriptor = "Z")
	private boolean aBoolean323 = false;

	@OriginalMember(owner = "client!ii", name = "Y", descriptor = "I")
	private int anInt4182 = 0;

	@OriginalMember(owner = "client!ii", name = "bb", descriptor = "I")
	private final int anInt4185;

	@OriginalMember(owner = "client!ii", name = "P", descriptor = "I")
	public final int anInt4176;

	@OriginalMember(owner = "client!ii", name = "cb", descriptor = "I")
	private final int anInt4186;

	@OriginalMember(owner = "client!ii", name = "nb", descriptor = "I")
	public final int anInt4193;

	@OriginalMember(owner = "client!ii", name = "gb", descriptor = "Z")
	private final boolean aBoolean324;

	@OriginalMember(owner = "client!ii", name = "yb", descriptor = "I")
	private final int anInt4201;

	@OriginalMember(owner = "client!ii", name = "ob", descriptor = "I")
	private final int anInt4194;

	@OriginalMember(owner = "client!ii", name = "W", descriptor = "I")
	public final int anInt4180;

	@OriginalMember(owner = "client!ii", name = "ub", descriptor = "I")
	public final int anInt4200;

	@OriginalMember(owner = "client!ii", name = "zb", descriptor = "Lclient!rk;")
	private final Class290 aClass290_1;

	@OriginalMember(owner = "client!ii", name = "<init>", descriptor = "(IIIIIIIIIIIIZ)V")
	public Class8_Sub3_Sub3_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12) {
		super(arg1, arg2, arg3, Static66.method1191(arg3, arg1, arg4) - arg5, arg4, arg3 >> 9, arg3 >> 9, arg4 >> 9, arg4 >> 9, false, (byte) 0);
		this.aBoolean322 = false;
		this.anInt4185 = arg9;
		this.anInt4176 = arg7;
		this.anInt4186 = arg0;
		this.anInt4193 = arg10;
		this.aBoolean324 = arg12;
		this.anInt4201 = arg5;
		this.anInt4194 = arg8;
		this.anInt4180 = arg11;
		this.anInt4200 = arg6;
		@Pc(84) int local84 = Static107.aClass200_3.method3956(this.anInt4186).anInt1383;
		if (local84 == -1) {
			this.aClass290_1 = null;
		} else {
			this.aClass290_1 = Static192.aClass211_1.method4277(local84);
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(I)V")
	public void method3380() {
		if (this.aClass8_Sub7_3 != null) {
			this.aClass8_Sub7_3.method4397();
		}
	}

	@OriginalMember(owner = "client!ii", name = "j", descriptor = "(I)Z")
	@Override
	public boolean method7629() {
		return false;
	}

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "(ILclient!r;)Lclient!nu;")
	@Override
	public Class242 method7627(@OriginalArg(1) Class134 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lclient!r;II)Lclient!da;")
	private Class63 method3382(@OriginalArg(0) Class134 arg0, @OriginalArg(2) int arg1) {
		@Pc(18) Class60 local18 = Static107.aClass200_3.method3956(this.anInt4186);
		return local18.method1219(this.lb, Static192.aClass211_1, this.anInt4179, arg0, arg1, this.anInt4170);
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(II)V")
	public void method3383(@OriginalArg(1) int arg0) {
		this.aBoolean322 = true;
		this.aDouble3 += this.aDouble6 * (double) arg0;
		this.aDouble2 += this.aDouble1 * (double) arg0;
		if (this.aBoolean324) {
			this.aDouble8 = Static66.method1191((int) this.aDouble2, super.aByte123, (int) this.aDouble3) - this.anInt4201;
		} else if (this.anInt4194 == -1) {
			this.aDouble8 += (double) arg0 * this.aDouble5;
		} else {
			this.aDouble8 += (double) arg0 * this.aDouble5 + this.aDouble4 * 0.5D * (double) arg0 * (double) arg0;
			this.aDouble5 += (double) arg0 * this.aDouble4;
		}
		this.anInt4198 = (int) (Math.atan2(this.aDouble1, this.aDouble6) * 2607.5945876176133D) + 8192 & 0x3FFF;
		this.anInt4195 = (int) (Math.atan2(this.aDouble5, this.aDouble7) * 2607.5945876176133D) & 0x3FFF;
		if (this.aClass290_1 == null) {
			return;
		}
		this.lb += arg0;
		while (true) {
			do {
				do {
					if (this.lb <= this.aClass290_1.anIntArray603[this.anInt4179]) {
						return;
					}
					this.lb -= this.aClass290_1.anIntArray603[this.anInt4179];
					this.anInt4179++;
					if (this.aClass290_1.anIntArray604.length <= this.anInt4179) {
						this.anInt4179 -= this.aClass290_1.anInt7806;
						if (this.anInt4179 < 0 || this.aClass290_1.anIntArray604.length <= this.anInt4179) {
							this.anInt4179 = 0;
						}
					}
					this.anInt4170 = this.anInt4179 + 1;
				} while (this.anInt4170 < this.aClass290_1.anIntArray604.length);
				this.anInt4170 -= this.aClass290_1.anInt7806;
			} while (this.anInt4170 >= 0 && this.anInt4170 < this.aClass290_1.anIntArray604.length);
			this.anInt4170 = -1;
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lclient!q;ILclient!r;Lclient!da;)V")
	private void method3384(@OriginalArg(0) Class113 arg0, @OriginalArg(2) Class134 arg1, @OriginalArg(3) Class63 arg2) {
		arg2.method7409(arg0);
		@Pc(9) Class206[] local9 = arg2.method7421();
		@Pc(12) Class158[] local12 = arg2.method7413();
		if ((this.aClass8_Sub7_3 == null || this.aClass8_Sub7_3.aBoolean436) && (local9 != null || local12 != null)) {
			this.aClass8_Sub7_3 = Static318.method4392(Static301.anInt5197, true);
		}
		if (this.aClass8_Sub7_3 != null) {
			this.aClass8_Sub7_3.method4399(arg1, (long) Static301.anInt5197, local9, local12);
			this.aClass8_Sub7_3.method4396(super.aByte123, super.aShort132, super.aShort133, super.aShort131, super.aShort130);
		}
	}

	@OriginalMember(owner = "client!ii", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass8_Sub7_3 != null) {
			this.aClass8_Sub7_3.method4397();
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IILclient!r;I)Z")
	@Override
	public boolean method7626(@OriginalArg(1) int arg0, @OriginalArg(2) Class134 arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!ii", name = "g", descriptor = "(I)I")
	@Override
	public int method7618() {
		return this.anInt4182;
	}

	@OriginalMember(owner = "client!ii", name = "i", descriptor = "(I)Z")
	@Override
	public boolean method7622() {
		return false;
	}

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "(Lclient!r;Z)Lclient!kq;")
	@Override
	public Class8_Sub5 method7630(@OriginalArg(0) Class134 arg0) {
		@Pc(16) Class63 local16 = this.method3382(arg0, 2048);
		if (local16 == null) {
			return null;
		}
		@Pc(23) Class113 local23 = arg0.method6963();
		local23.oa(this.anInt4195);
		local23.ZA(this.anInt4198);
		local23.U((int) this.aDouble2, (int) this.aDouble8, (int) this.aDouble3);
		this.method3384(local23, arg0, local16);
		if (Static181.aBoolean242) {
			local16.method7420(local23, null, Static40.anInt631, 0);
		} else {
			local16.method7429(local23, null, 0);
		}
		if (this.aClass8_Sub7_3 != null) {
			@Pc(70) Class343 local70 = this.aClass8_Sub7_3.method4402();
			if (Static181.aBoolean242) {
				arg0.method6947(local70, Static40.anInt631);
			} else {
				arg0.method6940(local70);
			}
		}
		this.aBoolean323 = local16.LA();
		this.anInt4182 = local16.J();
		this.anInt4177 = local16.RA();
		return null;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(ILclient!r;)V")
	@Override
	public void method7625(@OriginalArg(1) Class134 arg0) {
		@Pc(9) Class63 local9 = this.method3382(arg0, 0);
		if (local9 == null) {
			return;
		}
		@Pc(15) Class113 local15 = arg0.method6963();
		local15.oa(this.anInt4195);
		local15.ZA(this.anInt4198);
		local15.U((int) this.aDouble2, (int) this.aDouble8, (int) this.aDouble3);
		this.anInt4182 = local9.J();
		this.anInt4177 = local9.RA();
		this.method3384(local15, arg0, local9);
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIIII)V")
	public void method3386(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) double local9;
		if (!this.aBoolean322) {
			local9 = arg3 - super.anInt9365;
			@Pc(16) double local16 = (double) (arg2 - super.anInt9370);
			@Pc(25) double local25 = Math.sqrt(local16 * local16 + local9 * local9);
			this.aDouble2 = (double) super.anInt9365 + (double) this.anInt4185 * local9 / local25;
			this.aDouble3 = (double) super.anInt9370 + (double) this.anInt4185 * local16 / local25;
			if (this.aBoolean324) {
				this.aDouble8 = Static66.method1191((int) this.aDouble2, super.aByte123, (int) this.aDouble3) - this.anInt4201;
			} else {
				this.aDouble8 = super.anInt9361;
			}
		}
		local9 = this.anInt4176 + 1 - arg1;
		this.aDouble6 = ((double) arg2 - this.aDouble3) / local9;
		this.aDouble1 = ((double) arg3 - this.aDouble2) / local9;
		this.aDouble7 = Math.sqrt(this.aDouble6 * this.aDouble6 + this.aDouble1 * this.aDouble1);
		if (this.anInt4194 == -1) {
			this.aDouble5 = ((double) arg0 - this.aDouble8) / local9;
		} else {
			if (!this.aBoolean322) {
				this.aDouble5 = -this.aDouble7 * Math.tan((double) this.anInt4194 * 0.02454369D);
			}
			this.aDouble4 = ((double) arg0 - this.aDouble8 - this.aDouble5 * local9) * 2.0D / (local9 * local9);
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IZLclient!r;Lclient!rga;IIZ)V")
	@Override
	public void method7623(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class134 arg2, @OriginalArg(3) Class8_Sub3 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ii", name = "l", descriptor = "(I)V")
	@Override
	public void method7633() {
		super.aShort132 = super.aShort133 = (short) (this.aDouble2 / 512.0D);
		super.aShort131 = super.aShort130 = (short) (this.aDouble3 / 512.0D);
	}

	@OriginalMember(owner = "client!ii", name = "f", descriptor = "(I)V")
	@Override
	public void method7617() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ii", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method7620() {
		return this.aBoolean323;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(B)I")
	@Override
	public int method7628(@OriginalArg(0) byte arg0) {
		return arg0 < 39 ? 104 : this.anInt4177;
	}
}
