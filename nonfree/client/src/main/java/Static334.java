import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static334 {

	@OriginalMember(owner = "client!lda", name = "L", descriptor = "I")
	public static int anInt6089 = -1;

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(Lclient!cea;Lclient!ol;IB)V")
	public static void method5510(@OriginalArg(0) Class48 arg0, @OriginalArg(1) Class2_Sub8 arg1, @OriginalArg(2) int arg2) {
		@Pc(9) Class2_Sub4 local9 = new Class2_Sub4();
		local9.anInt491 = arg1.method5203();
		local9.anInt493 = arg1.method5172();
		local9.aByteArrayArrayArray1 = new byte[local9.anInt491][][];
		local9.anIntArray39 = new int[local9.anInt491];
		local9.anIntArray41 = new int[local9.anInt491];
		local9.aClass268Array2 = new Class268[local9.anInt491];
		local9.aClass268Array1 = new Class268[local9.anInt491];
		local9.anIntArray40 = new int[local9.anInt491];
		for (@Pc(51) int local51 = 0; local51 < local9.anInt491; local51++) {
			try {
				@Pc(57) int local57 = arg1.method5203();
				@Pc(72) String local72;
				@Pc(76) String local76;
				@Pc(78) int local78;
				if (local57 == 0 || local57 == 1 || local57 == 2) {
					local72 = arg1.method5178();
					local76 = arg1.method5178();
					local78 = 0;
					if (local57 == 1) {
						local78 = arg1.method5172();
					}
					local9.anIntArray41[local51] = local57;
					local9.anIntArray40[local51] = local78;
					local9.aClass268Array1[local51] = arg0.method1314(Static93.method9378(local72), local76);
				} else if (local57 == 3 || local57 == 4) {
					local72 = arg1.method5178();
					local76 = arg1.method5178();
					local78 = arg1.method5203();
					@Pc(135) String[] local135 = new String[local78];
					for (@Pc(137) int local137 = 0; local137 < local78; local137++) {
						local135[local137] = arg1.method5178();
					}
					@Pc(156) byte[][] local156 = new byte[local78][];
					@Pc(169) int local169;
					if (local57 == 3) {
						for (@Pc(163) int local163 = 0; local163 < local78; local163++) {
							local169 = arg1.method5172();
							local156[local163] = new byte[local169];
							arg1.method5176(local156[local163], 0, local169);
						}
					}
					local9.anIntArray41[local51] = local57;
					@Pc(194) Class[] local194 = new Class[local78];
					for (local169 = 0; local169 < local78; local169++) {
						local194[local169] = Static93.method9378(local135[local169]);
					}
					local9.aClass268Array2[local51] = arg0.method1313(Static93.method9378(local72), local194, local76);
					local9.aByteArrayArrayArray1[local51] = local156;
				}
			} catch (@Pc(229) ClassNotFoundException local229) {
				local9.anIntArray39[local51] = -1;
			} catch (@Pc(236) SecurityException local236) {
				local9.anIntArray39[local51] = -2;
			} catch (@Pc(243) NullPointerException local243) {
				local9.anIntArray39[local51] = -3;
			} catch (@Pc(250) Exception local250) {
				local9.anIntArray39[local51] = -4;
			} catch (@Pc(257) Throwable local257) {
				local9.anIntArray39[local51] = -5;
			}
		}
		Static663.aClass271_67.method7174(local9);
	}
}
