import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gg")
public final class Class5_Sub2_Sub1 extends Class5_Sub2 {

	@OriginalMember(owner = "client!gg", name = "Vb", descriptor = "Lclient!fj;")
	public Class2_Sub3_Sub9 aClass2_Sub3_Sub9_1;

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method1479() {
		return this.aClass2_Sub3_Sub9_1 != null;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method3779(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (this.aClass2_Sub3_Sub9_1 == null) {
			return;
		}
		@Pc(22) Class2_Sub3_Sub3 local22 = super.anInt1873 != -1 && super.anInt1831 == 0 ? Static187.method3447(super.anInt1873) : null;
		@Pc(40) Class2_Sub3_Sub3 local40 = super.anInt1878 == -1 || super.anInt1879 == super.anInt1878 && local22 != null ? null : Static187.method3447(super.anInt1878);
		@Pc(51) Class5_Sub3 local51 = this.aClass2_Sub3_Sub9_1.method1061(super.anInt1830, super.anInt1848, local40, local22);
		if (local51 == null) {
			return;
		}
		super.anInt1844 = local51.method3773();
		@Pc(61) Class2_Sub3_Sub9 local61 = this.aClass2_Sub3_Sub9_1;
		if (local61.anIntArray230 != null) {
			local61 = local61.method1059();
		}
		if (Static64.aBoolean42 && local61.aBoolean47) {
			@Pc(113) Class5_Sub3 local113 = Static149.method1481(super.aBoolean71, this.aClass2_Sub3_Sub9_1.anInt1284, super.anInt1827, this.aClass2_Sub3_Sub9_1.aShort4, super.anInt1849, arg0, this.aClass2_Sub3_Sub9_1.aByte7, super.anInt1861, local40 == null ? local22 : local40, this.aClass2_Sub3_Sub9_1.aByte6, local40 == null ? super.anInt1848 : super.anInt1830, local51, this.aClass2_Sub3_Sub9_1.aShort5);
			local113.method3779(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L);
		}
		@Pc(126) int local126 = 0;
		@Pc(128) int local128 = 0;
		@Pc(130) int local130 = 0;
		if (this.aClass2_Sub3_Sub9_1.aShort3 != 0 && this.aClass2_Sub3_Sub9_1.aShort2 != 0) {
			@Pc(148) int local148 = Class77.anIntArray631[arg0];
			@Pc(152) int local152 = Class77.anIntArray632[arg0];
			@Pc(156) short local156 = this.aClass2_Sub3_Sub9_1.aShort3;
			@Pc(160) short local160 = this.aClass2_Sub3_Sub9_1.aShort2;
			@Pc(165) int local165 = -local160 / 2;
			@Pc(169) int local169 = local156 / 2;
			@Pc(174) int local174 = -local160 / 2;
			@Pc(179) int local179 = -local156 / 2;
			@Pc(190) int local190 = local152 * local174 - local179 * local148 >> 16;
			@Pc(201) int local201 = local165 * local148 + local152 * local169 >> 16;
			@Pc(211) int local211 = local152 * local165 - local148 * local169 >> 16;
			@Pc(221) int local221 = local179 * local152 + local148 * local174 >> 16;
			@Pc(235) int local235 = Static208.method3667(super.anInt1849 + local221, Static137.anInt3136, super.anInt1827 + local190);
			@Pc(240) int local240 = -local156 / 2;
			@Pc(244) int local244 = local160 / 2;
			@Pc(257) int local257 = Static208.method3667(super.anInt1849 + local201, Static137.anInt3136, super.anInt1827 + local211);
			@Pc(268) int local268 = local152 * local244 - local148 * local240 >> 16;
			@Pc(278) int local278 = local152 * local240 + local148 * local244 >> 16;
			@Pc(290) int local290 = Static208.method3667(local278 + super.anInt1849, Static137.anInt3136, super.anInt1827 + local268);
			@Pc(294) int local294 = local156 / 2;
			@Pc(298) int local298 = local160 / 2;
			@Pc(309) int local309 = local298 * local148 + local294 * local152 >> 16;
			@Pc(316) int local316 = local257 > local235 ? local235 : local257;
			@Pc(327) int local327 = local290 > local235 ? local235 : local290;
			@Pc(338) int local338 = local152 * local298 - local148 * local294 >> 16;
			@Pc(350) int local350 = Static208.method3667(local309 + super.anInt1849, Static137.anInt3136, local338 + super.anInt1827);
			@Pc(361) int local361 = local290 < local350 ? local290 : local350;
			@Pc(372) int local372 = local257 >= local350 ? local350 : local257;
			local130 = local235 + local350;
			if (local130 > local257 + local290) {
				local130 = local257 + local290;
			}
			local126 = (int) (Math.atan2((double) (local316 - local361), (double) local160) * 325.95D) & 0x7FF;
			if (local126 != 0) {
				local51.method1418(local126);
			}
			local128 = (int) (Math.atan2((double) (local327 - local372), (double) local156) * 325.95D) & 0x7FF;
			if (local128 != 0) {
				local51.method1419(local128);
			}
			local130 = (local130 >> 1) - super.anInt1861;
			if (local130 != 0) {
				local51.method1432(0, local130, 0);
			}
		}
		@Pc(443) Class5_Sub3 local443 = null;
		if (super.anInt1857 != -1 && super.anInt1843 != -1) {
			@Pc(456) Class2_Sub3_Sub27 local456 = Static19.method266(super.anInt1857);
			local443 = local456.method3452(super.anInt1843);
			if (local443 != null) {
				local443.method1432(0, -super.anInt1875, 0);
				if (local456.aBoolean188) {
					if (local126 != 0) {
						local443.method1418(local126);
					}
					if (local128 != 0) {
						local443.method1419(local128);
					}
					if (local130 != 0) {
						local443.method1432(0, local130, 0);
					}
				}
			}
		}
		if (local443 != null) {
			local51 = ((Class5_Sub3_Sub1) local51).method1444(local443);
		}
		if (this.aClass2_Sub3_Sub9_1.anInt1284 == 1) {
			local51.aBoolean65 = true;
		}
		local51.method3779(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
	}

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "()I")
	@Override
	public int method3773() {
		return super.anInt1844;
	}
}
