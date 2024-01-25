import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tt")
public final class Class243 {

	@OriginalMember(owner = "client!tt", name = "d", descriptor = "I")
	private int anInt6426;

	@OriginalMember(owner = "client!tt", name = "g", descriptor = "I")
	private int anInt6428;

	@OriginalMember(owner = "client!tt", name = "j", descriptor = "I")
	private int anInt6431;

	@OriginalMember(owner = "client!tt", name = "n", descriptor = "I")
	private int anInt6433;

	@OriginalMember(owner = "client!tt", name = "p", descriptor = "I")
	public int anInt6435;

	@OriginalMember(owner = "client!tt", name = "r", descriptor = "Lclient!l;")
	private Class95 aClass95_22;

	@OriginalMember(owner = "client!tt", name = "h", descriptor = "I")
	private final int anInt6429;

	@OriginalMember(owner = "client!tt", name = "o", descriptor = "I")
	private final int anInt6434;

	@OriginalMember(owner = "client!tt", name = "i", descriptor = "I")
	private final int anInt6430;

	@OriginalMember(owner = "client!tt", name = "f", descriptor = "Z")
	private final boolean aBoolean446;

	@OriginalMember(owner = "client!tt", name = "c", descriptor = "I")
	private final int anInt6425;

	@OriginalMember(owner = "client!tt", name = "b", descriptor = "I")
	private final int anInt6424;

	@OriginalMember(owner = "client!tt", name = "l", descriptor = "I")
	private final int anInt6432;

	@OriginalMember(owner = "client!tt", name = "e", descriptor = "I")
	private final int anInt6427;

