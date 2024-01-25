import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static255 {

	@OriginalMember(owner = "client!mn", name = "q", descriptor = "Lclient!ph;")
	public static Class187 aClass187_81;

	@OriginalMember(owner = "client!mn", name = "t", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray16;

	@OriginalMember(owner = "client!mn", name = "m", descriptor = "Lclient!s;")
	public static final Class217 aClass217_102 = new Class217(2, -2);

	@OriginalMember(owner = "client!mn", name = "s", descriptor = "I")
	public static int anInt4593 = 2;

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(I)Lclient!wk;")
	public static Class10_Sub46 method3699() {
		if (Static143.aClass163_27 == null || Static92.aClass90_1 == null) {
			return null;
		}
		Static92.aClass90_1.method2296(Static143.aClass163_27);
		@Pc(20) Class10_Sub46 local20 = (Class10_Sub46) Static92.aClass90_1.method2297();
		if (local20 == null) {
			return null;
		} else {
			@Pc(35) Class208 local35 = Static143.aClass88_2.method2268(local20.anInt7522);
			return local35 != null && local35.aBoolean388 && local35.method4759(Static143.anInterface5_2) ? local20 : Static160.method2692();
		}
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(ILclient!lt;Lclient!nn;I)V")
	public static void method3706(@OriginalArg(1) Class159 arg0, @OriginalArg(2) Class10_Sub8 arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class10_Sub36 local9 = new Class10_Sub36();
		local9.anInt5469 = arg1.method2502();
		local9.anInt5473 = arg1.method2459();
		local9.aClass270Array2 = new Class270[local9.anInt5469];
		local9.anIntArray533 = new int[local9.anInt5469];
		local9.aByteArrayArrayArray17 = new byte[local9.anInt5469][][];
		local9.anIntArray532 = new int[local9.anInt5469];
		local9.aClass270Array1 = new Class270[local9.anInt5469];
		local9.anIntArray531 = new int[local9.anInt5469];
		for (@Pc(51) int local51 = 0; local51 < local9.anInt5469; local51++) {
			try {
				@Pc(57) int local57 = arg1.method2502();
				@Pc(73) String local73;
				@Pc(77) String local77;
				@Pc(79) int local79;
				if (local57 == 0 || local57 == 1 || local57 == 2) {
					local73 = arg1.method2478();
					local77 = arg1.method2478();
					local79 = 0;
					if (local57 == 1) {
						local79 = arg1.method2459();
					}
					local9.anIntArray531[local51] = local57;
					local9.anIntArray533[local51] = local79;
					local9.aClass270Array1[local51] = arg0.method3508(local77, Static261.method3759(local73));
				} else if (local57 == 3 || local57 == 4) {
					local73 = arg1.method2478();
					local77 = arg1.method2478();
					local79 = arg1.method2502();
					@Pc(136) String[] local136 = new String[local79];
					for (@Pc(138) int local138 = 0; local138 < local79; local138++) {
						local136[local138] = arg1.method2478();
					}
					@Pc(153) byte[][] local153 = new byte[local79][];
					@Pc(166) int local166;
					if (local57 == 3) {
						for (@Pc(160) int local160 = 0; local160 < local79; local160++) {
							local166 = arg1.method2459();
							local153[local160] = new byte[local166];
							arg1.method2493(local166, local153[local160]);
						}
					}
					local9.anIntArray531[local51] = local57;
					@Pc(191) Class[] local191 = new Class[local79];
					for (local166 = 0; local166 < local79; local166++) {
						local191[local166] = Static261.method3759(local136[local166]);
					}
					local9.aClass270Array2[local51] = arg0.method3498(local191, Static261.method3759(local73), local77);
					local9.aByteArrayArrayArray17[local51] = local153;
				}
			} catch (@Pc(226) ClassNotFoundException local226) {
				local9.anIntArray532[local51] = -1;
			} catch (@Pc(233) SecurityException local233) {
				local9.anIntArray532[local51] = -2;
			} catch (@Pc(240) NullPointerException local240) {
				local9.anIntArray532[local51] = -3;
			} catch (@Pc(247) Exception local247) {
				local9.anIntArray532[local51] = -4;
			} catch (@Pc(254) Throwable local254) {
				local9.anIntArray532[local51] = -5;
			}
		}
		Static115.aClass163_23.method3613(local9);
	}
}
