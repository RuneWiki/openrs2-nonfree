import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static272 {

	@OriginalMember(owner = "client!ns", name = "f", descriptor = "I")
	public static final int anInt4522 = 1401;

	@OriginalMember(owner = "client!ns", name = "o", descriptor = "Ljava/lang/String;")
	public static String aString37 = null;

	@OriginalMember(owner = "client!ns", name = "u", descriptor = "Z")
	public static boolean aBoolean335 = false;

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(Lclient!w;Lclient!ya;I)I")
	public static int method3611(@OriginalArg(0) Class261 arg0, @OriginalArg(1) Class135 arg1) {
		if (arg0.anInt7245 != -1) {
			return arg0.anInt7245;
		}
		if (arg0.anInt7247 != -1) {
			@Pc(36) Class112 local36 = arg1.anInterface5_7.method4079(arg1.method5367() ? arg0.anInt7247 : arg0.anInt7239);
			if (!local36.aBoolean189) {
				return local36.aShort41;
			}
		}
		return arg0.anInt7253;
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(JB)Ljava/lang/String;")
	public static String method3613(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(27) int local27 = 0;
			for (@Pc(29) long local29 = arg0; local29 != 0L; local29 /= 37L) {
				local27++;
			}
			@Pc(52) StringBuffer local52 = new StringBuffer(local27);
			while (arg0 != 0L) {
				@Pc(55) long local55 = arg0;
				arg0 /= 37L;
				local52.append(Static189.aCharArray5[(int) (local55 - arg0 * 37L)]);
			}
			return local52.reverse().toString();
		}
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(III)I")
	public static int method3614(@OriginalArg(1) int arg0) {
		if (arg0 == -1) {
			return 12345678;
		}
		@Pc(25) int local25 = (arg0 & 0x7F) * 96 >> 7;
		if (local25 < 2) {
			local25 = 2;
		} else if (local25 > 126) {
			local25 = 126;
		}
		return (arg0 & 0xFF80) + local25;
	}

	@OriginalMember(owner = "client!ns", name = "b", descriptor = "(III)I")
	public static int method3620(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 == 1 || arg1 == 3 ? Static312.anIntArray409[arg0 & 0x3] : Static68.anIntArray104[arg0 & 0x3];
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(BII)Z")
	public static boolean method3621(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x10) != 0;
	}
}
