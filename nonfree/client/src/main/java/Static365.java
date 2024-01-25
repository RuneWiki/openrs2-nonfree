import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static365 {

	@OriginalMember(owner = "client!nba", name = "i", descriptor = "Lclient!cfa;")
	public static Class46 aClass46_4;

	@OriginalMember(owner = "client!nba", name = "r", descriptor = "I")
	public static int anInt7041;

	@OriginalMember(owner = "client!nba", name = "k", descriptor = "Lclient!lga;")
	public static final Class185 aClass185_73 = new Class185(63, -1);

	@OriginalMember(owner = "client!nba", name = "t", descriptor = "I")
	public static int anInt7043 = -1;

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(IB)V")
	public static void method5875(@OriginalArg(1) byte arg0) {
		if (Static538.aByteArrayArrayArray18 == null) {
			Static538.aByteArrayArrayArray18 = new byte[4][Static306.anInt6176][Static108.anInt2930];
		}
		for (@Pc(19) int local19 = 0; local19 < 4; local19++) {
			for (@Pc(23) int local23 = 0; local23 < Static306.anInt6176; local23++) {
				for (@Pc(27) int local27 = 0; local27 < Static108.anInt2930; local27++) {
					Static538.aByteArrayArrayArray18[local19][local23][local27] = arg0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method5876(@OriginalArg(0) String arg0) {
		System.out.println("Error: " + Static450.method6845("\n", "%0a", arg0));
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(II)Z")
	public static boolean method5880(@OriginalArg(0) int arg0) {
		return arg0 == 4 || arg0 == 8 || arg0 == 11;
	}
}
