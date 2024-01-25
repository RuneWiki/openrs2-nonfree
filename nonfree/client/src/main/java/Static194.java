import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static194 {

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "Lclient!vt;")
	public static final Class306 aClass306_43 = new Class306("Your friends list is full, max of 200 for free users, and 200 for members.", "Ihre Freunde-Liste ist voll!", "Votre liste d'amis est pleine (200 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 200 para usuários não pagantes, e 200 para membros.");

	@OriginalMember(owner = "client!hu", name = "b", descriptor = "Z")
	public static volatile boolean aBoolean233 = false;

	@OriginalMember(owner = "client!hu", name = "f", descriptor = "Lclient!ed;")
	public static final Class76 aClass76_1 = new Class76();

	@OriginalMember(owner = "client!hu", name = "g", descriptor = "Lclient!im;")
	public static final Class140 aClass140_63 = new Class140(14, 28);

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(I)V")
	public static void method2970() {
		Static458.aClass279_6.method6481();
		Static11.aClass61_1.method1456();
		Static477.aClass15_1.method572();
		Static308.aClass96_4.method2270();
		Static538.aClass242_2.method5834();
		Static342.aClass250_2.method5981();
		Static182.aClass218_1.method5225();
		Static489.aClass194_2.method4811();
		Static37.aClass247_1.method5889();
		Static463.aClass108_1.method2495();
		Static351.aClass228_1.method5340();
		Static323.aClass257_4.method6139();
		Static244.aClass272_4.method6381();
		Static526.aClass216_1.method5174();
		Static452.aClass317_2.method7534();
		Static335.aClass41_1.method1030();
		Static482.aClass82_1.method1917();
		Static270.aClass195_1.method4841();
		Static420.aClass95_2.method2266();
		Static529.aClass263_1.method6269();
		Static254.method4296();
		Static44.method916();
		Static120.method2020();
		if (Static145.aClass21_4 != Static71.aClass21_1) {
			for (@Pc(89) int local89 = 0; local89 < Static47.aByteArrayArray2.length; local89++) {
				Static47.aByteArrayArray2[local89] = null;
			}
			Static272.anInt5158 = 0;
		}
		Static479.method7105();
		Static341.method5170();
		Static113.method1914();
		Static445.method6367();
		Static259.method4362();
		Static180.aClass313_24.method7398();
		Static513.aClass122_10.method7269();
		Static189.aClass201_3.method4928();
		Static42.method904();
		Static390.aClass171_92.method4347();
		Static93.aClass171_38.method4347();
		Static429.aClass171_146.method4347();
		Static129.aClass171_46.method4347();
		Static361.aClass171_109.method4347();
		Static223.aClass171_77.method4347();
		Static235.aClass171_78.method4347();
		Static179.aClass171_69.method4347();
		Static543.aClass171_154.method4347();
		Static94.aClass171_39.method4347();
		Static410.aClass171_127.method4347();
		Static7.aClass171_5.method4347();
		Static409.aClass171_126.method4347();
		Static542.aClass171_152.method4347();
		Static546.aClass171_60.method4347();
		Static354.aClass171_105.method4347();
		Static140.aClass171_55.method4347();
		Static441.aClass171_137.method4347();
		Static266.aClass171_150.method4347();
		Static342.aClass171_98.method4347();
		Static193.aClass171_125.method4347();
		Static13.aClass171_12.method4347();
		Static88.aClass171_37.method4347();
		Static154.aClass171_59.method4347();
		Static192.aClass171_72.method4347();
		Static133.aClass171_47.method4347();
		Static307.aClass171_88.method4347();
		Static76.aClass171_30.method4347();
		Static352.aClass171_103.method4347();
		Static193.aClass171_124.method4347();
		Static71.aClass171_29.method4347();
		Static313.aClass171_93.method4347();
		Static321.aClass313_38.method7398();
		Static114.aClass313_11.method7398();
		Static304.aClass313_33.method7398();
		Static27.aClass313_3.method7398();
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(Ljava/lang/String;Ljava/io/File;I)V")
	public static void method2971(@OriginalArg(0) String arg0, @OriginalArg(1) File arg1) {
		Static341.aHashtable5.put(arg0, arg1);
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(III)V")
	public static void method2973(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class1_Sub1_Sub11 local10 = Static541.method7520(7, arg0);
		local10.method4946();
		local10.anInt5822 = arg1;
	}
}
