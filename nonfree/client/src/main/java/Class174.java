import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vn")
public final class Class174 {

	@OriginalMember(owner = "client!vn", name = "d", descriptor = "I")
	public int anInt5671;

	@OriginalMember(owner = "client!vn", name = "c", descriptor = "I")
	public int anInt5670;

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "[I")
	public int[] anIntArray666;

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "[I")
	public int[] anIntArray667;

	@OriginalMember(owner = "client!vn", name = "<init>", descriptor = "()V")
	public Class174() {
		Static15.method297(16);
		this.anInt5671 = Static15.method299() == 0 ? 1 : Static15.method297(4) + 1;
		if (Static15.method299() != 0) {
			Static15.method297(8);
		}
		Static15.method297(2);
		if (this.anInt5671 > 1) {
			this.anInt5670 = Static15.method297(4);
		}
		this.anIntArray666 = new int[this.anInt5671];
		this.anIntArray667 = new int[this.anInt5671];
		for (@Pc(42) int local42 = 0; local42 < this.anInt5671; local42++) {
			Static15.method297(8);
			this.anIntArray666[local42] = Static15.method297(8);
			this.anIntArray667[local42] = Static15.method297(8);
		}
	}
}
