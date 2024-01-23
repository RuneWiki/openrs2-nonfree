import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static163 {

	@OriginalMember(owner = "client!ln", name = "q", descriptor = "I")
	public static int anInt3557;

	@OriginalMember(owner = "client!ln", name = "B", descriptor = "I")
	public static int anInt3564;

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString216 = "Use";

	@OriginalMember(owner = "client!ln", name = "f", descriptor = "[B")
	public static byte[] aByteArray59 = new byte[520];

	@OriginalMember(owner = "client!ln", name = "h", descriptor = "I")
	public static int anInt3550 = 0;

	@OriginalMember(owner = "client!ln", name = "l", descriptor = "I")
	public static int anInt3553 = 2;

	@OriginalMember(owner = "client!ln", name = "v", descriptor = "I")
	public static int anInt3560 = 0;

	@OriginalMember(owner = "client!ln", name = "C", descriptor = "Ljava/lang/String;")
	public static String aString217 = "Connecting to update server";

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(Z)V")
	public static void method2576() {
		Static280.anInt5625++;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(III)J")
	public static long method2577(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub2 local7 = Static7.aClass1_Sub2ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null || local7.aClass119_1 == null ? 0L : local7.aClass119_1.aLong154;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(IIIII)V")
	public static void method2578(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(7) int local7 = 0; local7 < Static203.anInt5700; local7++) {
			if (arg0 < Static117.anIntArray424[local7] + Static197.anIntArray379[local7] && Static117.anIntArray424[local7] < arg1 + arg0 && Static103.anIntArray231[local7] + Static128.anIntArray278[local7] > arg3 && Static103.anIntArray231[local7] < arg3 + arg2) {
				Static55.aBooleanArray15[local7] = true;
			}
		}
	}

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "(III)V")
	public static void method2580(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class1_Sub3_Sub22 local8 = Static271.method4108(14, arg0);
		local8.method4468();
		local8.anInt5852 = arg1;
	}
}
