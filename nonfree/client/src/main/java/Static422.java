import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static422 {

	@OriginalMember(owner = "client!oaa", name = "W", descriptor = "Lclient!paa;")
	public static Class273 aClass273_1;

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(III)I")
	public static int method5864(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) byte local15;
		if (arg1 > 20000) {
			Static486.method6643();
			local15 = 4;
		} else if (arg1 > 10000) {
			local15 = 3;
			Static331.method4564();
		} else if (arg1 <= 5000) {
			local15 = 1;
			Static539.method7210();
		} else {
			local15 = 2;
			Static38.method7844();
		}
		if (Static124.aClass4_Sub20_4.aClass8_Sub13_2.method5052() != arg0) {
			Static124.aClass4_Sub20_4.method3147(Static124.aClass4_Sub20_4.aClass8_Sub13_1, arg0);
			Static46.method825(arg0, false);
		}
		Static361.method4808();
		return local15;
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(Lclient!bt;Lclient!qq;Lclient!nj;Lclient!bt;ILclient!bt;)Z")
	public static boolean method5868(@OriginalArg(0) Class34 arg0, @OriginalArg(1) Class4_Sub3_Sub4 arg1, @OriginalArg(2) Class64 arg2, @OriginalArg(3) Class34 arg3, @OriginalArg(5) Class34 arg4) {
		Static105.aClass34_24 = arg0;
		Static148.aClass34_35 = arg3;
		Static26.aClass64_2 = arg2;
		Static570.aClass4_Sub3_Sub4_6 = arg1;
		Static475.anIntArray511 = new int[16];
		Static245.aClass34_106 = arg4;
		for (@Pc(28) int local28 = 0; local28 < 16; local28++) {
			Static475.anIntArray511[local28] = 255;
		}
		return true;
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(B)V")
	public static void method5869() {
		if (Static582.aClass33_13 == null) {
			return;
		}
		if (Static423.aBoolean517) {
			Static650.method8677();
		}
		Static419.aClass223_4.method4810();
		Static305.method4281();
		Static67.method1453();
		Static162.method2595();
		Static147.method7908();
		Static615.method8046();
		if (Static596.aClass332_1 != null) {
			Static596.aClass332_1.method7313();
		}
		Static387.method4997();
		Static424.method5891();
		Static151.method2617();
		Static300.method4219();
		Static90.method7669(false);
		for (@Pc(41) int local41 = 0; local41 < 2048; local41++) {
			@Pc(47) Class3_Sub1_Sub2_Sub2_Sub1 local47 = Static180.aClass3_Sub1_Sub2_Sub2_Sub1Array20[local41];
			if (local47 != null) {
				for (@Pc(51) int local51 = 0; local51 < local47.aClass62Array3.length; local51++) {
					local47.aClass62Array3[local51] = null;
				}
			}
		}
		for (@Pc(70) int local70 = 0; local70 < Static15.anInt1571; local70++) {
			@Pc(77) Class3_Sub1_Sub2_Sub2_Sub2 local77 = Static238.aClass4_Sub45Array1[local70].aClass3_Sub1_Sub2_Sub2_Sub2_2;
			if (local77 != null) {
				for (@Pc(81) int local81 = 0; local81 < local77.aClass62Array3.length; local81++) {
					local77.aClass62Array3[local81] = null;
				}
			}
		}
		Static149.aClass92_2 = null;
		Static440.aClass92_7 = null;
		Static582.aClass33_13.method8070();
		Static582.aClass33_13 = null;
	}
}
