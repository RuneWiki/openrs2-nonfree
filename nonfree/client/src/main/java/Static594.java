import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static594 {

	@OriginalMember(owner = "client!ub", name = "H", descriptor = "Lclient!at;")
	public static final Class20 aClass20_62 = new Class20();

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIB)Ljava/lang/String;")
	public static String method8180(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg0 - arg1;
		if (local7 < -9) {
			return "<col=ff0000>";
		} else if (local7 < -6) {
			return "<col=ff3000>";
		} else if (local7 < -3) {
			return "<col=ff7000>";
		} else if (local7 < 0) {
			return "<col=ffb000>";
		} else if (local7 > 9) {
			return "<col=00ff00>";
		} else if (local7 > 6) {
			return "<col=40ff00>";
		} else if (local7 > 3) {
			return "<col=80ff00>";
		} else if (local7 > 0) {
			return "<col=c0ff00>";
		} else {
			return "<col=ffff00>";
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(III)V")
	public static void method8181(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static558.anInt8797 = arg1;
		Static144.anInt2845 = arg0;
		if (Static181.anInt3401 == 0) {
			Static95.anInt1605 = Static519.anInt8230 * 2 + Static558.anInt8797;
			Static166.anInt3251 = Static144.anInt2845 + Static287.anInt5049 * 2;
		} else if (Static181.anInt3401 == 1) {
			Static58.anInt7090 = Static144.anInt2845 / Static122.anInt2024 + Static526.anInt8350 + 2;
			Static492.anInt7974 = Static565.anInt8920 + Static558.anInt8797 / Static659.anInt10729 + 2;
			Static95.anInt1605 = Static659.anInt10729 * Static492.anInt7974;
			Static166.anInt3251 = Static122.anInt2024 * Static58.anInt7090;
			Static519.anInt8230 = Static95.anInt1605 - Static558.anInt8797 >> 1;
			Static287.anInt5049 = Static166.anInt3251 - Static144.anInt2845 >> 1;
		} else if (Static181.anInt3401 == 2) {
			Static95.anInt1605 = Static558.anInt8797;
			Static166.anInt3251 = Static144.anInt2845;
		}
	}
}
