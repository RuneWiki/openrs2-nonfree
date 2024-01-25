import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static311 {

	@OriginalMember(owner = "client!rl", name = "A", descriptor = "Lclient!dk;")
	public static final Class48 aClass48_3 = new Class48("runescape", 0);

	@OriginalMember(owner = "client!rl", name = "D", descriptor = "I")
	public static final int anInt5504 = 12;

	@OriginalMember(owner = "client!rl", name = "E", descriptor = "[I")
	public static final int[] anIntArray673 = new int[13];

	@OriginalMember(owner = "client!rl", name = "F", descriptor = "Lclient!tm;")
	public static final Class221 aClass221_189 = new Class221("white:", "weiss:", "blanc:", "branco:");

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "([IJII)Ljava/lang/String;")
	public static String method4817(@OriginalArg(0) int[] arg0, @OriginalArg(1) long arg1, @OriginalArg(3) int arg2) {
		if (Static252.anInterface6_1 != null) {
			@Pc(12) String local12 = Static252.anInterface6_1.method834(arg0, arg1, arg2);
			if (local12 != null) {
				return local12;
			}
		}
		return Long.toString(arg1);
	}

	@OriginalMember(owner = "client!rl", name = "c", descriptor = "(I)[Lclient!fl;")
	public static Class75[] method4818() {
		return new Class75[] { Static276.aClass75_3, Static315.aClass75_4, Static228.aClass75_1 };
	}

	@OriginalMember(owner = "client!rl", name = "d", descriptor = "(I)V")
	public static void method4819() {
		Static140.method5082(false);
		if (Static358.anInt6274 >= 0 && Static358.anInt6274 != 0) {
			Static200.method3348(Static358.anInt6274);
			Static358.anInt6274 = -1;
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(II)V")
	public static void method4821(@OriginalArg(0) int arg0) {
		Static203.anInt3731 = -1;
		if (arg0 == 37) {
			Static302.aFloat6 = 3.0F;
		} else if (arg0 == 50) {
			Static302.aFloat6 = 4.0F;
		} else if (arg0 == 75) {
			Static302.aFloat6 = 6.0F;
		} else if (arg0 == 100) {
			Static302.aFloat6 = 8.0F;
		} else if (arg0 == 200) {
			Static302.aFloat6 = 16.0F;
		}
		Static203.anInt3731 = -1;
	}
}
