import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static170 {

	@OriginalMember(owner = "client!ft", name = "e", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar1 = Calendar.getInstance();

	@OriginalMember(owner = "client!ft", name = "f", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar2 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!ft", name = "h", descriptor = "I")
	public static final int anInt3358 = 0;

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(IBII)I")
	public static int method2768(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg1 & 0x3;
		if (local3 == 0) {
			return arg0;
		} else if (local3 == 1) {
			return arg2;
		} else if (local3 == 2) {
			return 4095 - arg0;
		} else {
			return 4095 - arg2;
		}
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(Lclient!so;B)V")
	public static void method2770(@OriginalArg(0) Class14_Sub29 arg0) {
		@Pc(9) int local9 = arg0.method5895();
		Static513.aClass204Array1 = new Class204[local9];
		for (@Pc(14) int local14 = 0; local14 < local9; local14++) {
			Static513.aClass204Array1[local14] = new Class204();
			Static513.aClass204Array1[local14].anInt6067 = arg0.method5895();
			Static513.aClass204Array1[local14].aString65 = arg0.method5903();
		}
		Static590.anInt10098 = arg0.method5895();
		Static468.anInt354 = arg0.method5895();
		Static327.anInt6191 = arg0.method5895();
		Static430.aClass217_Sub1Array2 = new Class217_Sub1[Static468.anInt354 + 1 - Static590.anInt10098];
		for (@Pc(70) int local70 = 0; local70 < Static327.anInt6191; local70++) {
			@Pc(76) int local76 = arg0.method5895();
			@Pc(84) Class217_Sub1 local84 = Static430.aClass217_Sub1Array2[local76] = new Class217_Sub1();
			local84.anInt9128 = arg0.method5866();
			local84.anInt9130 = arg0.method5878();
			local84.anInt9134 = local76 + Static590.anInt10098;
			local84.aString88 = arg0.method5903();
			local84.aString89 = arg0.method5903();
		}
		Static67.anInt1550 = arg0.method5878();
		Static594.aBoolean711 = true;
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(FIFF)F")
	public static float method2771(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		return arg1 + (arg2 - arg1) * arg0;
	}
}
