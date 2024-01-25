import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!is")
public final class Class149 {

	@OriginalMember(owner = "client!is", name = "d", descriptor = "I")
	public final int anInt4198;

	@OriginalMember(owner = "client!is", name = "a", descriptor = "I")
	public int anInt4197;

	@OriginalMember(owner = "client!is", name = "b", descriptor = "[I")
	public final int[] anIntArray352;

	@OriginalMember(owner = "client!is", name = "c", descriptor = "[I")
	public final int[] anIntArray353;

	@OriginalMember(owner = "client!is", name = "<init>", descriptor = "()V")
	public Class149() {
		Static254.method3950(16);
		this.anInt4198 = Static254.method3942() == 0 ? 1 : Static254.method3950(4) + 1;
		if (Static254.method3942() != 0) {
			Static254.method3950(8);
		}
		Static254.method3950(2);
		if (this.anInt4198 > 1) {
			this.anInt4197 = Static254.method3950(4);
		}
		this.anIntArray352 = new int[this.anInt4198];
		this.anIntArray353 = new int[this.anInt4198];
		for (@Pc(42) int local42 = 0; local42 < this.anInt4198; local42++) {
			Static254.method3950(8);
			this.anIntArray352[local42] = Static254.method3950(8);
			this.anIntArray353[local42] = Static254.method3950(8);
		}
	}
}
