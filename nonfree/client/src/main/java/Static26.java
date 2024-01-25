import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static26 {

	@OriginalMember(owner = "client!bl", name = "c", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray1;

	@OriginalMember(owner = "client!bl", name = "e", descriptor = "[I")
	public static int[] anIntArray31;

	@OriginalMember(owner = "client!bl", name = "l", descriptor = "Lclient!gj;")
	public static Class31 aClass31_16;

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "J")
	public static long aLong14 = 0L;

	@OriginalMember(owner = "client!bl", name = "d", descriptor = "[[I")
	public static final int[][] anIntArrayArray18 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!bl", name = "j", descriptor = "S")
	public static short aShort15 = 32767;

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;")
	public static String method739(@OriginalArg(1) String arg0) {
		@Pc(13) int local13 = arg0.length();
		@Pc(16) char[] local16 = new char[local13];
		@Pc(18) byte local18 = 2;
		for (@Pc(20) int local20 = 0; local20 < local13; local20++) {
			@Pc(26) char local26 = arg0.charAt(local20);
			if (local18 == 0) {
				local26 = Character.toLowerCase(local26);
			} else if (local18 == 2 || Character.isUpperCase(local26)) {
				local26 = Static192.method3453(local26);
			}
			if (Character.isLetter(local26)) {
				local18 = 0;
			} else if (local26 == '.' || local26 == '?' || local26 == '!') {
				local18 = 2;
			} else if (!Character.isSpaceChar(local26)) {
				local18 = 1;
			} else if (local18 != 2) {
				local18 = 1;
			}
			local16[local20] = local26;
		}
		return new String(local16);
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIILclient!tq;)Lclient!gq;")
	public static Class2_Sub11_Sub6 method742(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class191 arg2) {
		@Pc(22) Class2_Sub10 local22 = new Class2_Sub10(arg2.method5459(arg1, arg0));
		@Pc(55) Class2_Sub11_Sub6 local55 = new Class2_Sub11_Sub6(arg0, local22.method4409(), local22.method4409(), local22.method4444(), local22.method4444(), local22.method4421() == 1, local22.method4421(), local22.method4421());
		@Pc(59) int local59 = local22.method4421();
		for (@Pc(61) int local61 = 0; local61 < local59; local61++) {
			local55.aClass216_23.method5995(new Class2_Sub28(local22.method4421(), local22.method4464(), local22.method4464(), local22.method4464(), local22.method4464(), local22.method4464(), local22.method4464(), local22.method4464(), local22.method4464()));
		}
		local55.method2385();
		return local55;
	}
}
