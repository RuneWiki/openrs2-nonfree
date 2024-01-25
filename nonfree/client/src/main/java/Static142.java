import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static142 {

	@OriginalMember(owner = "client!ir", name = "g", descriptor = "I")
	public static int anInt2744;

	@OriginalMember(owner = "client!ir", name = "h", descriptor = "Lclient!gl;")
	public static Class79 aClass79_1;

	@OriginalMember(owner = "client!ir", name = "d", descriptor = "Lclient!ka;")
	public static final Class109 aClass109_32 = new Class109(5);

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(Lclient!gg;IIIII)V")
	public static void method2513(@OriginalArg(0) Class76 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.anInt5456 = 0;
		@Pc(7) int local7;
		label56: for (@Pc(4) int local4 = arg2; local4 <= arg4; local4++) {
			label54: for (local7 = arg3; local7 <= arg5; local7++) {
				@Pc(16) int local16 = Static308.anIntArrayArrayArray9[arg1][local4][local7];
				@Pc(18) int local18 = 0;
				while (true) {
					label49: while (true) {
						if (local18 > 24) {
							continue label54;
						}
						@Pc(25) int local25 = local16 >>> local18 & 0xFF;
						if (local25 <= 0) {
							continue label54;
						}
						@Pc(33) Class5_Sub9_Sub1 local33 = Static182.aClass5_Sub9_Sub1Array2[local25 - 1];
						for (@Pc(35) int local35 = 0; local35 < arg0.anInt5456; local35++) {
							if (arg0.aClass5_Sub9_Sub1Array3[local35] == local33) {
								local18 += 8;
								continue label49;
							}
						}
						arg0.aClass5_Sub9_Sub1Array3[arg0.anInt5456++] = local33;
						if (arg0.anInt5456 == 4) {
							break label56;
						}
						local18 += 8;
					}
				}
			}
		}
		for (local7 = arg0.anInt5456; local7 < 4; local7++) {
			arg0.aClass5_Sub9_Sub1Array3[local7] = null;
		}
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(IIIII)V")
	public static void method2518(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < Static66.anInt5818; local3++) {
			@Pc(9) Rectangle local9 = Class4_Sub3_Sub2.aRectangleArray2[local3];
			if (local9.x + local9.width > arg2 && arg2 + arg0 > local9.x && local9.height + local9.y > arg3 && arg3 + arg1 > local9.y) {
				Static133.aBooleanArray10[local3] = true;
			}
		}
	}

	@OriginalMember(owner = "client!ir", name = "b", descriptor = "(I)Lclient!ib;")
	public static Class90 method2519() {
		try {
			return (Class90) Class.forName("Class90_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(19) Throwable local19) {
			return null;
		}
	}
}
