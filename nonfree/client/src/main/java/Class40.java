import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cn")
public final class Class40 {

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "I")
	public final int anInt1151;

	@OriginalMember(owner = "client!cn", name = "c", descriptor = "I")
	public int anInt1152;

	@OriginalMember(owner = "client!cn", name = "d", descriptor = "[I")
	public final int[] anIntArray83;

	@OriginalMember(owner = "client!cn", name = "b", descriptor = "[I")
	public final int[] anIntArray82;

	@OriginalMember(owner = "client!cn", name = "<init>", descriptor = "()V")
	public Class40() {
		Static105.method1872(16);
		this.anInt1151 = Static105.method1875() == 0 ? 1 : Static105.method1872(4) + 1;
		if (Static105.method1875() != 0) {
			Static105.method1872(8);
		}
		Static105.method1872(2);
		if (this.anInt1151 > 1) {
			this.anInt1152 = Static105.method1872(4);
		}
		this.anIntArray83 = new int[this.anInt1151];
		this.anIntArray82 = new int[this.anInt1151];
		for (@Pc(42) int local42 = 0; local42 < this.anInt1151; local42++) {
			Static105.method1872(8);
			this.anIntArray83[local42] = Static105.method1872(8);
			this.anIntArray82[local42] = Static105.method1872(8);
		}
	}
}
