import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!lb", name = "r", descriptor = "I")
	public static int anInt1656;

	@OriginalMember(owner = "client!lb", name = "w", descriptor = "Lclient!bf;")
	public static Class11 aClass11_36;

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "Lclient!ae;")
	public static Class5 aClass5_776 = Static56.method972("Bitte versuchen Sie es erneut)3");

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "Lclient!ae;")
	private static Class5 aClass5_777 = Static56.method972("Moderator option: Mute player for 48 hours: <ON>");

	@OriginalMember(owner = "client!lb", name = "d", descriptor = "Lclient!ae;")
	public static Class5 aClass5_778 = Static56.method972("gelb:");

	@OriginalMember(owner = "client!lb", name = "g", descriptor = "I")
	public static int anInt1650 = 0;

	@OriginalMember(owner = "client!lb", name = "h", descriptor = "I")
	public static int anInt1651 = 0;

	@OriginalMember(owner = "client!lb", name = "i", descriptor = "Lclient!ae;")
	public static Class5 aClass5_779 = Static56.method972("leuchten3:");

	@OriginalMember(owner = "client!lb", name = "j", descriptor = "Lclient!ae;")
	public static Class5 aClass5_780 = aClass5_777;

	@OriginalMember(owner = "client!lb", name = "k", descriptor = "J")
	public static long aLong52 = 0L;

	@OriginalMember(owner = "client!lb", name = "l", descriptor = "Lclient!ae;")
	private static Class5 aClass5_781 = Static56.method972("Enter name of friend to delete from list");

	@OriginalMember(owner = "client!lb", name = "m", descriptor = "I")
	public static int anInt1652 = 0;

	@OriginalMember(owner = "client!lb", name = "p", descriptor = "Lclient!ae;")
	public static Class5 aClass5_782 = aClass5_781;

	@OriginalMember(owner = "client!lb", name = "q", descriptor = "I")
	public static int anInt1655 = 0;

	@OriginalMember(owner = "client!lb", name = "u", descriptor = "Lclient!ae;")
	public static Class5 aClass5_783 = Static56.method972("Bitte versuchen Sie)1");

	@OriginalMember(owner = "client!lb", name = "z", descriptor = "[I")
	public static int[] anIntArray200 = new int[256];

	@OriginalMember(owner = "client!lb", name = "A", descriptor = "Lclient!ae;")
	public static Class5 aClass5_784 = Static56.method972("Bitte wenden Sie sich an den Kundendienst)3");

	@OriginalMember(owner = "client!lb", name = "C", descriptor = "Z")
	public static boolean aBoolean77 = false;

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(II)Lclient!wa;")
	public static Class3_Sub1_Sub18 method1063(@OriginalArg(1) int arg0) {
		@Pc(10) Class3_Sub1_Sub18 local10 = (Class3_Sub1_Sub18) Static5.aClass9_6.method282((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(24) byte[] local24 = Static70.aClass11_40.method1882(13, arg0);
		local10 = new Class3_Sub1_Sub18();
		local10.anInt2940 = arg0;
		if (local24 != null) {
			local10.method1936(new Class3_Sub6(local24));
		}
		Static5.aClass9_6.method284(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)V")
	public static void method1064() {
		if (Static26.aString3.toLowerCase().indexOf("microsoft") != -1) {
			Static57.anIntArray182[189] = 26;
			Static57.anIntArray182[192] = 58;
			Static57.anIntArray182[187] = 27;
			Static57.anIntArray182[186] = 57;
			Static57.anIntArray182[221] = 43;
			Static57.anIntArray182[220] = 74;
			Static57.anIntArray182[188] = 71;
			Static57.anIntArray182[190] = 72;
			Static57.anIntArray182[222] = 59;
			Static57.anIntArray182[191] = 73;
			Static57.anIntArray182[223] = 28;
			Static57.anIntArray182[219] = 42;
			return;
		}
		Static57.anIntArray182[45] = 26;
		Static57.anIntArray182[61] = 27;
		if (Static26.aMethod1 == null) {
			Static57.anIntArray182[222] = 59;
			Static57.anIntArray182[192] = 58;
		} else {
			Static57.anIntArray182[520] = 59;
			Static57.anIntArray182[192] = 28;
			Static57.anIntArray182[222] = 58;
		}
		Static57.anIntArray182[44] = 71;
		Static57.anIntArray182[91] = 42;
		Static57.anIntArray182[47] = 73;
		Static57.anIntArray182[59] = 57;
		Static57.anIntArray182[92] = 74;
		Static57.anIntArray182[46] = 72;
		Static57.anIntArray182[93] = 43;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lclient!te;I)Z")
	public static boolean method1065(@OriginalArg(0) Class3_Sub1_Sub17 arg0) {
		if (arg0.anIntArray301 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < arg0.anIntArray301.length; local12++) {
			@Pc(27) int local27 = Static113.method1942(local12, arg0);
			@Pc(32) int local32 = arg0.anIntArray304[local12];
			if (arg0.anIntArray301[local12] == 2) {
				if (local32 <= local27) {
					return false;
				}
			} else if (arg0.anIntArray301[local12] == 3) {
				if (local32 >= local27) {
					return false;
				}
			} else if (arg0.anIntArray301[local12] == 4) {
				if (local27 == local32) {
					return false;
				}
			} else if (local27 != local32) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Ljava/lang/Throwable;B)Ljava/lang/String;")
	public static String method1066(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(20) String local20;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(7) RuntimeException_Sub1 local7 = (RuntimeException_Sub1) arg0;
			arg0 = local7.aThrowable1;
			local20 = local7.aString1 + " | ";
		} else {
			local20 = "";
		}
		@Pc(32) StringWriter local32 = new StringWriter();
		@Pc(37) PrintWriter local37 = new PrintWriter(local32);
		arg0.printStackTrace(local37);
		local37.close();
		@Pc(52) String local52 = local32.toString();
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
					@Pc(90) String local90 = local66.substring(local72 + 1, local79);
					@Pc(94) int local94 = local90.indexOf(".java:");
					if (local94 >= 0) {
						local90 = local90.substring(0, local94) + local90.substring(local94 + 5);
						local20 = local20 + local90 + ' ';
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

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)V")
	public static void method1069() {
		Static75.aClass9_19.method283();
		Static58.aClass9_16.method283();
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(I)V")
	public static void method1070() {
		if (Static114.aClass45_1 != null) {
			@Pc(7) Class45 local7 = Static114.aClass45_1;
			synchronized (Static114.aClass45_1) {
				Static114.aClass45_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIII)V")
	public static void method1071(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class3_Sub13 local8 = (Class3_Sub13) Static15.aClass21_4.method459((long) arg1);
		if (local8 == null) {
			local8 = new Class3_Sub13();
			Static15.aClass21_4.method452((long) arg1, local8);
		}
		if (local8.anIntArray379.length <= arg0) {
			@Pc(38) int[] local38 = new int[arg0 + 1];
			@Pc(43) int[] local43 = new int[arg0 + 1];
			for (@Pc(45) int local45 = 0; local45 < local8.anIntArray379.length; local45++) {
				local38[local45] = local8.anIntArray379[local45];
				local43[local45] = local8.anIntArray378[local45];
			}
			for (@Pc(71) int local71 = local8.anIntArray379.length; local71 < arg0; local71++) {
				local38[local71] = -1;
				local43[local71] = 0;
			}
			local8.anIntArray378 = local43;
			local8.anIntArray379 = local38;
		}
		local8.anIntArray379[arg0] = arg2;
		local8.anIntArray378[arg0] = arg3;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Z)V")
	public static void method1072() {
		aClass5_780 = null;
		aClass11_36 = null;
		aClass5_781 = null;
		aClass5_776 = null;
		aClass5_783 = null;
		aClass5_777 = null;
		anIntArray200 = null;
		aClass5_778 = null;
		aClass5_779 = null;
		aClass5_784 = null;
		aClass5_782 = null;
	}
}
