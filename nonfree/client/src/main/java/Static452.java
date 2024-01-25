import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static452 {

	@OriginalMember(owner = "client!tca", name = "L", descriptor = "Lclient!qa;")
	public static Class39 aClass39_10;

	@OriginalMember(owner = "client!tca", name = "I", descriptor = "I")
	public static int anInt8228 = 0;

	@OriginalMember(owner = "client!tca", name = "K", descriptor = "Z")
	public static boolean aBoolean600 = false;

	@OriginalMember(owner = "client!tca", name = "O", descriptor = "[B")
	public static final byte[] aByteArray107 = new byte[2048];

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(IJ)V")
	public static void method6902(@OriginalArg(1) long arg0) {
		Static381.aClass2_Sub29_Sub2_2.anInt6132 = 0;
		Static381.aClass2_Sub29_Sub2_2.method5172(Static319.aClass117_8.anInt3345);
		Static381.aClass2_Sub29_Sub2_2.method5192(arg0);
		Static381.aClass2_Sub29_Sub2_2.method5172(Static172.anInt6352);
		Static55.anInt972 = -3;
		Static378.anInt7010 = 1;
		Static520.anInt1939 = 0;
		Static527.anInt9119 = 0;
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(IB)V")
	public static void method6903(@OriginalArg(0) int arg0) {
		@Pc(16) Class2_Sub13_Sub15 local16 = Static370.method5893(arg0, 7);
		local16.method6974();
	}

	@OriginalMember(owner = "client!tca", name = "b", descriptor = "(B)J")
	public static long method6904() {
		return Static306.aClass72_1.method6799();
	}
}
