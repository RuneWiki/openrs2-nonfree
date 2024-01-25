import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vw")
public final class Class365 {

	@OriginalMember(owner = "client!vw", name = "f", descriptor = "Lclient!td;")
	private Class24 aClass24_33;

	@OriginalMember(owner = "client!vw", name = "i", descriptor = "I")
	private int anInt9938;

	@OriginalMember(owner = "client!vw", name = "k", descriptor = "I")
	private int anInt9940;

	@OriginalMember(owner = "client!vw", name = "l", descriptor = "I")
	public int anInt9941;

	@OriginalMember(owner = "client!vw", name = "o", descriptor = "I")
	private int anInt9942;

	@OriginalMember(owner = "client!vw", name = "q", descriptor = "I")
	private int anInt9944;

	@OriginalMember(owner = "client!vw", name = "b", descriptor = "I")
	private final int anInt9934;

	@OriginalMember(owner = "client!vw", name = "e", descriptor = "I")
	private final int anInt9937;

	@OriginalMember(owner = "client!vw", name = "r", descriptor = "I")
	private final int anInt9945;

	@OriginalMember(owner = "client!vw", name = "g", descriptor = "Z")
	private final boolean aBoolean717;

	@OriginalMember(owner = "client!vw", name = "j", descriptor = "I")
	private final int anInt9939;

	@OriginalMember(owner = "client!vw", name = "p", descriptor = "I")
	private final int anInt9943;

	@OriginalMember(owner = "client!vw", name = "c", descriptor = "I")
	private final int anInt9935;

	@OriginalMember(owner = "client!vw", name = "d", descriptor = "I")
	private final int anInt9936;

	@OriginalMember(owner = "client!vw", name = "<init>", descriptor = "(IIIIIIIZ)V")
	public Class365(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt9934 = arg2;
		this.anInt9937 = arg3;
		this.anInt9945 = arg4;
		this.aBoolean717 = arg7;
		this.anInt9939 = arg1;
		this.anInt9943 = arg6;
		this.anInt9935 = arg5;
		this.anInt9936 = arg0;
	}

