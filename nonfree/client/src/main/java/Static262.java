import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static262 {

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString322 = "yellow:";

	@OriginalMember(owner = "client!qn", name = "g", descriptor = "Z")
	public static boolean aBoolean373 = false;

	@OriginalMember(owner = "client!qn", name = "n", descriptor = "Lclient!ik;")
	public static final Class103 aClass103_50 = new Class103(4);

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(BIIII)V")
	public static void method4381(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(16) int local16 = 0; local16 < Static43.anInt1148; local16++) {
			@Pc(22) Rectangle local22 = Class167.aRectangleArray2[local16];
			if (arg2 < local22.x + local22.width && arg2 + arg1 > local22.x && local22.height + local22.y > arg3 && arg0 + arg3 > local22.y) {
				Static339.aBooleanArray30[local16] = true;
			}
		}
	}

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "(I)V")
	public static void method4382() {
		if (Static22.aString38.toLowerCase().indexOf("microsoft") != -1) {
			Static98.anIntArray194[191] = 73;
			Static98.anIntArray194[220] = 74;
			Static98.anIntArray194[189] = 26;
			Static98.anIntArray194[219] = 42;
			Static98.anIntArray194[186] = 57;
			Static98.anIntArray194[223] = 28;
			Static98.anIntArray194[222] = 59;
			Static98.anIntArray194[190] = 72;
			Static98.anIntArray194[188] = 71;
			Static98.anIntArray194[221] = 43;
			Static98.anIntArray194[187] = 27;
			Static98.anIntArray194[192] = 58;
			return;
		}
		if (Static22.aMethod2 == null) {
			Static98.anIntArray194[192] = 58;
			Static98.anIntArray194[222] = 59;
		} else {
			Static98.anIntArray194[222] = 58;
			Static98.anIntArray194[520] = 59;
			Static98.anIntArray194[192] = 28;
		}
		Static98.anIntArray194[59] = 57;
		Static98.anIntArray194[61] = 27;
		Static98.anIntArray194[46] = 72;
		Static98.anIntArray194[93] = 43;
		Static98.anIntArray194[45] = 26;
		Static98.anIntArray194[44] = 71;
		Static98.anIntArray194[92] = 74;
		Static98.anIntArray194[91] = 42;
		Static98.anIntArray194[47] = 73;
	}

	@OriginalMember(owner = "client!qn", name = "c", descriptor = "(I)I")
	public static int method4383() {
		if ((double) Static306.aFloat50 == 3.0D) {
			return 37;
		} else if ((double) Static306.aFloat50 == 4.0D) {
			return 50;
		} else if ((double) Static306.aFloat50 == 6.0D) {
			return 75;
		} else if ((double) Static306.aFloat50 == 8.0D) {
			return 100;
		} else {
			return 200;
		}
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(BIII)V")
	public static void method4384(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(43) String local43 = "tele " + arg0 + "," + (arg1 >> 6) + "," + (arg2 >> 6) + "," + (arg1 & 0x3F) + "," + (arg2 & 0x3F);
		System.out.println(local43);
		Static346.method5570(true, local43);
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(II)I")
	public static int method4385(@OriginalArg(1) int arg0) {
		if (Static193.aClass61_1 != null) {
			Static193.aClass61_1.method1376();
			Static193.aClass61_1 = null;
		}
		Static35.anInt1015++;
		if (Static35.anInt1015 > 4) {
			Static120.anInt2721 = 0;
			Static35.anInt1015 = 0;
			return arg0;
		}
		Static120.anInt2721 = 0;
		if (Static129.anInt2832 == Static221.anInt4410) {
			Static221.anInt4410 = Static4.anInt75;
		} else {
			Static221.anInt4410 = Static129.anInt2832;
		}
		return -1;
	}
}
