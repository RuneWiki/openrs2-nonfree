import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static440 {

	@OriginalMember(owner = "client!pv", name = "i", descriptor = "Lclient!gh;")
	public static Class118 aClass118_3;

	@OriginalMember(owner = "client!pv", name = "d", descriptor = "Lclient!pia;")
	public static final Class257 aClass257_84 = new Class257(45, -1);

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(I)[I")
	public static int[] method6799() {
		return new int[] { Static241.anInt5385, Static19.anInt3643, Static25.anInt1036 };
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(III)I")
	public static int method6801(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		arg0 = (arg1 & 0x7F) * arg0 >> 7;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return (arg1 & 0xFF80) + arg0;
	}

	@OriginalMember(owner = "client!pv", name = "b", descriptor = "(I)V")
	public static void method6802() {
		for (@Pc(8) int local8 = 0; local8 < Static91.anInt2547; local8++) {
			@Pc(14) int local14 = Static151.anIntArray192[local8];
			@Pc(22) Class15_Sub1_Sub2_Sub2_Sub2 local22 = ((Class8_Sub50) Static278.aClass253_20.method6594((long) local14)).aClass15_Sub1_Sub2_Sub2_Sub2_2;
			@Pc(28) int local28 = Static442.aClass8_Sub8_Sub2_2.method8525();
			if ((local28 & 0x20) != 0) {
				local28 += Static442.aClass8_Sub8_Sub2_2.method8525() << 8;
			}
			@Pc(51) int local51;
			@Pc(55) int local55;
			@Pc(64) int local64;
			@Pc(68) int local68;
			@Pc(74) int local74;
			if ((local28 & 0x800) != 0) {
				local51 = Static442.aClass8_Sub8_Sub2_2.method8541();
				local55 = Static442.aClass8_Sub8_Sub2_2.method8556();
				if (local51 == 65535) {
					local51 = -1;
				}
				local64 = Static442.aClass8_Sub8_Sub2_2.method8525();
				local68 = local64 & 0x7;
				local74 = local64 >> 3 & 0xF;
				if (local74 == 15) {
					local74 = -1;
				}
				local22.method6693(local68, true, local51, local74, local55);
			}
			if ((local28 & 0x8) != 0) {
				local51 = Static442.aClass8_Sub8_Sub2_2.method8545();
				if (local51 == 65535) {
					local51 = -1;
				}
				local55 = Static442.aClass8_Sub8_Sub2_2.method8540();
				local64 = Static442.aClass8_Sub8_Sub2_2.method8525();
				local68 = local64 & 0x7;
				local74 = local64 >> 3 & 0xF;
				if (local74 == 15) {
					local74 = -1;
				}
				local22.method6693(local68, false, local51, local74, local55);
			}
			if ((local28 & 0x1) != 0) {
				local22.anInt8108 = Static442.aClass8_Sub8_Sub2_2.method8545();
				if (local22.anInt8108 == 65535) {
					local22.anInt8108 = -1;
				}
			}
			if ((local28 & 0x2) != 0) {
				if (local22.aClass300_1.method7314()) {
					Static218.method4118(local22);
				}
				local22.method6702(Static297.aClass338_1.method7851(Static442.aClass8_Sub8_Sub2_2.method8578()));
				local22.method6691(local22.aClass300_1.anInt8912);
				local22.anInt8097 = local22.aClass300_1.anInt8900 << 3;
				if (local22.aClass300_1.method7314()) {
					Static586.method8144(local22, local22.anIntArray436[0], 0, null, local22.aByte124, null, local22.anIntArray435[0]);
				}
			}
			@Pc(244) int local244;
			@Pc(230) int[] local230;
			@Pc(233) int[] local233;
			if ((local28 & 0x200) != 0) {
				local51 = Static442.aClass8_Sub8_Sub2_2.method8528();
				local230 = new int[local51];
				local233 = new int[local51];
				@Pc(236) int[] local236 = new int[local51];
				for (local74 = 0; local74 < local51; local74++) {
					local244 = Static442.aClass8_Sub8_Sub2_2.method8576();
					if (local244 == 65535) {
						local244 = -1;
					}
					local230[local74] = local244;
					local233[local74] = Static442.aClass8_Sub8_Sub2_2.method8527();
					local236[local74] = Static442.aClass8_Sub8_Sub2_2.method8578();
				}
				Static519.method7414(local22, local230, local236, local233);
			}
			if ((local28 & 0x400) != 0) {
				local22.anInt8128 = Static442.aClass8_Sub8_Sub2_2.method8550();
				local22.anInt8132 = Static442.aClass8_Sub8_Sub2_2.method8550();
				local22.anInt8066 = Static442.aClass8_Sub8_Sub2_2.method8574();
				local22.anInt8048 = Static442.aClass8_Sub8_Sub2_2.method8574();
				local22.anInt8101 = Static442.aClass8_Sub8_Sub2_2.method8576() + Static435.anInt8192;
				local22.anInt8124 = Static442.aClass8_Sub8_Sub2_2.method8578() + Static435.anInt8192;
				local22.anInt8084 = Static442.aClass8_Sub8_Sub2_2.method8528();
				local22.anInt8128 += local22.anIntArray435[0];
				local22.anInt8066 += local22.anIntArray435[0];
				local22.anInt8048 += local22.anIntArray436[0];
				local22.anInt8132 += local22.anIntArray436[0];
				local22.anInt8140 = 0;
				local22.anInt8137 = 1;
			}
			if ((local28 & 0x4) != 0) {
				@Pc(378) int[] local378 = new int[4];
				for (local55 = 0; local55 < 4; local55++) {
					local378[local55] = Static442.aClass8_Sub8_Sub2_2.method8578();
					if (local378[local55] == 65535) {
						local378[local55] = -1;
					}
				}
				local64 = Static442.aClass8_Sub8_Sub2_2.method8552();
				Static233.method4304(local378, local22, local64);
			}
			if ((local28 & 0x10) != 0) {
				local51 = Static442.aClass8_Sub8_Sub2_2.method8565();
				local55 = Static442.aClass8_Sub8_Sub2_2.method8525();
				local22.method6684(Static435.anInt8192, local51, local55);
				local22.anInt8136 = Static435.anInt8192 + 300;
				local22.anInt8052 = Static442.aClass8_Sub8_Sub2_2.method8525();
			}
			if ((local28 & 0x100) != 0) {
				local22.aByte85 = Static442.aClass8_Sub8_Sub2_2.method8521();
				local22.aByte83 = Static442.aClass8_Sub8_Sub2_2.method8574();
				local22.aByte84 = Static442.aClass8_Sub8_Sub2_2.method8550();
				local22.aByte86 = (byte) Static442.aClass8_Sub8_Sub2_2.method8525();
				local22.anInt8087 = Static435.anInt8192 + Static442.aClass8_Sub8_Sub2_2.method8545();
				local22.anInt8062 = Static435.anInt8192 + Static442.aClass8_Sub8_Sub2_2.method8578();
			}
			if ((local28 & 0x4000) != 0) {
				local51 = Static442.aClass8_Sub8_Sub2_2.method8576();
				local22.anInt8130 = Static442.aClass8_Sub8_Sub2_2.method8527();
				local22.anInt8090 = Static442.aClass8_Sub8_Sub2_2.method8552();
				local22.anInt8079 = local51 & 0x7FFF;
				local22.aBoolean584 = (local51 & 0x8000) != 0;
				local22.anInt8127 = local22.anInt8079 + Static435.anInt8192 + local22.anInt8130;
			}
			if ((local28 & 0x1000) != 0) {
				local51 = Static442.aClass8_Sub8_Sub2_2.method8565();
				local55 = Static442.aClass8_Sub8_Sub2_2.method8552();
				local22.method6684(Static435.anInt8192, local51, local55);
			}
			if ((local28 & 0x40) != 0) {
				local22.aString85 = Static442.aClass8_Sub8_Sub2_2.method8570();
				local22.anInt8053 = 100;
			}
			if ((local28 & 0x80) != 0) {
				local22.anInt8155 = Static442.aClass8_Sub8_Sub2_2.method8541();
				local22.anInt8153 = Static442.aClass8_Sub8_Sub2_2.method8545();
			}
			if ((local28 & 0x2000) != 0) {
				local51 = Static442.aClass8_Sub8_Sub2_2.method8525();
				local230 = new int[local51];
				local233 = new int[local51];
				for (local68 = 0; local68 < local51; local68++) {
					local74 = Static442.aClass8_Sub8_Sub2_2.method8541();
					if ((local74 & 0xC000) == 49152) {
						local244 = Static442.aClass8_Sub8_Sub2_2.method8541();
						local230[local68] = local244 | local74 << 16;
					} else {
						local230[local68] = local74;
					}
					local233[local68] = Static442.aClass8_Sub8_Sub2_2.method8545();
				}
				local22.method6699(local233, local230);
			}
		}
	}

	@OriginalMember(owner = "client!pv", name = "c", descriptor = "(I)V")
	public static void method6804() {
		Static209.method4022();
		Static71.aClass71_22 = null;
		Static635.anInt10565 = 0;
		Static126.aClass71_32 = null;
		Static415.aClass71_103 = null;
		Static128.anInt3427 = 0;
		Static602.anInt10248 = 0;
		Static442.aClass8_Sub8_Sub2_2.anInt10588 = 0;
		Static239.aClass71_61 = null;
		Static607.method6375();
		Static133.method2933();
		for (@Pc(30) int local30 = 0; local30 < 2048; local30++) {
			Static29.aClass15_Sub1_Sub2_Sub2_Sub1Array1[local30] = null;
		}
		Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2 = null;
		for (@Pc(46) int local46 = 0; local46 < Static438.anInt8226; local46++) {
			@Pc(53) Class15_Sub1_Sub2_Sub2_Sub2 local53 = Static537.aClass8_Sub50Array1[local46].aClass15_Sub1_Sub2_Sub2_Sub2_2;
			if (local53 != null) {
				local53.anInt8108 = -1;
			}
		}
		Static626.method8434();
		Static621.anInt10407 = -1;
		Static460.anInt8416 = -1;
		Static427.anInt8005 = 1;
		Static63.method1687(10);
		for (@Pc(83) int local83 = 0; local83 < 100; local83++) {
			Static620.aBooleanArray29[local83] = true;
		}
		Static499.method7247();
		Static246.aClass8_Sub48_2 = null;
		Static18.aLong10 = 0L;
	}
}
