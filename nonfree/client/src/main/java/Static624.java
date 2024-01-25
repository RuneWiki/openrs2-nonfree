import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static624 {

	@OriginalMember(owner = "client!vaa", name = "c", descriptor = "[Lclient!vr;")
	public static Class33[] aClass33Array24;

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "Z")
	public static boolean aBoolean697 = false;

	@OriginalMember(owner = "client!vaa", name = "e", descriptor = "Z")
	public static boolean aBoolean698 = false;

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(ZZ)Z")
	public static boolean method7811(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(BLjava/lang/String;)I")
	public static int method7815(@OriginalArg(1) String arg0) {
		@Pc(13) int local13 = arg0.length();
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < local13; local17++) {
			local15 = (local15 << 5) + arg0.charAt(local17) - local15;
		}
		return local15;
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(II)V")
	public static void method7816(@OriginalArg(0) int arg0) {
		if (Static406.anInt6454 == 7 && (Static260.anInt4398 == 0 && Static433.anInt8266 == 0)) {
			Static41.anInt961 = arg0;
			Static553.method7892(9);
		}
	}
}
