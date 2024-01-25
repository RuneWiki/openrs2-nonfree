import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public abstract class Class6 {

	@OriginalMember(owner = "client!af", name = "a", descriptor = "I")
	public int anInt4501;

	@OriginalMember(owner = "client!af", name = "f", descriptor = "I")
	public int anInt4505;

	@OriginalMember(owner = "client!af", name = "j", descriptor = "I")
	public int anInt4508;

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(I)Z")
	public final boolean method4035() {
		return (this.anInt4501 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(Z)Z")
	public final boolean method4036() {
		return (this.anInt4501 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!af", name = "b", descriptor = "(I)Z")
	public final boolean method4037() {
		return (this.anInt4501 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(B)Z")
	public final boolean method4040() {
		return (this.anInt4501 & 0x8) != 0;
	}
}
