import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!eea", name = "A", descriptor = "[I")
	public static int[] anIntArray265 = new int[2];

	@OriginalMember(owner = "client!eea", name = "F", descriptor = "[I")
	public static final int[] anIntArray266 = new int[] { 104, 120, 136, 168 };

	@OriginalMember(owner = "client!eea", name = "b", descriptor = "(IIII)Z")
	public static boolean method2409(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		Static301.aClass113_5.method6107(arg0, arg2, arg1, Static247.anIntArray356);
		@Pc(13) int local13 = Static247.anIntArray356[2];
		if (local13 < 50) {
			return false;
		} else {
			Static247.anIntArray356[0] = Static526.anInt8861 * Static247.anIntArray356[0] / local13 + Static18.anInt222;
			Static247.anIntArray356[1] = Static299.anInt5149 + Static247.anIntArray356[1] * Static187.anInt8345 / local13;
			Static247.anIntArray356[2] = local13;
			return true;
		}
	}

	@OriginalMember(owner = "client!eea", name = "d", descriptor = "(I)V")
	public static void method2410() {
		@Pc(7) Class91 local7 = null;
		try {
			@Pc(18) Class260 local18 = Static362.aClass109_5.method2169(true, "2");
			while (local18.anInt7041 == 0) {
				Static391.method5400(1L);
			}
			if (local18.anInt7041 == 1) {
				local7 = (Class91) local18.anObject16;
				@Pc(43) byte[] local43 = new byte[(int) local7.method1840()];
				@Pc(58) int local58;
				for (@Pc(45) int local45 = 0; local45 < local43.length; local45 += local58) {
					local58 = local7.method1839(local43.length - local45, local45, local43);
					if (local58 == -1) {
						throw new IOException("EOF");
					}
				}
				Static181.method2556(new Class1_Sub35(local43));
			}
		} catch (@Pc(86) Exception local86) {
		}
		try {
			if (local7 != null) {
				local7.method1833();
			}
		} catch (@Pc(93) Exception local93) {
		}
	}
}
