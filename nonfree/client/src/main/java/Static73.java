import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!fb", name = "c", descriptor = "I")
	public static int anInt1472;

	@OriginalMember(owner = "client!fb", name = "p", descriptor = "I")
	public static int anInt1479;

	@OriginalMember(owner = "client!fb", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString59 = "Started 3d Library";

	@OriginalMember(owner = "client!fb", name = "f", descriptor = "[I")
	public static int[] anIntArray139 = new int[200];

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(B)V")
	public static void method1224() {
		Static217.aClass97ArrayArray1 = new Class97[Static279.aClass22_97.method677()][];
		Static21.aBooleanArray7 = new boolean[Static279.aClass22_97.method677()];
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(ILclient!cg;II)[Lclient!n;")
	public static Class4_Sub2_Sub4_Sub2[] method1225(@OriginalArg(1) Class22 arg0, @OriginalArg(2) int arg1) {
		return Static225.method3549(0, arg0, arg1) ? Static150.method2373() : null;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(ZI)V")
	public static void method1226(@OriginalArg(1) int arg0) {
		if (Static55.anInt1252 == 0) {
			Static228.aClass4_Sub6_Sub2_2.method825(arg0);
		} else {
			Static8.anInt148 = arg0;
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lclient!lg;I)V")
	public static void method1227(@OriginalArg(0) Class97 arg0) {
		@Pc(8) int local8 = arg0.anInt3123;
		if (local8 == 324) {
			if (Static268.anInt5349 == -1) {
				Static304.anInt5810 = arg0.anInt3136;
				Static268.anInt5349 = arg0.anInt3131;
			}
			if (Static165.aClass175_1.aBoolean383) {
				arg0.anInt3131 = Static268.anInt5349;
			} else {
				arg0.anInt3131 = Static304.anInt5810;
			}
		} else if (local8 == 325) {
			if (Static268.anInt5349 == -1) {
				Static304.anInt5810 = arg0.anInt3136;
				Static268.anInt5349 = arg0.anInt3131;
			}
			if (Static165.aClass175_1.aBoolean383) {
				arg0.anInt3131 = Static304.anInt5810;
			} else {
				arg0.anInt3131 = Static268.anInt5349;
			}
		} else if (local8 == 327) {
			arg0.anInt3114 = 150;
			arg0.anInt3143 = (int) (Math.sin((double) Static50.anInt1118 / 40.0D) * 256.0D) & 0x7FF;
			arg0.anInt3121 = -1;
			arg0.anInt3125 = 5;
		} else if (local8 == 328) {
			if (Static72.aClass13_Sub5_Sub1_1.aString148 == null) {
				arg0.anInt3121 = 0;
			} else {
				arg0.anInt3114 = 150;
				arg0.anInt3143 = (int) (Math.sin((double) Static50.anInt1118 / 40.0D) * 256.0D) & 0x7FF;
				arg0.anInt3125 = 5;
				arg0.anInt3121 = ((int) Static193.method3171(Static72.aClass13_Sub5_Sub1_1.aString148) << 11) + 2047;
				arg0.anInt3188 = 0;
				arg0.anInt3122 = Static72.aClass13_Sub5_Sub1_1.anInt5307;
				arg0.anInt3194 = Static72.aClass13_Sub5_Sub1_1.anInt5287;
				arg0.anInt3120 = Static72.aClass13_Sub5_Sub1_1.anInt5313;
			}
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method1233(@OriginalArg(1) String arg0) {
		System.out.println("Error: " + Static123.method2040(arg0, "%0a", "\n"));
	}
}
