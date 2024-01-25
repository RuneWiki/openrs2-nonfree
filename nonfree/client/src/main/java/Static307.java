import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static307 {

	@OriginalMember(owner = "client!lg", name = "r", descriptor = "Lclient!r;")
	public static Class100 aClass100_6;

	@OriginalMember(owner = "client!lg", name = "A", descriptor = "F")
	public static float aFloat150;

	@OriginalMember(owner = "client!lg", name = "k", descriptor = "Lclient!rga;")
	public static final Class286 aClass286_102 = new Class286(80, 5);

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "(I)V")
	public static void method4575() {
		if (aClass100_6 == null) {
			return;
		}
		Static380.aClass109_7.method2311();
		Static309.method4629();
		Static361.method6164();
		Static231.method3611();
		Static35.method631();
		Static494.method6904();
		if (Static459.aClass326_1 != null) {
			Static459.aClass326_1.method7195();
		}
		Static63.method1021();
		Static542.method7382();
		Static381.method5874();
		Static316.method4923();
		Static298.method4515(false);
		for (@Pc(45) int local45 = 0; local45 < 2048; local45++) {
			@Pc(51) Class6_Sub1_Sub1_Sub1_Sub2 local51 = Static136.aClass6_Sub1_Sub1_Sub1_Sub2Array1[local45];
			if (local51 != null) {
				for (@Pc(55) int local55 = 0; local55 < local51.aClass66Array3.length; local55++) {
					local51.aClass66Array3[local55] = null;
				}
			}
		}
		for (@Pc(74) int local74 = 0; local74 < Static31.anInt820; local74++) {
			@Pc(81) Class6_Sub1_Sub1_Sub1_Sub1 local81 = Static223.aClass2_Sub32Array1[local74].aClass6_Sub1_Sub1_Sub1_Sub1_1;
			if (local81 != null) {
				for (@Pc(85) int local85 = 0; local85 < local81.aClass66Array3.length; local85++) {
					local81.aClass66Array3[local85] = null;
				}
			}
		}
		Static46.aClass68_1 = null;
		Static509.aClass68_7 = null;
		aClass100_6.method6262();
		aClass100_6 = null;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(II)I")
	public static int method4576(@OriginalArg(1) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local14;
		if (local14 > local23) {
			local32 = local23;
		}
		if (local30 < local32) {
			local32 = local30;
		}
		@Pc(46) double local46 = local14;
		if (local23 > local14) {
			local46 = local23;
		}
		if (local30 > local46) {
			local46 = local30;
		}
		@Pc(60) double local60 = 0.0D;
		@Pc(62) double local62 = 0.0D;
		@Pc(68) double local68 = (local32 + local46) / 2.0D;
		if (local32 != local46) {
			if (local68 < 0.5D) {
				local62 = (local46 - local32) / (local32 + local46);
			}
			if (local46 == local14) {
				local60 = (local23 - local30) / (-local32 + local46);
			} else if (local46 == local23) {
				local60 = (local30 - local14) / (-local32 + local46) + 2.0D;
			} else if (local46 == local30) {
				local60 = (local14 - local23) / (-local32 + local46) + 4.0D;
			}
			if (local68 >= 0.5D) {
				local62 = (local46 - local32) / ((2.0D - local46) - local32);
			}
		}
		local60 /= 6.0D;
		@Pc(156) int local156 = (int) (local60 * 256.0D);
		@Pc(161) int local161 = (int) (local62 * 256.0D);
		if (local161 < 0) {
			local161 = 0;
		} else if (local161 > 255) {
			local161 = 255;
		}
		@Pc(180) int local180 = (int) (local68 * 256.0D);
		if (local180 < 0) {
			local180 = 0;
		} else if (local180 > 255) {
			local180 = 255;
		}
		if (local180 > 243) {
			local161 >>= 0x4;
		} else if (local180 > 217) {
			local161 >>= 0x3;
		} else if (local180 > 192) {
			local161 >>= 0x2;
		} else if (local180 > 179) {
			local161 >>= 0x1;
		}
		return (local180 >> 1) + ((local156 & 0xFF) >> 2 << 10) + (local161 >> 5 << 7);
	}
}
