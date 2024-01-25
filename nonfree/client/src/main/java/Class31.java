import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bg")
public final class Class31 {

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "I")
	public final int anInt784;

	@OriginalMember(owner = "client!bg", name = "c", descriptor = "I")
	public int anInt785;

	@OriginalMember(owner = "client!bg", name = "d", descriptor = "[I")
	public final int[] anIntArray71;

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "[I")
	public final int[] anIntArray70;

	@OriginalMember(owner = "client!bg", name = "<init>", descriptor = "()V")
	public Class31() {
		Static477.method6422(16);
		this.anInt784 = Static477.method6424() == 0 ? 1 : Static477.method6422(4) + 1;
		if (Static477.method6424() != 0) {
			Static477.method6422(8);
		}
		Static477.method6422(2);
		if (this.anInt784 > 1) {
			this.anInt785 = Static477.method6422(4);
		}
		this.anIntArray71 = new int[this.anInt784];
		this.anIntArray70 = new int[this.anInt784];
		for (@Pc(42) int local42 = 0; local42 < this.anInt784; local42++) {
			Static477.method6422(8);
			this.anIntArray71[local42] = Static477.method6422(8);
			this.anIntArray70[local42] = Static477.method6422(8);
		}
	}
}
