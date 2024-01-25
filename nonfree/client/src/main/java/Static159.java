import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static159 {

	@OriginalMember(owner = "client!gd", name = "h", descriptor = "Lclient!f;")
	public static Class78 aClass78_6;

	@OriginalMember(owner = "client!gd", name = "l", descriptor = "I")
	public static int anInt3286;

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "Lclient!wo;")
	public static final Class362 aClass362_74 = new Class362(25, 6);

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IZLjava/lang/String;)V")
	public static void method2938(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		@Pc(12) Class4_Sub14 local12 = Static196.method3380(Static17.aClass159_1, Static235.aClass173_71);
		local12.aClass4_Sub11_Sub1_3.method4957(Static163.method2969(arg1) + 1);
		local12.aClass4_Sub11_Sub1_3.method4945(arg1);
		local12.aClass4_Sub11_Sub1_3.method4913(arg0);
		Static353.method5712(local12);
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(II)I")
	public static int method2941(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static15.aShortArrayArray1 == null ? 0 : Static15.aShortArrayArray1[arg0][arg1] & 0xFFFF;
	}
}
