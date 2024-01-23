import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hf")
public final class Class40 {

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "I")
	public int anInt1896;

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "I")
	public int anInt1895;

	@OriginalMember(owner = "client!hf", name = "c", descriptor = "[I")
	public int[] anIntArray189;

	@OriginalMember(owner = "client!hf", name = "d", descriptor = "[I")
	public int[] anIntArray190;

	@OriginalMember(owner = "client!hf", name = "<init>", descriptor = "()V")
	public Class40() {
		Static172.method2786(16);
		this.anInt1896 = Static172.method2781() == 0 ? 1 : Static172.method2786(4) + 1;
		if (Static172.method2781() != 0) {
			Static172.method2786(8);
		}
		Static172.method2786(2);
		if (this.anInt1896 > 1) {
			this.anInt1895 = Static172.method2786(4);
		}
		this.anIntArray189 = new int[this.anInt1896];
		this.anIntArray190 = new int[this.anInt1896];
		for (@Pc(42) int local42 = 0; local42 < this.anInt1896; local42++) {
			Static172.method2786(8);
			this.anIntArray189[local42] = Static172.method2786(8);
			this.anIntArray190[local42] = Static172.method2786(8);
		}
	}
}
