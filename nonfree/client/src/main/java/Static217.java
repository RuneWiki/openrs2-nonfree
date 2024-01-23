import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static217 {

	@OriginalMember(owner = "client!qj", name = "c", descriptor = "[I")
	public static int[] anIntArray388;

	@OriginalMember(owner = "client!qj", name = "d", descriptor = "Z")
	public static boolean aBoolean285;

	@OriginalMember(owner = "client!qj", name = "f", descriptor = "J")
	public static long aLong158;

	@OriginalMember(owner = "client!qj", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString138;

	@OriginalMember(owner = "client!qj", name = "j", descriptor = "I")
	public static int anInt4316;

	@OriginalMember(owner = "client!qj", name = "e", descriptor = "I")
	public static int anInt4313 = 0;

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Z)V")
	public static void method3491() {
		@Pc(4) Class61 local4 = Static210.aClass61_1;
		synchronized (Static210.aClass61_1) {
			Static205.anInt3999 = Static89.anInt1842;
			Static53.anInt1062++;
			@Pc(16) int local16;
			if (Static153.anInt3089 < 0) {
				for (local16 = 0; local16 < 112; local16++) {
					Static96.aBooleanArray15[local16] = false;
				}
				Static153.anInt3089 = Static114.anInt2477;
			} else {
				while (Static153.anInt3089 != Static114.anInt2477) {
					local16 = Static19.anIntArray40[Static114.anInt2477];
					Static114.anInt2477 = Static114.anInt2477 + 1 & 0x7F;
					if (local16 < 0) {
						Static96.aBooleanArray15[~local16] = false;
					} else {
						Static96.aBooleanArray15[local16] = true;
					}
				}
			}
			Static89.anInt1842 = Static156.anInt3141;
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(III)Lclient!gg;")
	public static Class4_Sub2_Sub9 method3492(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(10) Class4_Sub2_Sub9 local10 = (Class4_Sub2_Sub9) Static48.aClass97_1.method2363(); local10 != null; local10 = (Class4_Sub2_Sub9) Static48.aClass97_1.method2367()) {
			if (local10.aBoolean139 && local10.method1419(arg0, arg1)) {
				return local10;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!qj", name = "b", descriptor = "(III)J")
	public static long method3493(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class4_Sub11 local7 = Static127.aClass4_Sub11ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null || local7.aClass104_1 == null ? 0L : local7.aClass104_1.aLong112;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lclient!p;Z)Ljava/lang/String;")
	public static String method3494(@OriginalArg(0) Class4_Sub17 arg0) {
		return Static161.method2509(arg0);
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(B)V")
	public static void method3495() {
		aString138 = null;
		anIntArray388 = null;
	}
}
