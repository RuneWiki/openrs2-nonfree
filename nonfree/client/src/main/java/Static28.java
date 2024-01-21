import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!e", name = "db", descriptor = "Lclient!ff;")
	public static Class11 aClass11_38;

	@OriginalMember(owner = "client!e", name = "S", descriptor = "I")
	public static int anInt2308 = 0;

	@OriginalMember(owner = "client!e", name = "V", descriptor = "I")
	public static int anInt2311 = -1;

	@OriginalMember(owner = "client!e", name = "Y", descriptor = "I")
	public static int anInt2314 = 0;

	@OriginalMember(owner = "client!e", name = "Z", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger11 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!e", name = "bb", descriptor = "I")
	public static int anInt2316 = -1;

	@OriginalMember(owner = "client!e", name = "cb", descriptor = "I")
	public static int anInt2317 = 0;

	@OriginalMember(owner = "client!e", name = "eb", descriptor = "Lclient!wd;")
	public static Class80 aClass80_908 = Static2.method59("Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(II)Lclient!wd;")
	public static Class80 method1422(@OriginalArg(1) int arg0) {
		return Static121.method1964(false, arg0);
	}

	@OriginalMember(owner = "client!e", name = "e", descriptor = "(B)V")
	public static void method1424() {
		Static56.anInt1718 = 0;
		Static120.aClass2_Sub17_Sub1_3.anInt2799 = 0;
		Static63.anInt1818 = 0;
		Static100.aClass2_Sub17_Sub1_1.anInt2799 = 0;
		Static65.anInt1843 = 0;
		Static103.anInt2679 = 0;
		Static119.anInt1678 = 0;
		Static9.anInt255 = -1;
		Static10.anInt298 = -1;
		Static122.aBoolean241 = false;
		Static88.anInt2152 = -1;
		Static39.anInt699 = 0;
		Static79.anInt2023 = -1;
		for (@Pc(40) int local40 = 0; local40 < Static114.aClass2_Sub1_Sub1_Sub4_Sub2Array1.length; local40++) {
			if (Static114.aClass2_Sub1_Sub1_Sub4_Sub2Array1[local40] != null) {
				Static114.aClass2_Sub1_Sub1_Sub4_Sub2Array1[local40].anInt2319 = -1;
			}
		}
		for (@Pc(58) int local58 = 0; local58 < Static35.aClass2_Sub1_Sub1_Sub4_Sub1Array1.length; local58++) {
			if (Static35.aClass2_Sub1_Sub1_Sub4_Sub1Array1[local58] != null) {
				Static35.aClass2_Sub1_Sub1_Sub4_Sub1Array1[local58].anInt2319 = -1;
			}
		}
		Static15.method252();
		Static10.method167(30);
	}

	@OriginalMember(owner = "client!e", name = "f", descriptor = "(B)V")
	public static void method1426() {
		aClass80_908 = null;
		aBigInteger11 = null;
		aClass11_38 = null;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
	public static String method1427(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(20) String local20;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(7) RuntimeException_Sub1 local7 = (RuntimeException_Sub1) arg0;
			arg0 = local7.aThrowable1;
			local20 = local7.aString2 + " | ";
		} else {
			local20 = "";
		}
		@Pc(28) StringWriter local28 = new StringWriter();
		@Pc(37) PrintWriter local37 = new PrintWriter(local28);
		arg0.printStackTrace(local37);
		local37.close();
		@Pc(52) String local52 = local28.toString();
		@Pc(60) BufferedReader local60 = new BufferedReader(new StringReader(local52));
		@Pc(63) String local63 = local60.readLine();
		while (true) {
			while (true) {
				@Pc(66) String local66 = local60.readLine();
				if (local66 == null) {
					return local20 + "| " + local63;
				}
				@Pc(72) int local72 = local66.indexOf(40);
				@Pc(79) int local79 = local66.indexOf(41, local72 + 1);
				if (local72 >= 0 && local79 >= 0) {
					@Pc(93) String local93 = local66.substring(local72 + 1, local79);
					@Pc(97) int local97 = local93.indexOf(".java:");
					if (local97 >= 0) {
						local93 = local93.substring(0, local97) + local93.substring(local97 + 5);
						local20 = local20 + local93 + ' ';
						continue;
					}
					local66 = local66.substring(0, local72);
				}
				local66 = local66.trim();
				local66 = local66.substring(local66.lastIndexOf(32) + 1);
				local66 = local66.substring(local66.lastIndexOf(9) + 1);
				local20 = local20 + local66 + ' ';
			}
		}
	}
}
