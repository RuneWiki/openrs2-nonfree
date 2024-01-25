import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static355 {

	@OriginalMember(owner = "client!ln", name = "u", descriptor = "Lclient!rg;")
	public static Class310 aClass310_72;

	@OriginalMember(owner = "client!ln", name = "w", descriptor = "I")
	public static int anInt6072 = 0;

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "([II)Ljava/lang/String;")
	public static String method5400(@OriginalArg(0) int[] arg0) {
		@Pc(14) StringBuffer local14 = new StringBuffer();
		@Pc(16) int local16 = Static365.anInt6219;
		for (@Pc(18) int local18 = 0; local18 < arg0.length; local18++) {
			@Pc(26) Class9 local26 = Static285.aClass325_1.method7960(arg0[local18]);
			if (local26.anInt72 != -1) {
				@Pc(38) Class45 local38 = (Class45) Static553.aClass317_60.method7882((long) local26.anInt72);
				if (local38 == null) {
					@Pc(46) Class266 local46 = Static697.method6466(Static99.aClass310_23, local26.anInt72, 0);
					if (local46 != null) {
						local38 = Static103.aClass144_3.method6964(local46, true);
						Static553.aClass317_60.method7875((long) local26.anInt72, local38);
					}
				}
				if (local38 != null) {
					Static399.aClass45Array24[local16] = local38;
					local14.append(" <img=").append(local16).append(">");
					local16++;
				}
			}
		}
		return local14.toString();
	}

	@OriginalMember(owner = "client!ln", name = "f", descriptor = "(I)Z")
	public static boolean method5401() {
		return anInt6072 != 0;
	}

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "(ZI)V")
	public static void method5402(@OriginalArg(1) int arg0) {
		@Pc(17) Class14_Sub2_Sub9 local17 = Static499.method7527((long) arg0, 4);
		local17.method4001();
	}
}
