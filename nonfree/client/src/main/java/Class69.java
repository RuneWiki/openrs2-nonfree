import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ds")
public abstract class Class69 {

	@OriginalMember(owner = "client!ds", name = "d", descriptor = "I")
	public int anInt4839;

	@OriginalMember(owner = "client!ds", name = "j", descriptor = "I")
	public int anInt4845;

	@OriginalMember(owner = "client!ds", name = "k", descriptor = "I")
	public int anInt4846;

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(I)Z")
	public final boolean method4080() {
		return (this.anInt4846 & 0x8) != 0;
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(Z)Z")
	public final boolean method4081() {
		return (this.anInt4846 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!ds", name = "b", descriptor = "(I)Z")
	public final boolean method4082() {
		return (this.anInt4846 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!ds", name = "b", descriptor = "(Z)Z")
	public final boolean method4087() {
		return (this.anInt4846 & 0x1) != 0;
	}
}
