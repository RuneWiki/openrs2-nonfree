import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static256 {

	@OriginalMember(owner = "client!kfa", name = "o", descriptor = "Lclient!cga;")
	public static final Class47 aClass47_79 = new Class47(48, 11);

	@OriginalMember(owner = "client!kfa", name = "J", descriptor = "I")
	public static int anInt5002 = 1;

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(IZI)Z")
	public static boolean method4327(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x8000) != 0;
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/Throwable;)V")
	public static void method4328(@OriginalArg(1) String arg0, @OriginalArg(2) Throwable arg1) {
		try {
			@Pc(7) String local7 = "";
			if (arg1 != null) {
				local7 = Static511.method7083(arg1);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					local7 = local7 + " | ";
				}
				local7 = local7 + arg0;
			}
			Static294.method4729(local7);
			local7 = Static19.method5214(local7, ":", "%3a");
			local7 = Static19.method5214(local7, "@", "%40");
			local7 = Static19.method5214(local7, "&", "%26");
			local7 = Static19.method5214(local7, "#", "%23");
			if (Static497.anApplet2 != null) {
				@Pc(101) Class331 local101 = Static115.aClass272_1.method6128(new URL(Static497.anApplet2.getCodeBase(), "clienterror.ws?c=" + Static13.anInt7635 + "&u=" + Static228.aLong125 + "&v1=" + Static426.aString70 + "&v2=" + Static426.aString68 + "&e=" + local7));
				while (local101.anInt8818 == 0) {
					Static318.method4952(1L);
				}
				if (local101.anInt8818 == 1) {
					@Pc(129) DataInputStream local129 = (DataInputStream) local101.anObject18;
					local129.read();
					local129.close();
				}
			}
		} catch (@Pc(136) Exception local136) {
		}
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(ILclient!ji;BLclient!qj;)V")
	public static void method4330(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub21 arg1, @OriginalArg(3) Class272 arg2) {
		@Pc(9) Class6_Sub12 local9 = new Class6_Sub12();
		local9.anInt1290 = arg1.method6069();
		local9.anInt1289 = arg1.method6036();
		local9.aClass331Array1 = new Class331[local9.anInt1290];
		local9.anIntArray114 = new int[local9.anInt1290];
		local9.aClass331Array2 = new Class331[local9.anInt1290];
		local9.anIntArray112 = new int[local9.anInt1290];
		local9.aByteArrayArrayArray1 = new byte[local9.anInt1290][][];
		local9.anIntArray113 = new int[local9.anInt1290];
		for (@Pc(59) int local59 = 0; local59 < local9.anInt1290; local59++) {
			try {
				@Pc(65) int local65 = arg1.method6069();
				@Pc(77) String local77;
				@Pc(81) String local81;
				@Pc(83) int local83;
				if (local65 == 0 || local65 == 1 || local65 == 2) {
					local77 = arg1.method6044();
					local81 = arg1.method6044();
					local83 = 0;
					if (local65 == 1) {
						local83 = arg1.method6036();
					}
					local9.anIntArray114[local59] = local65;
					local9.anIntArray113[local59] = local83;
					local9.aClass331Array1[local59] = arg2.method6130(Static251.method7805(local77), local81);
				} else if (local65 == 3 || local65 == 4) {
					local77 = arg1.method6044();
					local81 = arg1.method6044();
					local83 = arg1.method6069();
					@Pc(136) String[] local136 = new String[local83];
					for (@Pc(138) int local138 = 0; local138 < local83; local138++) {
						local136[local138] = arg1.method6044();
					}
					@Pc(153) byte[][] local153 = new byte[local83][];
					@Pc(166) int local166;
					if (local65 == 3) {
						for (@Pc(160) int local160 = 0; local160 < local83; local160++) {
							local166 = arg1.method6036();
							local153[local160] = new byte[local166];
							arg1.method6053(local166, local153[local160]);
						}
					}
					local9.anIntArray114[local59] = local65;
					@Pc(195) Class[] local195 = new Class[local83];
					for (local166 = 0; local166 < local83; local166++) {
						local195[local166] = Static251.method7805(local136[local166]);
					}
					local9.aClass331Array2[local59] = arg2.method6123(local195, local81, Static251.method7805(local77));
					local9.aByteArrayArrayArray1[local59] = local153;
				}
			} catch (@Pc(234) ClassNotFoundException local234) {
				local9.anIntArray112[local59] = -1;
			} catch (@Pc(241) SecurityException local241) {
				local9.anIntArray112[local59] = -2;
			} catch (@Pc(248) NullPointerException local248) {
				local9.anIntArray112[local59] = -3;
			} catch (@Pc(255) Exception local255) {
				local9.anIntArray112[local59] = -4;
			} catch (@Pc(262) Throwable local262) {
				local9.anIntArray112[local59] = -5;
			}
		}
		Static541.aClass361_51.method7833(local9);
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "()V")
	public static void method4332() {
		@Pc(3) int local3;
		@Pc(6) int local6;
		@Pc(9) int local9;
		if (Static572.aClass276ArrayArrayArray3 != null) {
			for (local3 = 0; local3 < Static572.aClass276ArrayArrayArray3.length; local3++) {
				for (local6 = 0; local6 < Static401.anInt7022; local6++) {
					for (local9 = 0; local9 < Static555.anInt9182; local9++) {
						if (Static572.aClass276ArrayArrayArray3[local3][local6][local9] != null) {
							Static572.aClass276ArrayArrayArray3[local3][local6][local9].method6203();
						}
						Static572.aClass276ArrayArrayArray3[local3][local6][local9] = null;
					}
				}
			}
		}
		Static572.aClass276ArrayArrayArray3 = null;
		Static273.aClass59Array4 = null;
		if (Static48.aClass276ArrayArrayArray1 != null) {
			for (local3 = 0; local3 < Static48.aClass276ArrayArrayArray1.length; local3++) {
				for (local6 = 0; local6 < Static401.anInt7022; local6++) {
					for (local9 = 0; local9 < Static555.anInt9182; local9++) {
						if (Static48.aClass276ArrayArrayArray1[local3][local6][local9] != null) {
							Static48.aClass276ArrayArrayArray1[local3][local6][local9].method6203();
						}
						Static48.aClass276ArrayArrayArray1[local3][local6][local9] = null;
					}
				}
			}
		}
		Static48.aClass276ArrayArrayArray1 = null;
		Static49.aClass59Array2 = null;
		Static270.aClass276ArrayArrayArray2 = null;
		Static133.aClass59Array3 = null;
		Static478.anInt8127 = 0;
		if (Static185.aClass197Array1 != null) {
			for (local3 = 0; local3 < Static478.anInt8127; local3++) {
				Static185.aClass197Array1[local3] = null;
			}
		}
		if (Static216.aClass4_Sub1Array1 != null) {
			for (local3 = 0; local3 < Static325.anInt5957; local3++) {
				Static216.aClass4_Sub1Array1[local3] = null;
			}
			Static325.anInt5957 = 0;
		}
		if (Static478.aClass78Array1 != null) {
			for (local3 = 0; local3 < Static573.anInt9406; local3++) {
				Static478.aClass78Array1[local3] = null;
			}
			for (local6 = 0; local6 < Static107.anInt2060; local6++) {
				for (local9 = 0; local9 < Static401.anInt7022; local9++) {
					for (@Pc(160) int local160 = 0; local160 < Static555.anInt9182; local160++) {
						Static362.aLongArrayArrayArray1[local6][local9][local160] = 0L;
					}
				}
			}
			Static573.anInt9406 = 0;
		}
		Static450.anIntArrayArrayArray4 = null;
		Static69.method1379();
		Static98.aClass40_2.method1133();
		Static305.aByteArrayArray4 = null;
		Static314.anIntArrayArray53 = null;
		Static132.aShortArrayArray1 = null;
		Static476.aClass1_1 = null;
		Static81.aClass54_4 = null;
		Static394.aClass14_11 = null;
	}
}
