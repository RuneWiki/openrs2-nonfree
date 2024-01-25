import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static431 {

	@OriginalMember(owner = "client!ot", name = "c", descriptor = "Lclient!da;")
	public static Class73 aClass73_10;

	@OriginalMember(owner = "client!ot", name = "b", descriptor = "Z")
	public static boolean aBoolean647 = false;

	@OriginalMember(owner = "client!ot", name = "b", descriptor = "(B)V")
	public static void method6343() {
		@Pc(13) Class373 local13 = null;
		try {
			local13 = Static429.method6325("2");
			@Pc(27) Class5_Sub41 local27 = new Class5_Sub41(Static115.anInt2386 * 6 + 3);
			local27.method7798(1);
			local27.method7848(Static115.anInt2386);
			for (@Pc(37) int local37 = 0; local37 < Static326.anIntArray342.length; local37++) {
				if (Static180.aBooleanArray15[local37]) {
					local27.method7848(local37);
					local27.method7803(Static326.anIntArray342[local37]);
				}
			}
			local13.method8638(local27.aByteArray93, local27.anInt9230, 0);
		} catch (@Pc(71) Exception local71) {
		}
		try {
			if (local13 != null) {
				local13.method8641();
			}
		} catch (@Pc(78) Exception local78) {
		}
		Static404.aLong184 = Static547.method7619();
		Static550.aBoolean771 = false;
	}
}
