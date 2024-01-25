import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!bf", name = "q", descriptor = "I")
	public static int anInt396;

	@OriginalMember(owner = "client!bf", name = "z", descriptor = "I")
	public static int anInt399;

	@OriginalMember(owner = "client!bf", name = "B", descriptor = "[I")
	public static int[] anIntArray50;

	@OriginalMember(owner = "client!bf", name = "C", descriptor = "Lclient!lp;")
	public static Class71 aClass71_1;

	@OriginalMember(owner = "client!bf", name = "u", descriptor = "Lclient!ik;")
	public static final Class102 aClass102_11 = new Class102("", 10);

	@OriginalMember(owner = "client!bf", name = "A", descriptor = "I")
	public static int anInt400 = 0;

	@OriginalMember(owner = "client!bf", name = "D", descriptor = "[I")
	public static final int[] anIntArray51 = new int[5];

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(II)V")
	public static void method324(@OriginalArg(1) int arg0) {
		if (arg0 != -1 && Static230.aBooleanArray26[arg0]) {
			Static14.aClass104_9.method2749(arg0);
			Static264.aClass68ArrayArray1[arg0] = null;
			Static230.aBooleanArray26[arg0] = false;
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Z)V")
	public static void method329() {
		Static79.aClass37_2.method3701(Static341.anInt462, Static245.aBoolean453 ? Static346.anInt5919 + 256 : -1);
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(ILclient!s;[[BILclient!s;Lclient!dr;[[BIBZ[[B[[B[[I)V")
	public static void method330(@OriginalArg(0) int arg0, @OriginalArg(1) Class105 arg1, @OriginalArg(2) byte[][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class105 arg4, @OriginalArg(5) Class37 arg5, @OriginalArg(6) byte[][] arg6, @OriginalArg(7) int arg7, @OriginalArg(9) boolean arg8, @OriginalArg(10) byte[][] arg9, @OriginalArg(11) byte[][] arg10, @OriginalArg(12) int[][] arg11) {
		if (Static114.anInt2421 == 0 && !Static243.aBoolean451) {
			Static74.method3136(arg9, arg5, arg6, arg2, arg8, arg1, arg11, arg3, arg4, arg0, arg7, arg10);
		} else {
			Static245.method4379(arg4, arg7, arg1, arg3, arg10, arg0, arg2, arg5, arg11, arg6, arg8, arg9);
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!mf;IIIII)V")
	public static void method331(@OriginalArg(0) Class132 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.anInt4637 = 0;
		@Pc(7) int local7;
		label56: for (@Pc(4) int local4 = arg2; local4 <= arg4; local4++) {
			label54: for (local7 = arg3; local7 <= arg5; local7++) {
				@Pc(16) long local16 = Static360.aLongArrayArrayArray1[arg1][local4][local7];
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
						@Pc(35) Class2_Sub10_Sub1 local35 = Static120.aClass2_Sub10_Sub1Array2[local27 - 1];
						for (@Pc(37) int local37 = 0; local37 < arg0.anInt4637; local37++) {
							if (arg0.aClass2_Sub10_Sub1Array4[local37] == local35) {
								local18 += 16L;
								continue label49;
							}
						}
						arg0.aClass2_Sub10_Sub1Array4[arg0.anInt4637++] = local35;
						if (arg0.anInt4637 == 4) {
							break label56;
						}
						local18 += 16L;
					}
				}
			}
		}
		for (local7 = arg0.anInt4637; local7 < 4; local7++) {
			arg0.aClass2_Sub10_Sub1Array4[local7] = null;
		}
	}
}
