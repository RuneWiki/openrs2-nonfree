import java.awt.Font;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!ad", name = "Q", descriptor = "[Lclient!re;")
	public static Class3_Sub1_Sub3_Sub4[] aClass3_Sub1_Sub3_Sub4Array1;

	@OriginalMember(owner = "client!ad", name = "V", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray1;

	@OriginalMember(owner = "client!ad", name = "kb", descriptor = "[[S")
	public static short[][] aShortArrayArray1;

	@OriginalMember(owner = "client!ad", name = "lb", descriptor = "Ljava/awt/Font;")
	public static Font aFont1;

	@OriginalMember(owner = "client!ad", name = "R", descriptor = "Lclient!sd;")
	public static Class73 aClass73_70 = Static122.method531("Fertigkeit)2");

	@OriginalMember(owner = "client!ad", name = "bb", descriptor = "Ljava/util/Calendar;")
	public static Calendar aCalendar1 = Calendar.getInstance();

	@OriginalMember(owner = "client!ad", name = "db", descriptor = "Lclient!b;")
	public static Class7 aClass7_2 = new Class7(100);

	@OriginalMember(owner = "client!ad", name = "eb", descriptor = "Lclient!sc;")
	public static Class72 aClass72_4 = new Class72();

	@OriginalMember(owner = "client!ad", name = "fb", descriptor = "I")
	public static int anInt106 = 0;

	@OriginalMember(owner = "client!ad", name = "gb", descriptor = "Lclient!sd;")
	private static Class73 aClass73_71 = Static122.method531("RuneScape is loading )2 please wait)3)3)3");

	@OriginalMember(owner = "client!ad", name = "hb", descriptor = "I")
	public static int anInt107 = 0;

	@OriginalMember(owner = "client!ad", name = "ib", descriptor = "Lclient!sd;")
	public static Class73 aClass73_72 = Static122.method531("Keine Antwort vom Anmelde)2Server)3");

	@OriginalMember(owner = "client!ad", name = "jb", descriptor = "Lclient!sd;")
	public static Class73 aClass73_73 = Static122.method531("Bitte warten Sie eine Minute");

	@OriginalMember(owner = "client!ad", name = "mb", descriptor = "Lclient!sd;")
	public static Class73 aClass73_74 = aClass73_71;

	@OriginalMember(owner = "client!ad", name = "pb", descriptor = "Lclient!sd;")
	private static Class73 aClass73_76 = Static122.method531(" ");

	@OriginalMember(owner = "client!ad", name = "nb", descriptor = "Lclient!sd;")
	public static Class73 aClass73_75 = aClass73_76;

	@OriginalMember(owner = "client!ad", name = "ob", descriptor = "I")
	public static volatile int anInt108 = -1;

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
	public static String method65(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(10) String local10;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(15) RuntimeException_Sub1 local15 = (RuntimeException_Sub1) arg0;
			local10 = local15.aString1 + " | ";
			arg0 = local15.aThrowable1;
		} else {
			local10 = "";
		}
		@Pc(37) StringWriter local37 = new StringWriter();
		@Pc(42) PrintWriter local42 = new PrintWriter(local37);
		arg0.printStackTrace(local42);
		local42.close();
		@Pc(50) String local50 = local37.toString();
		@Pc(58) BufferedReader local58 = new BufferedReader(new StringReader(local50));
		@Pc(61) String local61 = local58.readLine();
		while (true) {
			while (true) {
				@Pc(64) String local64 = local58.readLine();
				if (local64 == null) {
					return local10 + "| " + local61;
				}
				@Pc(70) int local70 = local64.indexOf(40);
				@Pc(77) int local77 = local64.indexOf(41, local70 + 1);
				if (local70 >= 0 && local77 >= 0) {
					@Pc(94) String local94 = local64.substring(local70 + 1, local77);
					@Pc(98) int local98 = local94.indexOf(".java:");
					if (local98 >= 0) {
						local94 = local94.substring(0, local98) + local94.substring(local98 + 5);
						local10 = local10 + local94 + ' ';
						continue;
					}
					local64 = local64.substring(0, local70);
				}
				local64 = local64.trim();
				local64 = local64.substring(local64.lastIndexOf(32) + 1);
				local64 = local64.substring(local64.lastIndexOf(9) + 1);
				local10 = local10 + local64 + ' ';
			}
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)V")
	public static void method67() {
		aClass7_2 = null;
		aClass3_Sub1_Sub3_Sub4Array1 = null;
		aClass73_75 = null;
		aShortArrayArray1 = null;
		aFont1 = null;
		aClass73_72 = null;
		aClass73_73 = null;
		aClass73_76 = null;
		anIntArrayArrayArray1 = null;
		aClass73_74 = null;
		aClass73_71 = null;
		aClass72_4 = null;
		aClass73_70 = null;
		aCalendar1 = null;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIIIZI)Lclient!re;")
	public static Class3_Sub1_Sub3_Sub4 method68(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		@Pc(19) long local19 = ((long) arg0 << 40) + ((long) arg2 << 38) + ((long) arg4 << 16) + (long) arg1;
		@Pc(31) Class3_Sub1_Sub3_Sub4 local31;
		if (!arg3) {
			local31 = (Class3_Sub1_Sub3_Sub4) Static129.aClass7_21.method183(local19);
			if (local31 != null) {
				return local31;
			}
		}
		@Pc(39) Class3_Sub1_Sub7 local39 = Static3.method42(arg1);
		if (arg4 > 1 && local39.anIntArray128 != null) {
			@Pc(49) int local49 = -1;
			for (@Pc(51) int local51 = 0; local51 < 10; local51++) {
				if (arg4 >= local39.anIntArray129[local51] && local39.anIntArray129[local51] != 0) {
					local49 = local39.anIntArray128[local51];
				}
			}
			if (local49 != -1) {
				local39 = Static3.method42(local49);
			}
		}
		@Pc(94) Class3_Sub1_Sub4_Sub5_Sub1 local94 = local39.method945();
		if (local94 == null) {
			return null;
		}
		@Pc(100) Class3_Sub1_Sub3_Sub4 local100 = null;
		if (local39.anInt1204 != -1) {
			local100 = method68(0, local39.anInt1222, 1, true, 10);
			if (local100 == null) {
				return null;
			}
		}
		@Pc(119) int[] local119 = Static15.anIntArray335;
		@Pc(127) int[] local127 = new int[4];
		@Pc(129) int local129 = Static15.anInt3218;
		@Pc(131) int local131 = Static15.anInt3216;
		Static15.method2309(local127);
		local31 = new Class3_Sub1_Sub3_Sub4(36, 32);
		Static15.method2295(local31.anIntArray336, 36, 32);
		Static15.method2305();
		Static36.method662();
		Static36.method652(16, 16);
		Static36.aBoolean53 = false;
		@Pc(154) int local154 = local39.anInt1244;
		if (arg3) {
			local154 = (int) ((double) local154 * 1.5D);
		} else if (arg2 == 2) {
			local154 = (int) ((double) local154 * 1.04D);
		}
		@Pc(182) int local182 = local154 * Class3_Sub1_Sub3_Sub2.anIntArray88[local39.anInt1229] >> 16;
		@Pc(191) int local191 = local154 * Class3_Sub1_Sub3_Sub2.anIntArray87[local39.anInt1229] >> 16;
		local94.method1880();
		local94.method1881(local39.anInt1218, local39.anInt1202, local39.anInt1229, local39.anInt1232, local191 + local39.anInt1217 - local94.aShort32 / 2, local182 - -local39.anInt1217);
		if (arg2 >= 1) {
			local31.method2336(1);
		}
		if (arg2 >= 2) {
			local31.method2336(16777215);
		}
		if (arg0 != 0) {
			local31.method2334(arg0);
		}
		Static15.method2295(local31.anIntArray336, 36, 32);
		if (local39.anInt1204 != -1) {
			local100.method2321(0, 0);
		}
		if (!arg3 && (local39.anInt1216 == 1 || arg4 != 1) && arg4 != -1) {
			Static119.aClass3_Sub1_Sub3_Sub1_Sub1_3.method1069(Static56.method983(arg4), 0, 9, 16776960, 1);
		}
		if (!arg3) {
			Static129.aClass7_21.method186(local31, local19);
		}
		Static15.method2295(local119, local129, local131);
		Static15.method2299(local127);
		Static36.method662();
		Static36.aBoolean53 = true;
		return local31;
	}
}
