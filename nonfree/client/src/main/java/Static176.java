import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static176 {

	@OriginalMember(owner = "client!th", name = "X", descriptor = "I")
	public static int anInt4297;

	@OriginalMember(owner = "client!th", name = "bb", descriptor = "I")
	public static int anInt4301;

	@OriginalMember(owner = "client!th", name = "R", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_1183 = Static158.method3034("Lade Wordpack )2 ");

	@OriginalMember(owner = "client!th", name = "T", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_1184 = Static158.method3034("<col=00ff00>");

	@OriginalMember(owner = "client!th", name = "U", descriptor = "[I")
	public static final int[] anIntArray466 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIII)I")
	public static int method3301(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(15) int local15 = 65536 - Class2_Sub1_Sub7_Sub1.anIntArray129[arg1 * 1024 / arg2] >> 1;
		return ((65536 - local15) * arg3 >> 16) + (arg0 * local15 >> 16);
	}
}
