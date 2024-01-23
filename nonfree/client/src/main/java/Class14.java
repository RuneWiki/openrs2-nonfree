import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bg")
public final class Class14 {

	@OriginalMember(owner = "client!bg", name = "d", descriptor = "I")
	public int anInt429;

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "I")
	public int anInt428;

	@OriginalMember(owner = "client!bg", name = "c", descriptor = "[I")
	public int[] anIntArray20;

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "[I")
	public int[] anIntArray19;

	@OriginalMember(owner = "client!bg", name = "<init>", descriptor = "()V")
	public Class14() {
		Static121.method2120(16);
		this.anInt429 = Static121.method2124() == 0 ? 1 : Static121.method2120(4) + 1;
		if (Static121.method2124() != 0) {
			Static121.method2120(8);
		}
		Static121.method2120(2);
		if (this.anInt429 > 1) {
			this.anInt428 = Static121.method2120(4);
		}
		this.anIntArray20 = new int[this.anInt429];
		this.anIntArray19 = new int[this.anInt429];
		for (@Pc(42) int local42 = 0; local42 < this.anInt429; local42++) {
			Static121.method2120(8);
			this.anIntArray20[local42] = Static121.method2120(8);
			this.anIntArray19[local42] = Static121.method2120(8);
		}
	}
}
