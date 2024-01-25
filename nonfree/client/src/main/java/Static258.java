import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static258 {

	@OriginalMember(owner = "client!je", name = "c", descriptor = "I")
	public static int anInt4764 = 0;

	@OriginalMember(owner = "client!je", name = "d", descriptor = "[Z")
	public static final boolean[] aBooleanArray14 = new boolean[100];

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(JI)V")
	public static void method4293(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static159.method2862(arg0 - 1L);
			Static159.method2862(1L);
		} else {
			Static159.method2862(arg0);
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(B)V")
	public static void method4294() {
		Static400.method6444();
		Static1.method8294();
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(III)Z")
	public static boolean method4296(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x8000) != 0;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(ILclient!sl;Lclient!hga;B)V")
	public static void method4297(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub3 arg1, @OriginalArg(2) Class138 arg2) {
		@Pc(17) Class3_Sub34 local17 = new Class3_Sub34();
		local17.anInt5182 = arg1.method4225();
		local17.anInt5185 = arg1.method4207();
		local17.anIntArray282 = new int[local17.anInt5182];
		local17.anIntArray279 = new int[local17.anInt5182];
		local17.anIntArray281 = new int[local17.anInt5182];
		local17.aClass304Array1 = new Class304[local17.anInt5182];
		local17.aClass304Array2 = new Class304[local17.anInt5182];
		local17.aByteArrayArrayArray16 = new byte[local17.anInt5182][][];
		for (@Pc(61) int local61 = 0; local61 < local17.anInt5182; local61++) {
			try {
				@Pc(67) int local67 = arg1.method4225();
				@Pc(82) String local82;
				@Pc(88) String local88;
				@Pc(90) int local90;
				if (local67 == 0 || local67 == 1 || local67 == 2) {
					local82 = arg1.method4233();
					local88 = arg1.method4233();
					local90 = 0;
					if (local67 == 1) {
						local90 = arg1.method4207();
					}
					local17.anIntArray281[local61] = local67;
					local17.anIntArray279[local61] = local90;
					local17.aClass304Array2[local61] = arg2.method3587(Static183.method3162(local82), local88);
				} else if (local67 == 3 || local67 == 4) {
					local82 = arg1.method4233();
					local88 = arg1.method4233();
					local90 = arg1.method4225();
					@Pc(145) String[] local145 = new String[local90];
					for (@Pc(147) int local147 = 0; local147 < local90; local147++) {
						local145[local147] = arg1.method4233();
					}
					@Pc(164) byte[][] local164 = new byte[local90][];
					@Pc(177) int local177;
					if (local67 == 3) {
						for (@Pc(169) int local169 = 0; local169 < local90; local169++) {
							local177 = arg1.method4207();
							local164[local169] = new byte[local177];
							arg1.method4206(local164[local169], local177, 0);
						}
					}
					local17.anIntArray281[local61] = local67;
					@Pc(202) Class[] local202 = new Class[local90];
					for (local177 = 0; local177 < local90; local177++) {
						local202[local177] = Static183.method3162(local145[local177]);
					}
					local17.aClass304Array1[local61] = arg2.method3578(local88, Static183.method3162(local82), local202);
					local17.aByteArrayArrayArray16[local61] = local164;
				}
			} catch (@Pc(243) ClassNotFoundException local243) {
				local17.anIntArray282[local61] = -1;
			} catch (@Pc(250) SecurityException local250) {
				local17.anIntArray282[local61] = -2;
			} catch (@Pc(257) NullPointerException local257) {
				local17.anIntArray282[local61] = -3;
			} catch (@Pc(264) Exception local264) {
				local17.anIntArray282[local61] = -4;
			} catch (@Pc(271) Throwable local271) {
				local17.anIntArray282[local61] = -5;
			}
		}
		Static161.aClass223_16.method5868(local17);
	}
}
