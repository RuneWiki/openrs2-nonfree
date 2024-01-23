import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static253 {

	@OriginalMember(owner = "client!sb", name = "E", descriptor = "[Lclient!ro;")
	public static Class157[] aClass157Array2 = new Class157[14];

	@OriginalMember(owner = "client!sb", name = "M", descriptor = "Ljava/lang/String;")
	public static String aString274 = "Loaded config";

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(III)Lclient!sg;")
	public static Class161 method3987(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub33 local7 = Static105.aClass1_Sub33ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(13) int local13 = 0; local13 < local7.anInt5733; local13++) {
			@Pc(22) Class161 local22 = local7.aClass161Array3[local13];
			if ((local22.aLong171 >> 29 & 0x3L) == 2L && local22.anInt4641 == arg1 && local22.anInt4636 == arg2) {
				Static26.method438(local22);
				return local22;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;)V")
	public static void method3988(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(4) String arg2) {
		Static45.method885(-1, arg2, arg1, 9, arg0);
	}
}
