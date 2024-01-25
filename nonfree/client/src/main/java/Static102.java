import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!dg", name = "m", descriptor = "I")
	public static int anInt1792 = 0;

	@OriginalMember(owner = "client!dg", name = "E", descriptor = "I")
	public static int anInt1809 = 1;

	@OriginalMember(owner = "client!dg", name = "L", descriptor = "Lclient!ga;")
	public static final Class124 aClass124_14 = new Class124();

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIILclient!d;IILclient!ha;)V")
	public static void method1686(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Interface3 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class143 arg5) {
		if (Static8.anInt166 < 100) {
			Static554.method3437(arg5, arg2);
		}
		arg5.KA(arg0, arg1, arg4 + arg0, arg1 + arg3);
		@Pc(31) int local31;
		@Pc(49) int local49;
		if (Static8.anInt166 < 100) {
			local31 = arg0 + arg4 / 2;
			arg5.aa(arg0, arg1, arg4, arg3, -16777216, 0);
			local49 = arg1 + arg3 / 2 - 20 - 18;
			arg5.method6229(local31 - 152, local49, 304, 34, Static521.aColorArray4[Static21.anInt150].getRGB(), 0);
			arg5.aa(local31 - 150, local49 + 2, Static8.anInt166 * 3, 30, Static4.aColorArray1[Static21.anInt150].getRGB(), 0);
			Static32.aClass72_2.method6919(Static392.aColorArray5[Static21.anInt150].getRGB(), local31, Static49.aClass42_18.method730(Static259.anInt4113), local49 + 20, -1);
			return;
		}
		@Pc(105) int local105 = Static255.anInt4085 - (int) ((float) arg4 / Static407.aFloat125);
		local31 = Static361.anInt6318 + (int) ((float) arg3 / Static407.aFloat125);
		local49 = Static255.anInt4085 + (int) ((float) arg4 / Static407.aFloat125);
		Static322.anInt5884 = Static361.anInt6318 - (int) ((float) arg3 / Static407.aFloat125);
		Static573.anInt9368 = (int) ((float) (arg3 * 2) / Static407.aFloat125);
		Static366.anInt6510 = Static255.anInt4085 - (int) ((float) arg4 / Static407.aFloat125);
		Static376.anInt6560 = (int) ((float) (arg4 * 2) / Static407.aFloat125);
		@Pc(169) int local169 = Static361.anInt6318 - (int) ((float) arg3 / Static407.aFloat125);
		Static407.method5509(Static407.anInt6543 + local105, Static407.anInt6539 + local31, local49 + Static407.anInt6543, Static407.anInt6539 + local169, arg0, arg1, arg0 + arg4, arg3 + arg1 - -1);
		Static407.method5504(arg5);
		@Pc(197) Class124 local197 = Static407.method5505(arg5);
		Static468.method6906(arg5, local197);
		if (Static588.anInt9639 > 0) {
			Static452.anInt7898--;
			if (Static452.anInt7898 == 0) {
				Static452.anInt7898 = 20;
				Static588.anInt9639--;
			}
		}
		if (!Static451.aBoolean575) {
			return;
		}
		@Pc(231) int local231 = arg0 + arg4 - 5;
		@Pc(237) int local237 = arg3 + arg1 - 8;
		Static5.aClass72_1.method6923("Fps:" + Static581.anInt9565, -1, 16776960, local237, local231);
		@Pc(252) int local252 = local237 - 15;
		@Pc(254) Runtime local254 = Runtime.getRuntime();
		@Pc(264) int local264 = (int) ((local254.totalMemory() - local254.freeMemory()) / 1024L);
		@Pc(266) int local266 = 16776960;
		if (local264 > 65536) {
			local266 = 16711680;
		}
		Static5.aClass72_1.method6923("Mem:" + local264 + "k", -1, local266, local252, local231);
		local237 = local252 - 15;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(II)V")
	public static void method1692(@OriginalArg(0) int arg0) {
		@Pc(9) Class5_Sub2_Sub4 local9 = Static257.method3597(5, (long) arg0);
		local9.method2440();
	}

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "(Z)Z")
	public static boolean method1693() {
		return Static175.anInt2881 != 0;
	}
}
