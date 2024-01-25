import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!m")
public final class Class167 {

	@OriginalMember(owner = "client!m", name = "c", descriptor = "I")
	private int anInt4262;

	@OriginalMember(owner = "client!m", name = "e", descriptor = "I")
	private int anInt4264;

	@OriginalMember(owner = "client!m", name = "g", descriptor = "I")
	private int anInt4266;

	@OriginalMember(owner = "client!m", name = "i", descriptor = "I")
	private int anInt4267;

	@OriginalMember(owner = "client!m", name = "k", descriptor = "I")
	public int anInt4269;

	@OriginalMember(owner = "client!m", name = "l", descriptor = "Lclient!o;")
	private Class41 aClass41_13;

	@OriginalMember(owner = "client!m", name = "m", descriptor = "I")
	private final int anInt4270;

	@OriginalMember(owner = "client!m", name = "j", descriptor = "I")
	private final int anInt4268;

	@OriginalMember(owner = "client!m", name = "p", descriptor = "I")
	private final int anInt4272;

	@OriginalMember(owner = "client!m", name = "h", descriptor = "Z")
	private final boolean aBoolean311;

	@OriginalMember(owner = "client!m", name = "o", descriptor = "I")
	private final int anInt4271;

	@OriginalMember(owner = "client!m", name = "a", descriptor = "I")
	private final int anInt4261;

	@OriginalMember(owner = "client!m", name = "d", descriptor = "I")
	private final int anInt4263;

	@OriginalMember(owner = "client!m", name = "f", descriptor = "I")
	private final int anInt4265;

