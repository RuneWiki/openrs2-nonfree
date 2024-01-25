import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static607 {

	@OriginalMember(owner = "client!ul", name = "c", descriptor = "I")
	public static int anInt9849 = 0;

	@OriginalMember(owner = "client!ul", name = "h", descriptor = "[I")
	public static int[] anIntArray657 = new int[1];

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(IILclient!ka;II)Lclient!tja;")
	public static Class338 method8310(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class184 arg2, @OriginalArg(3) int arg3) {
		return arg2 == null ? null : new Class338(arg0, arg1, arg3, arg2.na(), arg2.V(), arg2.RA(), arg2.fa(), arg2.EA(), arg2.HA(), arg2.G());
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(III)Z")
	public static boolean method8311(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!ul", name = "b", descriptor = "(III)V")
	public static void method8312(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class6_Sub4_Sub18 local9 = Static565.method7924((long) arg1, 14);
		local9.method7976();
		local9.anInt9466 = arg0;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(B)V")
	public static void method8313() {
		Static35.aClass10_1.method375();
	}
}
