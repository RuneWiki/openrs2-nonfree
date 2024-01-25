import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!dc", name = "J", descriptor = "I")
	public static int anInt1266;

	@OriginalMember(owner = "client!dc", name = "L", descriptor = "Lclient!qj;")
	public static Class165 aClass165_22;

	@OriginalMember(owner = "client!dc", name = "N", descriptor = "F")
	public static float aFloat26;

	@OriginalMember(owner = "client!dc", name = "R", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray7;

	@OriginalMember(owner = "client!dc", name = "O", descriptor = "I")
	public static int anInt1269 = -1;

	@OriginalMember(owner = "client!dc", name = "T", descriptor = "Ljava/lang/String;")
	public static final String aString47 = "flash2:";

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(III)Lclient!mg;")
	public static Class5_Sub4 method1233(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class204 local7 = Static138.aClass204ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass5_Sub4_2;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Z)V")
	public static void method1235() {
		@Pc(1) Class140 local1 = Static44.aClass140_25;
		synchronized (Static44.aClass140_25) {
			Static44.aClass140_25.method3819();
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(BLjava/lang/String;)J")
	public static long method1236(@OriginalArg(1) String arg0) {
		@Pc(7) long local7 = 0L;
		@Pc(10) int local10 = arg0.length();
		for (@Pc(12) int local12 = 0; local12 < local10; local12++) {
			local7 *= 37L;
			@Pc(22) char local22 = arg0.charAt(local12);
			if (local22 >= 'A' && local22 <= 'Z') {
				local7 += local22 + 1 - 65;
			} else if (local22 >= 'a' && local22 <= 'z') {
				local7 += local22 - 96;
			} else if (local22 >= '0' && local22 <= '9') {
				local7 += local22 + 27 - 48;
			}
			if (local7 >= 177917621779460413L) {
				break;
			}
		}
		while (local7 % 37L == 0L && local7 != 0L) {
			local7 /= 37L;
		}
		return local7;
	}
}
