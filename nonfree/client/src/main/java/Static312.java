import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static312 {

	@OriginalMember(owner = "client!pr", name = "l", descriptor = "I")
	public static int anInt5519;

	@OriginalMember(owner = "client!pr", name = "u", descriptor = "I")
	public static int anInt5524;

	@OriginalMember(owner = "client!pr", name = "b", descriptor = "Lclient!hl;")
	public static final Class101 aClass101_2 = new Class101(128);

	@OriginalMember(owner = "client!pr", name = "p", descriptor = "I")
	public static int anInt5522 = -1;

	@OriginalMember(owner = "client!pr", name = "s", descriptor = "I")
	public static int anInt5523 = 2;

	@OriginalMember(owner = "client!pr", name = "t", descriptor = "Lclient!pi;")
	public static final Class189 aClass189_173 = new Class189("You can't add yourself to your own ignore list.", "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste noire.", "Você não pode adicionar a si próprio à sua lista de ignorados.");

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(Z)I")
	public static int method4323() {
		@Pc(5) Class172 local5 = Static121.aClass172_3;
		@Pc(7) boolean local7 = false;
		if (Static105.anInt2382 != 0) {
			@Pc(16) Canvas local16 = new Canvas();
			local16.setSize(100, 100);
			local7 = true;
			local5 = Static318.method5506(0, 0, null, null, local16);
		}
		@Pc(33) long local33 = Static118.method1934();
		for (@Pc(35) int local35 = 0; local35 < 10000; local35++) {
			local5.method5512();
		}
		@Pc(61) int local61 = (int) (Static118.method1934() - local33);
		local5.method5507(-16777216, 100, 0, 0, 100);
		if (local7) {
			local5.method5538();
		}
		return local61;
	}
}
