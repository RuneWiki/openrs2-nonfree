import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static160 {

	@OriginalMember(owner = "client!hp", name = "d", descriptor = "[I")
	public static int[] anIntArray251;

	@OriginalMember(owner = "client!hp", name = "i", descriptor = "I")
	public static int anInt2888 = 0;

	@OriginalMember(owner = "client!hp", name = "w", descriptor = "Lclient!ss;")
	public static final Class231 aClass231_58 = new Class231("Loading interface scripts - ", "Lade Interface-Skripte - ", "Chargement des interfaces - ", "Carregando interfaces - ");

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(IZ)Lclient!gi;")
	public static Class93 method2380(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0 >> 16;
		@Pc(11) int local11 = arg0 & 0xFFFF;
		if (Static188.aClass93ArrayArray4[local7] == null || Static188.aClass93ArrayArray4[local7][local11] == null) {
			@Pc(25) boolean local25 = Static195.method2779(local7);
			if (!local25) {
				return null;
			}
		}
		return Static188.aClass93ArrayArray4[local7][local11];
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(BII)V")
	public static void method2381(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class2_Sub1_Sub6 local8 = Static267.method3705(arg1, 7);
		local8.method2574();
		local8.anInt3131 = arg0;
	}
}
