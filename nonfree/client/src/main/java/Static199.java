import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static199 {

	@OriginalMember(owner = "client!pc", name = "B", descriptor = "Z")
	public static boolean aBoolean240;

	@OriginalMember(owner = "client!pc", name = "t", descriptor = "Ljava/lang/String;")
	public static String aString140 = "Connecting to update server";

	@OriginalMember(owner = "client!pc", name = "v", descriptor = "Lclient!qg;")
	public static Class131 aClass131_13 = new Class131();

	@OriginalMember(owner = "client!pc", name = "x", descriptor = "Lclient!tl;")
	public static Class155 aClass155_37 = new Class155(64);

	@OriginalMember(owner = "client!pc", name = "y", descriptor = "Ljava/lang/String;")
	public static String aString141 = "Loading fonts - ";

	@OriginalMember(owner = "client!pc", name = "z", descriptor = "I")
	public static int anInt4490 = 0;

	@OriginalMember(owner = "client!pc", name = "A", descriptor = "I")
	public static int anInt4491 = 0;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(III)J")
	public static long method3572(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub14 local7 = Static132.aClass1_Sub14ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return 0L;
		}
		for (@Pc(13) int local13 = 0; local13 < local7.anInt2332; local13++) {
			@Pc(22) Class152 local22 = local7.aClass152Array1[local13];
			if ((local22.aLong181 >> 29 & 0x3L) == 2L && local22.anInt5509 == arg1 && local22.anInt5519 == arg2) {
				return local22.aLong181;
			}
		}
		return 0L;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/String;")
	public static String method3573(@OriginalArg(0) String arg0) {
		@Pc(3) byte local3 = 2;
		@Pc(6) int local6 = arg0.length();
		@Pc(9) char[] local9 = new char[local6];
		for (@Pc(15) int local15 = 0; local15 < local6; local15++) {
			@Pc(22) char local22 = arg0.charAt(local15);
			if (local3 == 0) {
				local22 = Character.toLowerCase(local22);
			} else if (local3 == 2 || Character.isUpperCase(local22)) {
				local22 = Static223.method937(local22);
			}
			if (Character.isLetter(local22)) {
				local3 = 0;
			} else if (local22 == '.' || local22 == '?' || local22 == '!') {
				local3 = 2;
			} else if (!Character.isSpaceChar(local22)) {
				local3 = 1;
			} else if (local3 != 2) {
				local3 = 1;
			}
			local9[local15] = local22;
		}
		return new String(local9);
	}
}
