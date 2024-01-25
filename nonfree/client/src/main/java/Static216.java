import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static216 {

	@OriginalMember(owner = "client!kn", name = "m", descriptor = "[[Lclient!go;")
	public static Class95[][] aClass95ArrayArray2;

	@OriginalMember(owner = "client!kn", name = "i", descriptor = "[S")
	public static final short[] aShortArray22 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!kn", name = "k", descriptor = "Lclient!dp;")
	public static final Class55 aClass55_29 = new Class55("Loading textures - ", "Lade Texturen - ", "Chargement des textures - ", "Carregando texturas - ");

	@OriginalMember(owner = "client!kn", name = "l", descriptor = "Lclient!kq;")
	public static final Class136 aClass136_3 = new Class136("WTQA", 2);

	@OriginalMember(owner = "client!kn", name = "n", descriptor = "Lclient!aa;")
	public static final Class2 aClass2_23 = new Class2(17, 12);

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(Lclient!gk;B)V")
	public static void method944(@OriginalArg(0) Class7_Sub14 arg0) {
		@Pc(9) int local9 = arg0.method3940();
		Static117.aClass97Array1 = new Class97[local9];
		for (@Pc(14) int local14 = 0; local14 < local9; local14++) {
			Static117.aClass97Array1[local14] = new Class97();
			Static117.aClass97Array1[local14].anInt2743 = arg0.method3940();
			Static117.aClass97Array1[local14].aString33 = arg0.method3987();
		}
		Static147.anInt2783 = arg0.method3940();
		Static417.anInt6629 = arg0.method3940();
		Static58.anInt1041 = arg0.method3940();
		Static335.aClass19_Sub1Array2 = new Class19_Sub1[Static417.anInt6629 + 1 - Static147.anInt2783];
		for (@Pc(67) int local67 = 0; local67 < Static58.anInt1041; local67++) {
			@Pc(75) int local75 = arg0.method3940();
			@Pc(83) Class19_Sub1 local83 = Static335.aClass19_Sub1Array2[local75] = new Class19_Sub1();
			local83.anInt2211 = arg0.method3981();
			local83.anInt2207 = arg0.method3938();
			local83.anInt2225 = Static147.anInt2783 + local75;
			local83.aString19 = arg0.method3987();
			local83.aString18 = arg0.method3987();
		}
		Static281.anInt7178 = arg0.method3938();
		Static419.aBoolean436 = true;
	}
}
