import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!bl", name = "R", descriptor = "[Lclient!ke;")
	public static Class1_Sub2_Sub4[] aClass1_Sub2_Sub4Array4;

	@OriginalMember(owner = "client!bl", name = "U", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray2;

	@OriginalMember(owner = "client!bl", name = "W", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray3;

	@OriginalMember(owner = "client!bl", name = "X", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!bl", name = "K", descriptor = "Lclient!ic;")
	public static Class58 aClass58_6 = new Class58(64);

	@OriginalMember(owner = "client!bl", name = "Q", descriptor = "Lclient!ab;")
	public static Class3 aClass3_3 = new Class3();

	@OriginalMember(owner = "client!bl", name = "V", descriptor = "Z")
	public static boolean aBoolean44 = false;

	@OriginalMember(owner = "client!bl", name = "Y", descriptor = "I")
	public static volatile int anInt847 = -1;

	@OriginalMember(owner = "client!bl", name = "Z", descriptor = "I")
	public static int anInt848 = 0;

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(ZI)V")
	public static void method505() {
		Static57.aClass79_6.method2479(5);
		Static170.aClass79_26.method2479(5);
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(BJ)V")
	public static void method506(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(14) int local14 = 0; local14 < Static265.anInt5544; local14++) {
			if (Static139.aLongArray38[local14] == arg0) {
				Static265.anInt5544--;
				for (@Pc(36) int local36 = local14; local36 < Static265.anInt5544; local36++) {
					Static48.aStringArray7[local36] = Static48.aStringArray7[local36 + 1];
					Static206.anIntArray349[local36] = Static206.anIntArray349[local36 + 1];
					Static63.aStringArray10[local36] = Static63.aStringArray10[local36 + 1];
					Static139.aLongArray38[local36] = Static139.aLongArray38[local36 + 1];
					Static208.anIntArray353[local36] = Static208.anIntArray353[local36 + 1];
					Static168.aBooleanArray15[local36] = Static168.aBooleanArray15[local36 + 1];
				}
				Static52.anInt1461 = Static243.anInt5249;
				Static171.aClass1_Sub13_Sub1_3.method1825(124);
				Static171.aClass1_Sub13_Sub1_3.method1770(arg0);
				break;
			}
		}
	}

	@OriginalMember(owner = "client!bl", name = "i", descriptor = "(I)Z")
	public static boolean method507() {
		return Static191.aBoolean213;
	}

	@OriginalMember(owner = "client!bl", name = "j", descriptor = "(I)V")
	public static void method508() {
		Static249.aClass1_Sub2_Sub4_10 = null;
		Static233.aClass1_Sub2_Sub4_9 = null;
		Static128.aClass1_Sub2_Sub4_5 = null;
		Static224.aClass1_Sub2_Sub4_8 = null;
		Static37.aClass1_Sub2_Sub4_2 = null;
	}

	@OriginalMember(owner = "client!bl", name = "k", descriptor = "(I)V")
	public static void method509() {
		if (Static240.aClass147_1 != null) {
			@Pc(3) Class147 local3 = Static240.aClass147_1;
			synchronized (Static240.aClass147_1) {
				Static240.aClass147_1 = null;
			}
		}
	}
}
