import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ta")
public final class Class331 {

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "I")
	public final int anInt9156;

	@OriginalMember(owner = "client!ta", name = "c", descriptor = "I")
	public int anInt9157;

	@OriginalMember(owner = "client!ta", name = "d", descriptor = "[I")
	public final int[] anIntArray481;

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "[I")
	public final int[] anIntArray480;

	@OriginalMember(owner = "client!ta", name = "<init>", descriptor = "()V")
	public Class331() {
		Static670.method8936(16);
		this.anInt9156 = Static670.method8929() == 0 ? 1 : Static670.method8936(4) + 1;
		if (Static670.method8929() != 0) {
			Static670.method8936(8);
		}
		Static670.method8936(2);
		if (this.anInt9156 > 1) {
			this.anInt9157 = Static670.method8936(4);
		}
		this.anIntArray481 = new int[this.anInt9156];
		this.anIntArray480 = new int[this.anInt9156];
		for (@Pc(42) int local42 = 0; local42 < this.anInt9156; local42++) {
			Static670.method8936(8);
			this.anIntArray481[local42] = Static670.method8936(8);
			this.anIntArray480[local42] = Static670.method8936(8);
		}
	}
}
