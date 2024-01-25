import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static48 {

	@OriginalMember(owner = "client!cg", name = "db", descriptor = "I")
	public static int anInt871;

	@OriginalMember(owner = "client!cg", name = "P", descriptor = "Lclient!of;")
	public static final Class174 aClass174_30 = new Class174("Created gameworld", "Spielwelt erstellt.", "Monde de jeu créé", "Universo de jogo criado");

	@OriginalMember(owner = "client!cg", name = "eb", descriptor = "Z")
	public static boolean aBoolean58 = false;

	@OriginalMember(owner = "client!cg", name = "gb", descriptor = "Lclient!lt;")
	public static final Class142 aClass142_1 = new Class142();

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(II)Z")
	public static boolean method914(@OriginalArg(0) int arg0) {
		return arg0 == 2 || arg0 == 3 || arg0 == 4 || arg0 == 5;
	}

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "(III)I")
	public static int method915(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 4 || arg1 == 5 ? Static14.anIntArray3[arg0 & 0x3] : 256;
	}
}
