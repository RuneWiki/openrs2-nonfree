import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jd")
public final class Class39 {

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "I")
	public final int anInt1500;

	@OriginalMember(owner = "client!jd", name = "d", descriptor = "I")
	public int anInt1501;

	@OriginalMember(owner = "client!jd", name = "c", descriptor = "[I")
	public final int[] anIntArray149;

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "[I")
	public final int[] anIntArray148;

	@OriginalMember(owner = "client!jd", name = "<init>", descriptor = "()V")
	public Class39() {
		Static104.method1728(16);
		this.anInt1500 = Static104.method1720() == 0 ? 1 : Static104.method1728(4) + 1;
		if (Static104.method1720() != 0) {
			Static104.method1728(8);
		}
		Static104.method1728(2);
		if (this.anInt1500 > 1) {
			this.anInt1501 = Static104.method1728(4);
		}
		this.anIntArray149 = new int[this.anInt1500];
		this.anIntArray148 = new int[this.anInt1500];
		for (@Pc(42) int local42 = 0; local42 < this.anInt1500; local42++) {
			Static104.method1728(8);
			this.anIntArray149[local42] = Static104.method1728(8);
			this.anIntArray148[local42] = Static104.method1728(8);
		}
	}
}
