import java.awt.Canvas;
import java.io.IOException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!da", name = "j", descriptor = "I")
	public static int anInt6737;

	@OriginalMember(owner = "client!da", name = "o", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas14;

	@OriginalMember(owner = "client!da", name = "q", descriptor = "Lclient!ofa;")
	public static Class5_Sub22 aClass5_Sub22_13;

	@OriginalMember(owner = "client!da", name = "c", descriptor = "I")
	public static int anInt6730 = 0;

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(II)V")
	public static void method6010(@OriginalArg(1) int arg0) {
		if (arg0 == 37) {
			Static620.aFloat146 = 3.0F;
		} else if (arg0 == 50) {
			Static620.aFloat146 = 4.0F;
		} else if (arg0 == 75) {
			Static620.aFloat146 = 6.0F;
		} else if (arg0 == 100) {
			Static620.aFloat146 = 8.0F;
		} else if (arg0 == 200) {
			Static620.aFloat146 = 16.0F;
		}
		Static181.anInt3236 = -1;
		Static181.anInt3236 = -1;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method6024(@OriginalArg(1) String arg0) {
		if (Static590.aStringArray77 == null) {
			Static300.method4663();
		}
		Static21.aCalendar1.setTime(new Date(Static95.method1587()));
		@Pc(24) int local24 = Static21.aCalendar1.get(11);
		@Pc(28) int local28 = Static21.aCalendar1.get(12);
		@Pc(37) int local37 = Static21.aCalendar1.get(13);
		@Pc(71) String local71 = Integer.toString(local24 / 10) + local24 % 10 + ":" + local28 / 10 + local28 % 10 + ":" + local37 / 10 + local37 % 10;
		@Pc(76) String[] local76 = Static481.method7093(arg0, '\n');
		for (@Pc(78) int local78 = 0; local78 < local76.length; local78++) {
			for (@Pc(82) int local82 = Static260.anInt4710; local82 > 0; local82--) {
				Static590.aStringArray77[local82] = Static590.aStringArray77[local82 - 1];
			}
			Static590.aStringArray77[0] = local71 + ": " + local76[local78];
			if (Static93.aFileOutputStream1 != null) {
				try {
					Static93.aFileOutputStream1.write(Static390.method5793(Static590.aStringArray77[0] + "\n"));
				} catch (@Pc(131) IOException local131) {
				}
			}
			if (Static590.aStringArray77.length - 1 > Static260.anInt4710) {
				if (Static189.anInt10183 > 0) {
					Static189.anInt10183++;
				}
				Static260.anInt4710++;
			}
		}
	}
}
