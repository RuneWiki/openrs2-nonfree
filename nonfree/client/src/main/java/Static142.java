import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static142 {

	@OriginalMember(owner = "client!is", name = "H", descriptor = "Lclient!k;")
	public static Class17 aClass17_3;

	@OriginalMember(owner = "client!is", name = "R", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray10;

	@OriginalMember(owner = "client!is", name = "S", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray11;

	@OriginalMember(owner = "client!is", name = "F", descriptor = "Z")
	public static boolean aBoolean235 = false;

	@OriginalMember(owner = "client!is", name = "K", descriptor = "I")
	public static int anInt3103 = 0;

	@OriginalMember(owner = "client!is", name = "V", descriptor = "I")
	public static int anInt3109 = -1;

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method2873(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(9) int local9 = 0;
		@Pc(12) int local12 = arg0.length();
		while (local12 > local9 && Static258.method4345(arg0.charAt(local9))) {
			local9++;
		}
		while (local9 < local12 && Static258.method4345(arg0.charAt(local12 - 1))) {
			local12--;
		}
		@Pc(45) int local45 = local12 - local9;
		if (local45 < 1 || local45 > 12) {
			return null;
		}
		@Pc(60) StringBuffer local60 = new StringBuffer(local45);
		for (@Pc(62) int local62 = local9; local62 < local12; local62++) {
			@Pc(67) char local67 = arg0.charAt(local62);
			if (Static184.method3378(local67)) {
				@Pc(75) char local75 = Static155.method2998(local67);
				if (local75 != '\u0000') {
					local60.append(local75);
				}
			}
		}
		if (local60.length() == 0) {
			return null;
		} else {
			return local60.toString();
		}
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(BII)V")
	public static void method2875(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class7_Sub1_Sub15 local8 = Static315.method5104(14, arg0);
		local8.method4790();
		local8.anInt5687 = arg1;
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(Lclient!rk;I)V")
	public static void method2876(@OriginalArg(0) Class180 arg0) {
		Static327.aClass180_92 = arg0;
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(IIIIIII)V")
	public static void method2877(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int local10 = arg2 - arg0;
		@Pc(14) int local14 = arg0 + arg1;
		for (@Pc(16) int local16 = arg1; local16 < local14; local16++) {
			Static282.method4681(arg4, arg3, Static323.anIntArrayArray55[local16], arg5);
		}
		@Pc(35) int local35 = arg3 + arg0;
		for (@Pc(37) int local37 = arg2; local37 > local10; local37--) {
			Static282.method4681(arg4, arg3, Static323.anIntArrayArray55[local37], arg5);
		}
		@Pc(62) int local62 = arg5 - arg0;
		for (@Pc(64) int local64 = local14; local64 <= local10; local64++) {
			@Pc(70) int[] local70 = Static323.anIntArrayArray55[local64];
			Static282.method4681(arg4, arg3, local70, local35);
			Static282.method4681(arg4, local62, local70, arg5);
		}
	}
}
