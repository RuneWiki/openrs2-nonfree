import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!cn", name = "d", descriptor = "Lclient!pn;")
	public static final Class194 aClass194_14 = new Class194(44, 2);

	@OriginalMember(owner = "client!cn", name = "j", descriptor = "Lclient!jp;")
	public static final Class129 aClass129_23 = new Class129(37, 5);

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(IIIIZ[B)Z")
	public static boolean method932(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) byte[] arg4) {
		@Pc(7) boolean local7 = true;
		@Pc(12) Class5_Sub15 local12 = new Class5_Sub15(arg4);
		@Pc(14) int local14 = -1;
		label54: while (true) {
			@Pc(18) int local18 = local12.method5592();
			if (local18 == 0) {
				return local7;
			}
			local14 += local18;
			@Pc(29) int local29 = 0;
			@Pc(31) boolean local31 = false;
			while (true) {
				@Pc(37) int local37;
				while (!local31) {
					local37 = local12.method5542();
					if (local37 == 0) {
						continue label54;
					}
					local29 += local37 - 1;
					@Pc(64) int local64 = local29 & 0x3F;
					@Pc(70) int local70 = local29 >> 6 & 0x3F;
					@Pc(76) int local76 = local12.method5539() >> 2;
					@Pc(80) int local80 = local70 + arg1;
					@Pc(84) int local84 = local64 + arg0;
					if (local80 > 0 && local84 > 0 && arg3 - 1 > local80 && arg2 - 1 > local84) {
						@Pc(113) Class114 local113 = Static398.aClass256_4.method5782(local14);
						if (local76 != 22 || Static216.aClass1_Sub1_1.aBoolean300 || local113.anInt3001 != 0 || local113.anInt2991 == 1 || local113.aBoolean189) {
							local31 = true;
							if (!local113.method2408()) {
								local7 = false;
								Static198.anInt3281++;
							}
						}
					}
				}
				local37 = local12.method5542();
				if (local37 == 0) {
					break;
				}
				local12.method5539();
			}
		}
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(B)V")
	public static void method934() {
		Static440.aClient1.method875();
		Static281.aClass5_Sub15_Sub2_13.anInt7013 = 0;
		Static304.aClass129_129 = null;
		Static227.anInt3788 = 0;
		Static76.aClass5_Sub15_Sub2_1.anInt7013 = 0;
		Static285.aClass129_114 = null;
		Static445.aClass129_65 = null;
		Static279.aClass129_109 = null;
		Static299.anInt4665 = 0;
		for (@Pc(28) int local28 = 0; local28 < 100; local28++) {
			Static366.aStringArray42[local28] = null;
		}
		Static244.anInt3937 = 0;
		Static310.anInt4816 = 0;
		Static58.aString4 = null;
		Static406.anInt6806 = 0;
		Static244.anInt3939 = 0;
		Static349.aClass124Array1 = null;
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(II)Lclient!sc;")
	public static Class220 method936(@OriginalArg(0) int arg0) {
		@Pc(6) Class220[] local6 = Static30.method479();
		for (@Pc(8) int local8 = 0; local8 < local6.length; local8++) {
			if (arg0 == local6[local8].anInt5969) {
				return local6[local8];
			}
		}
		return null;
	}
}
