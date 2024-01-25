import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!be")
public final class Class20 {

	@OriginalMember(owner = "client!be", name = "h", descriptor = "[I")
	public static final int[] anIntArray22 = new int[32];

	@OriginalMember(owner = "client!be", name = "b", descriptor = "I")
	public int anInt556;

	@OriginalMember(owner = "client!be", name = "e", descriptor = "I")
	public int anInt559;

	@OriginalMember(owner = "client!be", name = "f", descriptor = "I")
	public int anInt560;

	@OriginalMember(owner = "client!be", name = "j", descriptor = "[B")
	public byte[] aByteArray6;

	@OriginalMember(owner = "client!be", name = "k", descriptor = "I")
	public int anInt563;

	@OriginalMember(owner = "client!be", name = "l", descriptor = "[B")
	public byte[] aByteArray7;

	@OriginalMember(owner = "client!be", name = "m", descriptor = "I")
	public int anInt564;

	@OriginalMember(owner = "client!be", name = "o", descriptor = "I")
	public int anInt565;

	@OriginalMember(owner = "client!be", name = "q", descriptor = "I")
	public int anInt566;

	static {
		@Pc(4) int local4 = 2;
		for (@Pc(6) int local6 = 0; local6 < 32; local6++) {
			anIntArray22[local6] = local4 - 1;
			local4 += local4;
		}
	}
}
