import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!hi", name = "d", descriptor = "Lclient!cm;")
	public static Class36 aClass36_4;

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(Ljava/lang/String;BZ)V", line = 36)
	public static void method3698(@OriginalArg(0) String arg0, @OriginalArg(2) boolean arg1) {
		Static57.aClass197_12.anInt5546 = 1;
		@Pc(18) String local18 = arg0.toLowerCase();
		@Pc(21) short[] local21 = new short[16];
		@Pc(23) int local23 = 0;
		for (@Pc(25) int local25 = 0; local25 < Static290.aClass107_2.anInt2776; local25++) {
			@Pc(34) Class188 local34 = Static290.aClass107_2.method2761(local25);
			if ((!arg1 || local34.aBoolean381) && local34.anInt5247 == -1 && local34.anInt5225 == -1 && local34.anInt5204 == 0 && local34.aString55.toLowerCase().indexOf(local18) != -1) {
				if (local23 >= 250) {
					Static305.anInt6115 = -1;
					Static165.aShortArray55 = null;
					return;
				}
				if (local21.length <= local23) {
					@Pc(84) short[] local84 = new short[local21.length * 2];
					for (@Pc(86) int local86 = 0; local86 < local23; local86++) {
						local84[local86] = local21[local86];
					}
					local21 = local84;
				}
				local21[local23++] = (short) local25;
			}
		}
		Static12.anInt266 = 0;
		Static165.aShortArray55 = local21;
		Static305.anInt6115 = local23;
		@Pc(128) String[] local128 = new String[Static305.anInt6115];
		for (@Pc(130) int local130 = 0; local130 < Static305.anInt6115; local130++) {
			local128[local130] = Static290.aClass107_2.method2761(local21[local130]).aString55;
		}
		Static126.method2536(local128, Static165.aShortArray55);
		Static57.aClass197_12.method5069();
		Static57.aClass197_12.anInt5546 = 2;
	}
}
