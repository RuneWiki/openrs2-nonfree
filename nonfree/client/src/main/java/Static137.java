import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static137 {

	@OriginalMember(owner = "client!ne", name = "d", descriptor = "I")
	public static int anInt3136;

	@OriginalMember(owner = "client!ne", name = "f", descriptor = "Lclient!oe;")
	public static Class72 aClass72_188;

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "Lclient!qe;")
	public static Class78 aClass78_597 = Static199.method3560("gelb:");

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "Lclient!qe;")
	public static Class78 aClass78_598 = Static199.method3560("scape main");

	@OriginalMember(owner = "client!ne", name = "e", descriptor = "I")
	public static int anInt3137 = 100;

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(I)V")
	public static void method2464() {
		if (Static76.aString5.toLowerCase().indexOf("microsoft") != -1) {
			Static106.anIntArray400[220] = 74;
			Static106.anIntArray400[223] = 28;
			Static106.anIntArray400[187] = 27;
			Static106.anIntArray400[219] = 42;
			Static106.anIntArray400[221] = 43;
			Static106.anIntArray400[189] = 26;
			Static106.anIntArray400[191] = 73;
			Static106.anIntArray400[188] = 71;
			Static106.anIntArray400[222] = 59;
			Static106.anIntArray400[186] = 57;
			Static106.anIntArray400[190] = 72;
			Static106.anIntArray400[192] = 58;
			return;
		}
		Static106.anIntArray400[93] = 43;
		if (Static76.aMethod2 == null) {
			Static106.anIntArray400[222] = 59;
			Static106.anIntArray400[192] = 58;
		} else {
			Static106.anIntArray400[192] = 28;
			Static106.anIntArray400[222] = 58;
			Static106.anIntArray400[520] = 59;
		}
		Static106.anIntArray400[91] = 42;
		Static106.anIntArray400[47] = 73;
		Static106.anIntArray400[44] = 71;
		Static106.anIntArray400[59] = 57;
		Static106.anIntArray400[61] = 27;
		Static106.anIntArray400[46] = 72;
		Static106.anIntArray400[45] = 26;
		Static106.anIntArray400[92] = 74;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(ILclient!gj;ILclient!nh;)V")
	public static void method2465(@OriginalArg(0) int arg0, @OriginalArg(1) Class41 arg1, @OriginalArg(3) Class2_Sub23 arg2) {
		@Pc(9) Class2_Sub5 local9 = new Class2_Sub5();
		local9.anInt486 = arg2.method2122();
		local9.anInt485 = arg2.method2133();
		local9.anIntArray85 = new int[local9.anInt486];
		local9.anIntArray88 = new int[local9.anInt486];
		local9.anIntArray87 = new int[local9.anInt486];
		local9.aClass33Array1 = new Class33[local9.anInt486];
		local9.aClass33Array2 = new Class33[local9.anInt486];
		local9.aByteArrayArrayArray2 = new byte[local9.anInt486][][];
		for (@Pc(55) int local55 = 0; local55 < local9.anInt486; local55++) {
			try {
				@Pc(61) int local61 = arg2.method2122();
				@Pc(86) String local86;
				@Pc(95) String local95;
				@Pc(99) int local99;
				if (local61 == 0 || local61 == 1 || local61 == 2) {
					local86 = new String(arg2.method2115().method3013());
					local95 = new String(arg2.method2115().method3013());
					local99 = 0;
					if (local61 == 1) {
						local99 = arg2.method2133();
					}
					local9.anIntArray85[local55] = local61;
					local9.anIntArray87[local55] = local99;
					local9.aClass33Array2[local55] = arg1.method1260(local95, Static54.method684(local86));
				} else if (local61 == 3 || local61 == 4) {
					local86 = new String(arg2.method2115().method3013());
					local95 = new String(arg2.method2115().method3013());
					local99 = arg2.method2122();
					@Pc(102) String[] local102 = new String[local99];
					for (@Pc(104) int local104 = 0; local104 < local99; local104++) {
						local102[local104] = new String(arg2.method2115().method3013());
					}
					@Pc(124) byte[][] local124 = new byte[local99][];
					@Pc(137) int local137;
					if (local61 == 3) {
						for (@Pc(131) int local131 = 0; local131 < local99; local131++) {
							local137 = arg2.method2133();
							local124[local131] = new byte[local137];
							arg2.method2118(local137, local124[local131]);
						}
					}
					local9.anIntArray85[local55] = local61;
					@Pc(162) Class[] local162 = new Class[local99];
					for (local137 = 0; local137 < local99; local137++) {
						local162[local137] = Static54.method684(local102[local137]);
					}
					local9.aClass33Array1[local55] = arg1.method1271(local162, local95, Static54.method684(local86));
					local9.aByteArrayArrayArray2[local55] = local124;
				}
			} catch (@Pc(253) ClassNotFoundException local253) {
				local9.anIntArray88[local55] = -1;
			} catch (@Pc(260) SecurityException local260) {
				local9.anIntArray88[local55] = -2;
			} catch (@Pc(267) NullPointerException local267) {
				local9.anIntArray88[local55] = -3;
			} catch (@Pc(274) Exception local274) {
				local9.anIntArray88[local55] = -4;
			} catch (@Pc(281) Throwable local281) {
				local9.anIntArray88[local55] = -5;
			}
		}
		Static35.aClass44_8.method1355(local9);
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
	public static String method2466(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(8) String local8;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(12) RuntimeException_Sub1 local12 = (RuntimeException_Sub1) arg0;
			local8 = local12.aString1 + " | ";
			arg0 = local12.aThrowable1;
		} else {
			local8 = "";
		}
		@Pc(29) StringWriter local29 = new StringWriter();
		@Pc(39) PrintWriter local39 = new PrintWriter(local29);
		arg0.printStackTrace(local39);
		local39.close();
		@Pc(47) String local47 = local29.toString();
		@Pc(55) BufferedReader local55 = new BufferedReader(new StringReader(local47));
		@Pc(58) String local58 = local55.readLine();
		while (true) {
			while (true) {
				@Pc(61) String local61 = local55.readLine();
				if (local61 == null) {
					return local8 + "| " + local58;
				}
				@Pc(67) int local67 = local61.indexOf(40);
				@Pc(74) int local74 = local61.indexOf(41, local67 + 1);
				if (local67 >= 0 && local74 >= 0) {
					@Pc(88) String local88 = local61.substring(local67 + 1, local74);
					@Pc(92) int local92 = local88.indexOf(".java:");
					if (local92 >= 0) {
						local88 = local88.substring(0, local92) + local88.substring(local92 + 5);
						local8 = local8 + local88 + ' ';
						continue;
					}
					local61 = local61.substring(0, local67);
				}
				local61 = local61.trim();
				local61 = local61.substring(local61.lastIndexOf(32) + 1);
				local61 = local61.substring(local61.lastIndexOf(9) + 1);
				local8 = local8 + local61 + ' ';
			}
		}
	}
}
