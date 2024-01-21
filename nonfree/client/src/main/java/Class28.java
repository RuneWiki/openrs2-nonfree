import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ei")
public final class Class28 {

	@OriginalMember(owner = "client!ei", name = "c", descriptor = "I")
	public final int anInt1038;

	@OriginalMember(owner = "client!ei", name = "d", descriptor = "I")
	public int anInt1039;

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "[I")
	public final int[] anIntArray97;

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "[I")
	public final int[] anIntArray96;

	@OriginalMember(owner = "client!ei", name = "<init>", descriptor = "()V")
	public Class28() {
		Static20.method314(16);
		this.anInt1038 = Static20.method316() == 0 ? 1 : Static20.method314(4) + 1;
		if (Static20.method316() != 0) {
			Static20.method314(8);
		}
		Static20.method314(2);
		if (this.anInt1038 > 1) {
			this.anInt1039 = Static20.method314(4);
		}
		this.anIntArray97 = new int[this.anInt1038];
		this.anIntArray96 = new int[this.anInt1038];
		for (@Pc(42) int local42 = 0; local42 < this.anInt1038; local42++) {
			Static20.method314(8);
			this.anIntArray97[local42] = Static20.method314(8);
			this.anIntArray96[local42] = Static20.method314(8);
		}
	}
}
