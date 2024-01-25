import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mc")
public final class Class157 {

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "I")
	private int anInt4365;

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "I")
	private int anInt4366;

	@OriginalMember(owner = "client!mc", name = "f", descriptor = "I")
	private int anInt4368;

	@OriginalMember(owner = "client!mc", name = "j", descriptor = "Lclient!l;")
	private Class143 aClass143_24;

	@OriginalMember(owner = "client!mc", name = "m", descriptor = "I")
	public int anInt4373;

	@OriginalMember(owner = "client!mc", name = "r", descriptor = "I")
	private int anInt4376;

	@OriginalMember(owner = "client!mc", name = "p", descriptor = "I")
	private final int anInt4375;

	@OriginalMember(owner = "client!mc", name = "h", descriptor = "I")
	private final int anInt4370;

	@OriginalMember(owner = "client!mc", name = "g", descriptor = "I")
	private final int anInt4369;

	@OriginalMember(owner = "client!mc", name = "n", descriptor = "Z")
	private final boolean aBoolean301;

	@OriginalMember(owner = "client!mc", name = "e", descriptor = "I")
	private final int anInt4367;

	@OriginalMember(owner = "client!mc", name = "o", descriptor = "I")
	private final int anInt4374;

	@OriginalMember(owner = "client!mc", name = "l", descriptor = "I")
	private final int anInt4372;

	@OriginalMember(owner = "client!mc", name = "i", descriptor = "I")
	private final int anInt4371;

	@OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(IIIIIIIZ)V")
	public Class157(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt4375 = arg2;
		this.anInt4370 = arg3;
		this.anInt4369 = arg4;
		this.aBoolean301 = arg7;
		this.anInt4367 = arg1;
		this.anInt4374 = arg6;
		this.anInt4372 = arg5;
		this.anInt4371 = arg0;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIII)Z")
	public boolean method3604(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean301) {
			this.anInt4373 = 1073741823;
			local7 = this.anInt4375;
			local12 = this.anInt4370;
			local17 = this.anInt4369;
		} else {
			local7 = this.anInt4375 - arg0;
			local12 = this.anInt4370 - arg1;
			local17 = this.anInt4369 - arg2;
			this.anInt4373 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt4373 == 0) {
				this.anInt4373 = 1;
			}
			local7 = (local7 << 8) / this.anInt4373;
			local12 = (local12 << 8) / this.anInt4373;
			local17 = (local17 << 8) / this.anInt4373;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt4368 = this.anInt4372 * arg3 / (this.aBoolean301 ? 1024 : this.anInt4373);
		} else {
			this.anInt4368 = 0;
		}
		if (this.anInt4368 < 8) {
			this.aClass143_24 = null;
			return false;
		}
		@Pc(143) int local143 = Static406.method5434(this.anInt4368);
		if (local143 > arg3) {
			local143 = Static434.method5757(arg3);
		}
		if (local143 > 512) {
			local143 = 512;
		}
		if (local143 != this.anInt4366) {
			this.anInt4366 = local143;
		}
		this.anInt4365 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 5215.189175235227D) & 0x3FFF;
		this.anInt4376 = (int) (Math.atan2((double) local7, (double) -local17) * 5215.189175235227D) & 0x3FFF;
		this.aClass143_24 = null;
		return true;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "()V")
	public void method3605() {
		this.aClass143_24 = null;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lclient!ya;IIIIII)V")
	public void method3607(@OriginalArg(0) Class39 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass143_24 == null) {
			return;
		}
		@Pc(10) int local10 = this.anInt4365 - arg5 & 0x3FFF;
		@Pc(17) int local17 = this.anInt4376 - arg6 & 0x3FFF;
		if (local17 > 8192) {
			local17 -= 16384;
		}
		if (local10 > 8192) {
			local10 -= 16384;
		}
		@Pc(38) int local38 = local10 * arg4 / 4096 + (arg4 - this.anInt4368) / 2;
		@Pc(51) int local51 = local17 * arg4 / -4096 + (arg3 - this.anInt4368) / 2;
		if (local38 < arg4 && local38 + this.anInt4368 > 0 && local51 < arg3 && local51 + this.anInt4368 > 0) {
			this.aClass143_24.method5719(local51 + arg1, local38 + arg2, this.anInt4368, this.anInt4368);
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lclient!ya;Lclient!mc;)V")
	private void method3608(@OriginalArg(0) Class39 arg0, @OriginalArg(1) Class157 arg1) {
		Static239.method3609(arg0);
		Static239.method3606(arg0);
		arg0.da(Static239.anIntArray362);
		arg0.OA(0, 0, this.anInt4366, this.anInt4366);
		arg0.method4524();
		arg0.O(0, 0, this.anInt4366, this.anInt4366, this.anInt4374 | 0xFF000000, 0);
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean301) {
				local31 = -arg1.anInt4375;
				local33 = -arg1.anInt4370;
				local35 = -arg1.anInt4369;
			} else {
				local31 = arg1.anInt4375 - this.anInt4375;
				local33 = arg1.anInt4370 - this.anInt4370;
				local35 = arg1.anInt4369 - this.anInt4369;
			}
		}
		@Pc(79) int local79;
		@Pc(84) int local84;
		@Pc(94) int local94;
		if (this.anInt4365 != 0) {
			local79 = Class183.anIntArray433[this.anInt4365];
			local84 = Class183.anIntArray434[this.anInt4365];
			local94 = local33 * local84 - local35 * local79 >> 15;
			local35 = local33 * local79 + local35 * local84 >> 15;
			local33 = local94;
		}
		if (this.anInt4376 != 0) {
			local79 = Class183.anIntArray433[this.anInt4376];
			local84 = Class183.anIntArray434[this.anInt4376];
			local94 = local35 * local79 + local31 * local84 >> 15;
			local35 = local35 * local84 - local31 * local79 >> 15;
			local31 = local94;
		}
		@Pc(147) Class105 local147 = Static239.aClass105_5.method3548((byte) 0, 51200, true);
		if (arg0.method4535()) {
			local147.I((short) 0, (short) this.anInt4367);
		} else {
			local147.BA((short) 127, Static301.anInterface4_11.method2450(this.anInt4367).aShort75);
			local147.I((short) 0, (short) -1);
		}
		arg0.B(1.0F);
		arg0.T(16777215, 1.0F, 1.0F, (float) local31, (float) local33, (float) local35);
		local84 = this.anInt4366 * 1024 / (local147.NA() - local147.HA());
		if (this.anInt4374 != 0) {
			local84 = local84 * 13 / 16;
		}
		arg0.H(this.anInt4366 / 2, this.anInt4366 / 2, local84, local84);
		arg0.ea(arg0.method4512());
		@Pc(223) Class33 local223 = arg0.method4512();
		local223.j(0, 0, arg0.a() - local147.PA());
		local147.method3546(local223, null, 1024);
		@Pc(245) int local245 = this.anInt4366 * 13 / 16;
		@Pc(252) int local252 = (this.anInt4366 - local245) / 2;
		Static239.aClass143_26.s(local252, local252, local245, local245, 0, this.anInt4374 | 0xFF000000, 1);
		this.aClass143_24 = arg0.method4495(0, 0, this.anInt4366, this.anInt4366, true);
		arg0.method4524();
		arg0.O(0, 0, this.anInt4366, this.anInt4366, 0, 0);
		Static239.aClass143_25.s(0, 0, this.anInt4366, this.anInt4366, 1, 0, 0);
		this.aClass143_24.BA(0, 0, 0);
		arg0.OA(Static239.anIntArray362[0], Static239.anIntArray362[1], Static239.anIntArray362[2], Static239.anIntArray362[3]);
	}

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(Lclient!ya;Lclient!mc;)Z")
	public boolean method3611(@OriginalArg(0) Class39 arg0, @OriginalArg(1) Class157 arg1) {
		return this.aClass143_24 != null || this.method3612(arg0, arg1);
	}

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "(Lclient!ya;Lclient!mc;)Z")
	private boolean method3612(@OriginalArg(0) Class39 arg0, @OriginalArg(1) Class157 arg1) {
		if (this.aClass143_24 == null) {
			if (this.anInt4371 == 0) {
				if (Static301.anInterface4_11.method2454(this.anInt4367)) {
					@Pc(23) int[] local23 = Static301.anInterface4_11.method2452(this.anInt4367, this.anInt4366, this.anInt4366, 0.7F);
					this.aClass143_24 = arg0.method4554(local23, this.anInt4366, this.anInt4366, this.anInt4366);
				}
			} else if (this.anInt4371 == 2) {
				this.method3614(arg0, arg1);
			} else if (this.anInt4371 == 1) {
				this.method3608(arg0, arg1);
			}
		}
		return this.aClass143_24 != null;
	}

	@OriginalMember(owner = "client!mc", name = "d", descriptor = "(Lclient!ya;Lclient!mc;)V")
	private void method3614(@OriginalArg(0) Class39 arg0, @OriginalArg(1) Class157 arg1) {
		@Pc(6) Class236 local6 = Static74.method1492(this.anInt4367, Static341.aClass246_184);
		if (local6 == null) {
			return;
		}
		arg0.da(Static239.anIntArray362);
		arg0.OA(0, 0, this.anInt4366, this.anInt4366);
		arg0.O(0, 0, this.anInt4366, this.anInt4366, 0, 0);
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean301) {
				local32 = -arg1.anInt4375;
				local34 = -arg1.anInt4370;
				local36 = -arg1.anInt4369;
			} else {
				local32 = this.anInt4375 - arg1.anInt4375;
				local34 = this.anInt4370 - arg1.anInt4370;
				local36 = this.anInt4369 - arg1.anInt4369;
			}
		}
		@Pc(81) int local81;
		@Pc(85) int local85;
		@Pc(89) int local89;
		@Pc(99) int local99;
		if (this.anInt4365 != 0) {
			local81 = -this.anInt4365 & 0x3FFF;
			local85 = Class183.anIntArray433[local81];
			local89 = Class183.anIntArray434[local81];
			local99 = local34 * local89 - local36 * local85 >> 15;
			local36 = local34 * local85 + local36 * local89 >> 15;
			local34 = local99;
		}
		if (this.anInt4376 != 0) {
			local81 = -this.anInt4376 & 0x3FFF;
			local85 = Class183.anIntArray433[local81];
			local89 = Class183.anIntArray434[local81];
			local99 = local36 * local85 + local32 * local89 >> 15;
			local36 = local36 * local89 - local32 * local85 >> 15;
			local32 = local99;
		}
		arg0.B(1.0F);
		arg0.T(16777215, 1.0F, 1.0F, (float) local32, (float) local34, (float) local36);
		@Pc(172) Class105 local172 = arg0.method4540(local6, 2048, 0, 64, 768);
		local85 = local172.NA() - local172.HA();
		local89 = local172.WA() - local172.MA();
		local99 = local172.HA() + local85 / 2;
		@Pc(198) int local198 = local172.MA() + local89 / 2;
		@Pc(205) int local205 = local85 > local89 ? local85 : local89;
		arg0.H(local99, local198, local205, local205);
		arg0.ea(arg0.method4512());
		@Pc(218) Class33 local218 = arg0.method4516();
		local218.j(0, 0, arg0.a() - local172.PA());
		local172.method3546(local218, null, arg0.a());
		this.aClass143_24 = arg0.method4495(0, 0, this.anInt4366, this.anInt4366, true);
		this.aClass143_24.BA(0, 0, 3);
		arg0.OA(Static239.anIntArray362[0], Static239.anIntArray362[1], Static239.anIntArray362[2], Static239.anIntArray362[3]);
	}
}
