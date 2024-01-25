import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static353 {

	@OriginalMember(owner = "client!nb", name = "n", descriptor = "I")
	public static int anInt6341 = -1;

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(III)Lclient!ev;")
	public static Class6_Sub1_Sub3 method5256(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class346 local7 = Static389.aClass346ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass6_Sub1_Sub3_2;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIIIB)Z")
	public static boolean method5259(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		for (@Pc(14) int local14 = arg1; local14 <= arg0; local14++) {
			for (@Pc(18) int local18 = arg2; local18 <= arg4; local18++) {
				if (arg3 == Static173.anIntArrayArray18[local14][local18] && Static590.anIntArrayArray70[local14][local18] <= 1) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(CZ)C")
	public static char method5263(@OriginalArg(0) char arg0) {
		if (arg0 == 'Æ') {
			return 'E';
		} else if (arg0 == 'æ') {
			return 'e';
		} else if (arg0 == 'ß') {
			return 's';
		} else if (arg0 == 'Œ') {
			return 'E';
		} else {
			return (char) (arg0 == 'œ' ? 'e' : '\u0000');
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(ILclient!rj;ILjava/awt/Component;I)Lclient!ah;")
	public static Class14 method5264(@OriginalArg(1) Class287 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Component arg2, @OriginalArg(4) int arg3) {
		if (Static162.anInt3474 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(40) Class14 local40 = (Class14) Class.forName("Class14_Sub2").getDeclaredConstructor().newInstance();
			local40.anInt6595 = arg1;
			local40.anIntArray454 = new int[(Static591.aBoolean732 ? 2 : 1) * 256];
			local40.method5519(arg2);
			local40.anInt6596 = (arg1 & 0xFFFFFC00) + 1024;
			if (local40.anInt6596 > 16384) {
				local40.anInt6596 = 16384;
			}
			local40.method5528(local40.anInt6596);
			if (Static408.anInt7102 > 0 && Static22.aClass47_1 == null) {
				Static22.aClass47_1 = new Class47();
				Static22.aClass47_1.aClass287_3 = arg0;
				arg0.method6533(Static408.anInt7102, Static22.aClass47_1);
			}
			if (Static22.aClass47_1 != null) {
				if (Static22.aClass47_1.aClass14Array1[arg3] != null) {
					throw new IllegalArgumentException();
				}
				Static22.aClass47_1.aClass14Array1[arg3] = local40;
			}
			return local40;
		} catch (@Pc(110) Throwable local110) {
			try {
				@Pc(116) Class14_Sub1 local116 = new Class14_Sub1(arg0, arg3);
				local116.anInt6595 = arg1;
				local116.anIntArray454 = new int[(Static591.aBoolean732 ? 2 : 1) * 256];
				local116.method5519(arg2);
				local116.anInt6596 = 16384;
				local116.method5528(local116.anInt6596);
				if (Static408.anInt7102 > 0 && Static22.aClass47_1 == null) {
					Static22.aClass47_1 = new Class47();
					Static22.aClass47_1.aClass287_3 = arg0;
					arg0.method6533(Static408.anInt7102, Static22.aClass47_1);
				}
				if (Static22.aClass47_1 != null) {
					if (Static22.aClass47_1.aClass14Array1[arg3] != null) {
						throw new IllegalArgumentException();
					}
					Static22.aClass47_1.aClass14Array1[arg3] = local116;
				}
				return local116;
			} catch (@Pc(178) Throwable local178) {
				return new Class14();
			}
		}
	}
}
