import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static508 {

	@OriginalMember(owner = "client!vda", name = "j", descriptor = "[I")
	public static int[] anIntArray776;

	@OriginalMember(owner = "client!vda", name = "b", descriptor = "Lclient!bda;")
	public static final Class21 aClass21_8 = new Class21("WTWIP", 3);

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
	public static String method7025(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(14) int local14 = arg1.indexOf(arg0); local14 != -1; local14 = arg1.indexOf(arg0, arg2.length() + local14)) {
			arg1 = arg1.substring(0, local14) + arg2 + arg1.substring(local14 + arg0.length());
		}
		return arg1;
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method7026(@OriginalArg(1) String arg0) {
		if (Static200.aStringArray19 == null) {
			Static170.method2590();
		}
		@Pc(23) String[] local23 = Static254.method4297('\n', arg0);
		for (@Pc(25) int local25 = 0; local25 < local23.length; local25++) {
			for (@Pc(29) int local29 = Static158.anInt2904; local29 > 0; local29--) {
				Static200.aStringArray19[local29] = Static200.aStringArray19[local29 - 1];
			}
			Static200.aStringArray19[0] = local23[local25];
			if (Static158.anInt2904 < Static200.aStringArray19.length - 1) {
				Static158.anInt2904++;
				if (Static469.anInt9081 > 0) {
					Static469.anInt9081++;
				}
			}
		}
	}
}
