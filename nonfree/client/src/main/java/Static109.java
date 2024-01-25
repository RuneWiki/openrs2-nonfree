import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!eda", name = "q", descriptor = "Lclient!pp;")
	public static final Class236 aClass236_19 = new Class236(45, 3);

	@OriginalMember(owner = "client!eda", name = "eb", descriptor = "[S")
	public static final short[] aShortArray28 = new short[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

	@OriginalMember(owner = "client!eda", name = "fb", descriptor = "Lclient!pp;")
	public static final Class236 aClass236_20 = new Class236(1, 8);

	@OriginalMember(owner = "client!eda", name = "gb", descriptor = "[[B")
	public static final byte[][] aByteArrayArray12 = new byte[50][];

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(ZB)V")
	public static void method2182(@OriginalArg(0) boolean arg0) {
		if (Static256.aString52.length() == 0) {
			return;
		}
		Static360.method5527("--> " + Static256.aString52);
		Static236.method4043(Static256.aString52, arg0, false);
		Static484.anInt8949 = 0;
		Static28.anInt550 = 0;
		Static256.aString52 = "";
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(IZFIIIIII)[[I")
	public static int[][] method2187(@OriginalArg(2) float arg0) {
		@Pc(9) int[][] local9 = new int[256][64];
		@Pc(13) Class5_Sub1_Sub31 local13 = new Class5_Sub1_Sub31();
		local13.anInt7443 = 4;
		local13.anInt7441 = (int) (arg0 * 4096.0F);
		local13.anInt7439 = 3;
		local13.anInt7449 = 8;
		local13.aBoolean530 = false;
		local13.method7157();
		Static107.method2150(64, 256);
		for (@Pc(40) int local40 = 0; local40 < 256; local40++) {
			local13.method6049(local40, local9[local40]);
		}
		return local9;
	}
}
