import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mo")
public abstract class Class51 {

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "I")
	public int anInt1504;

	@OriginalMember(owner = "client!mo", name = "e", descriptor = "I")
	public int anInt1506;

	@OriginalMember(owner = "client!mo", name = "h", descriptor = "I")
	public int anInt1509;

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(B)Z")
	public final boolean method1284() {
		return (this.anInt1504 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(I)Z")
	public final boolean method1285() {
		return (this.anInt1504 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!mo", name = "c", descriptor = "(B)Z")
	public final boolean method1287() {
		return (this.anInt1504 & 0x8) != 0;
	}

	@OriginalMember(owner = "client!mo", name = "b", descriptor = "(I)Z")
	public final boolean method1288() {
		return (this.anInt1504 & 0x2) != 0;
	}
}
