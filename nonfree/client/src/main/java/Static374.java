import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static374 {

	@OriginalMember(owner = "client!su", name = "n", descriptor = "F")
	public static float aFloat194;

	@OriginalMember(owner = "client!su", name = "m", descriptor = "Lclient!gk;")
	public static final Class83 aClass83_128 = new Class83("Drop", "Fallen lassen", "Poser", "Largar");

	@OriginalMember(owner = "client!su", name = "o", descriptor = "Lclient!gk;")
	public static final Class83 aClass83_129 = new Class83("Stellar Dawn is loading - please wait...", "Mechscape wird geladen - bitte warten...", "Chargement de Mechscape en cours - veuillez patienter...", "Mechscape carregando. Aguarde...");

	@OriginalMember(owner = "client!su", name = "p", descriptor = "I")
	public static int anInt6394 = -1;

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(ZI)V")
	public static void method4994(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			if (Static334.anInt5766 != -1) {
				Static201.method4602(Static334.anInt5766);
			}
			for (@Pc(19) Class4_Sub43 local19 = (Class4_Sub43) Static325.aClass102_29.method2705(); local19 != null; local19 = (Class4_Sub43) Static325.aClass102_29.method2704()) {
				if (!local19.method5683()) {
					local19 = (Class4_Sub43) Static325.aClass102_29.method2705();
					if (local19 == null) {
						break;
					}
				}
				Static90.method1606(true, local19, false);
			}
			Static334.anInt5766 = -1;
			Static325.aClass102_29 = new Class102(8);
			Static28.method529();
			Static334.anInt5766 = Static254.anInt4755;
			Static327.method4422(false);
			Static369.method4940();
			Static271.method3897(Static334.anInt5766);
		}
		Static132.method2315();
		Static157.anInt3147 = -1;
		Static368.method4938(Static343.anInt770);
		Static1.aClass16_Sub1_Sub5_Sub1_1 = new Class16_Sub1_Sub5_Sub1();
		Static1.aClass16_Sub1_Sub5_Sub1_1.anIntArray426[0] = Static326.anInt5666 / 2;
		Static1.aClass16_Sub1_Sub5_Sub1_1.anInt6892 = Static283.anInt5187 * 128 / 2;
		Static1.aClass16_Sub1_Sub5_Sub1_1.anInt6893 = Static326.anInt5666 * 128 / 2;
		Static1.aClass16_Sub1_Sub5_Sub1_1.anIntArray427[0] = Static283.anInt5187 / 2;
		Static145.anInt2906 = 0;
		Static163.anInt3197 = 0;
		if (Static111.anInt2386 == 2) {
			Static145.anInt2906 = Static188.anInt5355 << 7;
			Static163.anInt3197 = Static146.anInt266 << 7;
		} else {
			Static294.method514();
		}
		Static222.method3355();
		if (Static163.anInt3197 == 0 || Static145.anInt2906 == 0) {
			Static187.method2932(10);
		} else {
			Static63.method1134();
			Static187.method2932(28);
		}
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(II)I")
	public static int method4995(@OriginalArg(1) int arg0) {
		return arg0 >> 11 & 0x7F;
	}

	@OriginalMember(owner = "client!su", name = "b", descriptor = "(B)V")
	public static void method4996() {
		Static429.method5476(Static352.aClass215_82);
		Static3.aClass4_Sub12_Sub1_5.method2524(Static183.anInt3512);
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(Lclient!uu;IZ)V")
	public static void method4998(@OriginalArg(0) Class247 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(15) int local15 = arg0.anInt6821 == 0 ? arg0.anInt6833 : arg0.anInt6821;
		@Pc(27) int local27 = arg0.anInt6834 == 0 ? arg0.anInt6805 : arg0.anInt6834;
		Static218.method3278(local15, local27, Static297.aClass247ArrayArray2[arg0.anInt6809 >> 16], arg0.anInt6809, arg1);
		if (arg0.aClass247Array2 != null) {
			Static218.method3278(local15, local27, arg0.aClass247Array2, arg0.anInt6809, arg1);
		}
		@Pc(62) Class4_Sub43 local62 = (Class4_Sub43) Static325.aClass102_29.method2700((long) arg0.anInt6809);
		if (local62 != null) {
			Static395.method5164(arg1, local27, local62.anInt6979, local15);
		}
	}
}
