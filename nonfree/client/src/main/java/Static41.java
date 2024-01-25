import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!bi", name = "k", descriptor = "I")
	public static int anInt1080;

	@OriginalMember(owner = "client!bi", name = "n", descriptor = "Z")
	public static boolean aBoolean88;

	@OriginalMember(owner = "client!bi", name = "r", descriptor = "I")
	public static int anInt1085;

	@OriginalMember(owner = "client!bi", name = "s", descriptor = "I")
	public static int anInt1086;

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(II[F)[F")
	public static float[] method995(@OriginalArg(0) int arg0, @OriginalArg(2) float[] arg1) {
		@Pc(6) float[] local6 = new float[arg0];
		Static600.method3765(arg1, 0, local6, 0, arg0);
		return local6;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(III)V")
	public static void method997(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class1_Sub3_Sub1 local12 = Static374.method5445(5, arg1);
		local12.method491();
		local12.anInt548 = arg0;
	}

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(III)Z")
	public static boolean method998(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x180) != 0;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(ILclient!fa;Lclient!ga;)V")
	public static void method999(@OriginalArg(1) Interface5 arg0, @OriginalArg(2) Class111 arg1) {
		Static352.anInterface5_8 = arg0;
		Static291.aClass111_67 = arg1;
	}
}
