import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!cn", name = "m", descriptor = "I")
	public static int anInt1683;

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(Lclient!cs;BIIIIIILclient!ha;III)V")
	public static void method1402(@OriginalArg(0) Class6_Sub2_Sub4 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class100 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		if (arg1 > arg9 && arg9 + arg8 > arg1 && arg4 > arg6 - 13 && arg6 + 3 > arg4 && arg0.aBoolean121) {
			arg3 = arg10;
		}
		@Pc(45) int[] local45 = null;
		if (Static238.method4146(arg0.anInt1738)) {
			local45 = Static266.aClass138_1.method3730((int) arg0.aLong42).lb;
		} else if (arg0.anInt1732 != -1) {
			local45 = Static266.aClass138_1.method3730(arg0.anInt1732).lb;
		} else if (Static74.method1294(arg0.anInt1738)) {
			@Pc(123) Class6_Sub46 local123 = (Class6_Sub46) Static347.aClass128_23.method3560((long) (int) arg0.aLong42);
			if (local123 != null) {
				@Pc(128) Class20_Sub2_Sub2_Sub1_Sub2 local128 = local123.aClass20_Sub2_Sub2_Sub1_Sub2_1;
				@Pc(131) Class247 local131 = local128.aClass247_1;
				if (local131.anIntArray467 != null) {
					local131 = local131.method6613(Static279.aClass294_1);
				}
				if (local131 != null) {
					local45 = local131.anIntArray465;
				}
			}
		} else if (Static420.method6609(arg0.anInt1738)) {
			@Pc(88) Class312 local88;
			if (arg0.anInt1738 == 1008) {
				local88 = Static283.aClass210_2.method5629((int) arg0.aLong42);
			} else {
				local88 = Static283.aClass210_2.method5629((int) (arg0.aLong42 >>> 32 & 0x7FFFFFFFL));
			}
			if (local88.anIntArray565 != null) {
				local88 = local88.method7866(Static279.aClass294_1);
			}
			if (local88 != null) {
				local45 = local88.anIntArray563;
			}
		}
		@Pc(156) String local156 = Static641.method8970(arg0);
		if (local45 != null) {
			local156 = local156 + Static109.method6911(local45);
		}
		Static173.aClass50_5.method5749(arg9 + 3, arg3, arg6, local156, Static428.aClass32Array16, Static535.anIntArray567);
		if (arg0.aBoolean122) {
			Static581.aClass32_30.method5071(Static31.aClass133_3.method3643(local156) + arg9 + 5, arg6 + -12);
		}
	}

	@OriginalMember(owner = "client!cn", name = "b", descriptor = "(I)V")
	public static void method1403() {
		Static147.aClass226Array2 = new Class226[500];
		Static572.anInt9600 = 0;
		Static57.anInt1238 = 0;
		Static337.aClass226Array3 = new Class226[500];
		Static583.anInt9671 = Static246.anInt4917;
		Static65.aClass226Array1 = new Class226[1000];
		Static496.anInt8600 = 0;
		Static582.aBoolean667 = false;
		Static339.anInt9925 = 0;
		Static542.aClass226Array4 = new Class226[2000];
		Static518.anIntArrayArrayArray19 = new int[Static535.anInt9275][Static544.anInt9353 + 1][Static608.anInt10072 + 1];
		Static484.anInt8378 = Static246.anInt4917;
		if (Static565.aClass100_15 instanceof oa) {
			Static365.aBoolean444 = false;
		} else {
			Static365.aBoolean444 = true;
		}
	}
}
