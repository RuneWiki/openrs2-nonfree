import java.awt.Canvas;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!ff", name = "e", descriptor = "Lclient!ga;")
	public static Class29 aClass29_7;

	@OriginalMember(owner = "client!ff", name = "o", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas1;

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "I")
	public static int anInt1233 = 0;

	@OriginalMember(owner = "client!ff", name = "c", descriptor = "Lclient!rd;")
	private static Class63 aClass63_664 = Static80.method1463("Enter name of player to add to list");

	@OriginalMember(owner = "client!ff", name = "d", descriptor = "Lclient!rd;")
	private static Class63 aClass63_665 = Static80.method1463("Login limit exceeded)3");

	@OriginalMember(owner = "client!ff", name = "f", descriptor = "I")
	public static int anInt1235 = 0;

	@OriginalMember(owner = "client!ff", name = "g", descriptor = "[I")
	public static int[] anIntArray142 = new int[25];

	@OriginalMember(owner = "client!ff", name = "h", descriptor = "Lclient!rd;")
	public static Class63 aClass63_666 = Static80.method1463("Wen m-Ochten Sie von der Liste entfernen?");

	@OriginalMember(owner = "client!ff", name = "i", descriptor = "Lclient!rd;")
	public static Class63 aClass63_667 = Static80.method1463(" steht bereits auf Ihrer Ignorieren)2Liste(Q");

	@OriginalMember(owner = "client!ff", name = "k", descriptor = "Lclient!rd;")
	public static Class63 aClass63_668 = Static80.method1463("backleft1");

	@OriginalMember(owner = "client!ff", name = "l", descriptor = "Lclient!rd;")
	public static Class63 aClass63_669 = aClass63_664;

	@OriginalMember(owner = "client!ff", name = "m", descriptor = "Lclient!rd;")
	public static Class63 aClass63_670 = aClass63_665;

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)V")
	public static void method878() {
		aClass63_668 = null;
		aClass63_666 = null;
		aClass63_669 = null;
		aClass63_664 = null;
		anIntArray142 = null;
		aClass63_667 = null;
		aCanvas1 = null;
		aClass63_670 = null;
		aClass63_665 = null;
		aClass29_7 = null;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
	public static String method879(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(17) String local17;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(7) RuntimeException_Sub1 local7 = (RuntimeException_Sub1) arg0;
			local17 = local7.aString4 + " | ";
			arg0 = local7.aThrowable1;
		} else {
			local17 = "";
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
					return local17 + "| " + local61;
				}
				@Pc(70) int local70 = local64.indexOf(40);
				@Pc(77) int local77 = local64.indexOf(41, local70 + 1);
				if (local70 >= 0 && local77 >= 0) {
					@Pc(91) String local91 = local64.substring(local70 + 1, local77);
					@Pc(95) int local95 = local91.indexOf(".java:");
					if (local95 >= 0) {
						local91 = local91.substring(0, local95) + local91.substring(local95 + 5);
						local17 = local17 + local91 + ' ';
						continue;
					}
					local64 = local64.substring(0, local70);
				}
				local64 = local64.trim();
				local64 = local64.substring(local64.lastIndexOf(32) + 1);
				local64 = local64.substring(local64.lastIndexOf(9) + 1);
				local17 = local17 + local64 + ' ';
			}
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lclient!rd;I)V")
	public static void method880(@OriginalArg(0) Class63 arg0) {
		if (arg0 == null || arg0.method1811() == 0) {
			Static94.anInt2625 = 0;
			return;
		}
		@Pc(21) Class63 local21 = arg0;
		@Pc(24) Class63[] local24 = new Class63[100];
		@Pc(26) int local26 = 0;
		while (true) {
			@Pc(31) int local31 = local21.method1808();
			if (local31 == -1) {
				local21 = local21.method1833();
				if (local21.method1811() > 0) {
					local24[local26++] = local21.method1829();
				}
				Static94.anInt2625 = 0;
				label46: for (local31 = 0; local31 < Static58.anInt1730; local31++) {
					@Pc(100) Class6_Sub3_Sub8 local100 = Static91.method1664(local31);
					if (local100.anInt1386 == -1 && local100.aClass63_742 != null) {
						@Pc(115) Class63 local115 = local100.aClass63_742.method1829();
						for (@Pc(117) int local117 = 0; local117 < local26; local117++) {
							if (local115.method1805(local24[local117]) == -1) {
								continue label46;
							}
						}
						Static34.aClass63Array8[Static94.anInt2625] = local115;
						Static79.anIntArray244[Static94.anInt2625] = local31;
						Static94.anInt2625++;
						if (Static94.anInt2625 >= Static34.aClass63Array8.length) {
							return;
						}
					}
				}
				return;
			}
			@Pc(63) Class63 local63 = local21.method1820(local31, 0).method1833();
			if (local63.method1811() > 0) {
				local24[local26++] = local63.method1829();
			}
			local21 = local21.method1806(local31 + 1);
		}
	}
}
