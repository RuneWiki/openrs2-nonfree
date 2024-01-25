import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fu")
public final class Class77 {

	@OriginalMember(owner = "client!fu", name = "d", descriptor = "I")
	public final int anInt2529;

	@OriginalMember(owner = "client!fu", name = "b", descriptor = "I")
	public int anInt2528;

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "[I")
	public final int[] anIntArray171;

	@OriginalMember(owner = "client!fu", name = "c", descriptor = "[I")
	public final int[] anIntArray172;

	@OriginalMember(owner = "client!fu", name = "<init>", descriptor = "()V")
	public Class77() {
		Static68.method1314(16);
		this.anInt2529 = Static68.method1317() == 0 ? 1 : Static68.method1314(4) + 1;
		if (Static68.method1317() != 0) {
			Static68.method1314(8);
		}
		Static68.method1314(2);
		if (this.anInt2529 > 1) {
			this.anInt2528 = Static68.method1314(4);
		}
		this.anIntArray171 = new int[this.anInt2529];
		this.anIntArray172 = new int[this.anInt2529];
		for (@Pc(42) int local42 = 0; local42 < this.anInt2529; local42++) {
			Static68.method1314(8);
			this.anIntArray171[local42] = Static68.method1314(8);
			this.anIntArray172[local42] = Static68.method1314(8);
		}
	}
}
