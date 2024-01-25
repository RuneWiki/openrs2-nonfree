import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cm")
public final class Class38 {

	@OriginalMember(owner = "client!cm", name = "c", descriptor = "I")
	public final int anInt1109;

	@OriginalMember(owner = "client!cm", name = "b", descriptor = "I")
	public int anInt1108;

	@OriginalMember(owner = "client!cm", name = "d", descriptor = "[I")
	public final int[] anIntArray53;

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "[I")
	public final int[] anIntArray52;

	@OriginalMember(owner = "client!cm", name = "<init>", descriptor = "()V")
	public Class38() {
		Static143.method2666(16);
		this.anInt1109 = Static143.method2668() == 0 ? 1 : Static143.method2666(4) + 1;
		if (Static143.method2668() != 0) {
			Static143.method2666(8);
		}
		Static143.method2666(2);
		if (this.anInt1109 > 1) {
			this.anInt1108 = Static143.method2666(4);
		}
		this.anIntArray53 = new int[this.anInt1109];
		this.anIntArray52 = new int[this.anInt1109];
		for (@Pc(42) int local42 = 0; local42 < this.anInt1109; local42++) {
			Static143.method2666(8);
			this.anIntArray53[local42] = Static143.method2666(8);
			this.anIntArray52[local42] = Static143.method2666(8);
		}
	}
}
