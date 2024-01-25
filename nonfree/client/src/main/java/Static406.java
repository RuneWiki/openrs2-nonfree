import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static406 {

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "Lclient!en;")
	public static Class106 aClass106_4;

	@OriginalMember(owner = "client!nr", name = "q", descriptor = "F")
	public static float aFloat156;

	@OriginalMember(owner = "client!nr", name = "k", descriptor = "I")
	public static int anInt6924 = 104;

	@OriginalMember(owner = "client!nr", name = "C", descriptor = "I")
	public static int anInt6932 = 0;

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(CI)Z")
	public static boolean method5786(@OriginalArg(0) char arg0) {
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(29) char[] local29 = Static66.aCharArray1;
			for (@Pc(31) int local31 = 0; local31 < local29.length; local31++) {
				@Pc(37) char local37 = local29[local31];
				if (arg0 == local37) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(BII)V")
	public static void method5796(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) Class3_Sub6_Sub7 local18 = Static198.method3146((long) arg0 | (long) arg1 << 32, 18);
		local18.method1709();
	}
}
