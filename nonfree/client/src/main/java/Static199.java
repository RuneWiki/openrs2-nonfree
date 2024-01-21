import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static199 {

	@OriginalMember(owner = "client!vb", name = "I", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray17;

	@OriginalMember(owner = "client!vb", name = "w", descriptor = "Lclient!bg;")
	public static final Class13 aClass13_18 = new Class13();

	@OriginalMember(owner = "client!vb", name = "y", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_1447 = Static151.method2243("-5berpr-Ufen Sie Ihr Mitteilungsfach)3");

	@OriginalMember(owner = "client!vb", name = "C", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_1448 = Static151.method2243("<col=ffb000>");

	@OriginalMember(owner = "client!vb", name = "E", descriptor = "[I")
	public static final int[] anIntArray373 = new int[32768];

	@OriginalMember(owner = "client!vb", name = "G", descriptor = "I")
	public static int anInt4167 = 0;

	@OriginalMember(owner = "client!vb", name = "L", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_1449 = Static151.method2243("Ablegen");

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
	public static String method2923(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(21) String local21;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(11) RuntimeException_Sub1 local11 = (RuntimeException_Sub1) arg0;
			local21 = local11.aString1 + " | ";
			arg0 = local11.aThrowable1;
		} else {
			local21 = "";
		}
		@Pc(32) StringWriter local32 = new StringWriter();
		@Pc(37) PrintWriter local37 = new PrintWriter(local32);
		arg0.printStackTrace(local37);
		local37.close();
		@Pc(45) String local45 = local32.toString();
		@Pc(58) BufferedReader local58 = new BufferedReader(new StringReader(local45));
		@Pc(61) String local61 = local58.readLine();
		while (true) {
			while (true) {
				@Pc(64) String local64 = local58.readLine();
				if (local64 == null) {
					return local21 + "| " + local61;
				}
				@Pc(70) int local70 = local64.indexOf(40);
				@Pc(77) int local77 = local64.indexOf(41, local70 + 1);
				if (local70 >= 0 && local77 >= 0) {
					@Pc(91) String local91 = local64.substring(local70 + 1, local77);
					@Pc(95) int local95 = local91.indexOf(".java:");
					if (local95 >= 0) {
						local91 = local91.substring(0, local95) + local91.substring(local95 + 5);
						local21 = local21 + local91 + ' ';
						continue;
					}
					local64 = local64.substring(0, local70);
				}
				local64 = local64.trim();
				local64 = local64.substring(local64.lastIndexOf(32) + 1);
				local64 = local64.substring(local64.lastIndexOf(9) + 1);
				local21 = local21 + local64 + ' ';
			}
		}
	}

	@OriginalMember(owner = "client!vb", name = "d", descriptor = "(I)Lclient!rd;")
	public static Class42_Sub1 method2924() {
		@Pc(25) Class42_Sub1 local25 = new Class42_Sub1(Static138.anInt2900, Static127.anInt2808, Static19.anIntArray38[0], Static25.anIntArray57[0], Static86.anIntArray298[0], Static138.anIntArray256[0], Static8.aByteArrayArray1[0], Static108.anIntArray222);
		Static169.method2456();
		return local25;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lclient!pb;I)V")
	public static void method2925(@OriginalArg(0) Class71 arg0) {
		Static134.aClass71_26 = arg0;
	}
}
