import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static247 {

	@OriginalMember(owner = "client!mf", name = "w", descriptor = "I")
	public static int anInt3992;

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray23 = new String[100];

	@OriginalMember(owner = "client!mf", name = "s", descriptor = "S")
	public static short aShort36 = 1;

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(ZLclient!pg;)V")
	public static void method3148(@OriginalArg(1) Class163_Sub2 arg0) {
		@Pc(16) byte[] local16;
		if (Static237.anObject8 == null) {
			@Pc(9) Class111_Sub1_Sub1 local9 = new Class111_Sub1_Sub1();
			local16 = local9.method2308();
			Static237.anObject8 = Static163.method2307(local16);
		}
		if (Static192.anObject5 == null) {
			@Pc(27) Class111_Sub2_Sub1 local27 = new Class111_Sub2_Sub1();
			local16 = local27.method5123();
			Static192.anObject5 = Static163.method2307(local16);
		}
		@Pc(47) Class264 local47 = arg0.aClass264_1;
		if (local47.method5602() && Static372.anObject9 == null) {
			local16 = Static441.method5587(0.5F, 16.0F, 0.6F, 4.0F, 4.0F, new Class9_Sub1(419684));
			Static372.anObject9 = Static163.method2307(local16);
		}
	}
}
