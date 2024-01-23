import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static303 {

	@OriginalMember(owner = "client!wa", name = "Ub", descriptor = "[I")
	public static int[] anIntArray650;

	@OriginalMember(owner = "client!wa", name = "cc", descriptor = "Z")
	public static boolean aBoolean394 = true;

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(BJ)V")
	public static void method4677(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static276.method4304(arg0 - 1L);
			Static276.method4304(1L);
		} else {
			Static276.method4304(arg0);
		}
	}

	@OriginalMember(owner = "client!wa", name = "c", descriptor = "(IB)V")
	public static void method4678(@OriginalArg(0) int arg0) {
		Static145.anInt2853 = 3;
		Static81.anInt1874 = arg0;
		Static216.anInt4216 = 100;
		Static204.anInt3920 = -1;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lclient!fd;I)V")
	public static void method4680(@OriginalArg(0) Class4_Sub10 arg0) {
		if (arg0.aByteArray71.length - arg0.anInt5713 < 1) {
			return;
		}
		@Pc(20) int local20 = arg0.method4666();
		if (local20 < 0 || local20 > 11) {
			return;
		}
		@Pc(39) byte local39;
		if (local20 == 11) {
			local39 = 33;
		} else if (local20 == 10) {
			local39 = 32;
		} else if (local20 == 9) {
			local39 = 31;
		} else if (local20 == 8) {
			local39 = 30;
		} else if (local20 == 7) {
			local39 = 29;
		} else if (local20 == 6) {
			local39 = 28;
		} else if (local20 == 5) {
			local39 = 28;
		} else if (local20 == 4) {
			local39 = 24;
		} else if (local20 == 3) {
			local39 = 23;
		} else if (local20 == 2) {
			local39 = 22;
		} else if (local20 == 1) {
			local39 = 23;
		} else {
			local39 = 19;
		}
		if (local39 > arg0.aByteArray71.length - arg0.anInt5713) {
			return;
		}
		Static10.anInt185 = arg0.method4666();
		if (Static10.anInt185 < 1) {
			Static10.anInt185 = 1;
		} else if (Static10.anInt185 > 4) {
			Static10.anInt185 = 4;
		}
		Static280.method665(arg0.method4666() == 1);
		Static141.aBoolean399 = arg0.method4666() == 1;
		Static117.aBoolean159 = arg0.method4666() == 1;
		Static233.aBoolean227 = arg0.method4666() == 1;
		Static82.aBoolean117 = arg0.method4666() == 1;
		Static312.aBoolean422 = arg0.method4666() == 1;
		Static27.aBoolean27 = arg0.method4666() == 1;
		Static66.aBoolean75 = arg0.method4666() == 1;
		Static114.anInt2298 = arg0.method4666();
		if (Static114.anInt2298 > 2) {
			Static114.anInt2298 = 2;
		}
		if (local20 < 2) {
			Static56.aBoolean66 = arg0.method4666() == 1;
			arg0.method4666();
		} else {
			Static56.aBoolean66 = arg0.method4666() == 1;
		}
		aBoolean394 = arg0.method4666() == 1;
		Static279.aBoolean363 = arg0.method4666() == 1;
		Static21.anInt1051 = arg0.method4666();
		if (Static21.anInt1051 > 2) {
			Static21.anInt1051 = 2;
		}
		Static55.anInt1125 = Static21.anInt1051;
		Static273.aBoolean122 = arg0.method4666() == 1;
		Static171.anInt3315 = arg0.method4666();
		if (Static171.anInt3315 > 127) {
			Static171.anInt3315 = 127;
		}
		Static24.anInt344 = arg0.method4666();
		Static208.anInt4120 = arg0.method4666();
		if (Static208.anInt4120 > 127) {
			Static208.anInt4120 = 127;
		}
		if (local20 >= 1) {
			Static179.anInt3403 = arg0.method4653();
			Static137.anInt2627 = arg0.method4653();
		}
		if (local20 >= 3 && local20 < 6) {
			arg0.method4666();
		}
		if (local20 >= 4) {
			@Pc(369) int local369 = arg0.method4666();
			if (Static164.anInt3256 < 96) {
				local369 = 0;
			}
			Static184.method2970(local369);
		}
		if (local20 >= 5) {
			Static203.anInt3909 = arg0.method4632();
		}
		if (local20 >= 6) {
			Static192.anInt3637 = arg0.method4666();
		}
		if (local20 >= 7) {
			Static205.aBoolean278 = arg0.method4666() == 1;
		}
		if (local20 >= 8) {
			Static212.aBoolean293 = arg0.method4666() == 1;
		}
		if (local20 >= 9) {
			Static222.anInt4292 = arg0.method4666();
		}
		if (local20 >= 10) {
			Static300.aBoolean391 = arg0.method4666() != 0;
		}
		if (local20 >= 11) {
			Static61.aBoolean69 = arg0.method4666() != 0;
		}
	}

	@OriginalMember(owner = "client!wa", name = "p", descriptor = "(B)V")
	public static void method4682() {
		if (Static130.anIntArray223 != null && Static129.anIntArray222 != null) {
			return;
		}
		Static129.anIntArray222 = new int[256];
		Static130.anIntArray223 = new int[256];
		for (@Pc(14) int local14 = 0; local14 < 256; local14++) {
			@Pc(24) double local24 = (double) local14 / 255.0D * 6.283185307179586D;
			Static130.anIntArray223[local14] = (int) (Math.sin(local24) * 4096.0D);
			Static129.anIntArray222[local14] = (int) (Math.cos(local24) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!wa", name = "s", descriptor = "(I)V")
	public static void method4686() {
		Static81.aClass26_16.method511();
	}
}
