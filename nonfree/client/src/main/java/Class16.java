import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ce")
public final class Class16 {

	@OriginalMember(owner = "client!ce", name = "d", descriptor = "[I")
	public static final int[] anIntArray39 = new int[2048];

	@OriginalMember(owner = "client!ce", name = "j", descriptor = "[I")
	public static final int[] anIntArray43 = new int[2048];

	@OriginalMember(owner = "client!ce", name = "i", descriptor = "[I")
	private static final int[] anIntArray42 = new int[512];

	@OriginalMember(owner = "client!ce", name = "p", descriptor = "[I")
	public static final int[] anIntArray44 = new int[2048];

	static {
		for (@Pc(31) int local31 = 1; local31 < 512; local31++) {
			anIntArray42[local31] = 32768 / local31;
		}
		for (@Pc(44) int local44 = 1; local44 < 2048; local44++) {
			anIntArray43[local44] = 65536 / local44;
		}
		for (@Pc(57) int local57 = 0; local57 < 2048; local57++) {
			anIntArray44[local57] = (int) (Math.sin((double) local57 * 0.0030679615D) * 65536.0D);
			anIntArray39[local57] = (int) (Math.cos((double) local57 * 0.0030679615D) * 65536.0D);
		}
	}
}
