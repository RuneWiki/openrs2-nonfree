import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!ff", name = "pb", descriptor = "I")
	public static int anInt1156;

	@OriginalMember(owner = "client!ff", name = "X", descriptor = "Ljava/util/zip/CRC32;")
	public static CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!ff", name = "jb", descriptor = "Lclient!kd;")
	public static Class39 aClass39_534 = Static108.method1915("@cr2@");

	@OriginalMember(owner = "client!ff", name = "kb", descriptor = "[I")
	public static int[] anIntArray166 = new int[50];

	@OriginalMember(owner = "client!ff", name = "lb", descriptor = "I")
	public static int anInt1155 = 0;

	@OriginalMember(owner = "client!ff", name = "sb", descriptor = "Lclient!kd;")
	public static Class39 aClass39_540 = Static108.method1915("");

	@OriginalMember(owner = "client!ff", name = "mb", descriptor = "Lclient!kd;")
	public static Class39 aClass39_535 = aClass39_540;

	@OriginalMember(owner = "client!ff", name = "nb", descriptor = "Lclient!kd;")
	public static Class39 aClass39_536 = Static108.method1915("<col=ff3000>");

	@OriginalMember(owner = "client!ff", name = "ob", descriptor = "Lclient!kd;")
	public static Class39 aClass39_537 = Static108.method1915("Wen m-Ochten Sie von der Liste entfernen?");

	@OriginalMember(owner = "client!ff", name = "qb", descriptor = "Lclient!kd;")
	public static Class39 aClass39_538 = aClass39_540;

	@OriginalMember(owner = "client!ff", name = "rb", descriptor = "Lclient!kd;")
	public static Class39 aClass39_539 = Static108.method1915("Standort");

	@OriginalMember(owner = "client!ff", name = "tb", descriptor = "Z")
	public static volatile boolean aBoolean103 = false;

	@OriginalMember(owner = "client!ff", name = "ub", descriptor = "Lclient!kd;")
	public static Class39 aClass39_541 = aClass39_540;

	@OriginalMember(owner = "client!ff", name = "vb", descriptor = "I")
	public static int anInt1157 = 0;

	@OriginalMember(owner = "client!ff", name = "wb", descriptor = "Lclient!kd;")
	public static Class39 aClass39_542 = aClass39_540;

	@OriginalMember(owner = "client!ff", name = "xb", descriptor = "I")
	public static int anInt1158 = -1;

	@OriginalMember(owner = "client!ff", name = "yb", descriptor = "Lclient!kd;")
	public static Class39 aClass39_543 = Static108.method1915("null");

	@OriginalMember(owner = "client!ff", name = "zb", descriptor = "Lclient!kd;")
	public static Class39 aClass39_544 = aClass39_540;

	@OriginalMember(owner = "client!ff", name = "Ab", descriptor = "I")
	public static int anInt1159 = 0;

	@OriginalMember(owner = "client!ff", name = "Bb", descriptor = "Lclient!kd;")
	public static Class39 aClass39_545 = Static108.method1915("Hidden)2use");

	@OriginalMember(owner = "client!ff", name = "Cb", descriptor = "[Lclient!r;")
	public static Class1_Sub1_Sub2_Sub1_Sub2[] aClass1_Sub1_Sub2_Sub1_Sub2Array1 = new Class1_Sub1_Sub2_Sub1_Sub2[2048];

	@OriginalMember(owner = "client!ff", name = "Db", descriptor = "Lclient!kd;")
	public static Class39 aClass39_546 = aClass39_540;

	@OriginalMember(owner = "client!ff", name = "c", descriptor = "(I)V")
	public static void method687() {
		Static65.method1176();
		Static36.method648();
		Static23.method450();
		Static107.method1891();
		Static76.method1311();
		Static17.method329();
		Static40.method703();
		Static126.method2122();
		Static43.method767();
		Static24.method457();
		Static71.method1243();
		Static62.method2040();
		((Class47) Static27.anInterface1_1).method1289();
		Static63.aClass33_23.method1034();
		Static40.aClass62_Sub1_32.method2010();
		Static129.aClass62_Sub1_77.method2010();
		Static34.aClass62_Sub1_28.method2010();
		Static103.aClass62_Sub1_66.method2010();
		Static126.aClass62_Sub1_75.method2010();
		Static77.aClass62_Sub1_53.method2010();
		Static120.aClass62_Sub1_76.method2010();
		Static4.aClass62_Sub1_7.method2010();
		Static35.aClass62_Sub1_29.method2010();
		Static9.aClass62_Sub1_73.method2010();
		Static29.aClass62_Sub1_24.method2010();
		Static75.aClass62_Sub1_50.method2010();
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lclient!kd;Lclient!kd;ILclient!kd;)V")
	public static void method688(@OriginalArg(0) Class39 arg0, @OriginalArg(1) Class39 arg1, @OriginalArg(3) Class39 arg2) {
		aClass39_544 = arg1;
		aClass39_541 = arg2;
		aClass39_538 = arg0;
	}

	@OriginalMember(owner = "client!ff", name = "d", descriptor = "(I)V")
	public static void method689() {
		if (Static65.aBooleanArray8[96]) {
			Static40.anInt1168 += (-Static40.anInt1168 - 24) / 2;
		} else if (Static65.aBooleanArray8[97]) {
			Static40.anInt1168 += (24 - Static40.anInt1168) / 2;
		} else {
			Static40.anInt1168 /= 2;
		}
		Static51.anInt1408 = Static40.anInt1168 / 2 + Static51.anInt1408 & 0x7FF;
		@Pc(48) int local48 = Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt2521 + Static35.anInt1068;
		@Pc(54) int local54 = Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt2508 + Static53.anInt1466;
		if (Static53.anInt1464 - local48 < -500 || Static53.anInt1464 - local48 > 500 || Static45.anInt1255 - local54 < -500 || Static45.anInt1255 - local54 > 500) {
			Static53.anInt1464 = local48;
			Static45.anInt1255 = local54;
		}
		if (Static53.anInt1464 != local48) {
			Static53.anInt1464 += (local48 - Static53.anInt1464) / 16;
		}
		if (Static65.aBooleanArray8[98]) {
			Static48.anInt1317 += (12 - Static48.anInt1317) / 2;
		} else if (Static65.aBooleanArray8[99]) {
			Static48.anInt1317 += (-Static48.anInt1317 - 12) / 2;
		} else {
			Static48.anInt1317 /= 2;
		}
		Static76.anInt1920 += Static48.anInt1317 / 2;
		@Pc(152) int local152 = Static53.anInt1464 >> 7;
		if (Static45.anInt1255 != local54) {
			Static45.anInt1255 += (local54 - Static45.anInt1255) / 16;
		}
		if (Static76.anInt1920 < 128) {
			Static76.anInt1920 = 128;
		}
		if (Static76.anInt1920 > 383) {
			Static76.anInt1920 = 383;
		}
		@Pc(182) int local182 = Static45.anInt1255 >> 7;
		@Pc(188) int local188 = Static62.method2035(Static9.anInt2983, Static53.anInt1464, Static45.anInt1255);
		@Pc(190) int local190 = 0;
		@Pc(208) int local208;
		if (local152 > 3 && local182 > 3 && local152 < 100 && local182 < 100) {
			for (local208 = local152 - 4; local208 <= local152 + 4; local208++) {
				for (@Pc(214) int local214 = local182 - 4; local214 <= local182 + 4; local214++) {
					@Pc(218) int local218 = Static9.anInt2983;
					if (local218 < 3 && (Static51.aByteArrayArrayArray3[1][local208][local214] & 0x2) == 2) {
						local218++;
					}
					@Pc(243) int local243 = local188 - Static51.anIntArrayArrayArray6[local218][local208][local214];
					if (local243 > local190) {
						local190 = local243;
					}
				}
			}
		}
		local208 = local190 * 192;
		if (local208 > 98048) {
			local208 = 98048;
		}
		if (local208 < 32768) {
			local208 = 32768;
		}
		if (Static23.anInt810 < local208) {
			Static23.anInt810 += (local208 - Static23.anInt810) / 24;
		} else if (local208 < Static23.anInt810) {
			Static23.anInt810 += (local208 - Static23.anInt810) / 80;
		}
	}

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "(Z)V")
	public static void method691() {
		aClass39_537 = null;
		aClass39_546 = null;
		aClass39_544 = null;
		aCRC32_1 = null;
		anIntArray166 = null;
		aClass39_536 = null;
		aClass39_540 = null;
		aClass1_Sub1_Sub2_Sub1_Sub2Array1 = null;
		aClass39_535 = null;
		aClass39_545 = null;
		aClass39_543 = null;
		aClass39_539 = null;
		aClass39_534 = null;
		aClass39_541 = null;
		aClass39_542 = null;
		aClass39_538 = null;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIIIB)I")
	public static int method692(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(21) int local21 = 65536 - Class1_Sub1_Sub4_Sub2.anIntArray142[arg0 * 1024 / arg1] >> 1;
		return (arg2 * (65536 - local21) >> 16) + (local21 * arg3 >> 16);
	}
}
