import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static127 {

	@OriginalMember(owner = "client!fd", name = "e", descriptor = "Lclient!vj;")
	public static final Class305 aClass305_116 = new Class305(27, 14);

	@OriginalMember(owner = "client!fd", name = "i", descriptor = "I")
	public static int anInt2590 = 0;

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIZZILclient!dn;)V")
	public static void method2441(@OriginalArg(0) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) Class69 arg2) {
		Static322.anInt6116 = 10000;
		Static471.aClass69_91 = arg2;
		Static179.anInt3754 = arg1;
		Static129.aBoolean226 = false;
		Static99.anInt2118 = 0;
		Static382.anInt6788 = arg0;
		Static283.anInt5391 = 1;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IZLclient!n;Ljava/awt/Canvas;)Lclient!qa;")
	public static Class4 method2442(@OriginalArg(1) boolean arg0, @OriginalArg(2) Interface13 arg1, @OriginalArg(3) Canvas arg2) {
		return arg0 ? new Class4_Sub1_Sub1(arg2, arg1) : new Class4_Sub1_Sub2(arg2, arg1);
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(III)Z")
	public static boolean method2443(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x84080) != 0;
	}
}
