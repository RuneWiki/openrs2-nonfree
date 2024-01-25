import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static372 {

	@OriginalMember(owner = "client!sv", name = "t", descriptor = "I")
	public static int anInt7556;

	@OriginalMember(owner = "client!sv", name = "v", descriptor = "I")
	public static int anInt7558;

	@OriginalMember(owner = "client!sv", name = "x", descriptor = "Ljava/lang/String;")
	public static String aString71 = "";

	@OriginalMember(owner = "client!sv", name = "b", descriptor = "(B)V")
	public static void method5824() {
		if (Static411.aClass75_2 != null) {
			Static411.aClass75_2.method5357();
		}
		if (Static91.aClass75_1 != null) {
			Static91.aClass75_1.method5357();
		}
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "([Ljava/lang/Object;I[IZI)V")
	public static void method5825(@OriginalArg(0) Object[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int arg3) {
		if (arg3 <= arg1) {
			return;
		}
		@Pc(11) int local11 = (arg1 + arg3) / 2;
		@Pc(13) int local13 = arg1;
		@Pc(17) int local17 = arg2[local11];
		arg2[local11] = arg2[arg3];
		arg2[arg3] = local17;
		@Pc(31) Object local31 = arg0[local11];
		arg0[local11] = arg0[arg3];
		arg0[arg3] = local31;
		@Pc(50) int local50 = ~local17 == Integer.MIN_VALUE ? 0 : 1;
		for (@Pc(52) int local52 = arg1; local52 < arg3; local52++) {
			if (arg2[local52] < local17 + (local52 & local50)) {
				@Pc(67) int local67 = arg2[local52];
				arg2[local52] = arg2[local13];
				arg2[local13] = local67;
				@Pc(81) Object local81 = arg0[local52];
				arg0[local52] = arg0[local13];
				arg0[local13++] = local81;
			}
		}
		arg2[arg3] = arg2[local13];
		arg2[local13] = local17;
		arg0[arg3] = arg0[local13];
		arg0[local13] = local31;
		method5825(arg0, arg1, arg2, local13 - 1);
		method5825(arg0, local13 + 1, arg2, arg3);
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(ZLjava/lang/String;Z)V")
	public static void method5826(@OriginalArg(1) String arg0, @OriginalArg(2) boolean arg1) {
		Static102.aClass166_75.anInt4829 = 1;
		@Pc(11) String local11 = arg0.toLowerCase();
		@Pc(14) short[] local14 = new short[16];
		@Pc(16) int local16 = 0;
		for (@Pc(23) int local23 = 0; local23 < Static390.aClass204_2.anInt5967; local23++) {
			@Pc(30) Class127 local30 = Static390.aClass204_2.method4629(local23);
			if ((!arg1 || local30.aBoolean267) && local30.anInt3547 == -1 && local30.anInt3525 == -1 && local30.anInt3534 == 0 && local30.aString43.toLowerCase().indexOf(local11) != -1) {
				if (local16 >= 250) {
					Static227.anInt4176 = -1;
					Static98.aShortArray17 = null;
					return;
				}
				if (local16 >= local14.length) {
					@Pc(75) short[] local75 = new short[local14.length * 2];
					for (@Pc(77) int local77 = 0; local77 < local16; local77++) {
						local75[local77] = local14[local77];
					}
					local14 = local75;
				}
				local14[local16++] = (short) local23;
			}
		}
		Static227.anInt4176 = local16;
		Static344.anInt6182 = 0;
		Static98.aShortArray17 = local14;
		@Pc(111) String[] local111 = new String[Static227.anInt4176];
		for (@Pc(113) int local113 = 0; local113 < Static227.anInt4176; local113++) {
			local111[local113] = Static390.aClass204_2.method4629(local14[local113]).aString43;
		}
		Static455.method5871(local111, Static98.aShortArray17);
		Static102.aClass166_75.method3671();
		Static102.aClass166_75.anInt4829 = 2;
	}
}
