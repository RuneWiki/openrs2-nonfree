import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static167 {

	@OriginalMember(owner = "client!ib", name = "y", descriptor = "Lclient!gv;")
	public static Class101 aClass101_3;

	@OriginalMember(owner = "client!ib", name = "E", descriptor = "I")
	public static int anInt3119;

	@OriginalMember(owner = "client!ib", name = "G", descriptor = "I")
	public static int anInt3121;

	@OriginalMember(owner = "client!ib", name = "A", descriptor = "Lclient!fg;")
	public static final Class84 aClass84_44 = new Class84("Created gameworld", "Spielwelt erstellt.", "Monde de jeu créé", "Universo de jogo criado");

	@OriginalMember(owner = "client!ib", name = "C", descriptor = "Lclient!wo;")
	public static final Class266 aClass266_28 = new Class266();

	@OriginalMember(owner = "client!ib", name = "D", descriptor = "I")
	public static int anInt3118 = 0;

	@OriginalMember(owner = "client!ib", name = "F", descriptor = "I")
	public static int anInt3120 = 0;

	@OriginalMember(owner = "client!ib", name = "H", descriptor = "[[I")
	public static final int[][] anIntArrayArray89 = new int[6][];

	@OriginalMember(owner = "client!ib", name = "d", descriptor = "(I)Z")
	public static boolean method2671() {
		return Static144.anInt2452 == 0 ? Static327.aClass1_Sub7_Sub3_3.method4982() : true;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(III)Z")
	public static boolean method2672(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static396.method5371(arg1, arg0) | (arg1 & 0x70000) != 0 || Static243.method3589(arg1, arg0);
	}
}
