import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!ap", name = "g", descriptor = "I")
	public static int anInt311;

	@OriginalMember(owner = "client!ap", name = "j", descriptor = "I")
	public static int anInt312;

	@OriginalMember(owner = "client!ap", name = "h", descriptor = "Lclient!wk;")
	public static Class246 aClass246_2 = new Class246(8);

	@OriginalMember(owner = "client!ap", name = "i", descriptor = "Lclient!rc;")
	public static final Class205 aClass205_3 = new Class205(101, 12);

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(I)Lclient!ml;")
	public static Class138_Sub1 method254() {
		return Static380.aClass138_Sub1Array2.length > Static131.anInt2697 ? Static380.aClass138_Sub1Array2[Static131.anInt2697++] : null;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(BI)Ljava/lang/String;")
	public static String method255(@OriginalArg(1) int arg0) {
		@Pc(8) String local8 = Integer.toString(arg0);
		for (@Pc(18) int local18 = local8.length() - 3; local18 > 0; local18 -= 3) {
			local8 = local8.substring(0, local18) + "," + local8.substring(local18);
		}
		if (local8.length() > 9) {
			return " <col=00ff80>" + local8.substring(0, local8.length() - 8) + Static148.aClass32_40.method701(Static107.anInt2498) + " (" + local8 + ")</col>";
		} else if (local8.length() > 6) {
			return " <col=ffffff>" + local8.substring(0, local8.length() - 4) + Static293.aClass32_100.method701(Static107.anInt2498) + " (" + local8 + ")</col>";
		} else {
			return " <col=ffff00>" + local8 + "</col>";
		}
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(III)I")
	public static int method256(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 > 22050) {
			arg1 = arg0;
			arg0 = 22050;
		}
		while (arg0 != 0) {
			@Pc(26) int local26 = arg1 % arg0;
			arg1 = arg0;
			arg0 = local26;
		}
		return arg1;
	}
}
