import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!di", name = "q", descriptor = "Lclient!sr;")
	public static Interface7 anInterface7_1;

	@OriginalMember(owner = "client!di", name = "r", descriptor = "I")
	public static int anInt1356;

	@OriginalMember(owner = "client!di", name = "s", descriptor = "Lclient!qj;")
	public static Class165 aClass165_23;

	@OriginalMember(owner = "client!di", name = "k", descriptor = "Lclient!wd;")
	public static final Class160 aClass160_1 = Static182.method3561();

	@OriginalMember(owner = "client!di", name = "p", descriptor = "[I")
	public static final int[] anIntArray152 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

	@OriginalMember(owner = "client!di", name = "t", descriptor = "Ljava/lang/String;")
	public static String aString53 = "level: ";

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(B)V")
	public static void method1312() {
		Static248.aClass1_Sub7_Sub1_2.method728(186);
		Static248.aClass1_Sub7_Sub1_2.method3128(Static169.anInt4508);
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(BLjava/lang/String;C)[Ljava/lang/String;")
	public static String[] method1317(@OriginalArg(1) String arg0, @OriginalArg(2) char arg1) {
		@Pc(18) int local18 = Static316.method5330(arg0, arg1);
		@Pc(23) String[] local23 = new String[local18 + 1];
		@Pc(25) int local25 = 0;
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 0; local29 < local18; local29++) {
			@Pc(33) int local33;
			for (local33 = local27; arg0.charAt(local33) != arg1; local33++) {
			}
			local23[local25++] = arg0.substring(local27, local33);
			local27 = local33 + 1;
		}
		local23[local18] = arg0.substring(local27);
		return local23;
	}
}
