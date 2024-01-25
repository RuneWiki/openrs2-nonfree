import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static294 {

	@OriginalMember(owner = "client!lq", name = "G", descriptor = "[Lclient!ib;")
	public static Interface12[] anInterface12Array1;

	@OriginalMember(owner = "client!lq", name = "D", descriptor = "I")
	public static int anInt5492 = 0;

	@OriginalMember(owner = "client!lq", name = "L", descriptor = "[B")
	public static final byte[] aByteArray65 = new byte[2048];

	@OriginalMember(owner = "client!lq", name = "b", descriptor = "(III)Z")
	public static boolean method4725(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x18) != 0 | (arg0 & 0x220) == 544;
	}

	@OriginalMember(owner = "client!lq", name = "c", descriptor = "(III)Z")
	public static boolean method4726(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x21) != 0;
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(ILclient!pp;)V")
	public static void method4727(@OriginalArg(1) Class4_Sub1_Sub1_Sub2 arg0) {
		@Pc(16) Class6_Sub16 local16 = (Class6_Sub16) Static156.aClass128_12.method3263((long) arg0.anInt7126);
		if (local16 == null) {
			return;
		}
		if (local16.aClass6_Sub18_Sub1_3 != null) {
			Static374.aClass6_Sub18_Sub4_2.method6380(local16.aClass6_Sub18_Sub1_3);
			local16.aClass6_Sub18_Sub1_3 = null;
		}
		local16.method7804();
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method4729(@OriginalArg(0) String arg0) {
		System.out.println("Error: " + Static19.method5214(arg0, "%0a", "\n"));
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;ILjava/lang/String;I)V")
	public static void method4730(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) String arg5, @OriginalArg(7) String arg6, @OriginalArg(8) int arg7) {
		@Pc(17) Class232 local17 = Static356.aClass232Array1[99];
		for (@Pc(19) int local19 = 99; local19 > 0; local19--) {
			Static356.aClass232Array1[local19] = Static356.aClass232Array1[local19 - 1];
		}
		if (local17 == null) {
			local17 = new Class232(arg7, arg3, arg2, arg1, arg6, arg5, arg4, arg0);
		} else {
			local17.method5428(arg5, arg4, arg7, arg1, arg3, arg0, arg2, arg6);
		}
		Static221.anInt4606++;
		Static474.anInt8693 = Static592.anInt9587;
		Static356.aClass232Array1[0] = local17;
	}
}
