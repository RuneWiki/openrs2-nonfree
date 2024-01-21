import java.awt.Canvas;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!ba", name = "P", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas1;

	@OriginalMember(owner = "client!ba", name = "U", descriptor = "Z")
	public static boolean aBoolean23;

	@OriginalMember(owner = "client!ba", name = "A", descriptor = "Lclient!qd;")
	public static Class63 aClass63_3 = new Class63(64);

	@OriginalMember(owner = "client!ba", name = "F", descriptor = "[Lclient!tb;")
	public static Class72[] aClass72Array1 = new Class72[50];

	@OriginalMember(owner = "client!ba", name = "X", descriptor = "Lclient!id;")
	private static Class34 aClass34_217 = Static9.method266("Attack");

	@OriginalMember(owner = "client!ba", name = "Q", descriptor = "Lclient!id;")
	public static Class34 aClass34_213 = aClass34_217;

	@OriginalMember(owner = "client!ba", name = "S", descriptor = "Lclient!id;")
	public static Class34 aClass34_214 = Static9.method266("Benutzername: ");

	@OriginalMember(owner = "client!ba", name = "T", descriptor = "I")
	public static int anInt425 = -1;

	@OriginalMember(owner = "client!ba", name = "V", descriptor = "Lclient!id;")
	public static Class34 aClass34_215 = Static9.method266("jolt");

	@OriginalMember(owner = "client!ba", name = "W", descriptor = "Lclient!id;")
	public static Class34 aClass34_216 = Static9.method266("<col=ffffff> )4 ");

	@OriginalMember(owner = "client!ba", name = "Y", descriptor = "I")
	public static int anInt426 = 255;

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(BLjava/lang/Throwable;)Ljava/lang/String;")
	public static String method251(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(10) String local10;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(15) RuntimeException_Sub1 local15 = (RuntimeException_Sub1) arg0;
			arg0 = local15.aThrowable1;
			local10 = local15.aString4 + " | ";
		} else {
			local10 = "";
		}
		@Pc(32) StringWriter local32 = new StringWriter();
		@Pc(45) PrintWriter local45 = new PrintWriter(local32);
		arg0.printStackTrace(local45);
		local45.close();
		@Pc(53) String local53 = local32.toString();
		@Pc(61) BufferedReader local61 = new BufferedReader(new StringReader(local53));
		@Pc(64) String local64 = local61.readLine();
		while (true) {
			while (true) {
				@Pc(67) String local67 = local61.readLine();
				if (local67 == null) {
					return local10 + "| " + local64;
				}
				@Pc(73) int local73 = local67.indexOf(40);
				@Pc(80) int local80 = local67.indexOf(41, local73 + 1);
				if (local73 >= 0 && local80 >= 0) {
					@Pc(97) String local97 = local67.substring(local73 + 1, local80);
					@Pc(101) int local101 = local97.indexOf(".java:");
					if (local101 >= 0) {
						local97 = local97.substring(0, local101) + local97.substring(local101 + 5);
						local10 = local10 + local97 + ' ';
						continue;
					}
					local67 = local67.substring(0, local73);
				}
				local67 = local67.trim();
				local67 = local67.substring(local67.lastIndexOf(32) + 1);
				local67 = local67.substring(local67.lastIndexOf(9) + 1);
				local10 = local10 + local67 + ' ';
			}
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(JI)V")
	public static void method252(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static114.anInt2736 >= 100) {
			Static39.method685(Static81.aClass34_1058, 0, Static3.aClass34_120);
			return;
		}
		@Pc(27) Class34 local27 = Static77.method1358(arg0).method969();
		for (@Pc(29) int local29 = 0; local29 < Static114.anInt2736; local29++) {
			if (arg0 == Static40.aLongArray3[local29]) {
				Static39.method685(Static81.aClass34_1058, 0, Static91.method1554(new Class34[] { local27, Static75.aClass34_1011 }));
				return;
			}
		}
		for (@Pc(64) int local64 = 0; local64 < Static90.anInt3112; local64++) {
			if (Static116.aLongArray6[local64] == arg0) {
				Static39.method685(Static81.aClass34_1058, 0, Static91.method1554(new Class34[] { Static96.aClass34_1229, local27, Static31.aClass34_452 }));
				return;
			}
		}
		if (local27.method986(Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.aClass34_97)) {
			Static39.method685(Static81.aClass34_1058, 0, Static47.aClass34_677);
		} else {
			Static40.aLongArray3[Static114.anInt2736++] = arg0;
			Static38.anInt1125 = Static70.anInt1848;
			Static21.aClass1_Sub19_Sub1_1.method2105(255);
			Static21.aClass1_Sub19_Sub1_1.method2073(arg0);
		}
	}

	@OriginalMember(owner = "client!ba", name = "d", descriptor = "(I)V")
	public static void method253() {
		aClass72Array1 = null;
		aClass34_213 = null;
		aCanvas1 = null;
		aClass34_215 = null;
		aClass34_217 = null;
		aClass34_216 = null;
		aClass63_3 = null;
		aClass34_214 = null;
	}
}
