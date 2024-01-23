import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static185 {

	@OriginalMember(owner = "client!nl", name = "b", descriptor = "I")
	public static int anInt3673;

	@OriginalMember(owner = "client!nl", name = "c", descriptor = "I")
	public static int anInt3674;

	@OriginalMember(owner = "client!nl", name = "d", descriptor = "Lclient!cg;")
	public static Class22 aClass22_65;

	@OriginalMember(owner = "client!nl", name = "f", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray10;

	@OriginalMember(owner = "client!nl", name = "k", descriptor = "[I")
	public static int[] anIntArray307 = new int[4];

	@OriginalMember(owner = "client!nl", name = "o", descriptor = "Z")
	public static boolean aBoolean238 = false;

	@OriginalMember(owner = "client!nl", name = "q", descriptor = "I")
	public static int anInt3683 = 0;

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(BLclient!pi;)V")
	public static void method2976(@OriginalArg(1) Class4_Sub24 arg0) {
		if (arg0.aByteArray47.length - arg0.anInt3822 < 1) {
			return;
		}
		@Pc(22) int local22 = arg0.method3110();
		if (local22 < 0 || local22 > 11) {
			return;
		}
		@Pc(41) byte local41;
		if (local22 == 11) {
			local41 = 33;
		} else if (local22 == 10) {
			local41 = 32;
		} else if (local22 == 9) {
			local41 = 31;
		} else if (local22 == 8) {
			local41 = 30;
		} else if (local22 == 7) {
			local41 = 29;
		} else if (local22 == 6) {
			local41 = 28;
		} else if (local22 == 5) {
			local41 = 28;
		} else if (local22 == 4) {
			local41 = 24;
		} else if (local22 == 3) {
			local41 = 23;
		} else if (local22 == 2) {
			local41 = 22;
		} else if (local22 == 1) {
			local41 = 23;
		} else {
			local41 = 19;
		}
		if (local41 > arg0.aByteArray47.length - arg0.anInt3822) {
			return;
		}
		Static248.anInt4872 = arg0.method3110();
		if (Static248.anInt4872 < 1) {
			Static248.anInt4872 = 1;
		} else if (Static248.anInt4872 > 4) {
			Static248.anInt4872 = 4;
		}
		Static70.method1195(arg0.method3110() == 1);
		Static59.aBoolean75 = arg0.method3110() == 1;
		Static70.aBoolean83 = arg0.method3110() == 1;
		Static226.aBoolean286 = arg0.method3110() == 1;
		Static85.aBoolean102 = arg0.method3110() == 1;
		Static127.aBoolean163 = arg0.method3110() == 1;
		Static208.aBoolean248 = arg0.method3110() == 1;
		Static114.aBoolean143 = arg0.method3110() == 1;
		Static154.anInt3207 = arg0.method3110();
		if (Static154.anInt3207 > 2) {
			Static154.anInt3207 = 2;
		}
		if (local22 < 2) {
			Static253.aBoolean335 = arg0.method3110() == 1;
			arg0.method3110();
		} else {
			Static253.aBoolean335 = arg0.method3110() == 1;
		}
		Static304.aBoolean404 = arg0.method3110() == 1;
		Static50.aBoolean66 = arg0.method3110() == 1;
		Static188.anInt5754 = arg0.method3110();
		if (Static188.anInt5754 > 2) {
			Static188.anInt5754 = 2;
		}
		Static174.anInt3538 = Static188.anInt5754;
		Static159.aBoolean209 = arg0.method3110() == 1;
		Static265.anInt5214 = arg0.method3110();
		if (Static265.anInt5214 > 127) {
			Static265.anInt5214 = 127;
		}
		Static279.anInt5471 = arg0.method3110();
		Static192.anInt815 = arg0.method3110();
		if (Static192.anInt815 > 127) {
			Static192.anInt815 = 127;
		}
		if (local22 >= 1) {
			Static121.anInt2458 = arg0.method3085();
			Static104.anInt2103 = arg0.method3085();
		}
		if (local22 >= 3 && local22 < 6) {
			arg0.method3110();
		}
		if (local22 >= 4) {
			@Pc(387) int local387 = arg0.method3110();
			if (Static160.anInt3283 < 96) {
				local387 = 0;
			}
			Static117.method1978(local387);
		}
		if (local22 >= 5) {
			Static102.anInt2018 = arg0.method3084();
		}
		if (local22 >= 6) {
			Static228.anInt4580 = arg0.method3110();
		}
		if (local22 >= 7) {
			Static209.aBoolean250 = arg0.method3110() == 1;
		}
		if (local22 >= 8) {
			Static115.aBoolean148 = arg0.method3110() == 1;
		}
		if (local22 >= 9) {
			Static230.anInt4613 = arg0.method3110();
		}
		if (local22 >= 10) {
			Static74.aBoolean87 = arg0.method3110() != 0;
		}
		if (local22 >= 11) {
			Static106.aBoolean121 = arg0.method3110() != 0;
		}
	}
}
