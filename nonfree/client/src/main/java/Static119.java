import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static119 {

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "Lclient!ke;")
	public static Class1_Sub2_Sub4 aClass1_Sub2_Sub4_3;

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "I")
	public static int anInt3086;

	@OriginalMember(owner = "client!ka", name = "f", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray9;

	@OriginalMember(owner = "client!ka", name = "i", descriptor = "Lclient!hc;")
	public static Class51 aClass51_40;

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(B)V")
	public static void method2347() {
		Static80.anInt2172++;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIB)V")
	public static void method2348(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub2_Sub18 local8 = Static13.method232(arg2, 9);
		local8.method3810();
		local8.anInt5009 = arg1;
		local8.anInt5015 = arg0;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!hc;I)V")
	public static void method2349(@OriginalArg(0) Class51 arg0) {
		Static147.aClass51_50 = arg0;
	}
}
