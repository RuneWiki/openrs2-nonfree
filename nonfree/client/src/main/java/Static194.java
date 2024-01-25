import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static194 {

	@OriginalMember(owner = "client!mm", name = "e", descriptor = "I")
	public static int anInt3830;

	@OriginalMember(owner = "client!mm", name = "f", descriptor = "Lclient!la;")
	public static Class5_Sub17_Sub2 aClass5_Sub17_Sub2_1;

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "I")
	public static int anInt3826 = 0;

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(II)V")
	public static void method3497(@OriginalArg(1) int arg0) {
		if (Static323.method5433(arg0)) {
			Static310.method5280(-1, Static348.aClass96ArrayArray1[arg0]);
		}
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(ILclient!en;)V")
	public static void method3499(@OriginalArg(1) Class59 arg0) {
		if (Static156.anInt3123 != Static138.anInt2777 && (Static138.aClass51ArrayArrayArray1 != null && Static31.method760(arg0, Static156.anInt3123))) {
			Static138.anInt2777 = Static156.anInt3123;
		}
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(BIII)V")
	public static void method3500(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(35) String local35 = "tele " + arg1 + "," + (arg2 >> 6) + "," + (arg0 >> 6) + "," + (arg2 & 0x3F) + "," + (arg0 & 0x3F);
		System.out.println(local35);
		Static310.method5287(true, local35);
	}
}
