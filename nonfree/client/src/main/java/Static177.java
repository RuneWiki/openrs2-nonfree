import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static177 {

	@OriginalMember(owner = "client!ua", name = "d", descriptor = "I")
	public static int anInt4315;

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "[Lclient!ki;")
	public static final Class47[] aClass47Array1 = new Class47[4];

	@OriginalMember(owner = "client!ua", name = "e", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_1188 = Static158.method3034("Loading)3)3)3");

	@OriginalMember(owner = "client!ua", name = "c", descriptor = "Lclient!ob;")
	public static Class60 aClass60_1187 = aClass60_1188;

	@OriginalMember(owner = "client!ua", name = "h", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_1189 = Static158.method3034("zur-Uck auf die RuneScape)2Webseite gehen");

	@OriginalMember(owner = "client!ua", name = "n", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_1190 = Static158.method3034("Benutzen Sie bitte eine andere Welt)3");

	@OriginalMember(owner = "client!ua", name = "r", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_1191 = Static158.method3034("Unerwartete Antwort vom Anmelde)2Server");

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lclient!fa;I)V")
	public static void method3323(@OriginalArg(0) Class2_Sub1_Sub7_Sub2 arg0) {
		for (@Pc(3) int local3 = 0; local3 < Static128.anIntArray401.length; local3++) {
			Static128.anIntArray401[local3] = 0;
		}
		@Pc(40) int local40;
		for (@Pc(30) int local30 = 0; local30 < 5000; local30++) {
			local40 = (int) ((double) 256 * Math.random() * 128.0D);
			Static128.anIntArray401[local40] = (int) (Math.random() * 256.0D);
		}
		@Pc(57) int local57;
		@Pc(61) int local61;
		@Pc(69) int local69;
		for (local40 = 0; local40 < 20; local40++) {
			for (local57 = 1; local57 < 255; local57++) {
				for (local61 = 1; local61 < 127; local61++) {
					local69 = local61 + (local57 << 7);
					Static101.anIntArray335[local69] = (Static128.anIntArray401[local69 - 128] + Static128.anIntArray401[local69 + 1] + Static128.anIntArray401[local69 - 1] + Static128.anIntArray401[local69 + 128]) / 4;
				}
			}
			@Pc(112) int[] local112 = Static128.anIntArray401;
			Static128.anIntArray401 = Static101.anIntArray335;
			Static101.anIntArray335 = local112;
		}
		if (arg0 == null) {
			return;
		}
		local57 = 0;
		for (local61 = 0; local61 < arg0.anInt1594; local61++) {
			for (local69 = 0; local69 < arg0.anInt1596; local69++) {
				if (arg0.aByteArray19[local57++] != 0) {
					@Pc(150) int local150 = arg0.anInt1592 + local61 + 16;
					@Pc(158) int local158 = local69 + arg0.anInt1595 + 16;
					@Pc(164) int local164 = (local150 << 7) + local158;
					Static128.anIntArray401[local164] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIIIIII)V")
	public static void method3324(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(5) int local5 = arg4 + arg1;
		for (@Pc(11) int local11 = arg1; local11 < local5; local11++) {
			Static163.method3070(arg5, arg2, arg0, Static42.anIntArrayArray8[local11]);
		}
		@Pc(29) int local29 = arg5 - arg4;
		@Pc(45) int local45 = arg3 - arg4;
		@Pc(49) int local49 = arg2 + arg4;
		for (@Pc(51) int local51 = arg3; local51 > local45; local51--) {
			Static163.method3070(arg5, arg2, arg0, Static42.anIntArrayArray8[local51]);
		}
		for (@Pc(67) int local67 = local5; local67 <= local45; local67++) {
			@Pc(73) int[] local73 = Static42.anIntArrayArray8[local67];
			Static163.method3070(local49, arg2, arg0, local73);
			Static163.method3070(arg5, local29, arg0, local73);
		}
	}
}
