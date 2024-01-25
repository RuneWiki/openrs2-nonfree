import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static254 {

	@OriginalMember(owner = "client!jca", name = "E", descriptor = "Lclient!gg;")
	public static final Class112 aClass112_31 = new Class112(5);

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(IILclient!d;BLclient!ha;II)V")
	public static void method4791(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface5 arg2, @OriginalArg(4) Class33 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static102.anInt9953 < 100) {
			Static594.method8141(arg3, arg2);
		}
		arg3.KA(arg4, arg1, arg4 + arg0, arg1 - -arg5);
		@Pc(32) int local32;
		@Pc(43) int local43;
		if (Static102.anInt9953 < 100) {
			local32 = arg4 + arg0 / 2;
			local43 = arg5 / 2 + arg1 - 18 - 20;
			arg3.aa(arg4, arg1, arg0, arg5, -16777216, 0);
			arg3.method6174(local32 - 152, local43, 304, 34, Static436.aColorArray4[Static191.anInt4461].getRGB(), 0);
			arg3.aa(local32 - 150, local43 + 2, Static102.anInt9953 * 3, 30, Static515.aColorArray5[Static191.anInt4461].getRGB(), 0);
			Static16.aClass25_1.method5843(local43 + 20, -1, Static628.aColorArray6[Static191.anInt4461].getRGB(), Static287.aClass176_18.method4986(Static380.anInt7247), local32);
			return;
		}
		@Pc(106) int local106 = Static353.anInt6903 - (int) ((float) arg0 / Static361.aFloat88);
		local32 = Static386.anInt8408 + (int) ((float) arg5 / Static361.aFloat88);
		local43 = (int) ((float) arg0 / Static361.aFloat88) + Static353.anInt6903;
		Static46.anInt1027 = (int) ((float) (arg5 * 2) / Static361.aFloat88);
		@Pc(150) int local150 = Static386.anInt8408 - (int) ((float) arg5 / Static361.aFloat88);
		Static365.anInt7017 = Static353.anInt6903 - (int) ((float) arg0 / Static361.aFloat88);
		Static41.anInt760 = (int) ((float) (arg0 * 2) / Static361.aFloat88);
		Static193.anInt4494 = Static386.anInt8408 - (int) ((float) arg5 / Static361.aFloat88);
		Static361.method2159(Static361.anInt2229 + local106, Static361.anInt2230 + local32, local43 + Static361.anInt2229, Static361.anInt2230 + local150, arg4, arg1, arg4 + arg0, arg1 - -arg5 + 1);
		Static361.method2172(arg3);
		@Pc(205) Class276 local205 = Static361.method2170(arg3);
		Static4.method65(arg3, local205);
		if (Static473.anInt8493 > 0) {
			Static479.anInt8544--;
			if (Static479.anInt8544 == 0) {
				Static473.anInt8493--;
				Static479.anInt8544 = 20;
			}
		}
		if (!Static264.aBoolean502) {
			return;
		}
		@Pc(237) int local237 = arg4 + arg0 - 5;
		@Pc(243) int local243 = arg5 + arg1 - 8;
		Static528.aClass25_7.method5856(local237, "Fps:" + Static83.anInt6968, -1, local243, 16776960);
		@Pc(258) int local258 = local243 - 15;
		@Pc(260) Runtime local260 = Runtime.getRuntime();
		@Pc(270) int local270 = (int) ((local260.totalMemory() - local260.freeMemory()) / 1024L);
		@Pc(272) int local272 = 16776960;
		if (local270 > 65536) {
			local272 = 16711680;
		}
		Static528.aClass25_7.method5856(local237, "Mem:" + local270 + "k", -1, local258, local272);
		local243 = local258 - 15;
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method4792(@OriginalArg(0) String arg0) {
		@Pc(6) int local6 = arg0.length();
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < local6; local10++) {
			local8 = (local8 << 5) + arg0.charAt(local10) - local8;
		}
		return local8;
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(BLclient!tn;)Lclient!mfa;")
	public static Class213 method4793(@OriginalArg(1) Class3_Sub15 arg0) {
		@Pc(7) int local7 = arg0.method8402();
		return new Class213(local7);
	}
}
