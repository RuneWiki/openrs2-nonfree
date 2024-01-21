import java.awt.Font;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static22 {

	@OriginalMember(owner = "client!cb", name = "f", descriptor = "Ljava/awt/Font;")
	public static Font aFont1;

	@OriginalMember(owner = "client!cb", name = "m", descriptor = "I")
	public static int anInt472;

	@OriginalMember(owner = "client!cb", name = "p", descriptor = "[[[[Z")
	public static boolean[][][][] aBooleanArrayArrayArrayArray1;

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "Lclient!lf;")
	public static Class49 aClass49_276 = Static32.method683("(U");

	@OriginalMember(owner = "client!cb", name = "e", descriptor = "Lclient!lf;")
	private static Class49 aClass49_278 = Static32.method683("Error connecting to server)3");

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "Lclient!lf;")
	public static Class49 aClass49_277 = aClass49_278;

	@OriginalMember(owner = "client!cb", name = "h", descriptor = "Lclient!lf;")
	private static Class49 aClass49_279 = Static32.method683("Loading textures )2 ");

	@OriginalMember(owner = "client!cb", name = "j", descriptor = "Lclient!lf;")
	public static Class49 aClass49_280 = Static32.method683("headicons_pk");

	@OriginalMember(owner = "client!cb", name = "n", descriptor = "Lclient!lf;")
	private static Class49 aClass49_281 = Static32.method683("as it was used to break our rules)3");

	@OriginalMember(owner = "client!cb", name = "o", descriptor = "Lclient!lf;")
	public static Class49 aClass49_282 = aClass49_281;

	@OriginalMember(owner = "client!cb", name = "r", descriptor = "Lclient!lf;")
	public static Class49 aClass49_283 = Static32.method683("hel");

	@OriginalMember(owner = "client!cb", name = "u", descriptor = "Lclient!lf;")
	private static Class49 aClass49_285 = Static32.method683("Loading config )2 ");

	@OriginalMember(owner = "client!cb", name = "t", descriptor = "Lclient!lf;")
	public static Class49 aClass49_284 = aClass49_285;

	@OriginalMember(owner = "client!cb", name = "x", descriptor = "Lclient!lf;")
	public static Class49 aClass49_286 = aClass49_279;

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!vg;I)Z")
	public static boolean method401(@OriginalArg(0) Class85 arg0) {
		if (arg0.anIntArray353 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < arg0.anIntArray353.length; local12++) {
			@Pc(19) int local19 = Static159.method2687(arg0, local12);
			@Pc(24) int local24 = arg0.anIntArray349[local12];
			if (arg0.anIntArray353[local12] == 2) {
				if (local24 <= local19) {
					return false;
				}
			} else if (arg0.anIntArray353[local12] == 3) {
				if (local19 <= local24) {
					return false;
				}
			} else if (arg0.anIntArray353[local12] == 4) {
				if (local24 == local19) {
					return false;
				}
			} else if (local24 != local19) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Z)V")
	public static void method403() {
		aClass49_285 = null;
		aBooleanArrayArrayArrayArray1 = null;
		aClass49_284 = null;
		aClass49_283 = null;
		aClass49_276 = null;
		aClass49_286 = null;
		aClass49_280 = null;
		aClass49_278 = null;
		aClass49_281 = null;
		aFont1 = null;
		aClass49_277 = null;
		aClass49_282 = null;
		aClass49_279 = null;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(III[[[I)V")
	public static void method406(@OriginalArg(3) int[][][] arg0) {
		Static40.anInt978 = 4;
		Static91.anInt1931 = 104;
		Static59.anInt1256 = 104;
		Static72.aClass2_Sub1ArrayArrayArray1 = new Class2_Sub1[4][104][104];
		Static182.anIntArrayArrayArray8 = new int[4][105][105];
		Static27.anIntArrayArrayArray2 = arg0;
		Static24.method456();
	}
}
