import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static440 {

	@OriginalMember(owner = "client!pb", name = "c", descriptor = "I")
	public static int anInt7466;

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "([[BLclient!tf;B)V")
	public static void method6452(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) Class310_Sub1 arg1) {
		@Pc(8) int local8 = Static402.aByteArrayArray18.length;
		for (@Pc(14) int local14 = 0; local14 < local8; local14++) {
			@Pc(20) byte[] local20 = arg0[local14];
			if (local20 != null) {
				@Pc(33) int local33 = (Static300.anIntArray289[local14] >> 8) * 64 - Static534.anInt8753;
				@Pc(44) int local44 = (Static300.anIntArray289[local14] & 0xFF) * 64 - Static234.anInt4239;
				Static35.method857();
				arg1.method7929(Static83.aClass324Array1, local44, local33, local20, Static546.aClass132_13);
			}
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)V")
	public static void method6453() {
		if (Static49.anInt1029 < 0) {
			return;
		}
		@Pc(15) long local15 = Static566.method7936();
		Static49.anInt1029 = (int) ((long) Static49.anInt1029 + Static418.aLong210 - local15);
		if (Static49.anInt1029 <= 0) {
			Static244.aFloat30 = Static328.aClass283_33.aFloat158;
			Static449.aFloat116 = Static328.aClass283_33.aFloat159;
			Static560.aFloat10 = Static328.aClass283_33.aFloat154;
			Static668.aFloat203 = Static328.aClass283_33.aFloat155;
			Static602.aClass25_4 = Static328.aClass283_33.aClass25_3;
			Static355.anInt6039 = Static328.aClass283_33.anInt8171;
			Static49.anInt1029 = -1;
			Static499.aFloat160 = Static328.aClass283_33.aFloat156;
			Static450.anInt10323 = Static328.aClass283_33.anInt8166;
			Static391.anInt6569 = Static328.aClass283_33.anInt8163;
			Static314.aFloat36 = Static328.aClass283_33.aFloat157;
		} else {
			@Pc(68) int local68 = (Static49.anInt1029 << 8) / Static108.anInt1974;
			@Pc(73) int local73 = 255 - local68;
			@Pc(78) float local78 = (float) local68 / 255.0F;
			@Pc(82) float local82 = 1.0F - local78;
			Static391.anInt6569 = (local68 * (Static398.anInt6687 & 0xFF00) + (Static328.aClass283_33.anInt8163 & 0xFF00) * local73 & 0xFF0000) + ((Static328.aClass283_33.anInt8163 & 0xFF00FF) * local73 + (Static398.anInt6687 & 0xFF00FF) * local68 & 0xFF00FF00) >>> 8;
			Static449.aFloat116 = local82 * (Static328.aClass283_33.aFloat159 - Static407.aFloat82) + Static407.aFloat82;
			Static314.aFloat36 = Static406.aFloat81 + (Static328.aClass283_33.aFloat157 - Static406.aFloat81) * local82;
			Static244.aFloat30 = Static530.aFloat162 + (Static328.aClass283_33.aFloat158 - Static530.aFloat162) * local82;
			Static450.anInt10323 = local68 * Static146.anInt4860 + Static328.aClass283_33.anInt8166 * local73 >> 8;
			Static560.aFloat10 = Static619.aFloat197 + (Static328.aClass283_33.aFloat154 - Static619.aFloat197) * local82;
			Static499.aFloat160 = (Static328.aClass283_33.aFloat156 - Static87.aFloat11) * local82 + Static87.aFloat11;
			Static668.aFloat203 = local82 * (Static328.aClass283_33.aFloat155 - Static649.aFloat200) + Static649.aFloat200;
			Static355.anInt6039 = ((Static328.aClass283_33.anInt8171 & 0xFF00FF) * local73 + local68 * (Static23.anInt567 & 0xFF00FF) & 0xFF00FF00) + ((Static23.anInt567 & 0xFF00) * local68 + (local73 * (Static328.aClass283_33.anInt8171 & 0xFF00)) & 0xFF0000) >>> 8;
			if (Static328.aClass283_33.aClass25_3 != Static95.aClass25_1) {
				Static602.aClass25_4 = Static83.aClass132_3.method7457(Static95.aClass25_1, Static328.aClass283_33.aClass25_3, local82, Static602.aClass25_4);
			}
		}
		Static418.aLong210 = local15;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIZ)Z")
	public static boolean method6454(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x84080) != 0;
	}
}
