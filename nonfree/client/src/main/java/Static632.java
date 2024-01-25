import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static632 {

	@OriginalMember(owner = "client!wha", name = "F", descriptor = "[Z")
	public static boolean[] aBooleanArray26;

	@OriginalMember(owner = "client!wha", name = "x", descriptor = "I")
	public static int anInt10595 = 0;

	@OriginalMember(owner = "client!wha", name = "A", descriptor = "I")
	public static int anInt10598 = 0;

	@OriginalMember(owner = "client!wha", name = "E", descriptor = "Lclient!lga;")
	public static final Class185 aClass185_112 = new Class185(53, 3);

	@OriginalMember(owner = "client!wha", name = "a", descriptor = "(IIIIIBI)V")
	public static void method8624(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (Static87.aClass6_Sub33_6.aClass14_Sub22_3.method7288() != 0 && arg3 != 0 && Static530.anInt9223 < 50 && arg2 != -1) {
			Static433.aClass343Array1[Static530.anInt9223++] = new Class343((byte) 1, arg2, arg3, arg4, arg0, arg5, arg1, (Class9_Sub4) null);
		}
	}

	@OriginalMember(owner = "client!wha", name = "b", descriptor = "(II)V")
	public static void method8625(@OriginalArg(1) int arg0) {
		@Pc(21) Class6_Sub5_Sub19 local21 = Static348.method5721(arg0, 12);
		local21.method5174();
	}
}
