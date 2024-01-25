import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lp")
public final class Class144 {

	@OriginalMember(owner = "client!lp", name = "d", descriptor = "I")
	private int anInt4471;

	@OriginalMember(owner = "client!lp", name = "e", descriptor = "I")
	private int anInt4472;

	@OriginalMember(owner = "client!lp", name = "h", descriptor = "I")
	private int anInt4474;

	@OriginalMember(owner = "client!lp", name = "l", descriptor = "I")
	public int anInt4478;

	@OriginalMember(owner = "client!lp", name = "m", descriptor = "Lclient!f;")
	private Class8 aClass8_17;

	@OriginalMember(owner = "client!lp", name = "n", descriptor = "I")
	private int anInt4479;

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "I")
	private final int anInt4470;

	@OriginalMember(owner = "client!lp", name = "i", descriptor = "I")
	private final int anInt4475;

	@OriginalMember(owner = "client!lp", name = "g", descriptor = "I")
	private final int anInt4473;

	@OriginalMember(owner = "client!lp", name = "f", descriptor = "Z")
	private final boolean aBoolean387;

	@OriginalMember(owner = "client!lp", name = "k", descriptor = "I")
	private final int anInt4477;

	@OriginalMember(owner = "client!lp", name = "j", descriptor = "I")
	private final int anInt4476;

	@OriginalMember(owner = "client!lp", name = "o", descriptor = "I")
	private final int anInt4480;

	@OriginalMember(owner = "client!lp", name = "p", descriptor = "I")
	private final int anInt4481;

	@OriginalMember(owner = "client!lp", name = "<init>", descriptor = "(IIIIIIIZ)V")
	public Class144(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt4470 = arg2;
		this.anInt4475 = arg3;
		this.anInt4473 = arg4;
		this.aBoolean387 = arg7;
		this.anInt4477 = arg1;
		this.anInt4476 = arg6;
		this.anInt4480 = arg5;
		this.anInt4481 = arg0;
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(Lclient!qa;Lclient!lp;)Z")
	private boolean method3545(@OriginalArg(0) Class172 arg0, @OriginalArg(1) Class144 arg1) {
		if (this.aClass8_17 == null) {
			if (this.anInt4481 == 0) {
				if (Static265.anInterface5_5.method3921(this.anInt4477)) {
					@Pc(23) int[] local23 = Static265.anInterface5_5.method3919(this.anInt4477, this.anInt4472, 0.7F, this.anInt4472);
					this.aClass8_17 = arg0.method5478(local23, this.anInt4472, this.anInt4472, this.anInt4472);
				}
			} else if (this.anInt4481 == 2) {
				this.method3549(arg0, arg1);
			} else if (this.anInt4481 == 1) {
				this.method3552(arg0, arg1);
			}
		}
		return this.aClass8_17 != null;
	}

	@OriginalMember(owner = "client!lp", name = "b", descriptor = "(Lclient!qa;Lclient!lp;)Z")
	public boolean method3548(@OriginalArg(0) Class172 arg0, @OriginalArg(1) Class144 arg1) {
		return this.aClass8_17 != null || this.method3545(arg0, arg1);
	}

	@OriginalMember(owner = "client!lp", name = "c", descriptor = "(Lclient!qa;Lclient!lp;)V")
	private void method3549(@OriginalArg(0) Class172 arg0, @OriginalArg(1) Class144 arg1) {
		@Pc(6) Class161 local6 = Static302.method4236(Static32.aClass32_10, this.anInt4477);
		if (local6 == null) {
			return;
		}
		arg0.u(Static234.anIntArray292);
		arg0.pa(0, 0, this.anInt4472, this.anInt4472);
		arg0.NA(0, 0, this.anInt4472, this.anInt4472, 0, 0);
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean387) {
				local32 = -arg1.anInt4470;
				local34 = -arg1.anInt4475;
				local36 = -arg1.anInt4473;
			} else {
				local32 = this.anInt4470 - arg1.anInt4470;
				local34 = this.anInt4475 - arg1.anInt4475;
				local36 = this.anInt4473 - arg1.anInt4473;
			}
		}
		@Pc(81) int local81;
		@Pc(85) int local85;
		@Pc(89) int local89;
		@Pc(99) int local99;
		if (this.anInt4479 != 0) {
			local81 = -this.anInt4479 & 0x3FFF;
			local85 = Class3_Sub2_Sub17.anIntArray289[local81];
			local89 = Class3_Sub2_Sub17.anIntArray290[local81];
			local99 = local34 * local89 - local36 * local85 >> 15;
			local36 = local34 * local85 + local36 * local89 >> 15;
			local34 = local99;
		}
		if (this.anInt4474 != 0) {
			local81 = -this.anInt4474 & 0x3FFF;
			local85 = Class3_Sub2_Sub17.anIntArray289[local81];
			local89 = Class3_Sub2_Sub17.anIntArray290[local81];
			local99 = local36 * local85 + local32 * local89 >> 15;
			local36 = local36 * local89 - local32 * local85 >> 15;
			local32 = local99;
		}
		arg0.ua(1.0F);
		arg0.XA(16777215, 1.0F, 1.0F, (float) local32, (float) local34, (float) local36);
		@Pc(172) Class9 local172 = arg0.method5537(local6, 2048, 0, 64, 768);
		local85 = local172.VA() - local172.la();
		local89 = local172.E() - local172.b();
		local99 = local172.la() + local85 / 2;
		@Pc(198) int local198 = local172.b() + local89 / 2;
		@Pc(205) int local205 = local85 > local89 ? local85 : local89;
		arg0.GA(local99, local198, local205, local205);
		arg0.m(arg0.method5524());
		@Pc(218) Class107 local218 = arg0.method5495();
		local218.R(0, 0, arg0.d() - local172.X());
		local172.method5683(local218, null, arg0.d());
		this.aClass8_17 = arg0.method5481(0, 0, this.anInt4472, this.anInt4472, true);
		this.aClass8_17.V(0, 0, 3);
		arg0.pa(Static234.anIntArray292[0], Static234.anIntArray292[1], Static234.anIntArray292[2], Static234.anIntArray292[3]);
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(IIII)Z")
	public boolean method3550(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean387) {
			this.anInt4478 = 1073741823;
			local7 = this.anInt4470;
			local12 = this.anInt4475;
			local17 = this.anInt4473;
		} else {
			local7 = this.anInt4470 - arg0;
			local12 = this.anInt4475 - arg1;
			local17 = this.anInt4473 - arg2;
			this.anInt4478 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt4478 == 0) {
				this.anInt4478 = 1;
			}
			local7 = (local7 << 8) / this.anInt4478;
			local12 = (local12 << 8) / this.anInt4478;
			local17 = (local17 << 8) / this.anInt4478;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt4471 = this.anInt4480 * arg3 / (this.aBoolean387 ? 1024 : this.anInt4478);
		} else {
			this.anInt4471 = 0;
		}
		if (this.anInt4471 < 8) {
			this.aClass8_17 = null;
			return false;
		}
		@Pc(143) int local143 = Static288.method4088(this.anInt4471);
		if (local143 > arg3) {
			local143 = Static102.method1790(arg3);
		}
		if (local143 > 512) {
			local143 = 512;
		}
		if (local143 != this.anInt4472) {
			this.anInt4472 = local143;
		}
		this.anInt4479 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 5215.189175235227D) & 0x3FFF;
		this.anInt4474 = (int) (Math.atan2((double) local7, (double) -local17) * 5215.189175235227D) & 0x3FFF;
		this.aClass8_17 = null;
		return true;
	}

	@OriginalMember(owner = "client!lp", name = "c", descriptor = "()V")
	public void method3551() {
		this.aClass8_17 = null;
	}

	@OriginalMember(owner = "client!lp", name = "d", descriptor = "(Lclient!qa;Lclient!lp;)V")
	private void method3552(@OriginalArg(0) Class172 arg0, @OriginalArg(1) Class144 arg1) {
		Static234.method3553(arg0);
		Static234.method3546(arg0);
		arg0.u(Static234.anIntArray292);
		arg0.pa(0, 0, this.anInt4472, this.anInt4472);
		arg0.method5518();
		arg0.NA(0, 0, this.anInt4472, this.anInt4472, this.anInt4476 | 0xFF000000, 0);
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean387) {
				local31 = -arg1.anInt4470;
				local33 = -arg1.anInt4475;
				local35 = -arg1.anInt4473;
			} else {
				local31 = arg1.anInt4470 - this.anInt4470;
				local33 = arg1.anInt4475 - this.anInt4475;
				local35 = arg1.anInt4473 - this.anInt4473;
			}
		}
		@Pc(79) int local79;
		@Pc(84) int local84;
		@Pc(94) int local94;
		if (this.anInt4479 != 0) {
			local79 = Class3_Sub2_Sub17.anIntArray289[this.anInt4479];
			local84 = Class3_Sub2_Sub17.anIntArray290[this.anInt4479];
			local94 = local33 * local84 - local35 * local79 >> 15;
			local35 = local33 * local79 + local35 * local84 >> 15;
			local33 = local94;
		}
		if (this.anInt4474 != 0) {
			local79 = Class3_Sub2_Sub17.anIntArray289[this.anInt4474];
			local84 = Class3_Sub2_Sub17.anIntArray290[this.anInt4474];
			local94 = local35 * local79 + local31 * local84 >> 15;
			local35 = local35 * local84 - local31 * local79 >> 15;
			local31 = local94;
		}
		@Pc(147) Class9 local147 = Static234.aClass9_5.method5699((byte) 0, 51200, true);
		if (arg0.method5482()) {
			local147.YA((short) 0, (short) this.anInt4477);
		} else {
			local147.N((short) 127, Static265.anInterface5_5.method3918(this.anInt4477).aShort47);
			local147.YA((short) 0, (short) -1);
		}
		arg0.ua(1.0F);
		arg0.XA(16777215, 1.0F, 1.0F, (float) local31, (float) local33, (float) local35);
		local84 = this.anInt4472 * 1024 / (local147.VA() - local147.la());
		if (this.anInt4476 != 0) {
			local84 = local84 * 13 / 16;
		}
		arg0.GA(this.anInt4472 / 2, this.anInt4472 / 2, local84, local84);
		arg0.m(arg0.method5524());
		@Pc(223) Class107 local223 = arg0.method5524();
		local223.R(0, 0, arg0.d() - local147.X());
		local147.method5683(local223, null, 1024);
		@Pc(245) int local245 = this.anInt4472 * 13 / 16;
		@Pc(252) int local252 = (this.anInt4472 - local245) / 2;
		Static234.aClass8_18.M(local252, local252, local245, local245, 0, this.anInt4476 | 0xFF000000, 1);
		this.aClass8_17 = arg0.method5481(0, 0, this.anInt4472, this.anInt4472, true);
		arg0.method5518();
		arg0.NA(0, 0, this.anInt4472, this.anInt4472, 0, 0);
		Static234.aClass8_16.M(0, 0, this.anInt4472, this.anInt4472, 1, 0, 0);
		this.aClass8_17.V(0, 0, 0);
		arg0.pa(Static234.anIntArray292[0], Static234.anIntArray292[1], Static234.anIntArray292[2], Static234.anIntArray292[3]);
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(Lclient!qa;IIIIII)V")
	public void method3554(@OriginalArg(0) Class172 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass8_17 == null) {
			return;
		}
		@Pc(10) int local10 = this.anInt4479 - arg5 & 0x3FFF;
		@Pc(17) int local17 = this.anInt4474 - arg6 & 0x3FFF;
		if (local17 > 8192) {
			local17 -= 16384;
		}
		if (local10 > 8192) {
			local10 -= 16384;
		}
		@Pc(38) int local38 = local10 * arg4 / 4096 + (arg4 - this.anInt4471) / 2;
		@Pc(51) int local51 = local17 * arg4 / -4096 + (arg3 - this.anInt4471) / 2;
		if (local38 < arg4 && local38 + this.anInt4471 > 0 && local51 < arg3 && local51 + this.anInt4471 > 0) {
			this.aClass8_17.method5999(local51 + arg1, local38 + arg2, this.anInt4471, this.anInt4471);
		}
	}
}
