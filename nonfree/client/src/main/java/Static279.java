import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static279 {

	@OriginalMember(owner = "client!ka", name = "h", descriptor = "Lclient!wda;")
	public static Class369 aClass369_5;

	@OriginalMember(owner = "client!ka", name = "m", descriptor = "F")
	public static float aFloat168;

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "[I")
	public static int[] anIntArray498 = new int[2];

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IZLjava/lang/String;)V")
	public static void method6676(@OriginalArg(1) boolean arg0, @OriginalArg(2) String arg1) {
		@Pc(8) String local8 = arg1.toLowerCase();
		@Pc(11) short[] local11 = new short[16];
		@Pc(13) int local13 = 0;
		@Pc(19) int local19 = arg0 ? 32768 : 0;
		@Pc(29) int local29 = (arg0 ? Static296.aClass13_1.anInt168 : Static296.aClass13_1.anInt169) + local19;
		for (@Pc(31) int local31 = local19; local31 < local29; local31++) {
			@Pc(38) Class2_Sub6_Sub19 local38 = Static296.aClass13_1.method226(local31);
			if (local38.aBoolean677 && local38.method8045().toLowerCase().indexOf(local8) != -1) {
				if (local13 >= 50) {
					Static468.aShortArray116 = null;
					Static305.anInt6352 = -1;
					return;
				}
				if (local11.length <= local13) {
					@Pc(67) short[] local67 = new short[local11.length * 2];
					for (@Pc(69) int local69 = 0; local69 < local13; local69++) {
						local67[local69] = local11[local69];
					}
					local11 = local67;
				}
				local11[local13++] = (short) local31;
			}
		}
		Static305.anInt6352 = local13;
		Static396.anInt7578 = 0;
		Static468.aShortArray116 = local11;
		@Pc(106) String[] local106 = new String[Static305.anInt6352];
		for (@Pc(108) int local108 = 0; local108 < Static305.anInt6352; local108++) {
			local106[local108] = Static296.aClass13_1.method226(local11[local108]).method8045();
		}
		Static435.method6897(Static468.aShortArray116, local106);
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(I[Ljava/lang/String;[SIZ)V")
	public static void method6677(@OriginalArg(0) int arg0, @OriginalArg(1) String[] arg1, @OriginalArg(2) short[] arg2, @OriginalArg(3) int arg3) {
		if (arg0 <= arg3) {
			return;
		}
		@Pc(16) int local16 = (arg3 + arg0) / 2;
		@Pc(18) int local18 = arg3;
		@Pc(22) String local22 = arg1[local16];
		arg1[local16] = arg1[arg0];
		arg1[arg0] = local22;
		@Pc(36) short local36 = arg2[local16];
		arg2[local16] = arg2[arg0];
		arg2[arg0] = local36;
		for (@Pc(48) int local48 = arg3; local48 < arg0; local48++) {
			if (local22 == null || arg1[local48] != null && (local48 & 0x1) > arg1[local48].compareTo(local22)) {
				@Pc(73) String local73 = arg1[local48];
				arg1[local48] = arg1[local18];
				arg1[local18] = local73;
				@Pc(87) short local87 = arg2[local48];
				arg2[local48] = arg2[local18];
				arg2[local18++] = local87;
			}
		}
		arg1[arg0] = arg1[local18];
		arg1[local18] = local22;
		arg2[arg0] = arg2[local18];
		arg2[local18] = local36;
		method6677(local18 - 1, arg1, arg2, arg3);
		method6677(arg0, arg1, arg2, local18 + 1);
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(III)Z")
	public static boolean method6686(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}
}
