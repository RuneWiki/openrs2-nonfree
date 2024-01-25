import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static537 {

	@OriginalMember(owner = "client!vda", name = "h", descriptor = "I")
	public static int anInt9109;

	@OriginalMember(owner = "client!vda", name = "f", descriptor = "Lclient!rh;")
	public static final Class275 aClass275_189 = new Class275();

	@OriginalMember(owner = "client!vda", name = "g", descriptor = "I")
	public static int anInt9108 = -1;

	@OriginalMember(owner = "client!vda", name = "i", descriptor = "I")
	public static int anInt9110 = 0;

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(JI)Ljava/lang/String;")
	public static String method7461(@OriginalArg(0) long arg0) {
		if (arg0 <= (long) 0 || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(28) int local28 = 0;
			@Pc(30) long local30 = arg0;
			while (local30 != 0L) {
				local30 /= 37L;
				local28++;
			}
			@Pc(46) StringBuffer local46 = new StringBuffer(local28);
			while (arg0 != 0L) {
				@Pc(50) long local50 = arg0;
				arg0 /= 37L;
				@Pc(64) char local64 = Static505.aCharArray10[(int) (local50 - arg0 * 37L)];
				if (local64 == '_') {
					@Pc(72) int local72 = local46.length() - 1;
					local46.setCharAt(local72, Character.toUpperCase(local46.charAt(local72)));
					local64 = ' ';
				}
				local46.append(local64);
			}
			local46.reverse();
			local46.setCharAt(0, Character.toUpperCase(local46.charAt(0)));
			return local46.toString();
		}
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(Lclient!oa;Lclient!bo;III)V")
	public static void method7462(@OriginalArg(0) Class121 arg0, @OriginalArg(1) Class29 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(12) Class9 local12;
		if (arg3 < Static80.anInt1391) {
			local12 = Static208.aClass9ArrayArrayArray3[arg2][arg3 + 1][arg4];
			if (local12 != null && local12.aClass29_Sub3_1 != null && local12.aClass29_Sub3_1.method7540()) {
				arg1.method7543(local12.aClass29_Sub3_1, 0, arg0, Static57.anInt953, 0, true);
			}
		}
		if (arg4 < Static80.anInt1391) {
			local12 = Static208.aClass9ArrayArrayArray3[arg2][arg3][arg4 + 1];
			if (local12 != null && local12.aClass29_Sub3_1 != null && local12.aClass29_Sub3_1.method7540()) {
				arg1.method7543(local12.aClass29_Sub3_1, 0, arg0, 0, Static57.anInt953, true);
			}
		}
		if (arg3 < Static80.anInt1391 && arg4 < Static164.anInt2881) {
			local12 = Static208.aClass9ArrayArrayArray3[arg2][arg3 + 1][arg4 + 1];
			if (local12 != null && local12.aClass29_Sub3_1 != null && local12.aClass29_Sub3_1.method7540()) {
				arg1.method7543(local12.aClass29_Sub3_1, 0, arg0, Static57.anInt953, Static57.anInt953, true);
			}
		}
		if (arg3 < Static80.anInt1391 && arg4 > 0) {
			local12 = Static208.aClass9ArrayArrayArray3[arg2][arg3 + 1][arg4 - 1];
			if (local12 != null && local12.aClass29_Sub3_1 != null && local12.aClass29_Sub3_1.method7540()) {
				arg1.method7543(local12.aClass29_Sub3_1, 0, arg0, Static57.anInt953, -Static57.anInt953, true);
			}
		}
	}
}
