import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static641 {

	@OriginalMember(owner = "client!ws", name = "h", descriptor = "[I")
	public static int[] anIntArray604;

	@OriginalMember(owner = "client!ws", name = "i", descriptor = "I")
	public static int anInt10604;

	@OriginalMember(owner = "client!ws", name = "j", descriptor = "I")
	public static int anInt10605;

	@OriginalMember(owner = "client!ws", name = "n", descriptor = "[[B")
	public static byte[][] aByteArrayArray31;

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(Lclient!pe;Z)I")
	public static int method9010(@OriginalArg(0) Class4_Sub2_Sub1_Sub1 arg0) {
		if (arg0.anInt1207 == 0) {
			return 0;
		}
		@Pc(72) int local72;
		@Pc(65) int local65;
		if (arg0.anInt1272 != -1) {
			@Pc(23) Class4_Sub2_Sub1_Sub1 local23 = null;
			if (arg0.anInt1272 < 32768) {
				@Pc(51) Class5_Sub3 local51 = (Class5_Sub3) Static445.aClass273_29.method6581((long) arg0.anInt1272);
				if (local51 != null) {
					local23 = local51.aClass4_Sub2_Sub1_Sub1_Sub2_1;
				}
			} else if (arg0.anInt1272 >= 32768) {
				local23 = Static393.aClass4_Sub2_Sub1_Sub1_Sub1Array12[arg0.anInt1272 - 32768];
			}
			if (local23 != null) {
				local65 = arg0.anInt10231 - local23.anInt10231;
				local72 = arg0.anInt10229 - local23.anInt10229;
				if (local65 != 0 || local72 != 0) {
					arg0.method1036((int) (Math.atan2((double) local65, (double) local72) * 2607.5945876176133D) & 0x3FFF);
				}
			}
		}
		if (arg0 instanceof Class4_Sub2_Sub1_Sub1_Sub1) {
			@Pc(98) Class4_Sub2_Sub1_Sub1_Sub1 local98 = (Class4_Sub2_Sub1_Sub1_Sub1) arg0;
			if (local98.anInt917 != -1 && (local98.anInt1280 == 0 || local98.anInt1279 > 0)) {
				local98.method1036(local98.anInt917);
				local98.anInt917 = -1;
			}
		} else if (arg0 instanceof Class4_Sub2_Sub1_Sub1_Sub2) {
			@Pc(128) Class4_Sub2_Sub1_Sub1_Sub2 local128 = (Class4_Sub2_Sub1_Sub1_Sub2) arg0;
			if (local128.anInt1291 != -1 && (local128.anInt1280 == 0 || local128.anInt1279 > 0)) {
				local65 = local128.anInt10231 - (local128.anInt1291 - Static565.anInt9560 - Static565.anInt9560) * 256;
				local72 = local128.anInt10229 - (local128.anInt1293 - Static567.anInt9589 - Static567.anInt9589) * 256;
				if (local65 != 0 || local72 != 0) {
					local128.method1036((int) (Math.atan2((double) local65, (double) local72) * 2607.5945876176133D) & 0x3FFF);
				}
				local128.anInt1291 = -1;
			}
		}
		return arg0.method1021();
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(JI)Ljava/lang/String;")
	public static String method9013(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(36) int local36 = 0;
			for (@Pc(38) long local38 = arg0; local38 != 0L; local38 /= 37L) {
				local36++;
			}
			@Pc(56) StringBuffer local56 = new StringBuffer(local36);
			while (arg0 != 0L) {
				@Pc(60) long local60 = arg0;
				arg0 /= 37L;
				@Pc(74) char local74 = Static266.aCharArray2[(int) (local60 - arg0 * 37L)];
				if (local74 == '_') {
					@Pc(82) int local82 = local56.length() - 1;
					local56.setCharAt(local82, Character.toUpperCase(local56.charAt(local82)));
					local74 = ' ';
				}
				local56.append(local74);
			}
			local56.reverse();
			local56.setCharAt(0, Character.toUpperCase(local56.charAt(0)));
			return local56.toString();
		}
	}
}
