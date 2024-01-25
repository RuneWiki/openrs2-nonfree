import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rb")
public final class Class201 {

	@OriginalMember(owner = "client!rb", name = "d", descriptor = "I")
	public final int anInt5082;

	@OriginalMember(owner = "client!rb", name = "c", descriptor = "I")
	public int anInt5081;

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "[I")
	public final int[] anIntArray565;

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "[I")
	public final int[] anIntArray564;

	@OriginalMember(owner = "client!rb", name = "<init>", descriptor = "()V")
	public Class201() {
		Static87.method1447(16);
		this.anInt5082 = Static87.method1445() == 0 ? 1 : Static87.method1447(4) + 1;
		if (Static87.method1445() != 0) {
			Static87.method1447(8);
		}
		Static87.method1447(2);
		if (this.anInt5082 > 1) {
			this.anInt5081 = Static87.method1447(4);
		}
		this.anIntArray565 = new int[this.anInt5082];
		this.anIntArray564 = new int[this.anInt5082];
		for (@Pc(42) int local42 = 0; local42 < this.anInt5082; local42++) {
			Static87.method1447(8);
			this.anIntArray565[local42] = Static87.method1447(8);
			this.anIntArray564[local42] = Static87.method1447(8);
		}
	}
}
