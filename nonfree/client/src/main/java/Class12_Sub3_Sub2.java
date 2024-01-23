import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rf")
public final class Class12_Sub3_Sub2 extends Class12_Sub3 {

	@OriginalMember(owner = "client!rf", name = "Hb", descriptor = "Lclient!lf;")
	public Class2_Sub2_Sub12 aClass2_Sub2_Sub12_1;

	@OriginalMember(owner = "client!rf", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method2727() {
		return this.aClass2_Sub2_Sub12_1 != null;
	}

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "()I")
	@Override
	public int method2718() {
		return super.anInt3936;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method2715(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (this.aClass2_Sub2_Sub12_1 == null) {
			return;
		}
		@Pc(22) Class2_Sub2_Sub9 local22 = super.anInt3910 != -1 && super.anInt3965 == 0 ? Static14.method299(super.anInt3910) : null;
		@Pc(45) Class2_Sub2_Sub9 local45 = super.anInt3935 == -1 || super.anInt3934 == super.anInt3935 && local22 != null ? null : Static14.method299(super.anInt3935);
		@Pc(56) Class12_Sub2 local56 = this.aClass2_Sub2_Sub12_1.method1905(local45, super.anInt3955, super.anInt3930, local22);
		if (local56 == null) {
			return;
		}
		super.anInt3936 = local56.method2718();
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		@Pc(69) int local69 = 0;
		if (this.aClass2_Sub2_Sub12_1.aShort43 != 0 && this.aClass2_Sub2_Sub12_1.aShort42 != 0) {
			@Pc(81) int local81 = Class79.anIntArray377[arg0];
			@Pc(85) int local85 = Class79.anIntArray375[arg0];
			@Pc(89) short local89 = this.aClass2_Sub2_Sub12_1.aShort43;
			@Pc(93) short local93 = this.aClass2_Sub2_Sub12_1.aShort42;
			@Pc(98) int local98 = -local89 / 2;
			@Pc(103) int local103 = -local93 / 2;
			@Pc(114) int local114 = local85 * local103 - local81 * local98 >> 16;
			@Pc(124) int local124 = local98 * local85 + local81 * local103 >> 16;
			@Pc(137) int local137 = Static212.method3261(super.anInt3961 + local124, local114 + super.anInt3949, Static134.anInt3147);
			@Pc(141) int local141 = local89 / 2;
			@Pc(146) int local146 = -local93 / 2;
			@Pc(156) int local156 = local85 * local141 + local81 * local146 >> 16;
			@Pc(167) int local167 = local146 * local85 - local141 * local81 >> 16;
			@Pc(179) int local179 = Static212.method3261(local156 + super.anInt3961, local167 + super.anInt3949, Static134.anInt3147);
			@Pc(184) int local184 = -local89 / 2;
			@Pc(188) int local188 = local93 / 2;
			@Pc(198) int local198 = local85 * local184 + local188 * local81 >> 16;
			@Pc(209) int local209 = local188 * local85 - local81 * local184 >> 16;
			@Pc(213) int local213 = local89 / 2;
			@Pc(217) int local217 = local93 / 2;
			@Pc(227) int local227 = local81 * local217 + local85 * local213 >> 16;
			@Pc(241) int local241 = Static212.method3261(super.anInt3961 + local198, super.anInt3949 - -local209, Static134.anInt3147);
			@Pc(252) int local252 = local85 * local217 - local81 * local213 >> 16;
			@Pc(265) int local265 = Static212.method3261(super.anInt3961 + local227, super.anInt3949 - -local252, Static134.anInt3147);
			local69 = local265 + local137;
			if (local69 > local179 + local241) {
				local69 = local179 + local241;
			}
			@Pc(290) int local290 = local265 <= local179 ? local265 : local179;
			@Pc(301) int local301 = local137 < local179 ? local137 : local179;
			@Pc(308) int local308 = local137 < local241 ? local137 : local241;
			@Pc(315) int local315 = local265 <= local241 ? local265 : local241;
			local65 = (int) (Math.atan2((double) (local301 - local315), (double) local93) * 325.95D) & 0x7FF;
			if (local65 != 0) {
				local56.method1866(local65);
			}
			local67 = (int) (Math.atan2((double) (local308 - local290), (double) local89) * 325.95D) & 0x7FF;
			if (local67 != 0) {
				local56.method1860(local67);
			}
			local69 = (local69 >> 1) - super.anInt3926;
			if (local69 != 0) {
				local56.method1849(0, local69, 0);
			}
		}
		@Pc(376) Class12_Sub2 local376 = null;
		if (super.anInt3911 != -1 && super.anInt3908 != -1) {
			@Pc(389) Class2_Sub2_Sub5 local389 = Static56.method1110(super.anInt3911);
			local376 = local389.method565(super.anInt3908);
			if (local376 != null) {
				local376.method1849(0, -super.anInt3953, 0);
				if (local389.aBoolean37) {
					if (local65 != 0) {
						local376.method1866(local65);
					}
					if (local67 != 0) {
						local376.method1860(local67);
					}
					if (local69 != 0) {
						local376.method1849(0, local69, 0);
					}
				}
			}
		}
		if (local376 != null) {
			local56 = ((Class12_Sub2_Sub1) local56).method1880(local376);
		}
		if (this.aClass2_Sub2_Sub12_1.anInt2676 == 1) {
			local56.aBoolean139 = true;
		}
		local56.method2715(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
	}
}
