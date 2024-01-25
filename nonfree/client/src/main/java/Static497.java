import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static497 {

	@OriginalMember(owner = "client!tg", name = "c", descriptor = "[I")
	public static int[] anIntArray618;

	@OriginalMember(owner = "client!tg", name = "k", descriptor = "Lclient!tn;")
	public static Class309 aClass309_1;

	@OriginalMember(owner = "client!tg", name = "l", descriptor = "Lclient!pj;")
	public static Class248 aClass248_98;

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "I")
	public static int anInt8653 = 0;

	@OriginalMember(owner = "client!tg", name = "g", descriptor = "Ljava/util/Hashtable;")
	public static final Hashtable aHashtable6 = new Hashtable();

	@OriginalMember(owner = "client!tg", name = "i", descriptor = "[I")
	public static final int[] anIntArray619 = new int[16];

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(II)V")
	public static void method6879(@OriginalArg(0) int arg0) {
		Static511.anInt8799 = arg0;
		Static363.aClass330_41.method7688();
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)V")
	public static void method6880() {
		for (@Pc(3) int local3 = 0; local3 < Static429.anInt7650; local3++) {
			@Pc(9) int local9 = Static46.anIntArray36[local3];
			@Pc(16) Class6_Sub49 local16 = (Class6_Sub49) Static251.aClass234_29.method5464((long) local9);
			if (local16 != null) {
				@Pc(21) Class15_Sub2_Sub4_Sub1 local21 = local16.aClass15_Sub2_Sub4_Sub1_2;
				Static317.method4954(local21.aClass88_1.anInt2171, local21);
			}
		}
	}

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "(I)Z")
	public static boolean method6881() {
		if (Static71.aBoolean84) {
			try {
				Static594.method6348("showVideoAd", Static198.anApplet1);
				return true;
			} catch (@Pc(21) Throwable local21) {
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(II[BB)Ljava/lang/String;")
	public static String method6882(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		@Pc(8) char[] local8 = new char[arg1];
		@Pc(18) int local18 = 0;
		for (@Pc(20) int local20 = 0; local20 < arg1; local20++) {
			@Pc(30) int local30 = arg2[arg0 + local20] & 0xFF;
			if (local30 != 0) {
				if (local30 >= 128 && local30 < 160) {
					@Pc(46) char local46 = Static73.aCharArray1[local30 - 128];
					if (local46 == '\u0000') {
						local46 = '?';
					}
					local30 = local46;
				}
				local8[local18++] = (char) local30;
			}
		}
		return new String(local8, 0, local18);
	}
}
