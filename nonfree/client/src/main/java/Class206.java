import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mr")
public abstract class Class206 {

	@OriginalMember(owner = "client!mr", name = "f", descriptor = "I")
	public int anInt6899;

	@OriginalMember(owner = "client!mr", name = "j", descriptor = "I")
	public int anInt6902;

	@OriginalMember(owner = "client!mr", name = "m", descriptor = "I")
	public int anInt6905;

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(Z)Z")
	public final boolean method5894() {
		return (this.anInt6902 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!mr", name = "b", descriptor = "(I)Z")
	public final boolean method5896() {
		return (this.anInt6902 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!mr", name = "d", descriptor = "(I)Z")
	public final boolean method5898() {
		return (this.anInt6902 & 0x8) != 0;
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(B)Z")
	public final boolean method5901() {
		return (this.anInt6902 & 0x2) != 0;
	}
}
