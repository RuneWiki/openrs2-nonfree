import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!i")
public final class Class31 {

	@OriginalMember(owner = "client!i", name = "d", descriptor = "I")
	public final int anInt1244;

	@OriginalMember(owner = "client!i", name = "b", descriptor = "I")
	public int anInt1243;

	@OriginalMember(owner = "client!i", name = "c", descriptor = "[I")
	public final int[] anIntArray119;

	@OriginalMember(owner = "client!i", name = "a", descriptor = "[I")
	public final int[] anIntArray118;

	@OriginalMember(owner = "client!i", name = "<init>", descriptor = "()V")
	public Class31() {
		Static79.method1430(16);
		this.anInt1244 = Static79.method1425() == 0 ? 1 : Static79.method1430(4) + 1;
		if (Static79.method1425() != 0) {
			Static79.method1430(8);
		}
		Static79.method1430(2);
		if (this.anInt1244 > 1) {
			this.anInt1243 = Static79.method1430(4);
		}
		this.anIntArray119 = new int[this.anInt1244];
		this.anIntArray118 = new int[this.anInt1244];
		for (@Pc(42) int local42 = 0; local42 < this.anInt1244; local42++) {
			Static79.method1430(8);
			this.anIntArray119[local42] = Static79.method1430(8);
			this.anIntArray118[local42] = Static79.method1430(8);
		}
	}
}
