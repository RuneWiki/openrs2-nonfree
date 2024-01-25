import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static303 {

	@OriginalMember(owner = "client!ol", name = "f", descriptor = "I")
	public static int anInt5069;

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "Lclient!kn;")
	public static final Class142 aClass142_77 = new Class142("Loaded update list", "Update-Liste geladen.", "Liste des mises à jour chargée", "Lista de atualizações carregada");

	@OriginalMember(owner = "client!ol", name = "g", descriptor = "Lclient!am;")
	public static Class14 aClass14_33 = new Class14();

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(III)V")
	public static void method4044(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static94.aClass148_3 == Static93.aClass148_2) {
			if (!Static224.method3210(-2, 1, false, 0, 0, arg0, 1, arg1)) {
				Static224.method3210(-3, 1, false, 0, 0, arg0, 1, arg1);
			}
		} else if (!Static224.method3210(-3, 1, false, 0, 0, arg0, 1, arg1)) {
			Static224.method3210(-2, 1, false, 0, 0, arg0, 1, arg1);
		}
	}

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "(B)V")
	public static void method4046() {
		@Pc(11) Class235 local11 = null;
		try {
			@Pc(17) Class253 local17 = Static259.aClass177_2.method3832(true, "2");
			while (local17.anInt6669 == 0) {
				Static331.method4343(1L);
			}
			if (local17.anInt6669 == 1) {
				local11 = (Class235) local17.anObject9;
				@Pc(42) byte[] local42 = new byte[(int) local11.method4941()];
				@Pc(56) int local56;
				for (@Pc(44) int local44 = 0; local44 < local42.length; local44 += local56) {
					local56 = local11.method4940(local44, local42, local42.length - local44);
					if (local56 == -1) {
						throw new IOException("EOF");
					}
				}
				Static244.method230(new Class1_Sub19(local42));
			}
		} catch (@Pc(80) Exception local80) {
		}
		try {
			if (local11 != null) {
				local11.method4942();
			}
		} catch (@Pc(87) Exception local87) {
		}
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(Lclient!ir;Z)V")
	public static void method4047(@OriginalArg(0) Class11_Sub1_Sub3_Sub2 arg0) {
		@Pc(11) Class1_Sub35 local11 = (Class1_Sub35) Static263.aClass208_28.method4405((long) arg0.anInt3279);
		if (local11 == null) {
			return;
		}
		if (local11.aClass1_Sub9_Sub4_3 != null) {
			Static123.aClass1_Sub9_Sub1_1.method4263(local11.aClass1_Sub9_Sub4_3);
			local11.aClass1_Sub9_Sub4_3 = null;
		}
		local11.method5953();
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(BII)Z")
	public static boolean method4048(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static465.method5695(arg0, arg1) & Static196.method2817(arg1, arg0);
	}
}
