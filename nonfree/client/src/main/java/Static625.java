import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static625 {

	@OriginalMember(owner = "client!tj", name = "l", descriptor = "Lclient!gs;")
	public static final Class144 aClass144_95 = new Class144(43, 11);

	@OriginalMember(owner = "client!tj", name = "p", descriptor = "[I")
	public static final int[] anIntArray698 = new int[2];

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(BI)V")
	public static void method8221(@OriginalArg(1) int arg0) {
		if (Static11.anInt525 == 1) {
			Static725.anInt11246 = arg0;
		} else if (Static11.anInt525 == 2) {
			Static289.anInt4432 = arg0;
		}
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIIIIILjava/lang/String;I)V")
	public static void method8223(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) String arg5, @OriginalArg(7) int arg6) {
		@Pc(7) Class9_Sub7 local7 = new Class9_Sub7();
		local7.anInt8214 = arg1;
		local7.anInt8212 = arg3;
		local7.anInt8209 = arg0;
		local7.anInt8208 = arg2 + Static716.anInt11157;
		local7.anInt8210 = arg4;
		local7.anInt8211 = arg6;
		local7.aString102 = arg5;
		Static291.aClass319_4.method7196(local7);
	}

	@OriginalMember(owner = "client!tj", name = "c", descriptor = "(I)V")
	public static void method8226() {
		Static708.aClass3_Sub33_Sub3_4.method7884();
		Static243.aClass3_Sub33_Sub3_1 = null;
		Static224.aClass182_61 = null;
		Static599.anInt9088 = 1;
	}
}
