import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!hd", name = "k", descriptor = "[I")
	public static int[] anIntArray156;

	@OriginalMember(owner = "client!hd", name = "E", descriptor = "Lclient!tb;")
	public static Class64_Sub1 aClass64_Sub1_9;

	@OriginalMember(owner = "client!hd", name = "F", descriptor = "I")
	public static int anInt1136;

	@OriginalMember(owner = "client!hd", name = "e", descriptor = "Lclient!ad;")
	private static Class4 aClass4_565 = Static75.method1216("Loading textures )2 ");

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "Lclient!ad;")
	public static Class4 aClass4_564 = aClass4_565;

	@OriginalMember(owner = "client!hd", name = "h", descriptor = "Z")
	public static boolean aBoolean80 = false;

	@OriginalMember(owner = "client!hd", name = "l", descriptor = "Lclient!ad;")
	public static Class4 aClass4_566 = Static75.method1216("");

	@OriginalMember(owner = "client!hd", name = "o", descriptor = "Lclient!bb;")
	public static Class8 aClass8_14 = new Class8(200);

	@OriginalMember(owner = "client!hd", name = "q", descriptor = "I")
	public static int anInt1133 = 0;

	@OriginalMember(owner = "client!hd", name = "s", descriptor = "Lclient!ad;")
	public static Class4 aClass4_567 = Static75.method1216("(U3");

	@OriginalMember(owner = "client!hd", name = "y", descriptor = "Lclient!ad;")
	private static Class4 aClass4_571 = Static75.method1216("glow3:");

	@OriginalMember(owner = "client!hd", name = "t", descriptor = "Lclient!ad;")
	public static Class4 aClass4_568 = aClass4_571;

	@OriginalMember(owner = "client!hd", name = "u", descriptor = "Lclient!ad;")
	private static Class4 aClass4_569 = Static75.method1216("Select");

	@OriginalMember(owner = "client!hd", name = "A", descriptor = "Lclient!ad;")
	private static Class4 aClass4_573 = Static75.method1216("Friends");

	@OriginalMember(owner = "client!hd", name = "v", descriptor = "Lclient!ad;")
	public static Class4 aClass4_570 = aClass4_573;

	@OriginalMember(owner = "client!hd", name = "z", descriptor = "Lclient!ad;")
	public static Class4 aClass4_572 = Static75.method1216("Okay");

	@OriginalMember(owner = "client!hd", name = "C", descriptor = "[I")
	public static int[] anIntArray157 = new int[100];

	@OriginalMember(owner = "client!hd", name = "G", descriptor = "Lclient!ad;")
	public static Class4 aClass4_574 = aClass4_569;

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(B)V")
	public static void method795() {
		Static5.aClass3_Sub4_Sub1_1.method464(244);
		if (Static10.anInt336 != -1) {
			Static66.method1101(Static10.anInt336);
			Static69.anInt2250 = -1;
			Static89.aBoolean159 = true;
			Static10.anInt336 = -1;
			Static39.aBoolean74 = true;
		}
		if (Static6.anInt259 != -1) {
			Static66.method1101(Static6.anInt259);
			Static69.anInt2250 = -1;
			Static86.aBoolean153 = true;
			Static6.anInt259 = -1;
		}
		if (Static60.anInt1484 != -1) {
			Static66.method1101(Static60.anInt1484);
			Static60.anInt1484 = -1;
			Static60.method1007(30);
		}
		if (Static29.anInt909 != -1) {
			Static66.method1101(Static29.anInt909);
			Static29.anInt909 = -1;
		}
		if (Static48.anInt1201 != -1) {
			Static66.method1101(Static48.anInt1201);
			Static48.anInt1201 = -1;
			Static69.anInt2250 = -1;
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIII)V")
	public static void method796(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(12) Class3_Sub8 local12 = (Class3_Sub8) Static7.aClass20_1.method308(); local12 != null; local12 = (Class3_Sub8) Static7.aClass20_1.method309()) {
			if (local12.anInt1892 != -1 || local12.anIntArray242 != null) {
				@Pc(23) int local23 = 0;
				if (local12.anInt1902 < arg1) {
					local23 = arg1 - local12.anInt1902;
				} else if (local12.anInt1888 > arg1) {
					local23 = local12.anInt1888 - arg1;
				}
				if (arg3 > local12.anInt1891) {
					local23 += arg3 - local12.anInt1891;
				} else if (arg3 < local12.anInt1894) {
					local23 += local12.anInt1894 - arg3;
				}
				if (local12.anInt1889 < local23 - 64 || Static93.anInt2442 == 0 || local12.anInt1893 != arg2) {
					if (local12.aClass3_Sub3_Sub1_1 != null) {
						Static52.aClass3_Sub3_Sub2_1.method1057(local12.aClass3_Sub3_Sub1_1);
						local12.aClass3_Sub3_Sub1_1 = null;
					}
					if (local12.aClass3_Sub3_Sub1_2 != null) {
						Static52.aClass3_Sub3_Sub2_1.method1057(local12.aClass3_Sub3_Sub1_2);
						local12.aClass3_Sub3_Sub1_2 = null;
					}
				} else {
					local23 -= 64;
					if (local23 < 0) {
						local23 = 0;
					}
					@Pc(138) int local138 = (local12.anInt1889 - local23) * Static93.anInt2442 / local12.anInt1889;
					if (local12.aClass3_Sub3_Sub1_1 != null) {
						local12.aClass3_Sub3_Sub1_1.method337(local138);
					} else if (local12.anInt1892 >= 0) {
						@Pc(159) Class9 local159 = Static114.method212(Static96.aClass64_Sub1_15, local12.anInt1892);
						if (local159 != null) {
							@Pc(166) Class3_Sub9_Sub1 local166 = local159.method211().method1612(Static68.aClass57_1);
							@Pc(171) Class3_Sub3_Sub1 local171 = Static115.method345(local166, local138);
							local171.method343(-1);
							Static52.aClass3_Sub3_Sub2_1.method1055(local171);
							local12.aClass3_Sub3_Sub1_1 = local171;
						}
					}
					if (local12.aClass3_Sub3_Sub1_2 != null) {
						local12.aClass3_Sub3_Sub1_2.method337(local138);
						if (!local12.aClass3_Sub3_Sub1_2.method347()) {
							local12.aClass3_Sub3_Sub1_2 = null;
						}
					} else if (local12.anIntArray242 != null && (local12.anInt1895 -= arg0) <= 0) {
						@Pc(205) int local205 = (int) ((double) local12.anIntArray242.length * Math.random());
						@Pc(213) Class9 local213 = Static114.method212(Static96.aClass64_Sub1_15, local12.anIntArray242[local205]);
						if (local213 != null) {
							@Pc(220) Class3_Sub9_Sub1 local220 = local213.method211().method1612(Static68.aClass57_1);
							@Pc(225) Class3_Sub3_Sub1 local225 = Static115.method345(local220, local138);
							local225.method343(0);
							Static52.aClass3_Sub3_Sub2_1.method1055(local225);
							local12.aClass3_Sub3_Sub1_2 = local225;
							local12.anInt1895 = (int) (Math.random() * (double) (local12.anInt1906 - local12.anInt1905)) + local12.anInt1905;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hd", name = "c", descriptor = "(I)V")
	public static void method798() {
		aClass4_574 = null;
		aClass4_565 = null;
		aClass4_570 = null;
		aClass4_566 = null;
		aClass4_564 = null;
		aClass4_572 = null;
		anIntArray156 = null;
		aClass8_14 = null;
		aClass4_573 = null;
		aClass4_569 = null;
		aClass4_567 = null;
		aClass64_Sub1_9 = null;
		anIntArray157 = null;
		aClass4_568 = null;
		aClass4_571 = null;
	}
}
