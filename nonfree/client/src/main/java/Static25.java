import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "I")
	public static int anInt773;

	@OriginalMember(owner = "client!bb", name = "d", descriptor = "Lclient!kw;")
	public static Class189 aClass189_1;

	@OriginalMember(owner = "client!bb", name = "l", descriptor = "F")
	public static float aFloat12;

	@OriginalMember(owner = "client!bb", name = "p", descriptor = "Lclient!pe;")
	public static Class254 aClass254_12;

	@OriginalMember(owner = "client!bb", name = "h", descriptor = "[[I")
	public static final int[][] anIntArrayArray8 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

	@OriginalMember(owner = "client!bb", name = "m", descriptor = "I")
	public static int anInt779 = -1;

	@OriginalMember(owner = "client!bb", name = "v", descriptor = "[I")
	public static final int[] anIntArray23 = new int[4096];

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lclient!cp;IIIII)V")
	public static void method900(@OriginalArg(0) Class51 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.anInt8057 = 0;
		@Pc(7) int local7;
		label56: for (@Pc(4) int local4 = arg2; local4 <= arg4; local4++) {
			label54: for (local7 = arg3; local7 <= arg5; local7++) {
				@Pc(16) long local16 = Static272.aLongArrayArrayArray1[arg1][local4][local7];
				@Pc(18) long local18 = 0L;
				while (true) {
					label49: while (true) {
						if (local18 > 48L) {
							continue label54;
						}
						@Pc(27) int local27 = (int) (local16 >>> (int) local18 & 0xFFFFL);
						if (local27 <= 0) {
							continue label54;
						}
						@Pc(35) Class212 local35 = Static464.aClass212Array1[local27 - 1];
						for (@Pc(37) int local37 = 0; local37 < arg0.anInt8057; local37++) {
							if (arg0.aClass3_Sub28Array6[local37] == local35.aClass3_Sub28_2) {
								local18 += 16L;
								continue label49;
							}
						}
						arg0.aClass3_Sub28Array6[arg0.anInt8057++] = local35.aClass3_Sub28_2;
						if (arg0.anInt8057 == 4) {
							break label56;
						}
						local18 += 16L;
					}
				}
			}
		}
		for (local7 = arg0.anInt8057; local7 < 4; local7++) {
			arg0.aClass3_Sub28Array6[local7] = null;
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Ljava/lang/String;ZLjava/lang/String;)V")
	public static void method906(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		Static400.anInt7816 = -1;
		Static377.anInt7322 = 1;
		Static573.method8191(false, arg1, arg0);
	}

	@OriginalMember(owner = "client!bb", name = "c", descriptor = "(I)V")
	public static void method907() {
		@Pc(17) byte[] local17;
		if (Static489.anObject16 == null) {
			@Pc(10) Class73_Sub1_Sub1 local10 = new Class73_Sub1_Sub1();
			local17 = local10.method2182();
			Static489.anObject16 = Static499.method7539(local17);
		}
		if (Static337.anObject13 == null) {
			@Pc(34) Class73_Sub2_Sub2 local34 = new Class73_Sub2_Sub2();
			local17 = local34.method7245();
			Static337.anObject13 = Static499.method7539(local17);
		}
	}
}
