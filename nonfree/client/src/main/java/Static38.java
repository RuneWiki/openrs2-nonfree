import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!bu", name = "V", descriptor = "[Lclient!qg;")
	public static Class87[] aClass87Array2;

	@OriginalMember(owner = "client!bu", name = "Q", descriptor = "Lclient!wt;")
	public static final Class267 aClass267_15 = new Class267("Loading world list data", "Lade Liste der Welten", "Chargement de la liste des serveurs", "Carregando dados da lista de mundos");

	@OriginalMember(owner = "client!bu", name = "S", descriptor = "Z")
	public static boolean aBoolean93 = true;

	@OriginalMember(owner = "client!bu", name = "T", descriptor = "J")
	public static volatile long aLong42 = 0L;

	@OriginalMember(owner = "client!bu", name = "U", descriptor = "I")
	public static int anInt1153 = 0;

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(BLjava/lang/String;)I")
	public static int method943(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < local8; local17++) {
			local15 = (local15 << 5) + arg0.charAt(local17) - local15;
		}
		return local15;
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(ZLjava/lang/String;)Z")
	public static boolean method944(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static125.anInt2592; local11++) {
			if (arg0.equalsIgnoreCase(Static22.aStringArray3[local11])) {
				return true;
			}
			if (arg0.equalsIgnoreCase(Static147.aStringArray14[local11])) {
				return true;
			}
		}
		return false;
	}
}
