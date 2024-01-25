import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kj")
public final class Class164 {

	@OriginalMember(owner = "client!kj", name = "b", descriptor = "I")
	public final int anInt4937;

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "I")
	public int anInt4936;

	@OriginalMember(owner = "client!kj", name = "d", descriptor = "[I")
	public final int[] anIntArray353;

	@OriginalMember(owner = "client!kj", name = "c", descriptor = "[I")
	public final int[] anIntArray352;

	@OriginalMember(owner = "client!kj", name = "<init>", descriptor = "()V")
	public Class164() {
		Static240.method4069(16);
		this.anInt4937 = Static240.method4067() == 0 ? 1 : Static240.method4069(4) + 1;
		if (Static240.method4067() != 0) {
			Static240.method4069(8);
		}
		Static240.method4069(2);
		if (this.anInt4937 > 1) {
			this.anInt4936 = Static240.method4069(4);
		}
		this.anIntArray353 = new int[this.anInt4937];
		this.anIntArray352 = new int[this.anInt4937];
		for (@Pc(42) int local42 = 0; local42 < this.anInt4937; local42++) {
			Static240.method4069(8);
			this.anIntArray353[local42] = Static240.method4069(8);
			this.anIntArray352[local42] = Static240.method4069(8);
		}
	}
}
