import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static481 {

	@OriginalMember(owner = "client!raa", name = "q", descriptor = "I")
	public static int anInt8219;

	@OriginalMember(owner = "client!raa", name = "n", descriptor = "Z")
	public static boolean aBoolean591 = true;

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(Lclient!ha;IIIIII)Lclient!ka;")
	public static Class75 method7110(@OriginalArg(0) Class82 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(6) long local6 = (long) arg4;
		@Pc(12) Class75 local12 = (Class75) Static614.aClass136_71.method3134(local6);
		if (local12 == null) {
			@Pc(22) Class359 local22 = Static11.method201(Static638.aClass343_270, arg4);
			if (local22 == null) {
				return null;
			}
			if (local22.anInt9841 < 13) {
				local22.method8347();
			}
			local12 = arg0.method6176(local22, 2055, Static89.anInt6486, 64, 768);
			Static614.aClass136_71.method3135(local12, local6);
		}
		local12 = local12.method6805((byte) 2, 2055, true);
		if (arg3 != 0) {
			local12.a(arg3);
		}
		if (arg5 != 0) {
			local12.FA(arg5);
		}
		if (arg2 != 0) {
			local12.VA(arg2);
		}
		if (arg1 != 0) {
			local12.H(0, arg1, 0);
		}
		return local12;
	}

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(I)V")
	public static void method7111() {
		if (Static113.aClass174_3 == null) {
			return;
		}
		if (Static113.aClass174_3.anInt5121 == 1) {
			Static113.aClass174_3 = null;
			return;
		}
		if (Static113.aClass174_3.anInt5121 == 2) {
			Static38.method708(2, Static413.aString62, Static596.aClass298_14);
			Static113.aClass174_3 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(Lclient!uu;ZIIIII)V")
	public static void method7113(@OriginalArg(0) Class343 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg1 <= 0) {
			Static471.method6966(arg3, arg0, arg2);
			return;
		}
		Static522.aClass3_Sub3_Sub1_4 = null;
		Static169.anInt3281 = 1;
		Static634.aBoolean764 = false;
		Static151.anInt3054 = 0;
		Static240.aClass343_120 = arg0;
		Static229.anInt4628 = arg3;
		Static471.anInt8063 = arg2;
		Static428.anInt7479 = Static466.aClass3_Sub3_Sub1_3.method153() / arg1;
		if (Static428.anInt7479 < 1) {
			Static428.anInt7479 = 1;
		}
	}

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(I[Ljava/lang/String;II)Ljava/lang/String;")
	public static String method7114(@OriginalArg(1) String[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 0) {
			return "";
		} else if (arg2 == 1) {
			@Pc(16) String local16 = arg0[arg1];
			return local16 == null ? "null" : local16.toString();
		} else {
			@Pc(27) int local27 = arg2 + arg1;
			@Pc(29) int local29 = 0;
			for (@Pc(31) int local31 = arg1; local31 < local27; local31++) {
				@Pc(37) String local37 = arg0[local31];
				if (local37 == null) {
					local29 += 4;
				} else {
					local29 += local37.length();
				}
			}
			@Pc(60) StringBuffer local60 = new StringBuffer(local29);
			for (@Pc(70) int local70 = arg1; local70 < local27; local70++) {
				@Pc(76) String local76 = arg0[local70];
				if (local76 == null) {
					local60.append("null");
				} else {
					local60.append(local76);
				}
			}
			return local60.toString();
		}
	}
}
