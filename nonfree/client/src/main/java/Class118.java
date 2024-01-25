import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ih")
public final class Class118 {

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "I")
	public final int anInt3263;

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "I")
	public int anInt3264;

	@OriginalMember(owner = "client!ih", name = "d", descriptor = "[I")
	public final int[] anIntArray217;

	@OriginalMember(owner = "client!ih", name = "c", descriptor = "[I")
	public final int[] anIntArray216;

	@OriginalMember(owner = "client!ih", name = "<init>", descriptor = "()V")
	public Class118() {
		Static73.method1326(16);
		this.anInt3263 = Static73.method1327() == 0 ? 1 : Static73.method1326(4) + 1;
		if (Static73.method1327() != 0) {
			Static73.method1326(8);
		}
		Static73.method1326(2);
		if (this.anInt3263 > 1) {
			this.anInt3264 = Static73.method1326(4);
		}
		this.anIntArray217 = new int[this.anInt3263];
		this.anIntArray216 = new int[this.anInt3263];
		for (@Pc(42) int local42 = 0; local42 < this.anInt3263; local42++) {
			Static73.method1326(8);
			this.anIntArray217[local42] = Static73.method1326(8);
			this.anIntArray216[local42] = Static73.method1326(8);
		}
	}
}
