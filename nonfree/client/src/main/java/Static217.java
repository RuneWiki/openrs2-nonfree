import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static217 {

	@OriginalMember(owner = "client!qh", name = "eb", descriptor = "Lclient!ug;")
	public static Class1_Sub2_Sub14 aClass1_Sub2_Sub14_6;

	@OriginalMember(owner = "client!qh", name = "fb", descriptor = "Lclient!kb;")
	public static Class83 aClass83_145;

	@OriginalMember(owner = "client!qh", name = "T", descriptor = "Ljava/lang/String;")
	public static String aString150 = "Loaded input handler";

	@OriginalMember(owner = "client!qh", name = "W", descriptor = "I")
	public static int anInt4819 = -1;

	@OriginalMember(owner = "client!qh", name = "bb", descriptor = "[Z")
	public static boolean[] aBooleanArray20 = new boolean[100];

	@OriginalMember(owner = "client!qh", name = "db", descriptor = "Lclient!pm;")
	public static Class125 aClass125_4 = new Class125(64);

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "()V")
	public static void method3825() {
		for (@Pc(1) int local1 = 0; local1 < Static38.anInt1149; local1++) {
			@Pc(8) Class152 local8 = Static178.aClass152Array3[local1];
			Static89.method1539(local8);
			Static178.aClass152Array3[local1] = null;
		}
		Static38.anInt1149 = 0;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(BILclient!ch;II)V")
	public static void method3826(@OriginalArg(1) int arg0, @OriginalArg(2) Class30 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(14) Class1_Sub5 local14 = (Class1_Sub5) Static130.aClass131_6.method3791(); local14 != null; local14 = (Class1_Sub5) Static130.aClass131_6.method3792()) {
			if (arg0 == local14.anInt1231 && local14.anInt1224 == arg3 * 128 && local14.anInt1223 == arg2 * 128 && arg1.anInt875 == local14.aClass30_1.anInt875) {
				if (local14.aClass1_Sub3_Sub4_2 != null) {
					Static245.aClass1_Sub3_Sub1_2.method520(local14.aClass1_Sub3_Sub4_2);
					local14.aClass1_Sub3_Sub4_2 = null;
				}
				if (local14.aClass1_Sub3_Sub4_1 != null) {
					Static245.aClass1_Sub3_Sub1_2.method520(local14.aClass1_Sub3_Sub4_1);
					local14.aClass1_Sub3_Sub4_1 = null;
				}
				local14.method4742();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(BI)Lclient!pl;")
	public static Class124 method3828(@OriginalArg(1) int arg0) {
		@Pc(12) Class124 local12 = (Class124) Static199.aClass155_37.method4358((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(32) byte[] local32 = Static262.aClass83_186.method2306(32, arg0);
		local12 = new Class124();
		if (local32 != null) {
			local12.method3658(new Class1_Sub16(local32));
		}
		local12.method3657();
		Static199.aClass155_37.method4360((long) arg0, local12);
		return local12;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/Throwable;)V")
	public static void method3829(@OriginalArg(0) String arg0, @OriginalArg(2) Throwable arg1) {
		try {
			@Pc(7) String local7 = "";
			if (arg1 != null) {
				local7 = Static102.method1687(arg1);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					local7 = local7 + " | ";
				}
				local7 = local7 + arg0;
			}
			Static251.method4276(local7);
			local7 = Static143.method2587(":", local7, "%3a");
			local7 = Static143.method2587("@", local7, "%40");
			local7 = Static143.method2587("&", local7, "%26");
			local7 = Static143.method2587("#", local7, "%23");
			if (Static70.aClass66_3.anApplet1 == null) {
				return;
			}
			@Pc(104) Class43 local104 = Static70.aClass66_3.method1611(new URL(Static70.aClass66_3.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static139.anInt6125 + "&u=" + Static31.aLong36 + "&v1=" + Static93.aString66 + "&v2=" + Static93.aString62 + "&e=" + local7));
			while (local104.anInt1456 == 0) {
				Static230.method4022(1L);
			}
			if (local104.anInt1456 == 1) {
				@Pc(129) DataInputStream local129 = (DataInputStream) local104.anObject3;
				local129.read();
				local129.close();
			}
		} catch (@Pc(136) Exception local136) {
		}
	}
}
