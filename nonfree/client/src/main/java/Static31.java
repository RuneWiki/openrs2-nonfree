import java.awt.Font;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static31 {

	@OriginalMember(owner = "client!f", name = "j", descriptor = "I")
	public static int anInt924;

	@OriginalMember(owner = "client!f", name = "l", descriptor = "Lclient!nc;")
	public static Class54 aClass54_2;

	@OriginalMember(owner = "client!f", name = "m", descriptor = "Lclient!md;")
	public static Class30 aClass30_5;

	@OriginalMember(owner = "client!f", name = "q", descriptor = "I")
	public static int anInt927;

	@OriginalMember(owner = "client!f", name = "s", descriptor = "Lclient!td;")
	public static Class3_Sub1_Sub16 aClass3_Sub1_Sub16_3;

	@OriginalMember(owner = "client!f", name = "x", descriptor = "Ljava/awt/Font;")
	public static Font aFont1;

	@OriginalMember(owner = "client!f", name = "A", descriptor = "[[Lclient!td;")
	public static Class3_Sub1_Sub16[][] aClass3_Sub1_Sub16ArrayArray1;

	@OriginalMember(owner = "client!f", name = "b", descriptor = "I")
	public static int anInt917 = 0;

	@OriginalMember(owner = "client!f", name = "e", descriptor = "I")
	public static int anInt920 = 0;

	@OriginalMember(owner = "client!f", name = "h", descriptor = "I")
	public static int anInt923 = 0;

	@OriginalMember(owner = "client!f", name = "i", descriptor = "Lclient!n;")
	public static Class52 aClass52_20 = new Class52(64);

	@OriginalMember(owner = "client!f", name = "n", descriptor = "Lclient!oa;")
	public static Class56 aClass56_501 = Static33.method650("backtop1");

	@OriginalMember(owner = "client!f", name = "o", descriptor = "I")
	public static int anInt926 = -1;

	@OriginalMember(owner = "client!f", name = "p", descriptor = "Lclient!cc;")
	public static Class3_Sub2_Sub1 aClass3_Sub2_Sub1_3 = new Class3_Sub2_Sub1(5000);

	@OriginalMember(owner = "client!f", name = "r", descriptor = "Lclient!oa;")
	public static Class56 aClass56_502 = Static33.method650("Fallen lassen");

	@OriginalMember(owner = "client!f", name = "t", descriptor = "Lclient!oa;")
	public static Class56 aClass56_503 = Static33.method650("au");

	@OriginalMember(owner = "client!f", name = "u", descriptor = "Lclient!oa;")
	public static Class56 aClass56_504 = Static33.method650("Hierhin gehen");

	@OriginalMember(owner = "client!f", name = "v", descriptor = "Lclient!oa;")
	public static Class56 aClass56_505 = Static33.method650(")2");

	@OriginalMember(owner = "client!f", name = "w", descriptor = "Lclient!oa;")
	public static Class56 aClass56_506 = Static33.method650(": ");

	@OriginalMember(owner = "client!f", name = "y", descriptor = "I")
	public static int anInt928 = 0;

	@OriginalMember(owner = "client!f", name = "z", descriptor = "Lclient!oa;")
	public static Class56 aClass56_507 = Static33.method650(" ");

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!b;Lclient!oa;B)I")
	public static int method634(@OriginalArg(0) Class3_Sub2 arg0, @OriginalArg(1) Class56 arg1) {
		@Pc(14) int local14 = arg0.anInt413;
		arg0.method304(arg1.anInt2171);
		arg0.anInt413 += Static7.aClass5_2.method42(0, arg1.aByteArray29, arg0.aByteArray7, arg1.anInt2171, arg0.anInt413);
		return arg0.anInt413 - local14;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(I)I")
	public static int method635() {
		@Pc(5) int local5 = Static27.method560(Static15.anInt433, Static94.anInt2470, Static57.anInt1615);
		return local5 - Static111.anInt2863 >= 800 || (Static66.aByteArrayArrayArray3[Static94.anInt2470][Static57.anInt1615 >> 7][Static15.anInt433 >> 7] & 0x4) == 0 ? 3 : Static94.anInt2470;
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "(I)V")
	public static void method636() {
		if (Static45.aClass48_1 != null) {
			@Pc(12) Class48 local12 = Static45.aClass48_1;
			synchronized (Static45.aClass48_1) {
				Static45.aClass48_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IILclient!uc;II)V")
	public static void method637(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub1_Sub17 arg2, @OriginalArg(3) int arg3) {
		if (Static66.anInt559 >= 400) {
			return;
		}
		if (arg2.anIntArray290 != null) {
			arg2 = arg2.method1901();
		}
		if (arg2 == null || !arg2.aBoolean159) {
			return;
		}
		@Pc(32) Class56 local32 = arg2.aClass56_1589;
		if (arg2.anInt2930 != 0) {
			local32 = Static84.method1524(new Class56[] { local32, Static12.method240(arg2.anInt2930, Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anInt1368), Static61.aClass56_958, Static15.aClass56_212, Static111.method1851(arg2.anInt2930), Static79.aClass56_1135 });
		}
		if (Static98.anInt2560 == 1) {
			Static97.method1702(arg3, Static57.aClass56_890, 52, arg0, Static84.method1524(new Class56[] { Static84.aClass56_1217, Static83.aClass56_1212, local32 }), arg1);
		} else if (!Static93.aBoolean114) {
			@Pc(111) Class56[] local111 = arg2.aClass56Array16;
			if (Static5.aBoolean5) {
				local111 = Static86.method1600(local111);
			}
			@Pc(125) int local125;
			if (local111 != null) {
				for (local125 = 4; local125 >= 0; local125--) {
					if (local111[local125] != null && !local111[local125].method1418(Static102.aClass56_1749)) {
						@Pc(144) byte local144 = 0;
						if (local125 == 0) {
							local144 = 19;
						}
						if (local125 == 1) {
							local144 = 24;
						}
						if (local125 == 2) {
							local144 = 10;
						}
						if (local125 == 3) {
							local144 = 27;
						}
						if (local125 == 4) {
							local144 = 28;
						}
						Static97.method1702(arg3, local111[local125], local144, arg0, Static84.method1524(new Class56[] { Static50.aClass56_801, local32 }), arg1);
					}
				}
			}
			if (local111 != null) {
				for (local125 = 4; local125 >= 0; local125--) {
					if (local111[local125] != null && local111[local125].method1418(Static102.aClass56_1749)) {
						@Pc(224) short local224 = 0;
						@Pc(226) int local226 = 0;
						if (Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anInt1368 < arg2.anInt2930) {
							local224 = 2000;
						}
						if (local125 == 0) {
							local226 = local224 + 19;
						}
						if (local125 == 1) {
							local226 = local224 + 24;
						}
						if (local125 == 2) {
							local226 = local224 + 10;
						}
						if (local125 == 3) {
							local226 = local224 + 27;
						}
						if (local125 == 4) {
							local226 = local224 + 28;
						}
						Static97.method1702(arg3, local111[local125], local226, arg0, Static84.method1524(new Class56[] { Static50.aClass56_801, local32 }), arg1);
					}
				}
			}
			Static97.method1702(arg3, Static123.aClass56_1662, 1002, arg0, Static84.method1524(new Class56[] { Static50.aClass56_801, local32 }), arg1);
		} else if ((Static63.anInt1819 & 0x2) == 2) {
			Static97.method1702(arg3, Static76.aClass56_1114, 25, arg0, Static84.method1524(new Class56[] { Static126.aClass56_1702, Static83.aClass56_1212, local32 }), arg1);
		}
	}

	@OriginalMember(owner = "client!f", name = "c", descriptor = "(I)V")
	public static void method638() {
		aClass56_501 = null;
		aClass56_502 = null;
		aClass52_20 = null;
		aClass56_507 = null;
		aFont1 = null;
		aClass56_503 = null;
		aClass56_506 = null;
		aClass54_2 = null;
		aClass3_Sub2_Sub1_3 = null;
		aClass3_Sub1_Sub16ArrayArray1 = null;
		aClass56_504 = null;
		aClass30_5 = null;
		aClass56_505 = null;
		aClass3_Sub1_Sub16_3 = null;
	}
}
