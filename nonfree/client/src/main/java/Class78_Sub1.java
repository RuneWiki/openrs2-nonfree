import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public final class Class78_Sub1 extends Class78 {

	@OriginalMember(owner = "client!gb", name = "i", descriptor = "Lclient!gd;")
	public static final Class79 aClass79_46 = new Class79("Created gameworld", "Spielwelt erstellt.", "Monde de jeu créé", "Universo de jogo criado");

	@OriginalMember(owner = "client!gb", name = "l", descriptor = "D")
	public static double aDouble1 = -1.0D;

	@OriginalMember(owner = "client!gb", name = "n", descriptor = "Z")
	public static boolean aBoolean166 = false;

	@OriginalMember(owner = "client!gb", name = "m", descriptor = "Lclient!mc;")
	public static final Class145 aClass145_83 = new Class145(26, 7);

	@OriginalMember(owner = "client!gb", name = "o", descriptor = "Lclient!s;")
	public static final Class210 aClass210_4 = new Class210(2, 5);

	@OriginalMember(owner = "client!gb", name = "h", descriptor = "[I")
	public final int[] anIntArray139;

	@OriginalMember(owner = "client!gb", name = "k", descriptor = "[I")
	public final int[] anIntArray140;

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(II[I[I)V", line = 25)
	public Class78_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.anIntArray139 = arg2;
		this.anIntArray140 = arg3;
	}
}
