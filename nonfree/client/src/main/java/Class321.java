import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!th")
public final class Class321 {

	@OriginalMember(owner = "client!th", name = "d", descriptor = "I")
	public final int anInt8067;

	@OriginalMember(owner = "client!th", name = "b", descriptor = "I")
	public int anInt8066;

	@OriginalMember(owner = "client!th", name = "c", descriptor = "[I")
	public final int[] anIntArray619;

	@OriginalMember(owner = "client!th", name = "a", descriptor = "[I")
	public final int[] anIntArray618;

	@OriginalMember(owner = "client!th", name = "<init>", descriptor = "()V")
	public Class321() {
		Static362.method5447(16);
		this.anInt8067 = Static362.method5449() == 0 ? 1 : Static362.method5447(4) + 1;
		if (Static362.method5449() != 0) {
			Static362.method5447(8);
		}
		Static362.method5447(2);
		if (this.anInt8067 > 1) {
			this.anInt8066 = Static362.method5447(4);
		}
		this.anIntArray619 = new int[this.anInt8067];
		this.anIntArray618 = new int[this.anInt8067];
		for (@Pc(42) int local42 = 0; local42 < this.anInt8067; local42++) {
			Static362.method5447(8);
			this.anIntArray619[local42] = Static362.method5447(8);
			this.anIntArray618[local42] = Static362.method5447(8);
		}
	}
}
