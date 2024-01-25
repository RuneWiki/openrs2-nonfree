import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static405 {

	@OriginalMember(owner = "client!qu", name = "b", descriptor = "I")
	public static int anInt7615;

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(III)B")
	public static byte method6386(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 9) {
			return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(I)V")
	public static void method6387() {
		@Pc(13) int local13 = Static46.aByteArrayArray3.length;
		for (@Pc(15) int local15 = 0; local15 < local13; local15++) {
			if (Static46.aByteArrayArray3[local15] != null) {
				@Pc(23) int local23 = -1;
				for (@Pc(25) int local25 = 0; local25 < Static237.anInt4213; local25++) {
					if (Static444.anIntArray613[local15] == Static222.anIntArray126[local25]) {
						local23 = local25;
						break;
					}
				}
				if (local23 == -1) {
					Static222.anIntArray126[Static237.anInt4213] = Static444.anIntArray613[local15];
					local23 = Static237.anInt4213++;
				}
				@Pc(68) Class2_Sub29 local68 = new Class2_Sub29(Static46.aByteArrayArray3[local15]);
				@Pc(70) int local70 = 0;
				while (local68.anInt6132 < Static46.aByteArrayArray3[local15].length && local70 < 511 && Static520.anInt1936 < 1023) {
					@Pc(87) int local87 = local70++ << 6 | local23;
					@Pc(91) int local91 = local68.method5229();
					@Pc(95) int local95 = local91 >> 14;
					@Pc(101) int local101 = local91 >> 7 & 0x3F;
					@Pc(105) int local105 = local91 & 0x3F;
					@Pc(117) int local117 = (Static444.anIntArray613[local15] >> 8) * 64 + local101 - Static238.anInt4280;
					@Pc(131) int local131 = (Static444.anIntArray613[local15] & 0xFF) * 64 + local105 - Static371.anInt6936;
					@Pc(140) Class12 local140 = Static21.aClass255_2.method6583(local68.method5229());
					@Pc(147) Class2_Sub11 local147 = (Class2_Sub11) Static71.aClass127_13.method3205((long) local87);
					if (local147 == null && (local140.aByte12 & 0x1) > 0 && Static348.anInt6407 == local95 && local117 >= 0 && Static363.anInt1158 > local140.anInt313 + local117 && local131 >= 0 && local140.anInt313 + local131 < Static511.anInt8889) {
						@Pc(181) Class1_Sub1_Sub2_Sub2 local181 = new Class1_Sub1_Sub2_Sub2();
						local181.anInt5076 = local87;
						@Pc(189) Class2_Sub11 local189 = new Class2_Sub11(local181);
						Static71.aClass127_13.method3213(local189, (long) local87);
						Static539.aClass2_Sub11Array1[Static61.anInt1174++] = local189;
						Static24.anIntArray39[Static520.anInt1936++] = local87;
						local181.anInt5049 = Static115.anInt2326;
						local181.method4401(local140);
						local181.method4388(local181.aClass12_1.anInt313);
						local181.anInt5082 = local181.aClass12_1.anInt327 << 3;
						local181.method4383(local181.aClass12_1.aByte11 + 4 << 11 & 0x3AF7, true);
						local181.method4400(local95, local131, local117, local181.method4394(), true);
					}
				}
			}
		}
	}
}
