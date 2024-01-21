import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!eh", name = "q", descriptor = "Lclient!ef;")
	public static Class20 aClass20_4 = null;

	@OriginalMember(owner = "client!eh", name = "u", descriptor = "I")
	public static int anInt1322 = 0;

	@OriginalMember(owner = "client!eh", name = "y", descriptor = "Lclient!ea;")
	public static Class18 aClass18_319 = Static8.method128("Um ein neues Spielkonto zu erstellen)1 m-Ussen Sie");

	@OriginalMember(owner = "client!eh", name = "A", descriptor = "I")
	public static int anInt1326 = 0;

	@OriginalMember(owner = "client!eh", name = "C", descriptor = "Lclient!ea;")
	public static Class18 aClass18_320 = Static8.method128("<img=0>");

	@OriginalMember(owner = "client!eh", name = "I", descriptor = "Lclient!ea;")
	public static Class18 aClass18_321 = Static8.method128("oberen Rand der Webseite ausw-=hlen)3");

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIIII)V")
	public static void method817(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(1) int local1 = 0; local1 < Static180.anInt4780; local1++) {
			if (Static24.anIntArray49[local1] + Static146.anIntArray376[local1] > arg1 && arg0 + arg1 > Static146.anIntArray376[local1] && arg2 < Static97.anIntArray265[local1] + Static154.anIntArray391[local1] && arg3 + arg2 > Static97.anIntArray265[local1]) {
				Static88.aBooleanArray8[local1] = true;
			}
		}
	}

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "(IIIII)V")
	public static void method818(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static45.anInt1554 == 1) {
			Static155.aClass1_Sub1_Sub8_Sub3Array9[Static62.anInt1927 / 100].method1659(Static35.anInt668 - 8, Static61.anInt1872 + -8);
		}
		if (Static45.anInt1554 == 2) {
			Static155.aClass1_Sub1_Sub8_Sub3Array9[Static62.anInt1927 / 100 + 4].method1659(Static35.anInt668 - 8, Static61.anInt1872 - 8);
		}
		Static136.method2600();
		if (!Static135.aBoolean168) {
			return;
		}
		@Pc(56) int local56 = arg2 + 512 - 5;
		@Pc(60) int local60 = arg1 + 20;
		Static37.aClass1_Sub1_Sub8_Sub2_Sub1_12.method2012(Static144.method2735(new Class18[] { Static52.aClass18_415, Static132.method2564(Static35.anInt673) }), local56, local60, 16776960, -1);
		@Pc(81) int local81 = local60 + 15;
		@Pc(83) Runtime local83 = Runtime.getRuntime();
		@Pc(93) int local93 = (int) ((local83.totalMemory() - local83.freeMemory()) / 1024L);
		@Pc(95) int local95 = 16776960;
		if (local93 > 32768 && Static27.aBoolean26) {
			local95 = 16711680;
		}
		if (local93 > 65536 && !Static27.aBoolean26) {
			local95 = 16711680;
		}
		Static37.aClass1_Sub1_Sub8_Sub2_Sub1_12.method2012(Static144.method2735(new Class18[] { Static148.aClass18_1047, Static132.method2564(local93), Static75.aClass18_550 }), local56, local81, local95, -1);
		local60 = local81 + 15;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(ZI)V")
	public static void method819(@OriginalArg(1) int arg0) {
		@Pc(11) Class1_Sub14 local11 = (Class1_Sub14) Static17.aClass14_8.method569((long) arg0);
		if (local11 != null) {
			local11.method3198();
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(B)V")
	public static void method820() {
		aClass18_321 = null;
		aClass20_4 = null;
		aClass18_319 = null;
		aClass18_320 = null;
	}
}
