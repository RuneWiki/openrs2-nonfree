import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static170 {

	@OriginalMember(owner = "client!je", name = "Kc", descriptor = "Lclient!nt;")
	public static Class168 aClass168_1;

	@OriginalMember(owner = "client!je", name = "Hc", descriptor = "Lclient!o;")
	public static final Class169 aClass169_158 = new Class169("Loaded textures", "Texturen geladen.", "Textures chargées", "Texturas carregadas");

	@OriginalMember(owner = "client!je", name = "Vc", descriptor = "Z")
	public static boolean aBoolean275 = false;

	@OriginalMember(owner = "client!je", name = "bd", descriptor = "Lclient!sh;")
	public static final Class211 aClass211_77 = new Class211(2, 15);

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(II)V")
	public static void method2503(@OriginalArg(1) int arg0) {
		@Pc(8) Class1_Sub6_Sub11 local8 = Static295.method4455(arg0, 5);
		local8.method2998();
	}

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(II)V")
	public static void method2509(@OriginalArg(0) int arg0) {
		@Pc(8) int local8 = Static366.anInt5883 - Static315.anInt5365;
		if (local8 >= 100) {
			Static323.anInt5463 = 1;
			return;
		}
		@Pc(22) int local22 = (int) Static19.aFloat1;
		if (local22 < Static177.anInt1356 >> 8) {
			local22 = Static177.anInt1356 >> 8;
		}
		if (Static50.aBooleanArray4[4] && Static305.anIntArray613[4] + 128 > local22) {
			local22 = Static305.anIntArray613[4] + 128;
		}
		@Pc(60) int local60 = (int) Static386.aFloat82 + Static284.anInt4918 & 0x3FFF;
		Static281.method4291((local22 >> 3) * 3 + 600, Static305.anInt5159, local60, local22, Static92.anInt1674, arg0, Static236.method3260(Static122.anInt2188, Static321.aClass25_Sub1_Sub1_Sub1_2.anInt6077, Static321.aClass25_Sub1_Sub1_Sub1_2.anInt6080) - 50);
		@Pc(103) float local103 = 1.0F - (float) ((100 - local8) * (-local8 + 100) * (100 - local8)) / 1000000.0F;
		Static133.anInt2471 = (int) ((float) Static180.anInt3211 + (float) (Static133.anInt2471 - Static180.anInt3211) * local103);
		Static311.anInt5293 = (int) (local103 * (float) (Static311.anInt5293 - Static364.anInt6053) + (float) Static364.anInt6053);
		Static337.anInt5598 = (int) (local103 * (float) (Static337.anInt5598 - Static186.anInt3273) + (float) Static186.anInt3273);
		Static256.anInt4409 = (int) ((float) Static392.anInt6401 + local103 * (float) (Static256.anInt4409 - Static392.anInt6401));
		@Pc(154) int local154 = Static155.anInt2834 - Static17.anInt296;
		if (local154 > 8192) {
			local154 -= 16384;
		} else if (local154 < -8192) {
			local154 += 16384;
		}
		Static155.anInt2834 = (int) ((float) local154 * local103 + (float) Static17.anInt296);
		Static155.anInt2834 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IC)Z")
	public static boolean method2510(@OriginalArg(1) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}
}
