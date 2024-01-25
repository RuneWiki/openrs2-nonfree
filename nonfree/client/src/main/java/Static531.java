import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static531 {

	@OriginalMember(owner = "client!ud", name = "o", descriptor = "Lclient!efa;")
	public static final Class90 aClass90_39 = new Class90(64);

	@OriginalMember(owner = "client!ud", name = "t", descriptor = "Lclient!au;")
	public static final Class21 aClass21_83 = new Class21(4);

	@OriginalMember(owner = "client!ud", name = "w", descriptor = "I")
	public static int anInt8749 = -1;

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lclient!ew;ZILjava/lang/String;Z)V")
	public static void method6989(@OriginalArg(0) Class99 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) String arg2, @OriginalArg(4) boolean arg3) {
		if (!arg1) {
			Static557.method7304(arg2, 3, arg0);
			return;
		}
		@Pc(19) String local19;
		if (Static132.aString29.startsWith("win") && arg0.aBoolean151) {
			local19 = null;
			if (Static195.anApplet4 != null) {
				local19 = Static195.anApplet4.getParameter("haveie6");
			}
			if (local19 == null || !local19.equals("1")) {
				@Pc(37) Class5 local37 = Static557.method7304(arg2, 0, arg0);
				Static191.aClass99_4 = arg0;
				Static357.aString81 = arg2;
				Static195.aClass5_8 = local37;
				return;
			}
		}
		if (Static132.aString29.startsWith("mac")) {
			local19 = null;
			if (Static195.anApplet4 != null) {
				local19 = Static195.anApplet4.getParameter("havefirefox");
			}
			if (local19 != null && local19.equals("1") && arg3) {
				Static557.method7304(arg2, 1, arg0);
				return;
			}
		}
		Static557.method7304(arg2, 2, arg0);
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(BLjava/lang/String;)Z")
	public static boolean method6990(@OriginalArg(1) String arg0) {
		return Static540.method7095(arg0);
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIB[B)[B")
	public static byte[] method6992(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(16) byte[] local16;
		if (arg1 <= 0) {
			local16 = arg2;
		} else {
			local16 = new byte[arg0];
			for (@Pc(23) int local23 = 0; local23 < arg0; local23++) {
				local16[local23] = arg2[local23 + arg1];
			}
		}
		@Pc(41) Class152 local41 = new Class152();
		local41.method2652();
		local41.method2654(local16, (long) (arg0 * 8));
		@Pc(55) byte[] local55 = new byte[64];
		local41.method2657(local55);
		return local55;
	}
}
