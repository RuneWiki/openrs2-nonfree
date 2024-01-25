import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wd")
public final class Class245 {

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "I")
	public final int anInt6212;

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "I")
	public int anInt6213;

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "[I")
	public final int[] anIntArray730;

	@OriginalMember(owner = "client!wd", name = "d", descriptor = "[I")
	public final int[] anIntArray731;

	@OriginalMember(owner = "client!wd", name = "<init>", descriptor = "()V")
	public Class245() {
		Static217.method3027(16);
		this.anInt6212 = Static217.method3034() == 0 ? 1 : Static217.method3027(4) + 1;
		if (Static217.method3034() != 0) {
			Static217.method3027(8);
		}
		Static217.method3027(2);
		if (this.anInt6212 > 1) {
			this.anInt6213 = Static217.method3027(4);
		}
		this.anIntArray730 = new int[this.anInt6212];
		this.anIntArray731 = new int[this.anInt6212];
		for (@Pc(42) int local42 = 0; local42 < this.anInt6212; local42++) {
			Static217.method3027(8);
			this.anIntArray730[local42] = Static217.method3027(8);
			this.anIntArray731[local42] = Static217.method3027(8);
		}
	}
}
