import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static193 {

	@OriginalMember(owner = "client!mc", name = "i", descriptor = "Lclient!bt;")
	public static final Class21 aClass21_107 = new Class21(128);

	@OriginalMember(owner = "client!mc", name = "p", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray22 = new String[100];

	@OriginalMember(owner = "client!mc", name = "t", descriptor = "I")
	public static int anInt3885 = 1;

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(ZI)V")
	public static void method3625(@OriginalArg(1) int arg0) {
		@Pc(8) Class1_Sub4_Sub17 local8 = Static132.method2717(arg0, 8);
		local8.method3481();
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(FZIIIIIII)[[I")
	public static int[][] method3626(@OriginalArg(0) float arg0) {
		@Pc(9) int[][] local9 = new int[256][64];
		@Pc(13) Class1_Sub1_Sub4 local13 = new Class1_Sub1_Sub4();
		local13.anInt277 = 8;
		local13.anInt271 = 3;
		local13.anInt265 = (int) (arg0 * 4096.0F);
		local13.aBoolean14 = false;
		local13.anInt272 = 4;
		local13.method6008();
		Static264.method4800(256, 64);
		for (@Pc(45) int local45 = 0; local45 < 256; local45++) {
			local13.method316(local45, local9[local45]);
		}
		return local9;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIIIII)V")
	public static void method3627(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static363.anInt6978 = arg0;
		Static133.anInt2876 = arg4;
		Static144.anInt3083 = arg1;
		Static116.anInt2536 = arg3;
		Static31.anInt789 = arg2;
		if (Static31.anInt789 >= 100) {
			@Pc(29) int local29 = Static144.anInt3083 * 128 + 64;
			@Pc(35) int local35 = Static116.anInt2536 * 128 + 64;
			@Pc(43) int local43 = Static8.method288(Static284.anInt6477, local29, local35) - Static363.anInt6978;
			@Pc(48) int local48 = local29 - Static14.anInt4971;
			@Pc(52) int local52 = local43 - Static294.anInt5665;
			@Pc(57) int local57 = local35 - Static260.anInt5192;
			@Pc(69) int local69 = (int) Math.sqrt((double) (local48 * local48 + local57 * local57));
			Static272.anInt5295 = (int) (Math.atan2((double) local52, (double) local69) * 2607.5945876176133D) & 0x3FFF;
			Static320.anInt4362 = (int) (-2607.5945876176133D * Math.atan2((double) local48, (double) local57)) & 0x3FFF;
			Static129.anInt2810 = 0;
			if (Static272.anInt5295 < 1024) {
				Static272.anInt5295 = 1024;
			}
			if (Static272.anInt5295 > 3072) {
				Static272.anInt5295 = 3072;
			}
		}
		Static50.anInt1273 = 2;
	}
}
