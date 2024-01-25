import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wga")
public final class Class375 {

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "I")
	public final int anInt10576;

	@OriginalMember(owner = "client!wga", name = "d", descriptor = "I")
	public int anInt10577;

	@OriginalMember(owner = "client!wga", name = "b", descriptor = "[I")
	public final int[] anIntArray566;

	@OriginalMember(owner = "client!wga", name = "c", descriptor = "[I")
	public final int[] anIntArray567;

	@OriginalMember(owner = "client!wga", name = "<init>", descriptor = "()V")
	public Class375() {
		Static172.method3244(16);
		this.anInt10576 = Static172.method3240() == 0 ? 1 : Static172.method3244(4) + 1;
		if (Static172.method3240() != 0) {
			Static172.method3244(8);
		}
		Static172.method3244(2);
		if (this.anInt10576 > 1) {
			this.anInt10577 = Static172.method3244(4);
		}
		this.anIntArray566 = new int[this.anInt10576];
		this.anIntArray567 = new int[this.anInt10576];
		for (@Pc(42) int local42 = 0; local42 < this.anInt10576; local42++) {
			Static172.method3244(8);
			this.anIntArray566[local42] = Static172.method3244(8);
			this.anIntArray567[local42] = Static172.method3244(8);
		}
	}
}
