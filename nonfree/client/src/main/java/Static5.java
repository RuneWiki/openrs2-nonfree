import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!ac", name = "O", descriptor = "Lclient!lb;")
	public static Class221 aClass221_1;

	@OriginalMember(owner = "client!ac", name = "D", descriptor = "I")
	public static int anInt75 = 0;

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(ZZ)Z")
	public static boolean method81(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!ac", name = "d", descriptor = "(III)Ljava/lang/String;")
	public static String method83(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) int local15 = arg1 - arg0;
		if (local15 < -9) {
			return "<col=ff0000>";
		} else if (local15 < -6) {
			return "<col=ff3000>";
		} else if (local15 < -3) {
			return "<col=ff7000>";
		} else if (local15 < 0) {
			return "<col=ffb000>";
		} else if (local15 > 9) {
			return "<col=00ff00>";
		} else if (local15 > 6) {
			return "<col=40ff00>";
		} else if (local15 > 3) {
			return "<col=80ff00>";
		} else if (local15 > 0) {
			return "<col=c0ff00>";
		} else {
			return "<col=ffff00>";
		}
	}

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "(Z)Z")
	public static boolean method84() {
		@Pc(7) boolean local7 = true;
		if (Static552.aClass194_1 == null) {
			if (Static403.aClass221_115.method5068(Static294.anInt5250)) {
				Static552.aClass194_1 = Static728.method4751(Static403.aClass221_115, Static294.anInt5250);
			} else {
				local7 = false;
			}
		}
		if (Static702.aClass194_2 == null) {
			if (Static403.aClass221_115.method5068(Static451.anInt7960)) {
				Static702.aClass194_2 = Static728.method4751(Static403.aClass221_115, Static451.anInt7960);
			} else {
				local7 = false;
			}
		}
		if (Static713.aClass194_3 == null) {
			if (Static403.aClass221_115.method5068(Static130.anInt2443)) {
				Static713.aClass194_3 = Static728.method4751(Static403.aClass221_115, Static130.anInt2443);
			} else {
				local7 = false;
			}
		}
		if (Static327.aClass330_6 == null) {
			if (Static385.aClass221_110.method5068(Static79.anInt1238)) {
				Static327.aClass330_6 = Static101.method1316(Static79.anInt1238, Static385.aClass221_110);
			} else {
				local7 = false;
			}
		}
		if (Static690.aClass194Array3 == null) {
			if (Static403.aClass221_115.method5068(Static79.anInt1238)) {
				Static690.aClass194Array3 = Static728.method4755(Static403.aClass221_115, Static79.anInt1238);
			} else {
				local7 = false;
			}
		}
		return local7;
	}
}
