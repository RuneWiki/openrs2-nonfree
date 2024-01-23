import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static278 {

	@OriginalMember(owner = "client!tn", name = "g", descriptor = "[I")
	public static int[] anIntArray487;

	@OriginalMember(owner = "client!tn", name = "j", descriptor = "[Lclient!fk;")
	public static Interface2[] anInterface2Array1;

	@OriginalMember(owner = "client!tn", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString173 = " from your friend list first.";

	@OriginalMember(owner = "client!tn", name = "e", descriptor = "[Lclient!tk;")
	public static Class22_Sub7[] aClass22_Sub7Array1 = new Class22_Sub7[4];

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(III)J")
	public static long method4120(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub17 local7 = Static122.aClass1_Sub17ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return 0L;
		}
		for (@Pc(13) int local13 = 0; local13 < local7.anInt3452; local13++) {
			@Pc(22) Class60 local22 = local7.aClass60Array3[local13];
			if ((local22.aLong64 >> 29 & 0x3L) == 2L && local22.anInt1529 == arg1 && local22.anInt1522 == arg2) {
				return local22.aLong64;
			}
		}
		return 0L;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(I)Z")
	public static boolean method4121() {
		if (Static213.aBoolean287) {
			try {
				Static324.method4224("showVideoAd", Static117.aClass117_3.anApplet1);
				return true;
			} catch (@Pc(21) Throwable local21) {
			}
		}
		return false;
	}
}
