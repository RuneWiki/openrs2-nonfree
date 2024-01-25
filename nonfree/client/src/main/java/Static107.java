import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static107 {

	@OriginalMember(owner = "client!fg", name = "u", descriptor = "Lclient!jc;")
	public static final Class119 aClass119_57 = new Class119("Loaded update list", "Update-Liste geladen.", "Liste des mises à jour chargée", "Lista de atualizações carregada");

	@OriginalMember(owner = "client!fg", name = "w", descriptor = "I")
	public static int anInt2042 = 0;

	@OriginalMember(owner = "client!fg", name = "B", descriptor = "Lclient!jc;")
	public static final Class119 aClass119_58 = new Class119("Discard", "Ablegen", "Jeter", "Descartar");

	@OriginalMember(owner = "client!fg", name = "d", descriptor = "(I)V")
	public static void method1707() {
		Static52.method867(Static273.aClass103_176);
		Static18.aClass1_Sub28_Sub1_1.method5398(Static101.method1560());
		Static18.aClass1_Sub28_Sub1_1.method5393(Static69.anInt1304);
		Static18.aClass1_Sub28_Sub1_1.method5393(Static338.anInt5777);
		Static18.aClass1_Sub28_Sub1_1.method5398(Static453.aClass136_Sub1_1.anInt4443);
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(B[B)[B")
	public static byte[] method1708(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(11) byte[] local11 = new byte[arg0.length];
			Static468.method5036(arg0, 0, local11, 0, arg0.length);
			return local11;
		}
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(ILclient!ug;)V")
	public static void method1709(@OriginalArg(1) Class1_Sub28 arg0) {
		@Pc(9) int local9 = arg0.method5392();
		Static312.aClass196Array1 = new Class196[local9];
		for (@Pc(14) int local14 = 0; local14 < local9; local14++) {
			Static312.aClass196Array1[local14] = new Class196();
			Static312.aClass196Array1[local14].anInt5496 = arg0.method5392();
			Static312.aClass196Array1[local14].aString63 = arg0.method5369();
		}
		Static446.anInt7393 = arg0.method5392();
		Static140.anInt2486 = arg0.method5392();
		Static312.anInt5420 = arg0.method5392();
		Static222.aClass147_Sub1Array2 = new Class147_Sub1[Static140.anInt2486 + 1 - Static446.anInt7393];
		for (@Pc(68) int local68 = 0; local68 < Static312.anInt5420; local68++) {
			@Pc(74) int local74 = arg0.method5392();
			@Pc(82) Class147_Sub1 local82 = Static222.aClass147_Sub1Array2[local74] = new Class147_Sub1();
			local82.anInt6653 = arg0.method5337();
			local82.anInt6657 = arg0.method5355();
			local82.anInt6663 = Static446.anInt7393 + local74;
			local82.aString72 = arg0.method5369();
			local82.aString73 = arg0.method5369();
		}
		Static56.anInt1067 = arg0.method5355();
		Static340.aBoolean663 = true;
	}
}
