import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!aq", name = "I", descriptor = "Lclient!ni;")
	public static Class169 aClass169_1;

	@OriginalMember(owner = "client!aq", name = "L", descriptor = "Lclient!aa;")
	public static final Class2 aClass2_4 = new Class2(23, 3);

	@OriginalMember(owner = "client!aq", name = "M", descriptor = "I")
	public static int anInt213 = 0;

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(IIILjava/lang/Class;)Lclient!mv;")
	public static Class26_Sub2 method152(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class223 local7 = Static19.aClass223ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(14) Class270 local14 = local7.aClass270_1; local14 != null; local14 = local14.aClass270_3) {
			@Pc(18) Class26_Sub2 local18 = local14.aClass26_Sub2_2;
			if (arg3.isAssignableFrom(local18.getClass()) && local18.aShort105 == arg1 && local18.aShort103 == arg2) {
				return local18;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(IB[BI)[B")
	public static byte[] method153(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) {
		@Pc(6) byte[] local6 = new byte[32768];
		Static464.method3633(arg0, arg1, local6, 0, 32768);
		return local6;
	}
}
