import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static364 {

	@OriginalMember(owner = "client!wo", name = "s", descriptor = "Lclient!fc;")
	public static Class54 aClass54_2;

	@OriginalMember(owner = "client!wo", name = "u", descriptor = "Lclient!df;")
	public static Class33 aClass33_4;

	@OriginalMember(owner = "client!wo", name = "w", descriptor = "Lclient!ct;")
	public static Class30 aClass30_109;

	@OriginalMember(owner = "client!wo", name = "q", descriptor = "Lclient!vq;")
	public static final Class217 aClass217_214 = new Class217(59, -2);

	@OriginalMember(owner = "client!wo", name = "t", descriptor = "Z")
	public static boolean aBoolean510 = false;

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(II)Lclient!vh;")
	public static Class1_Sub4_Sub21 method6049(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub4_Sub21 local10 = (Class1_Sub4_Sub21) Static272.aClass44_8.method1612((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static336.aClass30_97.method1161(arg0, 19);
		local10 = new Class1_Sub4_Sub21();
		if (local25 != null) {
			local10.method5716(new Class1_Sub7(local25));
		}
		Static272.aClass44_8.method1616((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(Ljava/awt/Canvas;ZLclient!ic;I)Lclient!fp;")
	public static Class63 method6050(@OriginalArg(0) Canvas arg0, @OriginalArg(2) Interface3 arg1, @OriginalArg(3) int arg2) {
		return new Class63_Sub2(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(Lclient!ct;ILclient!ct;)V")
	public static void method6052(@OriginalArg(0) Class30 arg0, @OriginalArg(2) Class30 arg1) {
		Static157.aClass30_47 = arg1;
		Static30.aClass30_6 = arg0;
	}
}
