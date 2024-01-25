import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eaa")
public final class Class91 {

	@OriginalMember(owner = "client!eaa", name = "c", descriptor = "I")
	public final int anInt1941;

	@OriginalMember(owner = "client!eaa", name = "d", descriptor = "I")
	public int anInt1940;

	@OriginalMember(owner = "client!eaa", name = "b", descriptor = "[I")
	public final int[] anIntArray110;

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "[I")
	public final int[] anIntArray111;

	@OriginalMember(owner = "client!eaa", name = "<init>", descriptor = "()V")
	public Class91() {
		Static659.method9193(16);
		this.anInt1941 = Static659.method9189() == 0 ? 1 : Static659.method9193(4) + 1;
		if (Static659.method9189() != 0) {
			Static659.method9193(8);
		}
		Static659.method9193(2);
		if (this.anInt1941 > 1) {
			this.anInt1940 = Static659.method9193(4);
		}
		this.anIntArray110 = new int[this.anInt1941];
		this.anIntArray111 = new int[this.anInt1941];
		for (@Pc(42) int local42 = 0; local42 < this.anInt1941; local42++) {
			Static659.method9193(8);
			this.anIntArray110[local42] = Static659.method9193(8);
			this.anIntArray111[local42] = Static659.method9193(8);
		}
	}
}
