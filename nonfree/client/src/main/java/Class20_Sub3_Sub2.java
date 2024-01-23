import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nk")
public final class Class20_Sub3_Sub2 extends Class20_Sub3 {

	@OriginalMember(owner = "client!nk", name = "Ob", descriptor = "Lclient!se;")
	public Class105 aClass105_1;

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method3495(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (this.aClass105_1 == null) {
			return;
		}
		@Pc(21) Class110 local21 = super.anInt3060 != -1 && super.anInt3014 == 0 ? Static200.method3204(super.anInt3060) : null;
		@Pc(39) Class110 local39 = super.anInt3051 == -1 || super.anInt3051 == super.anInt3057 && local21 != null ? null : Static200.method3204(super.anInt3051);
		@Pc(50) Class20_Sub5 local50 = this.aClass105_1.method3122(super.anInt3046, local39, super.anInt3038, local21);
		if (local50 == null) {
			return;
		}
		super.anInt3053 = local50.method3494();
		@Pc(60) Class105 local60 = this.aClass105_1;
		if (local60.anIntArray443 != null) {
			local60 = local60.method3127();
		}
		if (Static35.aBoolean27 && local60.aBoolean180) {
			@Pc(112) Class20_Sub5 local112 = Static173.method2874(local39 == null ? super.anInt3046 : super.anInt3038, super.anInt3022, super.anInt3011, super.anInt3008, local50, local39 == null ? local21 : local39, this.aClass105_1.aByte15, this.aClass105_1.aShort28, arg0, super.aBoolean128, this.aClass105_1.aShort30, this.aClass105_1.aByte14, this.aClass105_1.anInt3889);
			local112.method3495(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L);
		}
		@Pc(125) int local125 = 0;
		@Pc(127) int local127 = 0;
		@Pc(129) int local129 = 0;
		if (this.aClass105_1.aShort29 != 0 && this.aClass105_1.aShort31 != 0) {
			@Pc(144) int local144 = Class120.anIntArray491[arg0];
			@Pc(148) int local148 = Class120.anIntArray492[arg0];
			@Pc(152) short local152 = this.aClass105_1.aShort31;
			@Pc(156) short local156 = this.aClass105_1.aShort29;
			@Pc(161) int local161 = -local156 / 2;
			@Pc(166) int local166 = -local152 / 2;
			@Pc(176) int local176 = local161 * local148 + local166 * local144 >> 16;
			@Pc(186) int local186 = local148 * local166 - local144 * local161 >> 16;
			@Pc(198) int local198 = Static131.method2213(super.anInt3008 + local186, local176 + super.anInt3022, Static212.anInt4195);
			@Pc(202) int local202 = local156 / 2;
			@Pc(207) int local207 = -local152 / 2;
			@Pc(218) int local218 = local148 * local207 - local202 * local144 >> 16;
			@Pc(228) int local228 = local148 * local202 + local144 * local207 >> 16;
			@Pc(240) int local240 = Static131.method2213(local218 + super.anInt3008, local228 + super.anInt3022, Static212.anInt4195);
			@Pc(245) int local245 = -local156 / 2;
			@Pc(249) int local249 = local152 / 2;
			@Pc(260) int local260 = local148 * local249 - local245 * local144 >> 16;
			@Pc(270) int local270 = local245 * local148 + local144 * local249 >> 16;
			@Pc(274) int local274 = local156 / 2;
			@Pc(278) int local278 = local152 / 2;
			@Pc(290) int local290 = Static131.method2213(local260 + super.anInt3008, local270 + super.anInt3022, Static212.anInt4195);
			@Pc(300) int local300 = local148 * local274 + local278 * local144 >> 16;
			@Pc(311) int local311 = local278 * local148 - local144 * local274 >> 16;
			@Pc(318) int local318 = local240 > local198 ? local198 : local240;
			@Pc(331) int local331 = Static131.method2213(super.anInt3008 + local311, local300 + super.anInt3022, Static212.anInt4195);
			@Pc(338) int local338 = local331 <= local290 ? local331 : local290;
			@Pc(349) int local349 = local331 > local240 ? local240 : local331;
			local125 = (int) (Math.atan2((double) (local318 - local338), (double) local152) * 325.95D) & 0x7FF;
			local127 = local331 + local198;
			if (local240 + local290 < local127) {
				local127 = local240 + local290;
			}
			if (local125 != 0) {
				local50.method1696(local125);
			}
			@Pc(400) int local400 = local198 >= local290 ? local290 : local198;
			local129 = (int) (Math.atan2((double) (local400 - local349), (double) local156) * 325.95D) & 0x7FF;
			if (local129 != 0) {
				local50.method1693(local129);
			}
			local127 = (local127 >> 1) - super.anInt3011;
			if (local127 != 0) {
				local50.method1698(0, local127, 0);
			}
		}
		@Pc(438) Class20_Sub5 local438 = null;
		if (super.anInt3058 != -1 && super.anInt3019 != -1) {
			@Pc(452) Class46 local452 = Static216.method3377(super.anInt3058);
			local438 = local452.method1128(super.anInt3019);
			if (local438 != null) {
				local438.method1698(0, -super.anInt3037, 0);
				if (local452.aBoolean73) {
					if (local125 != 0) {
						local438.method1696(local125);
					}
					if (local129 != 0) {
						local438.method1693(local129);
					}
					if (local127 != 0) {
						local438.method1698(0, local127, 0);
					}
				}
			}
		}
		if (local438 != null) {
			local50 = ((Class20_Sub5_Sub1) local50).method1717(local438);
		}
		if (this.aClass105_1.anInt3889 == 1) {
			local50.aBoolean95 = true;
		}
		local50.method3495(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
	}

	@OriginalMember(owner = "client!nk", name = "b", descriptor = "()I")
	@Override
	public int method3494() {
		return super.anInt3053;
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method2467() {
		return this.aClass105_1 != null;
	}
}
