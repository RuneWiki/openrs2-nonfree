import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static135 {

	@OriginalMember(owner = "client!jo", name = "b", descriptor = "[I")
	public static int[] anIntArray209;

	@OriginalMember(owner = "client!jo", name = "l", descriptor = "F")
	public static float aFloat61;

	@OriginalMember(owner = "client!jo", name = "q", descriptor = "I")
	public static int anInt2658;

	@OriginalMember(owner = "client!jo", name = "r", descriptor = "I")
	public static int anInt2659;

	@OriginalMember(owner = "client!jo", name = "s", descriptor = "[S")
	public static short[] aShortArray54;

	@OriginalMember(owner = "client!jo", name = "g", descriptor = "Lclient!ge;")
	public static Class61 aClass61_1 = new Class61();

	@OriginalMember(owner = "client!jo", name = "h", descriptor = "[I")
	public static int[] anIntArray210 = new int[2048];

	@OriginalMember(owner = "client!jo", name = "t", descriptor = "[I")
	public static int[] anIntArray211 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!jo", name = "d", descriptor = "(I)V")
	public static void method2344() {
		try {
			if (Static63.anInt1315 == 1) {
				@Pc(12) int local12 = Static292.aClass1_Sub7_Sub2_3.method2761();
				if (local12 > 0 && Static292.aClass1_Sub7_Sub2_3.method2785()) {
					local12 -= Static87.anInt1879;
					if (local12 < 0) {
						local12 = 0;
					}
					Static292.aClass1_Sub7_Sub2_3.method2762(local12);
					return;
				}
				Static292.aClass1_Sub7_Sub2_3.method2777();
				Static292.aClass1_Sub7_Sub2_3.method2759();
				Static250.aClass1_Sub26_2 = null;
				Static156.aClass58_1 = null;
				if (Static167.aClass119_12 == null) {
					Static63.anInt1315 = 0;
				} else {
					Static63.anInt1315 = 2;
				}
			}
		} catch (@Pc(64) Exception local64) {
			local64.printStackTrace();
			Static292.aClass1_Sub7_Sub2_3.method2777();
			Static156.aClass58_1 = null;
			Static167.aClass119_12 = null;
			Static250.aClass1_Sub26_2 = null;
			Static63.anInt1315 = 0;
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(IIIILclient!sm;II)Lclient!sm;")
	public static Class11_Sub1 method2346(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class11_Sub1 arg4, @OriginalArg(6) int arg5) {
		@Pc(8) long local8 = (long) arg0;
		@Pc(14) Class11_Sub1 local14 = (Class11_Sub1) Static273.aClass175_41.method4295(local8);
		if (local14 == null) {
			@Pc(22) Class11_Sub5 local22 = Static180.method3074(Static58.aClass119_18, arg0);
			if (local22 == null) {
				return null;
			}
			local14 = local22.method3055(64, 768, -50, -10, -50);
			Static273.aClass175_41.method4285(local14, local8);
		}
		@Pc(44) int local44 = arg4.method2914();
		@Pc(47) int local47 = arg4.method2921();
		@Pc(50) int local50 = arg4.method2899();
		@Pc(53) int local53 = arg4.method2906();
		local14 = local14.method2907(true, true, true);
		if (arg2 != 0) {
			local14.method2909(arg2);
		}
		@Pc(110) int local110;
		if (Static71.aBoolean165) {
			@Pc(76) Class11_Sub1_Sub1 local76 = (Class11_Sub1_Sub1) local14;
			if (Static42.method768(local44 + arg1, Static132.anInt2608, local50 + arg3) != arg5 || arg5 != Static42.method768(local47 + arg1, Static132.anInt2608, local53 + arg3)) {
				for (local110 = 0; local110 < local76.anInt436; local110++) {
					local76.anIntArray45[local110] += Static42.method768(local76.anIntArray46[local110] + arg1, Static132.anInt2608, local76.anIntArray41[local110] + arg3) - arg5;
				}
				local76.aClass36_1.aBoolean117 = false;
				local76.aClass92_1.aBoolean224 = false;
			}
		} else {
			@Pc(160) Class11_Sub1_Sub2 local160 = (Class11_Sub1_Sub2) local14;
			if (arg5 != Static42.method768(local44 + arg1, Static132.anInt2608, arg3 + local50) || Static42.method768(arg1 + local47, Static132.anInt2608, arg3 + local53) != arg5) {
				for (local110 = 0; local110 < local160.anInt3320; local110++) {
					local160.anIntArray311[local110] += Static42.method768(local160.anIntArray312[local110] + arg1, Static132.anInt2608, arg3 + local160.anIntArray319[local110]) - arg5;
				}
				local160.aBoolean290 = false;
			}
		}
		return local14;
	}
}
