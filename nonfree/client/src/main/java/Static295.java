import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static295 {

	@OriginalMember(owner = "client!qt", name = "v", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray71;

	@OriginalMember(owner = "client!qt", name = "x", descriptor = "[[[J")
	public static long[][][] aLongArrayArrayArray1;

	@OriginalMember(owner = "client!qt", name = "y", descriptor = "I")
	public static int anInt5083;

	@OriginalMember(owner = "client!qt", name = "m", descriptor = "Lclient!sh;")
	public static final Class211 aClass211_127 = new Class211(71, 10);

	@OriginalMember(owner = "client!qt", name = "r", descriptor = "J")
	public static long aLong167 = -1L;

	@OriginalMember(owner = "client!qt", name = "t", descriptor = "Lclient!o;")
	public static final Class169 aClass169_279 = new Class169("Loading textures - ", "Lade Texturen - ", "Chargement des textures - ", "Carregando texturas - ");

	@OriginalMember(owner = "client!qt", name = "u", descriptor = "I")
	public static final int anInt5082 = 2;

	@OriginalMember(owner = "client!qt", name = "w", descriptor = "Lclient!o;")
	public static final Class169 aClass169_280 = new Class169("Opened title screen", "Titelbild geöffnet.", "Écran-titre ouvert", "Tela título aberta");

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(IBI)Lclient!lt;")
	public static Class1_Sub6_Sub11 method4455(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class1_Sub6_Sub11 local15 = (Class1_Sub6_Sub11) Static333.aClass77_3.method1368((long) arg0 | (long) arg1 << 32);
		if (local15 == null) {
			local15 = new Class1_Sub6_Sub11(arg1, arg0);
			Static333.aClass77_3.method1370(local15.aLong207, local15);
		}
		return local15;
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(IIIII)V")
	public static void method4456(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(18) Class1_Sub18 local18 = (Class1_Sub18) Static67.aClass17_11.method202(); local18 != null; local18 = (Class1_Sub18) Static67.aClass17_11.method207()) {
			Static115.method1700(arg3, local18, arg1, arg2, arg0);
		}
		for (@Pc(39) Class1_Sub18 local39 = (Class1_Sub18) Static102.aClass17_30.method202(); local39 != null; local39 = (Class1_Sub18) Static102.aClass17_30.method207()) {
			@Pc(43) byte local43 = 1;
			@Pc(48) Class8 local48 = local39.aClass25_Sub1_Sub1_Sub2_1.method1880();
			if (local39.aClass25_Sub1_Sub1_Sub2_1.aBoolean191) {
				local43 = 0;
			} else if (local48.anInt128 == local39.aClass25_Sub1_Sub1_Sub2_1.anInt2340 || local48.anInt138 == local39.aClass25_Sub1_Sub1_Sub2_1.anInt2340 || local48.anInt150 == local39.aClass25_Sub1_Sub1_Sub2_1.anInt2340 || local48.anInt133 == local39.aClass25_Sub1_Sub1_Sub2_1.anInt2340) {
				local43 = 2;
			} else if (local39.aClass25_Sub1_Sub1_Sub2_1.anInt2340 == local48.anInt151 || local39.aClass25_Sub1_Sub1_Sub2_1.anInt2340 == local48.anInt137 || local39.aClass25_Sub1_Sub1_Sub2_1.anInt2340 == local48.anInt122 || local48.anInt145 == local39.aClass25_Sub1_Sub1_Sub2_1.anInt2340) {
				local43 = 3;
			}
			if (local43 != local39.anInt2862) {
				@Pc(143) int local143 = Static179.method2590(local39.aClass25_Sub1_Sub1_Sub2_1);
				if (local39.anInt2859 != local143) {
					if (local39.aClass1_Sub7_Sub2_2 != null) {
						Static366.aClass1_Sub7_Sub4_2.method4410(local39.aClass1_Sub7_Sub2_2);
						local39.aClass1_Sub7_Sub2_2 = null;
					}
					local39.anInt2859 = local143;
				}
				local39.anInt2862 = local43;
			}
			local39.anInt2854 = local39.aClass25_Sub1_Sub1_Sub2_1.anInt6080;
			local39.anInt2863 = local39.aClass25_Sub1_Sub1_Sub2_1.anInt6080 + local39.aClass25_Sub1_Sub1_Sub2_1.method1877() * 64;
			local39.anInt2855 = local39.aClass25_Sub1_Sub1_Sub2_1.anInt6077;
			local39.anInt2851 = local39.aClass25_Sub1_Sub1_Sub2_1.anInt6077 + local39.aClass25_Sub1_Sub1_Sub2_1.method1877() * 64;
			Static115.method1700(arg3, local39, arg1, arg2, arg0);
		}
		for (@Pc(220) Class1_Sub18 local220 = (Class1_Sub18) Static48.aClass77_4.method1359(); local220 != null; local220 = (Class1_Sub18) Static48.aClass77_4.method1360()) {
			@Pc(224) byte local224 = 1;
			@Pc(229) Class8 local229 = local220.aClass25_Sub1_Sub1_Sub1_1.method1880();
			if (local220.aClass25_Sub1_Sub1_Sub1_1.aBoolean191) {
				local224 = 0;
			} else if (local220.aClass25_Sub1_Sub1_Sub1_1.anInt2340 == local229.anInt128 || local220.aClass25_Sub1_Sub1_Sub1_1.anInt2340 == local229.anInt138 || local220.aClass25_Sub1_Sub1_Sub1_1.anInt2340 == local229.anInt150 || local229.anInt133 == local220.aClass25_Sub1_Sub1_Sub1_1.anInt2340) {
				local224 = 2;
			} else if (local220.aClass25_Sub1_Sub1_Sub1_1.anInt2340 == local229.anInt151 || local229.anInt137 == local220.aClass25_Sub1_Sub1_Sub1_1.anInt2340 || local220.aClass25_Sub1_Sub1_Sub1_1.anInt2340 == local229.anInt122 || local229.anInt145 == local220.aClass25_Sub1_Sub1_Sub1_1.anInt2340) {
				local224 = 3;
			}
			if (local224 != local220.anInt2862) {
				@Pc(312) int local312 = Static182.method2612(local220.aClass25_Sub1_Sub1_Sub1_1);
				if (local220.anInt2859 != local312) {
					if (local220.aClass1_Sub7_Sub2_2 != null) {
						Static366.aClass1_Sub7_Sub4_2.method4410(local220.aClass1_Sub7_Sub2_2);
						local220.aClass1_Sub7_Sub2_2 = null;
					}
					local220.anInt2859 = local312;
				}
				local220.anInt2862 = local224;
			}
			local220.anInt2854 = local220.aClass25_Sub1_Sub1_Sub1_1.anInt6080;
			local220.anInt2863 = local220.aClass25_Sub1_Sub1_Sub1_1.anInt6080 + local220.aClass25_Sub1_Sub1_Sub1_1.method1877() * 64;
			local220.anInt2855 = local220.aClass25_Sub1_Sub1_Sub1_1.anInt6077;
			local220.anInt2851 = local220.aClass25_Sub1_Sub1_Sub1_1.anInt6077 + local220.aClass25_Sub1_Sub1_Sub1_1.method1877() * 64;
			Static115.method1700(arg3, local220, arg1, arg2, arg0);
		}
	}
}
