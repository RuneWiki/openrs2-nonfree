import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "Lclient!qq;")
	public static Class28 aClass28_14;

	@OriginalMember(owner = "client!cb", name = "d", descriptor = "Lclient!oe;")
	public static final Class186 aClass186_12 = new Class186(78, -2);

	@OriginalMember(owner = "client!cb", name = "e", descriptor = "Lclient!sk;")
	public static final Class231 aClass231_14 = new Class231("Loading defaults - ", "Lade Standardeinstellungen - ", "Chargement des paramètres par défaut - ", "Carregando padrões - ");

	@OriginalMember(owner = "client!cb", name = "f", descriptor = "Z")
	public static volatile boolean aBoolean76 = true;

	@OriginalMember(owner = "client!cb", name = "g", descriptor = "Lclient!ft;")
	public static Class88 aClass88_10 = new Class88();

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IILclient!uj;I)V")
	public static void method824(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub3_Sub6_Sub2 arg1, @OriginalArg(3) int arg2) {
		if (arg1.anInt6713 == arg0 && arg0 != -1) {
			@Pc(83) Class83 local83 = Static244.aClass174_2.method4011(arg0);
			@Pc(86) int local86 = local83.anInt1981;
			if (local86 == 1) {
				arg1.anInt6728 = 0;
				arg1.anInt6723 = 0;
				arg1.anInt6683 = 0;
				arg1.anInt6692 = 1;
				arg1.anInt6725 = arg2;
				Static34.method731(local83, arg1.aByte93, arg1.anInt6683, false, arg1.anInt6675, arg1.anInt6677);
			}
			if (local86 == 2) {
				arg1.anInt6728 = 0;
			}
		} else if (arg0 == -1 || arg1.anInt6713 == -1 || Static244.aClass174_2.method4011(arg0).anInt1998 >= Static244.aClass174_2.method4011(arg1.anInt6713).anInt1998) {
			arg1.anInt6713 = arg0;
			arg1.anInt6692 = 1;
			arg1.anInt6723 = 0;
			arg1.anInt6683 = 0;
			arg1.anInt6755 = arg1.anInt6756;
			arg1.anInt6728 = 0;
			arg1.anInt6725 = arg2;
			if (arg1.anInt6713 != -1) {
				Static34.method731(Static244.aClass174_2.method4011(arg1.anInt6713), arg1.aByte93, arg1.anInt6683, false, arg1.anInt6675, arg1.anInt6677);
			}
		}
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(I)V")
	public static void method825() {
		if (Static103.aClass30_1 != null) {
			Static103.aClass30_1.method741();
			Static103.aClass30_1 = null;
		}
		Static403.method5492();
		Static124.method3214();
		for (@Pc(19) int local19 = 0; local19 < 4; local19++) {
			Static254.aClass61Array2[local19].method1487();
		}
		Static22.method312(false);
		System.gc();
		Static258.method3972();
		Static75.anInt1505 = -1;
		Static284.aBoolean341 = false;
		Static433.method3962(true);
		Static206.anInt3592 = 0;
		Static261.anInt4478 = 0;
		Static80.anInt1561 = 0;
		Static99.anInt1814 = 0;
		Static371.anInt6170 = 0;
		for (@Pc(58) int local58 = 0; local58 < Static190.aClass107Array1.length; local58++) {
			Static190.aClass107Array1[local58] = null;
		}
		Static354.method4997();
		for (@Pc(73) int local73 = 0; local73 < 2048; local73++) {
			Static355.aClass3_Sub3_Sub6_Sub1Array1[local73] = null;
		}
		Static147.anInt7038 = 0;
		for (@Pc(89) int local89 = 0; local89 < 32768; local89++) {
			Static450.aClass3_Sub3_Sub6_Sub2Array1[local89] = null;
		}
		Static23.aClass137_4.method3178();
		Static207.method3241();
		Static443.anInt7221 = 0;
		Static71.aClass126_1.method2811();
		Static245.method3778();
		Static37.method5983();
		Static65.method1236(true);
		try {
			Static453.method333(Static165.aClass103_3.anApplet1, "loggedout");
		} catch (@Pc(132) Throwable local132) {
		}
		Static274.aLong150 = 0L;
		Static361.aClass6_Sub22_2 = null;
	}
}
