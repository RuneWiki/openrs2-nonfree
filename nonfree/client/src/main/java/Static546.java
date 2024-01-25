import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static546 {

	@OriginalMember(owner = "client!tg", name = "z", descriptor = "Lclient!oq;")
	public static Class263 aClass263_1;

	@OriginalMember(owner = "client!tg", name = "A", descriptor = "Lclient!cv;")
	public static Class63 aClass63_5;

	@OriginalMember(owner = "client!tg", name = "B", descriptor = "Lclient!nd;")
	public static Class238 aClass238_245;

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "(I)V")
	public static void method7559() {
		Static442.aClass69_45.method1905();
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "()V")
	public static void method7560() {
		if (Static417.anInt6978 == 0 || Static126.aClass37_2 == null) {
			return;
		}
		Static380.aClass13_86.K(Static106.anIntArray175);
		for (@Pc(12) int local12 = 0; local12 < Static192.anIntArray247.length; local12++) {
			Static380.aClass13_86.method8092(Static106.anIntArray175[3] - Static106.anIntArray175[1], Static192.anIntArray247[local12] + Static194.anIntArray248[local12], -256, Static106.anIntArray175[1]);
		}
		for (@Pc(41) int local41 = 0; local41 < Static449.anInt7349; local41++) {
			@Pc(46) Class62 local46 = Static342.aClass62Array2[local41];
			Static380.aClass13_86.H(local46.anIntArray155[0], local46.anIntArray156[0], local46.anIntArray157[0], Static275.anIntArray305);
			Static380.aClass13_86.H(local46.anIntArray155[1], local46.anIntArray156[1], local46.anIntArray157[1], Static183.anIntArray236);
			Static380.aClass13_86.H(local46.anIntArray155[2], local46.anIntArray156[2], local46.anIntArray157[2], Static643.anIntArray727);
			Static380.aClass13_86.H(local46.anIntArray155[3], local46.anIntArray156[3], local46.anIntArray157[3], Static373.anIntArray418);
			if (Static275.anIntArray305[2] != -1 && Static183.anIntArray236[2] != -1 && Static643.anIntArray727[2] != -1 && Static373.anIntArray418[2] != -1) {
				@Pc(128) int local128 = -65536;
				if (local46.aByte40 == 4) {
					local128 = -16776961;
				}
				Static380.aClass13_86.method8130(Static275.anIntArray305[1], Static183.anIntArray236[0], Static183.anIntArray236[1], local128, Static275.anIntArray305[0]);
				Static380.aClass13_86.method8130(Static183.anIntArray236[1], Static643.anIntArray727[0], Static643.anIntArray727[1], local128, Static183.anIntArray236[0]);
				Static380.aClass13_86.method8130(Static643.anIntArray727[1], Static373.anIntArray418[0], Static373.anIntArray418[1], local128, Static643.anIntArray727[0]);
				Static380.aClass13_86.method8130(Static373.anIntArray418[1], Static275.anIntArray305[0], Static275.anIntArray305[1], local128, Static373.anIntArray418[0]);
				Static380.aClass13_86.method8130(Static275.anIntArray305[1], Static643.anIntArray727[0], Static643.anIntArray727[1], local128, Static275.anIntArray305[0]);
			}
		}
		Static126.aClass37_2.method6067(-256, "Dynamic: " + Static184.anInt3672 + "/" + 5000, -16777216, 10, 75);
		Static126.aClass37_2.method6067(-256, "Total Opaque Onscreen: " + Static627.anInt10196 + "/" + 10000, -16777216, 10, 90);
		Static126.aClass37_2.method6067(-256, "Total Trans Onscreen: " + Static388.anInt6686 + "/" + 5000, -16777216, 10, 105);
		Static126.aClass37_2.method6067(-256, "Occluders: " + (Static608.anInt10054 + Static116.anInt2476) + " Active: " + Static449.anInt7349, -16777216, 10, 120);
		Static126.aClass37_2.method6067(-256, "Occluded: Ground:" + Static247.anInt4758 + " Walls: " + Static25.anInt8653 + " CPs: " + Static89.anInt6960 + " Pixels: " + Static111.anInt2390, -16777216, 10, 135);
		Static126.aClass37_2.method6067(-256, "Occlude Calc Took: " + Static557.aLong240 / 1000L + "us", -16777216, 10, 150);
		if (Static417.anInt6978 != 2 || Static649.anIntArray744 == null) {
			return;
		}
		for (@Pc(355) int local355 = 0; local355 < Static649.anIntArray744.length; local355++) {
			@Pc(361) float local361 = (float) Static649.anIntArray744[local355];
			local361 /= 4194304.0F;
			if (local361 > 1.0F) {
				local361 = 1.0F;
			}
			local361 *= 255.0F;
			local361 = 255.0F - local361;
			@Pc(382) int local382 = (int) local361;
			Static649.anIntArray744[local355] = local382 | local382 << 8 | local382 << 16 | 0xFF000000;
		}
		@Pc(410) Class31 local410 = Static380.aClass13_86.method8088(Static317.anInt5596, Static179.anInt3584, Static649.anIntArray744, Static317.anInt5596);
		local410.method8796(10, 170, 1, 0, 0);
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(BIILclient!ha;Lclient!fh;)V")
	public static void method7561(@OriginalArg(3) Class13 arg0, @OriginalArg(4) Class114 arg1) {
		Static435.aClass114_38.method2768();
		if (Static399.aBoolean485) {
			return;
		}
		for (@Pc(14) Class2_Sub13 local14 = (Class2_Sub13) arg1.method2772(); local14 != null; local14 = (Class2_Sub13) arg1.method2762()) {
			@Pc(21) Class353 local21 = Static371.aClass336_4.method7855(local14.anInt2179);
			if (Static500.method6946(local21)) {
				@Pc(33) boolean local33 = Static122.method2200(local14, arg0, local21);
				if (local33) {
					Static275.method4477(local21, local14, arg0);
				}
			}
		}
	}
}
