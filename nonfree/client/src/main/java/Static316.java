import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static316 {

	@OriginalMember(owner = "client!kp", name = "C", descriptor = "I")
	public static int anInt8165;

	@OriginalMember(owner = "client!kp", name = "D", descriptor = "I")
	public static int anInt8166;

	@OriginalMember(owner = "client!kp", name = "E", descriptor = "I")
	public static int anInt8167;

	@OriginalMember(owner = "client!kp", name = "o", descriptor = "[I")
	public static final int[] anIntArray453 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

	@OriginalMember(owner = "client!kp", name = "q", descriptor = "Lclient!jo;")
	public static final Class187 aClass187_73 = new Class187(72, 2);

	@OriginalMember(owner = "client!kp", name = "w", descriptor = "[I")
	public static final int[] anIntArray454 = new int[32];

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(BI)Z")
	public static boolean method6935(@OriginalArg(1) int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(IJ)I")
	public static int method6936(@OriginalArg(1) long arg0) {
		Static625.method8337(arg0);
		return Static594.aCalendar3.get(1);
	}
}
