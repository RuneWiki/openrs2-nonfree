import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static202 {

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(II)V", line = 72)
	public static void method3796(@OriginalArg(1) int arg0) {
		if (arg0 == Class28.anInt752) {
			return;
		}
		Class241.anInt7020 = OutputStream_Sub1.anInt4442 = Class233.anIntArray449[arg0];
		Static177.aClass19_8.method2874(50, (int) ((double) Class241.anInt7020 * 34.46D));
		Static278.anIntArrayArray50 = new int[Class241.anInt7020][OutputStream_Sub1.anInt4442];
		Static296.anIntArrayArray51 = new int[Class241.anInt7020][OutputStream_Sub1.anInt4442];
		Static287.anIntArrayArrayArray12 = new int[4][Class241.anInt7020 >> 3][OutputStream_Sub1.anInt4442 >> 3];
		for (@Pc(42) int local42 = 0; local42 < 4; local42++) {
			Class2_Sub3_Sub18.aClass46Array1[local42] = Static23.method853(OutputStream_Sub1.anInt4442, Class241.anInt7020);
		}
		Static213.aByteArrayArrayArray13 = new byte[4][Class241.anInt7020][OutputStream_Sub1.anInt4442];
		Static219.method4105(Class241.anInt7020, OutputStream_Sub1.anInt4442);
		Static177.method3501(OutputStream_Sub1.anInt4442 >> 3, Class241.anInt7020 >> 3, Static177.aClass19_8);
		Class28.anInt752 = arg0;
	}

	@OriginalMember(owner = "client!mn", name = "b", descriptor = "(Lclient!bt;B)Lclient!pd;", line = 224)
	public static Class173_Sub2 method3800(@OriginalArg(0) Class2_Sub4 arg0) {
		return new Class173_Sub2(arg0.method4824(), arg0.method4824(), arg0.method4824(), arg0.method4824(), arg0.method4834(), arg0.method4834(), arg0.method4816());
	}
}
