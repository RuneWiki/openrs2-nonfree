import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public abstract class Class67 {

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "I")
	public int anInt5763;

	@OriginalMember(owner = "client!dl", name = "b", descriptor = "I")
	public int anInt5764;

	@OriginalMember(owner = "client!dl", name = "d", descriptor = "I")
	public int anInt5765;

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)Z")
	public final boolean method4828() {
		return (this.anInt5764 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!dl", name = "b", descriptor = "(B)Z")
	public final boolean method4830() {
		return (this.anInt5764 & 0x8) != 0;
	}

	@OriginalMember(owner = "client!dl", name = "c", descriptor = "(B)Z")
	public final boolean method4831() {
		return (this.anInt5764 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(Z)Z")
	public final boolean method4832() {
		return (this.anInt5764 & 0x1) != 0;
	}
}
