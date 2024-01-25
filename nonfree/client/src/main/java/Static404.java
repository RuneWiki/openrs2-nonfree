import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static404 {

	@OriginalMember(owner = "client!oi", name = "bb", descriptor = "I")
	public static int anInt4286;

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(ILclient!fl;Lclient!ji;I)V")
	public static void method3627(@OriginalArg(1) Class104 arg0, @OriginalArg(2) Class6_Sub8 arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class6_Sub26 local9 = new Class6_Sub26();
		local9.anInt5097 = arg1.method8246();
		local9.anInt5093 = arg1.method8236();
		local9.aByteArrayArrayArray1 = new byte[local9.anInt5097][][];
		local9.aClass159Array2 = new Class159[local9.anInt5097];
		local9.anIntArray217 = new int[local9.anInt5097];
		local9.anIntArray216 = new int[local9.anInt5097];
		local9.aClass159Array1 = new Class159[local9.anInt5097];
		local9.anIntArray218 = new int[local9.anInt5097];
		for (@Pc(51) int local51 = 0; local51 < local9.anInt5097; local51++) {
			try {
				@Pc(57) int local57 = arg1.method8246();
				@Pc(79) String local79;
				@Pc(83) String local83;
				@Pc(87) int local87;
				if (local57 == 0 || local57 == 1 || local57 == 2) {
					local79 = arg1.method8221();
					local83 = arg1.method8221();
					local87 = 0;
					if (local57 == 1) {
						local87 = arg1.method8236();
					}
					local9.anIntArray216[local51] = local57;
					local9.anIntArray218[local51] = local87;
					local9.aClass159Array2[local51] = arg0.method3142(local83, Static143.method2824(local79));
				} else if (local57 == 3 || local57 == 4) {
					local79 = arg1.method8221();
					local83 = arg1.method8221();
					local87 = arg1.method8246();
					@Pc(90) String[] local90 = new String[local87];
					for (@Pc(92) int local92 = 0; local92 < local87; local92++) {
						local90[local92] = arg1.method8221();
					}
					@Pc(111) byte[][] local111 = new byte[local87][];
					@Pc(122) int local122;
					if (local57 == 3) {
						for (@Pc(116) int local116 = 0; local116 < local87; local116++) {
							local122 = arg1.method8236();
							local111[local116] = new byte[local122];
							arg1.method8207(local111[local116], local122, 0);
						}
					}
					local9.anIntArray216[local51] = local57;
					@Pc(147) Class[] local147 = new Class[local87];
					for (local122 = 0; local122 < local87; local122++) {
						local147[local122] = Static143.method2824(local90[local122]);
					}
					local9.aClass159Array1[local51] = arg0.method3139(local83, Static143.method2824(local79), local147);
					local9.aByteArrayArrayArray1[local51] = local111;
				}
			} catch (@Pc(232) ClassNotFoundException local232) {
				local9.anIntArray217[local51] = -1;
			} catch (@Pc(239) SecurityException local239) {
				local9.anIntArray217[local51] = -2;
			} catch (@Pc(246) NullPointerException local246) {
				local9.anIntArray217[local51] = -3;
			} catch (@Pc(253) Exception local253) {
				local9.anIntArray217[local51] = -4;
			} catch (@Pc(260) Throwable local260) {
				local9.anIntArray217[local51] = -5;
			}
		}
		Static349.aClass163_39.method4967(local9);
	}
}
