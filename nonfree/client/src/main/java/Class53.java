import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lb")
public final class Class53 {

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "I")
	public final int anInt2517;

	@OriginalMember(owner = "client!lb", name = "d", descriptor = "I")
	public int anInt2518;

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "[I")
	public final int[] anIntArray233;

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "[I")
	public final int[] anIntArray234;

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "()V")
	public Class53() {
		Static20.method364(16);
		this.anInt2517 = Static20.method366() == 0 ? 1 : Static20.method364(4) + 1;
		if (Static20.method366() != 0) {
			Static20.method364(8);
		}
		Static20.method364(2);
		if (this.anInt2517 > 1) {
			this.anInt2518 = Static20.method364(4);
		}
		this.anIntArray233 = new int[this.anInt2517];
		this.anIntArray234 = new int[this.anInt2517];
		for (@Pc(42) int local42 = 0; local42 < this.anInt2517; local42++) {
			Static20.method364(8);
			this.anIntArray233[local42] = Static20.method364(8);
			this.anIntArray234[local42] = Static20.method364(8);
		}
	}
}
