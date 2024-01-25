import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!co", name = "o", descriptor = "I")
	public static int anInt4623;

	@OriginalMember(owner = "client!co", name = "j", descriptor = "Z")
	public static boolean aBoolean301 = false;

	@OriginalMember(owner = "client!co", name = "l", descriptor = "[I")
	public static final int[] anIntArray369 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

	@OriginalMember(owner = "client!co", name = "n", descriptor = "Lclient!qt;")
	public static final Class212 aClass212_64 = new Class212(79, 4);

	@OriginalMember(owner = "client!co", name = "p", descriptor = "I")
	public static int anInt4624 = 0;

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(IB)V")
	public static void method3950(@OriginalArg(0) int arg0) {
		Static99.anInt2119 = arg0;
		@Pc(7) Class83 local7 = Static408.aClass83_58;
		synchronized (Static408.aClass83_58) {
			Static408.aClass83_58.method2346();
		}
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(IIIII)V")
	public static void method3951(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class4_Sub1_Sub5 local8 = Static431.method5935(10, arg2);
		local8.method521();
		local8.anInt614 = arg1;
		local8.anInt616 = arg3;
		local8.anInt621 = arg0;
	}
}
