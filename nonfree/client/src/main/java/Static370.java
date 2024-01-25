import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static370 {

	@OriginalMember(owner = "client!vm", name = "b", descriptor = "Lclient!ec;")
	public static final Class62 aClass62_169 = new Class62("Attack", "Angreifen", "Attaquer", "Atacar");

	@OriginalMember(owner = "client!vm", name = "f", descriptor = "I")
	public static int anInt4786 = 0;

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(B)V")
	public static void method4288() {
		Static198.aBoolean294 = true;
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(BLclient!vt;)V")
	public static void method4290(@OriginalArg(1) Class2_Sub24 arg0) {
		@Pc(8) byte[] local8 = new byte[24];
		if (Static151.aClass70_6 != null) {
			@Pc(20) int local20;
			try {
				Static151.aClass70_6.method1552(0L);
				Static151.aClass70_6.method1555(local8);
				for (local20 = 0; local20 < 24 && local8[local20] == 0; local20++) {
				}
				if (local20 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(43) Exception local43) {
				for (local20 = 0; local20 < 24; local20++) {
					local8[local20] = -1;
				}
			}
		}
		arg0.method5771(local8, 24);
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(Lclient!oj;)V")
	public static void method4291(@OriginalArg(0) Class48 arg0) {
		for (@Pc(1) int local1 = Static4.anInt135; local1 < Static73.anInt1624; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Static176.anInt3742; local4++) {
				for (@Pc(7) int local7 = 0; local7 < Static285.anInt5263; local7++) {
					@Pc(16) Class188 local16 = Static45.aClass188ArrayArrayArray5[local1][local4][local7];
					if (local16 != null) {
						@Pc(21) Class1_Sub5 local21 = local16.aClass1_Sub5_2;
						@Pc(24) Class1_Sub5 local24 = local16.aClass1_Sub5_1;
						if (local21 != null && local21.method6015()) {
							Static63.method1176(arg0, local21, local1, local4, local7, 1, 1);
							if (local24 != null && local24.method6015()) {
								Static63.method1176(arg0, local24, local1, local4, local7, 1, 1);
								local24.method6019(0, 0, false, local21, 0, arg0);
								local24.method6020();
							}
							local21.method6020();
						}
						for (@Pc(70) Class168 local70 = local16.aClass168_2; local70 != null; local70 = local70.aClass168_1) {
							@Pc(74) Class1_Sub2 local74 = local70.aClass1_Sub2_1;
							if (local74 != null && local74.method6015()) {
								Static63.method1176(arg0, local74, local1, local4, local7, local74.aShort97 + 1 - local74.aShort95, local74.aShort94 - local74.aShort96 + 1);
								local74.method6020();
							}
						}
						@Pc(111) Class1_Sub1 local111 = local16.aClass1_Sub1_2;
						if (local111 != null && local111.method6015()) {
							Static93.method1561(arg0, local111, local1, local4, local7);
							local111.method6020();
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vm", name = "d", descriptor = "(I)V")
	public static void method4294() {
		for (@Pc(3) int local3 = 0; local3 < 5; local3++) {
			Static159.aBooleanArray15[local3] = false;
		}
		Static115.anInt2550 = 0;
		Static120.anInt2645 = 0;
		Static198.anInt4108 = 1;
		Static296.anInt5530 = -1;
		Static123.anInt5935 = -1;
	}

	@OriginalMember(owner = "client!vm", name = "e", descriptor = "(I)V")
	public static void method4295() {
		Static113.aClass41_69.method829();
		Static46.aClass41_63.method829();
		Static384.aClass41_74.method829();
		Static246.aClass41_37.method829();
		Static113.aClass41_70.method829();
	}
}
