import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static569 {

	@OriginalMember(owner = "client!vn", name = "d", descriptor = "Lclient!ps;")
	public static Class262 aClass262_9;

	@OriginalMember(owner = "client!vn", name = "f", descriptor = "Lclient!ri;")
	public static Class284 aClass284_164;

	@OriginalMember(owner = "client!vn", name = "i", descriptor = "[I")
	public static int[] anIntArray567;

	@OriginalMember(owner = "client!vn", name = "c", descriptor = "Lclient!hga;")
	public static final Class123 aClass123_313 = new Class123(63, 16);

	@OriginalMember(owner = "client!vn", name = "h", descriptor = "Lclient!pw;")
	public static final Class265 aClass265_11 = new Class265();

	@OriginalMember(owner = "client!vn", name = "j", descriptor = "Lclient!hga;")
	public static final Class123 aClass123_314 = new Class123(84, 3);

	@OriginalMember(owner = "client!vn", name = "k", descriptor = "Lclient!ui;")
	public static final Class329 aClass329_67 = new Class329(14, 0, 4, 1);

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(ILclient!oo;)V")
	public static void method7713(@OriginalArg(1) Class3_Sub26_Sub1 arg0) {
		for (@Pc(12) int local12 = 0; local12 < Static222.anInt4597; local12++) {
			@Pc(18) int local18 = Static479.anIntArray492[local12];
			@Pc(22) Class25_Sub2_Sub2_Sub5_Sub1 local22 = Static410.aClass25_Sub2_Sub2_Sub5_Sub1Array1[local18];
			@Pc(28) int local28 = arg0.method6814();
			if ((local28 & 0x10) != 0) {
				local28 += arg0.method6814() << 8;
			}
			if ((local28 & 0x100) != 0) {
				local28 += arg0.method6814() << 16;
			}
			Static199.method3471(local22, arg0, local28, local18);
		}
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method7715(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(20) String local20 = Static468.method6414(arg0);
		if (local20 == null) {
			return;
		}
		for (@Pc(25) int local25 = 0; local25 < Static372.anInt6493; local25++) {
			@Pc(31) String local31 = Static437.aStringArray36[local25];
			if (local31.startsWith("*")) {
				local31 = local31.substring(1);
			}
			local31 = Static468.method6414(local31);
			if (local31 != null && local31.equals(local20)) {
				Static372.anInt6493--;
				for (@Pc(55) int local55 = local25; local55 < Static372.anInt6493; local55++) {
					Static437.aStringArray36[local55] = Static437.aStringArray36[local55 + 1];
					Static530.aStringArray44[local55] = Static530.aStringArray44[local55 + 1];
					Static383.anIntArray374[local55] = Static383.anIntArray374[local55 + 1];
					Static154.aStringArray11[local55] = Static154.aStringArray11[local55 + 1];
					Static578.anIntArray577[local55] = Static578.anIntArray577[local55 + 1];
					Static506.aBooleanArray27[local55] = Static506.aBooleanArray27[local55 + 1];
				}
				Static356.anInt6330 = Static523.anInt9188;
				@Pc(124) Class3_Sub10 local124 = Static129.method2403(Static452.aClass353_2, Static163.aClass287_17);
				local124.aClass3_Sub26_Sub1_1.method6809(Static158.method2898(arg0));
				local124.aClass3_Sub26_Sub1_1.method6772(arg0);
				Static193.method3398(local124);
				break;
			}
		}
	}
}
