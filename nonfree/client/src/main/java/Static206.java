import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static206 {

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "B")
	public static byte aByte49;

	@OriginalMember(owner = "client!hr", name = "e", descriptor = "Z")
	public static boolean aBoolean325;

	@OriginalMember(owner = "client!hr", name = "h", descriptor = "[I")
	public static int[] anIntArray240;

	@OriginalMember(owner = "client!hr", name = "q", descriptor = "I")
	public static int anInt4003;

	@OriginalMember(owner = "client!hr", name = "k", descriptor = "I")
	public static int anInt3999 = 2;

	@OriginalMember(owner = "client!hr", name = "o", descriptor = "[I")
	public static final int[] anIntArray242 = new int[32];

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(ILclient!r;)V")
	public static void method3319(@OriginalArg(1) Class100 arg0) {
		Static231.aClass40Array1 = new Class40[Static510.anIntArray605.length];
		for (@Pc(16) int local16 = 0; local16 < Static510.anIntArray605.length; local16++) {
			@Pc(22) int local22 = Static510.anIntArray605[local16];
			@Pc(27) Class294 local27 = Static461.method6506(Static312.aClass259_97, local22);
			@Pc(35) Class29 local35 = arg0.method6225(local27, Static596.method248(Static290.aClass259_87, local22));
			Static231.aClass40Array1[local16] = new Class40(local35, local27);
		}
	}
}
