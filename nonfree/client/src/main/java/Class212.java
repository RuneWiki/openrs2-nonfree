import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!le")
public final class Class212 {

	@OriginalMember(owner = "client!le", name = "b", descriptor = "I")
	public final int anInt5953;

	@OriginalMember(owner = "client!le", name = "a", descriptor = "I")
	public int anInt5952;

	@OriginalMember(owner = "client!le", name = "c", descriptor = "[I")
	public final int[] anIntArray330;

	@OriginalMember(owner = "client!le", name = "d", descriptor = "[I")
	public final int[] anIntArray329;

	@OriginalMember(owner = "client!le", name = "<init>", descriptor = "()V")
	public Class212() {
		Static406.method5947(16);
		this.anInt5953 = Static406.method5956() == 0 ? 1 : Static406.method5947(4) + 1;
		if (Static406.method5956() != 0) {
			Static406.method5947(8);
		}
		Static406.method5947(2);
		if (this.anInt5953 > 1) {
			this.anInt5952 = Static406.method5947(4);
		}
		this.anIntArray330 = new int[this.anInt5953];
		this.anIntArray329 = new int[this.anInt5953];
		for (@Pc(42) int local42 = 0; local42 < this.anInt5953; local42++) {
			Static406.method5947(8);
			this.anIntArray330[local42] = Static406.method5947(8);
			this.anIntArray329[local42] = Static406.method5947(8);
		}
	}
}