	@OriginalMember(owner = "client!tt", name = "<init>", descriptor = "(IIIIIIIZ)V")
	public Class243(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt6429 = arg2;
		this.anInt6434 = arg3;
		this.anInt6430 = arg4;
		this.aBoolean446 = arg7;
		this.anInt6425 = arg1;
		this.anInt6424 = arg6;
		this.anInt6432 = arg5;
		this.anInt6427 = arg0;
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lclient!ya;Lclient!tt;)V")
	private void method5201(@OriginalArg(0) Class135 arg0, @OriginalArg(1) Class243 arg1) {
		@Pc(6) Class166 local6 = Static305.method3992(this.anInt6425, Static210.aClass211_57);
		if (local6 == null) {
			return;
		}
		arg0.da(Static395.anIntArray506);
		arg0.OA(0, 0, this.anInt6426, this.anInt6426);
		arg0.O(0, 0, this.anInt6426, this.anInt6426, 0, 0);
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean446) {
				local32 = -arg1.anInt6429;
				local34 = -arg1.anInt6434;
				local36 = -arg1.anInt6430;
			} else {
				local32 = this.anInt6429 - arg1.anInt6429;
				local34 = this.anInt6434 - arg1.anInt6434;
				local36 = this.anInt6430 - arg1.anInt6430;
			}
		}
		@Pc(81) int local81;
		@Pc(85) int local85;
		@Pc(89) int local89;
		@Pc(99) int local99;
		if (this.anInt6433 != 0) {
			local81 = -this.anInt6433 & 0x3FFF;
			local85 = Class100.anIntArray206[local81];
			local89 = Class100.anIntArray208[local81];
			local99 = local34 * local89 - local36 * local85 >> 15;
			local36 = local34 * local85 + local36 * local89 >> 15;
			local34 = local99;
		}
		if (this.anInt6428 != 0) {
			local81 = -this.anInt6428 & 0x3FFF;
			local85 = Class100.anIntArray206[local81];
			local89 = Class100.anIntArray208[local81];
			local99 = local36 * local85 + local32 * local89 >> 15;
			local36 = local36 * local89 - local32 * local85 >> 15;
			local32 = local99;
		}
		arg0.B(1.0F);
		arg0.T(16777215, 1.0F, 1.0F, (float) local32, (float) local34, (float) local36);
		@Pc(172) Class116 local172 = arg0.method5391(local6, 2048, 0, 64, 768);
		local85 = local172.NA() - local172.HA();
		local89 = local172.WA() - local172.MA();
		local99 = local172.HA() + local85 / 2;
		@Pc(198) int local198 = local172.MA() + local89 / 2;
		@Pc(205) int local205 = local85 > local89 ? local85 : local89;
		arg0.H(local99, local198, local205, local205);
		arg0.ea(arg0.method5400());
		@Pc(218) Class35 local218 = arg0.method5398();
		local218.j(0, 0, arg0.a() - local172.PA());
		local172.method3104(local218, null, arg0.a());
		this.aClass95_22 = arg0.method5349(0, 0, this.anInt6426, this.anInt6426, true);
		this.aClass95_22.BA(0, 0, 3);
		arg0.OA(Static395.anIntArray506[0], Static395.anIntArray506[1], Static395.anIntArray506[2], Static395.anIntArray506[3]);
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lclient!ya;IIIIII)V")
	public void method5203(@OriginalArg(0) Class135 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass95_22 == null) {
			return;
		}
		@Pc(10) int local10 = this.anInt6433 - arg5 & 0x3FFF;
		@Pc(17) int local17 = this.anInt6428 - arg6 & 0x3FFF;
		if (local17 > 8192) {
			local17 -= 16384;
		}
		if (local10 > 8192) {
			local10 -= 16384;
		}
		@Pc(38) int local38 = local10 * arg4 / 4096 + (arg4 - this.anInt6431) / 2;
		@Pc(51) int local51 = local17 * arg4 / -4096 + (arg3 - this.anInt6431) / 2;
		if (local38 < arg4 && local38 + this.anInt6431 > 0 && local51 < arg3 && local51 + this.anInt6431 > 0) {
			this.aClass95_22.method5819(local51 + arg1, local38 + arg2, this.anInt6431, this.anInt6431);
		}
	}

	@OriginalMember(owner = "client!tt", name = "b", descriptor = "(Lclient!ya;Lclient!tt;)Z")
	public boolean method5204(@OriginalArg(0) Class135 arg0, @OriginalArg(1) Class243 arg1) {
		return this.aClass95_22 != null || this.method5209(arg0, arg1);
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(IIII)Z")
	public boolean method5205(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean446) {
			this.anInt6435 = 1073741823;
			local7 = this.anInt6429;
			local12 = this.anInt6434;
			local17 = this.anInt6430;
		} else {
			local7 = this.anInt6429 - arg0;
			local12 = this.anInt6434 - arg1;
			local17 = this.anInt6430 - arg2;
			this.anInt6435 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt6435 == 0) {
				this.anInt6435 = 1;
			}
			local7 = (local7 << 8) / this.anInt6435;
			local12 = (local12 << 8) / this.anInt6435;
			local17 = (local17 << 8) / this.anInt6435;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt6431 = this.anInt6432 * arg3 / (this.aBoolean446 ? 1024 : this.anInt6435);
		} else {
			this.anInt6431 = 0;
		}
		if (this.anInt6431 < 8) {
			this.aClass95_22 = null;
			return false;
		}
		@Pc(143) int local143 = Static171.method2382(this.anInt6431);
		if (local143 > arg3) {
			local143 = Static359.method4736(arg3);
		}
		if (local143 > 512) {
			local143 = 512;
		}
		if (local143 != this.anInt6426) {
			this.anInt6426 = local143;
		}
		this.anInt6433 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 5215.189175235227D) & 0x3FFF;
		this.anInt6428 = (int) (Math.atan2((double) local7, (double) -local17) * 5215.189175235227D) & 0x3FFF;
		this.aClass95_22 = null;
		return true;
	}

	@OriginalMember(owner = "client!tt", name = "c", descriptor = "(Lclient!ya;Lclient!tt;)Z")
	private boolean method5209(@OriginalArg(0) Class135 arg0, @OriginalArg(1) Class243 arg1) {
		if (this.aClass95_22 == null) {
			if (this.anInt6427 == 0) {
				if (Static60.anInterface5_1.method4075(this.anInt6425)) {
					@Pc(23) int[] local23 = Static60.anInterface5_1.method4077(this.anInt6426, 0.7F, this.anInt6426, this.anInt6425);
					this.aClass95_22 = arg0.method5351(local23, this.anInt6426, this.anInt6426, this.anInt6426);
				}
			} else if (this.anInt6427 == 2) {
				this.method5201(arg0, arg1);
			} else if (this.anInt6427 == 1) {
				this.method5210(arg0, arg1);
			}
		}
		return this.aClass95_22 != null;
	}

	@OriginalMember(owner = "client!tt", name = "d", descriptor = "(Lclient!ya;Lclient!tt;)V")
	private void method5210(@OriginalArg(0) Class135 arg0, @OriginalArg(1) Class243 arg1) {
		Static395.method5202(arg0);
		Static395.method5206(arg0);
		arg0.da(Static395.anIntArray506);
		arg0.OA(0, 0, this.anInt6426, this.anInt6426);
		arg0.method5395();
		arg0.O(0, 0, this.anInt6426, this.anInt6426, this.anInt6424 | 0xFF000000, 0);
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean446) {
				local31 = -arg1.anInt6429;
				local33 = -arg1.anInt6434;
				local35 = -arg1.anInt6430;
			} else {
				local31 = arg1.anInt6429 - this.anInt6429;
				local33 = arg1.anInt6434 - this.anInt6434;
				local35 = arg1.anInt6430 - this.anInt6430;
			}
		}
		@Pc(79) int local79;
		@Pc(84) int local84;
		@Pc(94) int local94;
		if (this.anInt6433 != 0) {
			local79 = Class100.anIntArray206[this.anInt6433];
			local84 = Class100.anIntArray208[this.anInt6433];
			local94 = local33 * local84 - local35 * local79 >> 15;
			local35 = local33 * local79 + local35 * local84 >> 15;
			local33 = local94;
		}
		if (this.anInt6428 != 0) {
			local79 = Class100.anIntArray206[this.anInt6428];
			local84 = Class100.anIntArray208[this.anInt6428];
			local94 = local35 * local79 + local31 * local84 >> 15;
			local35 = local35 * local84 - local31 * local79 >> 15;
			local31 = local94;
		}
		@Pc(147) Class116 local147 = Static395.aClass116_7.method3123((byte) 0, 51200, true);
		if (arg0.method5390()) {
			local147.I((short) 0, (short) this.anInt6425);
		} else {
			local147.BA((short) 127, Static60.anInterface5_1.method4079(this.anInt6425).aShort41);
			local147.I((short) 0, (short) -1);
		}
		arg0.B(1.0F);
		arg0.T(16777215, 1.0F, 1.0F, (float) local31, (float) local33, (float) local35);
		local84 = this.anInt6426 * 1024 / (local147.NA() - local147.HA());
		if (this.anInt6424 != 0) {
			local84 = local84 * 13 / 16;
		}
		arg0.H(this.anInt6426 / 2, this.anInt6426 / 2, local84, local84);
		arg0.ea(arg0.method5400());
		@Pc(223) Class35 local223 = arg0.method5400();
		local223.j(0, 0, arg0.a() - local147.PA());
		local147.method3104(local223, null, 1024);
		@Pc(245) int local245 = this.anInt6426 * 13 / 16;
		@Pc(252) int local252 = (this.anInt6426 - local245) / 2;
		Static395.aClass95_20.s(local252, local252, local245, local245, 0, this.anInt6424 | 0xFF000000, 1);
		this.aClass95_22 = arg0.method5349(0, 0, this.anInt6426, this.anInt6426, true);
		arg0.method5395();
		arg0.O(0, 0, this.anInt6426, this.anInt6426, 0, 0);
		Static395.aClass95_21.s(0, 0, this.anInt6426, this.anInt6426, 1, 0, 0);
		this.aClass95_22.BA(0, 0, 0);
		arg0.OA(Static395.anIntArray506[0], Static395.anIntArray506[1], Static395.anIntArray506[2], Static395.anIntArray506[3]);
	}

	@OriginalMember(owner = "client!tt", name = "c", descriptor = "()V")
	public void method5211() {
		this.aClass95_22 = null;
	}
}