	@OriginalMember(owner = "client!vw", name = "b", descriptor = "()V")
	public void method8509() {
		this.aClass24_33 = null;
	}

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(Lclient!ha;Lclient!vw;)Z")
	public boolean method8510(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class365 arg1) {
		return this.aClass24_33 != null || this.method8514(arg0, arg1);
	}

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(IIII)Z")
	public boolean method8511(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean717) {
			this.anInt9941 = 1073741823;
			local7 = this.anInt9934;
			local12 = this.anInt9937;
			local17 = this.anInt9945;
		} else {
			local7 = this.anInt9934 - arg0;
			local12 = this.anInt9937 - arg1;
			local17 = this.anInt9945 - arg2;
			this.anInt9941 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt9941 == 0) {
				this.anInt9941 = 1;
			}
			local7 = (local7 << 8) / this.anInt9941;
			local12 = (local12 << 8) / this.anInt9941;
			local17 = (local17 << 8) / this.anInt9941;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt9940 = this.anInt9935 * arg3 / (this.aBoolean717 ? 1024 : this.anInt9941);
		} else {
			this.anInt9940 = 0;
		}
		if (this.anInt9940 < 8) {
			this.aClass24_33 = null;
			return false;
		}
		@Pc(143) int local143 = Static109.method2234(this.anInt9940);
		if (local143 > arg3) {
			local143 = Static274.method4478(arg3);
		}
		if (local143 > 512) {
			local143 = 512;
		}
		if (local143 != this.anInt9938) {
			this.anInt9938 = local143;
		}
		this.anInt9942 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 2607.5945876176133D) & 0x3FFF;
		this.anInt9944 = (int) (Math.atan2((double) local7, (double) -local17) * 2607.5945876176133D) & 0x3FFF;
		this.aClass24_33 = null;
		return true;
	}

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(Lclient!ha;IIIIII)V")
	public void method8512(@OriginalArg(0) Class5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass24_33 == null) {
			return;
		}
		@Pc(10) int local10 = this.anInt9942 - arg5 & 0x3FFF;
		@Pc(17) int local17 = this.anInt9944 - arg6 & 0x3FFF;
		if (local17 > 8192) {
			local17 -= 16384;
		}
		if (local10 > 8192) {
			local10 -= 16384;
		}
		@Pc(38) int local38 = local10 * arg4 / 4096 + (arg4 - this.anInt9940) / 2;
		@Pc(51) int local51 = local17 * arg4 / -4096 + (arg3 - this.anInt9940) / 2;
		if (local38 < arg4 && local38 + this.anInt9940 > 0 && local51 < arg3 && local51 + this.anInt9940 > 0) {
			this.aClass24_33.method8564(local51 + arg1, local38 + arg2, this.anInt9940, this.anInt9940);
		}
	}

	@OriginalMember(owner = "client!vw", name = "b", descriptor = "(Lclient!ha;Lclient!vw;)Z")
	private boolean method8514(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class365 arg1) {
		if (this.aClass24_33 == null) {
			if (this.anInt9936 == 0) {
				if (Static390.anInterface7_13.method8115(this.anInt9939)) {
					@Pc(23) int[] local23 = Static390.anInterface7_13.method8117(this.anInt9938, 0.7F, this.anInt9938, this.anInt9939);
					this.aClass24_33 = arg0.method7536(local23, this.anInt9938, this.anInt9938, this.anInt9938);
				}
			} else if (this.anInt9936 == 2) {
				this.method8518(arg0, arg1);
			} else if (this.anInt9936 == 1) {
				this.method8517(arg0, arg1);
			}
		}
		return this.aClass24_33 != null;
	}

	@OriginalMember(owner = "client!vw", name = "c", descriptor = "(Lclient!ha;Lclient!vw;)V")
	private void method8517(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class365 arg1) {
		Static615.method8516(arg0);
		Static615.method8513(arg0);
		arg0.K(Static615.anIntArray648);
		arg0.KA(0, 0, this.anInt9938, this.anInt9938);
		arg0.ya();
		arg0.aa(0, 0, this.anInt9938, this.anInt9938, this.anInt9943 | 0xFF000000, 0);
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean717) {
				local31 = -arg1.anInt9934;
				local33 = -arg1.anInt9937;
				local35 = -arg1.anInt9945;
			} else {
				local31 = arg1.anInt9934 - this.anInt9934;
				local33 = arg1.anInt9937 - this.anInt9937;
				local35 = arg1.anInt9945 - this.anInt9945;
			}
		}
		@Pc(79) int local79;
		@Pc(84) int local84;
		@Pc(94) int local94;
		if (this.anInt9942 != 0) {
			local79 = Class21.anIntArray656[this.anInt9942];
			local84 = Class21.anIntArray655[this.anInt9942];
			local94 = local33 * local84 - local35 * local79 >> 14;
			local35 = local33 * local79 + local35 * local84 >> 14;
			local33 = local94;
		}
		if (this.anInt9944 != 0) {
			local79 = Class21.anIntArray656[this.anInt9944];
			local84 = Class21.anIntArray655[this.anInt9944];
			local94 = local35 * local79 + local31 * local84 >> 14;
			local35 = local35 * local84 - local31 * local79 >> 14;
			local31 = local94;
		}
		@Pc(147) Class17 local147 = Static615.aClass17_7.method5409((byte) 0, 51200, true);
		local147.aa((short) 0, (short) this.anInt9939);
		arg0.xa(1.0F);
		arg0.ZA(16777215, 1.0F, 1.0F, (float) local31, (float) local33, (float) local35);
		local84 = this.anInt9938 * 1024 / (local147.RA() - local147.V());
		if (this.anInt9943 != 0) {
			local84 = local84 * 13 / 16;
		}
		arg0.DA(this.anInt9938 / 2, this.anInt9938 / 2, local84, local84);
		arg0.method7504(arg0.method7552());
		@Pc(206) Class39 local206 = arg0.method7552();
		local206.method7240(0, 0, arg0.i() - local147.HA());
		local147.method5413(local206, null, 1024, 1);
		@Pc(228) int local228 = this.anInt9938 * 13 / 16;
		@Pc(235) int local235 = (this.anInt9938 - local228) / 2;
		Static615.aClass24_35.method8562(local235, local235, local228, local228, 0, this.anInt9943 | 0xFF000000, 1);
		this.aClass24_33 = arg0.method7545(0, 0, this.anInt9938, this.anInt9938, true);
		arg0.ya();
		arg0.aa(0, 0, this.anInt9938, this.anInt9938, 0, 0);
		Static615.aClass24_34.method8562(0, 0, this.anInt9938, this.anInt9938, 1, 0, 0);
		this.aClass24_33.method8561(0);
		arg0.KA(Static615.anIntArray648[0], Static615.anIntArray648[1], Static615.anIntArray648[2], Static615.anIntArray648[3]);
	}

	@OriginalMember(owner = "client!vw", name = "d", descriptor = "(Lclient!ha;Lclient!vw;)V")
	private void method8518(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class365 arg1) {
		@Pc(6) Class118 local6 = Static330.method5390(Static542.aClass196_112, this.anInt9939);
		if (local6 == null) {
			return;
		}
		arg0.K(Static615.anIntArray648);
		arg0.KA(0, 0, this.anInt9938, this.anInt9938);
		arg0.aa(0, 0, this.anInt9938, this.anInt9938, 0, 0);
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean717) {
				local32 = -arg1.anInt9934;
				local34 = -arg1.anInt9937;
				local36 = -arg1.anInt9945;
			} else {
				local32 = this.anInt9934 - arg1.anInt9934;
				local34 = this.anInt9937 - arg1.anInt9937;
				local36 = this.anInt9945 - arg1.anInt9945;
			}
		}
		@Pc(81) int local81;
		@Pc(85) int local85;
		@Pc(89) int local89;
		@Pc(99) int local99;
		if (this.anInt9942 != 0) {
			local81 = -this.anInt9942 & 0x3FFF;
			local85 = Class21.anIntArray656[local81];
			local89 = Class21.anIntArray655[local81];
			local99 = local34 * local89 - local36 * local85 >> 14;
			local36 = local34 * local85 + local36 * local89 >> 14;
			local34 = local99;
		}
		if (this.anInt9944 != 0) {
			local81 = -this.anInt9944 & 0x3FFF;
			local85 = Class21.anIntArray656[local81];
			local89 = Class21.anIntArray655[local81];
			local99 = local36 * local85 + local32 * local89 >> 14;
			local36 = local36 * local89 - local32 * local85 >> 14;
			local32 = local99;
		}
		arg0.xa(1.0F);
		arg0.ZA(16777215, 1.0F, 1.0F, (float) local32, (float) local34, (float) local36);
		@Pc(172) Class17 local172 = arg0.method7490(local6, 2048, 0, 64, 768);
		local85 = local172.RA() - local172.V();
		local89 = local172.EA() - local172.fa();
		local99 = local172.V() + local85 / 2;
		@Pc(198) int local198 = local172.fa() + local89 / 2;
		@Pc(205) int local205 = local85 > local89 ? local85 : local89;
		arg0.DA(local99, local198, local205, local205);
		arg0.method7504(arg0.method7552());
		@Pc(218) Class39 local218 = arg0.method7546();
		local218.method7240(0, 0, arg0.i() - local172.HA());
		local172.method5413(local218, null, arg0.i(), 1);
		this.aClass24_33 = arg0.method7545(0, 0, this.anInt9938, this.anInt9938, true);
		this.aClass24_33.method8561(3);
		arg0.KA(Static615.anIntArray648[0], Static615.anIntArray648[1], Static615.anIntArray648[2], Static615.anIntArray648[3]);
	}
}
