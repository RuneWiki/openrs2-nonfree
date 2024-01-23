import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pc")
public final class Class93 {

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "I")
	public int anInt3558;

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "I")
	public int anInt3559;

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "[I")
	public int[] anIntArray312;

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "[I")
	public int[] anIntArray313;

	@OriginalMember(owner = "client!pc", name = "<init>", descriptor = "()V")
	public Class93() {
		Static135.method2266(16);
		this.anInt3558 = Static135.method2268() == 0 ? 1 : Static135.method2266(4) + 1;
		if (Static135.method2268() != 0) {
			Static135.method2266(8);
		}
		Static135.method2266(2);
		if (this.anInt3558 > 1) {
			this.anInt3559 = Static135.method2266(4);
		}
		this.anIntArray312 = new int[this.anInt3558];
		this.anIntArray313 = new int[this.anInt3558];
		for (@Pc(42) int local42 = 0; local42 < this.anInt3558; local42++) {
			Static135.method2266(8);
			this.anIntArray312[local42] = Static135.method2266(8);
			this.anIntArray313[local42] = Static135.method2266(8);
		}
	}
}
