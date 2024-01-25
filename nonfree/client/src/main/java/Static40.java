import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!bt", name = "p", descriptor = "I")
	public static int anInt1089 = 104;

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(Z)V")
	public static void method775() {
		@Pc(5) Class256 local5 = null;
		try {
			@Pc(10) Class43 local10 = Static66.aClass143_2.method3394("2");
			while (local10.anInt1521 == 0) {
				Static360.method4758(1L);
			}
			if (local10.anInt1521 == 1) {
				local5 = (Class256) local10.anObject3;
				@Pc(40) Class3_Sub7 local40 = new Class3_Sub7(Static162.anInt3325 * 6 + 3);
				local40.method2628(1);
				local40.method2613(Static162.anInt3325);
				for (@Pc(50) int local50 = 0; local50 < Static407.anIntArray453.length; local50++) {
					if (Static20.aBooleanArray4[local50]) {
						local40.method2613(local50);
						local40.method2636(Static407.anIntArray453[local50]);
					}
				}
				local5.method5391(local40.aByteArray46, 0, local40.anInt3235);
			}
		} catch (@Pc(80) Exception local80) {
		}
		try {
			if (local5 != null) {
				local5.method5388();
			}
		} catch (@Pc(87) Exception local87) {
		}
		Static5.aLong3 = Static118.method1934();
		Static321.aBoolean480 = false;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(BII)Z")
	public static boolean method776(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (Static452.method5952(arg1, arg0) | Static23.method511(arg1, arg0) | Static262.method3815(arg1, arg0)) & Static131.method2042(arg0, arg1);
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method777(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = arg0.length();
		while (local20 > local17 && Static352.method4670(arg0.charAt(local17))) {
			local17++;
		}
		while (local17 < local20 && Static352.method4670(arg0.charAt(local20 - 1))) {
			local20--;
		}
		@Pc(49) int local49 = local20 - local17;
		if (local49 < 1 || local49 > 12) {
			return null;
		}
		@Pc(62) StringBuffer local62 = new StringBuffer(local49);
		for (@Pc(64) int local64 = local17; local64 < local20; local64++) {
			@Pc(69) char local69 = arg0.charAt(local64);
			if (Static382.method1459(local69)) {
				@Pc(77) char local77 = Static316.method4357(local69);
				if (local77 != '\u0000') {
					local62.append(local77);
				}
			}
		}
		if (local62.length() == 0) {
			return null;
		} else {
			return local62.toString();
		}
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(B)V")
	public static void method778() {
		for (@Pc(12) int local12 = 0; local12 < Static9.aByteArrayArrayArray1.length; local12++) {
			for (@Pc(16) int local16 = 0; local16 < Static9.aByteArrayArrayArray1[0].length; local16++) {
				for (@Pc(20) int local20 = 0; local20 < Static9.aByteArrayArrayArray1[0][0].length; local20++) {
					Static9.aByteArrayArrayArray1[local12][local16][local20] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!bt", name = "b", descriptor = "(I)V")
	public static void method779() {
		Static13.aClass32_4.anInt1093 = 1;
		Static332.aClient1.method1107();
		Static168.aBoolean289 = true;
		Static67.aBoolean142 = true;
		Static239.method1377();
		Static302.aClass3_Sub7_Sub1_2.anInt3235 = 0;
		Static354.aClass119_128 = null;
		Static90.anInt2165 = 0;
		Static445.anInt7526 = 0;
		Static76.aClass119_31 = null;
		Static237.aClass3_Sub7_Sub1_1.anInt3235 = 0;
		Static277.aClass119_110 = null;
		Static401.anInt6631 = 0;
		Static240.aClass119_99 = null;
		for (@Pc(5588) int local5588 = 0; local5588 < Static331.aClass196Array41.length; local5588++) {
			Static331.aClass196Array41[local5588] = null;
		}
		for (@Pc(5604) int local5604 = 0; local5604 < 100; local5604++) {
			Static125.aStringArray24[local5604] = null;
		}
		Static84.anInt2097 = 0;
		Static446.aBoolean648 = false;
		Static235.method3583();
		Static252.aFloat47 = (int) (Math.random() * 160.0D) - 80 & 0x3FFF;
		Static1.anInt13 = (int) (Math.random() * 110.0D) - 55;
		Static179.anInt5783 = (int) (Math.random() * 80.0D) - 40;
		Static128.anInt2672 = (int) (Math.random() * 100.0D) - 50;
		Static341.anInt5790 = (int) (Math.random() * 30.0D) - 20;
		Static20.anInt696 = (int) (Math.random() * 120.0D) - 60;
		Static409.method5280();
		for (@Pc(5670) int local5670 = 0; local5670 < 2048; local5670++) {
			Static361.aClass7_Sub2_Sub3_Sub2Array1[local5670] = null;
		}
		Static54.anInt1472 = 0;
		for (@Pc(5685) int local5685 = 0; local5685 < 32768; local5685++) {
			Static139.aClass7_Sub2_Sub3_Sub1Array11[local5685] = null;
		}
		Static92.aClass243_14.method5200();
		Static365.aClass243_38.method5200();
		Static231.aClass138_2.method3308();
		Static441.aClass11_43.method312();
		Static301.aClass243_16 = new Class243();
		Static202.anInt3950 = 0;
		Static105.anInt2381 = 0;
		Static85.aClass49_1.method1316();
		Static44.method5679();
		Static57.anInt5083 = 0;
		Static21.anInt707 = 0;
		Static305.anInt5449 = 0;
		Static386.anInt6440 = 0;
		Static194.anInt3884 = 0;
		Static185.anInt3725 = 0;
		Static202.anInt3951 = 0;
		Static194.anInt3883 = 0;
		Static348.anInt5916 = 0;
		Static20.anInt684 = 0;
		for (@Pc(5745) int local5745 = 0; local5745 < Static407.anIntArray453.length; local5745++) {
			if (!Static20.aBooleanArray4[local5745]) {
				Static407.anIntArray453[local5745] = -1;
			}
		}
		if (Static226.anInt4225 != -1) {
			Static192.method3072(Static226.anInt4225);
		}
		for (@Pc(5770) Class3_Sub9 local5770 = (Class3_Sub9) Static318.aClass11_42.method313(); local5770 != null; local5770 = (Class3_Sub9) Static318.aClass11_42.method316()) {
			if (!local5770.method5978()) {
				local5770 = (Class3_Sub9) Static318.aClass11_42.method313();
				if (local5770 == null) {
					break;
				}
			}
			Static434.method5676(true, false, local5770);
		}
		Static226.anInt4225 = -1;
		Static318.aClass11_42 = new Class11(8);
		Static298.method4485();
		Static318.aClass156_17 = null;
		for (@Pc(5808) int local5808 = 0; local5808 < 8; local5808++) {
			Static430.aStringArray31[local5808] = null;
			Static32.aBooleanArray7[local5808] = false;
			Static455.anIntArray535[local5808] = -1;
		}
		Static380.method2732();
		Static385.aBoolean554 = true;
		for (@Pc(5831) int local5831 = 0; local5831 < 100; local5831++) {
			Static55.aBooleanArray8[local5831] = true;
		}
		Static92.aClass173Array1 = null;
		Static85.anInt2098 = 0;
		Static453.aString68 = null;
		for (@Pc(5848) int local5848 = 0; local5848 < 6; local5848++) {
			Static364.aClass86Array1[local5848] = new Class86();
		}
		for (@Pc(5863) int local5863 = 0; local5863 < 25; local5863++) {
			Static255.anIntArray320[local5863] = 0;
			Static355.anIntArray392[local5863] = 0;
			Static281.anIntArray520[local5863] = 0;
		}
		Static214.method3288();
		Static224.aBoolean359 = true;
		Static6.aShortArray1 = Static212.aShortArray63 = Static426.aShortArray143 = Static52.aShortArray20 = new short[256];
		Static204.aString23 = Static342.aClass189_186.method4262(Static53.anInt1454);
		Static374.aClass20_Sub1_1.aBoolean202 = false;
		Static374.aClass20_Sub1_1.aBoolean201 = false;
		Static2.anInt51 = 0;
		Static177.method2822();
		Static104.method1813();
		Static13.aClass32_4.anInt1093 = 2;
		Static113.aLong169 = 0L;
		Static15.aClass3_Sub1_1 = null;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(IIIILclient!vm;)V")
	public static void method780(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class7_Sub5 arg4) {
		@Pc(4) Class118 local4 = Static450.method5835(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		@Pc(8) int local8 = 0;
		arg4.anInt6729 = (arg1 << Static336.anInt5747) + Static421.anInt6887;
		arg4.anInt6732 = arg3;
		arg4.anInt6731 = (arg2 << Static336.anInt5747) + Static421.anInt6887;
		for (@Pc(28) Class179 local28 = local4.aClass179_2; local28 != null; local28 = local28.aClass179_3) {
			if (local28.aClass7_Sub2_2.aBoolean374) {
				@Pc(38) int local38 = local28.aClass7_Sub2_2.method3494();
				if (local38 != -32768 && local38 < local8) {
					local8 = local38;
				}
			}
		}
		if (local8 < 0) {
			arg4.anInt6732 += local8;
			arg4.aBoolean582 = true;
		}
		local4.aClass7_Sub5_1 = arg4;
	}

	@OriginalMember(owner = "client!bt", name = "c", descriptor = "(I)V")
	public static void method781() {
		if (Static445.anInt7526 > 1) {
			Static445.anInt7526--;
			Static355.anInt6052 = Static301.anInt2459;
		}
		if (Static90.anInt2165 > 0) {
			Static90.anInt2165--;
		}
		if (Static109.aBoolean215) {
			Static109.aBoolean215 = false;
			Static92.method1686();
			return;
		}
		if (!Static438.aBoolean636) {
			Static80.method1554();
		}
		for (@Pc(39) int local39 = 0; local39 < 100 && Static74.method1474(); local39++) {
		}
		if (Static120.anInt2584 != 30) {
			return;
		}
		Static16.method364(Static278.aClass217_79.method4668(), Static302.aClass3_Sub7_Sub1_2);
		if (Static15.aClass3_Sub1_1 == null) {
			if (Static113.aLong169 <= Static118.method1934()) {
				Static15.aClass3_Sub1_1 = Static369.aClass151_1.method3711(Static452.aString67);
			}
		} else if (Static15.aClass3_Sub1_1.anInt64 != -1) {
			Static30.method641(Static325.aClass217_88);
			Static302.aClass3_Sub7_Sub1_2.method2613(Static15.aClass3_Sub1_1.anInt64);
			Static15.aClass3_Sub1_1 = null;
			Static113.aLong169 = Static118.method1934() + 30000L;
		}
		@Pc(100) Class3_Sub23 local100 = (Class3_Sub23) Static79.aClass243_34.method5208();
		@Pc(114) int local114;
		@Pc(137) int local137;
		@Pc(154) int local154;
		@Pc(170) boolean local170;
		@Pc(219) int local219;
		@Pc(225) int local225;
		@Pc(237) int local237;
		if (local100 != null || Static118.method1934() - 2000L > Static434.aLong218) {
			@Pc(111) boolean local111 = false;
			local114 = Static302.aClass3_Sub7_Sub1_2.anInt3235;
			for (@Pc(119) Class3_Sub23 local119 = (Class3_Sub23) Static337.aClass243_35.method5208(); local119 != null && Static302.aClass3_Sub7_Sub1_2.anInt3235 - local114 < 240; local119 = (Class3_Sub23) Static337.aClass243_35.method5203()) {
				local119.method5977();
				local137 = local119.method3474();
				if (local137 < 0) {
					local137 = 0;
				} else if (local137 > 65534) {
					local137 = 65534;
				}
				local154 = local119.method3475();
				if (local154 < 0) {
					local154 = 0;
				} else if (local154 > 65534) {
					local154 = 65534;
				}
				local170 = false;
				if (local119.method3474() == -1 && local119.method3475() == -1) {
					local154 = -1;
					local170 = true;
					local137 = -1;
				}
				if (local154 != Static368.anInt6184 || Static250.anInt4743 != local137) {
					if (!local111) {
						Static30.method641(Static326.aClass217_90);
						Static302.aClass3_Sub7_Sub1_2.method2628(0);
						local111 = true;
						local114 = Static302.aClass3_Sub7_Sub1_2.anInt3235;
					}
					local219 = local154 - Static368.anInt6184;
					Static368.anInt6184 = local154;
					local225 = local137 - Static250.anInt4743;
					Static250.anInt4743 = local137;
					local237 = (int) ((local119.method3473() - Static434.aLong218) / 20L);
					if (local237 < 8 && local219 >= -32 && local219 <= 31 && local225 >= -32 && local225 <= 31) {
						local225 += 32;
						local219 += 32;
						Static302.aClass3_Sub7_Sub1_2.method2613((local219 << 6) + ((local237 << 12) + local225));
					} else if (local237 < 32 && local219 >= -128 && local219 <= 127 && local225 >= -128 && local225 <= 127) {
						Static302.aClass3_Sub7_Sub1_2.method2628(local237 + 128);
						local225 += 128;
						local219 += 128;
						Static302.aClass3_Sub7_Sub1_2.method2613((local219 << 8) + local225);
					} else if (local237 < 32) {
						Static302.aClass3_Sub7_Sub1_2.method2628(local237 + 192);
						if (local170) {
							Static302.aClass3_Sub7_Sub1_2.method2636(Integer.MIN_VALUE);
						} else {
							Static302.aClass3_Sub7_Sub1_2.method2636(local154 | local137 << 16);
						}
					} else {
						Static302.aClass3_Sub7_Sub1_2.method2613(local237 + 57344);
						if (local170) {
							Static302.aClass3_Sub7_Sub1_2.method2636(Integer.MIN_VALUE);
						} else {
							Static302.aClass3_Sub7_Sub1_2.method2636(local137 << 16 | local154);
						}
					}
					Static434.aLong218 = local119.method3473();
				}
			}
			if (local111) {
				Static302.aClass3_Sub7_Sub1_2.method2629(Static302.aClass3_Sub7_Sub1_2.anInt3235 - local114);
			}
		}
		@Pc(411) int local411;
		@Pc(458) int local458;
		if (local100 != null) {
			@Pc(397) long local397 = (local100.method3473() - Static291.aLong156) / 50L;
			if (local397 > 32767L) {
				local397 = 32767L;
			}
			Static291.aLong156 = local100.method3473();
			local411 = local100.method3474();
			if (local411 < 0) {
				local411 = 0;
			} else if (local411 > 65535) {
				local411 = 65535;
			}
			local137 = local100.method3475();
			if (local137 < 0) {
				local137 = 0;
			} else if (local137 > 65535) {
				local137 = 65535;
			}
			@Pc(443) byte local443 = 0;
			if (local100.method3478() == 2) {
				local443 = 1;
			}
			Static30.method641(Static191.aClass217_62);
			local458 = (int) local397;
			Static302.aClass3_Sub7_Sub1_2.method2614(local458 | local443 << 15);
			Static302.aClass3_Sub7_Sub1_2.method2607(local137 | local411 << 16);
		}
		@Pc(482) int local482;
		if (Static43.anInt1138 > 0) {
			local482 = 0;
			for (local114 = 0; local114 < Static43.anInt1138; local114++) {
				if (Static188.aClass60Array1[local114].method3172()) {
					local482++;
				}
			}
			if (local482 > 0) {
				Static30.method641(Static319.aClass217_36);
				if (local482 > 75) {
					local482 = 75;
				}
				Static302.aClass3_Sub7_Sub1_2.method2628(local482 * 3);
				for (local411 = 0; local411 < Static43.anInt1138; local411++) {
					@Pc(534) Class60 local534 = Static188.aClass60Array1[local411];
					if (local534.method3172()) {
						@Pc(547) long local547 = (local534.method3178() - Static235.aLong141) / 50L;
						if (local547 > 65535L) {
							local547 = 65535L;
						}
						Static235.aLong141 = local534.method3178();
						Static302.aClass3_Sub7_Sub1_2.method2628(local534.method3174());
						Static302.aClass3_Sub7_Sub1_2.method2613((int) local547);
					}
				}
			}
		}
		if (Static403.anInt6665 > 0) {
			Static403.anInt6665--;
		}
		if (Static224.aBoolean359 && Static403.anInt6665 <= 0) {
			Static403.anInt6665 = 20;
			Static224.aBoolean359 = false;
			Static30.method641(Static267.aClass217_76);
			Static302.aClass3_Sub7_Sub1_2.method2613((int) Static180.aFloat27 >> 3);
			Static302.aClass3_Sub7_Sub1_2.method2587((int) Static252.aFloat47 >> 3);
		}
		if (Static168.aBoolean289 && !Static67.aBoolean142) {
			Static67.aBoolean142 = true;
			Static30.method641(Static259.aClass217_75);
			Static302.aClass3_Sub7_Sub1_2.method2628(1);
		}
		if (!Static168.aBoolean289 && Static67.aBoolean142) {
			Static67.aBoolean142 = false;
			Static30.method641(Static259.aClass217_75);
			Static302.aClass3_Sub7_Sub1_2.method2628(0);
		}
		if (!Static196.aBoolean336) {
			Static30.method641(Static75.aClass217_34);
			Static302.aClass3_Sub7_Sub1_2.method2628(0);
			local482 = Static302.aClass3_Sub7_Sub1_2.anInt3235;
			@Pc(675) Class3_Sub7 local675 = Static374.aClass20_Sub1_1.method1815();
			Static302.aClass3_Sub7_Sub1_2.method2595(local675.anInt3235, local675.aByteArray46);
			Static302.aClass3_Sub7_Sub1_2.method2629(Static302.aClass3_Sub7_Sub1_2.anInt3235 - local482);
			Static196.aBoolean336 = true;
		}
		if (Static263.aClass118ArrayArrayArray2 != null) {
			if (Static161.anInt3316 == 2) {
				Static346.method4585();
			} else if (Static161.anInt3316 == 3) {
				Static124.method5962();
			}
		}
		if (Static111.aBoolean220) {
			Static111.aBoolean220 = false;
		} else {
			Static352.aFloat67 /= 2.0F;
		}
		if (Static440.aBoolean641) {
			Static440.aBoolean641 = false;
		} else {
			Static300.aFloat57 /= 2.0F;
		}
		Static84.method1632();
		if (Static120.anInt2584 != 30) {
			return;
		}
		Static307.method4288();
		Static321.method4379();
		Static198.method3126();
		Static224.method3355();
		Static401.anInt6631++;
		if (Static401.anInt6631 > 750) {
			Static92.method1686();
			return;
		}
		Static437.method5730();
		Static50.method912();
		Static370.method4858();
		for (local482 = Static85.aClass49_1.method1313(true); local482 != -1; local482 = Static85.aClass49_1.method1313(false)) {
			Static322.method4381(local482);
			Static253.anIntArray308[Static104.anInt2366++ & 0x1F] = local482;
		}
		@Pc(823) Class156 local823;
		for (@Pc(793) Class3_Sub4_Sub12 local793 = Static47.method864(); local793 != null; local793 = Static47.method864()) {
			local411 = local793.method3245();
			local137 = local793.method3242();
			if (local411 == 1) {
				Static407.anIntArray453[local137] = local793.anInt4063;
				Static321.aBoolean480 |= Static20.aBooleanArray4[local137];
				Static42.anIntArray78[Static401.anInt6641++ & 0x1F] = local137;
			} else if (local411 == 2) {
				Static71.aStringArray12[local137] = local793.aString24;
				Static65.anIntArray97[Static195.anInt3896++ & 0x1F] = local137;
			} else if (local411 == 3) {
				local823 = Static435.method5705(local137);
				if (!local793.aString24.equals(local823.aString43)) {
					local823.aString43 = local793.aString24;
					Static386.method5010(local823);
				}
			} else if (local411 == 4) {
				local823 = Static435.method5705(local137);
				local458 = local793.anInt4063;
				local219 = local793.anInt4060;
				local225 = local793.anInt4062;
				if (local823.anInt4832 != local458 || local219 != local823.anInt4816 || local225 != local823.anInt4815) {
					local823.anInt4832 = local458;
					local823.anInt4815 = local225;
					local823.anInt4816 = local219;
					Static386.method5010(local823);
				}
			} else if (local411 == 5) {
				local823 = Static435.method5705(local137);
				if (local793.anInt4063 != local823.lb || local793.anInt4063 == -1) {
					local823.anInt4851 = 1;
					local823.lb = local793.anInt4063;
					local823.anInt4860 = 0;
					local823.anInt4795 = 0;
					Static386.method5010(local823);
				}
			} else if (local411 == 6) {
				local154 = local793.anInt4063;
				local458 = local154 >> 10 & 0x1F;
				local219 = local154 >> 5 & 0x1F;
				local225 = local154 & 0x1F;
				local237 = (local225 << 3) + (local219 << 11) + (local458 << 19);
				@Pc(1251) Class156 local1251 = Static435.method5705(local137);
				if (local237 != local1251.anInt4847) {
					local1251.anInt4847 = local237;
					Static386.method5010(local1251);
				}
			} else if (local411 == 7) {
				local823 = Static435.method5705(local137);
				local170 = local793.anInt4063 == 1;
				if (local170 != local823.aBoolean427) {
					local823.aBoolean427 = local170;
					Static386.method5010(local823);
				}
			} else if (local411 == 8) {
				local823 = Static435.method5705(local137);
				if (local823.anInt4817 != local793.anInt4063 || local793.anInt4060 != local823.anInt4873 || local793.anInt4062 != local823.anInt4811) {
					local823.anInt4811 = local793.anInt4062;
					local823.anInt4817 = local793.anInt4063;
					local823.anInt4873 = local793.anInt4060;
					if (local823.anInt4826 != -1) {
						if (local823.anInt4870 > 0) {
							local823.anInt4811 = local823.anInt4811 * 32 / local823.anInt4870;
						} else if (local823.anInt4830 > 0) {
							local823.anInt4811 = local823.anInt4811 * 32 / local823.anInt4830;
						}
					}
					Static386.method5010(local823);
				}
			} else if (local411 == 9) {
				local823 = Static435.method5705(local137);
				if (local793.anInt4063 != local823.anInt4826 || local823.anInt4838 != local793.anInt4060) {
					local823.anInt4826 = local793.anInt4063;
					local823.anInt4838 = local793.anInt4060;
					Static386.method5010(local823);
				}
			} else if (local411 == 10) {
				local823 = Static435.method5705(local137);
				if (local823.anInt4844 != local793.anInt4063 || local823.anInt4834 != local793.anInt4060 || local823.anInt4849 != local793.anInt4062) {
					local823.anInt4844 = local793.anInt4063;
					local823.anInt4849 = local793.anInt4062;
					local823.anInt4834 = local793.anInt4060;
					Static386.method5010(local823);
				}
			} else if (local411 == 11) {
				local823 = Static435.method5705(local137);
				local823.aByte90 = 0;
				local823.anInt4800 = local823.anInt4869 = local793.anInt4063;
				local823.aByte89 = 0;
				local823.anInt4806 = local823.anInt4837 = local793.anInt4060;
				Static386.method5010(local823);
			} else if (local411 == 12) {
				local823 = Static435.method5705(local137);
				local458 = local793.anInt4063;
				if (local823 != null && local823.anInt4792 == 0) {
					if (local823.anInt4796 - local823.anInt4823 < local458) {
						local458 = local823.anInt4796 - local823.anInt4823;
					}
					if (local458 < 0) {
						local458 = 0;
					}
					if (local823.anInt4801 != local458) {
						local823.anInt4801 = local458;
						Static386.method5010(local823);
					}
				}
			} else if (local411 == 14) {
				local823 = Static435.method5705(local137);
				local823.anInt4822 = local793.anInt4063;
			} else if (local411 == 15) {
				Static312.anInt5522 = local793.anInt4060;
				Static78.anInt1944 = local793.anInt4063;
				Static246.aBoolean407 = true;
			} else if (local411 == 16) {
				local823 = Static435.method5705(local137);
				local823.anInt4798 = local793.anInt4063;
			}
		}
		if (Static253.anInt4790 != 0) {
			Static231.anInt4305 += 20;
			if (Static231.anInt4305 >= 400) {
				Static253.anInt4790 = 0;
			}
		}
		Static115.anInt2498++;
		if (Static440.aClass156_18 != null) {
			Static267.anInt5035++;
			if (Static267.anInt5035 >= 15) {
				Static386.method5010(Static440.aClass156_18);
				Static440.aClass156_18 = null;
			}
		}
		Static337.aBoolean491 = false;
		Static443.aClass156_8 = null;
		Static74.aClass156_2 = null;
		Static352.aBoolean518 = false;
		Static51.method1056(-1, null, -1);
		Static261.method660(-1, null, -1);
		if (!Static446.aBoolean648) {
			Static25.anInt849 = -1;
		}
		Static176.method2812();
		Static301.anInt2459++;
		if (Static67.aBoolean143) {
			Static30.method641(Static44.aClass217_108);
			Static302.aClass3_Sub7_Sub1_2.method2622(Static416.anInt6831 << 28 | Static195.anInt3897 << 14 | Static214.anInt4101);
			Static67.aBoolean143 = false;
		}
		while (true) {
			@Pc(1412) Class3_Sub31 local1412;
			@Pc(1417) Class156 local1417;
			do {
				local1412 = (Class3_Sub31) Static196.aClass243_22.method5204();
				if (local1412 == null) {
					while (true) {
						do {
							local1412 = (Class3_Sub31) Static165.aClass243_20.method5204();
							if (local1412 == null) {
								while (true) {
									do {
										local1412 = (Class3_Sub31) Static221.aClass243_26.method5204();
										if (local1412 == null) {
											if (Static443.aClass156_8 == null) {
												Static31.anInt6062 = 0;
											}
											if (Static238.aClass156_9 != null) {
												Static251.method3749();
											}
											if (Static190.anInt3803 > 0 && Static263.aClass10_1.method301(82) && Static263.aClass10_1.method301(81) && Static316.anInt5563 != 0) {
												local411 = Static379.aClass7_Sub2_Sub3_Sub2_2.aByte77 - Static316.anInt5563;
												if (local411 < 0) {
													local411 = 0;
												} else if (local411 > 3) {
													local411 = 3;
												}
												Static399.method5127(Static223.anInt7618 + Static379.aClass7_Sub2_Sub3_Sub2_2.anIntArray287[0], Static57.anInt5085 + Static379.aClass7_Sub2_Sub3_Sub2_2.anIntArray288[0], local411);
											}
											Static221.method3340();
											for (local411 = 0; local411 < 5; local411++) {
												@Pc(1615) int local1615 = Static75.anIntArray109[local411]++;
											}
											if (Static321.aBoolean480 && Static5.aLong3 < Static118.method1934() - 60000L) {
												method775();
											}
											Static136.anInt2884++;
											if (Static136.anInt2884 > 500) {
												Static136.anInt2884 = 0;
												local137 = (int) (Math.random() * 8.0D);
												if ((local137 & 0x2) == 2) {
													Static1.anInt13 += Static312.anInt5523;
												}
												if ((local137 & 0x4) == 4) {
													Static179.anInt5783 += Static316.anInt5557;
												}
												if ((local137 & 0x1) == 1) {
													Static128.anInt2672 += Static20.anInt678;
												}
											}
											if (Static128.anInt2672 < -50) {
												Static20.anInt678 = 2;
											}
											if (Static1.anInt13 < -55) {
												Static312.anInt5523 = 2;
											}
											if (Static128.anInt2672 > 50) {
												Static20.anInt678 = -2;
											}
											if (Static179.anInt5783 < -40) {
												Static316.anInt5557 = 1;
											}
											if (Static1.anInt13 > 55) {
												Static312.anInt5523 = -2;
											}
											Static28.anInt887++;
											if (Static179.anInt5783 > 40) {
												Static316.anInt5557 = -1;
											}
											if (Static28.anInt887 > 500) {
												Static28.anInt887 = 0;
												local137 = (int) (Math.random() * 8.0D);
												if ((local137 & 0x2) == 2) {
													Static341.anInt5790 += Static47.anInt1173;
												}
												if ((local137 & 0x1) == 1) {
													Static20.anInt696 += Static145.anInt6068;
												}
											}
											if (Static20.anInt696 < -60) {
												Static145.anInt6068 = 2;
											}
											if (Static341.anInt5790 < -20) {
												Static47.anInt1173 = 1;
											}
											if (Static20.anInt696 > 60) {
												Static145.anInt6068 = -2;
											}
											Static44.anInt7273++;
											if (Static341.anInt5790 > 10) {
												Static47.anInt1173 = -1;
											}
											if (Static44.anInt7273 > 50) {
												Static30.method641(Static53.aClass217_23);
											}
											if (Static94.aBoolean175) {
												Static158.method2545();
												Static94.aBoolean175 = false;
											}
											try {
												if (Static88.aClass251_2 != null && Static302.aClass3_Sub7_Sub1_2.anInt3235 > 0) {
													Static295.anInt5288 += Static302.aClass3_Sub7_Sub1_2.anInt3235;
													Static88.aClass251_2.method5344(Static302.aClass3_Sub7_Sub1_2.aByteArray46, Static302.aClass3_Sub7_Sub1_2.anInt3235);
													Static44.anInt7273 = 0;
													Static302.aClass3_Sub7_Sub1_2.anInt3235 = 0;
													return;
												}
												return;
											} catch (@Pc(1820) IOException local1820) {
												Static92.method1686();
												return;
											}
										}
										local1417 = local1412.aClass156_11;
										if (local1417.anInt4868 < 0) {
											break;
										}
										local823 = Static435.method5705(local1417.anInt4839);
									} while (local823 == null || local823.aClass156Array2 == null || local823.aClass156Array2.length <= local1417.anInt4868 || local823.aClass156Array2[local1417.anInt4868] != local1417);
									Static285.method4059(local1412);
								}
							}
							local1417 = local1412.aClass156_11;
							if (local1417.anInt4868 < 0) {
								break;
							}
							local823 = Static435.method5705(local1417.anInt4839);
						} while (local823 == null || local823.aClass156Array2 == null || local1417.anInt4868 >= local823.aClass156Array2.length || local1417 != local823.aClass156Array2[local1417.anInt4868]);
						Static285.method4059(local1412);
					}
				}
				local1417 = local1412.aClass156_11;
				if (local1417.anInt4868 < 0) {
					break;
				}
				local823 = Static435.method5705(local1417.anInt4839);
			} while (local823 == null || local823.aClass156Array2 == null || local823.aClass156Array2.length <= local1417.anInt4868 || local1417 != local823.aClass156Array2[local1417.anInt4868]);
			Static285.method4059(local1412);
		}
	}
}
