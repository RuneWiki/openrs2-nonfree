import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static402 {

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "I")
	public static int anInt7661 = 0;

	@OriginalMember(owner = "client!pi", name = "e", descriptor = "Lclient!jk;")
	public static final Class173 aClass173_96 = new Class173(9, -1);

	@OriginalMember(owner = "client!pi", name = "g", descriptor = "Z")
	public static boolean aBoolean525 = false;

	@OriginalMember(owner = "client!pi", name = "h", descriptor = "[S")
	private static final short[] aShortArray99 = new short[] { 957, 20418, -21587, 11209, -10300 };

	@OriginalMember(owner = "client!pi", name = "l", descriptor = "[S")
	private static final short[] aShortArray101 = new short[] { 967, 20428, -21577, 11219, -10290 };

	@OriginalMember(owner = "client!pi", name = "k", descriptor = "[S")
	private static final short[] aShortArray100 = new short[] { 962, 20423, -21582, 11214, -10295 };

	@OriginalMember(owner = "client!pi", name = "m", descriptor = "[S")
	private static final short[] aShortArray102 = new short[] { 952, 20413, -21592, 11204, -10305 };

	@OriginalMember(owner = "client!pi", name = "i", descriptor = "[[S")
	public static final short[][] aShortArrayArray3 = new short[][] { aShortArray101, aShortArray100, aShortArray99, aShortArray102 };

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIIIII)V")
	public static void method6327(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(11) int local11 = arg2; local11 <= arg0; local11++) {
			Static306.method5239(Static46.anIntArrayArray4[local11], arg1, arg3, arg4);
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lclient!jn;B)V")
	public static void method6329(@OriginalArg(0) Class176 arg0) {
		Static15.anInt242 = 0;
		Static507.anInt9086 = 0;
		Static128.aClass136_4 = new Class136();
		Static55.aClass1_Sub1_Sub1_Sub1Array7 = new Class1_Sub1_Sub1_Sub1[1024];
		Static437.aClass1_Sub2Array1 = new Class1_Sub2[Static231.anIntArray204[Static224.anInt4124] + 1];
		Static249.anInt4563 = 0;
		Static216.anInt7428 = 0;
		Static175.method3184(arg0);
		Static314.method5292(arg0);
	}
}
