import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!eh", name = "c", descriptor = "Lclient!ba;")
	public static Class23 aClass23_6;

	@OriginalMember(owner = "client!eh", name = "g", descriptor = "Ljava/lang/Object;")
	public static Object anObject4;

	@OriginalMember(owner = "client!eh", name = "i", descriptor = "F")
	public static float aFloat45;

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "I")
	public static int anInt2406 = 0;

	@OriginalMember(owner = "client!eh", name = "f", descriptor = "I")
	public static final int anInt2410 = 0;

	@OriginalMember(owner = "client!eh", name = "h", descriptor = "I")
	public static int anInt2411 = 0;

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIBI)V")
	public static void method2034(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(35) String local35 = "tele " + arg0 + "," + (arg1 >> 6) + "," + (arg2 >> 6) + "," + (arg1 & 0x3F) + "," + (arg2 & 0x3F);
		System.out.println(local35);
		Static543.method7368(local35, true, false);
	}
}
