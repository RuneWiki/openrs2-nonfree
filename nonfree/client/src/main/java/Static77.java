import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!ds", name = "w", descriptor = "Lclient!g;")
	public static Class83 aClass83_36;

	@OriginalMember(owner = "client!ds", name = "q", descriptor = "Lclient!ec;")
	public static final Class62 aClass62_51 = new Class62("Stellar Dawn is loading - please wait...", "Mechscape wird geladen - bitte warten...", "Chargement de Mechscape en cours - veuillez patienter...", "Mechscape carregando. Aguarde...");

	@OriginalMember(owner = "client!ds", name = "v", descriptor = "Lclient!sd;")
	public static final Class208 aClass208_40 = new Class208(33, 5);

	@OriginalMember(owner = "client!ds", name = "x", descriptor = "I")
	public static int anInt1694 = 0;

	@OriginalMember(owner = "client!ds", name = "y", descriptor = "I")
	public static int anInt1695 = -50;

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(IILclient!cj;I)V")
	public static void method1329(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub2_Sub1_Sub1 arg1, @OriginalArg(3) int arg2) {
		if (arg0 == arg1.anInt5366 && arg0 != -1) {
			@Pc(12) Class102 local12 = Static333.aClass50_2.method1175(arg0);
			@Pc(15) int local15 = local12.anInt2985;
			if (local15 == 1) {
				arg1.anInt5407 = 0;
				arg1.anInt5414 = 0;
				arg1.anInt5367 = 0;
				arg1.anInt5405 = arg2;
				arg1.anInt5425 = 1;
				Static343.method5495(local12, Static182.aClass1_Sub2_Sub1_Sub1_1 == arg1, arg1.anInt6800, arg1.anInt5407, arg1.anInt6798, arg1.aByte73);
			}
			if (local15 == 2) {
				arg1.anInt5414 = 0;
			}
		} else if (arg0 == -1 || arg1.anInt5366 == -1 || Static333.aClass50_2.method1175(arg0).anInt2992 >= Static333.aClass50_2.method1175(arg1.anInt5366).anInt2992) {
			arg1.anInt5431 = arg1.anInt5432;
			arg1.anInt5425 = 1;
			arg1.anInt5366 = arg0;
			arg1.anInt5407 = 0;
			arg1.anInt5405 = arg2;
			arg1.anInt5414 = 0;
			arg1.anInt5367 = 0;
			if (arg1.anInt5366 != -1) {
				Static343.method5495(Static333.aClass50_2.method1175(arg1.anInt5366), Static182.aClass1_Sub2_Sub1_Sub1_1 == arg1, arg1.anInt6800, arg1.anInt5407, arg1.anInt6798, arg1.aByte73);
			}
		}
	}

	@OriginalMember(owner = "client!ds", name = "c", descriptor = "(B)V")
	public static void method1330() {
		@Pc(5) byte local5 = 0;
		if (Static382.aBoolean487) {
			local5 = 55;
		}
		Static44.method601(local5);
		Static230.aClass96_4.method2296(local5);
		Static57.aClass196_1.method4818(local5);
		Static207.aClass32_1.method577(local5);
		Static153.aClass116_1.method2788(local5);
		Static190.method3483(local5);
		Static217.method3890(local5);
		Static162.method2878(local5);
		Static284.method4975(local5);
		if (Static121.anInt6774 == 10) {
			Static181.method3326(28);
		} else if (Static121.anInt6774 == 30) {
			Static181.method3326(25);
			return;
		}
	}

	@OriginalMember(owner = "client!ds", name = "c", descriptor = "(I)V")
	public static void method1331() {
		Static313.aClass126_5.method3297();
		Static14.aClass233_1.method5628();
		Static182.aClass170_2.method4309();
		Static230.aClass96_4.method2304();
		Static207.aClass32_1.method580();
		Static57.aClass196_1.method4817();
		Static333.aClass50_2.method1174();
		Static153.aClass116_1.method2784();
		Static19.aClass132_1.method3437();
		Static179.aClass204_1.method5027();
		Static59.aClass194_1.method4752();
		Static197.aClass30_2.method538();
		Static78.aClass195_2.method4815();
		Static261.aClass97_1.method2361();
		Static57.aClass79_1.method1848();
		Static194.aClass52_1.method1204();
		Static371.aClass162_1.method4135();
		Static15.aClass36_1.method597();
		Static253.aClass67_2.method1490();
		Static80.aClass172_1.method4333();
		Static153.method2741();
		Static370.method4295();
		Static15.method178();
		Static224.method3962();
		Static263.aClass41_59.method829();
		Static189.aClass41_3.method829();
		Static253.aClass41_58.method829();
		Static230.aClass41_53.method829();
		Static351.aClass41_71.method829();
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(BLclient!pn;)V")
	public static void method1332(@OriginalArg(1) Class183 arg0) {
		Static76.aClass2_Sub24_Sub2_7.method5784(arg0.method4573());
	}
}
