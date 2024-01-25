import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static628 {

	@OriginalMember(owner = "client!vd", name = "c", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray37;

	@OriginalMember(owner = "client!vd", name = "e", descriptor = "[I")
	public static final int[] anIntArray871 = new int[4];

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(II)V")
	public static void method8786(@OriginalArg(1) int arg0) {
		if (arg0 == Static11.anInt126) {
			return;
		}
		Static158.anInt927 = Static515.anInt8292 = Static216.anIntArray362[arg0];
		Static585.method8258();
		Static242.anIntArrayArray47 = new int[Static158.anInt927][Static515.anInt8292];
		Static224.anIntArrayArray24 = new int[Static158.anInt927][Static515.anInt8292];
		Static637.anIntArrayArrayArray20 = new int[4][Static158.anInt927 >> 3][Static515.anInt8292 >> 3];
		for (@Pc(40) int local40 = 0; local40 < 4; local40++) {
			Static1.aClass252Array5[local40] = Static404.method5713(Static158.anInt927, Static515.anInt8292);
		}
		Static302.aByteArrayArrayArray18 = new byte[4][Static158.anInt927][Static515.anInt8292];
		Static476.method6892(Static515.anInt8292, Static158.anInt927);
		Static14.method193(Static158.anInt927 >> 3, Static515.anInt8292 >> 3, Static674.aClass13_22);
		Static11.anInt126 = arg0;
	}
}
