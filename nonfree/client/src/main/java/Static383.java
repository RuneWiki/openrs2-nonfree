import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static383 {

	@OriginalMember(owner = "client!ok", name = "z", descriptor = "[[I")
	public static int[][] anIntArrayArray62;

	@OriginalMember(owner = "client!ok", name = "s", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray29 = new String[100];

	@OriginalMember(owner = "client!ok", name = "y", descriptor = "I")
	public static int anInt6777 = 1;

	@OriginalMember(owner = "client!ok", name = "O", descriptor = "I")
	public static int anInt6790 = 0;

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(JB)Ljava/lang/String;")
	public static String method5682(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(27) int local27 = 0;
			@Pc(29) long local29 = arg0;
			while (local29 != 0L) {
				local29 /= 37L;
				local27++;
			}
			@Pc(50) StringBuffer local50 = new StringBuffer(local27);
			while (arg0 != 0L) {
				@Pc(54) long local54 = arg0;
				arg0 /= 37L;
				@Pc(68) char local68 = Static98.aCharArray4[(int) (local54 - arg0 * 37L)];
				if (local68 == '_') {
					@Pc(76) int local76 = local50.length() - 1;
					local68 = ' ';
					local50.setCharAt(local76, Character.toUpperCase(local50.charAt(local76)));
				}
				local50.append(local68);
			}
			local50.reverse();
			local50.setCharAt(0, Character.toUpperCase(local50.charAt(0)));
			return local50.toString();
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(BLclient!eh;)V")
	public static void method5684(@OriginalArg(1) Class4_Sub9 arg0) {
		for (@Pc(11) int local11 = 0; local11 < Static472.anInt7955; local11++) {
			@Pc(17) int local17 = arg0.method5978();
			@Pc(21) int local21 = arg0.method5982();
			if (local21 == 65535) {
				local21 = -1;
			}
			if (Static286.aClass7_Sub1Array5[local17] != null) {
				Static286.aClass7_Sub1Array5[local17].anInt81 = local21;
			}
		}
	}
}
