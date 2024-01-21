import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!ld", name = "u", descriptor = "[I")
	public static int[] anIntArray32;

	@OriginalMember(owner = "client!ld", name = "G", descriptor = "Lclient!rc;")
	public static Class65 aClass65_2;

	@OriginalMember(owner = "client!ld", name = "r", descriptor = "Lclient!oa;")
	public static Class56 aClass56_266 = Static33.method650("");

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "Lclient!oa;")
	public static Class56 aClass56_262 = aClass56_266;

	@OriginalMember(owner = "client!ld", name = "f", descriptor = "Lclient!oa;")
	public static Class56 aClass56_263 = aClass56_266;

	@OriginalMember(owner = "client!ld", name = "g", descriptor = "I")
	public static int anInt541 = 0;

	@OriginalMember(owner = "client!ld", name = "h", descriptor = "Lclient!oa;")
	private static Class56 aClass56_264 = Static33.method650("Accept trade");

	@OriginalMember(owner = "client!ld", name = "q", descriptor = "Lclient!oa;")
	public static Class56 aClass56_265 = aClass56_266;

	@OriginalMember(owner = "client!ld", name = "x", descriptor = "Lclient!oa;")
	public static Class56 aClass56_267 = aClass56_266;

	@OriginalMember(owner = "client!ld", name = "C", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray3 = new byte[4][104][104];

	@OriginalMember(owner = "client!ld", name = "K", descriptor = "Lclient!oa;")
	private static Class56 aClass56_272 = Static33.method650("flash3:");

	@OriginalMember(owner = "client!ld", name = "E", descriptor = "Lclient!oa;")
	public static Class56 aClass56_268 = aClass56_272;

	@OriginalMember(owner = "client!ld", name = "F", descriptor = "Lclient!oa;")
	public static Class56 aClass56_269 = aClass56_264;

	@OriginalMember(owner = "client!ld", name = "H", descriptor = "Lclient!oa;")
	public static Class56 aClass56_270 = aClass56_266;

	@OriginalMember(owner = "client!ld", name = "I", descriptor = "Lclient!oa;")
	public static Class56 aClass56_271 = aClass56_266;

	@OriginalMember(owner = "client!ld", name = "L", descriptor = "I")
	public static int anInt559 = 0;

	@OriginalMember(owner = "client!ld", name = "N", descriptor = "Lclient!oa;")
	private static Class56 aClass56_273 = Static33.method650("Press (Wchange your password(W on front page)3");

	@OriginalMember(owner = "client!ld", name = "W", descriptor = "Lclient!oa;")
	public static Class56 aClass56_274 = Static33.method650("da dieser Computer gegen unsere ");

	@OriginalMember(owner = "client!ld", name = "X", descriptor = "I")
	public static int anInt569 = 99;

	@OriginalMember(owner = "client!ld", name = "ab", descriptor = "Lclient!oa;")
	public static Class56 aClass56_275 = aClass56_272;

	@OriginalMember(owner = "client!ld", name = "eb", descriptor = "Lclient!oa;")
	public static Class56 aClass56_276 = aClass56_273;

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(III)Z")
	public static boolean method379(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0 && Static77.anInt3140 == arg0) {
			return true;
		} else if (arg1 == 1 && arg0 == Static102.anInt3219) {
			return true;
		} else {
			return (arg1 == 2 || arg1 == 3) && Static53.anInt1525 == arg0;
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lclient!tb;ZLclient!tb;Lclient!tb;)V")
	public static void method389(@OriginalArg(0) Class44 arg0, @OriginalArg(2) Class44 arg1, @OriginalArg(3) Class44 arg2) {
		Static109.aClass44_39 = arg2;
		Static3.aClass44_70 = arg0;
		Static57.aClass44_36 = arg1;
		Static31.aClass3_Sub1_Sub16ArrayArray1 = new Class3_Sub1_Sub16[Static57.aClass44_36.method1143()][];
		Static98.aBooleanArray11 = new boolean[Static57.aClass44_36.method1143()];
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(B)V")
	public static void method390() {
		aClass56_274 = null;
		aClass56_271 = null;
		aClass56_264 = null;
		anIntArray32 = null;
		aClass56_269 = null;
		aClass56_273 = null;
		aClass56_268 = null;
		aClass56_265 = null;
		aClass56_263 = null;
		aClass65_2 = null;
		aClass56_275 = null;
		aClass56_266 = null;
		aClass56_276 = null;
		aClass56_267 = null;
		aByteArrayArrayArray3 = null;
		aClass56_270 = null;
		aClass56_272 = null;
		aClass56_262 = null;
	}

	@OriginalMember(owner = "client!ld", name = "g", descriptor = "(I)Lclient!he;")
	public static Class33 method394() {
		try {
			return (Class33) Class.forName("Class33_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return new Class33_Sub2();
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(ZIIII)V")
	public static void method395(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(12) int local12 = arg0; local12 <= arg3 + arg0; local12++) {
			for (@Pc(16) int local16 = arg1; local16 <= arg1 + arg2; local16++) {
				if (local16 >= 0 && local16 < 104 && local12 >= 0 && local12 < 104) {
					Static117.aByteArrayArrayArray8[0][local16][local12] = 127;
					if (arg1 == local16 && local16 > 0) {
						Static22.anIntArrayArrayArray4[0][local16][local12] = Static22.anIntArrayArrayArray4[0][local16 - 1][local12];
					}
					if (arg2 + arg1 == local16 && local16 < 103) {
						Static22.anIntArrayArrayArray4[0][local16][local12] = Static22.anIntArrayArrayArray4[0][local16 + 1][local12];
					}
					if (arg0 == local12 && local12 > 0) {
						Static22.anIntArrayArrayArray4[0][local16][local12] = Static22.anIntArrayArrayArray4[0][local16][local12 - 1];
					}
					if (local12 == arg3 + arg0 && local12 < 103) {
						Static22.anIntArrayArrayArray4[0][local16][local12] = Static22.anIntArrayArrayArray4[0][local16][local12 + 1];
					}
				}
			}
		}
	}
}
