import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static139 {

	@OriginalMember(owner = "client!fa", name = "q", descriptor = "Lclient!kha;")
	public static Class181 aClass181_31;

	@OriginalMember(owner = "client!fa", name = "t", descriptor = "Lclient!wga;")
	public static final Class371 aClass371_3 = new Class371();

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method3132(@OriginalArg(1) String arg0) {
		return arg0.length() + 1;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(III)Lclient!fu;")
	public static Class106 method3134(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static170.aClass106ArrayArrayArray1[arg0][arg1][arg2] == null) {
			@Pc(28) boolean local28 = Static170.aClass106ArrayArrayArray1[0][arg1][arg2] != null && Static170.aClass106ArrayArrayArray1[0][arg1][arg2].aClass106_1 != null;
			if (local28 && arg0 >= Static626.anInt10336 - 1) {
				return null;
			}
			Static96.method2488(arg0, arg1, arg2);
		}
		return Static170.aClass106ArrayArrayArray1[arg0][arg1][arg2];
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(ILclient!gaa;)V")
	public static void method3135(@OriginalArg(1) Class108 arg0) {
		if (arg0.anInt4023 == Static499.anInt8835) {
			Static178.aBooleanArray12[arg0.anInt4060] = true;
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(ILclient!kha;)V")
	public static void method3136(@OriginalArg(1) Class181 arg0) {
		Static310.aClass181_58 = arg0;
	}
}
