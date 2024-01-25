import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static244 {

	@OriginalMember(owner = "client!ip", name = "e", descriptor = "[I")
	public static int[] anIntArray670;

	@OriginalMember(owner = "client!ip", name = "h", descriptor = "Lclient!ob;")
	public static Class242 aClass242_7;

	@OriginalMember(owner = "client!ip", name = "b", descriptor = "Ljava/util/Random;")
	public static final Random aRandom3 = new Random();

	@OriginalMember(owner = "client!ip", name = "g", descriptor = "I")
	public static int anInt9751 = 0;

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(IBI)Z")
	public static boolean method8151(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x8000) != 0;
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(B)V")
	public static void method8152() {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < Static228.anInt3704; local9++) {
			for (@Pc(13) int local13 = 0; local13 < Static162.anInt2911; local13++) {
				if (Static134.method1840(true, local7, Static28.aClass53ArrayArrayArray1, local9, local13)) {
					local7++;
				}
				if (local7 >= 512) {
					return;
				}
			}
		}
	}
}
