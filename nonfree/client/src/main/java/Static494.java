import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static494 {

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "Z")
	public static boolean aBoolean605 = true;

	@OriginalMember(owner = "client!rq", name = "c", descriptor = "I")
	public static int anInt8308 = -1;

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(ILjava/lang/String;)J")
	public static long method7231(@OriginalArg(1) String arg0) {
		@Pc(12) long local12 = 0L;
		@Pc(15) int local15 = arg0.length();
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			local12 *= 37L;
			@Pc(27) char local27 = arg0.charAt(local17);
			if (local27 >= 'A' && local27 <= 'Z') {
				local12 += local27 + 1 - 65;
			} else if (local27 >= 'a' && local27 <= 'z') {
				local12 += local27 + 1 - 97;
			} else if (local27 >= '0' && local27 <= '9') {
				local12 += local27 + 27 - 48;
			}
			if (local12 >= 177917621779460413L) {
				break;
			}
		}
		while (local12 % 37L == 0L && local12 != 0L) {
			local12 /= 37L;
		}
		return local12;
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(B)V")
	public static void method7232() {
		if (Static196.anInt3883 < 0) {
			Static523.anInt8995 = -1;
			Static196.anInt3883 = 0;
			Static181.anInt3236 = -1;
		}
		if (Static196.anInt3883 > Static620.anInt8201) {
			Static196.anInt3883 = Static620.anInt8201;
			Static523.anInt8995 = -1;
			Static181.anInt3236 = -1;
		}
		if (Static235.anInt4321 < 0) {
			Static235.anInt4321 = 0;
			Static523.anInt8995 = -1;
			Static181.anInt3236 = -1;
		}
		if (Static620.anInt8204 < Static235.anInt4321) {
			Static181.anInt3236 = -1;
			Static235.anInt4321 = Static620.anInt8204;
			Static523.anInt8995 = -1;
		}
	}
}
