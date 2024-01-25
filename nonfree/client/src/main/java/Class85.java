import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fn")
public final class Class85 {

	@OriginalMember(owner = "client!fn", name = "c", descriptor = "I")
	private int anInt2078;

	@OriginalMember(owner = "client!fn", name = "e", descriptor = "I")
	private int anInt2079;

	@OriginalMember(owner = "client!fn", name = "g", descriptor = "I")
	public int anInt2081;

	@OriginalMember(owner = "client!fn", name = "h", descriptor = "I")
	private int anInt2082;

	@OriginalMember(owner = "client!fn", name = "m", descriptor = "Lclient!tr;")
	private Class110 aClass110_5;

	@OriginalMember(owner = "client!fn", name = "p", descriptor = "I")
	private int anInt2086;

	@OriginalMember(owner = "client!fn", name = "q", descriptor = "I")
	private final int anInt2087;

	@OriginalMember(owner = "client!fn", name = "f", descriptor = "I")
	private final int anInt2080;

	@OriginalMember(owner = "client!fn", name = "r", descriptor = "I")
	private final int anInt2088;

	@OriginalMember(owner = "client!fn", name = "b", descriptor = "Z")
	private final boolean aBoolean157;

	@OriginalMember(owner = "client!fn", name = "o", descriptor = "I")
	private final int anInt2085;

