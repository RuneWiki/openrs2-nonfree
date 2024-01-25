import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static327 {

	@OriginalMember(owner = "client!lj", name = "x", descriptor = "[[[Z")
	public static boolean[][][] aBooleanArrayArrayArray1;

	@OriginalMember(owner = "client!lj", name = "z", descriptor = "I")
	public static int anInt6611;

	@OriginalMember(owner = "client!lj", name = "s", descriptor = "Lclient!uw;")
	public static final Class350 aClass350_6 = new Class350("", 11);

	@OriginalMember(owner = "client!lj", name = "B", descriptor = "Lclient!mu;")
	public static final Class215 aClass215_128 = new Class215(30, -1);

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(ZII)V")
	public static void method5619(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static600.anInt10555 == 1) {
			Static88.method2465(Static388.aClass2_Sub6_Sub3_4, arg1, arg0);
		} else if (Static600.anInt10555 == 2) {
			if (Static487.aBoolean676) {
				Static638.method9208(arg0 + Static465.method7210(), Static207.method4090() + arg1);
			} else {
				Static638.method9208(arg0, arg1);
			}
		}
		Static600.anInt10555 = 0;
		Static388.aClass2_Sub6_Sub3_4 = null;
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lclient!bp;III)V")
	public static void method5620(@OriginalArg(0) Class41 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		Static571.aClass41ArrayArray1[arg1][arg2] = arg0;
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIIFIFFFFLclient!qg;I)[B")
	public static byte[] method5622(@OriginalArg(3) float arg0, @OriginalArg(5) float arg1, @OriginalArg(6) float arg2, @OriginalArg(7) float arg3, @OriginalArg(8) float arg4, @OriginalArg(9) Class185 arg5) {
		@Pc(15) byte[] local15 = new byte[262144];
		Static558.method8313(arg3, local15, arg1, 0, arg4, arg5, arg2, arg0);
		return local15;
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(IZI)Z")
	public static boolean method5623(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class161 local8 = Static27.aClass342_3.method8534(arg1);
		if (arg0 == 11) {
			arg0 = 10;
		}
		if (arg0 >= 5 && arg0 <= 8) {
			arg0 = 4;
		}
		return local8.method4604(arg0);
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(ZIIII)V")
	public static void method5624(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static380.anInt7421 <= arg3 && Static237.anInt5159 >= arg3) {
			@Pc(19) int local19 = Static317.method5515(Static38.anInt823, arg2, Static161.anInt7734);
			@Pc(25) int local25 = Static317.method5515(Static38.anInt823, arg0, Static161.anInt7734);
			Static203.method4070(local25, arg1, arg3, local19);
		}
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(Z)I")
	public static int method5625() {
		return Static173.anInt4169;
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lclient!at;ZII)V")
	public static void method5626(@OriginalArg(0) Class24 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		Static178.anInt4288 = arg1;
		Static368.anInt7333 = arg2;
		Static214.aClass24_9 = arg0;
	}
}
