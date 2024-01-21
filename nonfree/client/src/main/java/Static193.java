import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static193 {

	@OriginalMember(owner = "client!wa", name = "d", descriptor = "[I")
	public static int[] anIntArray517;

	@OriginalMember(owner = "client!wa", name = "c", descriptor = "I")
	public static int anInt4408 = 0;

	@OriginalMember(owner = "client!wa", name = "f", descriptor = "Z")
	public static boolean aBoolean174 = true;

	@OriginalMember(owner = "client!wa", name = "i", descriptor = "I")
	public static int anInt4411 = 0;

	@OriginalMember(owner = "client!wa", name = "l", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1706 = Static120.method1824(" <col=ffffff>");

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IILclient!lb;[B)V")
	public static void method3104(@OriginalArg(0) int arg0, @OriginalArg(2) Class53 arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(15) Class3_Sub12 local15 = new Class3_Sub12();
		local15.aLong154 = arg0;
		local15.aByteArray12 = arg2;
		local15.anInt1546 = 0;
		local15.aClass53_3 = arg1;
		@Pc(30) Class70 local30 = Static118.aClass70_14;
		synchronized (Static118.aClass70_14) {
			Static118.aClass70_14.method1958(local15);
		}
		Static29.method489();
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(B)V")
	public static void method3105() {
		Static96.aBoolean83 = true;
		aBoolean174 = true;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lclient!bc;Lclient!bc;B)V")
	public static void method3106(@OriginalArg(0) Class1 arg0, @OriginalArg(1) Class1 arg1) {
		Static34.aClass1_5 = arg1;
		Static169.aClass1_10 = arg0;
		Static174.anInt3931 = Static34.aClass1_5.method56(3);
	}
}
