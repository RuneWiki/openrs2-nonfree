import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public abstract class Class53 {

	@OriginalMember(owner = "client!wk", name = "l", descriptor = "I")
	public int anInt1769;

	@OriginalMember(owner = "client!wk", name = "m", descriptor = "I")
	public int anInt1770;

	@OriginalMember(owner = "client!wk", name = "n", descriptor = "I")
	public int anInt1771;

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(B)Z")
	public final boolean method1370() {
		return (this.anInt1769 & 0x8) != 0;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(I)Z")
	public final boolean method1371() {
		return (this.anInt1769 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!wk", name = "c", descriptor = "(I)Z")
	public final boolean method1377() {
		return (this.anInt1769 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!wk", name = "d", descriptor = "(I)Z")
	public final boolean method1378() {
		return (this.anInt1769 & 0x1) != 0;
	}
}
