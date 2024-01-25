import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static295 {

	@OriginalMember(owner = "client!jr", name = "g", descriptor = "F")
	public static float aFloat109;

	@OriginalMember(owner = "client!jr", name = "k", descriptor = "F")
	public static float aFloat110;

	@OriginalMember(owner = "client!jr", name = "s", descriptor = "Lclient!gga;")
	public static Class124 aClass124_66;

	@OriginalMember(owner = "client!jr", name = "n", descriptor = "[F")
	public static final float[] aFloatArray30 = new float[4];

	@OriginalMember(owner = "client!jr", name = "q", descriptor = "Lclient!mp;")
	public static final Class236 aClass236_2 = new Class236();

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(ILclient!ol;)Lclient!wda;")
	public static Class385 method4879(@OriginalArg(1) Class2_Sub8 arg0) {
		@Pc(7) String local7 = arg0.method5178();
		@Pc(14) Class236 local14 = Static566.method8589()[arg0.method5203()];
		@Pc(21) Class103 local21 = Static277.method9737()[arg0.method5203()];
		@Pc(25) int local25 = arg0.method5174();
		@Pc(29) int local29 = arg0.method5174();
		@Pc(33) int local33 = arg0.method5203();
		@Pc(37) int local37 = arg0.method5203();
		@Pc(41) int local41 = arg0.method5203();
		@Pc(45) int local45 = arg0.method5211();
		@Pc(49) int local49 = arg0.method5211();
		@Pc(57) int local57 = arg0.method5172();
		@Pc(61) int local61 = arg0.method5172();
		@Pc(65) int local65 = arg0.method5172();
		return new Class385(local7, local14, local21, local25, local29, local33, local37, local41, local45, local49, local57, local61, local65);
	}

	@OriginalMember(owner = "client!jr", name = "d", descriptor = "(II)V")
	public static void method4881(@OriginalArg(0) int arg0) {
		@Pc(9) Class2_Sub1_Sub5 local9 = Static653.method9595(9, (long) arg0);
		local9.method2489();
	}
}
