import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static117 {

	@OriginalMember(owner = "client!fu", name = "d", descriptor = "I")
	public static int anInt2049;

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "I")
	public static int anInt2047 = -1;

	@OriginalMember(owner = "client!fu", name = "e", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray16 = new String[100];

	@OriginalMember(owner = "client!fu", name = "f", descriptor = "I")
	public static int anInt2050 = 0;

	@OriginalMember(owner = "client!fu", name = "g", descriptor = "Lclient!rp;")
	public static final Class220 aClass220_14 = new Class220(4);

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method1895(@OriginalArg(0) int arg0) {
		@Pc(8) String local8 = Integer.toString(arg0);
		for (@Pc(13) int local13 = local8.length() - 3; local13 > 0; local13 -= 3) {
			local8 = local8.substring(0, local13) + "," + local8.substring(local13);
		}
		if (local8.length() > 9) {
			return " <col=00ff80>" + local8.substring(0, local8.length() - 8) + Static243.aClass231_73.method5138(Static382.anInt6289) + " (" + local8 + ")</col>";
		} else if (local8.length() > 6) {
			return " <col=ffffff>" + local8.substring(0, local8.length() - 4) + Static33.aClass231_13.method5138(Static382.anInt6289) + " (" + local8 + ")</col>";
		} else {
			return " <col=ffff00>" + local8 + "</col>";
		}
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(Lclient!tq;I)V")
	public static void method1896(@OriginalArg(0) Class239 arg0) {
		@Pc(14) Class239 local14 = Static257.method3954(arg0);
		@Pc(22) int local22;
		@Pc(19) int local19;
		if (local14 == null) {
			local22 = Static235.anInt4053;
			local19 = Static381.anInt6279;
		} else {
			local19 = local14.anInt6408;
			local22 = local14.anInt6435;
		}
		Static79.method1460(local19, local22, false, arg0);
		Static214.method3327(arg0, local22, local19);
	}
}
