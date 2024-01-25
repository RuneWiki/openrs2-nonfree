import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static505 {

	@OriginalMember(owner = "client!ru", name = "b", descriptor = "I")
	public static int anInt8726;

	@OriginalMember(owner = "client!ru", name = "e", descriptor = "I")
	public static int anInt8728;

	@OriginalMember(owner = "client!ru", name = "d", descriptor = "[I")
	public static final int[] anIntArray538 = new int[25];

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(I)I")
	public static int method7457() {
		return Static307.anIntArray298 == null ? 0 : Static307.anIntArray298.length * 2;
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(BII)Z")
	public static boolean method7460(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x60000) != 0 | Static394.method6369(arg1, arg0) || Static113.method2321(arg1, arg0);
	}
}
