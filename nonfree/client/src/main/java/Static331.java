import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static331 {

	@OriginalMember(owner = "client!lba", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString59;

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "Lclient!pn;")
	public static final Class288 aClass288_3 = new Class288("WIP", 2);

	@OriginalMember(owner = "client!lba", name = "d", descriptor = "Lclient!lja;")
	public static final Class216 aClass216_90 = new Class216(17, 16);

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(I)V")
	public static void method4564() {
		Static124.aClass4_Sub20_4.method3147(Static124.aClass4_Sub20_4.aClass8_Sub3_2, 1);
		Static124.aClass4_Sub20_4.method3147(Static124.aClass4_Sub20_4.aClass8_Sub3_1, 1);
		Static124.aClass4_Sub20_4.method3147(Static124.aClass4_Sub20_4.aClass8_Sub16_2, 2);
		Static124.aClass4_Sub20_4.method3147(Static124.aClass4_Sub20_4.aClass8_Sub16_1, 2);
		Static124.aClass4_Sub20_4.method3147(Static124.aClass4_Sub20_4.aClass8_Sub24_1, 1);
		Static124.aClass4_Sub20_4.method3147(Static124.aClass4_Sub20_4.aClass8_Sub6_1, 1);
		Static124.aClass4_Sub20_4.method3147(Static124.aClass4_Sub20_4.aClass8_Sub17_1, 1);
		Static124.aClass4_Sub20_4.method3147(Static124.aClass4_Sub20_4.aClass8_Sub5_1, 1);
		Static124.aClass4_Sub20_4.method3147(Static124.aClass4_Sub20_4.aClass8_Sub19_1, 1);
		Static124.aClass4_Sub20_4.method3147(Static124.aClass4_Sub20_4.aClass8_Sub2_1, 1);
		Static124.aClass4_Sub20_4.method3147(Static124.aClass4_Sub20_4.aClass8_Sub8_1, 1);
		Static124.aClass4_Sub20_4.method3147(Static124.aClass4_Sub20_4.aClass8_Sub1_1, 1);
		Static124.aClass4_Sub20_4.method3147(Static124.aClass4_Sub20_4.aClass8_Sub12_1, 0);
		Static124.aClass4_Sub20_4.method3147(Static124.aClass4_Sub20_4.aClass8_Sub25_1, 1);
		Static124.aClass4_Sub20_4.method3147(Static124.aClass4_Sub20_4.aClass8_Sub27_1, 0);
		Static124.aClass4_Sub20_4.method3147(Static124.aClass4_Sub20_4.aClass8_Sub27_2, 0);
		Static124.aClass4_Sub20_4.method3147(Static124.aClass4_Sub20_4.aClass8_Sub14_1, 1);
		Static124.aClass4_Sub20_4.method3147(Static124.aClass4_Sub20_4.aClass8_Sub26_1, 0);
		Static124.aClass4_Sub20_4.method3147(Static124.aClass4_Sub20_4.aClass8_Sub29_1, 0);
		Static112.method2124();
		Static124.aClass4_Sub20_4.method3147(Static124.aClass4_Sub20_4.aClass8_Sub18_1, 1);
		Static124.aClass4_Sub20_4.method3147(Static124.aClass4_Sub20_4.aClass8_Sub23_1, 3);
		Static544.method7261();
		Static568.method7522();
		Static70.aBoolean93 = true;
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(Lclient!kq;I)V")
	public static void method4565(@OriginalArg(0) Class199 arg0) {
		if (arg0.anInt5037 == Static308.anInt9999) {
			Static109.aBooleanArray4[arg0.anInt5001] = true;
		}
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(IIILjava/lang/String;I)V")
	public static void method4566(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class199 local8 = Static203.method3070(arg0, arg1);
		if (local8 == null) {
			return;
		}
		if (local8.anObjectArray22 != null) {
			@Pc(18) Class4_Sub25 local18 = new Class4_Sub25();
			local18.aClass199_6 = local8;
			local18.aString41 = arg2;
			local18.anInt4284 = arg3;
			local18.anObjectArray2 = local8.anObjectArray22;
			Static237.method3393(local18);
		}
		if (Static656.anInt10356 != 10 || !Static75.method1604(local8).method814(arg3 - 1)) {
			return;
		}
		@Pc(60) Class4_Sub48 local60;
		if (arg3 == 1) {
			local60 = Static335.method4615(Static248.aClass216_75, Static669.aClass196_2);
			Static499.method6766(arg0, local8.anInt5002, arg1, local60);
			Static410.method5170(local60);
		}
		if (arg3 == 2) {
			local60 = Static335.method4615(Static416.aClass216_104, Static669.aClass196_2);
			Static499.method6766(arg0, local8.anInt5002, arg1, local60);
			Static410.method5170(local60);
		}
		if (arg3 == 3) {
			local60 = Static335.method4615(Static280.aClass216_152, Static669.aClass196_2);
			Static499.method6766(arg0, local8.anInt5002, arg1, local60);
			Static410.method5170(local60);
		}
		if (arg3 == 4) {
			local60 = Static335.method4615(Static207.aClass216_143, Static669.aClass196_2);
			Static499.method6766(arg0, local8.anInt5002, arg1, local60);
			Static410.method5170(local60);
		}
		if (arg3 == 5) {
			local60 = Static335.method4615(Static452.aClass216_114, Static669.aClass196_2);
			Static499.method6766(arg0, local8.anInt5002, arg1, local60);
			Static410.method5170(local60);
		}
		if (arg3 == 6) {
			local60 = Static335.method4615(Static190.aClass216_51, Static669.aClass196_2);
			Static499.method6766(arg0, local8.anInt5002, arg1, local60);
			Static410.method5170(local60);
		}
		if (arg3 == 7) {
			local60 = Static335.method4615(Static132.aClass216_48, Static669.aClass196_2);
			Static499.method6766(arg0, local8.anInt5002, arg1, local60);
			Static410.method5170(local60);
		}
		if (arg3 == 8) {
			local60 = Static335.method4615(Static394.aClass216_100, Static669.aClass196_2);
			Static499.method6766(arg0, local8.anInt5002, arg1, local60);
			Static410.method5170(local60);
		}
		if (arg3 == 9) {
			local60 = Static335.method4615(Static307.aClass216_137, Static669.aClass196_2);
			Static499.method6766(arg0, local8.anInt5002, arg1, local60);
			Static410.method5170(local60);
		}
		if (arg3 == 10) {
			local60 = Static335.method4615(Static493.aClass216_125, Static669.aClass196_2);
			Static499.method6766(arg0, local8.anInt5002, arg1, local60);
			Static410.method5170(local60);
		}
	}
}
