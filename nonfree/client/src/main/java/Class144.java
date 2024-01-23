import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qe")
public final class Class144 {

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "I")
	public int anInt4207;

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "I")
	public int anInt4208;

	@OriginalMember(owner = "client!qe", name = "d", descriptor = "[I")
	public int[] anIntArray356;

	@OriginalMember(owner = "client!qe", name = "c", descriptor = "[I")
	public int[] anIntArray355;

	@OriginalMember(owner = "client!qe", name = "<init>", descriptor = "()V")
	public Class144() {
		Static265.method4171(16);
		this.anInt4207 = Static265.method4173() == 0 ? 1 : Static265.method4171(4) + 1;
		if (Static265.method4173() != 0) {
			Static265.method4171(8);
		}
		Static265.method4171(2);
		if (this.anInt4207 > 1) {
			this.anInt4208 = Static265.method4171(4);
		}
		this.anIntArray356 = new int[this.anInt4207];
		this.anIntArray355 = new int[this.anInt4207];
		for (@Pc(42) int local42 = 0; local42 < this.anInt4207; local42++) {
			Static265.method4171(8);
			this.anIntArray356[local42] = Static265.method4171(8);
			this.anIntArray355[local42] = Static265.method4171(8);
		}
	}
}
