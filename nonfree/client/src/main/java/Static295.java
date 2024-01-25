import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static295 {

	@OriginalMember(owner = "client!or", name = "m", descriptor = "I")
	public static int anInt5287;

	@OriginalMember(owner = "client!or", name = "n", descriptor = "I")
	public static int anInt5288;

	@OriginalMember(owner = "client!or", name = "p", descriptor = "Lclient!bu;")
	public static Class32 aClass32_67;

	@OriginalMember(owner = "client!or", name = "r", descriptor = "I")
	public static int anInt5290;

	@OriginalMember(owner = "client!or", name = "u", descriptor = "[[I")
	public static int[][] anIntArrayArray34;

	@OriginalMember(owner = "client!or", name = "o", descriptor = "[I")
	public static final int[] anIntArray359 = new int[100];

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(Lclient!ln;I)V")
	public static void method4136(@OriginalArg(0) Class7_Sub2_Sub3_Sub2 arg0) {
		@Pc(15) Class3_Sub12 local15 = (Class3_Sub12) Static272.aClass11_36.method324((long) arg0.anInt4391);
		if (local15 == null) {
			return;
		}
		if (local15.aClass3_Sub5_Sub2_1 != null) {
			Static331.aClass3_Sub5_Sub1_42.method886(local15.aClass3_Sub5_Sub2_1);
			local15.aClass3_Sub5_Sub2_1 = null;
		}
		local15.method5977();
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(ZJ)Ljava/lang/String;")
	public static String method4137(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(27) int local27 = 0;
			for (@Pc(29) long local29 = arg0; local29 != 0L; local29 /= 37L) {
				local27++;
			}
			@Pc(44) StringBuffer local44 = new StringBuffer(local27);
			while (arg0 != 0L) {
				@Pc(47) long local47 = arg0;
				arg0 /= 37L;
				@Pc(61) char local61 = Static334.aCharArray4[(int) (local47 - arg0 * 37L)];
				if (local61 == '_') {
					@Pc(69) int local69 = local44.length() - 1;
					local61 = ' ';
					local44.setCharAt(local69, Character.toUpperCase(local44.charAt(local69)));
				}
				local44.append(local61);
			}
			local44.reverse();
			local44.setCharAt(0, Character.toUpperCase(local44.charAt(0)));
			return local44.toString();
		}
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(IB)V")
	public static void method4138(@OriginalArg(0) int arg0) {
		@Pc(8) Class3_Sub4_Sub12 local8 = Static393.method5080(arg0, 6);
		local8.method3244();
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(IIIIB)V")
	public static void method4139(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg1;
		@Pc(12) int local12 = -arg1;
		Static412.method5293(Static262.anIntArrayArray31[arg3], arg2, arg0 - arg1, arg1 + arg0);
		@Pc(32) int local32 = -1;
		while (local9 > local7) {
			local32 += 2;
			local7++;
			local12 += local32;
			if (local12 >= 0) {
				local9--;
				local12 -= local9 << 1;
				@Pc(58) int[] local58 = Static262.anIntArrayArray31[arg3 + local9];
				@Pc(65) int[] local65 = Static262.anIntArrayArray31[arg3 - local9];
				@Pc(69) int local69 = local7 + arg0;
				@Pc(74) int local74 = arg0 - local7;
				Static412.method5293(local58, arg2, local74, local69);
				Static412.method5293(local65, arg2, local74, local69);
			}
			@Pc(94) int local94 = local9 + arg0;
			@Pc(98) int local98 = arg0 - local9;
			@Pc(104) int[] local104 = Static262.anIntArrayArray31[local7 + arg3];
			@Pc(111) int[] local111 = Static262.anIntArrayArray31[arg3 - local7];
			Static412.method5293(local104, arg2, local98, local94);
			Static412.method5293(local111, arg2, local98, local94);
		}
	}
}
