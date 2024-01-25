import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static191 {

	@OriginalMember(owner = "client!gq", name = "K", descriptor = "I")
	public static int anInt3856;

	@OriginalMember(owner = "client!gq", name = "f", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger2 = new BigInteger("10001", 16);

	@OriginalMember(owner = "client!gq", name = "pb", descriptor = "Z")
	public static boolean aBoolean280 = true;

	@OriginalMember(owner = "client!gq", name = "qb", descriptor = "[Lclient!oc;")
	public static final Interface18[] anInterface18Array1 = new Interface18[128];

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(IILclient!su;BI)V")
	public static void method3392(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class312 arg2, @OriginalArg(4) int arg3) {
		for (@Pc(15) Class6_Sub49 local15 = (Class6_Sub49) Static550.aClass8_63.method149(); local15 != null; local15 = (Class6_Sub49) Static550.aClass8_63.method155()) {
			if (local15.anInt9627 == arg3 && local15.anInt9625 == arg1 << 9 && arg0 << 9 == local15.anInt9626 && local15.aClass312_1.anInt9241 == arg2.anInt9241) {
				if (local15.aClass6_Sub3_Sub3_4 != null) {
					Static196.aClass6_Sub3_Sub1_1.method270(local15.aClass6_Sub3_Sub3_4);
					local15.aClass6_Sub3_Sub3_4 = null;
				}
				if (local15.aClass6_Sub3_Sub3_3 != null) {
					Static196.aClass6_Sub3_Sub1_1.method270(local15.aClass6_Sub3_Sub3_3);
					local15.aClass6_Sub3_Sub3_3 = null;
				}
				local15.method9043();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(III)Z")
	public static boolean method3394(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static249.method4328(arg0, arg1) & Static367.method5806(arg1, arg0);
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(II)V")
	public static void method3395(@OriginalArg(0) int arg0) {
		if (!Static578.method5705(arg0)) {
			return;
		}
		@Pc(18) Class302[] local18 = Static605.aClass302ArrayArray4[arg0];
		for (@Pc(20) int local20 = 0; local20 < local18.length; local20++) {
			@Pc(26) Class302 local26 = local18[local20];
			if (local26 != null) {
				local26.anInt8841 = 0;
				local26.anInt8785 = 1;
				local26.anInt8836 = 0;
			}
		}
	}
}
