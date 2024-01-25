import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static494 {

	@OriginalMember(owner = "client!tba", name = "b", descriptor = "[I")
	public static int[] anIntArray521;

	@OriginalMember(owner = "client!tba", name = "i", descriptor = "[I")
	public static int[] anIntArray522;

	@OriginalMember(owner = "client!tba", name = "g", descriptor = "Z")
	public static boolean aBoolean704 = false;

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(IIB)Z")
	public static boolean method7021(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static14.method423(arg1, arg0) | (arg1 & 0x70000) != 0 || Static132.method5408(arg0, arg1);
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(III)Lclient!wca;")
	public static Class350 method7023(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class350 local12 = new Class350();
		local12.anInt10122 = -1;
		local12.anInt10120 = arg1 + 1 + 5;
		local12.anInt10126 = -1;
		local12.anInt10124 = arg0 + 1 + 5;
		local12.anIntArrayArray82 = new int[local12.anInt10120][local12.anInt10124];
		local12.method8207();
		return local12;
	}
}
