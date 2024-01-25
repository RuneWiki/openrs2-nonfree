import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static196 {

	@OriginalMember(owner = "client!mg", name = "j", descriptor = "Lclient!ae;")
	public static Class4 aClass4_15;

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "I")
	public static int anInt3969 = 0;

	@OriginalMember(owner = "client!mg", name = "h", descriptor = "Lclient!jm;")
	public static final Class105 aClass105_12 = new Class105("", 12);

	@OriginalMember(owner = "client!mg", name = "i", descriptor = "[I")
	public static final int[] anIntArray305 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!mg", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString39 = null;

	@OriginalMember(owner = "client!mg", name = "l", descriptor = "I")
	public static int anInt3975 = 1;

	@OriginalMember(owner = "client!mg", name = "m", descriptor = "[[I")
	public static final int[][] anIntArrayArray34 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIIIIZII)V")
	public static void method3685(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(14) int local14 = arg3 - 334;
		if (local14 < 0) {
			local14 = 0;
		} else if (local14 > 100) {
			local14 = 100;
		}
		@Pc(35) int local35 = (Static240.aShort70 - Static360.aShort95) * local14 / 100 + Static360.aShort95;
		@Pc(41) int local41 = local35 * arg2 >> 8;
		@Pc(48) int local48 = 16384 - arg0 & 0x3FFF;
		@Pc(55) int local55 = 16384 - arg5 & 0x3FFF;
		@Pc(57) int local57 = 0;
		@Pc(59) int local59 = 0;
		@Pc(61) int local61 = local41;
		if (local48 != 0) {
			local59 = Class208.anIntArray479[local48] * -local41 >> 15;
			local61 = local41 * Class208.anIntArray478[local48] >> 15;
		}
		if (local55 != 0) {
			local57 = local61 * Class208.anIntArray479[local55] >> 15;
			local61 = Class208.anIntArray478[local55] * local61 >> 15;
		}
		Static260.anInt5192 = arg4 - local61;
		Static272.anInt5295 = arg0;
		Static294.anInt5665 = arg6 - local59;
		Static14.anInt4971 = arg1 - local57;
		Static320.anInt4362 = arg5;
		Static129.anInt2810 = 0;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
	public static String method3687(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(11) char[] local11 = new char[local8];
		@Pc(13) byte local13 = 2;
		for (@Pc(27) int local27 = 0; local27 < local8; local27++) {
			@Pc(33) char local33 = arg0.charAt(local27);
			if (local13 == 0) {
				local33 = Character.toLowerCase(local33);
			} else if (local13 == 2 || Character.isUpperCase(local33)) {
				local33 = Static64.method5919(local33);
			}
			if (Character.isLetter(local33)) {
				local13 = 0;
			} else if (local33 == '.' || local33 == '?' || local33 == '!') {
				local13 = 2;
			} else if (!Character.isSpaceChar(local33)) {
				local13 = 1;
			} else if (local13 != 2) {
				local13 = 1;
			}
			local11[local27] = local33;
		}
		return new String(local11);
	}
}
