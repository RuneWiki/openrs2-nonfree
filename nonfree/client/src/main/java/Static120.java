import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!fu", name = "t", descriptor = "I")
	public static int anInt2435;

	@OriginalMember(owner = "client!fu", name = "u", descriptor = "Lclient!hn;")
	public static final Class107 aClass107_78 = new Class107(98, 12);

	@OriginalMember(owner = "client!fu", name = "v", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray17 = new String[100];

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(II)V")
	public static void method2157(@OriginalArg(1) int arg0) {
		@Pc(8) Class1_Sub2_Sub6 local8 = Static371.method5808(12, arg0);
		local8.method1775();
	}

	@OriginalMember(owner = "client!fu", name = "b", descriptor = "(III)Lclient!qv;")
	public static Class31_Sub3 method2159(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class80 local7 = client.lb[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass31_Sub3_2;
	}
}
