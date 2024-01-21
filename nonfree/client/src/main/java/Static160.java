import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static160 {

	@OriginalMember(owner = "client!tg", name = "ab", descriptor = "I")
	public static int anInt3501;

	@OriginalMember(owner = "client!tg", name = "Q", descriptor = "[I")
	public static int[] anIntArray314 = new int[5];

	@OriginalMember(owner = "client!tg", name = "T", descriptor = "I")
	public static int anInt3496 = 0;

	@OriginalMember(owner = "client!tg", name = "W", descriptor = "Lclient!vg;")
	public static Class85 aClass85_14 = null;

	@OriginalMember(owner = "client!tg", name = "X", descriptor = "I")
	public static int anInt3499 = 0;

	@OriginalMember(owner = "client!tg", name = "Y", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1578 = Static32.method683("Hier wechseln");

	@OriginalMember(owner = "client!tg", name = "cb", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1579 = Static32.method683("M");

	@OriginalMember(owner = "client!tg", name = "d", descriptor = "(B)V")
	public static void method2710() {
		anIntArray314 = null;
		aClass49_1579 = null;
		aClass85_14 = null;
		aClass49_1578 = null;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIIII)V")
	public static void method2711(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < Static100.anInt2133; local3++) {
			if (arg2 < Static176.anIntArray361[local3] + Static55.anIntArray111[local3] && Static55.anIntArray111[local3] < arg2 + arg0 && arg3 < Static25.anIntArray48[local3] + Static62.anIntArray164[local3] && Static25.anIntArray48[local3] < arg1 + arg3) {
				Static164.aBooleanArray17[local3] = true;
			}
		}
	}
}
