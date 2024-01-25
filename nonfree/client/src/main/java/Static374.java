import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static374 {

	@OriginalMember(owner = "client!nfa", name = "T", descriptor = "Lclient!jw;")
	public static final Class184 aClass184_8 = new Class184(4, 1);

	@OriginalMember(owner = "client!nfa", name = "Gb", descriptor = "[I")
	public static final int[] anIntArray446 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

	@OriginalMember(owner = "client!nfa", name = "Mb", descriptor = "[I")
	public static final int[] anIntArray447 = new int[14];

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(B)[Lclient!bk;")
	public static Class38[] method5639() {
		if (Static398.aClass38Array1 == null) {
			@Pc(14) Class38[] local14 = Static229.method3859(Static375.aClass359_4);
			@Pc(18) Class38[] local18 = new Class38[local14.length];
			@Pc(20) int local20 = 0;
			@Pc(25) int local25 = Static404.aClass2_Sub13_2.aClass33_Sub12_1.method4517();
			@Pc(84) int local84;
			@Pc(89) Class38 local89;
			label69: for (@Pc(27) int local27 = 0; local27 < local14.length; local27++) {
				@Pc(32) Class38 local32 = local14[local27];
				if ((local32.anInt973 <= 0 || local32.anInt973 >= 24) && local32.anInt978 >= 800 && local32.anInt972 >= 600 && (local25 != 2 || local32.anInt978 <= 800 && local32.anInt972 <= 600) && (local25 != 1 || local32.anInt978 <= 1024 && local32.anInt972 <= 768)) {
					for (local84 = 0; local84 < local20; local84++) {
						local89 = local18[local84];
						if (local32.anInt978 == local89.anInt978 && local89.anInt972 == local32.anInt972) {
							if (local89.anInt973 < local32.anInt973) {
								local18[local84] = local32;
							}
							continue label69;
						}
					}
					local18[local20] = local32;
					local20++;
				}
			}
			Static398.aClass38Array1 = new Class38[local20];
			Static649.method4860(local18, 0, Static398.aClass38Array1, 0, local20);
			@Pc(148) int[] local148 = new int[Static398.aClass38Array1.length];
			for (local84 = 0; local84 < Static398.aClass38Array1.length; local84++) {
				local89 = Static398.aClass38Array1[local84];
				local148[local84] = local89.anInt978 * local89.anInt972;
			}
			Static177.method3264(Static398.aClass38Array1, local148);
		}
		return Static398.aClass38Array1;
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(I)V")
	public static void method5640() {
		Static267.aClass233_36.method5663();
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method5648(@OriginalArg(1) String arg0) {
		System.out.println("Error: " + Static334.method5172("%0a", arg0, "\n"));
	}
}
