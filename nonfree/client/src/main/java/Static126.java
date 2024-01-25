import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static126 {

	@OriginalMember(owner = "client!fv", name = "L", descriptor = "Lclient!os;")
	public static final Class182 aClass182_99 = new Class182("Created gameworld", "Spielwelt erstellt.", "Monde de jeu créé", "Universo de jogo criado");

	@OriginalMember(owner = "client!fv", name = "N", descriptor = "Lclient!mf;")
	public static final Class163 aClass163_24 = new Class163();

	@OriginalMember(owner = "client!fv", name = "P", descriptor = "I")
	public static int anInt2599 = -1;

	@OriginalMember(owner = "client!fv", name = "Q", descriptor = "I")
	public static int anInt2600 = -1;

	@OriginalMember(owner = "client!fv", name = "R", descriptor = "[Lclient!jv;")
	public static final Class137[] aClass137Array1 = new Class137[14];

	@OriginalMember(owner = "client!fv", name = "S", descriptor = "Lclient!s;")
	public static final Class217 aClass217_58 = new Class217(9, 11);

	@OriginalMember(owner = "client!fv", name = "T", descriptor = "Lclient!os;")
	public static final Class182 aClass182_100 = new Class182("slide:", "gleiten:", "glissement:", "deslizamento:");

	@OriginalMember(owner = "client!fv", name = "d", descriptor = "(II)V")
	public static void method2213(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || arg0 > 2) {
			arg0 = 0;
		}
		Static68.anInt1468 = arg0;
	}
}
