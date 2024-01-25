import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static306 {

	@OriginalMember(owner = "client!mk", name = "z", descriptor = "I")
	public static int anInt5967;

	@OriginalMember(owner = "client!mk", name = "A", descriptor = "Lclient!an;")
	public static Class16 aClass16_77;

	@OriginalMember(owner = "client!mk", name = "y", descriptor = "Lclient!dk;")
	public static final Class72 aClass72_5 = new Class72(4);

	@OriginalMember(owner = "client!mk", name = "b", descriptor = "(I)V")
	public static void method4978() {
		if (Static97.anInt2272 != -1) {
			Static336.method5379(-1, -1, Static97.anInt2272, false);
			Static97.anInt2272 = -1;
		}
	}

	@OriginalMember(owner = "client!mk", name = "c", descriptor = "(I)V")
	public static void method4979() {
		Static357.method5570();
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(ZII)B")
	public static byte method4980(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 9) {
			return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(ILclient!dj;BLclient!daa;)V")
	public static void method4982(@OriginalArg(0) int arg0, @OriginalArg(1) Class71 arg1, @OriginalArg(3) Class12_Sub8 arg2) {
		@Pc(9) Class12_Sub50 local9 = new Class12_Sub50();
		local9.anInt9592 = arg2.method5216();
		local9.anInt9589 = arg2.method5225();
		local9.anIntArray693 = new int[local9.anInt9592];
		local9.anIntArray692 = new int[local9.anInt9592];
		local9.aClass55Array2 = new Class55[local9.anInt9592];
		local9.aByteArrayArrayArray20 = new byte[local9.anInt9592][][];
		local9.anIntArray691 = new int[local9.anInt9592];
		local9.aClass55Array1 = new Class55[local9.anInt9592];
		for (@Pc(56) int local56 = 0; local56 < local9.anInt9592; local56++) {
			try {
				@Pc(62) int local62 = arg2.method5216();
				@Pc(87) String local87;
				@Pc(91) String local91;
				@Pc(95) int local95;
				if (local62 == 0 || local62 == 1 || local62 == 2) {
					local87 = arg2.method5206();
					local91 = arg2.method5206();
					local95 = 0;
					if (local62 == 1) {
						local95 = arg2.method5225();
					}
					local9.anIntArray692[local56] = local62;
					local9.anIntArray693[local56] = local95;
					local9.aClass55Array2[local56] = arg1.method1999(local91, Static448.method6780(local87));
				} else if (local62 == 3 || local62 == 4) {
					local87 = arg2.method5206();
					local91 = arg2.method5206();
					local95 = arg2.method5216();
					@Pc(98) String[] local98 = new String[local95];
					for (@Pc(100) int local100 = 0; local100 < local95; local100++) {
						local98[local100] = arg2.method5206();
					}
					@Pc(119) byte[][] local119 = new byte[local95][];
					@Pc(132) int local132;
					if (local62 == 3) {
						for (@Pc(126) int local126 = 0; local126 < local95; local126++) {
							local132 = arg2.method5225();
							local119[local126] = new byte[local132];
							arg2.method5181(local132, local119[local126]);
						}
					}
					local9.anIntArray692[local56] = local62;
					@Pc(161) Class[] local161 = new Class[local95];
					for (local132 = 0; local132 < local95; local132++) {
						local161[local132] = Static448.method6780(local98[local132]);
					}
					local9.aClass55Array1[local56] = arg1.method1994(local161, local91, Static448.method6780(local87));
					local9.aByteArrayArrayArray20[local56] = local119;
				}
			} catch (@Pc(238) ClassNotFoundException local238) {
				local9.anIntArray691[local56] = -1;
			} catch (@Pc(245) SecurityException local245) {
				local9.anIntArray691[local56] = -2;
			} catch (@Pc(252) NullPointerException local252) {
				local9.anIntArray691[local56] = -3;
			} catch (@Pc(259) Exception local259) {
				local9.anIntArray691[local56] = -4;
			} catch (@Pc(266) Throwable local266) {
				local9.anIntArray691[local56] = -5;
			}
		}
		Static421.aClass73_66.method2012(local9);
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(Ljava/lang/String;ILclient!daa;)I")
	public static int method4983(@OriginalArg(0) String arg0, @OriginalArg(2) Class12_Sub8 arg1) {
		@Pc(6) int local6 = arg1.anInt6217;
		@Pc(10) byte[] local10 = Static483.method7236(arg0);
		arg1.method5219(local10.length);
		arg1.anInt6217 += Static114.aClass317_1.method7928(local10, local10.length, arg1.anInt6217, 0, arg1.aByteArray82);
		return arg1.anInt6217 - local6;
	}
}
