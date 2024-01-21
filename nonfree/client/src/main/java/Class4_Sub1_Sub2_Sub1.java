import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!af")
public final class Class4_Sub1_Sub2_Sub1 extends Class4_Sub1_Sub2 {

	@OriginalMember(owner = "client!af", name = "V", descriptor = "[I")
	public static int[] anIntArray11 = new int[512];

	@OriginalMember(owner = "client!af", name = "X", descriptor = "[I")
	public static int[] anIntArray12 = new int[2048];

	@OriginalMember(owner = "client!af", name = "P", descriptor = "[I")
	public static int[] anIntArray9 = new int[2048];

	@OriginalMember(owner = "client!af", name = "db", descriptor = "[I")
	public static int[] anIntArray14 = new int[2048];

	static {
		for (@Pc(29) int local29 = 1; local29 < 512; local29++) {
			anIntArray11[local29] = 32768 / local29;
		}
		for (@Pc(42) int local42 = 1; local42 < 2048; local42++) {
			anIntArray14[local42] = 65536 / local42;
		}
		for (@Pc(55) int local55 = 0; local55 < 2048; local55++) {
			anIntArray9[local55] = (int) (Math.sin((double) local55 * 0.0030679615D) * 65536.0D);
			anIntArray12[local55] = (int) (Math.cos((double) local55 * 0.0030679615D) * 65536.0D);
		}
	}
}
