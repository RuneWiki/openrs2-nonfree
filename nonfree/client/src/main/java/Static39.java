import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!bha", name = "w", descriptor = "Lclient!wc;")
	public static Class47 aClass47_1;

	@OriginalMember(owner = "client!bha", name = "p", descriptor = "[I")
	public static final int[] anIntArray46 = new int[2048];

	@OriginalMember(owner = "client!bha", name = "r", descriptor = "Lclient!sea;")
	public static final Class304 aClass304_1 = new Class304();

	@OriginalMember(owner = "client!bha", name = "v", descriptor = "I")
	public static int anInt722 = 0;

	@OriginalMember(owner = "client!bha", name = "x", descriptor = "I")
	public static int anInt723 = 0;

	@OriginalMember(owner = "client!bha", name = "a", descriptor = "(II)V")
	public static void method751(@OriginalArg(0) int arg0) {
		if (arg0 == 37) {
			Static361.aFloat89 = 3.0F;
		} else if (arg0 == 50) {
			Static361.aFloat89 = 4.0F;
		} else if (arg0 == 75) {
			Static361.aFloat89 = 6.0F;
		} else if (arg0 == 100) {
			Static361.aFloat89 = 8.0F;
		} else if (arg0 == 200) {
			Static361.aFloat89 = 16.0F;
		}
		Static118.anInt3044 = -1;
		Static118.anInt3044 = -1;
	}

	@OriginalMember(owner = "client!bha", name = "e", descriptor = "(I)V")
	public static void method752() {
		if (Static165.aClass260ArrayArray1 == null) {
			return;
		}
		for (@Pc(17) int local17 = 0; local17 < Static165.aClass260ArrayArray1.length; local17++) {
			for (@Pc(21) int local21 = 0; local21 < Static165.aClass260ArrayArray1[local17].length; local21++) {
				Static165.aClass260ArrayArray1[local17][local21] = Static561.aClass260_2;
			}
		}
	}
}
