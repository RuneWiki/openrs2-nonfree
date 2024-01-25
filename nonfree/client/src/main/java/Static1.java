import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static1 {

	@OriginalMember(owner = "client!a", name = "b", descriptor = "[[B")
	public static byte[][] aByteArrayArray1;

	@OriginalMember(owner = "client!a", name = "d", descriptor = "Lclient!ed;")
	public static Class55 aClass55_1;

	@OriginalMember(owner = "client!a", name = "a", descriptor = "Lclient!vr;")
	public static final Class266 aClass266_1 = new Class266(15, 0, 1, 0);

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IIZLclient!ci;II)V")
	public static void method2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class38 arg2) {
		Static236.aClass38_50 = arg2;
		Static410.anInt7145 = arg1;
		Static445.anInt7575 = 1;
		Static335.anInt5946 = 10000;
		Static263.anInt5010 = arg0;
		Static242.aBoolean314 = false;
		Static395.anInt6972 = 0;
	}
}
