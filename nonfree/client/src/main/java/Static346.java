import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static346 {

	@OriginalMember(owner = "client!wg", name = "B", descriptor = "Ljava/lang/String;")
	public static String aString255;

	@OriginalMember(owner = "client!wg", name = "K", descriptor = "Lclient!uc;")
	public static final Class198 aClass198_62 = new Class198(4);

	@OriginalMember(owner = "client!wg", name = "M", descriptor = "Lclient!sj;")
	public static Class181 aClass181_57 = null;

	@OriginalMember(owner = "client!wg", name = "c", descriptor = "(I)V")
	public static void method5641() {
		Static307.aClass3_Sub26_1 = new Class3_Sub26(Static350.aString258, "", Static164.anInt6256, 1010, 0L, 0, 0);
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Z)V")
	public static void method5643() {
		Static180.anInt3865 = 0;
		Static143.anInt6718 = 0;
		Static232.anInt4687 = 0;
		Static268.anInt5405 = 0;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIZ)I")
	public static int method5644(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) int local9 = arg0 + arg1 * 57;
		@Pc(15) int local15 = local9 ^ local9 << 13;
		@Pc(29) int local29 = (local15 * 15731 * local15 + 789221) * local15 + 1376312589 & Integer.MAX_VALUE;
		return local29 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IBZ)Ljava/lang/String;")
	public static String method5645(@OriginalArg(0) int arg0) {
		return arg0 < 0 ? Integer.toString(arg0) : Static321.method5268(arg0);
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Ljava/lang/String;B)J")
	public static long method5649(@OriginalArg(0) String arg0) {
		@Pc(13) int local13 = arg0.length();
		@Pc(15) long local15 = 0L;
		for (@Pc(17) int local17 = 0; local17 < local13; local17++) {
			local15 = (local15 << 5) + (long) arg0.charAt(local17) - local15;
		}
		return local15;
	}
}
