import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static388 {

	@OriginalMember(owner = "client!op", name = "p", descriptor = "F")
	public static float aFloat136;

	@OriginalMember(owner = "client!op", name = "k", descriptor = "Lclient!db;")
	public static final Class64 aClass64_330 = new Class64(0, 0);

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(I)V")
	public static void method5705() {
		@Pc(7) Class23 local7 = null;
		try {
			local7 = Static222.method3813("2");
			@Pc(20) Class4_Sub9 local20 = new Class4_Sub9(Static461.anInt7821 * 6 + 3);
			local20.method5961(-345277664, 1);
			local20.method6012(Static461.anInt7821);
			for (@Pc(30) int local30 = 0; local30 < Static435.anIntArray612.length; local30++) {
				if (Static23.aBooleanArray6[local30]) {
					local20.method6012(local30);
					local20.method5963(Static435.anIntArray612[local30]);
				}
			}
			local7.method496(0, local20.aByteArray97, local20.anInt7219);
		} catch (@Pc(65) Exception local65) {
		}
		try {
			if (local7 != null) {
				local7.method495();
			}
		} catch (@Pc(72) Exception local72) {
		}
		Static439.aLong296 = Static184.method3422();
		Static195.aBoolean312 = false;
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(BI)Z")
	public static boolean method5709(@OriginalArg(1) int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}
}
