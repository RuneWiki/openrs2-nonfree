import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static214 {

	@OriginalMember(owner = "client!ica", name = "i", descriptor = "I")
	public static int anInt5682;

	@OriginalMember(owner = "client!ica", name = "h", descriptor = "I")
	public static int anInt5681 = 0;

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(Lclient!eh;IZLclient!ii;)V")
	public static void method4827(@OriginalArg(0) Class4_Sub9 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class161 arg2) {
		@Pc(9) Class4_Sub5 local9 = new Class4_Sub5();
		local9.anInt453 = arg0.method6015();
		local9.anInt455 = arg0.method6026();
		local9.aClass299Array2 = new Class299[local9.anInt453];
		local9.anIntArray104 = new int[local9.anInt453];
		local9.aClass299Array1 = new Class299[local9.anInt453];
		local9.aByteArrayArrayArray1 = new byte[local9.anInt453][][];
		local9.anIntArray105 = new int[local9.anInt453];
		local9.anIntArray107 = new int[local9.anInt453];
		for (@Pc(56) int local56 = 0; local56 < local9.anInt453; local56++) {
			try {
				@Pc(62) int local62 = arg0.method6015();
				@Pc(86) String local86;
				@Pc(90) String local90;
				@Pc(94) int local94;
				if (local62 == 0 || local62 == 1 || local62 == 2) {
					local86 = arg0.method6010();
					local90 = arg0.method6010();
					local94 = 0;
					if (local62 == 1) {
						local94 = arg0.method6026();
					}
					local9.anIntArray104[local56] = local62;
					local9.anIntArray107[local56] = local94;
					local9.aClass299Array2[local56] = arg2.method3814(Static448.method6328(local86), local90);
				} else if (local62 == 3 || local62 == 4) {
					local86 = arg0.method6010();
					local90 = arg0.method6010();
					local94 = arg0.method6015();
					@Pc(97) String[] local97 = new String[local94];
					for (@Pc(99) int local99 = 0; local99 < local94; local99++) {
						local97[local99] = arg0.method6010();
					}
					@Pc(114) byte[][] local114 = new byte[local94][];
					@Pc(125) int local125;
					if (local62 == 3) {
						for (@Pc(119) int local119 = 0; local119 < local94; local119++) {
							local125 = arg0.method6026();
							local114[local119] = new byte[local125];
							arg0.method5966(local125, local114[local119]);
						}
					}
					local9.anIntArray104[local56] = local62;
					@Pc(150) Class[] local150 = new Class[local94];
					for (local125 = 0; local125 < local94; local125++) {
						local150[local125] = Static448.method6328(local97[local125]);
					}
					local9.aClass299Array1[local56] = arg2.method3824(local150, local90, Static448.method6328(local86));
					local9.aByteArrayArrayArray1[local56] = local114;
				}
			} catch (@Pc(229) ClassNotFoundException local229) {
				local9.anIntArray105[local56] = -1;
			} catch (@Pc(236) SecurityException local236) {
				local9.anIntArray105[local56] = -2;
			} catch (@Pc(243) NullPointerException local243) {
				local9.anIntArray105[local56] = -3;
			} catch (@Pc(250) Exception local250) {
				local9.anIntArray105[local56] = -4;
			} catch (@Pc(257) Throwable local257) {
				local9.anIntArray105[local56] = -5;
			}
		}
		Static238.aClass124_58.method3275(local9);
	}
}
