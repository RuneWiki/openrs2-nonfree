import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static125 {

	@OriginalMember(owner = "client!en", name = "m", descriptor = "Lclient!qv;")
	public static final Class271 aClass271_2 = new Class271(0, 1);

	@OriginalMember(owner = "client!en", name = "v", descriptor = "[Lclient!iaa;")
	public static final Class6_Sub26[] aClass6_Sub26Array1 = new Class6_Sub26[2048];

	@OriginalMember(owner = "client!en", name = "b", descriptor = "(II)I")
	public static int method2480(@OriginalArg(0) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(III)Lclient!fj;")
	public static Class11_Sub3 method2481(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class224 local7 = Static256.aClass224ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass11_Sub3_1;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IIIII)V")
	public static void method2482(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class6_Sub4_Sub6 local8 = Static68.method1408(10, arg2);
		local8.method3826();
		local8.anInt4405 = arg3;
		local8.anInt4399 = arg0;
		local8.anInt4403 = arg1;
	}
}
