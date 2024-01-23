import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ai")
public final class Class7 {

	@OriginalMember(owner = "client!ai", name = "c", descriptor = "I")
	public int anInt198;

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "I")
	public int anInt197;

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "[I")
	public int[] anIntArray22;

	@OriginalMember(owner = "client!ai", name = "d", descriptor = "[I")
	public int[] anIntArray23;

	@OriginalMember(owner = "client!ai", name = "<init>", descriptor = "()V")
	public Class7() {
		Static167.method2751(16);
		this.anInt198 = Static167.method2754() == 0 ? 1 : Static167.method2751(4) + 1;
		if (Static167.method2754() != 0) {
			Static167.method2751(8);
		}
		Static167.method2751(2);
		if (this.anInt198 > 1) {
			this.anInt197 = Static167.method2751(4);
		}
		this.anIntArray22 = new int[this.anInt198];
		this.anIntArray23 = new int[this.anInt198];
		for (@Pc(42) int local42 = 0; local42 < this.anInt198; local42++) {
			Static167.method2751(8);
			this.anIntArray22[local42] = Static167.method2751(8);
			this.anIntArray23[local42] = Static167.method2751(8);
		}
	}
}
