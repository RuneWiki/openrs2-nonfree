import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sn")
public final class Class275 {

	@OriginalMember(owner = "client!sn", name = "c", descriptor = "I")
	public final int anInt8260;

	@OriginalMember(owner = "client!sn", name = "d", descriptor = "I")
	public int anInt8261;

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "[I")
	public final int[] anIntArray616;

	@OriginalMember(owner = "client!sn", name = "b", descriptor = "[I")
	public final int[] anIntArray617;

	@OriginalMember(owner = "client!sn", name = "<init>", descriptor = "()V")
	public Class275() {
		Static311.method5011(16);
		this.anInt8260 = Static311.method5015() == 0 ? 1 : Static311.method5011(4) + 1;
		if (Static311.method5015() != 0) {
			Static311.method5011(8);
		}
		Static311.method5011(2);
		if (this.anInt8260 > 1) {
			this.anInt8261 = Static311.method5011(4);
		}
		this.anIntArray616 = new int[this.anInt8260];
		this.anIntArray617 = new int[this.anInt8260];
		for (@Pc(42) int local42 = 0; local42 < this.anInt8260; local42++) {
			Static311.method5011(8);
			this.anIntArray616[local42] = Static311.method5011(8);
			this.anIntArray617[local42] = Static311.method5011(8);
		}
	}
}
