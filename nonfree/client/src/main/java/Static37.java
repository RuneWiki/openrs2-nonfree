import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!gb", name = "j", descriptor = "Ljava/awt/FontMetrics;")
	public static FontMetrics aFontMetrics1;

	@OriginalMember(owner = "client!gb", name = "m", descriptor = "Lclient!fd;")
	public static Class24 aClass24_10;

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "Lclient!je;")
	public static Class40 aClass40_527 = Static69.method1231("Lade Texturen )2 ");

	@OriginalMember(owner = "client!gb", name = "d", descriptor = "Lclient!je;")
	private static Class40 aClass40_528 = Static69.method1231("Account locked as we suspect it has been stolen)3");

	@OriginalMember(owner = "client!gb", name = "e", descriptor = "Z")
	public static boolean aBoolean67 = false;

	@OriginalMember(owner = "client!gb", name = "f", descriptor = "[I")
	public static int[] anIntArray97 = new int[32768];

	@OriginalMember(owner = "client!gb", name = "i", descriptor = "I")
	public static final int anInt1000 = 50;

	@OriginalMember(owner = "client!gb", name = "k", descriptor = "I")
	public static int anInt1001 = 0;

	@OriginalMember(owner = "client!gb", name = "l", descriptor = "Lclient!je;")
	public static Class40 aClass40_529 = aClass40_528;

	@OriginalMember(owner = "client!gb", name = "n", descriptor = "Lclient!je;")
	public static Class40 aClass40_530 = Static69.method1231("VOLL");

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Z)V")
	public static void method677() {
		aClass40_529 = null;
		anIntArray97 = null;
		aClass40_527 = null;
		aClass40_530 = null;
		aClass24_10 = null;
		aFontMetrics1 = null;
		aClass40_528 = null;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(B)V")
	public static void method678() {
		Static24.aClass55_91.method1413();
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lclient!ha;IILclient!ua;)V")
	public static void method679(@OriginalArg(0) Class29 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class24_Sub1 arg2) {
		@Pc(12) byte[] local12 = null;
		@Pc(14) Class3 local14 = Static5.aClass3_1;
		synchronized (Static5.aClass3_1) {
			for (@Pc(21) Class2_Sub17 local21 = (Class2_Sub17) Static5.aClass3_1.method82(); local21 != null; local21 = (Class2_Sub17) Static5.aClass3_1.method74()) {
				if (local21.aLong100 == (long) arg1 && arg0 == local21.aClass29_4 && local21.anInt2084 == 0) {
					local12 = local21.aByteArray28;
					break;
				}
			}
		}
		if (local12 == null) {
			@Pc(77) byte[] local77 = arg0.method733(arg1);
			arg2.method1939(arg0, arg1, local77, true);
		} else {
			arg2.method1939(arg0, arg1, local12, true);
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(BLclient!je;)I")
	public static int method680(@OriginalArg(1) Class40 arg0) {
		if (Static17.anInt432 == 1) {
			return 7;
		} else if (arg0.method959(Static59.aClass40_773)) {
			return 1;
		} else if (arg0.method959(Static31.aClass40_435)) {
			return 1;
		} else if (arg0.method959(Static33.aClass40_1450)) {
			return 2;
		} else if (arg0.method959(Static29.aClass40_422)) {
			return 2;
		} else if (arg0.method959(Static48.aClass40_635)) {
			return 3;
		} else if (arg0.method959(Static64.aClass40_848)) {
			return 4;
		} else if (arg0.method959(Static76.aClass40_995)) {
			return 4;
		} else if (arg0.method959(Static33.aClass40_1451)) {
			return 5;
		} else if (arg0.method959(Static47.aClass40_630)) {
			return 6;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(B)V")
	public static void method681() {
		@Pc(3) boolean local3 = false;
		while (!local3) {
			local3 = true;
			for (@Pc(9) int local9 = 0; local9 < Static57.anInt1500 - 1; local9++) {
				if (Static83.anIntArray236[local9] < 1000 && Static83.anIntArray236[local9 + 1] > 1000) {
					local3 = false;
					@Pc(31) Class40 local31 = Static25.aClass40Array1[local9];
					Static25.aClass40Array1[local9] = Static25.aClass40Array1[local9 + 1];
					Static25.aClass40Array1[local9 + 1] = local31;
					@Pc(49) Class40 local49 = Static45.aClass40Array4[local9];
					Static45.aClass40Array4[local9] = Static45.aClass40Array4[local9 + 1];
					Static45.aClass40Array4[local9 + 1] = local49;
					@Pc(67) int local67 = Static83.anIntArray236[local9];
					Static83.anIntArray236[local9] = Static83.anIntArray236[local9 + 1];
					Static83.anIntArray236[local9 + 1] = local67;
					@Pc(85) int local85 = Static38.anIntArray98[local9];
					Static38.anIntArray98[local9] = Static38.anIntArray98[local9 + 1];
					Static38.anIntArray98[local9 + 1] = local85;
					@Pc(103) int local103 = Static129.anIntArray354[local9];
					Static129.anIntArray354[local9] = Static129.anIntArray354[local9 + 1];
					Static129.anIntArray354[local9 + 1] = local103;
					@Pc(121) int local121 = Static103.anIntArray284[local9];
					Static103.anIntArray284[local9] = Static103.anIntArray284[local9 + 1];
					Static103.anIntArray284[local9 + 1] = local121;
				}
			}
		}
	}
}
