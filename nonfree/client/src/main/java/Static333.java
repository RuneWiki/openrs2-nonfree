import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static333 {

	@OriginalMember(owner = "client!mn", name = "Q", descriptor = "I")
	public static int anInt5925;

	@OriginalMember(owner = "client!mn", name = "U", descriptor = "I")
	public static int anInt5926;

	@OriginalMember(owner = "client!mn", name = "N", descriptor = "Lclient!db;")
	public static final Class64 aClass64_291 = new Class64(61, -1);

	@OriginalMember(owner = "client!mn", name = "R", descriptor = "[I")
	public static final int[] anIntArray483 = new int[13];

	@OriginalMember(owner = "client!mn", name = "T", descriptor = "[I")
	public static final int[] anIntArray484 = new int[32];

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(IZZ)V")
	public static void method5017(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (arg1) {
			Static486.anInt8197--;
			if (Static486.anInt8197 == 0) {
				Static170.anIntArray696 = null;
			}
		}
		if (!arg0) {
			return;
		}
		Static266.anInt5139--;
		if (Static266.anInt5139 == 0) {
			Static18.anIntArray203 = null;
			return;
		}
	}
}
