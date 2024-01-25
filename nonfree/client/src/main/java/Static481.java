import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static481 {

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "[I")
	public static final int[] anIntArray584 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!sea", name = "b", descriptor = "I")
	public static int anInt8211 = 13156520;

	@OriginalMember(owner = "client!sea", name = "c", descriptor = "Lclient!wp;")
	public static final Class363 aClass363_236 = new Class363(14, 5);

	@OriginalMember(owner = "client!sea", name = "d", descriptor = "Z")
	public static volatile boolean aBoolean644 = true;

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method6795(@OriginalArg(1) String arg0) {
		if (Static350.aClass150Array1 != null) {
			@Pc(20) Class2_Sub42 local20 = Static249.method3910(Static249.aClass286_79, Static400.aClass145_2);
			local20.aClass2_Sub15_Sub2_2.method4333(Static71.method1162(arg0));
			local20.aClass2_Sub15_Sub2_2.method4313(arg0);
			Static531.method7296(local20);
		}
	}
}
