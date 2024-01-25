import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static271 {

	@OriginalMember(owner = "client!je", name = "o", descriptor = "Lclient!jw;")
	public static final Class180 aClass180_193 = new Class180(95, 3);

	@OriginalMember(owner = "client!je", name = "t", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray31 = new String[100];

	@OriginalMember(owner = "client!je", name = "u", descriptor = "Lclient!jw;")
	public static final Class180 aClass180_194 = new Class180(67, -2);

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void method8429(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		@Pc(17) Class3_Sub34 local17 = Static172.method3123(Static163.aClass375_1, Static249.aClass218_65);
		local17.aClass3_Sub25_Sub1_2.method8614(Static440.method6269(arg1) + 1);
		local17.aClass3_Sub25_Sub1_2.method8614(arg0);
		local17.aClass3_Sub25_Sub1_2.method8583(arg1);
		Static441.method6275(local17);
	}
}
