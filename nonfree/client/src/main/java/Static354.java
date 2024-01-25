import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static354 {

	@OriginalMember(owner = "client!np", name = "e", descriptor = "F")
	public static float aFloat177;

	@OriginalMember(owner = "client!np", name = "g", descriptor = "[I")
	public static final int[] anIntArray387 = new int[] { 4, 4, 1, 2, 6, 4, 2, 44, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0 };

	@OriginalMember(owner = "client!np", name = "r", descriptor = "Lclient!ci;")
	public static final Class42 aClass42_4 = new Class42("runescape", 0);

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(I[SI)[S")
	public static short[] method5273(@OriginalArg(0) int arg0, @OriginalArg(1) short[] arg1) {
		@Pc(6) short[] local6 = new short[arg0];
		Static598.method771(arg1, 0, local6, 0, arg0);
		return local6;
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(Lclient!in;Lclient!in;B)V")
	public static void method5277(@OriginalArg(0) Class160 arg0, @OriginalArg(1) Class160 arg1) {
		@Pc(20) Class1_Sub9 local20 = Static123.method2194(Static469.aClass235_2, Static10.aClass208_5);
		local20.aClass1_Sub3_Sub1_1.method7936(arg0.anInt4199);
		local20.aClass1_Sub3_Sub1_1.method7923(arg0.anInt4205);
		local20.aClass1_Sub3_Sub1_1.method7918(arg1.anInt4146);
		local20.aClass1_Sub3_Sub1_1.method7956(arg1.anInt4199);
		local20.aClass1_Sub3_Sub1_1.method7937(arg0.anInt4146);
		local20.aClass1_Sub3_Sub1_1.method7912(arg1.anInt4205);
		Static42.method746(local20);
	}
}
