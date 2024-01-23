import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static136 {

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "[[[Lclient!ee;")
	public static Class2_Sub13[][][] aClass2_Sub13ArrayArrayArray3;

	@OriginalMember(owner = "client!jf", name = "e", descriptor = "Lclient!sc;")
	public static Class2_Sub8_Sub1_Sub1 aClass2_Sub8_Sub1_Sub1_2;

	@OriginalMember(owner = "client!jf", name = "h", descriptor = "Lclient!li;")
	public static Interface1 anInterface1_1;

	@OriginalMember(owner = "client!jf", name = "j", descriptor = "I")
	public static int anInt3064;

	@OriginalMember(owner = "client!jf", name = "c", descriptor = "[I")
	public static int[] anIntArray306 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@OriginalMember(owner = "client!jf", name = "d", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray23 = new String[100];

	@OriginalMember(owner = "client!jf", name = "g", descriptor = "[I")
	public static int[] anIntArray307 = new int[] { 0, 2, 2, 2, 1, 1, 2, 2, 1, 3, 1, 1 };

	@OriginalMember(owner = "client!jf", name = "k", descriptor = "I")
	public static int anInt3065 = 0;

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Ljava/lang/String;B)Z")
	public static boolean method2460(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(19) int local19 = 0; local19 < Static41.anInt999; local19++) {
			if (arg0.equalsIgnoreCase(Static222.aStringArray34[local19])) {
				return true;
			}
		}
		if (arg0.equalsIgnoreCase(Static22.aClass15_Sub2_Sub2_1.aString184)) {
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IILclient!th;I)V")
	public static void method2462(@OriginalArg(1) int arg0, @OriginalArg(2) Class15_Sub2_Sub2 arg1, @OriginalArg(3) int arg2) {
		if (arg2 == arg1.anInt5332 && arg2 != -1) {
			@Pc(92) Class112 local92 = Static208.method3496(arg2);
			@Pc(95) int local95 = local92.anInt3857;
			if (local95 == 1) {
				arg1.anInt5377 = 0;
				arg1.anInt5343 = arg0;
				arg1.anInt5368 = 0;
				arg1.anInt5353 = 0;
				arg1.anInt5362 = 1;
				Static28.method558(Static22.aClass15_Sub2_Sub2_1 == arg1, local92, arg1.anInt5377, arg1.anInt5358, arg1.anInt5371);
			}
			if (local95 == 2) {
				arg1.anInt5353 = 0;
			}
		} else if (arg2 == -1 || arg1.anInt5332 == -1 || Static208.method3496(arg2).anInt3870 >= Static208.method3496(arg1.anInt5332).anInt3870) {
			arg1.anInt5332 = arg2;
			arg1.anInt5353 = 0;
			arg1.anInt5377 = 0;
			arg1.anInt5343 = arg0;
			arg1.anInt5368 = 0;
			arg1.anInt5370 = arg1.anInt5342;
			arg1.anInt5362 = 1;
			if (arg1.anInt5332 != -1) {
				Static28.method558(arg1 == Static22.aClass15_Sub2_Sub2_1, Static208.method3496(arg1.anInt5332), arg1.anInt5377, arg1.anInt5358, arg1.anInt5371);
			}
		}
	}
}
