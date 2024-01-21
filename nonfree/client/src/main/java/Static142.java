import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static142 {

	@OriginalMember(owner = "client!pe", name = "f", descriptor = "[I")
	public static int[] anIntArray393;

	@OriginalMember(owner = "client!pe", name = "l", descriptor = "Lclient!sd;")
	public static Class60 aClass60_29;

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_1978 = Static118.method2249("wave2:");

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "[I")
	public static final int[] anIntArray392 = new int[1000];

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "I")
	public static int anInt3429 = -1;

	@OriginalMember(owner = "client!pe", name = "e", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_1979 = aClass65_1978;

	@OriginalMember(owner = "client!pe", name = "g", descriptor = "Lclient!oc;")
	public static Class65 aClass65_1980 = aClass65_1978;

	@OriginalMember(owner = "client!pe", name = "h", descriptor = "Lclient!k;")
	public static final Class1_Sub14_Sub1 aClass1_Sub14_Sub1_33 = new Class1_Sub14_Sub1(5000);

	@OriginalMember(owner = "client!pe", name = "i", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_1981 = Static118.method2249("skill)2");

	@OriginalMember(owner = "client!pe", name = "j", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_1982 = Static118.method2249("To create a new account you need to");

	@OriginalMember(owner = "client!pe", name = "n", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_1984 = Static118.method2249("Select");

	@OriginalMember(owner = "client!pe", name = "k", descriptor = "Lclient!oc;")
	public static Class65 aClass65_1983 = aClass65_1984;

	@OriginalMember(owner = "client!pe", name = "m", descriptor = "[I")
	public static final int[] anIntArray394 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

	@OriginalMember(owner = "client!pe", name = "o", descriptor = "Lclient!oc;")
	public static Class65 aClass65_1985 = aClass65_1982;

	@OriginalMember(owner = "client!pe", name = "p", descriptor = "Lclient!oc;")
	public static Class65 aClass65_1986 = aClass65_1981;

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIILclient!wg;IJIIII)Z")
	public static boolean method2620(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class6 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) long arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		return arg4 == null ? true : Static191.method3153(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Z)V")
	public static void method2621() {
		for (@Pc(10) int local10 = -1; local10 < Static44.anInt1123; local10++) {
			@Pc(17) int local17;
			if (local10 == -1) {
				local17 = 2047;
			} else {
				local17 = Static138.anIntArray385[local10];
			}
			@Pc(26) Class6_Sub4_Sub1 local26 = Static158.aClass6_Sub4_Sub1Array1[local17];
			if (local26 != null) {
				Static148.method2649(local26, 1);
			}
		}
	}
}
