import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!go", name = "f", descriptor = "Lclient!mf;")
	public static Class156 aClass156_1 = new Class156();

	@OriginalMember(owner = "client!go", name = "k", descriptor = "Lclient!ap;")
	public static final Class11 aClass11_40 = new Class11(24, 3);

	@OriginalMember(owner = "client!go", name = "n", descriptor = "Lclient!eo;")
	public static final Class62 aClass62_3 = new Class62(2, 14);

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(ZIBIZ)V")
	public static void method2354(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		Static96.method1917(0, arg1, arg2, arg0, arg3, Static380.aClass138_Sub1Array2.length - 1);
		Static170.aClass2_Sub21_2 = null;
		Static146.anInt2918 = 0;
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(IIILjava/lang/String;IIII)V")
	public static void method2357(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) Class10_Sub2 local7 = new Class10_Sub2();
		local7.anInt780 = arg2;
		local7.anInt787 = arg6;
		local7.aString11 = arg3;
		local7.anInt791 = arg5 + Static253.anInt4469;
		local7.anInt789 = arg4;
		local7.anInt785 = arg1;
		local7.anInt784 = arg0;
		Static163.aClass154_4.method3481(local7);
	}
}
