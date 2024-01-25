import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static125 {

	@OriginalMember(owner = "client!el", name = "d", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray9 = new String[] { "en", "de", "fr", "pt", "nl" };

	@OriginalMember(owner = "client!el", name = "g", descriptor = "I")
	public static int anInt2831 = -1;

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(ILjava/lang/String;I)V")
	public static void method2537(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class3_Sub42 local12 = Static591.method7910(Static9.aClass199_3, Static68.aClass303_20);
		local12.aClass3_Sub11_Sub1_1.method5213(Static325.method4707(arg0) + 1);
		local12.aClass3_Sub11_Sub1_1.method5188(arg1);
		local12.aClass3_Sub11_Sub1_1.method5227(arg0);
		Static511.method6885(local12);
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(Lclient!la;)V")
	public static void method2542(@OriginalArg(0) Class54 arg0) {
		Static441.aClass54_11 = arg0;
	}
}
