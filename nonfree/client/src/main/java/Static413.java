import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static413 {

	@OriginalMember(owner = "client!uj", name = "f", descriptor = "I")
	public static int anInt6623;

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "Lclient!jp;")
	public static final Class1_Sub19_Sub2 aClass1_Sub19_Sub2_1 = new Class1_Sub19_Sub2(5000);

	@OriginalMember(owner = "client!uj", name = "d", descriptor = "Z")
	public static boolean aBoolean582 = true;

	@OriginalMember(owner = "client!uj", name = "e", descriptor = "Lclient!tn;")
	public static final Class242 aClass242_112 = new Class242(70, 3);

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(B)V")
	public static void method5273() {
		Static290.anIntArray367 = Static12.method211(0.4F);
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(Z)V")
	public static void method5275() {
		@Pc(8) Class1_Sub3_Sub1 local8 = Static427.method5426(0, 15);
		local8.method385();
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lclient!i;III[Z)V")
	public static void method5276(@OriginalArg(0) Class1_Sub3_Sub11 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		if (Static452.aClass139Array3 == Static397.aClass139Array2) {
			return;
		}
		@Pc(9) int local9 = Static157.aClass139Array1[arg1].ca(arg2, arg3);
		for (@Pc(11) int local11 = 0; local11 <= arg1; local11++) {
			if (arg4 == null || arg4[local11]) {
				@Pc(22) Class139 local22 = Static157.aClass139Array1[local11];
				if (local22 != null) {
					local22.ba(arg0, arg2, local9 - local22.ca(arg2, arg3), arg3, 0, false);
				}
			}
		}
	}
}
