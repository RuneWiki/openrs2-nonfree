import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static28 {

	@OriginalMember(owner = "client!as", name = "N", descriptor = "I")
	public static int anInt861 = 0;

	@OriginalMember(owner = "client!as", name = "vb", descriptor = "Lclient!fja;")
	public static final Class126 aClass126_12 = new Class126(47, 6);

	@OriginalMember(owner = "client!as", name = "Cb", descriptor = "Z")
	public static boolean aBoolean84 = false;

	@OriginalMember(owner = "client!as", name = "Hb", descriptor = "[I")
	public static final int[] anIntArray21 = new int[200];

	@OriginalMember(owner = "client!as", name = "b", descriptor = "(III)Z")
	public static boolean method920(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x100100) != 0;
	}
}
