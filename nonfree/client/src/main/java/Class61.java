import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ne")
public final class Class61 {

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "I")
	public final int anInt3081;

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "I")
	public int anInt3080;

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "[I")
	public final int[] anIntArray357;

	@OriginalMember(owner = "client!ne", name = "d", descriptor = "[I")
	public final int[] anIntArray358;

	@OriginalMember(owner = "client!ne", name = "<init>", descriptor = "()V")
	public Class61() {
		Static110.method2016(16);
		this.anInt3081 = Static110.method2018() == 0 ? 1 : Static110.method2016(4) + 1;
		if (Static110.method2018() != 0) {
			Static110.method2016(8);
		}
		Static110.method2016(2);
		if (this.anInt3081 > 1) {
			this.anInt3080 = Static110.method2016(4);
		}
		this.anIntArray357 = new int[this.anInt3081];
		this.anIntArray358 = new int[this.anInt3081];
		for (@Pc(42) int local42 = 0; local42 < this.anInt3081; local42++) {
			Static110.method2016(8);
			this.anIntArray357[local42] = Static110.method2016(8);
			this.anIntArray358[local42] = Static110.method2016(8);
		}
	}
}
