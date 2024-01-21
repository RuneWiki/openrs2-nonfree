import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!kd", name = "gb", descriptor = "Lclient!ab;")
	public static Class3_Sub1_Sub1_Sub1 aClass3_Sub1_Sub1_Sub1_20;

	@OriginalMember(owner = "client!kd", name = "hb", descriptor = "Lclient!kd;")
	public static Class3_Sub8 aClass3_Sub8_5;

	@OriginalMember(owner = "client!kd", name = "Lb", descriptor = "J")
	public static long aLong79;

	@OriginalMember(owner = "client!kd", name = "F", descriptor = "Lclient!v;")
	private static Class62 aClass62_1238 = Static45.method753("Username: ");

	@OriginalMember(owner = "client!kd", name = "pb", descriptor = "Lclient!v;")
	private static Class62 aClass62_1245 = Static45.method753("Moderator option: Mute player for 48 hours: <OFF>");

	@OriginalMember(owner = "client!kd", name = "I", descriptor = "Lclient!v;")
	public static Class62 aClass62_1239 = aClass62_1245;

	@OriginalMember(owner = "client!kd", name = "Q", descriptor = "Lclient!v;")
	public static Class62 aClass62_1240 = Static45.method753(" hat sich ausgeloggt)3");

	@OriginalMember(owner = "client!kd", name = "Ob", descriptor = "Lclient!v;")
	private static Class62 aClass62_1248 = Static45.method753("Report abuse");

	@OriginalMember(owner = "client!kd", name = "T", descriptor = "Lclient!v;")
	public static Class62 aClass62_1241 = aClass62_1248;

	@OriginalMember(owner = "client!kd", name = "X", descriptor = "Lclient!v;")
	public static Class62 aClass62_1242 = Static45.method753("Lade Titelbild )2 ");

	@OriginalMember(owner = "client!kd", name = "Y", descriptor = "Lclient!jb;")
	public static Class34 aClass34_33 = new Class34(64);

	@OriginalMember(owner = "client!kd", name = "kb", descriptor = "Lclient!v;")
	private static Class62 aClass62_1243 = Static45.method753("level)2");

	@OriginalMember(owner = "client!kd", name = "mb", descriptor = "Lclient!v;")
	public static Class62 aClass62_1244 = Static45.method753("blinken2:");

	@OriginalMember(owner = "client!kd", name = "xb", descriptor = "Lclient!v;")
	public static Class62 aClass62_1246 = aClass62_1243;

	@OriginalMember(owner = "client!kd", name = "Bb", descriptor = "I")
	public static int anInt2739 = 0;

	@OriginalMember(owner = "client!kd", name = "Mb", descriptor = "Lclient!v;")
	public static Class62 aClass62_1247 = aClass62_1238;

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(I[BI)I")
	public static int method1776(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		return Static6.method167(0, arg1, arg0);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!kd;IIIBIII)V")
	public static void method1783(@OriginalArg(0) Class3_Sub8 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(34) int local34;
		if (arg1 < 0 || arg1 >= 104 || arg6 < 0 || arg6 >= 104) {
			while (true) {
				local34 = arg0.method1803();
				if (local34 == 0) {
					return;
				}
				if (local34 == 1) {
					arg0.method1803();
					return;
				}
				if (local34 <= 49) {
					arg0.method1803();
				}
			}
			return;
		}
		Static44.aByteArrayArrayArray6[arg3][arg1][arg6] = 0;
		while (true) {
			local34 = arg0.method1803();
			if (local34 == 0) {
				if (arg3 == 0) {
					Static79.anIntArrayArrayArray4[0][arg1][arg6] = -Static75.method1218(arg4 + arg6 + 556238, arg5 + arg1 + 932731) * 8;
					return;
				} else {
					Static79.anIntArrayArrayArray4[arg3][arg1][arg6] = Static79.anIntArrayArrayArray4[arg3 - 1][arg1][arg6] - 240;
					return;
				}
			}
			if (local34 == 1) {
				@Pc(126) int local126 = arg0.method1803();
				if (local126 == 1) {
					local126 = 0;
				}
				if (arg3 == 0) {
					Static79.anIntArrayArrayArray4[0][arg1][arg6] = -local126 * 8;
					return;
				}
				Static79.anIntArrayArrayArray4[arg3][arg1][arg6] = Static79.anIntArrayArrayArray4[arg3 - 1][arg1][arg6] - local126 * 8;
				return;
			}
			if (local34 <= 49) {
				Static10.aByteArrayArrayArray11[arg3][arg1][arg6] = arg0.method1765();
				Static27.aByteArrayArrayArray5[arg3][arg1][arg6] = (byte) ((local34 - 2) / 4);
				Static100.aByteArrayArrayArray15[arg3][arg1][arg6] = (byte) (arg2 + local34 - 2 & 0x3);
			} else if (local34 <= 81) {
				Static44.aByteArrayArrayArray6[arg3][arg1][arg6] = (byte) (local34 - 49);
			} else {
				Static16.aByteArrayArrayArray3[arg3][arg1][arg6] = (byte) (local34 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Z)V")
	public static void method1799() {
		if (Static12.aClass29_1 != null) {
			@Pc(3) Class29 local3 = Static12.aClass29_1;
			synchronized (Static12.aClass29_1) {
				Static12.aClass29_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILclient!v;Lclient!mb;Lclient!v;)Lclient!vb;")
	public static Class3_Sub1_Sub1_Sub4 method1800(@OriginalArg(1) Class62 arg0, @OriginalArg(2) Class42 arg1, @OriginalArg(3) Class62 arg2) {
		@Pc(8) int local8 = arg1.method1521(arg2);
		@Pc(14) int local14 = arg1.method1498(arg0, local8);
		return Static61.method1026(arg1, local8, local14);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
	public static String method1805(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(10) String local10;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(15) RuntimeException_Sub1 local15 = (RuntimeException_Sub1) arg0;
			arg0 = local15.aThrowable1;
			local10 = local15.aString1 + " | ";
		} else {
			local10 = "";
		}
		@Pc(32) StringWriter local32 = new StringWriter();
		@Pc(37) PrintWriter local37 = new PrintWriter(local32);
		arg0.printStackTrace(local37);
		local37.close();
		@Pc(45) String local45 = local32.toString();
		@Pc(53) BufferedReader local53 = new BufferedReader(new StringReader(local45));
		@Pc(56) String local56 = local53.readLine();
		while (true) {
			while (true) {
				@Pc(59) String local59 = local53.readLine();
				if (local59 == null) {
					return local10 + "| " + local56;
				}
				@Pc(65) int local65 = local59.indexOf(40);
				@Pc(72) int local72 = local59.indexOf(41, local65 + 1);
				if (local65 >= 0 && local72 >= 0) {
					@Pc(86) String local86 = local59.substring(local65 + 1, local72);
					@Pc(90) int local90 = local86.indexOf(".java:");
					if (local90 >= 0) {
						local86 = local86.substring(0, local90) + local86.substring(local90 + 5);
						local10 = local10 + local86 + ' ';
						continue;
					}
					local59 = local59.substring(0, local65);
				}
				local59 = local59.trim();
				local59 = local59.substring(local59.lastIndexOf(32) + 1);
				local59 = local59.substring(local59.lastIndexOf(9) + 1);
				local10 = local10 + local59 + ' ';
			}
		}
	}

	@OriginalMember(owner = "client!kd", name = "i", descriptor = "(B)V")
	public static void method1809() {
		aClass3_Sub1_Sub1_Sub1_20 = null;
		aClass62_1244 = null;
		aClass62_1238 = null;
		aClass62_1245 = null;
		aClass62_1240 = null;
		aClass62_1241 = null;
		aClass62_1242 = null;
		aClass62_1243 = null;
		aClass3_Sub8_5 = null;
		aClass62_1239 = null;
		aClass62_1246 = null;
		aClass62_1247 = null;
		aClass34_33 = null;
		aClass62_1248 = null;
	}
}
