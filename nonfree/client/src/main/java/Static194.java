import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static194 {

	@OriginalMember(owner = "client!gt", name = "bd", descriptor = "[I")
	public static int[] anIntArray198;

	@OriginalMember(owner = "client!gt", name = "gd", descriptor = "I")
	public static int anInt3777;

	@OriginalMember(owner = "client!gt", name = "Yc", descriptor = "Lclient!gr;")
	public static final Class130 aClass130_57 = new Class130(65, -1);

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(Lclient!qk;ILclient!qk;)V")
	public static void method3338(@OriginalArg(0) Class279 arg0, @OriginalArg(2) Class279 arg1) {
		@Pc(12) Class3_Sub14 local12 = Static139.method2308(Static518.aClass130_116, Static24.aClass233_1);
		local12.aClass3_Sub3_Sub2_2.method4265(arg0.anInt8185);
		local12.aClass3_Sub3_Sub2_2.method4226(arg0.anInt8217);
		local12.aClass3_Sub3_Sub2_2.method4226(arg1.anInt8217);
		local12.aClass3_Sub3_Sub2_2.method4201(arg1.anInt8147);
		local12.aClass3_Sub3_Sub2_2.method4202(arg0.anInt8147);
		local12.aClass3_Sub3_Sub2_2.method4266(arg1.anInt8185);
		Static562.method8096(local12);
	}
}
