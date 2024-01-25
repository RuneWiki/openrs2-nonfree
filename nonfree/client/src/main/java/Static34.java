import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!c", name = "e", descriptor = "Lclient!ij;")
	public static Class93 aClass93_12;

	@OriginalMember(owner = "client!c", name = "i", descriptor = "[I")
	public static int[] anIntArray70;

	@OriginalMember(owner = "client!c", name = "j", descriptor = "I")
	public static int anInt643;

	@OriginalMember(owner = "client!c", name = "d", descriptor = "Z")
	public static boolean aBoolean42 = true;

	@OriginalMember(owner = "client!c", name = "h", descriptor = "[Z")
	public static final boolean[] aBooleanArray5 = new boolean[100];

	@OriginalMember(owner = "client!c", name = "k", descriptor = "[I")
	public static final int[] anIntArray71 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIZ)Lclient!g;")
	public static Class5_Sub18 method567(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(12) Class5_Sub18 local12 = new Class5_Sub18();
		local12.anInt1866 = arg1;
		local12.anInt1871 = arg0;
		Static198.aClass190_21.method5464(local12, (long) arg2);
		Static8.method170(arg0);
		@Pc(31) Class201 local31 = Static262.method4616(arg2);
		if (local31 != null) {
			Static189.method3383(local31);
		}
		if (Static208.aClass201_9 != null) {
			Static189.method3383(Static208.aClass201_9);
			Static208.aClass201_9 = null;
		}
		Static160.method2837();
		if (local31 != null) {
			Static172.method4060(!arg3, local31);
		}
		if (!arg3) {
			Static108.method1909(arg0);
		}
		if (!arg3 && Static32.anInt628 != -1) {
			Static123.method2173(1, Static32.anInt628);
		}
		return local12;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
	public static String method568(@OriginalArg(0) String arg0) {
		@Pc(11) int local11 = arg0.length();
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = 0; local15 < local11; local15++) {
			@Pc(20) char local20 = arg0.charAt(local15);
			if (local20 == '<' || local20 == '>') {
				local13 += 3;
			}
		}
		@Pc(44) StringBuffer local44 = new StringBuffer(local13 + local11);
		for (@Pc(46) int local46 = 0; local46 < local11; local46++) {
			@Pc(51) char local51 = arg0.charAt(local46);
			if (local51 == '<') {
				local44.append("<lt>");
			} else if (local51 == '>') {
				local44.append("<gt>");
			} else {
				local44.append(local51);
			}
		}
		return local44.toString();
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(ZBILclient!ij;Lclient!ij;)V")
	public static void method569(@OriginalArg(2) int arg0, @OriginalArg(3) Class93 arg1, @OriginalArg(4) Class93 arg2) {
		Static345.aClass93_127 = arg1;
		Static79.aBoolean103 = true;
		Static153.aClass93_60 = arg2;
		Static120.anInt2260 = arg0;
		@Pc(17) int local17 = Static345.aClass93_127.method2417() - 1;
		Static102.anInt1937 = Static345.aClass93_127.method2418(local17) + local17 * 256;
		Static47.aStringArray11 = new String[] { null, null, Static312.aClass85_128.method2020(Static120.anInt2260), null, null };
		Static170.aStringArray41 = new String[] { null, null, null, null, Static137.aClass85_64.method2020(Static120.anInt2260) };
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(BII)I")
	public static int method570(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 4 || arg0 == 5 ? Static332.anIntArray645[arg1 & 0x3] : 256;
	}
}
