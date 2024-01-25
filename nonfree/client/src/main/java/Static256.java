import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static256 {

	@OriginalMember(owner = "client!ik", name = "A", descriptor = "[I")
	public static final int[] anIntArray242 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

	@OriginalMember(owner = "client!ik", name = "y", descriptor = "I")
	public static int anInt4826 = -1;

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(ZLclient!rg;ZLjava/lang/String;)Lclient!rf;")
	public static Class309 method4307(@OriginalArg(1) Class310 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) String arg2) {
		@Pc(8) int local8 = arg0.method7794(arg2);
		if (local8 == -1) {
			return new Class309(0);
		}
		@Pc(22) int[] local22 = arg0.method7782(local8);
		@Pc(28) Class309 local28 = new Class309(local22.length);
		@Pc(30) int local30 = 0;
		@Pc(39) int local39 = 0;
		while (true) {
			while (local28.anInt9005 > local30) {
				@Pc(52) Class14_Sub21 local52 = new Class14_Sub21(arg0.method7803(local22[local39++], local8));
				@Pc(61) int local61 = local52.method7748();
				@Pc(65) int local65 = local52.method7717(-1978450544);
				@Pc(69) int local69 = local52.method7695(112);
				if (!arg1 && local69 == 1) {
					local28.anInt9005--;
				} else {
					local28.anIntArray464[local30] = local61;
					local28.anIntArray463[local30] = local65;
					local30++;
				}
			}
			return local28;
		}
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(Ljava/lang/String;ZB)V")
	public static void method4309(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) {
		@Pc(6) String local6 = arg0.toLowerCase();
		@Pc(9) short[] local9 = new short[16];
		@Pc(11) int local11 = 0;
		@Pc(18) int local18 = arg1 ? 32768 : 0;
		@Pc(29) int local29 = (arg1 ? Static592.aClass46_2.anInt855 : Static592.aClass46_2.anInt853) + local18;
		@Pc(80) int local80;
		for (@Pc(31) int local31 = local18; local31 < local29; local31++) {
			@Pc(37) Class14_Sub2_Sub8 local37 = Static592.aClass46_2.method897(local31);
			if (local37.aBoolean127 && local37.method1671().toLowerCase().indexOf(local6) != -1) {
				if (local11 >= 50) {
					Static280.anInt5164 = -1;
					Static345.aShortArray74 = null;
					return;
				}
				if (local9.length <= local11) {
					@Pc(78) short[] local78 = new short[local9.length * 2];
					for (local80 = 0; local80 < local11; local80++) {
						local78[local80] = local9[local80];
					}
					local9 = local78;
				}
				local9[local11++] = (short) local31;
			}
		}
		Static505.anInt8752 = 0;
		Static345.aShortArray74 = local9;
		Static280.anInt5164 = local11;
		@Pc(120) String[] local120 = new String[Static280.anInt5164];
		for (local80 = 0; local80 < Static280.anInt5164; local80++) {
			local120[local80] = Static592.aClass46_2.method897(local9[local80]).method1671();
		}
		Static286.method4787(local120, Static345.aShortArray74);
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(Lclient!jc;I)Lclient!lg;")
	public static Class74_Sub3 method4310(@OriginalArg(0) Class14_Sub21 arg0) {
		return new Class74_Sub3(arg0.method7752(), arg0.method7752(), arg0.method7752(), arg0.method7752(), arg0.method7719(), arg0.method7719(), arg0.method7695(117));
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "()V")
	public static void method4311() {
		for (@Pc(1) int local1 = 0; local1 < Static156.aClass143Array1.length; local1++) {
			Static156.aClass143Array1[local1].method3053();
		}
		Static156.aClass143Array1 = null;
	}
}
