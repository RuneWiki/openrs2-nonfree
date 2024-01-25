import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static442 {

	@OriginalMember(owner = "client!pe", name = "d", descriptor = "[Lclient!rw;")
	public static Class310[] aClass310Array1;

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "Lclient!rn;")
	public static final Class305 aClass305_69 = new Class305(68, 0);

	@OriginalMember(owner = "client!pe", name = "e", descriptor = "[I")
	public static final int[] anIntArray431 = new int[2048];

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIII)V")
	public static void method6446(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(35) String local35 = "tele " + arg2 + "," + (arg0 >> 6) + "," + (arg1 >> 6) + "," + (arg0 & 0x3F) + "," + (arg1 & 0x3F);
		System.out.println(local35);
		Static527.method7439(true, local35, false);
	}
}
