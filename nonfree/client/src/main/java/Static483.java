import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static483 {

	@OriginalMember(owner = "client!ud", name = "A", descriptor = "Lclient!lv;")
	public static Class187 aClass187_1;

	@OriginalMember(owner = "client!ud", name = "D", descriptor = "Lclient!ada;")
	public static final Class6 aClass6_128 = new Class6(88, 2);

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lclient!vp;Lclient!qa;I)V")
	public static void method6989(@OriginalArg(0) Class309 arg0, @OriginalArg(1) Class9 arg1) {
		@Pc(31) boolean local31 = Static454.aClass153_2.method3998(arg0.anInt8741, arg0.aBoolean603 ? Static16.aClass47_Sub2_Sub3_Sub2_1.aClass258_1 : null, arg1, arg0.anInt8770 | 0xFF000000, arg0.anInt8733, arg0.anInt8735, arg0.anInt8719) == null;
		if (local31) {
			Static385.aClass38_53.method1426(new Class1_Sub43(arg0.anInt8735, arg0.anInt8741, arg0.anInt8719, arg0.anInt8770 | 0xFF000000, arg0.anInt8733, arg0.aBoolean603));
			Static291.method4908(arg0);
		}
	}
}
