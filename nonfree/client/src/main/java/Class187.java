import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pd")
public final class Class187 {

	@OriginalMember(owner = "client!pd", name = "c", descriptor = "I")
	public final int anInt5044;

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "I")
	public int anInt5043;

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "[I")
	public final int[] anIntArray444;

	@OriginalMember(owner = "client!pd", name = "d", descriptor = "[I")
	public final int[] anIntArray445;

	@OriginalMember(owner = "client!pd", name = "<init>", descriptor = "()V")
	public Class187() {
		Static306.method4057(16);
		this.anInt5044 = Static306.method4060() == 0 ? 1 : Static306.method4057(4) + 1;
		if (Static306.method4060() != 0) {
			Static306.method4057(8);
		}
		Static306.method4057(2);
		if (this.anInt5044 > 1) {
			this.anInt5043 = Static306.method4057(4);
		}
		this.anIntArray444 = new int[this.anInt5044];
		this.anIntArray445 = new int[this.anInt5044];
		for (@Pc(42) int local42 = 0; local42 < this.anInt5044; local42++) {
			Static306.method4057(8);
			this.anIntArray444[local42] = Static306.method4057(8);
			this.anIntArray445[local42] = Static306.method4057(8);
		}
	}
}
