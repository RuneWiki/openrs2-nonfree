import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static343 {

	@OriginalMember(owner = "client!qq", name = "S", descriptor = "I")
	public static int anInt5784;

	@OriginalMember(owner = "client!qq", name = "T", descriptor = "I")
	public static int anInt5785 = -1;

	@OriginalMember(owner = "client!qq", name = "b", descriptor = "(II)V")
	public static void method4792(@OriginalArg(1) int arg0) {
		Static280.anInt4669 = -1;
		Static82.anInt1486 = -1;
		Static34.anInt3343 = arg0;
		Static368.method5132();
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(II[Lclient!ga;IZI)V")
	public static void method4798(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class82[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		for (@Pc(3) int local3 = 0; local3 < arg2.length; local3++) {
			@Pc(9) Class82 local9 = arg2[local3];
			if (local9 != null && local9.anInt2259 == arg0) {
				Static338.method4720(arg3, arg4, arg1, local9);
				Static409.method5641(arg1, local9, arg3);
				if (local9.anInt2245 > local9.anInt2242 - local9.anInt2192) {
					local9.anInt2245 = local9.anInt2242 - local9.anInt2192;
				}
				if (local9.anInt2249 - local9.anInt2216 < local9.anInt2263) {
					local9.anInt2263 = local9.anInt2249 - local9.anInt2216;
				}
				if (local9.anInt2245 < 0) {
					local9.anInt2245 = 0;
				}
				if (local9.anInt2263 < 0) {
					local9.anInt2263 = 0;
				}
				if (local9.anInt2252 == 0) {
					Static325.method4506(local9, arg4);
				}
			}
		}
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(BII)I")
	public static int method4799(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 1 || arg1 == 3 ? Static374.anIntArray394[arg0 & 0x3] : Static355.anIntArray289[arg0 & 0x3];
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(ILclient!nj;)V")
	public static void method4800(@OriginalArg(1) Class3_Sub25 arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static102.anInt1841; local7++) {
			@Pc(13) int local13 = arg0.method4086();
			@Pc(19) int local19 = arg0.method4083();
			if (local19 == 65535) {
				local19 = -1;
			}
			if (Static371.aClass41_Sub1Array2[local13] != null) {
				Static371.aClass41_Sub1Array2[local13].anInt7094 = local19;
			}
		}
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(ZLjava/lang/String;)V")
	public static void method4802(@OriginalArg(1) String arg0) {
		System.out.println("Error: " + Static394.method5443("%0a", "\n", arg0));
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(BIZLclient!uu;III)V")
	public static void method4803(@OriginalArg(1) int arg0, @OriginalArg(3) Class250 arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		Static395.aClass250_95 = arg1;
		Static107.anInt1917 = 0;
		Static88.anInt1592 = arg3;
		Static63.anInt7101 = 1;
		Static134.aBoolean185 = false;
		Static28.anInt494 = arg0;
		Static111.anInt1973 = Static407.aClass3_Sub1_Sub4_3.method6323() / arg2;
		if (Static111.anInt1973 < 1) {
			Static111.anInt1973 = 1;
		}
	}
}
