import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static298 {

	@OriginalMember(owner = "client!p", name = "f", descriptor = "I")
	public static int anInt167;

	@OriginalMember(owner = "client!p", name = "g", descriptor = "I")
	public static int anInt168;

	@OriginalMember(owner = "client!p", name = "a", descriptor = "Z")
	public static boolean aBoolean16 = false;

	@OriginalMember(owner = "client!p", name = "c", descriptor = "Lclient!kc;")
	public static final Class134 aClass134_8 = new Class134("Self", "Mich", "Moi", "Eu");

	@OriginalMember(owner = "client!p", name = "d", descriptor = "[I")
	public static final int[] anIntArray15 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!p", name = "e", descriptor = "I")
	public static int anInt166 = 0;

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(BII)I")
	public static int method157(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 4 || arg1 == 5 ? Static294.anIntArray95[arg0 & 0x3] : 256;
	}
}
