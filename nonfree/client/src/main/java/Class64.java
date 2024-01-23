import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public abstract class Class64 {

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "I")
	public int anInt4583;

	@OriginalMember(owner = "client!ha", name = "g", descriptor = "I")
	public int anInt4587;

	@OriginalMember(owner = "client!ha", name = "j", descriptor = "I")
	public int anInt4589;

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)Z")
	public final boolean method3589() {
		return (this.anInt4583 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "(I)Z")
	public final boolean method3593() {
		return (this.anInt4583 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!ha", name = "d", descriptor = "(I)Z")
	public final boolean method3594() {
		return (this.anInt4583 & 0x8) != 0;
	}

	@OriginalMember(owner = "client!ha", name = "e", descriptor = "(I)Z")
	public final boolean method3596() {
		return (this.anInt4583 & 0x4) != 0;
	}
}
