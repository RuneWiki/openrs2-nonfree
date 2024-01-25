import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fr")
public final class Class128 {

	@OriginalMember(owner = "client!fr", name = "d", descriptor = "I")
	public final int anInt3053;

	@OriginalMember(owner = "client!fr", name = "c", descriptor = "I")
	public int anInt3052;

	@OriginalMember(owner = "client!fr", name = "b", descriptor = "[I")
	public final int[] anIntArray239;

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "[I")
	public final int[] anIntArray238;

	@OriginalMember(owner = "client!fr", name = "<init>", descriptor = "()V")
	public Class128() {
		Static115.method1668(16);
		this.anInt3053 = Static115.method1670() == 0 ? 1 : Static115.method1668(4) + 1;
		if (Static115.method1670() != 0) {
			Static115.method1668(8);
		}
		Static115.method1668(2);
		if (this.anInt3053 > 1) {
			this.anInt3052 = Static115.method1668(4);
		}
		this.anIntArray239 = new int[this.anInt3053];
		this.anIntArray238 = new int[this.anInt3053];
		for (@Pc(42) int local42 = 0; local42 < this.anInt3053; local42++) {
			Static115.method1668(8);
			this.anIntArray239[local42] = Static115.method1668(8);
			this.anIntArray238[local42] = Static115.method1668(8);
		}
	}
}
