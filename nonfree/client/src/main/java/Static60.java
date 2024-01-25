import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!cp", name = "j", descriptor = "F")
	public static float aFloat122;

	@OriginalMember(owner = "client!cp", name = "k", descriptor = "Lclient!wi;")
	public static Class10_Sub45 aClass10_Sub45_3;

	@OriginalMember(owner = "client!cp", name = "f", descriptor = "Lclient!os;")
	public static final Class182 aClass182_245 = new Class182("Loading textures - ", "Lade Texturen - ", "Chargement des textures - ", "Carregando texturas - ");

	@OriginalMember(owner = "client!cp", name = "l", descriptor = "I")
	public static int anInt7169 = 0;

	@OriginalMember(owner = "client!cp", name = "m", descriptor = "Lclient!s;")
	public static final Class217 aClass217_155 = new Class217(99, 3);

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(ZI)V")
	public static void method5646(@OriginalArg(1) int arg0) {
		Static378.anInt6501 = arg0;
		Static265.aClass267_47.method6011();
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(IZ)V")
	public static void method5648(@OriginalArg(0) int arg0) {
		@Pc(12) Class10_Sub1_Sub17 local12 = Static154.method2630(16, arg0);
		local12.method5346();
	}
}
