import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static533 {

	@OriginalMember(owner = "client!we", name = "s", descriptor = "I")
	public static int anInt9264;

	@OriginalMember(owner = "client!we", name = "t", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray6;

	@OriginalMember(owner = "client!we", name = "q", descriptor = "Lclient!oda;")
	public static final Class212 aClass212_4 = new Class212("stellardawn", 1);

	@OriginalMember(owner = "client!we", name = "r", descriptor = "Lclient!nj;")
	public static final Class202 aClass202_266 = new Class202("Starting 3D Library", "Starte 3D-Softwarebibliothek.", "Démarrage de la librairie 3D", "Iniciando biblioteca 3D");

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Lclient!dda;Lclient!dda;I)I")
	public static int method7670(@OriginalArg(0) Class53 arg0, @OriginalArg(1) Class53 arg1) {
		@Pc(10) int local10 = 0;
		if (arg0.method1621(Static281.anInt5177)) {
			local10++;
		}
		if (arg0.method1621(Static184.anInt3392)) {
			local10++;
		}
		if (arg0.method1621(Static16.anInt363)) {
			local10++;
		}
		if (arg1.method1621(Static281.anInt5177)) {
			local10++;
		}
		if (arg1.method1621(Static184.anInt3392)) {
			local10++;
		}
		if (arg1.method1621(Static16.anInt363)) {
			local10++;
		}
		return local10;
	}
}
