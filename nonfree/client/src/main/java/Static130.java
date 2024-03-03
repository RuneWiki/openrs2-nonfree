import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static130 {

	@OriginalMember(owner = "client!hs", name = "v", descriptor = "I")
	public static int anInt2591;

	@OriginalMember(owner = "client!hs", name = "w", descriptor = "Lclient!r;")
	public static Class197 aClass197_34;

	@OriginalMember(owner = "client!hs", name = "y", descriptor = "Lclient!r;")
	public static Class197 aClass197_35;

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(II)V", line = 30)
	public static void method2587(@OriginalArg(0) int arg0) {
		@Pc(13) Class2_Sub2_Sub7 local13 = Static293.method5414(11, arg0);
		local13.method2314();
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(ZIII)Ljava/lang/String;", line = 251)
	public static String method2596(@OriginalArg(2) int arg0) {
		if (arg0 < 0) {
			return Integer.toString(arg0, 10);
		}
		@Pc(34) int local34 = 2;
		for (@Pc(38) int local38 = arg0 / 10; local38 != 0; local38 /= 10) {
			local34++;
		}
		@Pc(50) char[] local50 = new char[local34];
		local50[0] = '+';
		for (@Pc(58) int local58 = local34 - 1; local58 > 0; local58--) {
			@Pc(62) int local62 = arg0;
			arg0 /= 10;
			@Pc(73) int local73 = local62 - arg0 * 10;
			if (local73 >= 10) {
				local50[local58] = (char) (local73 + 87);
			} else {
				local50[local58] = (char) (local73 + 48);
			}
		}
		return new String(local50);
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(BII)V", line = 316)
	public static void method2597(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class2_Sub2_Sub7 local14 = Static293.method5414(16, arg0);
		local14.method2313();
		local14.anInt2286 = arg1;
	}
}
