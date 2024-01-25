import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static308 {

	@OriginalMember(owner = "client!kfa", name = "g", descriptor = "Lclient!vn;")
	public static Class380 aClass380_3;

	@OriginalMember(owner = "client!kfa", name = "e", descriptor = "Lclient!iea;")
	public static final Class171 aClass171_4 = new Class171();

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(ILclient!vo;)V")
	public static void method4895(@OriginalArg(1) Class381 arg0) {
		if (!Static162.aBoolean266) {
			return;
		}
		if (arg0.anObjectArray17 != null) {
			@Pc(24) Class381 local24 = Static347.method5333(Static607.anInt9574, Static227.anInt4416);
			if (local24 != null) {
				@Pc(30) Class6_Sub53 local30 = new Class6_Sub53();
				local30.aClass381_12 = local24;
				local30.aClass381_11 = arg0;
				local30.anObjectArray3 = arg0.anObjectArray17;
				Static301.method4842(local30);
			}
		}
		@Pc(48) Class6_Sub13 local48 = Static30.method353(Static387.aClass241_86, Static525.aClass260_4.aClass270_2);
		local48.aClass6_Sub15_Sub1_1.method3040(Static270.anInt5047);
		local48.aClass6_Sub15_Sub1_1.method3017(arg0.anInt10089);
		local48.aClass6_Sub15_Sub1_1.method3040(arg0.anInt10112);
		local48.aClass6_Sub15_Sub1_1.method3020(arg0.anInt10149);
		local48.aClass6_Sub15_Sub1_1.method3023(Static227.anInt4416);
		local48.aClass6_Sub15_Sub1_1.method2984(Static607.anInt9574);
		Static525.aClass260_4.method6404(local48);
	}
}
