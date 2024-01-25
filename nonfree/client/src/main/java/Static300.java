import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static300 {

	@OriginalMember(owner = "client!tg", name = "r", descriptor = "I")
	public static int anInt5966;

	@OriginalMember(owner = "client!tg", name = "o", descriptor = "Ljava/lang/String;")
	public static String aString221 = "Discard";

	@OriginalMember(owner = "client!tg", name = "p", descriptor = "J")
	public static volatile long aLong186 = 0L;

	@OriginalMember(owner = "client!tg", name = "q", descriptor = "I")
	public static int anInt5965 = 0;

	@OriginalMember(owner = "client!tg", name = "w", descriptor = "Ljava/lang/String;")
	public static String aString222 = "Loaded title screen";

	@OriginalMember(owner = "client!tg", name = "F", descriptor = "Ljava/lang/String;")
	public static String aString223 = "Attack";

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
	public static String method5079(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(16) String local16;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(21) RuntimeException_Sub1 local21 = (RuntimeException_Sub1) arg0;
			arg0 = local21.aThrowable1;
			local16 = local21.aString163 + " | ";
		} else {
			local16 = "";
		}
		@Pc(38) StringWriter local38 = new StringWriter();
		@Pc(43) PrintWriter local43 = new PrintWriter(local38);
		arg0.printStackTrace(local43);
		local43.close();
		@Pc(51) String local51 = local38.toString();
		@Pc(59) BufferedReader local59 = new BufferedReader(new StringReader(local51));
		@Pc(62) String local62 = local59.readLine();
		while (true) {
			@Pc(65) String local65 = local59.readLine();
			if (local65 == null) {
				return local16 + "| " + local62;
			}
			@Pc(71) int local71 = local65.indexOf(40);
			@Pc(78) int local78 = local65.indexOf(41, local71 + 1);
			@Pc(83) String local83;
			if (local71 == -1) {
				local83 = local65;
			} else {
				local83 = local65.substring(0, local71);
			}
			local83 = local83.trim();
			local83 = local83.substring(local83.lastIndexOf(32) + 1);
			local83 = local83.substring(local83.lastIndexOf(9) + 1);
			local16 = local16 + local83;
			if (local71 != -1 && local78 != -1) {
				@Pc(130) int local130 = local65.indexOf(".java:", local71);
				if (local130 >= 0) {
					local16 = local16 + local65.substring(local130 + 5, local78);
				}
			}
			local16 = local16 + ' ';
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(Ljava/lang/String;ZBLclient!os;)V")
	public static void method5080(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Class120 arg2) {
		@Pc(25) int local25 = Static303.aClass209_9.method5515(null, arg0, 250);
		@Pc(34) int local34 = Static303.aClass209_9.method5509(250, arg0, null) * 13;
		Static212.aClass122_2.method4732(6, 6, local25 + 8, local34 - -8, -16777216, 0);
		Static212.aClass122_2.method4728(6, 6, local25 + 8, local34 - -4 + 4, -1, 0);
		arg2.method5538(10, local34, 0, -1, arg0, null, 10, 0, 1, null, 1, null, -1, local25, 0);
		Static171.method2843(local34 + 4 + 4, local25 + 8, 6, 6);
		if (arg1) {
			Static212.aClass122_2.method4789();
		}
	}

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "(B)V")
	public static void method5081() {
		@Pc(1) Class198 local1 = Static37.aClass198_60;
		synchronized (Static37.aClass198_60) {
			Static37.aClass198_60.method5230();
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lclient!ir;B)V")
	public static void method5082(@OriginalArg(0) Class100 arg0) {
		Static171.aClass100_73 = arg0;
	}

	@OriginalMember(owner = "client!tg", name = "d", descriptor = "(III)Z")
	public static boolean method5084(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!Static168.aBoolean192) {
			return false;
		}
		@Pc(13) int local13 = arg0 >> 16;
		@Pc(22) int local22 = arg0 & 0xFFFF;
		if (Static311.aClass181ArrayArray1[local13] == null || Static311.aClass181ArrayArray1[local13][local22] == null) {
			return false;
		}
		@Pc(40) Class181 local40 = Static311.aClass181ArrayArray1[local13][local22];
		@Pc(51) Class3_Sub26 local51;
		if (arg1 == -1 && local40.anInt5715 == 0) {
			for (local51 = (Class3_Sub26) Static116.aClass127_12.method3402(); local51 != null; local51 = (Class3_Sub26) Static116.aClass127_12.method3400()) {
				if (local51.anInt2734 == 51 || local51.anInt2734 == 1008 || local51.anInt2734 == 50 || local51.anInt2734 == 6 || local51.anInt2734 == 59) {
					for (@Pc(84) Class181 local84 = Static20.method415(local51.anInt2736); local84 != null; local84 = Static268.method4552(local84)) {
						if (local40.anInt5761 == local84.anInt5761) {
							return true;
						}
					}
				}
			}
		} else {
			for (local51 = (Class3_Sub26) Static116.aClass127_12.method3402(); local51 != null; local51 = (Class3_Sub26) Static116.aClass127_12.method3400()) {
				if (arg1 == local51.anInt2737 && local40.anInt5761 == local51.anInt2736 && (local51.anInt2734 == 51 || local51.anInt2734 == 1008 || local51.anInt2734 == 50 || local51.anInt2734 == 6 || local51.anInt2734 == 59)) {
					return true;
				}
			}
		}
		return false;
	}
}
