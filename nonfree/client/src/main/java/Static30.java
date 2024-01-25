import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static30 {

	@OriginalMember(owner = "client!bda", name = "b", descriptor = "I")
	public static int anInt1018;

	@OriginalMember(owner = "client!bda", name = "k", descriptor = "Lclient!qq;")
	public static Class269 aClass269_3;

	@OriginalMember(owner = "client!bda", name = "n", descriptor = "[Z")
	public static boolean[] aBooleanArray4;

	@OriginalMember(owner = "client!bda", name = "l", descriptor = "Lclient!kfa;")
	public static final Class181 aClass181_7 = new Class181(13, 2);

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(BZZ)V")
	public static void method995(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (arg1) {
			Static276.anInt5350--;
			if (Static276.anInt5350 == 0) {
				Static29.anIntArray66 = null;
			}
		}
		if (!arg0) {
			return;
		}
		Static291.anInt5562--;
		if (Static291.anInt5562 == 0) {
			Static223.anIntArray301 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(JJ)J")
	public static long method996(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 | arg1;
	}
}
