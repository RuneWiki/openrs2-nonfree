import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static433 {

	@OriginalMember(owner = "client!sda", name = "u", descriptor = "Lclient!h;")
	public static final Class114 aClass114_157 = new Class114("Loaded client variable data", "Client-Variablen geladen", "Variables du client chargées", "As variáveis do sistema foram carregadas");

	@OriginalMember(owner = "client!sda", name = "v", descriptor = "Ljava/lang/String;")
	public static String aString72 = null;

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(JI)Ljava/lang/String;")
	public static String method6988(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(28) int local28 = 0;
			@Pc(30) long local30 = arg0;
			while (local30 != 0L) {
				local30 /= 37L;
				local28++;
			}
			@Pc(45) StringBuffer local45 = new StringBuffer(local28);
			while (arg0 != 0L) {
				@Pc(48) long local48 = arg0;
				arg0 /= 37L;
				local45.append(Static345.aCharArray5[(int) (local48 - arg0 * 37L)]);
			}
			return local45.reverse().toString();
		}
	}
}
