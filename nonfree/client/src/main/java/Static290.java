import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static290 {

	@OriginalMember(owner = "client!nu", name = "E", descriptor = "[I")
	public static int[] anIntArray367;

	@OriginalMember(owner = "client!nu", name = "N", descriptor = "Lclient!eh;")
	public static final Class67 aClass67_175 = new Class67(48, 3);

	@OriginalMember(owner = "client!nu", name = "O", descriptor = "Ljava/lang/String;")
	public static String aString53 = "";

	@OriginalMember(owner = "client!nu", name = "S", descriptor = "[I")
	public static int[] anIntArray368 = new int[2];

	@OriginalMember(owner = "client!nu", name = "T", descriptor = "Lclient!eh;")
	public static final Class67 aClass67_176 = new Class67(12, -1);

	@OriginalMember(owner = "client!nu", name = "U", descriptor = "Z")
	public static boolean aBoolean449 = false;

	@OriginalMember(owner = "client!nu", name = "g", descriptor = "(I)V")
	public static void method3879() {
		Static153.method1919();
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(IIII)V")
	public static void method3881(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(35) String local35 = "tele " + arg2 + "," + (arg1 >> 6) + "," + (arg0 >> 6) + "," + (arg1 & 0x3F) + "," + (arg0 & 0x3F);
		System.out.println(local35);
		Static56.method804(true, local35, false);
	}
}
