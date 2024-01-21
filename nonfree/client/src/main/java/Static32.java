import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!dd", name = "T", descriptor = "[I")
	public static int[] anIntArray77;

	@OriginalMember(owner = "client!dd", name = "Q", descriptor = "Lclient!lf;")
	public static Class49 aClass49_439 = method683("<br>(X");

	@OriginalMember(owner = "client!dd", name = "W", descriptor = "I")
	public static int anInt846 = 0;

	@OriginalMember(owner = "client!dd", name = "e", descriptor = "(I)V")
	public static void method681() {
		aClass49_439 = null;
		anIntArray77 = null;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Ljava/lang/String;I)Lclient!lf;")
	public static Class49 method683(@OriginalArg(0) String arg0) {
		@Pc(6) byte[] local6 = arg0.getBytes();
		@Pc(9) int local9 = local6.length;
		@Pc(11) int local11 = 0;
		@Pc(15) Class49 local15 = new Class49();
		local15.aByteArray28 = new byte[local9];
		while (local11 < local9) {
			@Pc(32) int local32 = local6[local11++] & 0xFF;
			if (local32 <= 45 && local32 >= 40) {
				if (local9 <= local11) {
					break;
				}
				@Pc(54) int local54 = local6[local11++] & 0xFF;
				local15.aByteArray28[local15.anInt2058++] = (byte) (local54 + local32 * 43 - 48 - 1720);
			} else if (local32 != 0) {
				local15.aByteArray28[local15.anInt2058++] = (byte) local32;
			}
		}
		local15.method1658();
		return local15.method1642();
	}
}
