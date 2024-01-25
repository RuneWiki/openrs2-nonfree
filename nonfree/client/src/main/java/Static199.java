import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static199 {

	@OriginalMember(owner = "client!mr", name = "I", descriptor = "Lclient!am;")
	public static Class11 aClass11_146;

	@OriginalMember(owner = "client!mr", name = "r", descriptor = "Lclient!ph;")
	public static final Class154 aClass154_102 = new Class154(50);

	@OriginalMember(owner = "client!mr", name = "F", descriptor = "Z")
	public static boolean aBoolean564 = false;

	@OriginalMember(owner = "client!mr", name = "H", descriptor = "Ljava/lang/String;")
	public static String aString242 = "Ok";

	@OriginalMember(owner = "client!mr", name = "b", descriptor = "(II)Ljava/lang/String;")
	public static String method5385(@OriginalArg(0) int arg0) {
		return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(Lclient!ii;I)Ljava/lang/String;")
	public static String method5388(@OriginalArg(0) Class4_Sub18 arg0) {
		return arg0.aString94 == null || arg0.aString94.length() <= 0 ? arg0.aString93 : arg0.aString93 + Static33.aString19 + arg0.aString94;
	}

	@OriginalMember(owner = "client!mr", name = "c", descriptor = "(II)I")
	public static int method5391(@OriginalArg(0) int arg0) {
		return arg0 >> 11 & 0x7F;
	}

	@OriginalMember(owner = "client!mr", name = "c", descriptor = "(III)V")
	public static void method5393(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(5) int local5 = Static147.anInt3292 * arg1 >> 8;
		if (arg0 == -1 && !Static174.aBoolean320) {
			Static55.method1009();
		} else if (arg0 != -1 && (Static100.anInt2272 != arg0 || !Static298.method5068()) && local5 != 0 && !Static174.aBoolean320) {
			Static69.method1292(Static20.aClass11_9, local5, arg0);
		}
		Static100.anInt2272 = arg0;
	}
}
