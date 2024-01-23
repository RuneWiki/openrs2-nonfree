import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static223 {

	@OriginalMember(owner = "client!wb", name = "y", descriptor = "[I")
	public static int[] anIntArray372 = new int[4096];

	@OriginalMember(owner = "client!wb", name = "z", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1595 = Static64.method1101("scrollbar");

	@OriginalMember(owner = "client!wb", name = "A", descriptor = "Z")
	public static boolean aBoolean211 = false;

	@OriginalMember(owner = "client!wb", name = "G", descriptor = "Lclient!ia;")
	private static Class51 aClass51_1597 = Static64.method1101("Loaded input handler");

	@OriginalMember(owner = "client!wb", name = "B", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1596 = aClass51_1597;

	@OriginalMember(owner = "client!wb", name = "E", descriptor = "[I")
	public static int[] anIntArray373 = new int[128];

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lclient!k;Lclient!mi;II)V")
	public static void method3661(@OriginalArg(0) Class1_Sub16 arg0, @OriginalArg(1) Class72 arg1, @OriginalArg(2) int arg2) {
		@Pc(9) Class1_Sub25 local9 = new Class1_Sub25();
		local9.anInt4681 = arg0.method3793();
		local9.anInt4682 = arg0.method3784();
		local9.anIntArray370 = new int[local9.anInt4681];
		local9.aClass38Array1 = new Class38[local9.anInt4681];
		local9.aByteArrayArrayArray14 = new byte[local9.anInt4681][][];
		local9.aClass38Array2 = new Class38[local9.anInt4681];
		local9.anIntArray371 = new int[local9.anInt4681];
		local9.anIntArray374 = new int[local9.anInt4681];
		for (@Pc(51) int local51 = 0; local51 < local9.anInt4681; local51++) {
			try {
				@Pc(57) int local57 = arg0.method3793();
				@Pc(77) String local77;
				@Pc(88) String local88;
				@Pc(90) int local90;
				if (local57 == 0 || local57 == 1 || local57 == 2) {
					local77 = new String(arg0.method3781().method1387());
					local88 = new String(arg0.method3781().method1387());
					local90 = 0;
					if (local57 == 1) {
						local90 = arg0.method3784();
					}
					local9.anIntArray371[local51] = local57;
					local9.anIntArray370[local51] = local90;
					local9.aClass38Array1[local51] = arg1.method2252(Static191.method3193(local77), local88);
				} else if (local57 == 3 || local57 == 4) {
					local77 = new String(arg0.method3781().method1387());
					local88 = new String(arg0.method3781().method1387());
					local90 = arg0.method3793();
					@Pc(155) String[] local155 = new String[local90];
					for (@Pc(157) int local157 = 0; local157 < local90; local157++) {
						local155[local157] = new String(arg0.method3781().method1387());
					}
					@Pc(181) byte[][] local181 = new byte[local90][];
					@Pc(196) int local196;
					if (local57 == 3) {
						for (@Pc(188) int local188 = 0; local188 < local90; local188++) {
							local196 = arg0.method3784();
							local181[local188] = new byte[local196];
							arg0.method3792(local181[local188], local196);
						}
					}
					local9.anIntArray371[local51] = local57;
					@Pc(221) Class[] local221 = new Class[local90];
					for (local196 = 0; local196 < local90; local196++) {
						local221[local196] = Static191.method3193(local155[local196]);
					}
					local9.aClass38Array2[local51] = arg1.method2245(local88, local221, Static191.method3193(local77));
					local9.aByteArrayArrayArray14[local51] = local181;
				}
			} catch (@Pc(260) ClassNotFoundException local260) {
				local9.anIntArray374[local51] = -1;
			} catch (@Pc(267) SecurityException local267) {
				local9.anIntArray374[local51] = -2;
			} catch (@Pc(274) NullPointerException local274) {
				local9.anIntArray374[local51] = -3;
			} catch (@Pc(281) Exception local281) {
				local9.anIntArray374[local51] = -4;
			} catch (@Pc(288) Throwable local288) {
				local9.anIntArray374[local51] = -5;
			}
		}
		Static102.aClass105_12.method3119(local9);
	}
}
