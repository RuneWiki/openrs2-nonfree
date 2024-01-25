import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static155 {

	@OriginalMember(owner = "client!ff", name = "Y", descriptor = "[Z")
	public static boolean[] aBooleanArray3;

	@OriginalMember(owner = "client!ff", name = "Qb", descriptor = "[[B")
	public static byte[][] aByteArrayArray8;

	@OriginalMember(owner = "client!ff", name = "Ac", descriptor = "I")
	public static int anInt2639;

	@OriginalMember(owner = "client!ff", name = "xb", descriptor = "I")
	public static int anInt2603 = -1;

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lclient!ha;I)V")
	public static void method2355(@OriginalArg(0) Class143 arg0) {
		if (Static423.aBoolean549) {
			Static515.method3297(arg0);
		} else {
			Static92.method1424(arg0);
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(ILclient!rv;ILclient!kj;)V")
	public static void method2356(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub15 arg1, @OriginalArg(3) Class202 arg2) {
		@Pc(7) Class5_Sub52 local7 = new Class5_Sub52();
		local7.anInt9816 = arg1.method3642();
		local7.anInt9815 = arg1.method3671();
		local7.anIntArray558 = new int[local7.anInt9816];
		local7.aClass297Array2 = new Class297[local7.anInt9816];
		local7.anIntArray559 = new int[local7.anInt9816];
		local7.aClass297Array1 = new Class297[local7.anInt9816];
		local7.anIntArray560 = new int[local7.anInt9816];
		local7.aByteArrayArrayArray17 = new byte[local7.anInt9816][][];
		for (@Pc(59) int local59 = 0; local59 < local7.anInt9816; local59++) {
			try {
				@Pc(64) int local64 = arg1.method3642();
				@Pc(78) String local78;
				@Pc(82) String local82;
				@Pc(84) int local84;
				if (local64 == 0 || local64 == 1 || local64 == 2) {
					local78 = arg1.method3661();
					local82 = arg1.method3661();
					local84 = 0;
					if (local64 == 1) {
						local84 = arg1.method3671();
					}
					local7.anIntArray558[local59] = local64;
					local7.anIntArray560[local59] = local84;
					local7.aClass297Array1[local59] = arg2.method4725(local82, Static556.method7636(local78));
				} else if (local64 == 3 || local64 == 4) {
					local78 = arg1.method3661();
					local82 = arg1.method3661();
					local84 = arg1.method3642();
					@Pc(136) String[] local136 = new String[local84];
					for (@Pc(138) int local138 = 0; local138 < local84; local138++) {
						local136[local138] = arg1.method3661();
					}
					@Pc(156) byte[][] local156 = new byte[local84][];
					@Pc(170) int local170;
					if (local64 == 3) {
						for (@Pc(163) int local163 = 0; local163 < local84; local163++) {
							local170 = arg1.method3671();
							local156[local163] = new byte[local170];
							arg1.method3650(0, local170, local156[local163]);
						}
					}
					local7.anIntArray558[local59] = local64;
					@Pc(199) Class[] local199 = new Class[local84];
					for (local170 = 0; local170 < local84; local170++) {
						local199[local170] = Static556.method7636(local136[local170]);
					}
					local7.aClass297Array2[local59] = arg2.method4738(Static556.method7636(local78), local199, local82);
					local7.aByteArrayArrayArray17[local59] = local156;
				}
			} catch (@Pc(239) ClassNotFoundException local239) {
				local7.anIntArray559[local59] = -1;
			} catch (@Pc(246) SecurityException local246) {
				local7.anIntArray559[local59] = -2;
			} catch (@Pc(253) NullPointerException local253) {
				local7.anIntArray559[local59] = -3;
			} catch (@Pc(260) Exception local260) {
				local7.anIntArray559[local59] = -4;
			} catch (@Pc(267) Throwable local267) {
				local7.anIntArray559[local59] = -5;
			}
		}
		Static608.aClass124_98.method2574(local7);
	}
}
