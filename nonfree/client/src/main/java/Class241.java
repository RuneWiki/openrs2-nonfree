import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uh")
public final class Class241 {

	@OriginalMember(owner = "client!uh", name = "b", descriptor = "I")
	public final int anInt6856;

	@OriginalMember(owner = "client!uh", name = "c", descriptor = "I")
	public int anInt6857;

	@OriginalMember(owner = "client!uh", name = "d", descriptor = "[I")
	public final int[] anIntArray607;

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "[I")
	public final int[] anIntArray606;

	@OriginalMember(owner = "client!uh", name = "<init>", descriptor = "()V")
	public Class241() {
		Static432.method5548(16);
		this.anInt6856 = Static432.method5554() == 0 ? 1 : Static432.method5548(4) + 1;
		if (Static432.method5554() != 0) {
			Static432.method5548(8);
		}
		Static432.method5548(2);
		if (this.anInt6856 > 1) {
			this.anInt6857 = Static432.method5548(4);
		}
		this.anIntArray607 = new int[this.anInt6856];
		this.anIntArray606 = new int[this.anInt6856];
		for (@Pc(42) int local42 = 0; local42 < this.anInt6856; local42++) {
			Static432.method5548(8);
			this.anIntArray607[local42] = Static432.method5548(8);
			this.anIntArray606[local42] = Static432.method5548(8);
		}
	}
}
