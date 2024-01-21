import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kd")
public final class Class1_Sub1_Sub8_Sub4 extends Class1_Sub1_Sub8 {

	@OriginalMember(owner = "client!kd", name = "T", descriptor = "[I")
	public static int[] anIntArray214 = new int[512];

	@OriginalMember(owner = "client!kd", name = "S", descriptor = "[I")
	public static int[] anIntArray213 = new int[2048];

	@OriginalMember(owner = "client!kd", name = "Q", descriptor = "[I")
	public static int[] anIntArray212 = new int[2048];

	@OriginalMember(owner = "client!kd", name = "jb", descriptor = "[I")
	public static int[] anIntArray216 = new int[2048];

	static {
		for (@Pc(31) int local31 = 1; local31 < 512; local31++) {
			anIntArray214[local31] = 32768 / local31;
		}
		for (@Pc(44) int local44 = 1; local44 < 2048; local44++) {
			anIntArray213[local44] = 65536 / local44;
		}
		for (@Pc(57) int local57 = 0; local57 < 2048; local57++) {
			anIntArray212[local57] = (int) (Math.sin((double) local57 * 0.0030679615D) * 65536.0D);
			anIntArray216[local57] = (int) (Math.cos((double) local57 * 0.0030679615D) * 65536.0D);
		}
	}
}
