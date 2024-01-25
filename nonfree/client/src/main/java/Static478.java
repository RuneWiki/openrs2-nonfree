import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static478 {

	@OriginalMember(owner = "client!sn", name = "o", descriptor = "I")
	public static int anInt8409;

	@OriginalMember(owner = "client!sn", name = "s", descriptor = "I")
	public static int anInt8411;

	@OriginalMember(owner = "client!sn", name = "p", descriptor = "S")
	public static short aShort104 = 320;

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(IZ)V")
	public static void method6622(@OriginalArg(1) boolean arg0) {
		while (true) {
			if (Static429.aClass6_Sub12_Sub2_2.method6069(Static207.anInt3929) >= 15) {
				@Pc(20) int local20 = Static429.aClass6_Sub12_Sub2_2.method6061(15);
				if (local20 != 32767) {
					@Pc(27) boolean local27 = false;
					@Pc(34) Class6_Sub49 local34 = (Class6_Sub49) Static251.aClass234_29.method5464((long) local20);
					@Pc(40) Class15_Sub2_Sub4_Sub1 local40;
					if (local34 == null) {
						local40 = new Class15_Sub2_Sub4_Sub1();
						local40.anInt8924 = local20;
						local34 = new Class6_Sub49(local40);
						Static251.aClass234_29.method5466((long) local20, local34);
						local27 = true;
						Static324.aClass6_Sub49Array1[Static192.anInt3744++] = local34;
					}
					local40 = local34.aClass15_Sub2_Sub4_Sub1_2;
					Static46.anIntArray36[Static429.anInt7650++] = local20;
					local40.anInt8966 = Static363.anInt6671;
					if (local40.aClass88_1 != null && local40.aClass88_1.method1942()) {
						Static32.method512(local40);
					}
					@Pc(96) int local96;
					if (arg0) {
						local96 = Static429.aClass6_Sub12_Sub2_2.method6061(8);
						if (local96 > 127) {
							local96 -= 256;
						}
					} else {
						local96 = Static429.aClass6_Sub12_Sub2_2.method6061(5);
						if (local96 > 15) {
							local96 -= 32;
						}
					}
					@Pc(126) int local126 = (Static429.aClass6_Sub12_Sub2_2.method6061(3) + 4 & 0xACE00007) << 11;
					@Pc(135) int local135;
					if (arg0) {
						local135 = Static429.aClass6_Sub12_Sub2_2.method6061(8);
						if (local135 > 127) {
							local135 -= 256;
						}
					} else {
						local135 = Static429.aClass6_Sub12_Sub2_2.method6061(5);
						if (local135 > 15) {
							local135 -= 32;
						}
					}
					@Pc(161) int local161 = Static429.aClass6_Sub12_Sub2_2.method6061(2);
					@Pc(166) int local166 = Static429.aClass6_Sub12_Sub2_2.method6061(1);
					if (local166 == 1) {
						Static380.anIntArray494[Static314.anInt6059++] = local20;
					}
					@Pc(184) int local184 = Static429.aClass6_Sub12_Sub2_2.method6061(1);
					local40.method4297(Static119.aClass226_4.method5369(Static429.aClass6_Sub12_Sub2_2.method6061(14)));
					local40.method7134(local40.aClass88_1.anInt2171);
					local40.anInt8930 = local40.aClass88_1.anInt2144 << 3;
					if (local27) {
						local40.method7143(local126, true);
					}
					local40.method4294(local40.method7135(), local161, Static461.aClass15_Sub2_Sub4_Sub2_2.anIntArray638[0] + local96, local184 == 1, Static461.aClass15_Sub2_Sub4_Sub2_2.anIntArray637[0] + local135);
					if (local40.aClass88_1.method1942()) {
						Static90.method4176(null, 0, null, local40.anIntArray638[0], local40.aByte98, local40, local40.anIntArray637[0]);
					}
					continue;
				}
			}
			Static429.aClass6_Sub12_Sub2_2.method6065();
			return;
		}
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;)V")
	public static void method6623(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		Static526.anInt9112 = arg0;
		Static18.anInt5702 = 2;
		Static278.method4182(arg1, false, arg2);
	}
}
