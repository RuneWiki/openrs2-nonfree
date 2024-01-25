import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static169 {

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "Lclient!wi;")
	public static final Class263 aClass263_24 = new Class263(13, 0, 1, 0);

	@OriginalMember(owner = "client!ij", name = "g", descriptor = "Lclient!cm;")
	public static final Class36 aClass36_70 = new Class36(29, 7);

	@OriginalMember(owner = "client!ij", name = "x", descriptor = "I")
	public static int anInt3170 = 0;

	@OriginalMember(owner = "client!ij", name = "y", descriptor = "Lclient!ui;")
	public static final Class242 aClass242_43 = new Class242("Checking for updates - ", "Suche nach Updates - ", "Vérification des mises à jour - ", "Verificando atualizações - ");

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lclient!jb;I)Ljava/lang/String;")
	public static String method2490(@OriginalArg(0) Class126 arg0) {
		if (Static55.method1118(arg0).method4447() == 0) {
			return null;
		} else if (arg0.aString41 == null || arg0.aString41.trim().length() == 0) {
			return Static197.aBoolean436 ? "Hidden-use" : null;
		} else {
			return arg0.aString41;
		}
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lclient!jb;IZ)Ljava/lang/String;")
	public static String method2492(@OriginalArg(0) Class126 arg0, @OriginalArg(1) int arg1) {
		if (!Static55.method1118(arg0).method4451(arg1) && arg0.anObjectArray20 == null) {
			return null;
		} else if (arg0.aStringArray24 == null || arg0.aStringArray24.length <= arg1 || arg0.aStringArray24[arg1] == null || arg0.aStringArray24[arg1].trim().length() == 0) {
			return Static197.aBoolean436 ? "Hidden-" + arg1 : null;
		} else {
			return arg0.aStringArray24[arg1];
		}
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(III)Z")
	public static boolean method2493(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Static370.anIntArrayArrayArray14[arg0][arg1][arg2];
		if (local7 == -Static244.anInt4451) {
			return false;
		} else if (local7 == Static244.anInt4451) {
			return true;
		} else {
			@Pc(22) int local22 = arg1 << Static372.anInt7558;
			@Pc(26) int local26 = arg2 << Static372.anInt7558;
			if (Static48.method1023(local22 + 1, Static346.aClass146Array2[arg0].I(arg1, arg2), local26 + 1) && Static48.method1023(local22 + Static205.anInt3908 - 1, Static346.aClass146Array2[arg0].I(arg1 + 1, arg2), local26 + 1) && Static48.method1023(local22 + Static205.anInt3908 - 1, Static346.aClass146Array2[arg0].I(arg1 + 1, arg2 + 1), local26 + Static205.anInt3908 - 1) && Static48.method1023(local22 + 1, Static346.aClass146Array2[arg0].I(arg1, arg2 + 1), local26 + Static205.anInt3908 - 1) && Static48.method1023(local22 + Static40.anInt1024, Static346.aClass146Array2[arg0].I(arg1, arg2), local26 + 1) && Static48.method1023(local22 + Static205.anInt3908 - 1, Static346.aClass146Array2[arg0].I(arg1 + 1, arg2), local26 + Static40.anInt1024) && Static48.method1023(local22 + Static40.anInt1024, Static346.aClass146Array2[arg0].I(arg1, arg2 + 1), local26 + Static205.anInt3908 - 1) && Static48.method1023(local22 + Static205.anInt3908 - 1, Static346.aClass146Array2[arg0].I(arg1, arg2), local26 + Static40.anInt1024) && Static48.method1023(local22 + Static40.anInt1024, Static346.aClass146Array2[arg0].I(arg1, arg2), local26 + Static40.anInt1024)) {
				Static370.anIntArrayArrayArray14[arg0][arg1][arg2] = Static244.anInt4451;
				return true;
			} else {
				Static370.anIntArrayArrayArray14[arg0][arg1][arg2] = -Static244.anInt4451;
				return false;
			}
		}
	}
}
