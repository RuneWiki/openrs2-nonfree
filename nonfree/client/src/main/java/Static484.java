import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static484 {

	@OriginalMember(owner = "client!st", name = "m", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray20;

	@OriginalMember(owner = "client!st", name = "h", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray8 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(ILjava/awt/Canvas;)Lclient!kg;")
	public static Class6_Sub13 method6801(@OriginalArg(1) Canvas arg0) {
		try {
			@Pc(11) Class local11 = Class.forName("Class6_Sub13_Sub2");
			@Pc(15) Class6_Sub13 local15 = (Class6_Sub13) local11.getDeclaredConstructor().newInstance();
			local15.method4478(arg0);
			return local15;
		} catch (@Pc(22) Throwable local22) {
			@Pc(26) Class6_Sub13_Sub1 local26 = new Class6_Sub13_Sub1();
			local26.method4478(arg0);
			return local26;
		}
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(Lclient!mh;IIIII)V")
	public static void method6805(@OriginalArg(0) Class128 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.anInt3807 = 0;
		@Pc(7) int local7;
		label56: for (@Pc(4) int local4 = arg2; local4 <= arg4; local4++) {
			label54: for (local7 = arg3; local7 <= arg5; local7++) {
				@Pc(16) long local16 = Static511.aLongArrayArrayArray1[arg1][local4][local7];
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
						@Pc(35) Class255 local35 = Static111.aClass255Array1[local27 - 1];
						for (@Pc(37) int local37 = 0; local37 < arg0.anInt3807; local37++) {
							if (arg0.aClass6_Sub25Array4[local37] == local35.aClass6_Sub25_3) {
								local18 += 16L;
								continue label49;
							}
						}
						arg0.aClass6_Sub25Array4[arg0.anInt3807++] = local35.aClass6_Sub25_3;
						if (arg0.anInt3807 == 4) {
							break label56;
						}
						local18 += 16L;
					}
				}
			}
		}
		for (local7 = arg0.anInt3807; local7 < 4; local7++) {
			arg0.aClass6_Sub25Array4[local7] = null;
		}
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(Lclient!faa;B)Ljava/lang/String;")
	public static String method6806(@OriginalArg(0) Class97 arg0) {
		if (Static74.method1044(arg0).method5834() == 0) {
			return null;
		} else if (arg0.aString21 == null || arg0.aString21.trim().length() == 0) {
			return Static37.aBoolean48 ? "Hidden-use" : null;
		} else {
			return arg0.aString21;
		}
	}
}
