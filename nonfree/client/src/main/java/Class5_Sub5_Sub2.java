import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mj")
public final class Class5_Sub5_Sub2 extends Class5_Sub5 {

	@OriginalMember(owner = "client!mj", name = "Qb", descriptor = "Lclient!di;")
	public Class30 aClass30_1;

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method2300(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (this.aClass30_1 == null) {
			return;
		}
		@Pc(21) Class96 local21 = super.anInt3048 != -1 && super.anInt2996 == 0 ? Static2.method88(super.anInt3048) : null;
		@Pc(40) Class96 local40 = super.anInt3005 == -1 || super.anInt3022 == super.anInt3005 && local21 != null ? null : Static2.method88(super.anInt3005);
		@Pc(51) Class5_Sub3 local51 = this.aClass30_1.method874(local40, local21, super.anInt3023, super.anInt3028);
		if (local51 == null) {
			return;
		}
		super.anInt2995 = local51.method2297();
		@Pc(61) Class30 local61 = this.aClass30_1;
		if (local61.anIntArray102 != null) {
			local61 = local61.method870();
		}
		if (Static163.aBoolean316 && local61.aBoolean91) {
			@Pc(113) Class5_Sub3 local113 = Static58.method1128(this.aClass30_1.aShort21, local51, arg0, this.aClass30_1.anInt961, super.aBoolean257, super.anInt3021, local40 == null ? local21 : local40, this.aClass30_1.aByte7, super.anInt3000, super.anInt3044, this.aClass30_1.aByte6, this.aClass30_1.aShort20, local40 == null ? super.anInt3023 : super.anInt3028);
			local113.method2300(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L);
		}
		@Pc(126) int local126 = 0;
		@Pc(128) int local128 = 0;
		@Pc(130) int local130 = 0;
		if (this.aClass30_1.aShort19 != 0 || this.aClass30_1.aShort18 != 0) {
			@Pc(145) int local145 = Class45.anIntArray159[arg0];
			@Pc(149) int local149 = Class45.anIntArray156[arg0];
			@Pc(153) short local153 = this.aClass30_1.aShort19;
			@Pc(157) short local157 = this.aClass30_1.aShort18;
			@Pc(162) int local162 = -local153 / 2;
			@Pc(167) int local167 = -local157 / 2;
			@Pc(177) int local177 = local149 * local162 + local167 * local145 >> 16;
			@Pc(188) int local188 = local167 * local149 - local162 * local145 >> 16;
			@Pc(200) int local200 = Static130.method2174(Static191.anInt4237, local188 + super.anInt3044, super.anInt3021 + local177);
			@Pc(204) int local204 = local153 / 2;
			@Pc(209) int local209 = -local157 / 2;
			@Pc(219) int local219 = local149 * local204 + local145 * local209 >> 16;
			@Pc(230) int local230 = local209 * local149 - local145 * local204 >> 16;
			@Pc(243) int local243 = Static130.method2174(Static191.anInt4237, local230 + super.anInt3044, super.anInt3021 - -local219);
			@Pc(248) int local248 = -local153 / 2;
			@Pc(252) int local252 = local157 / 2;
			@Pc(262) int local262 = local248 * local149 + local145 * local252 >> 16;
			@Pc(273) int local273 = local252 * local149 - local145 * local248 >> 16;
			@Pc(277) int local277 = local153 / 2;
			@Pc(289) int local289 = Static130.method2174(Static191.anInt4237, local273 + super.anInt3044, local262 + super.anInt3021);
			@Pc(293) int local293 = local157 / 2;
			@Pc(303) int local303 = local149 * local277 + local293 * local145 >> 16;
			@Pc(313) int local313 = local293 * local149 - local277 * local145 >> 16;
			@Pc(326) int local326 = Static130.method2174(Static191.anInt4237, local313 + super.anInt3044, super.anInt3021 - -local303);
			local130 = local200 + local326;
			if (local130 > local243 + local289) {
				local130 = local243 + local289;
			}
			@Pc(352) int local352 = local243 <= local200 ? local243 : local200;
			@Pc(359) int local359 = local243 >= local326 ? local326 : local243;
			@Pc(370) int local370 = local326 <= local289 ? local326 : local289;
			if (local157 != 0) {
				local126 = (int) (Math.atan2((double) (local352 - local370), (double) local157) * 325.95D) & 0x7FF;
				if (local126 != 0) {
					local51.method530(local126);
				}
			}
			@Pc(400) int local400 = local200 < local289 ? local200 : local289;
			if (local153 != 0) {
				local128 = (int) (Math.atan2((double) (local400 - local359), (double) local153) * 325.95D) & 0x7FF;
				if (local128 != 0) {
					local51.method528(local128);
				}
			}
			local130 = (local130 >> 1) - super.anInt3000;
			if (local130 != 0) {
				local51.method532(0, local130, 0);
			}
		}
		@Pc(447) Class5_Sub3 local447 = null;
		if (super.anInt3045 != -1 && super.anInt3038 != -1) {
			@Pc(462) Class69 local462 = Static89.method1514(super.anInt3045);
			local447 = local462.method2008(super.anInt3038);
			if (local447 != null) {
				local447.method532(0, -super.anInt3043, 0);
				if (local462.aBoolean217) {
					if (local126 != 0) {
						local447.method530(local126);
					}
					if (local128 != 0) {
						local447.method528(local128);
					}
					if (local130 != 0) {
						local447.method532(0, local130, 0);
					}
				}
			}
		}
		if (local447 != null) {
			local51 = ((Class5_Sub3_Sub1) local51).method559(local447);
		}
		if (this.aClass30_1.anInt961 == 1) {
			local51.aBoolean45 = true;
		}
		local51.method2300(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "()I")
	@Override
	public int method2297() {
		return super.anInt2995;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method2308() {
		return this.aClass30_1 != null;
	}
}
