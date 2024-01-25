import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!bp", name = "Gc", descriptor = "Lclient!ui;")
	public static final Class242 aClass242_8 = new Class242("Your ignore list is full, max of 100.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O máx. é 100.");

	@OriginalMember(owner = "client!bp", name = "Tc", descriptor = "I")
	public static int anInt985 = -1;

	@OriginalMember(owner = "client!bp", name = "Zc", descriptor = "Lclient!ui;")
	public static final Class242 aClass242_9 = new Class242("Loaded client variable data", "Client-Variablen geladen", "Variables du client chargées", "As variáveis do sistema foram carregadas");

	@OriginalMember(owner = "client!bp", name = "qd", descriptor = "I")
	public static int anInt1003 = 0;

	@OriginalMember(owner = "client!bp", name = "b", descriptor = "(BI)Lclient!jl;")
	public static Class130 method708(@OriginalArg(1) int arg0) {
		@Pc(10) Class130 local10 = (Class130) Static235.aClass69_41.method1591((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static267.aClass166_190.method3696(arg0, 0);
		local10 = new Class130();
		if (local20 != null) {
			local10.method2804(new Class4_Sub30(local20));
		}
		local10.method2800();
		Static235.aClass69_41.method1590((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(BZILjava/lang/String;)I")
	public static int method711(@OriginalArg(2) int arg0, @OriginalArg(3) String arg1) {
		@Pc(24) boolean local24 = false;
		@Pc(26) boolean local26 = false;
		@Pc(28) int local28 = 0;
		@Pc(31) int local31 = arg1.length();
		for (@Pc(37) int local37 = 0; local37 < local31; local37++) {
			@Pc(43) char local43 = arg1.charAt(local37);
			if (local37 == 0) {
				if (local43 == '-') {
					local24 = true;
					continue;
				}
				if (local43 == '+') {
					continue;
				}
			}
			@Pc(82) int local82;
			if (local43 >= '0' && local43 <= '9') {
				local82 = local43 - '0';
			} else if (local43 >= 'A' && local43 <= 'Z') {
				local82 = local43 - '7';
			} else if (local43 >= 'a' && local43 <= 'z') {
				local82 = local43 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (arg0 <= local82) {
				throw new NumberFormatException();
			}
			if (local24) {
				local82 = -local82;
			}
			@Pc(120) int local120 = local82 + local28 * arg0;
			if (local28 != local120 / arg0) {
				throw new NumberFormatException();
			}
			local26 = true;
			local28 = local120;
		}
		if (!local26) {
			throw new NumberFormatException();
		}
		return local28;
	}
}
