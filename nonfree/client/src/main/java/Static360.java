import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static360 {

	@OriginalMember(owner = "client!ng", name = "E", descriptor = "Lclient!ri;")
	public static Class284 aClass284_170;

	@OriginalMember(owner = "client!ng", name = "r", descriptor = "Lclient!ui;")
	public static final Class329 aClass329_70 = new Class329(6, 0, 4, 2);

	@OriginalMember(owner = "client!ng", name = "A", descriptor = "[I")
	public static final int[] anIntArray594 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!ng", name = "C", descriptor = "[[I")
	public static final int[][] anIntArrayArray105 = new int[128][128];

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(Z)V")
	public static void method8010() {
		@Pc(7) Class272 local7 = null;
		try {
			@Pc(13) Class309 local13 = Static467.aClass168_12.method4080("2", true);
			while (local13.anInt8650 == 0) {
				Static373.method5240(1L);
			}
			if (local13.anInt8650 == 1) {
				local7 = (Class272) local13.anObject15;
				@Pc(35) byte[] local35 = new byte[(int) local7.method6176()];
				@Pc(50) int local50;
				for (@Pc(37) int local37 = 0; local37 < local35.length; local37 += local50) {
					local50 = local7.method6177(local37, local35.length - local37, local35);
					if (local50 == -1) {
						throw new IOException("EOF");
					}
				}
				Static477.method6522(new Class3_Sub26(local35));
			}
		} catch (@Pc(79) Exception local79) {
		}
		try {
			if (local7 != null) {
				local7.method6172();
			}
		} catch (@Pc(86) Exception local86) {
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IZI)V")
	public static void method8011(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		Static403.anInt7291 = 3;
		Static314.anInt5779 = arg1;
		Static110.method2208(Static563.aClass212_9.anInt6145, Static563.aClass212_9.aString157);
		if (arg0) {
			Static81.method1893("", false, "");
		} else {
			Static78.method3300();
			Static81.method1893(Static342.aString159, false, Static223.aString111);
		}
	}
}
