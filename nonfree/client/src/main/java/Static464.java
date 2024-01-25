import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static464 {

	@OriginalMember(owner = "client!wu", name = "b", descriptor = "Lclient!uu;")
	public static Class250 aClass250_106;

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "I")
	public static int anInt7828 = -1;

	@OriginalMember(owner = "client!wu", name = "c", descriptor = "[I")
	public static final int[] anIntArray528 = new int[14];

	@OriginalMember(owner = "client!wu", name = "f", descriptor = "I")
	public static int anInt7831 = 0;

	@OriginalMember(owner = "client!wu", name = "g", descriptor = "Z")
	public static boolean aBoolean522 = false;

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(ILclient!ga;IZ)V")
	public static void method6335(@OriginalArg(0) int arg0, @OriginalArg(1) Class82 arg1, @OriginalArg(2) int arg2) {
		@Pc(13) Class14 local13 = arg1.method1970(Static413.aClass167_11);
		if (local13 == null) {
			return;
		}
		Static413.aClass167_11.w(arg2, arg0, arg2 + arg1.anInt2192, arg0 - -arg1.anInt2216);
		if (Static439.anInt7311 < 3) {
			Static278.aClass2_9.method5830((float) arg2 + (float) arg1.anInt2192 / 2.0F, (float) arg0 + (float) arg1.anInt2216 / 2.0F, ((int) -Static19.aFloat6 & 0x3FFF) << 2, local13, arg2, arg0);
		} else {
			Static413.aClass167_11.GA(-16777216, local13, arg2, arg0);
		}
	}
}
