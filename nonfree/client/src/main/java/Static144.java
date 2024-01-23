import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static144 {

	@OriginalMember(owner = "client!lb", name = "H", descriptor = "F")
	public static float aFloat30;

	@OriginalMember(owner = "client!lb", name = "O", descriptor = "Z")
	public static boolean aBoolean239;

	@OriginalMember(owner = "client!lb", name = "z", descriptor = "Lclient!gd;")
	public static Class61 aClass61_22 = new Class61(16);

	@OriginalMember(owner = "client!lb", name = "B", descriptor = "Ljava/lang/String;")
	public static String aString101 = "Your friend list is full. Max of 100 for free users, and 200 for members.";

	@OriginalMember(owner = "client!lb", name = "M", descriptor = "[I")
	public static int[] anIntArray233 = new int[2];

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(B)V")
	public static void method2276() {
		Static242.method3646();
		for (@Pc(8) int local8 = 0; local8 < 4; local8++) {
			Static159.aClass112Array1[local8].method2540();
		}
		System.gc();
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "([BIII)Ljava/lang/String;")
	public static String method2277(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(1) int local1 = 0;
		@Pc(4) char[] local4 = new char[arg2];
		for (@Pc(6) int local6 = 0; local6 < arg2; local6++) {
			@Pc(22) int local22 = arg0[arg1 + local6] & 0xFF;
			if (local22 != 0) {
				if (local22 >= 128 && local22 < 160) {
					@Pc(39) char local39 = Static200.aCharArray4[local22 - 128];
					if (local39 == '\u0000') {
						local39 = '?';
					}
					local22 = local39;
				}
				local4[local1++] = (char) local22;
			}
		}
		return new String(local4, 0, local1);
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ILclient!lk;BIIII)V")
	public static void method2280(@OriginalArg(0) int arg0, @OriginalArg(1) Class36_Sub3 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static208.method3296(arg2, arg5, arg0, arg3, arg1.anInt4117, arg4, arg1.anInt4118);
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method2282(@OriginalArg(1) String arg0) {
		@Pc(13) int local13 = Static185.method2873(arg0);
		return local13 == -1 ? "" : Static9.method80(" ", "<br>", Static245.aClass130_2.aStringArray61[local13]);
	}
}
