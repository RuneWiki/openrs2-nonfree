import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tca")
public abstract class Class180 {

	@OriginalMember(owner = "client!tca", name = "h", descriptor = "I")
	public int anInt4547;

	@OriginalMember(owner = "client!tca", name = "c", descriptor = "I")
	public int anInt4548;

	@OriginalMember(owner = "client!tca", name = "b", descriptor = "I")
	public int anInt4551;

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(B)Z")
	public final boolean method3867() {
		return (this.anInt4551 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!tca", name = "d", descriptor = "(I)Z")
	public final boolean method3868() {
		return (this.anInt4551 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(I)Z")
	public final boolean method3870() {
		return (this.anInt4551 & 0x8) != 0;
	}

	@OriginalMember(owner = "client!tca", name = "c", descriptor = "(I)Z")
	public final boolean method3871() {
		return (this.anInt4551 & 0x4) != 0;
	}
}
