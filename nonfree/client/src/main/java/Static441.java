import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static441 {

	@OriginalMember(owner = "client!pp", name = "q", descriptor = "Lclient!qe;")
	public static Class268 aClass268_143;

	@OriginalMember(owner = "client!pp", name = "m", descriptor = "[I")
	public static final int[] anIntArray486 = new int[8];

	@OriginalMember(owner = "client!pp", name = "o", descriptor = "I")
	public static int anInt7959 = -1;

	@OriginalMember(owner = "client!pp", name = "p", descriptor = "I")
	public static int anInt7960 = 0;

	@OriginalMember(owner = "client!pp", name = "s", descriptor = "Z")
	public static boolean aBoolean529 = false;

	@OriginalMember(owner = "client!pp", name = "v", descriptor = "Z")
	public static boolean aBoolean530 = false;

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(I)V")
	public static void method6827() {
		for (@Pc(7) int local7 = 0; local7 < Static252.anInt5066; local7++) {
			@Pc(13) int local13 = Static483.anIntArray525[local7];
			@Pc(20) Class6_Sub46 local20 = (Class6_Sub46) Static347.aClass128_23.method3560((long) local13);
			if (local20 != null) {
				@Pc(25) Class20_Sub2_Sub2_Sub1_Sub2 local25 = local20.aClass20_Sub2_Sub2_Sub1_Sub2_1;
				Static200.method3538(local25.aClass247_1.anInt7681, local25);
			}
		}
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(IBI)Z")
	public static boolean method6828(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static596.method8369(arg0, arg1) | (arg1 & 0x10000) != 0 || Static195.method3466(arg0, arg1)) {
			return true;
		} else {
			return (arg0 & 0x37) == 0 && Static216.method3668(arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method6829(@OriginalArg(0) String arg0) {
		System.out.println("Error: " + Static647.method9000("%0a", "\n", arg0));
	}
}
