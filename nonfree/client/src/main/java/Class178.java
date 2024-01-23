import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uk")
public final class Class178 {

	@OriginalMember(owner = "client!uk", name = "d", descriptor = "I")
	public int anInt5490;

	@OriginalMember(owner = "client!uk", name = "c", descriptor = "I")
	public int anInt5489;

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "[I")
	public int[] anIntArray499;

	@OriginalMember(owner = "client!uk", name = "b", descriptor = "[I")
	public int[] anIntArray500;

	@OriginalMember(owner = "client!uk", name = "<init>", descriptor = "()V")
	public Class178() {
		Static32.method551(16);
		this.anInt5490 = Static32.method559() == 0 ? 1 : Static32.method551(4) + 1;
		if (Static32.method559() != 0) {
			Static32.method551(8);
		}
		Static32.method551(2);
		if (this.anInt5490 > 1) {
			this.anInt5489 = Static32.method551(4);
		}
		this.anIntArray499 = new int[this.anInt5490];
		this.anIntArray500 = new int[this.anInt5490];
		for (@Pc(42) int local42 = 0; local42 < this.anInt5490; local42++) {
			Static32.method551(8);
			this.anIntArray499[local42] = Static32.method551(8);
			this.anIntArray500[local42] = Static32.method551(8);
		}
	}
}
