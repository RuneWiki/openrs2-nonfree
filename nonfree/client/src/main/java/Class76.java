import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ua")
public final class Class76 {

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "I")
	public final int anInt2654;

	@OriginalMember(owner = "client!ua", name = "d", descriptor = "I")
	public int anInt2655;

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "[I")
	public final int[] anIntArray364;

	@OriginalMember(owner = "client!ua", name = "c", descriptor = "[I")
	public final int[] anIntArray365;

	@OriginalMember(owner = "client!ua", name = "<init>", descriptor = "()V")
	public Class76() {
		Static12.method201(16);
		this.anInt2654 = Static12.method202() == 0 ? 1 : Static12.method201(4) + 1;
		if (Static12.method202() != 0) {
			Static12.method201(8);
		}
		Static12.method201(2);
		if (this.anInt2654 > 1) {
			this.anInt2655 = Static12.method201(4);
		}
		this.anIntArray364 = new int[this.anInt2654];
		this.anIntArray365 = new int[this.anInt2654];
		for (@Pc(42) int local42 = 0; local42 < this.anInt2654; local42++) {
			Static12.method201(8);
			this.anIntArray364[local42] = Static12.method201(8);
			this.anIntArray365[local42] = Static12.method201(8);
		}
	}
}
