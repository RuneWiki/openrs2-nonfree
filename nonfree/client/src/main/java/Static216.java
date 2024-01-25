import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static216 {

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "F")
	public static float aFloat93;

	@OriginalMember(owner = "client!iu", name = "e", descriptor = "[I")
	public static int[] anIntArray330;

	@OriginalMember(owner = "client!iu", name = "d", descriptor = "Lclient!wf;")
	public static final Class316 aClass316_28 = new Class316(50);

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(Lclient!qa;Z)V")
	public static void method3863(@OriginalArg(0) Class9 arg0) {
		arg0.N(0, 0, Static290.anInt6867, 350);
		arg0.f(0, 0, Static290.anInt6867, 350, Static366.anInt7092 << 24 | 0x332277, 1);
		@Pc(31) int local31 = 350 / Static254.anInt4940;
		@Pc(40) int local40;
		if (Static35.anInt1296 > 0) {
			local40 = 346 - Static254.anInt4940 - 4;
			@Pc(51) int local51 = local40 * local31 / (local31 + Static35.anInt1296 - 1);
			@Pc(53) int local53 = 4;
			if (Static35.anInt1296 > 1) {
				local53 = (local40 - local51) * (-Static57.anInt1566 + Static35.anInt1296 + -1) / (Static35.anInt1296 - 1) + 4;
			}
			arg0.f(Static290.anInt6867 - 16, local53, 12, local51, Static366.anInt7092 << 24 | 0x332277, 2);
			for (@Pc(92) int local92 = Static57.anInt1566; local92 < Static57.anInt1566 + local31 && Static35.anInt1296 > local92; local92++) {
				@Pc(101) String[] local101 = Static12.method678('\b', Static300.aStringArray26[local92]);
				@Pc(110) int local110 = (Static290.anInt6867 - 16 - 8) / local101.length;
				for (@Pc(112) int local112 = 0; local112 < local101.length; local112++) {
					@Pc(121) int local121 = local112 * local110 + 8;
					arg0.N(local121, 0, local121 + local110 - 8, 350);
					Static268.aClass27_4.method7816(local121, local101[local112], -16777216, -1, 348 - Static449.aClass177_9.anInt5368 - Static225.anInt4528 - Static254.anInt4940 * (-Static57.anInt1566 + local92));
				}
			}
		}
		arg0.N(0, 0, Static290.anInt6867, 350);
		arg0.method7581(0, Static290.anInt6867, -1, 350 - Static225.anInt4528);
		Static106.aClass27_3.method7816(10, "--> " + Static457.aString65, -16777216, -1, 350 - Static159.aClass177_3.anInt5368 - 1);
		if (!Static109.aBoolean177) {
			return;
		}
		local40 = -1;
		if (Static416.anInt7252 % 30 > 15) {
			local40 = 16777215;
		}
		arg0.method7621(local40, Static159.aClass177_3.method4664("--> " + Static457.aString65.substring(0, Static488.anInt8330)) + 10, 12, 350 - Static159.aClass177_3.anInt5368 - 11);
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(II)I")
	public static int method3865(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0 >>> 1;
		@Pc(13) int local13 = local7 | local7 >>> 1;
		@Pc(19) int local19 = local13 | local13 >>> 2;
		@Pc(25) int local25 = local19 | local19 >>> 4;
		@Pc(36) int local36 = local25 | local25 >>> 8;
		@Pc(42) int local42 = local36 | local36 >>> 16;
		return ~local42 & arg0;
	}
}
