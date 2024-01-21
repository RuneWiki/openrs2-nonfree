import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static147 {

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "Lclient!fj;")
	public static Class2_Sub2_Sub5_Sub1_Sub1 aClass2_Sub2_Sub5_Sub1_Sub1_6;

	@OriginalMember(owner = "client!pe", name = "f", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_1179 = Static181.method2795("RuneScape is loading )2 please wait)3)3)3");

	@OriginalMember(owner = "client!pe", name = "d", descriptor = "Lclient!qe;")
	public static Class83 aClass83_1177 = aClass83_1179;

	@OriginalMember(owner = "client!pe", name = "e", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_1178 = Static181.method2795("Spielwelt erstellt)3");

	@OriginalMember(owner = "client!pe", name = "g", descriptor = "Lclient!sg;")
	public static final Class91 aClass91_15 = new Class91(4);

	@OriginalMember(owner = "client!pe", name = "j", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_1180 = Static181.method2795("::fps ");

	@OriginalMember(owner = "client!pe", name = "k", descriptor = "Z")
	public static boolean aBoolean187 = false;

	@OriginalMember(owner = "client!pe", name = "l", descriptor = "[I")
	public static final int[] anIntArray401 = new int[1000];

	@OriginalMember(owner = "client!pe", name = "m", descriptor = "I")
	public static int anInt4074 = 0;

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZIZZB)Lclient!ee;")
	public static Class28_Sub1 method3113(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		@Pc(5) Class8 local5 = null;
		if (Static161.aClass67_2 != null) {
			local5 = new Class8(arg1, Static161.aClass67_2, Static123.aClass67Array1[arg1], 1000000);
		}
		return new Class28_Sub1(local5, Static152.aClass8_4, arg1, arg2, arg0, arg3);
	}
}
