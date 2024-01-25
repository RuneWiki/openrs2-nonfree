import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fw")
public final class Class121 {

	@OriginalMember(owner = "client!fw", name = "b", descriptor = "I")
	private int anInt3375;

	@OriginalMember(owner = "client!fw", name = "d", descriptor = "I")
	private int anInt3377;

	@OriginalMember(owner = "client!fw", name = "e", descriptor = "Lclient!hh;")
	private Class6 aClass6_9;

	@OriginalMember(owner = "client!fw", name = "i", descriptor = "I")
	private int anInt3380;

	@OriginalMember(owner = "client!fw", name = "q", descriptor = "I")
	private int anInt3385;

	@OriginalMember(owner = "client!fw", name = "r", descriptor = "I")
	public int anInt3386;

	@OriginalMember(owner = "client!fw", name = "n", descriptor = "I")
	private final int anInt3383;

	@OriginalMember(owner = "client!fw", name = "o", descriptor = "I")
	private final int anInt3384;

	@OriginalMember(owner = "client!fw", name = "h", descriptor = "I")
	private final int anInt3379;

	@OriginalMember(owner = "client!fw", name = "j", descriptor = "Z")
	private final boolean aBoolean247;

	@OriginalMember(owner = "client!fw", name = "c", descriptor = "I")
	private final int anInt3376;

	@OriginalMember(owner = "client!fw", name = "m", descriptor = "I")
	private final int anInt3382;

	@OriginalMember(owner = "client!fw", name = "l", descriptor = "I")
	private final int anInt3381;

	@OriginalMember(owner = "client!fw", name = "f", descriptor = "I")
	private final int anInt3378;

