import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tu")
public abstract class Class239 {

	@OriginalMember(owner = "client!tu", name = "c", descriptor = "I")
	public int anInt6349;

	@OriginalMember(owner = "client!tu", name = "i", descriptor = "I")
	public int anInt6354;

	@OriginalMember(owner = "client!tu", name = "l", descriptor = "I")
	public int anInt6357;

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(Z)Z")
	public final boolean method5124() {
		return (this.anInt6357 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!tu", name = "c", descriptor = "(I)Z")
	public final boolean method5128() {
		return (this.anInt6357 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!tu", name = "b", descriptor = "(B)Z")
	public final boolean method5130() {
		return (this.anInt6357 & 0x8) != 0;
	}

	@OriginalMember(owner = "client!tu", name = "d", descriptor = "(I)Z")
	public final boolean method5131() {
		return (this.anInt6357 & 0x4) != 0;
	}
}
