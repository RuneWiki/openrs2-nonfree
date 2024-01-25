import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cca")
public final class Class12_Sub2_Sub1_Sub1 extends Class12_Sub2_Sub1 {

	@OriginalMember(owner = "client!cca", name = "O", descriptor = "D")
	private double aDouble1;

	@OriginalMember(owner = "client!cca", name = "Q", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!cca", name = "R", descriptor = "I")
	private int anInt1035;

	@OriginalMember(owner = "client!cca", name = "U", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!cca", name = "ab", descriptor = "I")
	private int anInt1042;

	@OriginalMember(owner = "client!cca", name = "bb", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!cca", name = "jb", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!cca", name = "rb", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!cca", name = "tb", descriptor = "Lclient!kv;")
	private Class12_Sub4 aClass12_Sub4_1;

	@OriginalMember(owner = "client!cca", name = "yb", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!cca", name = "Ab", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!cca", name = "P", descriptor = "I")
	private int anInt1034 = 0;

	@OriginalMember(owner = "client!cca", name = "V", descriptor = "Z")
	private boolean aBoolean58 = false;

	@OriginalMember(owner = "client!cca", name = "K", descriptor = "I")
	private int anInt1032 = 0;

	@OriginalMember(owner = "client!cca", name = "eb", descriptor = "I")
	private int anInt1045 = 0;

	@OriginalMember(owner = "client!cca", name = "N", descriptor = "I")
	private int anInt1033 = 0;

	@OriginalMember(owner = "client!cca", name = "L", descriptor = "Z")
	private boolean aBoolean57 = false;

	@OriginalMember(owner = "client!cca", name = "zb", descriptor = "I")
	private int anInt1059 = -1;

	@OriginalMember(owner = "client!cca", name = "Cb", descriptor = "I")
	public final int anInt1061;

	@OriginalMember(owner = "client!cca", name = "W", descriptor = "I")
	private final int anInt1038;

	@OriginalMember(owner = "client!cca", name = "kb", descriptor = "Z")
	private final boolean aBoolean59;

	@OriginalMember(owner = "client!cca", name = "db", descriptor = "I")
	private final int anInt1044;

	@OriginalMember(owner = "client!cca", name = "mb", descriptor = "I")
	public final int anInt1050;

	@OriginalMember(owner = "client!cca", name = "nb", descriptor = "I")
	private final int anInt1051;

	@OriginalMember(owner = "client!cca", name = "H", descriptor = "I")
	public final int anInt1030;

	@OriginalMember(owner = "client!cca", name = "wb", descriptor = "I")
	public final int anInt1058;

	@OriginalMember(owner = "client!cca", name = "X", descriptor = "I")
	private final int anInt1039;

	@OriginalMember(owner = "client!cca", name = "J", descriptor = "Lclient!hq;")
	private final Class148 aClass148_1;

	@OriginalMember(owner = "client!cca", name = "<init>", descriptor = "(IIIIIIIIIIIIZ)V")
	public Class12_Sub2_Sub1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12) {
		super(arg1, arg2, arg3, Static24.method347(arg4, arg3, arg1) - arg5, arg4, arg3 >> 9, arg3 >> 9, arg4 >> 9, arg4 >> 9, false, (byte) 0);
		this.anInt1061 = arg6;
		this.anInt1038 = arg8;
		this.aBoolean59 = arg12;
		this.anInt1044 = arg9;
		this.aBoolean57 = false;
		this.anInt1050 = arg7;
		this.anInt1051 = arg0;
		this.anInt1030 = arg11;
		this.anInt1058 = arg10;
		this.anInt1039 = arg5;
		@Pc(85) int local85 = Static62.aClass49_1.method1021(this.anInt1051).anInt1827;
		if (local85 == -1) {
			this.aClass148_1 = null;
		} else {
			this.aClass148_1 = Static117.aClass18_1.method296(local85);
		}
	}

	@OriginalMember(owner = "client!cca", name = "e", descriptor = "(B)V")
	@Override
	public void method7514() {
		super.aShort121 = super.aShort122 = (short) (this.aDouble4 / 512.0D);
		super.aShort120 = super.aShort119 = (short) (this.aDouble3 / 512.0D);
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(ILclient!r;ILclient!caa;ZII)V")
	@Override
	public void method7507(@OriginalArg(0) int arg0, @OriginalArg(1) Class162 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class12_Sub2 arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(Lclient!r;II)Lclient!da;")
	private Class33 method1007(@OriginalArg(0) Class162 arg0, @OriginalArg(1) int arg1) {
		@Pc(15) Class82 local15 = Static62.aClass49_1.method1021(this.anInt1051);
		return local15.method1544(this.anInt1033, Static117.aClass18_1, this.anInt1059, arg1, arg0, this.anInt1032);
	}

	@OriginalMember(owner = "client!cca", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method7513() {
		return false;
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(BLclient!da;Lclient!q;Lclient!r;)V")
	private void method1008(@OriginalArg(1) Class33 arg0, @OriginalArg(2) Class25 arg1, @OriginalArg(3) Class162 arg2) {
		arg0.method7202(arg1);
		@Pc(9) Class293[] local9 = arg0.method7196();
		@Pc(18) Class163[] local18 = arg0.method7191();
		if ((this.aClass12_Sub4_1 == null || this.aClass12_Sub4_1.aBoolean380) && (local9 != null || local18 != null)) {
			this.aClass12_Sub4_1 = Static291.method4138(Static532.anInt8757, true);
		}
		if (this.aClass12_Sub4_1 != null) {
			this.aClass12_Sub4_1.method4128(arg2, (long) Static532.anInt8757, local9, local18);
			this.aClass12_Sub4_1.method4127(super.aByte128, super.aShort120, super.aShort119, super.aShort121, super.aShort122);
		}
	}

	@OriginalMember(owner = "client!cca", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass12_Sub4_1 != null) {
			this.aClass12_Sub4_1.method4126();
		}
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(I)V")
	public void method1009() {
		if (this.aClass12_Sub4_1 != null) {
			this.aClass12_Sub4_1.method4126();
		}
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(IBIII)V")
	public void method1010(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(19) double local19;
		if (!this.aBoolean57) {
			local19 = arg2 - super.anInt9374;
			@Pc(26) double local26 = (double) (arg3 - super.anInt9375);
			@Pc(35) double local35 = Math.sqrt(local19 * local19 + local26 * local26);
			this.aDouble3 = local19 * (double) this.anInt1044 / local35 + (double) super.anInt9374;
			this.aDouble4 = (double) super.anInt9375 + (double) this.anInt1044 * local26 / local35;
			if (this.aBoolean59) {
				this.aDouble2 = Static24.method347((int) this.aDouble4, (int) this.aDouble3, super.aByte128) - this.anInt1039;
			} else {
				this.aDouble2 = super.anInt9373;
			}
		}
		local19 = this.anInt1050 + 1 - arg1;
		this.aDouble6 = ((double) arg3 - this.aDouble4) / local19;
		this.aDouble8 = ((double) arg2 - this.aDouble3) / local19;
		this.aDouble7 = Math.sqrt(this.aDouble8 * this.aDouble8 + this.aDouble6 * this.aDouble6);
		if (this.anInt1038 == -1) {
			this.aDouble1 = ((double) arg0 - this.aDouble2) / local19;
		} else {
			if (!this.aBoolean57) {
				this.aDouble1 = -this.aDouble7 * Math.tan((double) this.anInt1038 * 0.02454369D);
			}
			this.aDouble5 = ((double) arg0 - this.aDouble1 * local19 - this.aDouble2) * 2.0D / (local19 * local19);
		}
	}

	@OriginalMember(owner = "client!cca", name = "b", descriptor = "(Lclient!r;I)V")
	@Override
	public void method7498(@OriginalArg(0) Class162 arg0) {
		@Pc(17) Class33 local17 = this.method1007(arg0, 0);
		if (local17 == null) {
			return;
		}
		@Pc(23) Class25 local23 = arg0.method6862();
		local23.oa(this.anInt1042);
		local23.ZA(this.anInt1035);
		local23.U((int) this.aDouble3, (int) this.aDouble2, (int) this.aDouble4);
		this.anInt1045 = local17.J();
		this.anInt1034 = local17.RA();
		this.method1008(local17, local23, arg0);
	}

	@OriginalMember(owner = "client!cca", name = "d", descriptor = "(Z)Z")
	@Override
	public boolean method7510() {
		return false;
	}

	@OriginalMember(owner = "client!cca", name = "b", descriptor = "(Z)I")
	@Override
	public int method7501() {
		return this.anInt1045;
	}

	@OriginalMember(owner = "client!cca", name = "b", descriptor = "(IB)V")
	public void method1011(@OriginalArg(0) int arg0) {
		this.aDouble3 += this.aDouble8 * (double) arg0;
		this.aBoolean57 = true;
		this.aDouble4 += this.aDouble6 * (double) arg0;
		if (this.aBoolean59) {
			this.aDouble2 = Static24.method347((int) this.aDouble4, (int) this.aDouble3, super.aByte128) - this.anInt1039;
		} else if (this.anInt1038 == -1) {
			this.aDouble2 += this.aDouble1 * (double) arg0;
		} else {
			this.aDouble2 += (double) arg0 * this.aDouble1 + this.aDouble5 * 0.5D * (double) arg0 * (double) arg0;
			this.aDouble1 += (double) arg0 * this.aDouble5;
		}
		this.anInt1035 = (int) (Math.atan2(this.aDouble8, this.aDouble6) * 2607.5945876176133D) + 8192 & 0x3FFF;
		this.anInt1042 = (int) (Math.atan2(this.aDouble1, this.aDouble7) * 2607.5945876176133D) & 0x3FFF;
		if (this.aClass148_1 == null) {
			return;
		}
		this.anInt1033 += arg0;
		while (true) {
			do {
				do {
					if (this.aClass148_1.anIntArray253[this.anInt1032] >= this.anInt1033) {
						return;
					}
					this.anInt1033 -= this.aClass148_1.anIntArray253[this.anInt1032];
					this.anInt1032++;
					if (this.aClass148_1.anIntArray254.length <= this.anInt1032) {
						this.anInt1032 -= this.aClass148_1.anInt3045;
						if (this.anInt1032 < 0 || this.anInt1032 >= this.aClass148_1.anIntArray254.length) {
							this.anInt1032 = 0;
						}
					}
					this.anInt1059 = this.anInt1032 + 1;
				} while (this.aClass148_1.anIntArray254.length > this.anInt1059);
				this.anInt1059 -= this.aClass148_1.anInt3045;
			} while (this.anInt1059 >= 0 && this.anInt1059 < this.aClass148_1.anIntArray254.length);
			this.anInt1059 = -1;
		}
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(IIZLclient!r;)Z")
	@Override
	public boolean method7500(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class162 arg2) {
		return false;
	}

	@OriginalMember(owner = "client!cca", name = "f", descriptor = "(I)I")
	@Override
	public int method7509(@OriginalArg(0) int arg0) {
		return arg0 == -1 ? this.anInt1034 : 32;
	}

	@OriginalMember(owner = "client!cca", name = "d", descriptor = "(B)V")
	@Override
	public void method7511() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!cca", name = "c", descriptor = "(Lclient!r;I)Lclient!ifa;")
	@Override
	public Class157 method7502(@OriginalArg(0) Class162 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(Lclient!r;I)Lclient!hr;")
	@Override
	public Class12_Sub3 method7496(@OriginalArg(0) Class162 arg0) {
		@Pc(11) Class33 local11 = this.method1007(arg0, 2048);
		if (local11 == null) {
			return null;
		}
		@Pc(18) Class25 local18 = arg0.method6862();
		local18.oa(this.anInt1042);
		local18.ZA(this.anInt1035);
		local18.U((int) this.aDouble3, (int) this.aDouble2, (int) this.aDouble4);
		this.method1008(local11, local18, arg0);
		if (Static286.aBoolean372) {
			local11.method7183(local18, null, Static578.anInt9366, 0);
		} else {
			local11.method7192(local18, null, 0);
		}
		if (this.aClass12_Sub4_1 != null) {
			@Pc(65) Class339 local65 = this.aClass12_Sub4_1.method4130();
			if (Static286.aBoolean372) {
				arg0.method6883(local65, Static578.anInt9366);
			} else {
				arg0.method6860(local65);
			}
		}
		this.aBoolean58 = local11.LA();
		this.anInt1045 = local11.J();
		this.anInt1034 = local11.RA();
		return null;
	}

	@OriginalMember(owner = "client!cca", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method7503() {
		return this.aBoolean58;
	}
}
