import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static375 {

	@OriginalMember(owner = "client!oa", name = "g", descriptor = "[I")
	public static final int[] anIntArray364 = new int[8];

	@OriginalMember(owner = "client!oa", name = "h", descriptor = "[I")
	public static int[] anIntArray365 = new int[2];

	@OriginalMember(owner = "client!oa", name = "l", descriptor = "I")
	public static int anInt6514 = 0;

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(ZB)V")
	public static void method5253(@OriginalArg(0) boolean arg0) {
		Static245.method3870();
		if (!Static223.method3689(Static409.anInt1461)) {
			return;
		}
		Static171.anInt3775++;
		if (Static171.anInt3775 < 50 && !arg0) {
			return;
		}
		Static171.anInt3775 = 0;
		if (!Static116.aBoolean190 && Static451.aClass223_6 != null) {
			@Pc(42) Class3_Sub10 local42 = Static129.method2403(Static452.aClass353_2, Static341.aClass287_100);
			Static193.method3398(local42);
			try {
				Static411.method5773();
			} catch (@Pc(51) IOException local51) {
				Static116.aBoolean190 = true;
			}
		}
		Static245.method3870();
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(III)Lclient!cs;")
	public static Class25_Sub2_Sub4 method5255(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class333 local7 = Static189.aClass333ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class25_Sub2_Sub4 local14 = local7.aClass25_Sub2_Sub4_1;
			local7.aClass25_Sub2_Sub4_1 = null;
			Static478.method6527(local14);
			return local14;
		}
	}
}
