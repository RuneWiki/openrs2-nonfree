import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!ae", name = "w", descriptor = "[S")
	public static short[] aShortArray7;

	@OriginalMember(owner = "client!ae", name = "E", descriptor = "[Lclient!sg;")
	public static Class77[] aClass77Array1;

	@OriginalMember(owner = "client!ae", name = "M", descriptor = "I")
	public static int anInt181;

	@OriginalMember(owner = "client!ae", name = "N", descriptor = "[Lclient!bg;")
	public static Class2_Sub2_Sub3_Sub2[] aClass2_Sub2_Sub3_Sub2Array1;

	@OriginalMember(owner = "client!ae", name = "u", descriptor = "I")
	public static int anInt174 = -1;

	@OriginalMember(owner = "client!ae", name = "v", descriptor = "I")
	public static int anInt175 = 0;

	@OriginalMember(owner = "client!ae", name = "z", descriptor = "[I")
	public static int[] anIntArray24 = new int[2000];

	@OriginalMember(owner = "client!ae", name = "A", descriptor = "[I")
	public static int[] anIntArray25 = new int[2048];

	@OriginalMember(owner = "client!ae", name = "C", descriptor = "Lclient!sg;")
	private static Class77 aClass77_60 = Static146.method2172("Loading interfaces )2 ");

	@OriginalMember(owner = "client!ae", name = "F", descriptor = "Lclient!sg;")
	public static Class77 aClass77_61 = Static146.method2172(" <col=ffffff>");

	@OriginalMember(owner = "client!ae", name = "G", descriptor = "Lclient!sg;")
	public static Class77 aClass77_62 = Static146.method2172(")4l");

	@OriginalMember(owner = "client!ae", name = "I", descriptor = "Lclient!ua;")
	public static Class82 aClass82_3 = new Class82(5);

	@OriginalMember(owner = "client!ae", name = "J", descriptor = "Lclient!sg;")
	public static Class77 aClass77_63 = Static146.method2172("gr-Un:");

	@OriginalMember(owner = "client!ae", name = "L", descriptor = "Lclient!sg;")
	public static Class77 aClass77_64 = aClass77_60;

	@OriginalMember(owner = "client!ae", name = "O", descriptor = "[I")
	public static int[] anIntArray26 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!ae", name = "P", descriptor = "I")
	public static int anInt182 = 1;

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lclient!ma;Lclient!oa;IB)V")
	public static void method106(@OriginalArg(0) Class50 arg0, @OriginalArg(1) Class2_Sub18 arg1, @OriginalArg(2) int arg2) {
		@Pc(9) Class2_Sub15 local9 = new Class2_Sub15();
		local9.anInt2057 = arg1.method2387();
		local9.anInt2059 = arg1.method2382();
		local9.anIntArray350 = new int[local9.anInt2057];
		local9.anIntArray349 = new int[local9.anInt2057];
		local9.aByteArrayArrayArray3 = new byte[local9.anInt2057][][];
		local9.aClass78Array2 = new Class78[local9.anInt2057];
		local9.aClass78Array1 = new Class78[local9.anInt2057];
		local9.anIntArray348 = new int[local9.anInt2057];
		for (@Pc(56) int local56 = 0; local56 < local9.anInt2057; local56++) {
			try {
				@Pc(62) int local62 = arg1.method2387();
				@Pc(84) String local84;
				@Pc(95) String local95;
				@Pc(86) int local86;
				if (local62 == 0 || local62 == 1 || local62 == 2) {
					local84 = new String(arg1.method2361().method2506());
					local86 = 0;
					local95 = new String(arg1.method2361().method2506());
					if (local62 == 1) {
						local86 = arg1.method2382();
					}
					local9.anIntArray348[local56] = local62;
					local9.anIntArray350[local56] = local86;
					local9.aClass78Array1[local56] = arg0.method1750(local95, Static52.method987(local84));
				} else if (local62 == 3 || local62 == 4) {
					local84 = new String(arg1.method2361().method2506());
					local95 = new String(arg1.method2361().method2506());
					local86 = arg1.method2387();
					@Pc(158) String[] local158 = new String[local86];
					for (@Pc(160) int local160 = 0; local160 < local86; local160++) {
						local158[local160] = new String(arg1.method2361().method2506());
					}
					@Pc(184) byte[][] local184 = new byte[local86][];
					@Pc(195) int local195;
					if (local62 == 3) {
						for (@Pc(189) int local189 = 0; local189 < local86; local189++) {
							local195 = arg1.method2382();
							local184[local189] = new byte[local195];
							arg1.method2354(local195, local184[local189]);
						}
					}
					local9.anIntArray348[local56] = local62;
					@Pc(224) Class[] local224 = new Class[local86];
					for (local195 = 0; local195 < local86; local195++) {
						local224[local195] = Static52.method987(local158[local195]);
					}
					local9.aClass78Array2[local56] = arg0.method1746(Static52.method987(local84), local224, local95);
					local9.aByteArrayArrayArray3[local56] = local184;
				}
			} catch (@Pc(259) ClassNotFoundException local259) {
				local9.anIntArray349[local56] = -1;
			} catch (@Pc(266) SecurityException local266) {
				local9.anIntArray349[local56] = -2;
			} catch (@Pc(273) NullPointerException local273) {
				local9.anIntArray349[local56] = -3;
			} catch (@Pc(280) Exception local280) {
				local9.anIntArray349[local56] = -4;
			} catch (@Pc(287) Throwable local287) {
				local9.anIntArray349[local56] = -5;
			}
		}
		Static13.aClass10_15.method448(local9);
	}

	@OriginalMember(owner = "client!ae", name = "d", descriptor = "(I)V")
	public static void method107() {
		aClass77_63 = null;
		aClass77_64 = null;
		anIntArray25 = null;
		aShortArray7 = null;
		anIntArray26 = null;
		aClass2_Sub2_Sub3_Sub2Array1 = null;
		aClass82_3 = null;
		aClass77Array1 = null;
		aClass77_61 = null;
		aClass77_60 = null;
		anIntArray24 = null;
		aClass77_62 = null;
	}
}
