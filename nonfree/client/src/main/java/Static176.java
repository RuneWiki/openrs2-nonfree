import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static176 {

	@OriginalMember(owner = "client!lj", name = "c", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!lj", name = "d", descriptor = "Lclient!id;")
	public static Class99 aClass99_2;

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "Lclient!fg;")
	public static final Class70 aClass70_59 = new Class70(8);

	@OriginalMember(owner = "client!lj", name = "e", descriptor = "I")
	public static int anInt3301 = 0;

	@OriginalMember(owner = "client!lj", name = "f", descriptor = "Lclient!nk;")
	public static final Class143 aClass143_12 = new Class143();

	@OriginalMember(owner = "client!lj", name = "g", descriptor = "[J")
	public static final long[] aLongArray6 = new long[100];

	@OriginalMember(owner = "client!lj", name = "h", descriptor = "Z")
	public static boolean aBoolean237 = false;

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lclient!ja;Z)V")
	public static void method3408(@OriginalArg(0) Class81 arg0) {
		if (Static256.anInt4749 < 2 && Static14.anInt257 == 0 && !Static79.aBoolean97) {
			return;
		}
		@Pc(37) String local37;
		if (Static14.anInt257 == 1 && Static256.anInt4749 < 2) {
			local37 = Static165.aString287 + Static184.aString142 + Static237.aString188 + " ->";
		} else if (Static79.aBoolean97 && Static256.anInt4749 < 2) {
			local37 = Static312.aString270 + Static184.aString142 + Static303.aString264 + " ->";
		} else if (aBoolean237 && Static354.aBooleanArray30[81] && Static256.anInt4749 > 2) {
			local37 = Static196.method3623((Class6_Sub32) Static214.aClass211_24.aClass6_237.aClass6_247.aClass6_247);
		} else {
			@Pc(85) Class6_Sub32 local85 = (Class6_Sub32) Static214.aClass211_24.aClass6_237.aClass6_247;
			local37 = Static196.method3623(local85);
			@Pc(91) int[] local91 = null;
			if (Static153.method3085(local85.anInt4932)) {
				local91 = Static211.method3762((int) local85.aLong156).anIntArray465;
			} else if (Static166.method3284(local85.anInt4932)) {
				@Pc(144) Class44_Sub4_Sub4_Sub2 local144 = Static239.aClass44_Sub4_Sub4_Sub2Array8[(int) local85.aLong156];
				if (local144 != null) {
					local91 = local144.aClass18_1.anIntArray38;
				}
			} else if (Static341.method5621(local85.anInt4932)) {
				if (local85.anInt4932 == 1004) {
					local91 = Static196.method3622((int) local85.aLong156).anIntArray163;
				} else {
					local91 = Static196.method3622((int) (local85.aLong156 >>> 32 & 0x7FFFFFFFL)).anIntArray163;
				}
			}
			if (local91 != null) {
				local37 = local37 + Static276.method4748(local91);
			}
		}
		if (Static256.anInt4749 > 2) {
			local37 = local37 + "<col=ffffff> / " + (Static256.anInt4749 - 2) + Static275.aString222;
		}
		if (Static136.aClass132_8 != null) {
			@Pc(195) Class30 local195 = Static136.aClass132_8.method3530(arg0);
			if (local195 == null) {
				local195 = Static309.aClass30_5;
			}
			local195.method5330(local37, Static136.aClass132_8.anInt3509, Static88.aRandom1, Static136.aClass132_8.anInt3503, Static120.anInt2268, Static233.anIntArray489, Static136.aClass132_8.anInt3507, Static136.aClass132_8.anInt3526, Static96.anInt1771, Static291.aClass40Array35, Static161.anInt3051, Static136.aClass132_8.anInt3513, Static144.anIntArray335, Static136.aClass132_8.anInt3520);
			Static101.method2080(Static144.anIntArray335[2], Static144.anIntArray335[3], Static144.anIntArray335[0], Static144.anIntArray335[1]);
		} else if (Static7.aClass132_1 != null && Static105.anInt1941 == 0) {
			@Pc(262) int local262 = Static309.aClass30_5.method5344(Static214.anInt3933 + 16, Static139.anInt2513 + 4, Static233.anIntArray489, Static291.aClass40Array35, Static88.aRandom1, local37, Static96.anInt1771);
			Static101.method2080(local262 + Static220.aClass26_6.method508(local37), 16, Static139.anInt2513 + 4, Static214.anInt3933);
		}
	}
}
