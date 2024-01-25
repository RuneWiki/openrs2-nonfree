import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static548 {

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "[I")
	public static int[] anIntArray648;

	@OriginalMember(owner = "client!uv", name = "c", descriptor = "I")
	public static int anInt8859;

	@OriginalMember(owner = "client!uv", name = "f", descriptor = "[[[J")
	public static long[][][] aLongArrayArrayArray1;

	@OriginalMember(owner = "client!uv", name = "i", descriptor = "[I")
	public static int[] anIntArray650;

	@OriginalMember(owner = "client!uv", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString121 = null;

	@OriginalMember(owner = "client!uv", name = "h", descriptor = "[J")
	public static final long[] aLongArray15 = new long[100];

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(Lclient!bd;IZII)V")
	public static void method7333(@OriginalArg(0) Class23 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(15) Class3_Sub17 local15 = (Class3_Sub17) Static200.aClass130_19.method3543(); local15 != null; local15 = (Class3_Sub17) Static200.aClass130_19.method3551()) {
			if (local15.anInt2487 == arg1 && local15.anInt2500 == arg2 << 9 && local15.anInt2497 == arg3 << 9 && local15.aClass23_1.anInt764 == arg0.anInt764) {
				if (local15.aClass3_Sub6_Sub2_2 != null) {
					Static164.aClass3_Sub6_Sub1_1.method291(local15.aClass3_Sub6_Sub2_2);
					local15.aClass3_Sub6_Sub2_2 = null;
				}
				if (local15.aClass3_Sub6_Sub2_3 != null) {
					Static164.aClass3_Sub6_Sub1_1.method291(local15.aClass3_Sub6_Sub2_3);
					local15.aClass3_Sub6_Sub2_3 = null;
				}
				local15.method7812();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(B)V")
	public static void method7334() {
		for (@Pc(3) int local3 = 0; local3 < 5; local3++) {
			Static508.aBooleanArray30[local3] = false;
		}
		Static587.anInt9355 = 0;
		Static459.anInt7522 = -1;
		Static86.anInt2159 = -1;
		Static349.anInt6121 = 0;
		Static205.anInt4130 = -1;
		Static471.anInt7695 = -1;
		Static446.anInt7363 = 1;
	}
}
