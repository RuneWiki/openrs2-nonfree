import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pm")
public final class Class201 {

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "I")
	private int anInt5307;

	@OriginalMember(owner = "client!pm", name = "e", descriptor = "I")
	private int anInt5308;

	@OriginalMember(owner = "client!pm", name = "g", descriptor = "I")
	private int anInt5310;

	@OriginalMember(owner = "client!pm", name = "j", descriptor = "I")
	private int anInt5312;

	@OriginalMember(owner = "client!pm", name = "k", descriptor = "I")
	public int anInt5313;

	@OriginalMember(owner = "client!pm", name = "n", descriptor = "Lclient!o;")
	private Class85 aClass85_15;

	@OriginalMember(owner = "client!pm", name = "l", descriptor = "I")
	private final int anInt5314;

	@OriginalMember(owner = "client!pm", name = "f", descriptor = "I")
	private final int anInt5309;

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "I")
	private final int anInt5306;

	@OriginalMember(owner = "client!pm", name = "i", descriptor = "Z")
	private final boolean aBoolean478;

	@OriginalMember(owner = "client!pm", name = "m", descriptor = "I")
	private final int anInt5315;

	@OriginalMember(owner = "client!pm", name = "o", descriptor = "I")
	private final int anInt5316;

	@OriginalMember(owner = "client!pm", name = "h", descriptor = "I")
	private final int anInt5311;

	@OriginalMember(owner = "client!pm", name = "r", descriptor = "I")
	private final int anInt5317;

	@OriginalMember(owner = "client!pm", name = "<init>", descriptor = "(IIIIIIIZ)V")
	public Class201(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt5314 = arg2;
		this.anInt5309 = arg3;
		this.anInt5306 = arg4;
		this.aBoolean478 = arg7;
		this.anInt5315 = arg1;
		this.anInt5316 = arg6;
		this.anInt5311 = arg5;
		this.anInt5317 = arg0;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lclient!za;Lclient!pm;)Z")
	public boolean method4230(@OriginalArg(0) Class117 arg0, @OriginalArg(1) Class201 arg1) {
		return this.aClass85_15 != null || this.method4236(arg0, arg1);
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lclient!za;IIIIII)V")
	public void method4231(@OriginalArg(0) Class117 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass85_15 == null) {
			return;
		}
		@Pc(10) int local10 = this.anInt5312 - arg5 & 0x3FFF;
		@Pc(17) int local17 = this.anInt5310 - arg6 & 0x3FFF;
		if (local17 > 8192) {
			local17 -= 16384;
		}
		if (local10 > 8192) {
			local10 -= 16384;
		}
		@Pc(38) int local38 = local10 * arg4 / 4096 + (arg4 - this.anInt5308) / 2;
		@Pc(51) int local51 = local17 * arg4 / -4096 + (arg3 - this.anInt5308) / 2;
		if (local38 < arg4 && local38 + this.anInt5308 > 0 && local51 < arg3 && local51 + this.anInt5308 > 0) {
			this.aClass85_15.method5405(local51 + arg1, local38 + arg2, this.anInt5308, this.anInt5308);
		}
	}

	@OriginalMember(owner = "client!pm", name = "c", descriptor = "()V")
	public void method4232() {
		this.aClass85_15 = null;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIII)Z")
	public boolean method4233(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean478) {
			this.anInt5313 = 1073741823;
			local7 = this.anInt5314;
			local12 = this.anInt5309;
			local17 = this.anInt5306;
		} else {
			local7 = this.anInt5314 - arg0;
			local12 = this.anInt5309 - arg1;
			local17 = this.anInt5306 - arg2;
			this.anInt5313 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt5313 == 0) {
				this.anInt5313 = 1;
			}
			local7 = (local7 << 8) / this.anInt5313;
			local12 = (local12 << 8) / this.anInt5313;
			local17 = (local17 << 8) / this.anInt5313;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt5308 = this.anInt5311 * arg3 / (this.aBoolean478 ? 1024 : this.anInt5313);
		} else {
			this.anInt5308 = 0;
		}
		if (this.anInt5308 < 8) {
			this.aClass85_15 = null;
			return false;
		}
		@Pc(143) int local143 = Static191.method2764(this.anInt5308);
		if (local143 > arg3) {
			local143 = Static235.method3355(arg3);
		}
		if (local143 > 512) {
			local143 = 512;
		}
		if (local143 != this.anInt5307) {
			this.anInt5307 = local143;
		}
		this.anInt5312 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 5215.189175235227D) & 0x3FFF;
		this.anInt5310 = (int) (Math.atan2((double) local7, (double) -local17) * 5215.189175235227D) & 0x3FFF;
		this.aClass85_15 = null;
		return true;
	}

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "(Lclient!za;Lclient!pm;)V")
	private void method4234(@OriginalArg(0) Class117 arg0, @OriginalArg(1) Class201 arg1) {
		Static323.method4226(arg0);
		Static323.method4229(arg0);
		arg0.MA(Static323.anIntArray392);
		arg0.ba(0, 0, this.anInt5307, this.anInt5307);
		arg0.method5665();
		arg0.P(0, 0, this.anInt5307, this.anInt5307, this.anInt5316 | 0xFF000000, 0);
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean478) {
				local31 = -arg1.anInt5314;
				local33 = -arg1.anInt5309;
				local35 = -arg1.anInt5306;
			} else {
				local31 = arg1.anInt5314 - this.anInt5314;
				local33 = arg1.anInt5309 - this.anInt5309;
				local35 = arg1.anInt5306 - this.anInt5306;
			}
		}
		@Pc(79) int local79;
		@Pc(84) int local84;
		@Pc(94) int local94;
		if (this.anInt5312 != 0) {
			local79 = Class1_Sub29.anIntArray537[this.anInt5312];
			local84 = Class1_Sub29.anIntArray536[this.anInt5312];
			local94 = local33 * local84 - local35 * local79 >> 15;
			local35 = local33 * local79 + local35 * local84 >> 15;
			local33 = local94;
		}
		if (this.anInt5310 != 0) {
			local79 = Class1_Sub29.anIntArray537[this.anInt5310];
			local84 = Class1_Sub29.anIntArray536[this.anInt5310];
			local94 = local35 * local79 + local31 * local84 >> 15;
			local35 = local35 * local84 - local31 * local79 >> 15;
			local31 = local94;
		}
		@Pc(147) Class8 local147 = Static323.aClass8_5.method5983((byte) 0, 51200, true);
		if (arg0.method5655()) {
			local147.u((short) 0, (short) this.anInt5315);
		} else {
			local147.q((short) 127, Static86.anInterface4_11.method5090(this.anInt5315).aShort16);
			local147.u((short) 0, (short) -1);
		}
		arg0.JA(1.0F);
		arg0.B(16777215, 1.0F, 1.0F, (float) local31, (float) local33, (float) local35);
		local84 = this.anInt5307 * 1024 / (local147.MA() - local147.ta());
		if (this.anInt5316 != 0) {
			local84 = local84 * 13 / 16;
		}
		arg0.GA(this.anInt5307 / 2, this.anInt5307 / 2, local84, local84);
		arg0.SA(arg0.method5717());
		@Pc(223) Class34 local223 = arg0.method5717();
		local223.U(0, 0, arg0.AA() - local147.Z());
		local147.method5999(local223, null, 1024);
		@Pc(245) int local245 = this.anInt5307 * 13 / 16;
		@Pc(252) int local252 = (this.anInt5307 - local245) / 2;
		Static323.aClass85_16.ya(local252, local252, local245, local245, 0, this.anInt5316 | 0xFF000000, 1);
		this.aClass85_15 = arg0.method5709(0, 0, this.anInt5307, this.anInt5307, true);
		arg0.method5665();
		arg0.P(0, 0, this.anInt5307, this.anInt5307, 0, 0);
		Static323.aClass85_14.ya(0, 0, this.anInt5307, this.anInt5307, 1, 0, 0);
		this.aClass85_15.oa(0, 0, 0);
		arg0.ba(Static323.anIntArray392[0], Static323.anIntArray392[1], Static323.anIntArray392[2], Static323.anIntArray392[3]);
	}

	@OriginalMember(owner = "client!pm", name = "c", descriptor = "(Lclient!za;Lclient!pm;)V")
	private void method4235(@OriginalArg(0) Class117 arg0, @OriginalArg(1) Class201 arg1) {
		@Pc(6) Class147 local6 = Static135.method1728(Static70.aClass185_77, this.anInt5315);
		if (local6 == null) {
			return;
		}
		arg0.MA(Static323.anIntArray392);
		arg0.ba(0, 0, this.anInt5307, this.anInt5307);
		arg0.P(0, 0, this.anInt5307, this.anInt5307, 0, 0);
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean478) {
				local32 = -arg1.anInt5314;
				local34 = -arg1.anInt5309;
				local36 = -arg1.anInt5306;
			} else {
				local32 = this.anInt5314 - arg1.anInt5314;
				local34 = this.anInt5309 - arg1.anInt5309;
				local36 = this.anInt5306 - arg1.anInt5306;
			}
		}
		@Pc(81) int local81;
		@Pc(85) int local85;
		@Pc(89) int local89;
		@Pc(99) int local99;
		if (this.anInt5312 != 0) {
			local81 = -this.anInt5312 & 0x3FFF;
			local85 = Class1_Sub29.anIntArray537[local81];
			local89 = Class1_Sub29.anIntArray536[local81];
			local99 = local34 * local89 - local36 * local85 >> 15;
			local36 = local34 * local85 + local36 * local89 >> 15;
			local34 = local99;
		}
		if (this.anInt5310 != 0) {
			local81 = -this.anInt5310 & 0x3FFF;
			local85 = Class1_Sub29.anIntArray537[local81];
			local89 = Class1_Sub29.anIntArray536[local81];
			local99 = local36 * local85 + local32 * local89 >> 15;
			local36 = local36 * local89 - local32 * local85 >> 15;
			local32 = local99;
		}
		arg0.JA(1.0F);
		arg0.B(16777215, 1.0F, 1.0F, (float) local32, (float) local34, (float) local36);
		@Pc(172) Class8 local172 = arg0.method5678(local6, 2048, 0, 64, 768);
		local85 = local172.MA() - local172.ta();
		local89 = local172.l() - local172.B();
		local99 = local172.ta() + local85 / 2;
		@Pc(198) int local198 = local172.B() + local89 / 2;
		@Pc(205) int local205 = local85 > local89 ? local85 : local89;
		arg0.GA(local99, local198, local205, local205);
		arg0.SA(arg0.method5717());
		@Pc(218) Class34 local218 = arg0.method5685();
		local218.U(0, 0, arg0.AA() - local172.Z());
		local172.method5999(local218, null, arg0.AA());
		this.aClass85_15 = arg0.method5709(0, 0, this.anInt5307, this.anInt5307, true);
		this.aClass85_15.oa(0, 0, 3);
		arg0.ba(Static323.anIntArray392[0], Static323.anIntArray392[1], Static323.anIntArray392[2], Static323.anIntArray392[3]);
	}

	@OriginalMember(owner = "client!pm", name = "d", descriptor = "(Lclient!za;Lclient!pm;)Z")
	private boolean method4236(@OriginalArg(0) Class117 arg0, @OriginalArg(1) Class201 arg1) {
		if (this.aClass85_15 == null) {
			if (this.anInt5317 == 0) {
				if (Static86.anInterface4_11.method5089(this.anInt5315)) {
					@Pc(23) int[] local23 = Static86.anInterface4_11.method5086(this.anInt5307, this.anInt5315, this.anInt5307, 0.7F);
					this.aClass85_15 = arg0.method5700(local23, this.anInt5307, this.anInt5307, this.anInt5307);
				}
			} else if (this.anInt5317 == 2) {
				this.method4235(arg0, arg1);
			} else if (this.anInt5317 == 1) {
				this.method4234(arg0, arg1);
			}
		}
		return this.aClass85_15 != null;
	}
}
