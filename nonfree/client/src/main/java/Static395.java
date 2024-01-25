import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static395 {

	@OriginalMember(owner = "client!ng", name = "nb", descriptor = "I")
	public static int anInt6853;

	@OriginalMember(owner = "client!ng", name = "Jb", descriptor = "I")
	public static int anInt6854;

	@OriginalMember(owner = "client!ng", name = "F", descriptor = "[Lclient!ua;")
	public static final Class353[] aClass353Array1 = new Class353[2048];

	@OriginalMember(owner = "client!ng", name = "jb", descriptor = "Lclient!sb;")
	public static final Class322 aClass322_122 = new Class322(32, 2);

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(B)V")
	public static void method6065() {
		Static593.method8224(Static687.aClass6_Sub44_33.aClass7_Sub7_1.method1193());
		@Pc(19) int local19 = (Static50.anInt606 >> 3) + (Static475.anInt8090 >> 12);
		Static504.anInt8428 = Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.aByte135 = 0;
		@Pc(39) int local39 = (Static365.anInt6155 >> 12) + (Static404.anInt7039 >> 3);
		Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.method2707(8, 8);
		Static364.anIntArray363 = new int[18];
		Static346.anIntArray343 = new int[18];
		Static173.aByteArrayArray61 = new byte[18][];
		Static432.aByteArrayArray134 = new byte[18][];
		Static222.anIntArrayArray21 = new int[18][4];
		Static89.aByteArrayArray29 = new byte[18][];
		Static224.anIntArray221 = new int[18];
		Static76.aByteArrayArray27 = new byte[18][];
		Static293.anIntArray289 = new int[18];
		Static617.anIntArray642 = new int[18];
		Static504.anIntArray530 = new int[18];
		Static384.aByteArrayArray119 = new byte[18][];
		@Pc(85) int local85 = 0;
		@Pc(103) int local103;
		for (@Pc(93) int local93 = (local19 - (Static29.anInt380 >> 4)) / 8; local93 <= ((Static29.anInt380 >> 4) + local19) / 8; local93++) {
			for (local103 = (local39 - (Static327.anInt5650 >> 4)) / 8; local103 <= (local39 + (Static327.anInt5650 >> 4)) / 8; local103++) {
				@Pc(111) int local111 = local103 + (local93 << 8);
				Static617.anIntArray642[local85] = local111;
				Static224.anIntArray221[local85] = Static194.aClass223_39.method5257("m" + local93 + "_" + local103);
				Static346.anIntArray343[local85] = Static194.aClass223_39.method5257("l" + local93 + "_" + local103);
				Static293.anIntArray289[local85] = Static194.aClass223_39.method5257("n" + local93 + "_" + local103);
				Static504.anIntArray530[local85] = Static194.aClass223_39.method5257("um" + local93 + "_" + local103);
				Static364.anIntArray363[local85] = Static194.aClass223_39.method5257("ul" + local93 + "_" + local103);
				if (Static293.anIntArray289[local85] == -1) {
					Static224.anIntArray221[local85] = -1;
					Static346.anIntArray343[local85] = -1;
					Static504.anIntArray530[local85] = -1;
					Static364.anIntArray363[local85] = -1;
				}
				local85++;
			}
		}
		for (local103 = local85; local103 < Static293.anIntArray289.length; local103++) {
			Static293.anIntArray289[local103] = -1;
			Static224.anIntArray221[local103] = -1;
			Static346.anIntArray343[local103] = -1;
			Static504.anIntArray530[local103] = -1;
			Static364.anIntArray363[local103] = -1;
		}
		@Pc(301) byte local301;
		if (Static37.anInt498 == 3) {
			local301 = 4;
		} else if (Static37.anInt498 == 9) {
			local301 = 10;
		} else if (Static37.anInt498 == 7) {
			local301 = 8;
		} else {
			throw new RuntimeException("");
		}
		Static472.method7116(local301, false, local39, local19);
	}

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "(II)I")
	public static int method6084(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static273.aByteArrayArray84 == null ? 0 : Static273.aByteArrayArray84[arg0][arg1] & 0xFF;
	}
}
