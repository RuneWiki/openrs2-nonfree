import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static223 {

	@OriginalMember(owner = "client!mo", name = "o", descriptor = "S")
	public static short aShort50 = 32767;

	@OriginalMember(owner = "client!mo", name = "q", descriptor = "[S")
	public static final short[] aShortArray69 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(II)Z")
	public static boolean method3715(@OriginalArg(0) int arg0) {
		@Pc(7) Class23_Sub1 local7 = Static144.method2280(arg0);
		if (local7 == null) {
			return false;
		} else if (Static218.anInt3887 == 3) {
			@Pc(40) String local40 = "";
			if (Static291.aClass171_5 != Static238.aClass171_4) {
				local40 = ":" + (local7.anInt333 + 7000);
			}
			@Pc(56) String local56 = "";
			if (Static368.aString57 != null) {
				local56 = "/p=" + Static368.aString57;
			}
			@Pc(110) String local110 = "http://" + local7.aString3 + local40 + "/l=" + Static66.anInt1307 + "/a=" + Static68.anInt1341 + local56 + "/j" + (Static153.aBoolean211 ? "1" : "0") + ",o" + (Static199.aBoolean259 ? "1" : "0") + ",a2";
			try {
				Static144.aClient1.getAppletContext().showDocument(new URL(local110), "_self");
				return true;
			} catch (@Pc(120) Exception local120) {
				return false;
			}
		} else {
			Static200.aString35 = local7.aString3;
			Static41.anInt765 = local7.anInt333;
			if (Static238.aClass171_4 != Static291.aClass171_5) {
				Static303.anInt5267 = Static41.anInt765 + 40000;
				Static174.anInt3041 = Static41.anInt765 + 50000;
				Static269.anInt4741 = Static303.anInt5267;
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!mo", name = "b", descriptor = "(III)V")
	public static void method3716(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9;
		if (arg0 != Static238.anInt4221) {
			Static187.anIntArray379 = new int[arg0];
			for (local9 = 0; local9 < arg0; local9++) {
				Static187.anIntArray379[local9] = (local9 << 12) / arg0;
			}
			Static238.anInt4221 = arg0;
			Static171.anInt3000 = arg0 - 1;
			Static105.anInt2073 = arg0 * 32;
		}
		if (Static220.anInt3914 == arg1) {
			return;
		}
		if (arg1 == Static238.anInt4221) {
			Static351.anIntArray371 = Static187.anIntArray379;
		} else {
			Static351.anIntArray371 = new int[arg1];
			for (local9 = 0; local9 < arg1; local9++) {
				Static351.anIntArray371[local9] = (local9 << 12) / arg1;
			}
		}
		Static220.anInt3914 = arg1;
		Static300.anInt5187 = arg1 - 1;
	}
}
