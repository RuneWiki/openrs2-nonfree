import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static136 {

	@OriginalMember(owner = "client!gp", name = "f", descriptor = "Lclient!rp;")
	public static Class223 aClass223_5;

	@OriginalMember(owner = "client!gp", name = "W", descriptor = "[I")
	public static int[] anIntArray209;

	@OriginalMember(owner = "client!gp", name = "X", descriptor = "I")
	public static int anInt2489;

	@OriginalMember(owner = "client!gp", name = "V", descriptor = "Lclient!cq;")
	public static final Class43 aClass43_8 = new Class43("", 10);

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(B)Z")
	public static boolean method1955() {
		if (Static443.aBoolean524) {
			try {
				if ((Boolean) Static467.method6000("showingVideoAd", Static24.aClass196_1.anApplet1)) {
					return false;
				}
				return true;
			} catch (@Pc(23) Throwable local23) {
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(Lclient!vh;IIIII)V")
	public static void method1957(@OriginalArg(0) Class184 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.anInt4551 = 0;
		@Pc(7) int local7;
		label56: for (@Pc(4) int local4 = arg2; local4 <= arg4; local4++) {
			label54: for (local7 = arg3; local7 <= arg5; local7++) {
				@Pc(16) long local16 = Static81.aLongArrayArrayArray1[arg1][local4][local7];
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
						@Pc(35) Class154 local35 = Static367.aClass154Array1[local27 - 1];
						for (@Pc(37) int local37 = 0; local37 < arg0.anInt4551; local37++) {
							if (arg0.aClass4_Sub7Array2[local37] == local35.aClass4_Sub7_1) {
								local18 += 16L;
								continue label49;
							}
						}
						arg0.aClass4_Sub7Array2[arg0.anInt4551++] = local35.aClass4_Sub7_1;
						if (arg0.anInt4551 == 4) {
							break label56;
						}
						local18 += 16L;
					}
				}
			}
		}
		for (local7 = arg0.anInt4551; local7 < 4; local7++) {
			arg0.aClass4_Sub7Array2[local7] = null;
		}
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;I)V")
	public static void method1958(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		Static50.anInt812 = 2;
		Static11.anInt178 = arg2;
		Static62.method867(arg1, arg0);
	}
}
