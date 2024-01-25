import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fs")
public abstract class Class84 {

	@OriginalMember(owner = "client!fs", name = "b", descriptor = "I")
	public int anInt6822;

	@OriginalMember(owner = "client!fs", name = "g", descriptor = "I")
	public int anInt6827;

	@OriginalMember(owner = "client!fs", name = "h", descriptor = "I")
	public int anInt6828;

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(I)Z")
	public final boolean method5293() {
		return (this.anInt6822 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!fs", name = "b", descriptor = "(I)Z")
	public final boolean method5294() {
		return (this.anInt6822 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(B)Z")
	public final boolean method5295() {
		return (this.anInt6822 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!fs", name = "c", descriptor = "(I)Z")
	public final boolean method5299() {
		return (this.anInt6822 & 0x8) != 0;
	}
}
