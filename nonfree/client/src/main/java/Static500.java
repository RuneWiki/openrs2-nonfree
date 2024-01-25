import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static500 {

	@OriginalMember(owner = "client!pu", name = "s", descriptor = "Lclient!fh;")
	public static final Class118 aClass118_25 = new Class118(2);

	@OriginalMember(owner = "client!pu", name = "x", descriptor = "I")
	public static int anInt7992 = 0;

	@OriginalMember(owner = "client!pu", name = "B", descriptor = "Lclient!lk;")
	public static final Class225 aClass225_149 = new Class225(33, 20);

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(Ljava/lang/String;B)J")
	public static long method7129(@OriginalArg(0) String arg0) {
		@Pc(15) long local15 = 0L;
		@Pc(18) int local18 = arg0.length();
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			local15 *= 37L;
			@Pc(30) char local30 = arg0.charAt(local20);
			if (local30 >= 'A' && local30 <= 'Z') {
				local15 += (long) (local30 - 64);
			} else if (local30 >= 'a' && local30 <= 'z') {
				local15 += (long) (local30 + 1 - 97);
			} else if (local30 >= '0' && local30 <= '9') {
				local15 += (long) (local30 + 27 - 48);
			}
			if (local15 >= 177917621779460413L) {
				break;
			}
		}
		while (local15 % 37L == 0L && local15 != 0L) {
			local15 /= 37L;
		}
		return local15;
	}

	@OriginalMember(owner = "client!pu", name = "i", descriptor = "(I)V")
	public static void method7131() {
		for (@Pc(16) int local16 = 0; local16 < 5; local16++) {
			Static144.aBooleanArray12[local16] = false;
		}
		Static144.anInt2464 = -1;
		Static253.anInt3964 = -1;
		Static45.anInt602 = -1;
		Static345.anInt5345 = 0;
		Static60.anInt1040 = 1;
		Static48.anInt641 = 0;
		Static654.anInt10226 = -1;
	}

	@OriginalMember(owner = "client!pu", name = "h", descriptor = "(I)Z")
	public static boolean method7132() {
		if (Static396.aBoolean553) {
			try {
				Static736.method7134(Static214.anApplet1, "showVideoAd");
				return true;
			} catch (@Pc(21) Throwable local21) {
			}
		}
		return false;
	}
}
