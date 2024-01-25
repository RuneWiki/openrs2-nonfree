import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static159 {

	@OriginalMember(owner = "client!k", name = "q", descriptor = "I")
	public static int anInt3266 = 0;

	@OriginalMember(owner = "client!k", name = "u", descriptor = "I")
	public static int anInt3269 = 0;

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(ILclient!at;)V")
	public static void method2991(@OriginalArg(1) Class1_Sub7 arg0) {
		if (arg0.aByteArray41.length - arg0.anInt2219 < 1) {
			return;
		}
		@Pc(19) int local19 = arg0.method2132();
		if (local19 < 0 || local19 > 15) {
			return;
		}
		@Pc(43) byte local43;
		if (local19 == 15) {
			local43 = 37;
		} else if (local19 == 14) {
			local43 = 36;
		} else if (local19 == 13) {
			local43 = 35;
		} else if (local19 == 12) {
			local43 = 34;
		} else if (local19 == 11) {
			local43 = 33;
		} else if (local19 == 10) {
			local43 = 32;
		} else if (local19 == 9) {
			local43 = 31;
		} else if (local19 == 8) {
			local43 = 30;
		} else if (local19 == 7) {
			local43 = 29;
		} else if (local19 == 6) {
			local43 = 28;
		} else if (local19 == 5) {
			local43 = 28;
		} else if (local19 == 4) {
			local43 = 24;
		} else if (local19 == 3) {
			local43 = 23;
		} else if (local19 == 2) {
			local43 = 22;
		} else if (local19 == 1) {
			local43 = 23;
		} else {
			local43 = 19;
		}
		if (local43 > arg0.aByteArray41.length - arg0.anInt2219) {
			return;
		}
		Static140.anInt3021 = arg0.method2132();
		if (Static140.anInt3021 < 1) {
			Static140.anInt3021 = 1;
		} else if (Static140.anInt3021 > 4) {
			Static140.anInt3021 = 4;
		}
		Static65.method5286(arg0.method2132() == 1);
		Static43.aBoolean407 = arg0.method2132() == 1;
		Static30.aBoolean49 = arg0.method2132() == 1;
		Static80.aBoolean128 = arg0.method2132() == 1;
		Static257.anInt1060 = arg0.method2132() == 1 ? 1 : 0;
		Static318.aBoolean455 = arg0.method2132() == 1;
		Static239.aBoolean363 = arg0.method2132() == 1;
		Static61.aBoolean108 = arg0.method2132() == 1;
		Static218.anInt4352 = arg0.method2132();
		if (Static218.anInt4352 > 2) {
			Static218.anInt4352 = 2;
		}
		if (local19 >= 2) {
			Static69.aBoolean112 = arg0.method2132() == 1;
		} else {
			Static69.aBoolean112 = arg0.method2132() == 1;
			arg0.method2132();
		}
		Static24.aBoolean34 = arg0.method2132() == 1;
		Static291.aBoolean430 = arg0.method2132() == 1;
		Static209.anInt4164 = arg0.method2132();
		if (Static209.anInt4164 > 2) {
			Static209.anInt4164 = 2;
		}
		Static289.anInt5617 = Static209.anInt4164;
		Static299.aBoolean302 = arg0.method2132() == 1;
		Static124.anInt2721 = arg0.method2132();
		if (Static124.anInt2721 > 127) {
			Static124.anInt2721 = 127;
		}
		Static219.anInt4418 = arg0.method2132();
		Static105.anInt2415 = arg0.method2132();
		if (Static105.anInt2415 > 127) {
			Static105.anInt2415 = 127;
		}
		if (local19 >= 1) {
			Static42.anInt1013 = arg0.method2161();
			Static170.anInt3543 = arg0.method2161();
		}
		if (local19 >= 3 && local19 < 6) {
			arg0.method2132();
		}
		@Pc(409) int local409;
		if (local19 >= 4) {
			local409 = arg0.method2132();
			if (local409 < 0 || local409 > 2) {
				local409 = 0;
			}
			if (Static268.anInt5269 < 96) {
				local409 = 0;
			}
			Static5.method272(local409);
		}
		if (local19 >= 5) {
			Static277.anInt5395 = arg0.method2140();
		}
		local409 = 0;
		if (local19 >= 6) {
			Static164.anInt3449 = local409 = arg0.method2132();
		}
		if (Static164.anInt3449 != 1 && Static164.anInt3449 != 2) {
			Static164.anInt3449 = 2;
		}
		if (local19 >= 7) {
			Static367.aBoolean512 = arg0.method2132() == 1;
		}
		if (local19 >= 8) {
			Static41.aBoolean62 = arg0.method2132() == 1;
		}
		if (local19 >= 9) {
			Static72.anInt1645 = arg0.method2132();
		}
		if (Static72.anInt1645 < 0 || Static72.anInt1645 > Static20.method556(Static268.anInt5269)) {
			Static72.anInt1645 = 0;
		}
		if (local19 >= 10) {
			Static271.aBoolean33 = arg0.method2132() != 0;
		}
		if (local19 >= 11) {
			Static209.aBoolean308 = arg0.method2132() != 0;
		}
		if (local19 >= 12) {
			Static257.anInt1060 = arg0.method2132();
		}
		if (Static257.anInt1060 < 0 || Static257.anInt1060 > 2) {
			Static257.anInt1060 = 1;
		}
		if (local19 >= 13) {
			Static298.aBoolean483 = arg0.method2132() == 1;
		}
		if (local19 >= 14) {
			Static359.anInt6875 = arg0.method2132();
		} else if (local409 == 0) {
			Static359.anInt6875 = 2;
		} else {
			Static359.anInt6875 = 1;
		}
		if (Static359.anInt6875 < 0 || Static359.anInt6875 > 3) {
			Static359.anInt6875 = 2;
		}
		if (local19 >= 15) {
			Static300.anInt5779 = arg0.method2132();
			if (Static300.anInt5779 < 0 || Static300.anInt5779 > 4) {
				Static300.anInt5779 = Static196.anInt3975 == 1 ? 2 : 4;
			}
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(BI)[B")
	public static byte[] method2992(@OriginalArg(1) int arg0) {
		@Pc(20) Class1_Sub4_Sub3 local20 = (Class1_Sub4_Sub3) Static18.aClass44_3.method1612((long) arg0);
		if (local20 == null) {
			@Pc(25) byte[] local25 = new byte[512];
			@Pc(31) Random local31 = new Random((long) arg0);
			for (@Pc(33) int local33 = 0; local33 < 255; local33++) {
				local25[local33] = (byte) local33;
			}
			for (@Pc(46) int local46 = 0; local46 < 255; local46++) {
				@Pc(53) int local53 = 255 - local46;
				@Pc(58) int local58 = Static297.method5193(local31, local53);
				@Pc(62) byte local62 = local25[local58];
				local25[local58] = local25[local53];
				local25[local53] = local25[511 - local46] = local62;
			}
			local20 = new Class1_Sub4_Sub3(local25);
			Static18.aClass44_3.method1616((long) arg0, local20);
		}
		return local20.aByteArray14;
	}
}
