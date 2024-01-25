import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static245 {

	@OriginalMember(owner = "client!qj", name = "x", descriptor = "I")
	public static int anInt1074;

	@OriginalMember(owner = "client!qj", name = "N", descriptor = "Lclient!uq;")
	public static Class202 aClass202_2;

	@OriginalMember(owner = "client!qj", name = "R", descriptor = "Z")
	private static boolean aBoolean69;

	@OriginalMember(owner = "client!qj", name = "S", descriptor = "Z")
	private static boolean aBoolean70;

	@OriginalMember(owner = "client!qj", name = "T", descriptor = "Z")
	private static boolean aBoolean71;

	@OriginalMember(owner = "client!qj", name = "U", descriptor = "Z")
	private static boolean aBoolean72;

	@OriginalMember(owner = "client!qj", name = "n", descriptor = "Lclient!cr;")
	public static final Class37 aClass37_20 = new Class37(4);

	@OriginalMember(owner = "client!qj", name = "J", descriptor = "I")
	public static int anInt1086 = 0;

	@OriginalMember(owner = "client!qj", name = "L", descriptor = "Ljava/lang/String;")
	public static String aString37 = "Please remove ";

	@OriginalMember(owner = "client!qj", name = "M", descriptor = "Z")
	public static boolean aBoolean67 = false;

	@OriginalMember(owner = "client!qj", name = "providesignlink", descriptor = "(Lclient!wd;)V")
	private static void method821(@OriginalArg(0) Class215 arg0) {
		Static197.aClass215_5 = arg0;
		Static123.aClass215_7 = arg0;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(IZZIJ)Ljava/lang/String;")
	public static String method822(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) long arg3) {
		@Pc(7) char local7 = ',';
		@Pc(9) char local9 = '.';
		if (arg0 == 0) {
			local9 = ',';
			local7 = '.';
		}
		if (arg0 == 2) {
			local9 = ' ';
		}
		@Pc(27) boolean local27 = false;
		if (arg3 < 0L) {
			arg3 = -arg3;
			local27 = true;
		}
		@Pc(43) StringBuffer local43 = new StringBuffer(26);
		@Pc(52) int local52;
		@Pc(57) int local57;
		if (arg2 > 0) {
			for (local52 = 0; local52 < arg2; local52++) {
				local57 = (int) arg3;
				arg3 /= 10L;
				local43.append((char) (local57 + 48 - (int) arg3 * 10));
			}
			local43.append(local7);
		}
		local52 = 0;
		while (true) {
			local57 = (int) arg3;
			arg3 /= 10L;
			local43.append((char) (local57 + 48 - (int) arg3 * 10));
			if (arg3 == 0L) {
				if (local27) {
					local43.append('-');
				}
				return local43.reverse().toString();
			}
			if (arg1) {
				local52++;
				if (local52 % 3 == 0) {
					local43.append(local9);
				}
			}
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(III)I")
	public static int method823(@OriginalArg(1) int arg0) {
		if (arg0 == -1) {
			return 12345678;
		}
		@Pc(24) int local24 = (arg0 & 0x7F) * 96 >> 7;
		if (local24 < 2) {
			local24 = 2;
		} else if (local24 > 126) {
			local24 = 126;
		}
		return (arg0 & 0xFF80) + local24;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(BIIII)V")
	public static void method824(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class1_Sub2_Sub15 local8 = Static17.method307(8, arg3);
		local8.method4783();
		local8.anInt5458 = arg0;
		local8.anInt5467 = arg2;
		local8.anInt5461 = arg1;
	}

	@OriginalMember(owner = "client!qj", name = "b", descriptor = "(I)I")
	public static int method827() {
		return ((Static4.anInt39 == 0 ? 0 : 1) << 21) + ((Static138.aBoolean522 ? 1 : 0) << 19) + (Static313.anInt6232 << 17) + ((Static329.aBoolean533 ? 1 : 0) << 9) + ((Static341.aBoolean543 ? 1 : 0) << 5) + ((Static278.aBoolean473 ? 1 : 0) << 3) + (Static182.anInt3805 & 0x7) + ((Static211.aBoolean353 ? 1 : 0) << 4) + ((Static42.aBoolean75 ? 1 : 0) << 6) + ((Static266.aBoolean458 ? 1 : 0) << 8) + ((Static221.aBoolean375 ? 1 : 0) << 10) + ((Static256.anInt5260 & 0x3) << 11) + ((Static50.aBoolean83 ? 1 : 0) << 13) + ((Static347.aBoolean550 ? 1 : 0) << 15) - (-((Static168.aBoolean267 ? 1 : 0) << 16) - ((Static119.anInt2298 == 0 ? 0 : 1) << 20)) + ((Static142.anInt2788 == 0 ? 0 : 1) << 22) + (Static268.method4820() << 23) + (Static182.anInt3809 << 25) + ((Static5.aBoolean9 ? 1 : 0) << 27) + (Static248.anInt26 << 28);
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(IZ)Z")
	public static boolean method832(@OriginalArg(0) int arg0) {
		@Pc(7) Class127_Sub1 local7 = Static345.method5772(arg0);
		if (local7 == null) {
			return false;
		} else if (Static343.anInt6573 == 3) {
			@Pc(43) String local43 = "";
			if (Static217.anInt951 != 0) {
				local43 = ":" + (local7.anInt6390 + 7000);
			}
			@Pc(58) String local58 = "";
			if (Static59.aString51 != null) {
				local58 = "/p=" + Static59.aString51;
			}
			@Pc(107) String local107 = "http://" + local7.aString250 + local43 + "/l=" + Static331.anInt3763 + "/a=" + Static76.anInt1569 + local58 + "/j" + (Static129.aBoolean209 ? "1" : "0") + ",o" + (Static182.aBoolean289 ? "1" : "0") + ",a2";
			try {
				Static71.aClient1.getAppletContext().showDocument(new URL(local107), "_self");
				return true;
			} catch (@Pc(117) Exception local117) {
				return false;
			}
		} else {
			Static35.anInt877 = local7.anInt6390;
			Static351.aString149 = local7.aString250;
			if (Static217.anInt951 != 0) {
				Static149.anInt3069 = Static35.anInt877 + 50000;
				Static214.anInt4553 = Static35.anInt877 + 40000;
				Static29.anInt544 = Static214.anInt4553;
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "()V")
	public static void method839() {
		for (@Pc(1) int local1 = 0; local1 < Static44.anInt1171; local1++) {
			@Pc(6) Class10_Sub1 local6 = Static51.aClass10_Sub1Array1[local1];
			Static269.method4851(local6);
			Static51.aClass10_Sub1Array1[local1] = null;
		}
		Static44.anInt1171 = 0;
	}
}
