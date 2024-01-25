import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static128 {

	@OriginalMember(owner = "client!f", name = "D", descriptor = "I")
	public static int anInt2699;

	@OriginalMember(owner = "client!f", name = "H", descriptor = "I")
	public static int anInt2703 = 0;

	@OriginalMember(owner = "client!f", name = "J", descriptor = "I")
	public static int anInt2705 = 2;

	@OriginalMember(owner = "client!f", name = "K", descriptor = "Lclient!bv;")
	public static final Class40 aClass40_38 = new Class40("Loaded core fonts", "Schriftarten geladen", "Polices chargées", "Fontes principais carregadas");

	@OriginalMember(owner = "client!f", name = "L", descriptor = "Lclient!bv;")
	public static final Class40 aClass40_39 = new Class40("M", "M", "M", "M");

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IBIIZI)V")
	public static void method2401(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		if (Static254.aFrame32 != null && (arg2 != 3 || Static300.aClass5_Sub28_Sub1_1.anInt4888 != arg4 || arg1 != Static300.aClass5_Sub28_Sub1_1.anInt4890)) {
			Static133.method2511(Static159.aClass9_10, Static254.aFrame32);
			Static254.aFrame32 = null;
		}
		if (arg2 == 3 && Static254.aFrame32 == null) {
			Static254.aFrame32 = Static8.method273(arg4, Static159.aClass9_10, 0, arg1);
			if (Static254.aFrame32 != null) {
				Static300.aClass5_Sub28_Sub1_1.anInt4890 = arg1;
				Static300.aClass5_Sub28_Sub1_1.anInt4888 = arg4;
				Static300.aClass5_Sub28_Sub1_1.method4132(Static159.aClass9_10);
			}
		}
		if (arg2 == 3 && Static254.aFrame32 == null) {
			method2401(arg0, -1, Static300.aClass5_Sub28_Sub1_1.anInt4891, true, -1);
			return;
		}
		@Pc(103) Container local103;
		@Pc(79) Insets local79;
		if (Static254.aFrame32 != null) {
			Static149.anInt3095 = arg4;
			local103 = Static254.aFrame32;
			Static295.anInt5920 = arg1;
		} else if (Static265.aFrame25 == null) {
			local103 = Static159.aClass9_10.anApplet1;
			Static149.anInt3095 = local103.getSize().width;
			Static295.anInt5920 = local103.getSize().height;
		} else {
			local79 = Static265.aFrame25.getInsets();
			Static149.anInt3095 = Static265.aFrame25.getSize().width - local79.right - local79.left;
			@Pc(99) int local99 = local79.bottom + local79.top;
			Static295.anInt5920 = Static265.aFrame25.getSize().height - local99;
			local103 = Static265.aFrame25;
		}
		@Pc(143) int local143;
		if (arg2 == 1) {
			Static186.anInt3583 = (Static149.anInt3095 - Static508.anInt8634) / 2;
			Static383.anInt6994 = Static508.anInt8634;
			Static10.anInt149 = 0;
			Static456.anInt7874 = Static495.anInt8489;
		} else if (Static193.anInt3735 < 96 && Static17.anInt459 == 0) {
			local143 = Static149.anInt3095 <= 1024 ? Static149.anInt3095 : 1024;
			Static186.anInt3583 = (Static149.anInt3095 - local143) / 2;
			Static383.anInt6994 = local143;
			@Pc(161) int local161 = Static295.anInt5920 <= 768 ? Static295.anInt5920 : 768;
			Static10.anInt149 = 0;
			Static456.anInt7874 = local161;
		} else {
			Static383.anInt6994 = Static149.anInt3095;
			Static186.anInt3583 = 0;
			Static10.anInt149 = 0;
			Static456.anInt7874 = Static295.anInt5920;
		}
		if (Static134.aClass199_4 != Static124.aClass199_3) {
			@Pc(202) boolean local202;
			if (Static383.anInt6994 < 1024 && Static456.anInt7874 < 768) {
				local202 = true;
			} else {
				local202 = false;
			}
		}
		if (arg3) {
			Static423.method6080();
		} else {
			Static209.aCanvas6.setSize(Static383.anInt6994, Static456.anInt7874);
			Static110.aClass62_15.method7038(Static209.aCanvas6);
			if (local103 == Static265.aFrame25) {
				local79 = Static265.aFrame25.getInsets();
				Static209.aCanvas6.setLocation(local79.left + Static186.anInt3583, local79.top + Static10.anInt149);
			} else {
				Static209.aCanvas6.setLocation(Static186.anInt3583, Static10.anInt149);
			}
		}
		if (arg2 >= 2) {
			Static241.aBoolean305 = true;
		} else {
			Static241.aBoolean305 = false;
		}
		if (Static395.anInt7085 != -1) {
			Static92.method1973(true);
		}
		if (client.lb != null && Static319.method5139(Static389.anInt7024)) {
			Static439.method7184();
		}
		for (local143 = 0; local143 < 100; local143++) {
			Static345.aBooleanArray24[local143] = true;
		}
		Static304.aBoolean414 = true;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(BLjava/lang/String;)[B")
	public static byte[] method2402(@OriginalArg(1) String arg0) {
		@Pc(13) int local13 = arg0.length();
		@Pc(16) byte[] local16 = new byte[local13];
		for (@Pc(18) int local18 = 0; local18 < local13; local18++) {
			@Pc(24) char local24 = arg0.charAt(local18);
			if (local24 > '\u0000' && local24 < '\u0080' || !(local24 < ' ' || local24 > 'ÿ')) {
				local16[local18] = (byte) local24;
			} else if (local24 == '€') {
				local16[local18] = -128;
			} else if (local24 == '‚') {
				local16[local18] = -126;
			} else if (local24 == 'ƒ') {
				local16[local18] = -125;
			} else if (local24 == '„') {
				local16[local18] = -124;
			} else if (local24 == '…') {
				local16[local18] = -123;
			} else if (local24 == '†') {
				local16[local18] = -122;
			} else if (local24 == '‡') {
				local16[local18] = -121;
			} else if (local24 == 'ˆ') {
				local16[local18] = -120;
			} else if (local24 == '‰') {
				local16[local18] = -119;
			} else if (local24 == 'Š') {
				local16[local18] = -118;
			} else if (local24 == '‹') {
				local16[local18] = -117;
			} else if (local24 == 'Œ') {
				local16[local18] = -116;
			} else if (local24 == 'Ž') {
				local16[local18] = -114;
			} else if (local24 == '‘') {
				local16[local18] = -111;
			} else if (local24 == '’') {
				local16[local18] = -110;
			} else if (local24 == '“') {
				local16[local18] = -109;
			} else if (local24 == '”') {
				local16[local18] = -108;
			} else if (local24 == '•') {
				local16[local18] = -107;
			} else if (local24 == '–') {
				local16[local18] = -106;
			} else if (local24 == '—') {
				local16[local18] = -105;
			} else if (local24 == '˜') {
				local16[local18] = -104;
			} else if (local24 == '™') {
				local16[local18] = -103;
			} else if (local24 == 'š') {
				local16[local18] = -102;
			} else if (local24 == '›') {
				local16[local18] = -101;
			} else if (local24 == 'œ') {
				local16[local18] = -100;
			} else if (local24 == 'ž') {
				local16[local18] = -98;
			} else if (local24 == 'Ÿ') {
				local16[local18] = -97;
			} else {
				local16[local18] = 63;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Z)V")
	public static void method2403() {
		if (Static535.aFloat364 < 1024.0F) {
			Static535.aFloat364 = 1024.0F;
		}
		if (Static535.aFloat364 > 3072.0F) {
			Static535.aFloat364 = 3072.0F;
		}
		while (Static476.aFloat339 >= 16384.0F) {
			Static476.aFloat339 -= 16384.0F;
		}
		while (Static476.aFloat339 < 0.0F) {
			Static476.aFloat339 += 16384.0F;
		}
		@Pc(41) int local41 = Static66.anInt1272 >> 7;
		@Pc(52) int local52 = Static387.anInt7017 >> 7;
		@Pc(58) int local58 = Static191.method5464(Static66.anInt1272, Static387.anInt7017, Static367.anInt6860);
		@Pc(60) int local60 = 0;
		@Pc(92) int local92;
		if (local41 > 3 && local52 > 3 && local41 < Static460.anInt7894 - 4 && local52 < Static235.anInt4493 - 4) {
			for (local92 = local41 - 4; local92 <= local41 + 4; local92++) {
				for (@Pc(98) int local98 = local52 - 4; local98 <= local52 + 4; local98++) {
					@Pc(102) int local102 = Static367.anInt6860;
					if (local102 < 3 && Static279.method4553(local98, local92)) {
						local102++;
					}
					@Pc(115) int local115 = 0;
					if (Static111.aClass130_Sub1_1.aByteArrayArrayArray12 != null && Static111.aClass130_Sub1_1.aByteArrayArrayArray12[local102] != null) {
						local115 = (Static111.aClass130_Sub1_1.aByteArrayArrayArray12[local102][local92][local98] & 0xFF) * 8;
					}
					@Pc(148) int local148 = local58 + local115 - Static248.aClass131Array4[local102].ba(local92, local98);
					if (local148 > local60) {
						local60 = local148;
					}
				}
			}
		}
		local92 = (local60 >> 0) * 1536;
		if (local92 > 786432) {
			local92 = 786432;
		}
		if (local92 < 262144) {
			local92 = 262144;
		}
		if (Static281.anInt5474 < local92) {
			Static281.anInt5474 += (local92 - Static281.anInt5474) / 24;
		} else if (Static281.anInt5474 > local92) {
			Static281.anInt5474 += (local92 - Static281.anInt5474) / 80;
			return;
		}
	}
}
