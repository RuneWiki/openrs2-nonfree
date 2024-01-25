import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static541 {

	@OriginalMember(owner = "client!ws", name = "u", descriptor = "Lclient!sca;")
	public static Class264 aClass264_5;

	@OriginalMember(owner = "client!ws", name = "o", descriptor = "Lclient!vj;")
	public static final Class305 aClass305_463 = new Class305(74, 4);

	@OriginalMember(owner = "client!ws", name = "s", descriptor = "[[B")
	public static final byte[][] aByteArrayArray30 = new byte[50][];

	@OriginalMember(owner = "client!ws", name = "t", descriptor = "Lclient!cea;")
	public static final Class45 aClass45_138 = new Class45("Created gameworld", "Spielwelt erstellt.", "Monde de jeu créé", "Universo de jogo criado");

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(IIIIIIIIBI)V")
	public static void method8233(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		if (arg2 >= Static325.anInt6148 && arg2 <= Static119.anInt2469 && Static325.anInt6148 <= arg6 && Static119.anInt2469 >= arg6 && Static325.anInt6148 <= arg4 && Static119.anInt2469 >= arg4 && Static325.anInt6148 <= arg5 && arg5 <= Static119.anInt2469 && Static94.anInt2057 <= arg7 && arg7 <= Static187.anInt3872 && Static94.anInt2057 <= arg0 && Static187.anInt3872 >= arg0 && Static94.anInt2057 <= arg1 && Static187.anInt3872 >= arg1 && Static94.anInt2057 <= arg3 && arg3 <= Static187.anInt3872) {
			Static219.method4015(arg7, arg6, arg1, arg3, arg0, arg5, arg2, arg4, arg8);
		} else {
			Static27.method789(arg6, arg5, arg1, arg3, arg4, arg8, arg2, arg0, arg7);
		}
	}
}
