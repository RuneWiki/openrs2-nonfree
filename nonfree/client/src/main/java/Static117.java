import java.io.IOException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static117 {

	@OriginalMember(owner = "client!ef", name = "x", descriptor = "F")
	public static float aFloat99;

	@OriginalMember(owner = "client!ef", name = "n", descriptor = "D")
	public static double aDouble13 = -1.0D;

	@OriginalMember(owner = "client!ef", name = "t", descriptor = "I")
	public static int anInt3028 = 0;

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IZ)I")
	public static int method2789(@OriginalArg(1) boolean arg0) {
		@Pc(10) int local10 = Static178.anInt4220;
		if (local10 == 0) {
			return arg0 ? 0 : Static613.anInt10162;
		} else if (local10 == 1) {
			return Static613.anInt10162;
		} else if (local10 == 2) {
			return 0;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(III)Z")
	public static boolean method2791(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x70000) != 0 | Static500.method7312(arg0, arg1) || Static30.method570(arg0, arg1);
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method2792(@OriginalArg(1) String arg0) {
		if (Static457.aStringArray34 == null) {
			Static188.method3756();
		}
		Static209.aCalendar2.setTime(new Date(Static444.method6719()));
		@Pc(20) int local20 = Static209.aCalendar2.get(11);
		@Pc(24) int local24 = Static209.aCalendar2.get(12);
		@Pc(28) int local28 = Static209.aCalendar2.get(13);
		@Pc(70) String local70 = Integer.toString(local20 / 10) + local20 % 10 + ":" + local24 / 10 + local24 % 10 + ":" + local28 / 10 + local28 % 10;
		@Pc(75) String[] local75 = Static107.method2685('\n', arg0);
		for (@Pc(77) int local77 = 0; local77 < local75.length; local77++) {
			for (@Pc(81) int local81 = Static30.anInt576; local81 > 0; local81--) {
				Static457.aStringArray34[local81] = Static457.aStringArray34[local81 - 1];
			}
			Static457.aStringArray34[0] = local70 + ": " + local75[local77];
			if (Static67.aFileOutputStream1 != null) {
				try {
					Static67.aFileOutputStream1.write(Static438.method6664(Static457.aStringArray34[0] + "\n"));
				} catch (@Pc(127) IOException local127) {
				}
			}
			if (Static30.anInt576 < Static457.aStringArray34.length - 1) {
				Static30.anInt576++;
				if (Static558.anInt9506 > 0) {
					Static558.anInt9506++;
				}
			}
		}
	}
}
