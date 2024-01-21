import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ee")
public final class Class26 {

	@OriginalMember(owner = "client!ee", name = "g", descriptor = "[I")
	public static final int[] anIntArray76 = new int[2048];

	@OriginalMember(owner = "client!ee", name = "j", descriptor = "[I")
	private static final int[] anIntArray78 = new int[512];

	@OriginalMember(owner = "client!ee", name = "i", descriptor = "[I")
	public static final int[] anIntArray77 = new int[2048];

	@OriginalMember(owner = "client!ee", name = "p", descriptor = "[I")
	public static final int[] anIntArray80 = new int[2048];

	static {
		for (@Pc(31) int local31 = 1; local31 < 512; local31++) {
			anIntArray78[local31] = 32768 / local31;
		}
		for (@Pc(44) int local44 = 1; local44 < 2048; local44++) {
			anIntArray80[local44] = 65536 / local44;
		}
		for (@Pc(57) int local57 = 0; local57 < 2048; local57++) {
			anIntArray77[local57] = (int) (Math.sin((double) local57 * 0.0030679615D) * 65536.0D);
			anIntArray76[local57] = (int) (Math.cos((double) local57 * 0.0030679615D) * 65536.0D);
		}
	}
}
