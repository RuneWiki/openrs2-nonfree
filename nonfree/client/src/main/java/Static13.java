import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!be", name = "z", descriptor = "[Z")
	public static boolean[] aBooleanArray4;

	@OriginalMember(owner = "client!be", name = "u", descriptor = "Lclient!ed;")
	private static Class23 aClass23_163 = Static169.method2903("You have only just left another world)3");

	@OriginalMember(owner = "client!be", name = "J", descriptor = "Lclient!ed;")
	private static Class23 aClass23_165 = Static169.method2903("Error connecting to server)3");

	@OriginalMember(owner = "client!be", name = "B", descriptor = "Lclient!ed;")
	public static Class23 aClass23_164 = aClass23_165;

	@OriginalMember(owner = "client!be", name = "L", descriptor = "Lclient!ed;")
	public static Class23 aClass23_166 = Static169.method2903(":tradereq:");

	@OriginalMember(owner = "client!be", name = "M", descriptor = "I")
	public static int anInt453 = 0;

	@OriginalMember(owner = "client!be", name = "N", descriptor = "Lclient!ed;")
	public static Class23 aClass23_167 = Static169.method2903("Ihr Charakter)2Profil wird in:");

	@OriginalMember(owner = "client!be", name = "P", descriptor = "Lclient!ed;")
	public static Class23 aClass23_168 = Static169.method2903(" weitere Optionen");

	@OriginalMember(owner = "client!be", name = "R", descriptor = "Lclient!ed;")
	public static Class23 aClass23_169 = Static169.method2903("<col=ffb000>");

	@OriginalMember(owner = "client!be", name = "T", descriptor = "Lclient!ed;")
	private static Class23 aClass23_170 = Static169.method2903("cyan:");

	@OriginalMember(owner = "client!be", name = "U", descriptor = "Lclient!ed;")
	public static Class23 aClass23_171 = aClass23_170;

	@OriginalMember(owner = "client!be", name = "V", descriptor = "Lclient!ed;")
	public static Class23 aClass23_172 = aClass23_163;

	@OriginalMember(owner = "client!be", name = "X", descriptor = "Lclient!ed;")
	public static Class23 aClass23_173 = aClass23_170;

	@OriginalMember(owner = "client!be", name = "bb", descriptor = "J")
	public static volatile long aLong15 = 0L;

	@OriginalMember(owner = "client!be", name = "fb", descriptor = "Lclient!ed;")
	public static Class23 aClass23_174 = Static169.method2903("Clientscript error in: ");

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(B)V")
	public static void method250() {
		aClass23_165 = null;
		aClass23_169 = null;
		aClass23_170 = null;
		aClass23_168 = null;
		aClass23_166 = null;
		aClass23_171 = null;
		aClass23_173 = null;
		aClass23_174 = null;
		aClass23_163 = null;
		aBooleanArray4 = null;
		aClass23_172 = null;
		aClass23_164 = null;
		aClass23_167 = null;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(II)Lclient!vd;")
	public static Class1_Sub1_Sub16 method251(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub1_Sub16 local10 = (Class1_Sub1_Sub16) Static113.aClass79_16.method2657((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static110.aClass30_39.method1301(13, arg0);
		local10 = new Class1_Sub1_Sub16();
		local10.anInt4152 = arg0;
		if (local20 != null) {
			local10.method2921(new Class1_Sub8(local20));
		}
		Static113.aClass79_16.method2658((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(BLjava/lang/Throwable;)Ljava/lang/String;")
	public static String method252(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(24) String local24;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(11) RuntimeException_Sub1 local11 = (RuntimeException_Sub1) arg0;
			arg0 = local11.aThrowable1;
			local24 = local11.aString5 + " | ";
		} else {
			local24 = "";
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
					return local24 + "| " + local61;
				}
				@Pc(70) int local70 = local64.indexOf(40);
				@Pc(77) int local77 = local64.indexOf(41, local70 + 1);
				if (local70 >= 0 && local77 >= 0) {
					@Pc(91) String local91 = local64.substring(local70 + 1, local77);
					@Pc(95) int local95 = local91.indexOf(".java:");
					if (local95 >= 0) {
						local91 = local91.substring(0, local95) + local91.substring(local95 + 5);
						local24 = local24 + local91 + ' ';
						continue;
					}
					local64 = local64.substring(0, local70);
				}
				local64 = local64.trim();
				local64 = local64.substring(local64.lastIndexOf(32) + 1);
				local64 = local64.substring(local64.lastIndexOf(9) + 1);
				local24 = local24 + local64 + ' ';
			}
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(BLclient!qd;)V")
	public static void method253(@OriginalArg(1) Class67 arg0) {
		Static128.aClass67_1 = arg0;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IBI)I")
	public static int method254(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = 0;
		while (arg1 > 0) {
			arg1--;
			local12 = arg0 & 0x1 | local12 << 1;
			arg0 >>>= 0x1;
		}
		return local12;
	}
}
