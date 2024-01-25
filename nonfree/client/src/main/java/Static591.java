import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static591 {

	@OriginalMember(owner = "client!vba", name = "m", descriptor = "I")
	public static int anInt9999;

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(I[I)Ljava/lang/String;")
	public static String method8148(@OriginalArg(1) int[] arg0) {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		@Pc(11) int local11 = Static506.anInt8762;
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			@Pc(22) Class236 local22 = Static526.aClass21_1.method702(arg0[local13]);
			if (local22.anInt7332 != -1) {
				@Pc(35) Class4 local35 = (Class4) Static63.aClass94_10.method2960((long) local22.anInt7332);
				if (local35 == null) {
					@Pc(43) Class331 local43 = Static655.method7892(Static436.aClass223_98, local22.anInt7332, 0);
					if (local43 != null) {
						local35 = Static467.aClass5_13.method6121(local43, true);
						Static63.aClass94_10.method2963((long) local22.anInt7332, local35);
					}
				}
				if (local35 != null) {
					Static388.aClass4Array10[local11] = local35;
					local9.append(" <img=").append(local11).append(">");
					local11++;
				}
			}
		}
		return local9.toString();
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(I[BZ)Ljava/lang/Object;")
	public static Object method8149(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static403.aBoolean586) {
			try {
				@Pc(23) Class324 local23 = (Class324) Class.forName("Class324_Sub1").getDeclaredConstructor().newInstance();
				local23.method8088(arg0);
				return local23;
			} catch (@Pc(30) Throwable local30) {
				Static403.aBoolean586 = true;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(IBI)Z")
	public static boolean method8151(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static450.method6846(arg0, arg1) | (arg1 & 0x70000) != 0 || Static422.method6593(arg1, arg0);
	}
}
