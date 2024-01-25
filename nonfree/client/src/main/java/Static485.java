import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static485 {

	@OriginalMember(owner = "client!pga", name = "b", descriptor = "(I)V")
	public static void method6258() {
		Static58.method725(Static713.aClass3_Sub55_31.aClass15_Sub21_1.method7460(), -103);
		@Pc(19) int local19 = (Static173.anInt3144 >> 12) + (Static714.anInt11156 >> 3);
		@Pc(27) int local27 = (Static235.anInt4471 >> 12) + (Static339.anInt5859 >> 3);
		Static712.anInt11117 = Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.aByte146 = 0;
		Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.method6616(8, 8);
		Static423.aByteArrayArray9 = new byte[18][];
		Static23.anIntArray13 = new int[18];
		Static551.aByteArrayArray18 = new byte[18][];
		Static504.anIntArray469 = new int[18];
		Static718.anIntArray638 = new int[18];
		Static46.anIntArray54 = new int[18];
		Static484.aByteArrayArray13 = new byte[18][];
		Static83.anIntArray86 = new int[18];
		Static257.aByteArrayArray8 = new byte[18][];
		Static74.aByteArrayArray2 = new byte[18][];
		Static423.anIntArray399 = new int[18];
		Static101.anIntArrayArray10 = new int[18][4];
		@Pc(78) int local78 = 0;
		@Pc(106) int local106;
		for (@Pc(95) int local95 = (local19 - (Static362.anInt8653 >> 4)) / 8; local95 <= (local19 + (Static362.anInt8653 >> 4)) / 8; local95++) {
			for (local106 = (local27 - (Static206.anInt11291 >> 4)) / 8; local106 <= ((Static206.anInt11291 >> 4) + local27) / 8; local106++) {
				@Pc(114) int local114 = (local95 << 8) + local106;
				Static46.anIntArray54[local78] = local114;
				Static718.anIntArray638[local78] = Static397.aClass221_113.method5096("m" + local95 + "_" + local106);
				Static504.anIntArray469[local78] = Static397.aClass221_113.method5096("l" + local95 + "_" + local106);
				Static423.anIntArray399[local78] = Static397.aClass221_113.method5096("n" + local95 + "_" + local106);
				Static23.anIntArray13[local78] = Static397.aClass221_113.method5096("um" + local95 + "_" + local106);
				Static83.anIntArray86[local78] = Static397.aClass221_113.method5096("ul" + local95 + "_" + local106);
				if (Static423.anIntArray399[local78] == -1) {
					Static718.anIntArray638[local78] = -1;
					Static504.anIntArray469[local78] = -1;
					Static23.anIntArray13[local78] = -1;
					Static83.anIntArray86[local78] = -1;
				}
				local78++;
			}
		}
		for (local106 = local78; local106 < Static423.anIntArray399.length; local106++) {
			Static423.anIntArray399[local106] = -1;
			Static718.anIntArray638[local106] = -1;
			Static504.anIntArray469[local106] = -1;
			Static23.anIntArray13[local106] = -1;
			Static83.anIntArray86[local106] = -1;
		}
		@Pc(306) byte local306;
		if (Static178.anInt3225 == 3) {
			local306 = 4;
		} else if (Static178.anInt3225 == 9) {
			local306 = 10;
		} else if (Static178.anInt3225 == 7) {
			local306 = 8;
		} else {
			throw new RuntimeException(String.valueOf(Static178.anInt3225));
		}
		Static524.method7459(local27, false, local19, local306);
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(II)V")
	public static void method6261() {
		Static337.aClass338_29.method8052(50);
		Static682.aClass338_62.method8052(50);
		Static594.aClass338_56.method8052(50);
		Static504.aClass338_42.method8052(50);
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(IIIII)V")
	public static void method6262(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(5) int local5 = 0; local5 < Static583.anInt9536; local5++) {
			@Pc(14) Rectangle local14 = Class320.aRectangleArray2[local5];
			if (arg0 < local14.width + local14.x && arg0 + arg3 > local14.x && arg1 < local14.y + local14.height && arg2 + arg1 > local14.y) {
				Static195.aBooleanArray17[local5] = true;
			}
		}
		Static30.method402(arg1, arg0 + arg3, arg0, arg2 + arg1);
	}
}
