import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static244 {

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "Lclient!f;")
	public static Class88 aClass88_30;

	@OriginalMember(owner = "client!ji", name = "e", descriptor = "F")
	public static float aFloat197;

	@OriginalMember(owner = "client!ji", name = "c", descriptor = "Lclient!eda;")
	public static final Class90 aClass90_129 = new Class90(46, 5);

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Ljava/lang/String;BLclient!kfa;I)Lclient!ru;")
	public static Class296 method7174(@OriginalArg(0) String arg0, @OriginalArg(2) Class7_Sub2 arg1) {
		@Pc(5) int local5 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local5);
		OpenGL.glProgramStringARB(34336, 34933, arg0);
		OpenGL.glGetIntegerv(34379, Static376.anIntArray400, 0);
		if (Static376.anIntArray400[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class296(arg1, 34336, local5);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(JI)Ljava/lang/String;")
	public static String method7176(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(29) int local29 = 0;
			for (@Pc(36) long local36 = arg0; local36 != 0L; local36 /= 37L) {
				local29++;
			}
			@Pc(54) StringBuffer local54 = new StringBuffer(local29);
			while (arg0 != 0L) {
				@Pc(58) long local58 = arg0;
				arg0 /= 37L;
				local54.append(Static334.aCharArray5[(int) (local58 - arg0 * 37L)]);
			}
			return local54.reverse().toString();
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(B[[BLclient!n;)V")
	public static void method7177(@OriginalArg(1) byte[][] arg0, @OriginalArg(2) Class123_Sub1 arg1) {
		for (@Pc(12) int local12 = 0; local12 < arg1.anInt6514; local12++) {
			Static487.method7088();
			for (@Pc(18) int local18 = 0; local18 < Static338.anInt6508 >> 3; local18++) {
				for (@Pc(22) int local22 = 0; local22 < Static390.anInt7654 >> 3; local22++) {
					@Pc(32) int local32 = Static119.anIntArrayArrayArray4[local12][local18][local22];
					if (local32 != -1) {
						@Pc(41) int local41 = local32 >> 24 & 0x3;
						if (!arg1.aBoolean443 || local41 == 0) {
							@Pc(55) int local55 = local32 >> 1 & 0x3;
							@Pc(61) int local61 = local32 >> 14 & 0x3FF;
							@Pc(67) int local67 = local32 >> 3 & 0x7FF;
							@Pc(77) int local77 = local67 / 8 + (local61 / 8 << 8);
							for (@Pc(79) int local79 = 0; local79 < Static322.anIntArray351.length; local79++) {
								if (Static322.anIntArray351[local79] == local77 && arg0[local79] != null) {
									arg1.method5171(Static526.aClass232Array1, (local67 & 0x7) * 8, local18 * 8, Static39.aClass7_2, local22 * 8, (local61 & 0x7) * 8, arg0[local79], local55, local41, local12);
									break;
								}
							}
						}
					}
				}
			}
		}
	}
}
