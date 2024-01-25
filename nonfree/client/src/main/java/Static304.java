import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static304 {

	@OriginalMember(owner = "client!th", name = "L", descriptor = "Z")
	public static boolean aBoolean538 = false;

	@OriginalMember(owner = "client!th", name = "M", descriptor = "[[B")
	public static final byte[][] aByteArrayArray23 = new byte[50][];

	@OriginalMember(owner = "client!th", name = "P", descriptor = "Ljava/lang/String;")
	public static final String aString230 = "red:";

	@OriginalMember(owner = "client!th", name = "T", descriptor = "[I")
	public static final int[] anIntArray499 = new int[4096];

	@OriginalMember(owner = "client!th", name = "U", descriptor = "I")
	public static int anInt6131 = 0;

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method5142(@OriginalArg(1) String arg0) {
		Static153.aString115 = arg0;
		if (Static212.aClass120_3.anApplet1 == null) {
			return;
		}
		try {
			@Pc(14) String local14 = Static212.aClass120_3.anApplet1.getParameter("cookieprefix");
			@Pc(19) String local19 = Static212.aClass120_3.anApplet1.getParameter("cookiehost");
			@Pc(34) String local34 = local14 + "settings=" + arg0 + "; version=1; path=/; domain=" + local19;
			if (arg0.length() == 0) {
				local34 = local34 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				local34 = local34 + "; Expires=" + Static171.method3205(Static274.method4763() + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			Static369.method5673(Static212.aClass120_3.anApplet1, "document.cookie=\"" + local34 + "\"");
		} catch (@Pc(94) Throwable local94) {
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(ILjava/lang/String;C)[Ljava/lang/String;")
	public static String[] method5143(@OriginalArg(1) String arg0, @OriginalArg(2) char arg1) {
		@Pc(10) int local10 = Static292.method4980(arg0, arg1);
		@Pc(23) String[] local23 = new String[local10 + 1];
		@Pc(25) int local25 = 0;
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 0; local29 < local10; local29++) {
			@Pc(33) int local33;
			for (local33 = local27; arg0.charAt(local33) != arg1; local33++) {
			}
			local23[local25++] = arg0.substring(local27, local33);
			local27 = local33 + 1;
		}
		local23[local10] = arg0.substring(local27);
		return local23;
	}

	@OriginalMember(owner = "client!th", name = "d", descriptor = "(I)V")
	public static void method5144() {
		Static258.aClass129_1.method5343();
		for (@Pc(14) int local14 = 0; local14 < 32; local14++) {
			Static318.aLongArray7[local14] = 0L;
		}
		for (@Pc(26) int local26 = 0; local26 < 32; local26++) {
			Static161.aLongArray2[local26] = 0L;
		}
		Static314.anInt3129 = 0;
	}
}
