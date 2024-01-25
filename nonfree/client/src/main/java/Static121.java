import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static121 {

	@OriginalMember(owner = "client!el", name = "c", descriptor = "Lclient!sea;")
	public static Class308 aClass308_48;

	@OriginalMember(owner = "client!el", name = "d", descriptor = "I")
	public static int anInt2503;

	@OriginalMember(owner = "client!el", name = "f", descriptor = "I")
	public static int anInt2504;

	@OriginalMember(owner = "client!el", name = "g", descriptor = "[[[J")
	public static long[][][] aLongArrayArrayArray1;

	@OriginalMember(owner = "client!el", name = "b", descriptor = "Lclient!gca;")
	public static final Class111 aClass111_9 = new Class111();

	@OriginalMember(owner = "client!el", name = "e", descriptor = "[I")
	public static final int[] anIntArray95 = new int[14];

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(ZIBI)I")
	public static int method2186(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class1_Sub45 local8 = Static365.method5366(arg2, arg0);
		if (local8 == null) {
			return 0;
		} else if (arg1 >= 0 && arg1 < local8.anIntArray520.length) {
			return local8.anIntArray520[arg1];
		} else {
			return 0;
		}
	}
}
