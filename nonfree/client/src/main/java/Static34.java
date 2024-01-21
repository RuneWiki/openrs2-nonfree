import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!ha", name = "s", descriptor = "I")
	public static int anInt1096;

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "Lclient!v;")
	public static Class62 aClass62_463 = Static45.method753("Bitte versuchen Sie)1");

	@OriginalMember(owner = "client!ha", name = "d", descriptor = "Lclient!v;")
	public static Class62 aClass62_464 = Static45.method753("Mitteilung");

	@OriginalMember(owner = "client!ha", name = "e", descriptor = "Lclient!v;")
	private static Class62 aClass62_465 = Static45.method753("Connection lost");

	@OriginalMember(owner = "client!ha", name = "f", descriptor = "Lclient!v;")
	private static Class62 aClass62_466 = Static45.method753("Loading textures )2 ");

	@OriginalMember(owner = "client!ha", name = "g", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger1 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!ha", name = "j", descriptor = "Lclient!v;")
	public static Class62 aClass62_467 = aClass62_466;

	@OriginalMember(owner = "client!ha", name = "o", descriptor = "Lclient!v;")
	private static Class62 aClass62_470 = Static45.method753(" from your friend list first");

	@OriginalMember(owner = "client!ha", name = "k", descriptor = "Lclient!v;")
	public static Class62 aClass62_468 = aClass62_470;

	@OriginalMember(owner = "client!ha", name = "m", descriptor = "Lclient!v;")
	public static Class62 aClass62_469 = Static45.method753("Ihr Spielkonto wurde deaktiviert)3");

	@OriginalMember(owner = "client!ha", name = "p", descriptor = "Lclient!v;")
	public static Class62 aClass62_471 = aClass62_465;

	@OriginalMember(owner = "client!ha", name = "t", descriptor = "I")
	public static int anInt1097 = 3;

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V")
	public static void method658() {
		aClass62_471 = null;
		aClass62_469 = null;
		aBigInteger1 = null;
		aClass62_466 = null;
		aClass62_463 = null;
		aClass62_465 = null;
		aClass62_467 = null;
		aClass62_468 = null;
		aClass62_470 = null;
		aClass62_464 = null;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(ILclient!mb;ZILclient!mb;)Lclient!ua;")
	public static Class3_Sub1_Sub16 method659(@OriginalArg(0) int arg0, @OriginalArg(1) Class42 arg1, @OriginalArg(4) Class42 arg2) {
		@Pc(3) boolean local3 = true;
		@Pc(12) int[] local12 = arg2.method1497(arg0);
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(24) byte[] local24 = arg2.method1499(arg0, local12[local14]);
			if (local24 == null) {
				local3 = false;
			} else {
				@Pc(44) int local44 = (local24[0] & 0xFF) << 8 | local24[1] & 0xFF;
				@Pc(52) byte[] local52 = arg1.method1499(local44, 0);
				if (local52 == null) {
					local3 = false;
				}
			}
		}
		if (!local3) {
			return null;
		}
		try {
			return new Class3_Sub1_Sub16(arg2, arg1, arg0, false);
		} catch (@Pc(92) Exception local92) {
			return null;
		}
	}
}
