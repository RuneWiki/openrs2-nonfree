import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static615 {

	@OriginalMember(owner = "client!vt", name = "f", descriptor = "Lclient!us;")
	public static final Class344 aClass344_121 = new Class344(36, 16);

	@OriginalMember(owner = "client!vt", name = "K", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray41 = new String[100];

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(III)V")
	public static void method8356(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class106 local7 = Static170.aClass106ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 != null) {
			Static637.method8381(local7.aClass2_Sub3_Sub5_1);
			if (local7.aClass2_Sub3_Sub5_1 != null) {
				local7.aClass2_Sub3_Sub5_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(Lclient!ab;ILclient!ab;)V")
	public static void method8368(@OriginalArg(0) Class3_Sub1 arg0, @OriginalArg(2) Class3_Sub1 arg1) {
		if (arg0.aClass3_Sub1_67 != null) {
			arg0.method8621();
		}
		arg0.aClass3_Sub1_67 = arg1.aClass3_Sub1_67;
		arg0.aClass3_Sub1_66 = arg1;
		arg0.aClass3_Sub1_67.aClass3_Sub1_66 = arg0;
		arg0.aClass3_Sub1_66.aClass3_Sub1_67 = arg0;
	}
}
