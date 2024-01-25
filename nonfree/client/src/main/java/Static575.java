import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static575 {

	@OriginalMember(owner = "client!w", name = "s", descriptor = "I")
	public static int anInt9045;

	@OriginalMember(owner = "client!w", name = "t", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray9 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method7408(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(11) int local11 = 0;
		@Pc(14) int local14 = arg0.length();
		while (local14 > local11 && Static332.method5172(arg0.charAt(local11))) {
			local11++;
		}
		while (local11 < local14 && Static332.method5172(arg0.charAt(local14 - 1))) {
			local14--;
		}
		@Pc(50) int local50 = local14 - local11;
		if (local50 < 1 || local50 > 12) {
			return null;
		}
		@Pc(63) StringBuffer local63 = new StringBuffer(local50);
		for (@Pc(65) int local65 = local11; local65 < local14; local65++) {
			@Pc(71) char local71 = arg0.charAt(local65);
			if (Static66.method1309(local71)) {
				@Pc(79) char local79 = Static96.method1746(local71);
				if (local79 != '\u0000') {
					local63.append(local79);
				}
			}
		}
		if (local63.length() == 0) {
			return null;
		} else {
			return local63.toString();
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIII)V")
	public static void method7409(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static13.anInt7634 <= arg1 && arg1 <= Static461.anInt7899) {
			@Pc(15) int local15 = Static201.method3634(arg3, Static415.anInt9494, Static583.anInt9478);
			@Pc(21) int local21 = Static201.method3634(arg0, Static415.anInt9494, Static583.anInt9478);
			Static54.method1199(arg1, arg2, local15, local21);
		}
	}
}
