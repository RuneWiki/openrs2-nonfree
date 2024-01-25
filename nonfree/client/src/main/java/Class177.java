import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rp")
public final class Class177 {

	@OriginalMember(owner = "client!rp", name = "b", descriptor = "Lclient!l;")
	private Class57 aClass57_17;

	@OriginalMember(owner = "client!rp", name = "c", descriptor = "I")
	private int anInt5486;

	@OriginalMember(owner = "client!rp", name = "f", descriptor = "I")
	private int anInt5488;

	@OriginalMember(owner = "client!rp", name = "j", descriptor = "I")
	private int anInt5491;

	@OriginalMember(owner = "client!rp", name = "k", descriptor = "I")
	private int anInt5492;

	@OriginalMember(owner = "client!rp", name = "o", descriptor = "I")
	public int anInt5495;

	@OriginalMember(owner = "client!rp", name = "h", descriptor = "I")
	private final int anInt5489;

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "I")
	private final int anInt5485;

	@OriginalMember(owner = "client!rp", name = "p", descriptor = "I")
	private final int anInt5496;

	@OriginalMember(owner = "client!rp", name = "g", descriptor = "Z")
	private final boolean aBoolean344;

	@OriginalMember(owner = "client!rp", name = "m", descriptor = "I")
	private final int anInt5494;

	@OriginalMember(owner = "client!rp", name = "i", descriptor = "I")
	private final int anInt5490;

	@OriginalMember(owner = "client!rp", name = "e", descriptor = "I")
	private final int anInt5487;

	@OriginalMember(owner = "client!rp", name = "l", descriptor = "I")
	private final int anInt5493;

	@OriginalMember(owner = "client!rp", name = "<init>", descriptor = "(IIIIIIIZ)V")
	public Class177(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt5489 = arg2;
		this.anInt5485 = arg3;
		this.anInt5496 = arg4;
		this.aBoolean344 = arg7;
		this.anInt5494 = arg1;
		this.anInt5490 = arg6;
		this.anInt5487 = arg5;
		this.anInt5493 = arg0;
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(Lclient!tj;Lclient!rp;)V")
	private void method4612(@OriginalArg(0) Class122 arg0, @OriginalArg(1) Class177 arg1) {
		@Pc(6) Class40 local6 = Static26.method559(Static136.aClass100_62, this.anInt5494);
		if (local6 == null) {
			return;
		}
		arg0.method4796(Static275.anIntArray437);
		arg0.method4768(0, 0, this.anInt5491, this.anInt5491);
		arg0.method4732(0, 0, this.anInt5491, this.anInt5491, 0, 0);
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean344) {
				local32 = -arg1.anInt5489;
				local34 = -arg1.anInt5485;
				local36 = -arg1.anInt5496;
			} else {
				local32 = this.anInt5489 - arg1.anInt5489;
				local34 = this.anInt5485 - arg1.anInt5485;
				local36 = this.anInt5496 - arg1.anInt5496;
			}
		}
		@Pc(81) int local81;
		@Pc(85) int local85;
		@Pc(89) int local89;
		@Pc(99) int local99;
		if (this.anInt5486 != 0) {
			local81 = -this.anInt5486 & 0x3FFF;
			local85 = Class19.anIntArray20[local81];
			local89 = Class19.anIntArray21[local81];
			local99 = local34 * local89 - local36 * local85 >> 15;
			local36 = local34 * local85 + local36 * local89 >> 15;
			local34 = local99;
		}
		if (this.anInt5492 != 0) {
			local81 = -this.anInt5492 & 0x3FFF;
			local85 = Class19.anIntArray20[local81];
			local89 = Class19.anIntArray21[local81];
			local99 = local36 * local85 + local32 * local89 >> 15;
			local36 = local36 * local89 - local32 * local85 >> 15;
			local32 = local99;
		}
		arg0.method4752(1.0F);
		arg0.method4784(16777215, 1.0F, 1.0F, (float) local32, (float) local34, (float) local36);
		@Pc(172) Class124 local172 = arg0.method4794(local6, 1024, 0, 64, 768);
		local85 = local172.method4093() - local172.method4087();
		local89 = local172.method4089() - local172.method4106();
		local99 = local172.method4087() + local85 / 2;
		@Pc(198) int local198 = local172.method4106() + local89 / 2;
		@Pc(205) int local205 = local85 > local89 ? local85 : local89;
		arg0.method4772(local99, local198, local205, local205);
		arg0.method4785(arg0.method4743());
		@Pc(218) Class56 local218 = arg0.method4739();
		local218.method4683(0, 0, arg0.method4795() - local172.method4119());
		local172.method4098(local218, null, arg0.method4795());
		this.aClass57_17 = arg0.method4731(0, 0, this.anInt5491, this.anInt5491, true);
		this.aClass57_17.method5445(3);
		arg0.method4768(Static275.anIntArray437[0], Static275.anIntArray437[1], Static275.anIntArray437[2], Static275.anIntArray437[3]);
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(IIII)Z")
	public boolean method4614(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean344) {
			this.anInt5495 = 1073741823;
			local7 = this.anInt5489;
			local12 = this.anInt5485;
			local17 = this.anInt5496;
		} else {
			local7 = this.anInt5489 - arg0;
			local12 = this.anInt5485 - arg1;
			local17 = this.anInt5496 - arg2;
			this.anInt5495 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt5495 == 0) {
				this.anInt5495 = 1;
			}
			local7 = (local7 << 8) / this.anInt5495;
			local12 = (local12 << 8) / this.anInt5495;
			local17 = (local17 << 8) / this.anInt5495;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt5488 = this.anInt5487 * arg3 / (this.aBoolean344 ? 1024 : this.anInt5495);
		} else {
			this.anInt5488 = 0;
		}
		if (this.anInt5488 < 8) {
			this.aClass57_17 = null;
			return false;
		}
		@Pc(143) int local143 = Static83.method1300(this.anInt5488);
		if (local143 > arg3) {
			local143 = Static89.method5618(arg3);
		}
		if (local143 > 512) {
			local143 = 512;
		}
		if (local143 != this.anInt5491) {
			this.anInt5491 = local143;
		}
		this.anInt5486 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 5215.189175235227D) & 0x3FFF;
		this.anInt5492 = (int) (Math.atan2((double) local7, (double) -local17) * 5215.189175235227D) & 0x3FFF;
		this.aClass57_17 = null;
		return true;
	}

	@OriginalMember(owner = "client!rp", name = "b", descriptor = "()V")
	public void method4615() {
		this.aClass57_17 = null;
	}

	@OriginalMember(owner = "client!rp", name = "b", descriptor = "(Lclient!tj;Lclient!rp;)Z")
	public boolean method4616(@OriginalArg(0) Class122 arg0, @OriginalArg(1) Class177 arg1) {
		return this.aClass57_17 != null || this.method4617(arg0, arg1);
	}

	@OriginalMember(owner = "client!rp", name = "c", descriptor = "(Lclient!tj;Lclient!rp;)Z")
	private boolean method4617(@OriginalArg(0) Class122 arg0, @OriginalArg(1) Class177 arg1) {
		if (this.aClass57_17 == null) {
			if (this.anInt5493 == 0) {
				if (Static123.anInterface9_2.method2394(this.anInt5494)) {
					@Pc(23) int[] local23 = Static123.anInterface9_2.method2392(this.anInt5491, this.anInt5491, this.anInt5494, 0.7F);
					this.aClass57_17 = arg0.method4762(local23, this.anInt5491, this.anInt5491, this.anInt5491);
				}
			} else if (this.anInt5493 == 2) {
				this.method4612(arg0, arg1);
			} else if (this.anInt5493 == 1) {
				this.method4620(arg0, arg1);
			}
		}
		return this.aClass57_17 != null;
	}

	@OriginalMember(owner = "client!rp", name = "d", descriptor = "(Lclient!tj;Lclient!rp;)V")
	private void method4620(@OriginalArg(0) Class122 arg0, @OriginalArg(1) Class177 arg1) {
		Static275.method4618(arg0);
		Static275.method4613(arg0);
		arg0.method4796(Static275.anIntArray437);
		arg0.method4768(0, 0, this.anInt5491, this.anInt5491);
		arg0.method4777();
		arg0.method4732(0, 0, this.anInt5491, this.anInt5491, this.anInt5490 | 0xFF000000, 0);
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean344) {
				local31 = -arg1.anInt5489;
				local33 = -arg1.anInt5485;
				local35 = -arg1.anInt5496;
			} else {
				local31 = arg1.anInt5489 - this.anInt5489;
				local33 = arg1.anInt5485 - this.anInt5485;
				local35 = arg1.anInt5496 - this.anInt5496;
			}
		}
		@Pc(79) int local79;
		@Pc(84) int local84;
		@Pc(94) int local94;
		if (this.anInt5486 != 0) {
			local79 = Class19.anIntArray20[this.anInt5486];
			local84 = Class19.anIntArray21[this.anInt5486];
			local94 = local33 * local84 - local35 * local79 >> 15;
			local35 = local33 * local79 + local35 * local84 >> 15;
			local33 = local94;
		}
		if (this.anInt5492 != 0) {
			local79 = Class19.anIntArray20[this.anInt5492];
			local84 = Class19.anIntArray21[this.anInt5492];
			local94 = local35 * local79 + local31 * local84 >> 15;
			local35 = local35 * local84 - local31 * local79 >> 15;
			local31 = local94;
		}
		@Pc(147) Class124 local147 = Static275.aClass124_6.method4094((byte) 0, 25600, true);
		if (arg0.method4750()) {
			local147.method4107((short) 0, (short) this.anInt5494);
		} else {
			local147.method4083((short) 127, Static123.anInterface9_2.method2396(this.anInt5494).aShort83);
			local147.method4107((short) 0, (short) -1);
		}
		arg0.method4752(1.0F);
		arg0.method4784(16777215, 1.0F, 1.0F, (float) local31, (float) local33, (float) local35);
		local84 = this.anInt5491 * 1024 / (local147.method4093() - local147.method4087());
		if (this.anInt5490 != 0) {
			local84 = local84 * 13 / 16;
		}
		arg0.method4772(this.anInt5491 / 2, this.anInt5491 / 2, local84, local84);
		arg0.method4785(arg0.method4743());
		@Pc(223) Class56 local223 = arg0.method4743();
		local223.method4683(0, 0, arg0.method4795() - local147.method4119());
		local147.method4098(local223, null, 1024);
		@Pc(245) int local245 = this.anInt5491 * 13 / 16;
		@Pc(252) int local252 = (this.anInt5491 - local245) / 2;
		Static275.aClass57_18.method5449(local252, local252, local245, local245, 1, this.anInt5490 | 0xFF000000, 1);
		this.aClass57_17 = arg0.method4731(0, 0, this.anInt5491, this.anInt5491, true);
		arg0.method4777();
		arg0.method4732(0, 0, this.anInt5491, this.anInt5491, 0, 0);
		Static275.aClass57_19.method5449(0, 0, this.anInt5491, this.anInt5491, 0, 0, 0);
		this.aClass57_17.method5445(0);
		arg0.method4768(Static275.anIntArray437[0], Static275.anIntArray437[1], Static275.anIntArray437[2], Static275.anIntArray437[3]);
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(Lclient!tj;IIIIII)V")
	public void method4621(@OriginalArg(0) Class122 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass57_17 == null) {
			return;
		}
		@Pc(10) int local10 = this.anInt5486 - arg5 & 0x3FFF;
		@Pc(17) int local17 = this.anInt5492 - arg6 & 0x3FFF;
		if (local17 > 8192) {
			local17 -= 16384;
		}
		if (local10 > 8192) {
			local10 -= 16384;
		}
		@Pc(38) int local38 = local10 * arg4 / 4096 + (arg4 - this.anInt5488) / 2;
		@Pc(51) int local51 = local17 * arg4 / -4096 + (arg3 - this.anInt5488) / 2;
		if (local38 < arg4 && local38 + this.anInt5488 > 0 && local51 < arg3 && local51 + this.anInt5488 > 0) {
			this.aClass57_17.method5431(local51 + arg1, local38 + arg2, this.anInt5488, this.anInt5488);
		}
	}
}
