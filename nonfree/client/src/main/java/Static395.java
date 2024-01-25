import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static395 {

	@OriginalMember(owner = "client!ua", name = "K", descriptor = "[I")
	public static int[] anIntArray458;

	@OriginalMember(owner = "client!ua", name = "O", descriptor = "Lclient!sn;")
	public static Class223 aClass223_5;

	@OriginalMember(owner = "client!ua", name = "R", descriptor = "Ljava/lang/Boolean;")
	public static Boolean aBoolean586 = Boolean.FALSE;

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method5426(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(20) String local20 = Static384.method5331(arg0);
		if (local20 == null) {
			return;
		}
		for (@Pc(25) int local25 = 0; local25 < Static304.anInt5397; local25++) {
			@Pc(31) String local31 = Static371.aStringArray36[local25];
			if (local31.startsWith("*")) {
				local31 = local31.substring(1);
			}
			local31 = Static384.method5331(local31);
			if (local31 != null && local31.equals(local20)) {
				Static304.anInt5397--;
				for (@Pc(55) int local55 = local25; local55 < Static304.anInt5397; local55++) {
					Static371.aStringArray36[local55] = Static371.aStringArray36[local55 + 1];
					Static351.aStringArray32[local55] = Static351.aStringArray32[local55 + 1];
					Static350.anIntArray415[local55] = Static350.anIntArray415[local55 + 1];
					Static190.aStringArray16[local55] = Static190.aStringArray16[local55 + 1];
					Static49.anIntArray62[local55] = Static49.anIntArray62[local55 + 1];
					Static297.aBooleanArray40[local55] = Static297.aBooleanArray40[local55 + 1];
				}
				Static337.anInt5964 = Static331.anInt5891;
				Static448.method6059(Static72.aClass44_48);
				Static98.aClass2_Sub20_Sub1_1.method3699(Static209.method3225(arg0));
				Static98.aClass2_Sub20_Sub1_1.method3715(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ua", name = "f", descriptor = "(I)Z")
	public static boolean method5427() {
		if (Static187.aBoolean588) {
			try {
				Static461.method3590(Static303.aClass131_4.anApplet1, "showVideoAd");
				return true;
			} catch (@Pc(21) Throwable local21) {
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIILclient!bo;[I[I)Lclient!ig;")
	public static Class14_Sub2 method5428(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class26_Sub1 arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int[] arg4) {
		@Pc(10) byte[] local10 = new byte[arg0 * arg1];
		for (@Pc(17) int local17 = 0; local17 < arg1; local17++) {
			@Pc(27) int local27 = arg0 * local17 + arg3[local17];
			for (@Pc(29) int local29 = 0; local29 < arg4[local17]; local29++) {
				local10[local27++] = -1;
			}
		}
		return new Class14_Sub2(arg2, arg0, arg1, local10);
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(JB)Ljava/lang/String;")
	public static String method5429(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(34) int local34 = 0;
			for (@Pc(36) long local36 = arg0; local36 != 0L; local36 /= 37L) {
				local34++;
			}
			@Pc(52) StringBuffer local52 = new StringBuffer(local34);
			while (arg0 != 0L) {
				@Pc(56) long local56 = arg0;
				arg0 /= 37L;
				local52.append(Static166.aCharArray4[(int) (local56 - arg0 * 37L)]);
			}
			return local52.reverse().toString();
		}
	}
}
