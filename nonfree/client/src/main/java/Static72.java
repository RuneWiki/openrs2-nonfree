import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!p", name = "c", descriptor = "[I")
	public static int[] anIntArray195;

	@OriginalMember(owner = "client!p", name = "q", descriptor = "Lclient!md;")
	public static Class40_Sub1 aClass40_Sub1_27;

	@OriginalMember(owner = "client!p", name = "j", descriptor = "Lclient!rc;")
	private static Class55 aClass55_863 = Static34.method846("Loading )2 please wait)3");

	@OriginalMember(owner = "client!p", name = "a", descriptor = "Lclient!rc;")
	public static Class55 aClass55_861 = aClass55_863;

	@OriginalMember(owner = "client!p", name = "d", descriptor = "Lclient!rc;")
	public static Class55 aClass55_862 = Static34.method846("@whi@");

	@OriginalMember(owner = "client!p", name = "h", descriptor = "Z")
	public static boolean aBoolean99 = false;

	@OriginalMember(owner = "client!p", name = "m", descriptor = "Lclient!rc;")
	private static Class55 aClass55_865 = Static34.method846("Walk here");

	@OriginalMember(owner = "client!p", name = "l", descriptor = "Lclient!rc;")
	public static Class55 aClass55_864 = aClass55_865;

	@OriginalMember(owner = "client!p", name = "r", descriptor = "I")
	public static int anInt2120 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!p", name = "s", descriptor = "I")
	public static int anInt2121 = 0;

	@OriginalMember(owner = "client!p", name = "u", descriptor = "[[I")
	public static int[][] anIntArrayArray16 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(I)I")
	public static int method1427() {
		return 5;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Lclient!rc;Z)V")
	public static void method1428(@OriginalArg(0) Class55 arg0) {
		if (arg0 == null || arg0.method1674() == 0) {
			Static85.anInt2392 = 0;
			return;
		}
		@Pc(20) Class55[] local20 = new Class55[100];
		@Pc(26) Class55 local26 = arg0;
		@Pc(28) int local28 = 0;
		while (true) {
			@Pc(33) int local33 = local26.method1657();
			if (local33 == -1) {
				local26 = local26.method1654();
				if (local26.method1674() > 0) {
					local20[local28++] = local26.method1669();
				}
				Static85.anInt2392 = 0;
				label46: for (local33 = 0; local33 < Static74.anInt1806; local33++) {
					@Pc(93) Class6_Sub2_Sub5 local93 = Static58.method1195(local33);
					if (local93.anInt1091 == -1 && local93.aClass55_392 != null) {
						@Pc(106) Class55 local106 = local93.aClass55_392.method1669();
						for (@Pc(108) int local108 = 0; local108 < local28; local108++) {
							if (local106.method1645(local20[local108]) == -1) {
								continue label46;
							}
						}
						Static35.aClass55Array11[Static85.anInt2392] = local106;
						Static67.anIntArray187[Static85.anInt2392] = local33;
						Static85.anInt2392++;
						if (Static85.anInt2392 >= Static35.aClass55Array11.length) {
							return;
						}
					}
				}
				return;
			}
			@Pc(44) Class55 local44 = local26.method1671(0, local33).method1654();
			if (local44.method1674() > 0) {
				local20[local28++] = local44.method1669();
			}
			local26 = local26.method1673(local33 + 1);
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(B)V")
	public static void method1429() {
		aClass55_862 = null;
		anIntArray195 = null;
		anIntArrayArray16 = null;
		aClass55_864 = null;
		aClass55_865 = null;
		aClass55_861 = null;
		aClass55_863 = null;
		aClass40_Sub1_27 = null;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(II)V")
	public static void method1430(@OriginalArg(1) int arg0) {
		if (arg0 == -1 && Static46.anInt3212 == 0) {
			Static77.method1532();
		} else if (arg0 != -1 && Static6.anInt268 != arg0 && Static96.anInt2811 != 0 && Static46.anInt3212 == 0) {
			Static77.method1526(0, Static43.aClass40_Sub1_19, arg0, Static96.anInt2811);
		}
		Static6.anInt268 = arg0;
	}

	@OriginalMember(owner = "client!p", name = "b", descriptor = "(I)V")
	public static void method1431() {
		Static33.aClass36_16.method1155();
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
	public static String method1432(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(10) String local10;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(15) RuntimeException_Sub1 local15 = (RuntimeException_Sub1) arg0;
			local10 = local15.aString8 + " | ";
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
					@Pc(88) String local88 = local64.substring(local70 + 1, local77);
					@Pc(92) int local92 = local88.indexOf(".java:");
					if (local92 >= 0) {
						local88 = local88.substring(0, local92) + local88.substring(local92 + 5);
						local10 = local10 + local88 + ' ';
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
}
