import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!fb", name = "c", descriptor = "I")
	public static int anInt1238;

	@OriginalMember(owner = "client!fb", name = "e", descriptor = "I")
	public static int anInt1240;

	@OriginalMember(owner = "client!fb", name = "f", descriptor = "I")
	public static int anInt1241;

	@OriginalMember(owner = "client!fb", name = "g", descriptor = "I")
	public static int anInt1242;

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "S")
	public static short aShort6 = 256;

	@OriginalMember(owner = "client!fb", name = "d", descriptor = "I")
	public static int anInt1239 = 0;

	@OriginalMember(owner = "client!fb", name = "h", descriptor = "Lclient!ia;")
	public static Class51 aClass51_379 = Static64.method1101("Bitte warten Sie)3)3)3");

	@OriginalMember(owner = "client!fb", name = "i", descriptor = "Lclient!ia;")
	public static Class51 aClass51_380 = Static64.method1101("Mem:");

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(III)V")
	public static void method929(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static86.anIntArray125[arg1] = arg0;
		@Pc(19) Class1_Sub24 local19 = (Class1_Sub24) Static22.aClass102_2.method3093((long) arg1);
		if (local19 == null) {
			local19 = new Class1_Sub24(Static144.method2489() + 500L);
			Static22.aClass102_2.method3083(local19, (long) arg1);
		} else {
			local19.aLong145 = Static144.method2489() + 500L;
		}
	}
}
