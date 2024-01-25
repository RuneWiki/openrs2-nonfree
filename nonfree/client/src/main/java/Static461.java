import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static461 {

	@OriginalMember(owner = "client!wt", name = "d", descriptor = "J")
	public static long aLong399;

	@OriginalMember(owner = "client!wt", name = "k", descriptor = "Lclient!bw;")
	public static Class34 aClass34_1;

	@OriginalMember(owner = "client!wt", name = "l", descriptor = "I")
	public static int anInt7751;

	@OriginalMember(owner = "client!wt", name = "b", descriptor = "Lclient!bi;")
	public static final Class25 aClass25_183 = new Class25(89, 8);

	@OriginalMember(owner = "client!wt", name = "g", descriptor = "I")
	public static int anInt7748 = 0;

	@OriginalMember(owner = "client!wt", name = "h", descriptor = "Lclient!qu;")
	public static final Class208 aClass208_108 = new Class208(67, 2);

	@OriginalMember(owner = "client!wt", name = "i", descriptor = "I")
	public static int anInt7749 = 0;

	@OriginalMember(owner = "client!wt", name = "j", descriptor = "I")
	public static int anInt7750 = 0;

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(BLclient!mn;)I")
	public static int method6251(@OriginalArg(1) Class171 arg0) {
		@Pc(10) int local10 = 0;
		if (arg0.method3666(Static308.anInt5543)) {
			local10++;
		}
		if (arg0.method3666(Static57.anInt1031)) {
			local10++;
		}
		if (arg0.method3666(Static249.anInt4281)) {
			local10++;
		}
		if (arg0.method3666(Static405.anInt7035)) {
			local10++;
		}
		if (arg0.method3666(Static184.anInt3247)) {
			local10++;
		}
		if (arg0.method3666(Static141.anInt7049)) {
			local10++;
		}
		if (arg0.method3666(Static152.anInt2781)) {
			local10++;
		}
		if (arg0.method3666(Static422.anInt3433)) {
			local10++;
		}
		if (arg0.method3666(Static132.anInt2510)) {
			local10++;
		}
		if (arg0.method3666(Static171.anInt5501)) {
			local10++;
		}
		if (arg0.method3666(Static210.anInt3598)) {
			local10++;
		}
		if (arg0.method3666(Static246.anInt4249)) {
			local10++;
		}
		if (arg0.method3666(Static242.anInt4127)) {
			local10++;
		}
		if (arg0.method3666(Static324.anInt5803)) {
			local10++;
		}
		if (arg0.method3666(Static184.anInt3248)) {
			local10++;
		}
		if (arg0.method3666(Static22.anInt422)) {
			local10++;
		}
		return local10;
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(I)V")
	public static void method6252() {
		Static377.anInt6585 = 0;
		Static93.aClass181_7.method3969();
		Static93.aClass181_7.method3973(Static375.aClass2_Sub35_2);
		Static377.anInt6585++;
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method6254(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(20) int local20 = 0; local20 < local8; local20++) {
			@Pc(26) char local26 = arg0.charAt(local20);
			if (local26 == '<' || local26 == '>') {
				local10 += 3;
			}
		}
		@Pc(53) StringBuffer local53 = new StringBuffer(local8 + local10);
		for (@Pc(55) int local55 = 0; local55 < local8; local55++) {
			@Pc(61) char local61 = arg0.charAt(local55);
			if (local61 == '<') {
				local53.append("<lt>");
			} else if (local61 == '>') {
				local53.append("<gt>");
			} else {
				local53.append(local61);
			}
		}
		return local53.toString();
	}
}
