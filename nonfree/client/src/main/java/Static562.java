import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static562 {

	@OriginalMember(owner = "client!vo", name = "g", descriptor = "I")
	public static int anInt9353;

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(IIFIIIIZI)[[I")
	public static int[][] method7614(@OriginalArg(2) float arg0) {
		@Pc(9) int[][] local9 = new int[256][64];
		@Pc(13) Class1_Sub1_Sub31 local13 = new Class1_Sub1_Sub31();
		local13.anInt7550 = 3;
		local13.anInt7548 = 4;
		local13.anInt7549 = 4;
		local13.anInt7553 = (int) (arg0 * 4096.0F);
		local13.aBoolean589 = false;
		local13.method7699();
		Static122.method1913(64, 256);
		for (@Pc(42) int local42 = 0; local42 < 256; local42++) {
			local13.method6012(local9[local42], local42);
		}
		return local9;
	}
}
