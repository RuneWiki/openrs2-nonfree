import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static418 {

	@OriginalMember(owner = "client!va", name = "l", descriptor = "Lclient!f;")
	public static Class78 aClass78_23;

	@OriginalMember(owner = "client!va", name = "m", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray11;

	@OriginalMember(owner = "client!va", name = "f", descriptor = "[[B")
	public static final byte[][] aByteArrayArray28 = new byte[250][];

	@OriginalMember(owner = "client!va", name = "j", descriptor = "I")
	public static final int anInt7336 = 1407;

	@OriginalMember(owner = "client!va", name = "n", descriptor = "I")
	public static int anInt7338 = 0;

	@OriginalMember(owner = "client!va", name = "o", descriptor = "Z")
	public static boolean aBoolean626 = false;

	@OriginalMember(owner = "client!va", name = "b", descriptor = "(I)V")
	public static void method5656() {
		Static175.aClass151_134.method3298();
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IBIIIII)V")
	public static void method5657(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(17) int local17 = arg0 + arg5;
		@Pc(22) int local22 = arg1 - arg0;
		for (@Pc(24) int local24 = arg5; local24 < local17; local24++) {
			Static23.method323(Static283.anIntArrayArray30[local24], arg2, arg3, arg4);
		}
		@Pc(43) int local43 = arg2 + arg0;
		for (@Pc(45) int local45 = arg1; local45 > local22; local45--) {
			Static23.method323(Static283.anIntArrayArray30[local45], arg2, arg3, arg4);
		}
		@Pc(68) int local68 = arg4 - arg0;
		for (@Pc(70) int local70 = local17; local70 <= local22; local70++) {
			@Pc(76) int[] local76 = Static283.anIntArrayArray30[local70];
			Static23.method323(local76, arg2, arg3, local43);
			Static23.method323(local76, local68, arg3, arg4);
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;")
	public static String method5658(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			@Pc(18) char local18 = arg0.charAt(local12);
			if (local18 == '<' || local18 == '>') {
				local10 += 3;
			}
		}
		@Pc(49) StringBuffer local49 = new StringBuffer(local10 + local8);
		for (@Pc(51) int local51 = 0; local51 < local8; local51++) {
			@Pc(57) char local57 = arg0.charAt(local51);
			if (local57 == '<') {
				local49.append("<lt>");
			} else if (local57 == '>') {
				local49.append("<gt>");
			} else {
				local49.append(local57);
			}
		}
		return local49.toString();
	}
}
