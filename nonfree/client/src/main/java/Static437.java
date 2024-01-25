import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static437 {

	@OriginalMember(owner = "client!we", name = "b", descriptor = "Lclient!bg;")
	public static final Class25 aClass25_114 = new Class25(25, -1);

	@OriginalMember(owner = "client!we", name = "d", descriptor = "I")
	public static int anInt7195 = 0;

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IZ)V")
	public static void method5898(@OriginalArg(0) int arg0) {
		@Pc(12) Class6_Sub1_Sub12 local12 = Static449.method5975(arg0, 9);
		local12.method3048();
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "([[II)V")
	public static void method5899(@OriginalArg(0) int[][] arg0) {
		Static347.anIntArrayArray54 = arg0;
	}
}
