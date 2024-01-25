import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sc")
public final class Class289 {

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "I")
	public final int anInt7798;

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "I")
	public int anInt7799;

	@OriginalMember(owner = "client!sc", name = "d", descriptor = "[I")
	public final int[] anIntArray620;

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "[I")
	public final int[] anIntArray619;

	@OriginalMember(owner = "client!sc", name = "<init>", descriptor = "()V")
	public Class289() {
		Static531.method7392(16);
		this.anInt7798 = Static531.method7397() == 0 ? 1 : Static531.method7392(4) + 1;
		if (Static531.method7397() != 0) {
			Static531.method7392(8);
		}
		Static531.method7392(2);
		if (this.anInt7798 > 1) {
			this.anInt7799 = Static531.method7392(4);
		}
		this.anIntArray620 = new int[this.anInt7798];
		this.anIntArray619 = new int[this.anInt7798];
		for (@Pc(42) int local42 = 0; local42 < this.anInt7798; local42++) {
			Static531.method7392(8);
			this.anIntArray620[local42] = Static531.method7392(8);
			this.anIntArray619[local42] = Static531.method7392(8);
		}
	}
}
