import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static258 {

	@OriginalMember(owner = "client!ika", name = "B", descriptor = "Z")
	public static boolean aBoolean313;

	@OriginalMember(owner = "client!ika", name = "D", descriptor = "[[Lclient!fg;")
	public static Class113[][] aClass113ArrayArray1;

	@OriginalMember(owner = "client!ika", name = "v", descriptor = "Lclient!fj;")
	public static final Class117 aClass117_9 = new Class117(0, 3);

	@OriginalMember(owner = "client!ika", name = "A", descriptor = "Lclient!hj;")
	public static final Class151 aClass151_96 = new Class151(129, -2);

	@OriginalMember(owner = "client!ika", name = "E", descriptor = "[I")
	public static final int[] anIntArray306 = new int[13];

	@OriginalMember(owner = "client!ika", name = "b", descriptor = "(B)V")
	public static void method3731() {
		for (@Pc(6) Class4_Sub5_Sub17 local6 = (Class4_Sub5_Sub17) Static87.aClass163_14.method3639(); local6 != null; local6 = (Class4_Sub5_Sub17) Static87.aClass163_14.method3640()) {
			if (Static601.method7900(local6.anInt7673)) {
				Static149.method2599(local6);
			}
		}
	}

	@OriginalMember(owner = "client!ika", name = "a", descriptor = "([BILjava/lang/String;I)I")
	public static int method3732(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		@Pc(10) int local10 = arg2.length();
		for (@Pc(20) int local20 = 0; local20 < local10; local20 += 4) {
			@Pc(28) int local28 = Static555.method7393(arg2.charAt(local20));
			@Pc(47) int local47 = local10 > local20 + 1 ? Static555.method7393(arg2.charAt(local20 + 1)) : -1;
			@Pc(62) int local62 = local20 + 2 >= local10 ? -1 : Static555.method7393(arg2.charAt(local20 + 2));
			@Pc(77) int local77 = local10 > local20 + 3 ? Static555.method7393(arg2.charAt(local20 + 3)) : -1;
			arg0[arg1++] = (byte) (local47 >>> 4 | local28 << 2);
			if (local62 == -1) {
				break;
			}
			arg0[arg1++] = (byte) (local62 >>> 2 | (local47 & 0xF) << 4);
			if (local77 == -1) {
				break;
			}
			arg0[arg1++] = (byte) (local77 | (local62 & 0x3) << 6);
		}
		return arg1;
	}

	@OriginalMember(owner = "client!ika", name = "d", descriptor = "(I)V")
	public static void method3733() {
		if (Static253.anInt4127 < 0) {
			Static527.anInt8178 = -1;
			Static451.anInt7047 = -1;
			Static253.anInt4127 = 0;
		}
		if (Static154.anInt433 < Static253.anInt4127) {
			Static451.anInt7047 = -1;
			Static527.anInt8178 = -1;
			Static253.anInt4127 = Static154.anInt433;
		}
		if (Static379.anInt5638 < 0) {
			Static379.anInt5638 = 0;
			Static527.anInt8178 = -1;
			Static451.anInt7047 = -1;
		}
		if (Static379.anInt5638 > Static154.anInt440) {
			Static379.anInt5638 = Static154.anInt440;
			Static527.anInt8178 = -1;
			Static451.anInt7047 = -1;
		}
	}
}