	@OriginalMember(owner = "client!fn", name = "i", descriptor = "I")
	private final int anInt2083;

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "I")
	private final int anInt2077;

	@OriginalMember(owner = "client!fn", name = "j", descriptor = "I")
	private final int anInt2084;

	@OriginalMember(owner = "client!fn", name = "<init>", descriptor = "(IIIIIIIZ)V")
	public Class85(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt2087 = arg2;
		this.anInt2080 = arg3;
		this.anInt2088 = arg4;
		this.aBoolean157 = arg7;
		this.anInt2085 = arg1;
		this.anInt2083 = arg6;
		this.anInt2077 = arg5;
		this.anInt2084 = arg0;
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lclient!np;Lclient!fn;)Z")
	private boolean method1729(@OriginalArg(0) Class155 arg0, @OriginalArg(1) Class85 arg1) {
		if (this.aClass110_5 == null) {
			if (this.anInt2084 == 0) {
				if (Static313.anInterface10_8.method191(this.anInt2085)) {
					@Pc(23) int[] local23 = Static313.anInterface10_8.method193(0.7F, this.anInt2079, this.anInt2085, this.anInt2079);
					this.aClass110_5 = arg0.method4871(local23, this.anInt2079, this.anInt2079, this.anInt2079);
				}
			} else if (this.anInt2084 == 2) {
				this.method1733(arg0, arg1);
			} else if (this.anInt2084 == 1) {
				this.method1731(arg0, arg1);
			}
		}
		return this.aClass110_5 != null;
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(IIII)Z")
	public boolean method1730(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean157) {
			this.anInt2081 = 1073741823;
			local7 = this.anInt2087;
			local12 = this.anInt2080;
			local17 = this.anInt2088;
		} else {
			local7 = this.anInt2087 - arg0;
			local12 = this.anInt2080 - arg1;
			local17 = this.anInt2088 - arg2;
			this.anInt2081 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt2081 == 0) {
				this.anInt2081 = 1;
			}
			local7 = (local7 << 8) / this.anInt2081;
			local12 = (local12 << 8) / this.anInt2081;
			local17 = (local17 << 8) / this.anInt2081;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt2082 = this.anInt2077 * arg3 / (this.aBoolean157 ? 1024 : this.anInt2081);
		} else {
			this.anInt2082 = 0;
		}
		if (this.anInt2082 < 8) {
			this.aClass110_5 = null;
			return false;
		}
		@Pc(143) int local143 = Static304.method2746(this.anInt2082);
		if (local143 > arg3) {
			local143 = Static338.method5141(arg3);
		}
		if (local143 > 512) {
			local143 = 512;
		}
		if (local143 != this.anInt2079) {
			this.anInt2079 = local143;
		}
		this.anInt2086 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 5215.189175235227D) & 0x3FFF;
		this.anInt2078 = (int) (Math.atan2((double) local7, (double) -local17) * 5215.189175235227D) & 0x3FFF;
		this.aClass110_5 = null;
		return true;
	}

	@OriginalMember(owner = "client!fn", name = "b", descriptor = "(Lclient!np;Lclient!fn;)V")
	private void method1731(@OriginalArg(0) Class155 arg0, @OriginalArg(1) Class85 arg1) {
		Static106.method1734(arg0);
		Static106.method1735(arg0);
		arg0.method4941(Static106.anIntArray207);
		arg0.method4867(0, 0, this.anInt2079, this.anInt2079);
		arg0.method4877();
		arg0.method4896(0, 0, this.anInt2079, this.anInt2079, this.anInt2083 | 0xFF000000, 0);
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean157) {
				local31 = -arg1.anInt2087;
				local33 = -arg1.anInt2080;
				local35 = -arg1.anInt2088;
			} else {
				local31 = arg1.anInt2087 - this.anInt2087;
				local33 = arg1.anInt2080 - this.anInt2080;
				local35 = arg1.anInt2088 - this.anInt2088;
			}
		}
		@Pc(79) int local79;
		@Pc(84) int local84;
		@Pc(94) int local94;
		if (this.anInt2086 != 0) {
			local79 = Class226.anIntArray614[this.anInt2086];
			local84 = Class226.anIntArray613[this.anInt2086];
			local94 = local33 * local84 - local35 * local79 >> 15;
			local35 = local33 * local79 + local35 * local84 >> 15;
			local33 = local94;
		}
		if (this.anInt2078 != 0) {
			local79 = Class226.anIntArray614[this.anInt2078];
			local84 = Class226.anIntArray613[this.anInt2078];
			local94 = local35 * local79 + local31 * local84 >> 15;
			local35 = local35 * local84 - local31 * local79 >> 15;
			local31 = local94;
		}
		@Pc(147) Class75 local147 = Static106.aClass75_2.method5473((byte) 0, 25600, true);
		if (arg0.method4903()) {
			local147.method5459((short) 0, (short) this.anInt2085);
		} else {
			local147.method5484((short) 127, Static313.anInterface10_8.method192(this.anInt2085).aShort32);
			local147.method5459((short) 0, (short) -1);
		}
		arg0.method4899(1.0F);
		arg0.method4881(16777215, 1.0F, 1.0F, (float) local31, (float) local33, (float) local35);
		local84 = this.anInt2079 * 1024 / (local147.method5464() - local147.method5457());
		if (this.anInt2083 != 0) {
			local84 = local84 * 13 / 16;
		}
		arg0.method4880(this.anInt2079 / 2, this.anInt2079 / 2, local84, local84);
		arg0.method4904(arg0.method4950());
		@Pc(223) Class118 local223 = arg0.method4950();
		local223.method2659(0, 0, arg0.method4868() - local147.method5477());
		local147.method5456(local223, null, 1024);
		@Pc(245) int local245 = this.anInt2079 * 13 / 16;
		@Pc(252) int local252 = (this.anInt2079 - local245) / 2;
		Static106.aClass110_3.method5103(local252, local252, local245, local245, 1, this.anInt2083 | 0xFF000000, 1);
		this.aClass110_5 = arg0.method4901(0, 0, this.anInt2079, this.anInt2079, true);
		arg0.method4877();
		arg0.method4896(0, 0, this.anInt2079, this.anInt2079, 0, 0);
		Static106.aClass110_4.method5103(0, 0, this.anInt2079, this.anInt2079, 0, 0, 0);
		this.aClass110_5.method5099(0);
		arg0.method4867(Static106.anIntArray207[0], Static106.anIntArray207[1], Static106.anIntArray207[2], Static106.anIntArray207[3]);
	}

	@OriginalMember(owner = "client!fn", name = "c", descriptor = "(Lclient!np;Lclient!fn;)Z")
	public boolean method1732(@OriginalArg(0) Class155 arg0, @OriginalArg(1) Class85 arg1) {
		return this.aClass110_5 != null || this.method1729(arg0, arg1);
	}

	@OriginalMember(owner = "client!fn", name = "d", descriptor = "(Lclient!np;Lclient!fn;)V")
	private void method1733(@OriginalArg(0) Class155 arg0, @OriginalArg(1) Class85 arg1) {
		@Pc(6) Class239 local6 = Static214.method3327(Static74.aClass20_18, this.anInt2085);
		if (local6 == null) {
			return;
		}
		arg0.method4941(Static106.anIntArray207);
		arg0.method4867(0, 0, this.anInt2079, this.anInt2079);
		arg0.method4896(0, 0, this.anInt2079, this.anInt2079, 0, 0);
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean157) {
				local32 = -arg1.anInt2087;
				local34 = -arg1.anInt2080;
				local36 = -arg1.anInt2088;
			} else {
				local32 = this.anInt2087 - arg1.anInt2087;
				local34 = this.anInt2080 - arg1.anInt2080;
				local36 = this.anInt2088 - arg1.anInt2088;
			}
		}
		@Pc(81) int local81;
		@Pc(85) int local85;
		@Pc(89) int local89;
		@Pc(99) int local99;
		if (this.anInt2086 != 0) {
			local81 = -this.anInt2086 & 0x3FFF;
			local85 = Class226.anIntArray614[local81];
			local89 = Class226.anIntArray613[local81];
			local99 = local34 * local89 - local36 * local85 >> 15;
			local36 = local34 * local85 + local36 * local89 >> 15;
			local34 = local99;
		}
		if (this.anInt2078 != 0) {
			local81 = -this.anInt2078 & 0x3FFF;
			local85 = Class226.anIntArray614[local81];
			local89 = Class226.anIntArray613[local81];
			local99 = local36 * local85 + local32 * local89 >> 15;
			local36 = local36 * local89 - local32 * local85 >> 15;
			local32 = local99;
		}
		arg0.method4899(1.0F);
		arg0.method4881(16777215, 1.0F, 1.0F, (float) local32, (float) local34, (float) local36);
		@Pc(172) Class75 local172 = arg0.method4930(local6, 1024, 0, 64, 768);
		local85 = local172.method5464() - local172.method5457();
		local89 = local172.method5449() - local172.method5476();
		local99 = local172.method5457() + local85 / 2;
		@Pc(198) int local198 = local172.method5476() + local89 / 2;
		@Pc(205) int local205 = local85 > local89 ? local85 : local89;
		arg0.method4880(local99, local198, local205, local205);
		arg0.method4904(arg0.method4950());
		@Pc(218) Class118 local218 = arg0.method4908();
		local218.method2659(0, 0, arg0.method4868() - local172.method5477());
		local172.method5456(local218, null, arg0.method4868());
		this.aClass110_5 = arg0.method4901(0, 0, this.anInt2079, this.anInt2079, true);
		this.aClass110_5.method5099(3);
		arg0.method4867(Static106.anIntArray207[0], Static106.anIntArray207[1], Static106.anIntArray207[2], Static106.anIntArray207[3]);
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lclient!np;IIIIII)V")
	public void method1738(@OriginalArg(0) Class155 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass110_5 == null) {
			return;
		}
		@Pc(10) int local10 = this.anInt2086 - arg5 & 0x3FFF;
		@Pc(17) int local17 = this.anInt2078 - arg6 & 0x3FFF;
		if (local17 > 8192) {
			local17 -= 16384;
		}
		if (local10 > 8192) {
			local10 -= 16384;
		}
		@Pc(38) int local38 = local10 * arg4 / 4096 + (arg4 - this.anInt2082) / 2;
		@Pc(51) int local51 = local17 * arg4 / -4096 + (arg3 - this.anInt2082) / 2;
		if (local38 < arg4 && local38 + this.anInt2082 > 0 && local51 < arg3 && local51 + this.anInt2082 > 0) {
			this.aClass110_5.method5102(local51 + arg1, local38 + arg2, this.anInt2082, this.anInt2082);
		}
	}

	@OriginalMember(owner = "client!fn", name = "c", descriptor = "()V")
	public void method1739() {
		this.aClass110_5 = null;
	}
}
