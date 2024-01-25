import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!bg", name = "c", descriptor = "Z")
	public static boolean aBoolean39;

	@OriginalMember(owner = "client!bg", name = "g", descriptor = "Lclient!vv;")
	public static Class256 aClass256_1;

	@OriginalMember(owner = "client!bg", name = "i", descriptor = "I")
	public static int anInt542;

	@OriginalMember(owner = "client!bg", name = "k", descriptor = "I")
	public static int anInt543 = 0;

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method476(@OriginalArg(1) String arg0) {
		@Pc(13) int local13 = arg0.length();
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < local13; local17++) {
			@Pc(23) char local23 = arg0.charAt(local17);
			if (local23 == '<' || local23 == '>') {
				local15 += 3;
			}
		}
		@Pc(47) StringBuffer local47 = new StringBuffer(local15 + local13);
		for (@Pc(49) int local49 = 0; local49 < local13; local49++) {
			@Pc(55) char local55 = arg0.charAt(local49);
			if (local55 == '<') {
				local47.append("<lt>");
			} else if (local55 == '>') {
				local47.append("<gt>");
			} else {
				local47.append(local55);
			}
		}
		return local47.toString();
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(BLclient!ne;)Z")
	public static boolean method477(@OriginalArg(1) Class166 arg0) {
		return Static208.aClass166_5 == arg0 || Static194.aClass166_4 == arg0 || Static368.aClass166_7 == arg0 || arg0 == Static33.aClass166_1;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(I[Ljava/lang/String;IB)Ljava/lang/String;")
	public static String method478(@OriginalArg(0) int arg0, @OriginalArg(1) String[] arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 0) {
			return "";
		} else if (arg2 == 1) {
			@Pc(18) String local18 = arg1[arg0];
			return local18 == null ? "null" : local18.toString();
		} else {
			@Pc(29) int local29 = arg2 + arg0;
			@Pc(31) int local31 = 0;
			for (@Pc(33) int local33 = arg0; local33 < local29; local33++) {
				@Pc(39) String local39 = arg1[local33];
				if (local39 == null) {
					local31 += 4;
				} else {
					local31 += local39.length();
				}
			}
			@Pc(67) StringBuffer local67 = new StringBuffer(local31);
			for (@Pc(69) int local69 = arg0; local69 < local29; local69++) {
				@Pc(75) String local75 = arg1[local69];
				if (local75 == null) {
					local67.append("null");
				} else {
					local67.append(local75);
				}
			}
			return local67.toString();
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lclient!jd;IIIII)V")
	public static void method479(@OriginalArg(0) Class121 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.anInt5076 = 0;
		for (@Pc(4) int local4 = 0; local4 < 4; local4++) {
			if (arg0.aClass1_Sub24Array3[local4] != null) {
				arg0.anInt5076++;
			}
		}
		label51: for (@Pc(22) int local22 = 0; local22 < arg0.anInt5076; local22++) {
			@Pc(31) long local31 = Static112.aLongArrayArrayArray1[arg1][arg2][arg3];
			@Pc(41) Class71 local41;
			while (local31 != 0L) {
				local41 = Static280.aClass71Array1[(int) ((local31 & 0xFFFFL) - 1L)];
				local31 >>>= 0x10;
				if (local41.aClass1_Sub24_1 == arg0.aClass1_Sub24Array3[local22]) {
					continue label51;
				}
			}
			local31 = Static112.aLongArrayArrayArray1[arg1][arg4][arg5];
			while (local31 != 0L) {
				local41 = Static280.aClass71Array1[(int) ((local31 & 0xFFFFL) - 1L)];
				local31 >>>= 0x10;
				if (local41.aClass1_Sub24_1 == arg0.aClass1_Sub24Array3[local22]) {
					continue label51;
				}
			}
			for (@Pc(93) int local93 = local22; local93 < arg0.anInt5076 - 1; local93++) {
				arg0.aClass1_Sub24Array3[local93] = arg0.aClass1_Sub24Array3[local93 + 1];
			}
			arg0.anInt5076--;
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(Ljava/lang/String;IZ)V")
	public static void method481(@OriginalArg(0) String arg0, @OriginalArg(2) boolean arg1) {
		Static9.aClass113_5.anInt2734 = 1;
		@Pc(11) String local11 = arg0.toLowerCase();
		@Pc(14) short[] local14 = new short[16];
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < Static227.aClass65_2.anInt1635; local18++) {
			@Pc(25) Class74 local25 = Static227.aClass65_2.method1327(local18);
			if ((!arg1 || local25.aBoolean137) && local25.anInt1848 == -1 && local25.anInt1868 == -1 && local25.anInt1842 == 0 && local25.aString14.toLowerCase().indexOf(local11) != -1) {
				if (local16 >= 250) {
					Static62.anInt1109 = -1;
					Static355.aShortArray72 = null;
					return;
				}
				if (local14.length <= local16) {
					@Pc(74) short[] local74 = new short[local14.length * 2];
					for (@Pc(76) int local76 = 0; local76 < local16; local76++) {
						local74[local76] = local14[local76];
					}
					local14 = local74;
				}
				local14[local16++] = (short) local18;
			}
		}
		Static62.anInt1109 = local16;
		Static355.aShortArray72 = local14;
		Static441.anInt7348 = 0;
		@Pc(110) String[] local110 = new String[Static62.anInt1109];
		for (@Pc(112) int local112 = 0; local112 < Static62.anInt1109; local112++) {
			local110[local112] = Static227.aClass65_2.method1327(local14[local112]).aString14;
		}
		Static367.method4767(local110, Static355.aShortArray72);
		Static9.aClass113_5.method2256();
		Static9.aClass113_5.anInt2734 = 2;
	}
}
