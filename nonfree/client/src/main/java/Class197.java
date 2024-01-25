import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ud")
public final class Class197 {

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "I")
	public final int anInt6170;

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "I")
	public int anInt6171;

	@OriginalMember(owner = "client!ud", name = "c", descriptor = "[I")
	public final int[] anIntArray509;

	@OriginalMember(owner = "client!ud", name = "d", descriptor = "[I")
	public final int[] anIntArray510;

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "()V")
	public Class197() {
		Static127.method1939(16);
		this.anInt6170 = Static127.method1940() == 0 ? 1 : Static127.method1939(4) + 1;
		if (Static127.method1940() != 0) {
			Static127.method1939(8);
		}
		Static127.method1939(2);
		if (this.anInt6170 > 1) {
			this.anInt6171 = Static127.method1939(4);
		}
		this.anIntArray509 = new int[this.anInt6170];
		this.anIntArray510 = new int[this.anInt6170];
		for (@Pc(42) int local42 = 0; local42 < this.anInt6170; local42++) {
			Static127.method1939(8);
			this.anIntArray509[local42] = Static127.method1939(8);
			this.anIntArray510[local42] = Static127.method1939(8);
		}
	}
}
