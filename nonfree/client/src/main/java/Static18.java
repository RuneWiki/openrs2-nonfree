import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static18 {

	@OriginalMember(owner = "client!da", name = "w", descriptor = "I")
	public static int anInt630;

	@OriginalMember(owner = "client!da", name = "E", descriptor = "[I")
	public static int[] anIntArray67;

	@OriginalMember(owner = "client!da", name = "I", descriptor = "Lclient!vb;")
	public static Class11_Sub1 aClass11_Sub1_20;

	@OriginalMember(owner = "client!da", name = "h", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger2 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!da", name = "q", descriptor = "Lclient!ae;")
	public static Class5 aClass5_280 = Static56.method972("Chat panel redrawn");

	@OriginalMember(owner = "client!da", name = "s", descriptor = "Lclient!ae;")
	private static Class5 aClass5_281 = Static56.method972("Error connecting to server)3");

	@OriginalMember(owner = "client!da", name = "t", descriptor = "Lclient!ae;")
	public static Class5 aClass5_282 = aClass5_281;

	@OriginalMember(owner = "client!da", name = "u", descriptor = "Lclient!ae;")
	public static Class5 aClass5_283 = Static56.method972("und Ihr Passwort ein)3");

	@OriginalMember(owner = "client!da", name = "v", descriptor = "I")
	public static int anInt629 = 128;

	@OriginalMember(owner = "client!da", name = "y", descriptor = "Lclient!p;")
	public static Class51 aClass51_5 = new Class51();

	@OriginalMember(owner = "client!da", name = "A", descriptor = "Lclient!ae;")
	private static Class5 aClass5_285 = Static56.method972("Username: ");

	@OriginalMember(owner = "client!da", name = "z", descriptor = "Lclient!ae;")
	public static Class5 aClass5_284 = aClass5_285;

	@OriginalMember(owner = "client!da", name = "G", descriptor = "Lclient!ae;")
	private static Class5 aClass5_288 = Static56.method972("cyan:");

	@OriginalMember(owner = "client!da", name = "D", descriptor = "Lclient!ae;")
	public static Class5 aClass5_286 = aClass5_288;

	@OriginalMember(owner = "client!da", name = "F", descriptor = "Lclient!ae;")
	public static Class5 aClass5_287 = Static56.method972("runes");

	@OriginalMember(owner = "client!da", name = "J", descriptor = "I")
	public static int anInt633 = 0;

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V")
	public static void method403() {
		aClass5_282 = null;
		aClass51_5 = null;
		aBigInteger2 = null;
		aClass11_Sub1_20 = null;
		anIntArray67 = null;
		aClass5_280 = null;
		aClass5_288 = null;
		aClass5_281 = null;
		aClass5_287 = null;
		aClass5_286 = null;
		aClass5_283 = null;
		aClass5_285 = null;
		aClass5_284 = null;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(II)Z")
	public static boolean method406(@OriginalArg(1) int arg0) {
		if (Static36.aBooleanArray21[arg0]) {
			return true;
		} else if (Static101.aClass11_64.method1881(arg0)) {
			@Pc(23) int local23 = Static101.aClass11_64.method1875(arg0);
			if (local23 == 0) {
				Static36.aBooleanArray21[arg0] = true;
				return true;
			}
			if (Static31.aClass3_Sub1_Sub17ArrayArray3[arg0] == null) {
				Static31.aClass3_Sub1_Sub17ArrayArray3[arg0] = new Class3_Sub1_Sub17[local23];
			}
			for (@Pc(42) int local42 = 0; local42 < local23; local42++) {
				if (Static31.aClass3_Sub1_Sub17ArrayArray3[arg0][local42] == null) {
					@Pc(56) byte[] local56 = Static101.aClass11_64.method1882(arg0, local42);
					if (local56 != null) {
						Static31.aClass3_Sub1_Sub17ArrayArray3[arg0][local42] = new Class3_Sub1_Sub17();
						Static31.aClass3_Sub1_Sub17ArrayArray3[arg0][local42].anInt2651 = local42 + (arg0 << 16);
						if (local56[0] == -1) {
							Static31.aClass3_Sub1_Sub17ArrayArray3[arg0][local42].method1716(new Class3_Sub6(local56));
						} else {
							Static31.aClass3_Sub1_Sub17ArrayArray3[arg0][local42].method1714(new Class3_Sub6(local56));
						}
					}
				}
			}
			Static36.aBooleanArray21[arg0] = true;
			return true;
		} else {
			return false;
		}
	}
}
