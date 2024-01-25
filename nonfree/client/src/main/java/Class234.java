import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public abstract class Class234 {

	@OriginalMember(owner = "client!nd", name = "d", descriptor = "I")
	public int anInt7085;

	@OriginalMember(owner = "client!nd", name = "e", descriptor = "I")
	public int anInt7086;

	@OriginalMember(owner = "client!nd", name = "j", descriptor = "I")
	public int anInt7091;

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)Z")
	public final boolean method6344() {
		return (this.anInt7086 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Z)Z")
	public final boolean method6345() {
		return (this.anInt7086 & 0x8) != 0;
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(I)Z")
	public final boolean method6347() {
		return (this.anInt7086 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(B)Z")
	public final boolean method6349() {
		return (this.anInt7086 & 0x4) != 0;
	}
}
