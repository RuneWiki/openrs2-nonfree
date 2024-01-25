import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static361 {

	@OriginalMember(owner = "client!mh", name = "k", descriptor = "Lclient!gda;")
	public static Class126 aClass126_167;

	@OriginalMember(owner = "client!mh", name = "o", descriptor = "I")
	public static int anInt5885 = 0;

	@OriginalMember(owner = "client!mh", name = "j", descriptor = "Lclient!hl;")
	public static final Class156 aClass156_116 = new Class156(14, 10);

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(Ljava/lang/String;Z)J")
	public static long method5252(@OriginalArg(0) String arg0) {
		@Pc(7) long local7 = 0L;
		@Pc(10) int local10 = arg0.length();
		for (@Pc(21) int local21 = 0; local21 < local10; local21++) {
			local7 *= 37L;
			@Pc(31) char local31 = arg0.charAt(local21);
			if (local31 >= 'A' && local31 <= 'Z') {
				local7 += (long) (local31 + 1 - 65);
			} else if (local31 >= 'a' && local31 <= 'z') {
				local7 += (long) (local31 - 96);
			} else if (local31 >= '0' && local31 <= '9') {
				local7 += (long) (local31 - 21);
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

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "(II)V")
	public static void method5254(@OriginalArg(1) int arg0) {
		Static497.anIntArray462 = new int[arg0];
		Static553.anIntArray497 = new int[arg0];
		Static442.anIntArray434 = new int[arg0];
		Static250.anIntArray249 = new int[arg0];
		Static371.anIntArray362 = new int[arg0];
	}
}
