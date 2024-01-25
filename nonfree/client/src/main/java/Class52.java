import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dq")
public final class Class52 {

	@OriginalMember(owner = "client!dq", name = "c", descriptor = "I")
	public final int anInt1272;

	@OriginalMember(owner = "client!dq", name = "d", descriptor = "I")
	public int anInt1273;

	@OriginalMember(owner = "client!dq", name = "b", descriptor = "[I")
	public final int[] anIntArray270;

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "[I")
	public final int[] anIntArray269;

	@OriginalMember(owner = "client!dq", name = "<init>", descriptor = "()V")
	public Class52() {
		Static227.method3704(16);
		this.anInt1272 = Static227.method3710() == 0 ? 1 : Static227.method3704(4) + 1;
		if (Static227.method3710() != 0) {
			Static227.method3704(8);
		}
		Static227.method3704(2);
		if (this.anInt1272 > 1) {
			this.anInt1273 = Static227.method3704(4);
		}
		this.anIntArray270 = new int[this.anInt1272];
		this.anIntArray269 = new int[this.anInt1272];
		for (@Pc(42) int local42 = 0; local42 < this.anInt1272; local42++) {
			Static227.method3704(8);
			this.anIntArray270[local42] = Static227.method3704(8);
			this.anIntArray269[local42] = Static227.method3704(8);
		}
	}
}
