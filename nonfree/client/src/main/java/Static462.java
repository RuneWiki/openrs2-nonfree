import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static462 {

	@OriginalMember(owner = "client!qm", name = "j", descriptor = "F")
	public static float aFloat183 = 0.0F;

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method6957(@OriginalArg(0) String arg0) {
		if (Class17.aString6.startsWith("win")) {
			return arg0 + ".dll";
		} else if (Class17.aString6.startsWith("linux")) {
			return "lib" + arg0 + ".so";
		} else if (Class17.aString6.startsWith("mac")) {
			return "lib" + arg0 + ".dylib";
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(JIII)V")
	public static void method6958(@OriginalArg(0) long arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = (int) arg0 >> 14 & 0x1F;
		@Pc(22) int local22 = (int) arg0 >> 20 & 0x3;
		@Pc(29) int local29 = (int) (arg0 >>> 32) & Integer.MAX_VALUE;
		if (local15 != 10 && local15 != 11 && local15 != 22) {
			Static46.method1367(true, local22, local15, arg2, 0, 0, 0, arg1);
			return;
		}
		@Pc(55) Class352 local55 = Static437.aClass199_3.method5342(local29);
		@Pc(66) int local66;
		@Pc(69) int local69;
		if (local22 == 0 || local22 == 2) {
			local69 = local55.anInt10132;
			local66 = local55.anInt10116;
		} else {
			local66 = local55.anInt10132;
			local69 = local55.anInt10116;
		}
		@Pc(80) int local80 = local55.anInt10097;
		if (local22 != 0) {
			local80 = (local80 << local22 & 0xF) + (local80 >> 4 - local22);
		}
		Static46.method1367(true, 0, 0, arg2, local69, local66, local80, arg1);
	}
}
