import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static282 {

	@OriginalMember(owner = "client!ks", name = "B", descriptor = "[I")
	public static final int[] anIntArray454 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

	@OriginalMember(owner = "client!ks", name = "L", descriptor = "I")
	public static int anInt5285 = 0;

	@OriginalMember(owner = "client!ks", name = "Q", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray24 = new String[8];

	@OriginalMember(owner = "client!ks", name = "d", descriptor = "(I)V")
	public static void method4470() {
		@Pc(7) Class23 local7 = null;
		try {
			@Pc(13) Class299 local13 = Static147.aClass161_4.method3815("3", false);
			while (local13.anInt7985 == 0) {
				Static55.method845(1L);
			}
			if (local13.anInt7985 == 2) {
				throw new RuntimeException("Error opening file");
			}
			local7 = (Class23) local13.anObject41;
			@Pc(42) byte[] local42 = new byte[(int) local7.method498()];
			if (local42.length == 0) {
				Static40.aString12 = "";
				Static240.aString58 = "";
			} else {
				@Pc(62) int local62;
				for (@Pc(50) int local50 = 0; local50 < local42.length; local50 += local62) {
					local62 = local7.method492(local42.length - local50, local50, local42);
					if (local62 == -1) {
						throw new IOException("EOF");
					}
				}
				@Pc(84) Class4_Sub9 local84 = new Class4_Sub9(local42);
				@Pc(88) int local88 = local84.method6015();
				if (local88 > 120) {
					throw new RuntimeException("Bad length");
				}
				local84.anInt7219 = local88 + 1;
				if (!local84.method6024()) {
					throw new RuntimeException("Invalid CRC");
				}
				local84.anInt7219 = 1;
				@Pc(119) int local119 = local84.method6015();
				if (local119 > 3) {
					throw new RuntimeException("Invalid version " + local119);
				}
				Static40.aString12 = local84.method5962();
				Static240.aString58 = local84.method5962();
				if (local119 < 1) {
					Static126.anInt2948 = Static431.anInt7395;
				} else {
					Static126.anInt2948 = local84.method5982();
				}
				if (local119 < 2) {
					Static226.aLong119 = Static316.aLong165;
				} else {
					Static226.aLong119 = local84.method5997();
				}
				if (local119 < 3) {
					Static240.aString57 = Static248.aString60;
				} else if (local84.method6015() == 1) {
					Static240.aString57 = local84.method5962();
				} else {
					Static240.aString57 = null;
				}
			}
		} catch (@Pc(197) Exception local197) {
			Static240.aString58 = "";
			Static40.aString12 = "";
		}
		try {
			if (local7 != null) {
				local7.method495();
			}
		} catch (@Pc(208) Exception local208) {
		}
	}
}
