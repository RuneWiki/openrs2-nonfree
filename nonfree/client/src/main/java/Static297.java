import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static297 {

	@OriginalMember(owner = "client!td", name = "E", descriptor = "I")
	public static int anInt5913;

	@OriginalMember(owner = "client!td", name = "T", descriptor = "[I")
	public static int[] anIntArray483;

	@OriginalMember(owner = "client!td", name = "L", descriptor = "Ljava/lang/String;")
	public static String aString219 = "Close";

	@OriginalMember(owner = "client!td", name = "X", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar2 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!td", name = "bb", descriptor = "Z")
	public static boolean aBoolean407 = false;

	@OriginalMember(owner = "client!td", name = "hb", descriptor = "I")
	public static int anInt5928 = 0;

	@OriginalMember(owner = "client!td", name = "mb", descriptor = "I")
	public static int anInt5931 = 0;

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Lclient!fb;I)V")
	public static void method5051(@OriginalArg(0) Class3_Sub4 arg0) {
		@Pc(14) int local14 = arg0.method3633();
		Static188.aClass204Array1 = new Class204[local14];
		for (@Pc(19) int local19 = 0; local19 < local14; local19++) {
			Static188.aClass204Array1[local19] = new Class204();
			Static188.aClass204Array1[local19].anInt6241 = arg0.method3633();
			Static188.aClass204Array1[local19].aString231 = arg0.method3665();
		}
		Static216.anInt4416 = arg0.method3633();
		Static152.anInt2970 = arg0.method3633();
		Static157.anInt3025 = arg0.method3633();
		Static187.aClass58_Sub1Array1 = new Class58_Sub1[Static152.anInt2970 + 1 - Static216.anInt4416];
		for (@Pc(69) int local69 = 0; local69 < Static157.anInt3025; local69++) {
			@Pc(77) int local77 = arg0.method3633();
			@Pc(85) Class58_Sub1 local85 = Static187.aClass58_Sub1Array1[local77] = new Class58_Sub1();
			local85.anInt5528 = arg0.method3643();
			local85.anInt5529 = arg0.method3642();
			local85.anInt5541 = local77 + Static216.anInt4416;
			local85.aString196 = arg0.method3665();
			local85.aString195 = arg0.method3665();
		}
		Static190.anInt3979 = arg0.method3642();
		Static323.aBoolean425 = true;
	}

	@OriginalMember(owner = "client!td", name = "j", descriptor = "(I)V")
	public static void method5055() {
		@Pc(1) Class198 local1 = Static250.aClass198_45;
		synchronized (Static250.aClass198_45) {
			Static250.aClass198_45.method5236();
		}
	}
}
