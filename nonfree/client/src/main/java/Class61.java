import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!di")
public final class Class61 {

	@OriginalMember(owner = "client!di", name = "b", descriptor = "I")
	public final int anInt2258;

	@OriginalMember(owner = "client!di", name = "c", descriptor = "I")
	public int anInt2259;

	@OriginalMember(owner = "client!di", name = "d", descriptor = "[I")
	public final int[] anIntArray109;

	@OriginalMember(owner = "client!di", name = "a", descriptor = "[I")
	public final int[] anIntArray108;

	@OriginalMember(owner = "client!di", name = "<init>", descriptor = "()V")
	public Class61() {
		Static176.method3137(16);
		this.anInt2258 = Static176.method3144() == 0 ? 1 : Static176.method3137(4) + 1;
		if (Static176.method3144() != 0) {
			Static176.method3137(8);
		}
		Static176.method3137(2);
		if (this.anInt2258 > 1) {
			this.anInt2259 = Static176.method3137(4);
		}
		this.anIntArray109 = new int[this.anInt2258];
		this.anIntArray108 = new int[this.anInt2258];
		for (@Pc(42) int local42 = 0; local42 < this.anInt2258; local42++) {
			Static176.method3137(8);
			this.anIntArray109[local42] = Static176.method3137(8);
			this.anIntArray108[local42] = Static176.method3137(8);
		}
	}
}
