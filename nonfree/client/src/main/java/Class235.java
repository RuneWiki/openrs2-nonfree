import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!waa")
public abstract class Class235 {

	@OriginalMember(owner = "client!waa", name = "b", descriptor = "I")
	public int anInt6469;

	@OriginalMember(owner = "client!waa", name = "f", descriptor = "I")
	public int anInt6472;

	@OriginalMember(owner = "client!waa", name = "g", descriptor = "I")
	public int anInt6473;

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(B)Z")
	public final boolean method5479() {
		return (this.anInt6469 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(Z)Z")
	public final boolean method5480() {
		return (this.anInt6469 & 0x8) != 0;
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(I)Z")
	public final boolean method5482() {
		return (this.anInt6469 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!waa", name = "c", descriptor = "(I)Z")
	public final boolean method5484() {
		return (this.anInt6469 & 0x2) != 0;
	}
}