	@OriginalMember(owner = "client!fw", name = "<init>", descriptor = "(IIIIIIIZ)V")
	public Class121(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt3383 = arg2;
		this.anInt3384 = arg3;
		this.anInt3379 = arg4;
		this.aBoolean247 = arg7;
		this.anInt3376 = arg1;
		this.anInt3382 = arg6;
		this.anInt3381 = arg5;
		this.anInt3378 = arg0;
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(Lclient!ha;Lclient!fw;)Z")
	private boolean method2874(@OriginalArg(0) Class95 arg0, @OriginalArg(1) Class121 arg1) {
		if (this.aClass6_9 == null) {
			if (this.anInt3378 == 0) {
				if (Static55.anInterface2_1.method8328(this.anInt3376)) {
					@Pc(23) int[] local23 = Static55.anInterface2_1.method8327(0.7F, this.anInt3377, this.anInt3376, this.anInt3377);
					this.aClass6_9 = arg0.method7993(local23, this.anInt3377, this.anInt3377, this.anInt3377);
				}
			} else if (this.anInt3378 == 2) {
				this.method2882(arg0, arg1);
			} else if (this.anInt3378 == 1) {
				this.method2879(arg0, arg1);
			}
		}
		return this.aClass6_9 != null;
	}

	@OriginalMember(owner = "client!fw", name = "b", descriptor = "(Lclient!ha;Lclient!fw;)Z")
	public boolean method2875(@OriginalArg(0) Class95 arg0, @OriginalArg(1) Class121 arg1) {
		return this.aClass6_9 != null || this.method2874(arg0, arg1);
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(IIII)Z")
	public boolean method2876(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean247) {
			this.anInt3386 = 1073741823;
			local7 = this.anInt3383;
			local12 = this.anInt3384;
			local17 = this.anInt3379;
		} else {
			local7 = this.anInt3383 - arg0;
			local12 = this.anInt3384 - arg1;
			local17 = this.anInt3379 - arg2;
			this.anInt3386 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt3386 == 0) {
				this.anInt3386 = 1;
			}
			local7 = (local7 << 8) / this.anInt3386;
			local12 = (local12 << 8) / this.anInt3386;
			local17 = (local17 << 8) / this.anInt3386;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt3380 = this.anInt3381 * arg3 / (this.aBoolean247 ? 1024 : this.anInt3386);
		} else {
			this.anInt3380 = 0;
		}
		if (this.anInt3380 < 8) {
			this.aClass6_9 = null;
			return false;
		}
		@Pc(143) int local143 = Static585.method7772(this.anInt3380);
		if (local143 > arg3) {
			local143 = Static324.method4617(arg3);
		}
		if (local143 > 512) {
			local143 = 512;
		}
		if (local143 != this.anInt3377) {
			this.anInt3377 = local143;
		}
		this.anInt3375 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 2607.5945876176133D) & 0x3FFF;
		this.anInt3385 = (int) (Math.atan2((double) local7, (double) -local17) * 2607.5945876176133D) & 0x3FFF;
		this.aClass6_9 = null;
		return true;
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(Lclient!ha;IIIIII)V")
	public void method2877(@OriginalArg(0) Class95 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass6_9 == null) {
			return;
		}
		@Pc(10) int local10 = this.anInt3375 - arg5 & 0x3FFF;
		@Pc(17) int local17 = this.anInt3385 - arg6 & 0x3FFF;
		if (local17 > 8192) {
			local17 -= 16384;
		}
		if (local10 > 8192) {
			local10 -= 16384;
		}
		@Pc(38) int local38 = local10 * arg4 / 4096 + (arg4 - this.anInt3380) / 2;
		@Pc(51) int local51 = local17 * arg4 / -4096 + (arg3 - this.anInt3380) / 2;
		if (local38 < arg4 && local38 + this.anInt3380 > 0 && local51 < arg3 && local51 + this.anInt3380 > 0) {
			this.aClass6_9.method5121(local51 + arg1, local38 + arg2, this.anInt3380, this.anInt3380);
		}
	}

	@OriginalMember(owner = "client!fw", name = "c", descriptor = "(Lclient!ha;Lclient!fw;)V")
	private void method2879(@OriginalArg(0) Class95 arg0, @OriginalArg(1) Class121 arg1) {
		Static183.method2881(arg0);
		Static183.method2880(arg0);
		arg0.K(Static183.anIntArray173);
		arg0.KA(0, 0, this.anInt3377, this.anInt3377);
		arg0.ya();
		arg0.aa(0, 0, this.anInt3377, this.anInt3377, this.anInt3382 | 0xFF000000, 0);
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean247) {
				local31 = -arg1.anInt3383;
				local33 = -arg1.anInt3384;
				local35 = -arg1.anInt3379;
			} else {
				local31 = arg1.anInt3383 - this.anInt3383;
				local33 = arg1.anInt3384 - this.anInt3384;
				local35 = arg1.anInt3379 - this.anInt3379;
			}
		}
		@Pc(79) int local79;
		@Pc(84) int local84;
		@Pc(94) int local94;
		if (this.anInt3375 != 0) {
			local79 = Class94.anIntArray561[this.anInt3375];
			local84 = Class94.anIntArray560[this.anInt3375];
			local94 = local33 * local84 - local35 * local79 >> 14;
			local35 = local33 * local79 + local35 * local84 >> 14;
			local33 = local94;
		}
		if (this.anInt3385 != 0) {
			local79 = Class94.anIntArray561[this.anInt3385];
			local84 = Class94.anIntArray560[this.anInt3385];
			local94 = local35 * local79 + local31 * local84 >> 14;
			local35 = local35 * local84 - local31 * local79 >> 14;
			local31 = local94;
		}
		@Pc(147) Class149 local147 = Static183.aClass149_4.method8858((byte) 0, 51200, true);
		local147.aa((short) 0, (short) this.anInt3376);
		arg0.xa(1.0F);
		arg0.ZA(16777215, 1.0F, 1.0F, (float) local31, (float) local33, (float) local35);
		local84 = this.anInt3377 * 1024 / (local147.RA() - local147.V());
		if (this.anInt3382 != 0) {
			local84 = local84 * 13 / 16;
		}
		arg0.DA(this.anInt3377 / 2, this.anInt3377 / 2, local84, local84);
		arg0.method8037(arg0.method8063());
		@Pc(206) Class17 local206 = arg0.method8063();
		local206.method6231(0, 0, arg0.i() - local147.HA());
		local147.method8869(local206, (Class34_Sub6) null, 1024, 1);
		@Pc(228) int local228 = this.anInt3377 * 13 / 16;
		@Pc(235) int local235 = (this.anInt3377 - local228) / 2;
		Static183.aClass6_10.method5135(local235, local235, local228, local228, 0, this.anInt3382 | 0xFF000000, 1);
		this.aClass6_9 = arg0.method7998(0, 0, this.anInt3377, this.anInt3377, true);
		arg0.ya();
		arg0.aa(0, 0, this.anInt3377, this.anInt3377, 0, 0);
		Static183.aClass6_11.method5135(0, 0, this.anInt3377, this.anInt3377, 1, 0, 0);
		this.aClass6_9.method5120(0);
		arg0.KA(Static183.anIntArray173[0], Static183.anIntArray173[1], Static183.anIntArray173[2], Static183.anIntArray173[3]);
	}

	@OriginalMember(owner = "client!fw", name = "d", descriptor = "(Lclient!ha;Lclient!fw;)V")
	private void method2882(@OriginalArg(0) Class95 arg0, @OriginalArg(1) Class121 arg1) {
		@Pc(6) Class134 local6 = Static74.method1278(this.anInt3376, Static327.aClass362_66);
		if (local6 == null) {
			return;
		}
		arg0.K(Static183.anIntArray173);
		arg0.KA(0, 0, this.anInt3377, this.anInt3377);
		arg0.aa(0, 0, this.anInt3377, this.anInt3377, 0, 0);
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean247) {
				local32 = -arg1.anInt3383;
				local34 = -arg1.anInt3384;
				local36 = -arg1.anInt3379;
			} else {
				local32 = this.anInt3383 - arg1.anInt3383;
				local34 = this.anInt3384 - arg1.anInt3384;
				local36 = this.anInt3379 - arg1.anInt3379;
			}
		}
		@Pc(81) int local81;
		@Pc(85) int local85;
		@Pc(89) int local89;
		@Pc(99) int local99;
		if (this.anInt3375 != 0) {
			local81 = -this.anInt3375 & 0x3FFF;
			local85 = Class94.anIntArray561[local81];
			local89 = Class94.anIntArray560[local81];
			local99 = local34 * local89 - local36 * local85 >> 14;
			local36 = local34 * local85 + local36 * local89 >> 14;
			local34 = local99;
		}
		if (this.anInt3385 != 0) {
			local81 = -this.anInt3385 & 0x3FFF;
			local85 = Class94.anIntArray561[local81];
			local89 = Class94.anIntArray560[local81];
			local99 = local36 * local85 + local32 * local89 >> 14;
			local36 = local36 * local89 - local32 * local85 >> 14;
			local32 = local99;
		}
		arg0.xa(1.0F);
		arg0.ZA(16777215, 1.0F, 1.0F, (float) local32, (float) local34, (float) local36);
		@Pc(172) Class149 local172 = arg0.method8021(local6, 2048, 0, 64, 768);
		local85 = local172.RA() - local172.V();
		local89 = local172.EA() - local172.fa();
		local99 = local172.V() + local85 / 2;
		@Pc(198) int local198 = local172.fa() + local89 / 2;
		@Pc(205) int local205 = local85 > local89 ? local85 : local89;
		arg0.DA(local99, local198, local205, local205);
		arg0.method8037(arg0.method8063());
		@Pc(218) Class17 local218 = arg0.method8013();
		local218.method6231(0, 0, arg0.i() - local172.HA());
		local172.method8869(local218, (Class34_Sub6) null, arg0.i(), 1);
		this.aClass6_9 = arg0.method7998(0, 0, this.anInt3377, this.anInt3377, true);
		this.aClass6_9.method5120(3);
		arg0.KA(Static183.anIntArray173[0], Static183.anIntArray173[1], Static183.anIntArray173[2], Static183.anIntArray173[3]);
	}

	@OriginalMember(owner = "client!fw", name = "c", descriptor = "()V")
	public void method2884() {
		this.aClass6_9 = null;
	}
}
