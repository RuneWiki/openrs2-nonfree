import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static373 {

	@OriginalMember(owner = "client!sm", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString61;

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "Lclient!s;")
	public static final Class217 aClass217_137 = new Class217(79, 6);

	@OriginalMember(owner = "client!sm", name = "d", descriptor = "I")
	public static int anInt6411 = 500;

	@OriginalMember(owner = "client!sm", name = "i", descriptor = "[[I")
	public static final int[][] anIntArrayArray60 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!sm", name = "p", descriptor = "[Z")
	public static final boolean[] aBooleanArray19 = new boolean[100];

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(IZI)Z")
	public static boolean method4981(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(BZZLclient!lt;Ljava/lang/String;)V")
	public static void method4984(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class159 arg2, @OriginalArg(4) String arg3) {
		if (!arg1) {
			Static251.method4761(3, arg2, arg3);
			return;
		}
		@Pc(24) String local24;
		if (Static240.aString42.startsWith("win") && Static240.anInt4376 != 3) {
			local24 = null;
			if (arg2.anApplet1 != null) {
				local24 = arg2.anApplet1.getParameter("haveie6");
			}
			if (local24 == null || !local24.equals("1")) {
				@Pc(44) Class270 local44 = Static251.method4761(0, arg2, arg3);
				Static389.aClass270_6 = local44;
				aString61 = arg3;
				Static322.aClass159_3 = arg2;
				return;
			}
		}
		if (Static240.aString42.startsWith("mac")) {
			local24 = null;
			if (arg2.anApplet1 != null) {
				local24 = arg2.anApplet1.getParameter("havefirefox");
			}
			if (local24 != null && local24.equals("1") && arg0) {
				Static251.method4761(1, arg2, arg3);
				return;
			}
		}
		Static251.method4761(2, arg2, arg3);
	}
}
