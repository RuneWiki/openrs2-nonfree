import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static107 {

	@OriginalMember(owner = "client!gm", name = "f", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray80 = new String[200];

	@OriginalMember(owner = "client!gm", name = "g", descriptor = "Lclient!sl;")
	public static final Class184 aClass184_5 = new Class184();

	@OriginalMember(owner = "client!gm", name = "j", descriptor = "Lclient!dj;")
	public static final Class43 aClass43_35 = new Class43(32);

	@OriginalMember(owner = "client!gm", name = "k", descriptor = "I")
	public static int anInt6417 = 0;

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(ZIB)V")
	public static void method5410(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		@Pc(17) Class4_Sub44 local17 = Static92.method531(arg0, arg1);
		if (local17 != null) {
			for (@Pc(22) int local22 = 0; local22 < local17.anIntArray502.length; local22++) {
				local17.anIntArray502[local22] = -1;
				local17.anIntArray503[local22] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(Lclient!tj;Z)V")
	public static void method5413(@OriginalArg(0) Class193 arg0) {
		Static340.anInt6522 = arg0.method5066("titlebg");
		Static271.anInt5402 = arg0.method5066("logo");
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;")
	public static String method5414(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(17) char[] local17 = new char[local8];
		@Pc(19) byte local19 = 2;
		for (@Pc(21) int local21 = 0; local21 < local8; local21++) {
			@Pc(27) char local27 = arg0.charAt(local21);
			if (local19 == 0) {
				local27 = Character.toLowerCase(local27);
			} else if (local19 == 2 || Character.isUpperCase(local27)) {
				local27 = Static116.method2423(local27);
			}
			if (Character.isLetter(local27)) {
				local19 = 0;
			} else if (local27 == '.' || local27 == '?' || local27 == '!') {
				local19 = 2;
			} else if (!Character.isSpaceChar(local27)) {
				local19 = 1;
			} else if (local19 != 2) {
				local19 = 1;
			}
			local17[local21] = local27;
		}
		return new String(local17);
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(II)V")
	public static void method5416(@OriginalArg(0) int arg0) {
		Static301.anInt5767 = arg0;
		@Pc(7) Class198 local7 = Static334.aClass198_141;
		synchronized (Static334.aClass198_141) {
			Static334.aClass198_141.method5213();
		}
	}
}
