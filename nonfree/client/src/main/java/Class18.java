import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!al")
public final class Class18 {

	@OriginalMember(owner = "client!al", name = "b", descriptor = "I")
	public final int anInt329;

	@OriginalMember(owner = "client!al", name = "d", descriptor = "I")
	public int anInt330;

	@OriginalMember(owner = "client!al", name = "a", descriptor = "[I")
	public final int[] anIntArray13;

	@OriginalMember(owner = "client!al", name = "c", descriptor = "[I")
	public final int[] anIntArray14;

	@OriginalMember(owner = "client!al", name = "<init>", descriptor = "()V")
	public Class18() {
		Static63.method1144(16);
		this.anInt329 = Static63.method1137() == 0 ? 1 : Static63.method1144(4) + 1;
		if (Static63.method1137() != 0) {
			Static63.method1144(8);
		}
		Static63.method1144(2);
		if (this.anInt329 > 1) {
			this.anInt330 = Static63.method1144(4);
		}
		this.anIntArray13 = new int[this.anInt329];
		this.anIntArray14 = new int[this.anInt329];
		for (@Pc(42) int local42 = 0; local42 < this.anInt329; local42++) {
			Static63.method1144(8);
			this.anIntArray13[local42] = Static63.method1144(8);
			this.anIntArray14[local42] = Static63.method1144(8);
		}
	}
}
