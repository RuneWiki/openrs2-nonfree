import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static305 {

	@OriginalMember(owner = "client!wb", name = "d", descriptor = "I")
	public static int anInt5484;

	@OriginalMember(owner = "client!wb", name = "h", descriptor = "I")
	public static int anInt5487;

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "J")
	public static long aLong208 = 0L;

	@OriginalMember(owner = "client!wb", name = "f", descriptor = "I")
	public static int anInt5486 = -1;

	@OriginalMember(owner = "client!wb", name = "g", descriptor = "[B")
	public static byte[] aByteArray186 = new byte[520];

	@OriginalMember(owner = "client!wb", name = "j", descriptor = "[C")
	public static char[] aCharArray6 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(I[B)Z")
	public static boolean method4553(@OriginalArg(1) byte[] arg0) {
		@Pc(8) Class1_Sub13 local8 = new Class1_Sub13(arg0);
		@Pc(12) int local12 = local8.method1853();
		if (local12 != 1) {
			return false;
		}
		@Pc(30) boolean local30 = local8.method1853() == 1;
		if (local30) {
			Static276.method4236(local8);
		}
		Static69.method1332(local8);
		return true;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lclient!fh;ILclient!uo;I)V")
	public static void method4554(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(2) Class176 arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class1_Sub17 local9 = new Class1_Sub17();
		local9.anInt2670 = arg0.method1853();
		local9.anInt2667 = arg0.method1860();
		local9.aClass153Array2 = new Class153[local9.anInt2670];
		local9.aClass153Array1 = new Class153[local9.anInt2670];
		local9.anIntArray215 = new int[local9.anInt2670];
		local9.anIntArray214 = new int[local9.anInt2670];
		local9.aByteArrayArrayArray5 = new byte[local9.anInt2670][][];
		local9.anIntArray216 = new int[local9.anInt2670];
		for (@Pc(51) int local51 = 0; local51 < local9.anInt2670; local51++) {
			try {
				@Pc(61) int local61 = arg0.method1853();
				@Pc(76) String local76;
				@Pc(82) String local82;
				@Pc(84) int local84;
				if (local61 == 0 || local61 == 1 || local61 == 2) {
					local76 = arg0.method1827();
					local82 = arg0.method1827();
					local84 = 0;
					if (local61 == 1) {
						local84 = arg0.method1860();
					}
					local9.anIntArray215[local51] = local61;
					local9.anIntArray214[local51] = local84;
					local9.aClass153Array1[local51] = arg1.method4360(local82, Static195.method3369(local76));
				} else if (local61 == 3 || local61 == 4) {
					local76 = arg0.method1827();
					local82 = arg0.method1827();
					local84 = arg0.method1853();
					@Pc(141) String[] local141 = new String[local84];
					for (@Pc(143) int local143 = 0; local143 < local84; local143++) {
						local141[local143] = arg0.method1827();
					}
					@Pc(164) byte[][] local164 = new byte[local84][];
					@Pc(178) int local178;
					if (local61 == 3) {
						for (@Pc(171) int local171 = 0; local171 < local84; local171++) {
							local178 = arg0.method1860();
							local164[local171] = new byte[local178];
							arg0.method1866(local164[local171], local178);
						}
					}
					@Pc(197) Class[] local197 = new Class[local84];
					local9.anIntArray215[local51] = local61;
					for (local178 = 0; local178 < local84; local178++) {
						local197[local178] = Static195.method3369(local141[local178]);
					}
					local9.aClass153Array2[local51] = arg1.method4365(local82, local197, Static195.method3369(local76));
					local9.aByteArrayArrayArray5[local51] = local164;
				}
			} catch (@Pc(241) ClassNotFoundException local241) {
				local9.anIntArray216[local51] = -1;
			} catch (@Pc(248) SecurityException local248) {
				local9.anIntArray216[local51] = -2;
			} catch (@Pc(255) NullPointerException local255) {
				local9.anIntArray216[local51] = -3;
			} catch (@Pc(262) Exception local262) {
				local9.anIntArray216[local51] = -4;
			} catch (@Pc(269) Throwable local269) {
				local9.anIntArray216[local51] = -5;
			}
		}
		Static45.aClass96_3.method2336(local9);
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(ZLjava/lang/String;Ljava/lang/String;I)V")
	public static void method4555(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		Static219.method3546(null, -1, arg1, arg0, arg2);
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(III)V")
	public static void method4557(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) Class1_Sub5_Sub21 local12 = Static278.method4266(13, arg1);
		local12.method4062();
		local12.anInt4863 = arg0;
	}
}
