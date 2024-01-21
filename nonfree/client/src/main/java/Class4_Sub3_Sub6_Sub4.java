import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rf")
public final class Class4_Sub3_Sub6_Sub4 extends Class4_Sub3_Sub6 {

	@OriginalMember(owner = "client!rf", name = "db", descriptor = "[I")
	public static int[] anIntArray304 = new int[2048];

	@OriginalMember(owner = "client!rf", name = "S", descriptor = "[I")
	public static int[] anIntArray300 = new int[2048];

	@OriginalMember(owner = "client!rf", name = "V", descriptor = "[I")
	public static int[] anIntArray301 = new int[2048];

	@OriginalMember(owner = "client!rf", name = "cb", descriptor = "[I")
	public static int[] anIntArray303 = new int[512];

	static {
		for (@Pc(29) int local29 = 1; local29 < 512; local29++) {
			anIntArray303[local29] = 32768 / local29;
		}
		for (@Pc(42) int local42 = 1; local42 < 2048; local42++) {
			anIntArray300[local42] = 65536 / local42;
		}
		for (@Pc(55) int local55 = 0; local55 < 2048; local55++) {
			anIntArray301[local55] = (int) (Math.sin((double) local55 * 0.0030679615D) * 65536.0D);
			anIntArray304[local55] = (int) (Math.cos((double) local55 * 0.0030679615D) * 65536.0D);
		}
	}
}
