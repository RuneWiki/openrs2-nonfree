import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!f", name = "c", descriptor = "Lclient!hl;")
	public static Class68 aClass68_8;

	@OriginalMember(owner = "client!f", name = "a", descriptor = "Ljava/util/Calendar;")
	public static Calendar aCalendar5 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!f", name = "e", descriptor = "[I")
	public static int[] anIntArray471 = new int[2];

	@OriginalMember(owner = "client!f", name = "f", descriptor = "I")
	public static int anInt5402 = 0;

	@OriginalMember(owner = "client!f", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString328 = "purple:";

	@OriginalMember(owner = "client!f", name = "h", descriptor = "Z")
	public static boolean aBoolean364 = false;

	@OriginalMember(owner = "client!f", name = "i", descriptor = "I")
	public static int anInt5403 = 128;

	@OriginalMember(owner = "client!f", name = "j", descriptor = "I")
	public static int anInt5404 = 0;

	@OriginalMember(owner = "client!f", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString329 = "cyan:";

	@OriginalMember(owner = "client!f", name = "a", descriptor = "([BI)[B")
	public static byte[] method4590(@OriginalArg(0) byte[] arg0) {
		@Pc(2) int local2 = arg0.length;
		@Pc(9) byte[] local9 = new byte[local2];
		Static319.method1766(arg0, 0, local9, 0, local2);
		return local9;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IIII)V")
	public static void method4591(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(4) Class1_Sub2_Sub11 local4 = Static5.method35(arg2, 11);
		local4.method2866();
		local4.anInt3315 = arg0;
		local4.anInt3320 = arg1;
	}
}
