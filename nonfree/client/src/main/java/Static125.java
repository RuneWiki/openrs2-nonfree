import java.awt.Container;
import java.awt.Insets;
import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static125 {

	@OriginalMember(owner = "client!ea", name = "A", descriptor = "I")
	public static int anInt2536;

	@OriginalMember(owner = "client!ea", name = "q", descriptor = "I")
	public static int anInt2530 = 2;

	@OriginalMember(owner = "client!ea", name = "I", descriptor = "Lclient!ie;")
	public static Class5_Sub29 aClass5_Sub29_1 = null;

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(BLjava/io/File;)[B")
	public static byte[] method2265(@OriginalArg(1) File arg0) {
		return Static281.method4527(arg0, (int) arg0.length());
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIILclient!uaa;)V")
	public static void method2266(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class345 arg2) {
		Static300.anInt10358 = arg1;
		Static469.anInt7908 = arg0;
		Static233.aClass345_4 = arg2;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lclient!lq;IIIII)V")
	public static void method2267(@OriginalArg(0) Class28_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != Static219.anInt4088) {
				for (@Pc(23) int local23 = local3; local23 <= local7; local23++) {
					if (local23 >= 0 && local23 < Static216.anInt4042) {
						for (@Pc(32) int local32 = local11; local32 <= local15; local32++) {
							if (local32 >= 0 && local32 < Static233.anInt4238 && (!local1 || local23 >= local7 || local32 >= local15 || local32 < arg3 && local23 != arg2)) {
								@Pc(62) Class226 local62 = Static635.aClass226ArrayArrayArray3[local17][local23][local32];
								if (local62 != null) {
									@Pc(148) int local148 = (Static495.aClass109Array4[local17].method7695(local32, local23) + Static495.aClass109Array4[local17].method7695(local32, local23 + 1) + Static495.aClass109Array4[local17].method7695(local32 + 1, local23) + Static495.aClass109Array4[local17].method7695(local32 + 1, local23 + 1)) / 4 - (Static495.aClass109Array4[arg1].method7695(arg3, arg2) + Static495.aClass109Array4[arg1].method7695(arg3, arg2 + 1) + Static495.aClass109Array4[arg1].method7695(arg3 + 1, arg2) + Static495.aClass109Array4[arg1].method7695(arg3 + 1, arg2 + 1)) / 4;
									@Pc(151) Class28_Sub1_Sub5 local151 = local62.aClass28_Sub1_Sub5_2;
									@Pc(154) Class28_Sub1_Sub5 local154 = local62.aClass28_Sub1_Sub5_1;
									if (local151 != null && local151.method8973()) {
										arg0.method8969(local1, (local23 - arg2) * Static671.anInt10769 + (1 - arg4) * Static558.anInt7322, local151, Static10.aClass65_1, local148, (local32 - arg3) * Static671.anInt10769 + (1 - arg5) * Static558.anInt7322);
									}
									if (local154 != null && local154.method8973()) {
										arg0.method8969(local1, (local23 - arg2) * Static671.anInt10769 + (1 - arg4) * Static558.anInt7322, local154, Static10.aClass65_1, local148, (local32 - arg3) * Static671.anInt10769 + (1 - arg5) * Static558.anInt7322);
									}
									for (@Pc(227) Class41 local227 = local62.aClass41_3; local227 != null; local227 = local227.aClass41_2) {
										@Pc(231) Class28_Sub1_Sub4 local231 = local227.aClass28_Sub1_Sub4_1;
										if (local231 != null && local231.method8973() && (local23 == local231.aShort124 || local23 == local3) && (local32 == local231.aShort121 || local32 == local11)) {
											@Pc(260) int local260 = local231.aShort122 + 1 - local231.aShort124;
											@Pc(268) int local268 = local231.aShort123 + 1 - local231.aShort121;
											arg0.method8969(local1, (local231.aShort124 - arg2) * Static671.anInt10769 + (local260 - arg4) * Static558.anInt7322, local231, Static10.aClass65_1, local148, (local231.aShort121 - arg3) * Static671.anInt10769 + (local268 - arg5) * Static558.anInt7322);
										}
									}
								}
							}
						}
					}
				}
				local3--;
				local1 = false;
			}
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(ZIIIII)V")
	public static void method2270(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static625.aFrame3 != null && (arg1 != 3 || Static222.anInt4110 != arg2 || arg4 != Static236.anInt4292)) {
			Static312.method4926(Static570.aClass268_5, Static625.aFrame3);
			Static625.aFrame3 = null;
		}
		if (arg1 == 3 && Static625.aFrame3 == null) {
			Static625.aFrame3 = Static164.method2896(0, arg4, Static570.aClass268_5, arg2);
			if (Static625.aFrame3 != null) {
				Static222.anInt4110 = arg2;
				Static236.anInt4292 = arg4;
				Static102.method1995();
			}
		}
		if (arg1 == 3 && Static625.aFrame3 == null) {
			method2270(true, Static172.aClass5_Sub50_14.aClass12_Sub9_2.method2337(), -1, arg3, -1);
			return;
		}
		@Pc(66) Container local66;
		@Pc(76) Insets local76;
		if (Static625.aFrame3 != null) {
			local66 = Static625.aFrame3;
			Static255.anInt4665 = arg2;
			Static89.anInt2047 = arg4;
		} else if (Static147.aFrame1 == null) {
			if (Static639.anApplet2 == null) {
				local66 = Static556.anApplet_Sub1_1;
			} else {
				local66 = Static639.anApplet2;
			}
			Static255.anInt4665 = local66.getSize().width;
			Static89.anInt2047 = local66.getSize().height;
		} else {
			local76 = Static147.aFrame1.getInsets();
			Static255.anInt4665 = Static147.aFrame1.getSize().width - local76.right - local76.left;
			Static89.anInt2047 = Static147.aFrame1.getSize().height - local76.top - local76.bottom;
			local66 = Static147.aFrame1;
		}
		if (arg1 == 1) {
			Static32.anInt510 = Static613.anInt10005;
			Static67.anInt1003 = (Static255.anInt4665 - Static613.anInt10005) / 2;
			Static47.anInt693 = 0;
			Static79.anInt1140 = Static10.anInt152;
		} else {
			Static213.method8059();
		}
		if (Static560.aClass187_13 != Static217.aClass187_7) {
			@Pc(149) boolean local149;
			if (Static32.anInt510 < 1024 && Static79.anInt1140 < 768) {
				local149 = true;
			} else {
				local149 = false;
			}
		}
		if (arg0) {
			Static645.method8709();
		} else {
			Static141.aCanvas7.setSize(Static32.anInt510, Static79.anInt1140);
			if (Static66.aBoolean570) {
				Static614.method8347(Static141.aCanvas7);
			} else {
				Static208.aClass65_7.method6950(Static141.aCanvas7, Static32.anInt510, Static79.anInt1140);
			}
			if (local66 == Static147.aFrame1) {
				local76 = Static147.aFrame1.getInsets();
				Static141.aCanvas7.setLocation(Static67.anInt1003 + local76.left, local76.top + Static47.anInt693);
			} else {
				Static141.aCanvas7.setLocation(Static67.anInt1003, Static47.anInt693);
			}
		}
		if (arg1 >= 2) {
			Static150.aBoolean258 = true;
		} else {
			Static150.aBoolean258 = false;
		}
		if (Static84.anInt2018 != -1) {
			Static35.method492(true);
		}
		if (Static12.aClass244_1 != null && Static134.method1808(Static173.anInt3397)) {
			Static640.method8649();
		}
		for (@Pc(220) int local220 = 0; local220 < 100; local220++) {
			Static57.aBooleanArray2[local220] = true;
		}
		Static113.aBoolean216 = true;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lclient!mc;I)V")
	public static void method2271(@OriginalArg(0) Class5_Sub41 arg0) {
		@Pc(7) int local7 = arg0.method7812();
		Static28.aClass386Array1 = new Class386[local7];
		for (@Pc(12) int local12 = 0; local12 < local7; local12++) {
			Static28.aClass386Array1[local12] = new Class386();
			Static28.aClass386Array1[local12].anInt10592 = arg0.method7812();
			Static28.aClass386Array1[local12].aString120 = arg0.method7813();
		}
		Static465.anInt7847 = arg0.method7812();
		Static7.anInt114 = arg0.method7812();
		Static443.anInt7640 = arg0.method7812();
		Static192.aClass6_Sub1Array1 = new Class6_Sub1[Static7.anInt114 + 1 - Static465.anInt7847];
		for (@Pc(64) int local64 = 0; local64 < Static443.anInt7640; local64++) {
			@Pc(69) int local69 = arg0.method7812();
			@Pc(77) Class6_Sub1 local77 = Static192.aClass6_Sub1Array1[local69] = new Class6_Sub1();
			local77.anInt56 = arg0.method7816();
			local77.anInt55 = arg0.method7804();
			local77.anInt65 = Static465.anInt7847 + local69;
			local77.aString1 = arg0.method7813();
			local77.aString2 = arg0.method7813();
		}
		anInt2536 = arg0.method7804();
		Static89.aBoolean195 = true;
	}
}
