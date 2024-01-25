import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!via")
public abstract class Class238 {

	@OriginalMember(owner = "client!via", name = "c", descriptor = "I")
	public int anInt6065;

	@OriginalMember(owner = "client!via", name = "g", descriptor = "I")
	public int anInt6068;

	@OriginalMember(owner = "client!via", name = "e", descriptor = "I")
	public int anInt6071;

	@OriginalMember(owner = "client!via", name = "c", descriptor = "(I)Z")
	public final boolean method5292() {
		return (this.anInt6068 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!via", name = "d", descriptor = "(I)Z")
	public final boolean method5293() {
		return (this.anInt6068 & 0x8) != 0;
	}

	@OriginalMember(owner = "client!via", name = "a", descriptor = "(Z)Z")
	public final boolean method5294() {
		return (this.anInt6068 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!via", name = "a", descriptor = "(I)Z")
	public final boolean method5297() {
		return (this.anInt6068 & 0x1) != 0;
	}
}
