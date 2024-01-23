import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!eg", name = "y", descriptor = "I")
	public static int anInt3246;

	@OriginalMember(owner = "client!eg", name = "v", descriptor = "Lclient!en;")
	public static Class1_Sub14_Sub1 aClass1_Sub14_Sub1_4 = new Class1_Sub14_Sub1(5000);

	@OriginalMember(owner = "client!eg", name = "A", descriptor = "Ljava/lang/String;")
	public static String aString183 = "Drop";

	@OriginalMember(owner = "client!eg", name = "F", descriptor = "I")
	public static int anInt3251 = 0;

	@OriginalMember(owner = "client!eg", name = "G", descriptor = "[I")
	public static int[] anIntArray276 = new int[200];

	@OriginalMember(owner = "client!eg", name = "H", descriptor = "B")
	public static byte aByte18 = 0;

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(BLclient!hi;I)I")
	public static int method2806(@OriginalArg(1) Class66 arg0, @OriginalArg(2) int arg1) {
		if (arg0.anIntArrayArray17 == null || arg1 >= arg0.anIntArrayArray17.length) {
			return -2;
		}
		try {
			@Pc(31) int[] local31 = arg0.anIntArrayArray17[arg1];
			@Pc(33) int local33 = 0;
			@Pc(35) byte local35 = 0;
			@Pc(37) int local37 = 0;
			while (true) {
				@Pc(42) int local42 = local31[local33++];
				@Pc(44) int local44 = 0;
				@Pc(46) byte local46 = 0;
				if (local42 == 0) {
					return local37;
				}
				if (local42 == 1) {
					local44 = Static11.anIntArray12[local31[local33++]];
				}
				if (local42 == 15) {
					local46 = 1;
				}
				if (local42 == 2) {
					local44 = Static288.anIntArray459[local31[local33++]];
				}
				if (local42 == 16) {
					local46 = 2;
				}
				if (local42 == 17) {
					local46 = 3;
				}
				if (local42 == 3) {
					local44 = Static199.anIntArray312[local31[local33++]];
				}
				@Pc(118) int local118;
				@Pc(129) Class66 local129;
				@Pc(134) int local134;
				@Pc(149) int local149;
				if (local42 == 4) {
					local118 = local31[local33++] << 16;
					@Pc(125) int local125 = local118 + local31[local33++];
					local129 = Static53.method968(local125);
					local134 = local31[local33++];
					if (local134 != -1 && (!Static49.method909(local134).aBoolean219 || Static254.aBoolean315)) {
						for (local149 = 0; local149 < local129.anIntArray192.length; local149++) {
							if (local134 + 1 == local129.anIntArray192[local149]) {
								local44 += local129.anIntArray195[local149];
							}
						}
					}
				}
				if (local42 == 5) {
					local44 = Static55.anIntArray64[local31[local33++]];
				}
				if (local42 == 6) {
					local44 = Class67_Sub1.anIntArray362[Static288.anIntArray459[local31[local33++]] - 1];
				}
				if (local42 == 7) {
					local44 = Static55.anIntArray64[local31[local33++]] * 100 / 46875;
				}
				if (local42 == 8) {
					local44 = Static90.aClass15_Sub5_Sub2_2.anInt5625;
				}
				if (local42 == 9) {
					for (local118 = 0; local118 < 25; local118++) {
						if (Static202.aBooleanArray16[local118]) {
							local44 += Static288.anIntArray459[local118];
						}
					}
				}
				if (local42 == 10) {
					local118 = local31[local33++] << 16;
					local118 += local31[local33++];
					local129 = Static53.method968(local118);
					local134 = local31[local33++];
					if (local134 != -1 && (!Static49.method909(local134).aBoolean219 || Static254.aBoolean315)) {
						for (local149 = 0; local149 < local129.anIntArray192.length; local149++) {
							if (local129.anIntArray192[local149] == local134 + 1) {
								local44 = 999999999;
								break;
							}
						}
					}
				}
				if (local42 == 11) {
					local44 = Static118.anInt2474;
				}
				if (local42 == 12) {
					local44 = Static135.anInt2716;
				}
				if (local42 == 13) {
					local118 = Static55.anIntArray64[local31[local33++]];
					@Pc(344) int local344 = local31[local33++];
					local44 = (local118 & 0x1 << local344) == 0 ? 0 : 1;
				}
				if (local42 == 14) {
					local118 = local31[local33++];
					local44 = Static272.method4761(local118);
				}
				if (local42 == 18) {
					local44 = Static199.anInt3817 + (Static90.aClass15_Sub5_Sub2_2.anInt5559 >> 7);
				}
				if (local42 == 19) {
					local44 = (Static90.aClass15_Sub5_Sub2_2.anInt5557 >> 7) + Static192.anInt3637;
				}
				if (local42 == 20) {
					local44 = local31[local33++];
				}
				if (local46 == 0) {
					if (local35 == 0) {
						local37 += local44;
					}
					if (local35 == 1) {
						local37 -= local44;
					}
					if (local35 == 2 && local44 != 0) {
						local37 /= local44;
					}
					if (local35 == 3) {
						local37 *= local44;
					}
					local35 = 0;
				} else {
					local35 = local46;
				}
			}
		} catch (@Pc(446) Exception local446) {
			return -1;
		}
	}

	@OriginalMember(owner = "client!eg", name = "c", descriptor = "(I)V")
	public static void method2809() {
		@Pc(8) int local8 = Static309.aByteArrayArray18.length;
		for (@Pc(14) int local14 = 0; local14 < local8; local14++) {
			if (Static309.aByteArrayArray18[local14] != null) {
				@Pc(30) int local30 = -1;
				for (@Pc(32) int local32 = 0; local32 < Static164.anInt3255; local32++) {
					if (Static264.anIntArray426[local32] == Static224.anIntArray348[local14]) {
						local30 = local32;
						break;
					}
				}
				if (local30 == -1) {
					Static264.anIntArray426[Static164.anInt3255] = Static224.anIntArray348[local14];
					local30 = Static164.anInt3255++;
				}
				@Pc(76) Class1_Sub14 local76 = new Class1_Sub14(Static309.aByteArrayArray18[local14]);
				@Pc(78) int local78 = 0;
				while (local76.anInt1480 < Static309.aByteArrayArray18[local14].length && local78 < 511 && Static85.anInt1689 < 1023) {
					@Pc(102) int local102 = local30 | local78++ << 6;
					@Pc(106) int local106 = local76.method1386();
					@Pc(110) int local110 = local106 >> 14;
					@Pc(116) int local116 = local106 >> 7 & 0x3F;
					@Pc(130) int local130 = (Static224.anIntArray348[local14] >> 8) * 64 + local116 - Static199.anInt3817;
					@Pc(134) int local134 = local106 & 0x3F;
					@Pc(147) int local147 = local134 + (Static224.anIntArray348[local14] & 0xFF) * 64 - Static192.anInt3637;
					@Pc(153) Class99 local153 = Static261.method4114(local76.method1386());
					if (Static83.aClass15_Sub5_Sub1Array1[local102] == null && (local153.aByte16 & 0x1) > 0 && Static43.anInt905 == local110 && local130 >= 0 && local130 + local153.anInt3050 < 104 && local147 >= 0 && local153.anInt3050 + local147 < 104) {
						Static83.aClass15_Sub5_Sub1Array1[local102] = new Class15_Sub5_Sub1();
						@Pc(201) Class15_Sub5_Sub1 local201 = Static83.aClass15_Sub5_Sub1Array1[local102];
						Static104.anIntArray178[Static85.anInt1689++] = local102;
						local201.anInt5563 = Static313.anInt2966;
						local201.method3200(local153);
						local201.method4700(local201.aClass99_1.anInt3050);
						local201.anInt5593 = local201.anInt5554 = Static190.anIntArray300[local201.aClass99_1.aByte14];
						local201.anInt5529 = local201.aClass99_1.anInt3062;
						if (local201.anInt5529 == 0) {
							local201.anInt5554 = 0;
						}
						local201.anInt5543 = local201.aClass99_1.anInt3069;
						local201.method4693(local130, local201.method4702(), local147, true);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!eg", name = "b", descriptor = "(IB)I")
	public static int method2810(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			local1 += 16;
			arg0 >>>= 0x10;
		}
		if (arg0 >= 256) {
			arg0 >>>= 0x8;
			local1 += 8;
		}
		if (arg0 >= 16) {
			arg0 >>>= 0x4;
			local1 += 4;
		}
		if (arg0 >= 4) {
			local1 += 2;
			arg0 >>>= 0x2;
		}
		if (arg0 >= 1) {
			local1++;
			arg0 >>>= 0x1;
		}
		return local1 + arg0;
	}
}