	@OriginalMember(owner = "client!m", name = "<init>", descriptor = "(IIIIIIIZ)V")
	public Class167(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt4270 = arg2;
		this.anInt4268 = arg3;
		this.anInt4272 = arg4;
		this.aBoolean311 = arg7;
		this.anInt4271 = arg1;
		this.anInt4261 = arg6;
		this.anInt4263 = arg5;
		this.anInt4265 = arg0;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(Lclient!za;Lclient!m;)Z")
	public boolean method3425(@OriginalArg(0) Class75 arg0, @OriginalArg(1) Class167 arg1) {
		return this.aClass41_13 != null || this.method3429(arg0, arg1);
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "()V")
	public void method3426() {
		this.aClass41_13 = null;
	}

	@OriginalMember(owner = "client!m", name = "b", descriptor = "(Lclient!za;Lclient!m;)Z")
	private boolean method3429(@OriginalArg(0) Class75 arg0, @OriginalArg(1) Class167 arg1) {
		if (this.aClass41_13 == null) {
			if (this.anInt4265 == 0) {
				if (Static433.anInterface7_7.method1168(this.anInt4271)) {
					@Pc(23) int[] local23 = Static433.anInterface7_7.method1172(0.7F, this.anInt4267, this.anInt4271, this.anInt4267);
					this.aClass41_13 = arg0.method6006(local23, this.anInt4267, this.anInt4267, this.anInt4267);
				}
			} else if (this.anInt4265 == 2) {
				this.method3434(arg0, arg1);
			} else if (this.anInt4265 == 1) {
				this.method3431(arg0, arg1);
			}
		}
		return this.aClass41_13 != null;
	}

	@OriginalMember(owner = "client!m", name = "c", descriptor = "(Lclient!za;Lclient!m;)V")
	private void method3431(@OriginalArg(0) Class75 arg0, @OriginalArg(1) Class167 arg1) {
		Static248.method3427(arg0);
		Static248.method3435(arg0);
		arg0.MA(Static248.anIntArray385);
		arg0.ba(0, 0, this.anInt4267, this.anInt4267);
		arg0.method5963();
		arg0.P(0, 0, this.anInt4267, this.anInt4267, this.anInt4261 | 0xFF000000, 0);
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean311) {
				local31 = -arg1.anInt4270;
				local33 = -arg1.anInt4268;
				local35 = -arg1.anInt4272;
			} else {
				local31 = arg1.anInt4270 - this.anInt4270;
				local33 = arg1.anInt4268 - this.anInt4268;
				local35 = arg1.anInt4272 - this.anInt4272;
			}
		}
		@Pc(79) int local79;
		@Pc(84) int local84;
		@Pc(94) int local94;
		if (this.anInt4266 != 0) {
			local79 = Class229.anIntArray537[this.anInt4266];
			local84 = Class229.anIntArray536[this.anInt4266];
			local94 = local33 * local84 - local35 * local79 >> 15;
			local35 = local33 * local79 + local35 * local84 >> 15;
			local33 = local94;
		}
		if (this.anInt4264 != 0) {
			local79 = Class229.anIntArray537[this.anInt4264];
			local84 = Class229.anIntArray536[this.anInt4264];
			local94 = local35 * local79 + local31 * local84 >> 15;
			local35 = local35 * local84 - local31 * local79 >> 15;
			local31 = local94;
		}
		@Pc(147) Class63 local147 = Static248.aClass63_5.method6296((byte) 0, 51200, true);
		if (arg0.method6021()) {
			local147.u((short) 0, (short) this.anInt4271);
		} else {
			local147.q((short) 127, Static433.anInterface7_7.method1170(this.anInt4271).aShort101);
			local147.u((short) 0, (short) -1);
		}
		arg0.JA(1.0F);
		arg0.B(16777215, 1.0F, 1.0F, (float) local31, (float) local33, (float) local35);
		local84 = this.anInt4267 * 1024 / (local147.MA() - local147.ta());
		if (this.anInt4261 != 0) {
			local84 = local84 * 13 / 16;
		}
		arg0.GA(this.anInt4267 / 2, this.anInt4267 / 2, local84, local84);
		arg0.SA(arg0.method6014());
		@Pc(223) Class6 local223 = arg0.method6014();
		local223.U(0, 0, arg0.AA() - local147.Z());
		local147.method6287(local223, null, 1024);
		@Pc(245) int local245 = this.anInt4267 * 13 / 16;
		@Pc(252) int local252 = (this.anInt4267 - local245) / 2;
		Static248.aClass41_14.ya(local252, local252, local245, local245, 0, this.anInt4261 | 0xFF000000, 1);
		this.aClass41_13 = arg0.method5973(0, 0, this.anInt4267, this.anInt4267, true);
		arg0.method5963();
		arg0.P(0, 0, this.anInt4267, this.anInt4267, 0, 0);
		Static248.aClass41_12.ya(0, 0, this.anInt4267, this.anInt4267, 1, 0, 0);
		this.aClass41_13.oa(0, 0, 0);
		arg0.ba(Static248.anIntArray385[0], Static248.anIntArray385[1], Static248.anIntArray385[2], Static248.anIntArray385[3]);
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IIII)Z")
	public boolean method3432(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean311) {
			this.anInt4269 = 1073741823;
			local7 = this.anInt4270;
			local12 = this.anInt4268;
			local17 = this.anInt4272;
		} else {
			local7 = this.anInt4270 - arg0;
			local12 = this.anInt4268 - arg1;
			local17 = this.anInt4272 - arg2;
			this.anInt4269 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt4269 == 0) {
				this.anInt4269 = 1;
			}
			local7 = (local7 << 8) / this.anInt4269;
			local12 = (local12 << 8) / this.anInt4269;
			local17 = (local17 << 8) / this.anInt4269;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt4262 = this.anInt4263 * arg3 / (this.aBoolean311 ? 1024 : this.anInt4269);
		} else {
			this.anInt4262 = 0;
		}
		if (this.anInt4262 < 8) {
			this.aClass41_13 = null;
			return false;
		}
		@Pc(143) int local143 = Static43.method654(this.anInt4262);
		if (local143 > arg3) {
			local143 = Static14.method326(arg3);
		}
		if (local143 > 512) {
			local143 = 512;
		}
		if (local143 != this.anInt4267) {
			this.anInt4267 = local143;
		}
		this.anInt4266 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 5215.189175235227D) & 0x3FFF;
		this.anInt4264 = (int) (Math.atan2((double) local7, (double) -local17) * 5215.189175235227D) & 0x3FFF;
		this.aClass41_13 = null;
		return true;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(Lclient!za;IIIIII)V")
	public void method3433(@OriginalArg(0) Class75 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass41_13 == null) {
			return;
		}
		@Pc(10) int local10 = this.anInt4266 - arg5 & 0x3FFF;
		@Pc(17) int local17 = this.anInt4264 - arg6 & 0x3FFF;
		if (local17 > 8192) {
			local17 -= 16384;
		}
		if (local10 > 8192) {
			local10 -= 16384;
		}
		@Pc(38) int local38 = local10 * arg4 / 4096 + (arg4 - this.anInt4262) / 2;
		@Pc(51) int local51 = local17 * arg4 / -4096 + (arg3 - this.anInt4262) / 2;
		if (local38 < arg4 && local38 + this.anInt4262 > 0 && local51 < arg3 && local51 + this.anInt4262 > 0) {
			this.aClass41_13.method6089(local51 + arg1, local38 + arg2, this.anInt4262, this.anInt4262);
		}
	}

	@OriginalMember(owner = "client!m", name = "d", descriptor = "(Lclient!za;Lclient!m;)V")
	private void method3434(@OriginalArg(0) Class75 arg0, @OriginalArg(1) Class167 arg1) {
		@Pc(6) Class76 local6 = Static378.method5924(Static370.aClass171_85, this.anInt4271);
		if (local6 == null) {
			return;
		}
		arg0.MA(Static248.anIntArray385);
		arg0.ba(0, 0, this.anInt4267, this.anInt4267);
		arg0.P(0, 0, this.anInt4267, this.anInt4267, 0, 0);
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean311) {
				local32 = -arg1.anInt4270;
				local34 = -arg1.anInt4268;
				local36 = -arg1.anInt4272;
			} else {
				local32 = this.anInt4270 - arg1.anInt4270;
				local34 = this.anInt4268 - arg1.anInt4268;
				local36 = this.anInt4272 - arg1.anInt4272;
			}
		}
		@Pc(81) int local81;
		@Pc(85) int local85;
		@Pc(89) int local89;
		@Pc(99) int local99;
		if (this.anInt4266 != 0) {
			local81 = -this.anInt4266 & 0x3FFF;
			local85 = Class229.anIntArray537[local81];
			local89 = Class229.anIntArray536[local81];
			local99 = local34 * local89 - local36 * local85 >> 15;
			local36 = local34 * local85 + local36 * local89 >> 15;
			local34 = local99;
		}
		if (this.anInt4264 != 0) {
			local81 = -this.anInt4264 & 0x3FFF;
			local85 = Class229.anIntArray537[local81];
			local89 = Class229.anIntArray536[local81];
			local99 = local36 * local85 + local32 * local89 >> 15;
			local36 = local36 * local89 - local32 * local85 >> 15;
			local32 = local99;
		}
		arg0.JA(1.0F);
		arg0.B(16777215, 1.0F, 1.0F, (float) local32, (float) local34, (float) local36);
		@Pc(172) Class63 local172 = arg0.method6016(local6, 2048, 0, 64, 768);
		local85 = local172.MA() - local172.ta();
		local89 = local172.l() - local172.B();
		local99 = local172.ta() + local85 / 2;
		@Pc(198) int local198 = local172.B() + local89 / 2;
		@Pc(205) int local205 = local85 > local89 ? local85 : local89;
		arg0.GA(local99, local198, local205, local205);
		arg0.SA(arg0.method6014());
		@Pc(218) Class6 local218 = arg0.method5990();
		local218.U(0, 0, arg0.AA() - local172.Z());
		local172.method6287(local218, null, arg0.AA());
		this.aClass41_13 = arg0.method5973(0, 0, this.anInt4267, this.anInt4267, true);
		this.aClass41_13.oa(0, 0, 3);
		arg0.ba(Static248.anIntArray385[0], Static248.anIntArray385[1], Static248.anIntArray385[2], Static248.anIntArray385[3]);
	}
}
