import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static415 {

	@OriginalMember(owner = "client!un", name = "n", descriptor = "Lclient!kn;")
	public static final Class142 aClass142_106 = new Class142("Checking for updates - ", "Suche nach Updates - ", "Vérification des mises à jour - ", "Verificando atualizações - ");

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(ZIII)I")
	public static int method5300(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class1_Sub28 local12 = Static133.method1698(arg0, arg1);
		if (local12 == null) {
			return 0;
		} else if (arg2 == -1) {
			return 0;
		} else {
			@Pc(23) int local23 = 0;
			for (@Pc(25) int local25 = 0; local25 < local12.anIntArray292.length; local25++) {
				if (local12.anIntArray291[local25] == arg2) {
					local23 += local12.anIntArray292[local25];
				}
			}
			return local23;
		}
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(IIII)Z")
	public static boolean method5301(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static292.method3894(arg0, arg1, arg2)) {
			@Pc(10) int local10 = arg1 << Static41.anInt612;
			@Pc(14) int local14 = arg2 << Static41.anInt612;
			return Static207.method3007(local10 + 1, Static452.aClass139Array3[arg0].ua(arg1, arg2) + arg3, local14 + 1) && Static207.method3007(local10 + Static383.anInt6136 - 1, Static452.aClass139Array3[arg0].ua(arg1 + 1, arg2) + arg3, local14 + 1) && Static207.method3007(local10 + Static383.anInt6136 - 1, Static452.aClass139Array3[arg0].ua(arg1 + 1, arg2 + 1) + arg3, local14 + Static383.anInt6136 - 1) && Static207.method3007(local10 + 1, Static452.aClass139Array3[arg0].ua(arg1, arg2 + 1) + arg3, local14 + Static383.anInt6136 - 1);
		} else {
			return false;
		}
	}
}
