import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static248 {

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "J")
	public static long aLong173;

	@OriginalMember(owner = "client!ta", name = "c", descriptor = "[Lclient!pn;")
	public static Class1_Sub2_Sub11[] aClass1_Sub2_Sub11Array10;

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "[I")
	public static int[] anIntArray432 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

	@OriginalMember(owner = "client!ta", name = "e", descriptor = "I")
	public static int anInt4910 = 0;

	@OriginalMember(owner = "client!ta", name = "f", descriptor = "J")
	public static long aLong174 = 0L;

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
	public static String method3830(@OriginalArg(1) String arg0) {
		@Pc(16) int local16 = arg0.length();
		@Pc(18) byte local18 = 2;
		@Pc(21) char[] local21 = new char[local16];
		for (@Pc(23) int local23 = 0; local23 < local16; local23++) {
			@Pc(34) char local34 = arg0.charAt(local23);
			if (local18 == 0) {
				local34 = Character.toLowerCase(local34);
			} else if (local18 == 2 || Character.isUpperCase(local34)) {
				local34 = Static190.method3150(local34);
			}
			if (Character.isLetter(local34)) {
				local18 = 0;
			} else if (local34 == '.' || local34 == '?' || local34 == '!') {
				local18 = 2;
			} else if (!Character.isSpaceChar(local34)) {
				local18 = 1;
			} else if (local18 != 2) {
				local18 = 1;
			}
			local21[local23] = local34;
		}
		return new String(local21);
	}
}
