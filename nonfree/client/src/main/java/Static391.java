import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static391 {

	@OriginalMember(owner = "client!ms", name = "x", descriptor = "I")
	public static int anInt6810;

	@OriginalMember(owner = "client!ms", name = "v", descriptor = "I")
	public static int anInt6811;

	@OriginalMember(owner = "client!ms", name = "A", descriptor = "I")
	public static int anInt6812;

	@OriginalMember(owner = "client!ms", name = "w", descriptor = "I")
	public static int anInt6813;

	@OriginalMember(owner = "client!ms", name = "F", descriptor = "Lclient!rl;")
	public static final Class317 aClass317_36 = new Class317(20);

	@OriginalMember(owner = "client!ms", name = "y", descriptor = "Lclient!nha;")
	public static final Class251 aClass251_162 = new Class251(38, 3);

	@OriginalMember(owner = "client!ms", name = "L", descriptor = "Lclient!fw;")
	public static final Class125 aClass125_27 = new Class125(32);

	@OriginalMember(owner = "client!ms", name = "M", descriptor = "[I")
	public static int[] anIntArray352 = new int[4];

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(III)Z")
	public static boolean method5935(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(BI)Lclient!qga;")
	public static Class299 method5936(@OriginalArg(1) int arg0) {
		@Pc(14) int local14 = arg0 >> 16;
		@Pc(18) int local18 = arg0 & 0xFFFF;
		if (Static339.aClass299ArrayArray1[local14] == null || Static339.aClass299ArrayArray1[local14][local18] == null) {
			@Pc(34) boolean local34 = Static558.method8063(local14);
			if (!local34) {
				return null;
			}
		}
		return Static339.aClass299ArrayArray1[local14][local18];
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(IIIZII)V")
	public static void method5937(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		@Pc(22) long local22 = (long) ((arg3 ? Integer.MIN_VALUE : 0) | arg1);
		@Pc(28) Class14_Sub14 local28 = (Class14_Sub14) aClass125_27.method2630(local22);
		if (local28 == null) {
			local28 = new Class14_Sub14();
			aClass125_27.method2626(local28, local22);
		}
		if (local28.anIntArray106.length <= arg4) {
			@Pc(49) int[] local49 = new int[arg4 + 1];
			@Pc(54) int[] local54 = new int[arg4 + 1];
			for (@Pc(56) int local56 = 0; local56 < local28.anIntArray106.length; local56++) {
				local49[local56] = local28.anIntArray106[local56];
				local54[local56] = local28.anIntArray107[local56];
			}
			for (@Pc(88) int local88 = local28.anIntArray106.length; local88 < arg4; local88++) {
				local49[local88] = -1;
				local54[local88] = 0;
			}
			local28.anIntArray107 = local54;
			local28.anIntArray106 = local49;
		}
		local28.anIntArray106[arg4] = arg2;
		local28.anIntArray107[arg4] = arg0;
	}

	@OriginalMember(owner = "client!ms", name = "d", descriptor = "(I)V")
	public static void method5938() {
		Static590.anInt9759 = Static372.aClass350_5.anInt9699 + Static372.aClass350_5.anInt9697 + 2;
		Static658.aStringArray47 = new String[500];
		Static514.anInt8874 = Static497.aClass350_9.anInt9697 + Static497.aClass350_9.anInt9699 + 2;
		for (@Pc(24) int local24 = 0; local24 < Static658.aStringArray47.length; local24++) {
			Static658.aStringArray47[local24] = "";
		}
		Static590.method8398(Static21.aClass21_1.method324(Static26.anInt352));
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(ILclient!hga;)Z")
	public static boolean method5939(@OriginalArg(1) Class152 arg0) {
		if (arg0 == null) {
			return false;
		} else if (!arg0.aBoolean330) {
			return false;
		} else if (!arg0.method3796(Static224.anInterface2_2)) {
			return false;
		} else if (Static558.aClass125_39.method2630((long) arg0.anInt4300) == null) {
			return Static276.aClass125_16.method2630((long) arg0.anInt4296) == null;
		} else {
			return false;
		}
	}
}
