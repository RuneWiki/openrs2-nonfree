import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!ee", name = "l", descriptor = "Z")
	public static boolean aBoolean100 = true;

	@OriginalMember(owner = "client!ee", name = "m", descriptor = "I")
	public static int anInt1541 = 0;

	@OriginalMember(owner = "client!ee", name = "z", descriptor = "Z")
	public static boolean aBoolean103 = false;

	@OriginalMember(owner = "client!ee", name = "L", descriptor = "Ljava/lang/String;")
	public static String aString57 = "yellow:";

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIII)V")
	public static void method1182(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class2_Sub13 local7 = Static52.aClass2_Sub13ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class147 local13 = local7.aClass147_1;
		if (local13 != null) {
			local13.anInt4783 = local13.anInt4783 * arg3 / 16;
			local13.anInt4778 = local13.anInt4778 * arg3 / 16;
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Ljava/lang/String;ZB)V")
	public static void method1183(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) {
		@Pc(25) int local25 = Static69.aClass2_Sub8_Sub5_4.method1248(arg0, 250);
		@Pc(32) int local32 = Static69.aClass2_Sub8_Sub5_4.method1243(arg0, 250) * 13;
		if (Static116.aBoolean184) {
			Static111.method1888(6, 6, local25 + 8, local32 + 4 + 4, 0);
			Static111.method1897(6, 6, local25 + 4 + 4, local32 - -4 + 4, 16777215);
		} else {
			Static77.method1447(6, 6, local25 + 4 + 4, local32 + 4 + 4, 0);
			Static77.method1457(6, 6, local25 + 8, 4 + 4 + local32, 16777215);
		}
		Static69.aClass2_Sub8_Sub5_4.method1235(arg0, 10, 10, local25, local32, 16777215, -1, 1, 1, 0);
		Static253.method3981(local32 + 8, 6, 6, local25 + 4 + 4);
		if (!arg1) {
			Static301.method4577(10, local32, 10, local25);
		} else if (Static116.aBoolean184) {
			Static116.method1951();
		} else {
			try {
				@Pc(165) Graphics local165 = Static227.aCanvas1.getGraphics();
				Static179.aClass3_1.method4440(local165);
			} catch (@Pc(173) Exception local173) {
				Static227.aCanvas1.repaint();
			}
		}
	}
}
