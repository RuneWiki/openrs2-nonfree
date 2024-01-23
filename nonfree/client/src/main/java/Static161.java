import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static161 {

	@OriginalMember(owner = "client!q", name = "b", descriptor = "Lclient!vb;")
	public static Class70_Sub1 aClass70_Sub1_46;

	@OriginalMember(owner = "client!q", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString6;

	@OriginalMember(owner = "client!q", name = "j", descriptor = "Lclient!mb;")
	public static Class70 aClass70_34;

	@OriginalMember(owner = "client!q", name = "z", descriptor = "I")
	public static int anInt3476;

	@OriginalMember(owner = "client!q", name = "K", descriptor = "I")
	public static int anInt3483;

	@OriginalMember(owner = "client!q", name = "M", descriptor = "I")
	public static int anInt3485;

	@OriginalMember(owner = "client!q", name = "c", descriptor = "I")
	public static int anInt3459 = 0;

	@OriginalMember(owner = "client!q", name = "g", descriptor = "Lclient!ia;")
	private static Class51 aClass51_1224 = Static64.method1101("Location");

	@OriginalMember(owner = "client!q", name = "h", descriptor = "[I")
	public static int[] anIntArray227 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!q", name = "q", descriptor = "[S")
	public static short[] aShortArray26 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!q", name = "E", descriptor = "Lclient!ia;")
	private static Class51 aClass51_1227 = Static64.method1101("Unable to find ");

	@OriginalMember(owner = "client!q", name = "B", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1225 = aClass51_1227;

	@OriginalMember(owner = "client!q", name = "C", descriptor = "I")
	public static int anInt3478 = 0;

	@OriginalMember(owner = "client!q", name = "D", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1226 = Static64.method1101("<col=00ff00>");

	@OriginalMember(owner = "client!q", name = "F", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1228 = aClass51_1224;

	@OriginalMember(owner = "client!q", name = "H", descriptor = "I")
	public static int anInt3480 = -1;

	@OriginalMember(owner = "client!q", name = "N", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1229 = Static64.method1101("::noclip");

	@OriginalMember(owner = "client!q", name = "b", descriptor = "(III)I")
	public static int method2718(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class1_Sub10 local12 = (Class1_Sub10) Static23.aClass102_3.method3093((long) arg1);
		if (local12 == null) {
			return 0;
		} else if (arg0 == -1) {
			return 0;
		} else {
			@Pc(29) int local29 = 0;
			for (@Pc(31) int local31 = 0; local31 < local12.anIntArray96.length; local31++) {
				if (local12.anIntArray95[local31] == arg0) {
					local29 += local12.anIntArray96[local31];
				}
			}
			return local29;
		}
	}

	@OriginalMember(owner = "client!q", name = "c", descriptor = "(I)V")
	public static void method2719() {
		if (Static188.aClass22_1 != null) {
			@Pc(3) Class22 local3 = Static188.aClass22_1;
			synchronized (Static188.aClass22_1) {
				Static188.aClass22_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!q", name = "d", descriptor = "(I)V")
	public static void method2720() {
		Static218.anApplet_Sub1_5.method563();
	}
}
