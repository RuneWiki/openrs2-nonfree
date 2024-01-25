import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static424 {

	@OriginalMember(owner = "client!od", name = "gb", descriptor = "I")
	public static int anInt6910;

	@OriginalMember(owner = "client!od", name = "hb", descriptor = "I")
	public static int anInt6911;

	@OriginalMember(owner = "client!od", name = "fb", descriptor = "Lclient!jb;")
	public static final Class171 aClass171_108 = new Class171(31, 7);

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(ZLclient!gj;Lclient!gj;)V")
	public static void method5839(@OriginalArg(1) Class3_Sub5 arg0, @OriginalArg(2) Class3_Sub5 arg1) {
		if (arg0.aClass3_Sub5_67 != null) {
			arg0.method9014();
		}
		arg0.aClass3_Sub5_66 = arg1;
		arg0.aClass3_Sub5_67 = arg1.aClass3_Sub5_67;
		arg0.aClass3_Sub5_67.aClass3_Sub5_66 = arg0;
		arg0.aClass3_Sub5_66.aClass3_Sub5_67 = arg0;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIB)V")
	public static void method5841(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) Class3_Sub5_Sub20 local9 = Static447.method6065((long) arg1, 11);
		local9.method8832();
		local9.anInt10756 = arg2;
		local9.anInt10754 = arg0;
	}
}
