import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!cd", name = "f", descriptor = "Lclient!qc;")
	private static Class60 aClass60_150 = Static121.method2047("Password: ");

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "Lclient!qc;")
	public static Class60 aClass60_149 = aClass60_150;

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "J")
	public static volatile long aLong12 = 0L;

	@OriginalMember(owner = "client!cd", name = "g", descriptor = "Lclient!qc;")
	public static Class60 aClass60_151 = Static121.method2047("<col=ffff00>");

	@OriginalMember(owner = "client!cd", name = "i", descriptor = "Ljava/util/zip/CRC32;")
	public static CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!cd", name = "q", descriptor = "Lclient!qc;")
	private static Class60 aClass60_156 = Static121.method2047("Please reload this page)3");

	@OriginalMember(owner = "client!cd", name = "j", descriptor = "Lclient!qc;")
	public static Class60 aClass60_152 = aClass60_156;

	@OriginalMember(owner = "client!cd", name = "k", descriptor = "I")
	public static int anInt440 = 0;

	@OriginalMember(owner = "client!cd", name = "l", descriptor = "Lclient!qc;")
	public static Class60 aClass60_153 = Static121.method2047("<col=ffff00>*V");

	@OriginalMember(owner = "client!cd", name = "n", descriptor = "Lclient!qc;")
	public static Class60 aClass60_154 = Static121.method2047("Standort");

	@OriginalMember(owner = "client!cd", name = "o", descriptor = "Lclient!qc;")
	public static Class60 aClass60_155 = Static121.method2047("Ein kostenloses Spielkonto erstellen)3");

	@OriginalMember(owner = "client!cd", name = "r", descriptor = "Lclient!qc;")
	private static Class60 aClass60_157 = Static121.method2047(" more options");

	@OriginalMember(owner = "client!cd", name = "s", descriptor = "I")
	public static int anInt443 = 0;

	@OriginalMember(owner = "client!cd", name = "t", descriptor = "Lclient!qc;")
	public static Class60 aClass60_158 = aClass60_157;

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(B)V")
	public static void method282() {
		aClass60_155 = null;
		aClass60_151 = null;
		aClass60_158 = null;
		aClass60_156 = null;
		aClass60_152 = null;
		aClass60_149 = null;
		aClass60_157 = null;
		aClass60_153 = null;
		aClass60_154 = null;
		aCRC32_1 = null;
		aClass60_150 = null;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IB)Lclient!q;")
	public static Class4_Sub17 method283(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0 & 0xFFFF;
		@Pc(11) int local11 = arg0 >> 16;
		if (Static82.aClass4_Sub17ArrayArray1[local11] == null || Static82.aClass4_Sub17ArrayArray1[local11][local7] == null) {
			@Pc(30) boolean local30 = Static27.method520(local11);
			if (!local30) {
				return null;
			}
		}
		return Static82.aClass4_Sub17ArrayArray1[local11][local7];
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(I[Lclient!m;II[BII)V")
	public static void method284(@OriginalArg(1) Class45[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11;
		for (@Pc(3) int local3 = 0; local3 < 4; local3++) {
			for (@Pc(7) int local7 = 0; local7 < 64; local7++) {
				for (local11 = 0; local11 < 64; local11++) {
					if (local7 + arg1 > 0 && local7 + arg1 < 103 && local11 + arg4 > 0 && local11 + arg4 < 103) {
						arg0[local3].anIntArrayArray15[arg1 + local7][arg4 + local11] &= 0xFEFFFFFF;
					}
				}
			}
		}
		@Pc(88) Class4_Sub13 local88 = new Class4_Sub13(arg3);
		for (local11 = 0; local11 < 4; local11++) {
			for (@Pc(98) int local98 = 0; local98 < 64; local98++) {
				for (@Pc(102) int local102 = 0; local102 < 64; local102++) {
					Static71.method1371(local102 + arg4, local88, arg1 + local98, arg5, 0, arg2, local11);
				}
			}
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(ILclient!qc;IIZ)V")
	public static void method285(@OriginalArg(0) int arg0, @OriginalArg(1) Class60 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class4_Sub17 local8 = Static23.method459(arg0, arg2);
		if (local8 == null) {
			return;
		}
		if (local8.anObjectArray19 != null) {
			@Pc(18) Class4_Sub16 local18 = new Class4_Sub16();
			local18.anObjectArray3 = local8.anObjectArray19;
			local18.aClass4_Sub17_9 = local8;
			local18.anInt1890 = arg3;
			local18.aClass60_744 = arg1;
			Static18.method296(local18);
		}
		@Pc(36) boolean local36 = true;
		if (local8.anInt2227 > 0) {
			local36 = Static29.method581(local8);
		}
		if (!local36 || !Static29.method579(Static73.method1384(local8), arg3 - 1)) {
			return;
		}
		if (arg3 == 1) {
			Static56.aClass4_Sub13_Sub1_1.method1265(213);
			Static56.aClass4_Sub13_Sub1_1.method1221(arg0);
			Static56.aClass4_Sub13_Sub1_1.method1252(arg2);
		}
		if (arg3 == 2) {
			Static56.aClass4_Sub13_Sub1_1.method1265(219);
			Static56.aClass4_Sub13_Sub1_1.method1221(arg0);
			Static56.aClass4_Sub13_Sub1_1.method1252(arg2);
		}
		if (arg3 == 3) {
			Static56.aClass4_Sub13_Sub1_1.method1265(33);
			Static56.aClass4_Sub13_Sub1_1.method1221(arg0);
			Static56.aClass4_Sub13_Sub1_1.method1252(arg2);
		}
		if (arg3 == 4) {
			Static56.aClass4_Sub13_Sub1_1.method1265(25);
			Static56.aClass4_Sub13_Sub1_1.method1221(arg0);
			Static56.aClass4_Sub13_Sub1_1.method1252(arg2);
		}
		if (arg3 == 5) {
			Static56.aClass4_Sub13_Sub1_1.method1265(180);
			Static56.aClass4_Sub13_Sub1_1.method1221(arg0);
			Static56.aClass4_Sub13_Sub1_1.method1252(arg2);
		}
		if (arg3 == 6) {
			Static56.aClass4_Sub13_Sub1_1.method1265(205);
			Static56.aClass4_Sub13_Sub1_1.method1221(arg0);
			Static56.aClass4_Sub13_Sub1_1.method1252(arg2);
		}
		if (arg3 == 7) {
			Static56.aClass4_Sub13_Sub1_1.method1265(57);
			Static56.aClass4_Sub13_Sub1_1.method1221(arg0);
			Static56.aClass4_Sub13_Sub1_1.method1252(arg2);
		}
		if (arg3 == 8) {
			Static56.aClass4_Sub13_Sub1_1.method1265(245);
			Static56.aClass4_Sub13_Sub1_1.method1221(arg0);
			Static56.aClass4_Sub13_Sub1_1.method1252(arg2);
		}
		if (arg3 == 9) {
			Static56.aClass4_Sub13_Sub1_1.method1265(241);
			Static56.aClass4_Sub13_Sub1_1.method1221(arg0);
			Static56.aClass4_Sub13_Sub1_1.method1252(arg2);
		}
		if (arg3 == 10) {
			Static56.aClass4_Sub13_Sub1_1.method1265(232);
			Static56.aClass4_Sub13_Sub1_1.method1221(arg0);
			Static56.aClass4_Sub13_Sub1_1.method1252(arg2);
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Z)J")
	public static synchronized long method286() {
		@Pc(5) long local5 = System.currentTimeMillis();
		if (Static33.aLong30 > local5) {
			Static83.aLong72 += Static33.aLong30 - local5;
		}
		Static33.aLong30 = local5;
		return Static83.aLong72 + local5;
	}
}
