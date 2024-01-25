import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static254 {

	@OriginalMember(owner = "client!oq", name = "Q", descriptor = "I")
	public static int anInt4494;

	@OriginalMember(owner = "client!oq", name = "N", descriptor = "Lclient!ch;")
	public static final Class32 aClass32_64 = new Class32("Created gameworld", "Spielwelt erstellt.", "Monde de jeu créé", "Universo de jogo criado");

	@OriginalMember(owner = "client!oq", name = "T", descriptor = "I")
	public static int anInt4497 = 0;

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(IBLclient!nl;)Lclient!gn;")
	public static Class2_Sub18 method3991(@OriginalArg(0) int arg0, @OriginalArg(2) Class171 arg1) {
		@Pc(16) byte[] local16 = arg1.method3762(arg0);
		return local16 == null ? null : new Class2_Sub18(local16);
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(ICLjava/lang/String;)I")
	public static int method3992(@OriginalArg(1) char arg0, @OriginalArg(2) String arg1) {
		@Pc(7) int local7 = 0;
		@Pc(10) int local10 = arg1.length();
		for (@Pc(17) int local17 = 0; local17 < local10; local17++) {
			if (arg0 == arg1.charAt(local17)) {
				local7++;
			}
		}
		return local7;
	}
}
