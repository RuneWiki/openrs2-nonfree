import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static26 {

	@OriginalMember(owner = "client!ee", name = "Ub", descriptor = "Lclient!rb;")
	public static Class55 aClass55_13;

	@OriginalMember(owner = "client!ee", name = "gc", descriptor = "Z")
	public static boolean aBoolean48;

	@OriginalMember(owner = "client!ee", name = "Yc", descriptor = "Lclient!ra;")
	public static Class54 aClass54_2;

	@OriginalMember(owner = "client!ee", name = "jd", descriptor = "I")
	public static int anInt845;

	@OriginalMember(owner = "client!ee", name = "pd", descriptor = "[I")
	public static int[] anIntArray119;

	@OriginalMember(owner = "client!ee", name = "rd", descriptor = "[Z")
	public static boolean[] aBooleanArray4;

	@OriginalMember(owner = "client!ee", name = "wd", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas1;

	@OriginalMember(owner = "client!ee", name = "Z", descriptor = "Lclient!sd;")
	public static Class58 aClass58_1 = new Class58();

	@OriginalMember(owner = "client!ee", name = "sb", descriptor = "I")
	public static int anInt797 = 0;

	@OriginalMember(owner = "client!ee", name = "Ab", descriptor = "I")
	public static int anInt803 = 0;

	@OriginalMember(owner = "client!ee", name = "Db", descriptor = "[Lclient!gd;")
	public static Class23[] aClass23Array8 = new Class23[100];

	@OriginalMember(owner = "client!ee", name = "Gc", descriptor = "[Z")
	public static boolean[] aBooleanArray3 = new boolean[5];

	@OriginalMember(owner = "client!ee", name = "ld", descriptor = "Lclient!gd;")
	private static Class23 aClass23_464 = Static15.method178("Could not complete login)3");

	@OriginalMember(owner = "client!ee", name = "md", descriptor = "Lclient!gd;")
	public static Class23 aClass23_465 = Static15.method178("Benutzen");

	@OriginalMember(owner = "client!ee", name = "nd", descriptor = "I")
	public static int anInt847 = 0;

	@OriginalMember(owner = "client!ee", name = "ud", descriptor = "Lclient!gd;")
	public static Class23 aClass23_466 = aClass23_464;

	@OriginalMember(owner = "client!ee", name = "xd", descriptor = "Z")
	public static boolean aBoolean54 = false;

	@OriginalMember(owner = "client!ee", name = "e", descriptor = "(I)V")
	public static void method433() {
		aClass23_464 = null;
		aClass55_13 = null;
		anIntArray119 = null;
		aClass23_466 = null;
		aClass54_2 = null;
		aClass23_465 = null;
		aBooleanArray3 = null;
		aClass23Array8 = null;
		aCanvas1 = null;
		aClass58_1 = null;
		aBooleanArray4 = null;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IILclient!vc;II)V")
	public static void method435(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub1_Sub16 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static40.anInt1400 >= 400) {
			return;
		}
		if (arg1.anIntArray381 != null) {
			arg1 = arg1.method1816();
		}
		if (arg1 == null || !arg1.aBoolean126) {
			return;
		}
		@Pc(31) Class23 local31 = arg1.aClass23_1584;
		if (arg1.anInt2763 != 0) {
			local31 = Static17.method233(new Class23[] { local31, Static73.method1309(Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt2242, arg1.anInt2763), Static98.aClass23_1441, Static5.aClass23_101, Static19.method274(arg1.anInt2763), Static36.aClass23_637 });
		}
		if (Static115.anInt2955 == 1) {
			Static82.method1457(arg2, arg3, Static17.method233(new Class23[] { Static87.aClass23_1690, Static84.aClass23_1320, local31 }), Static73.aClass23_1201, 53, arg0);
		} else if (Static94.anInt2487 != 1) {
			@Pc(152) Class23[] local152 = arg1.aClass23Array17;
			if (Static5.aBoolean2) {
				local152 = Static102.method1710(local152);
			}
			@Pc(162) int local162;
			if (local152 != null) {
				for (local162 = 4; local162 >= 0; local162--) {
					if (local152[local162] != null && !local152[local162].method530(Static96.aClass23_971)) {
						@Pc(176) byte local176 = 0;
						if (local162 == 0) {
							local176 = 41;
						}
						if (local162 == 1) {
							local176 = 43;
						}
						if (local162 == 2) {
							local176 = 49;
						}
						if (local162 == 3) {
							local176 = 50;
						}
						if (local162 == 4) {
							local176 = 22;
						}
						Static82.method1457(arg2, arg3, Static17.method233(new Class23[] { Static19.aClass23_311, local31 }), local152[local162], local176, arg0);
					}
				}
			}
			if (local152 != null) {
				for (local162 = 4; local162 >= 0; local162--) {
					if (local152[local162] != null && local152[local162].method530(Static96.aClass23_971)) {
						@Pc(252) short local252 = 0;
						if (arg1.anInt2763 > Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt2242) {
							local252 = 2000;
						}
						@Pc(265) int local265 = 0;
						if (local162 == 0) {
							local265 = local252 + 41;
						}
						if (local162 == 1) {
							local265 = local252 + 43;
						}
						if (local162 == 2) {
							local265 = local252 + 49;
						}
						if (local162 == 3) {
							local265 = local252 + 50;
						}
						if (local162 == 4) {
							local265 = local252 + 22;
						}
						Static82.method1457(arg2, arg3, Static17.method233(new Class23[] { Static19.aClass23_311, local31 }), local152[local162], local265, arg0);
					}
				}
			}
			Static82.method1457(arg2, arg3, Static17.method233(new Class23[] { Static19.aClass23_311, local31 }), Static43.aClass23_773, 1003, arg0);
		} else if ((Static90.anInt2427 & 0x2) == 2) {
			Static82.method1457(arg2, arg3, Static17.method233(new Class23[] { Static1.aClass23_53, Static84.aClass23_1320, local31 }), Static3.aClass23_96, 12, arg0);
			return;
		}
	}
}
