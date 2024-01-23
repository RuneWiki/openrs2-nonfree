import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qe")
public final class Class5_Sub1_Sub2 extends Class5_Sub1 {

	@OriginalMember(owner = "client!qe", name = "Kb", descriptor = "Lclient!d;")
	public Class27 aClass27_1;

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method3679(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (this.aClass27_1 == null) {
			return;
		}
		@Pc(22) Class40 local22 = super.anInt3585 != -1 && super.anInt3599 == 0 ? Static32.method546(super.anInt3585) : null;
		@Pc(44) Class40 local44 = super.anInt3620 == -1 || super.anInt3620 == super.anInt3618 && local22 != null ? null : Static32.method546(super.anInt3620);
		@Pc(55) Class5_Sub2 local55 = this.aClass27_1.method599(super.anInt3632, super.anInt3576, local22, local44);
		if (local55 == null) {
			return;
		}
		super.anInt3606 = local55.method3680();
		@Pc(65) Class27 local65 = this.aClass27_1;
		if (local65.anIntArray51 != null) {
			local65 = local65.method594();
		}
		if (Static21.aBoolean22 && local65.aBoolean41) {
			@Pc(117) Class5_Sub2 local117 = Static134.method2406(this.aClass27_1.aShort1, this.aClass27_1.aByte2, this.aClass27_1.aByte3, local44 == null ? local22 : local44, super.anInt3577, super.anInt3624, super.aBoolean167, local55, this.aClass27_1.aShort4, this.aClass27_1.anInt822, arg0, local44 == null ? super.anInt3576 : super.anInt3632, super.anInt3598);
			local117.method3679(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L);
		}
		@Pc(130) int local130 = 0;
		@Pc(132) int local132 = 0;
		@Pc(134) int local134 = 0;
		if (this.aClass27_1.aShort3 != 0 && this.aClass27_1.aShort2 != 0) {
			@Pc(149) int local149 = Class94.anIntArray277[arg0];
			@Pc(153) short local153 = this.aClass27_1.aShort3;
			@Pc(157) int local157 = Class94.anIntArray278[arg0];
			@Pc(161) short local161 = this.aClass27_1.aShort2;
			@Pc(166) int local166 = -local161 / 2;
			@Pc(171) int local171 = -local153 / 2;
			@Pc(182) int local182 = local166 * local157 + local171 * local149 >> 16;
			@Pc(193) int local193 = local166 * local149 - local171 * local157 >> 16;
			@Pc(205) int local205 = Static26.method2454(Static197.anInt2422, super.anInt3598 + local193, local182 + super.anInt3624);
			@Pc(209) int local209 = local153 / 2;
			@Pc(214) int local214 = -local161 / 2;
			@Pc(224) int local224 = local149 * local209 + local214 * local157 >> 16;
			@Pc(235) int local235 = local149 * local214 - local157 * local209 >> 16;
			@Pc(247) int local247 = Static26.method2454(Static197.anInt2422, local235 + super.anInt3598, super.anInt3624 + local224);
			@Pc(251) int local251 = local161 / 2;
			@Pc(256) int local256 = -local153 / 2;
			@Pc(266) int local266 = local251 * local157 + local149 * local256 >> 16;
			@Pc(270) int local270 = local153 / 2;
			@Pc(274) int local274 = local161 / 2;
			@Pc(285) int local285 = local251 * local149 - local157 * local256 >> 16;
			@Pc(295) int local295 = local270 * local149 + local157 * local274 >> 16;
			@Pc(307) int local307 = Static26.method2454(Static197.anInt2422, local285 + super.anInt3598, local266 + super.anInt3624);
			@Pc(318) int local318 = local274 * local149 - local157 * local270 >> 16;
			@Pc(332) int local332 = Static26.method2454(Static197.anInt2422, super.anInt3598 + local318, super.anInt3624 - -local295);
			local134 = local205 + local332;
			@Pc(344) int local344 = local205 >= local247 ? local247 : local205;
			@Pc(355) int local355 = local307 >= local332 ? local332 : local307;
			if (local134 > local307 + local247) {
				local134 = local247 + local307;
			}
			local132 = (int) (Math.atan2((double) (local344 - local355), (double) local161) * 325.95D) & 0x7FF;
			if (local132 != 0) {
				local55.method2919(local132);
			}
			@Pc(401) int local401 = local332 > local247 ? local247 : local332;
			@Pc(412) int local412 = local307 <= local205 ? local307 : local205;
			local130 = (int) (Math.atan2((double) (local412 - local401), (double) local153) * 325.95D) & 0x7FF;
			if (local130 != 0) {
				local55.method2927(local130);
			}
			local134 = (local134 >> 1) - super.anInt3577;
			if (local134 != 0) {
				local55.method2925(0, local134, 0);
			}
		}
		@Pc(451) Class5_Sub2 local451 = null;
		if (super.anInt3622 != -1 && super.anInt3605 != -1) {
			@Pc(465) Class122 local465 = Static103.method3801(super.anInt3622);
			local451 = local465.method3608(super.anInt3605);
			if (local451 != null) {
				local451.method2925(0, -super.anInt3611, 0);
				if (local465.aBoolean209) {
					if (local132 != 0) {
						local451.method2919(local132);
					}
					if (local130 != 0) {
						local451.method2927(local130);
					}
					if (local134 != 0) {
						local451.method2925(0, local134, 0);
					}
				}
			}
		}
		if (local451 != null) {
			local55 = ((Class5_Sub2_Sub1) local55).method2934(local451);
		}
		if (this.aClass27_1.anInt822 == 1) {
			local55.aBoolean173 = true;
		}
		local55.method3679(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "()I")
	@Override
	public int method3680() {
		return super.anInt3606;
	}

	@OriginalMember(owner = "client!qe", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method2793() {
		return this.aClass27_1 != null;
	}
}
