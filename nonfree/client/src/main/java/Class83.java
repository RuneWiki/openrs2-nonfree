import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public abstract class Class83 {

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "I")
	public int anInt3237;

	@OriginalMember(owner = "client!gk", name = "i", descriptor = "I")
	public int anInt3243;

	@OriginalMember(owner = "client!gk", name = "k", descriptor = "I")
	public int anInt3245;

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(B)Z")
	public final boolean method2832() {
		return (this.anInt3245 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(Z)Z")
	public final boolean method2835() {
		return (this.anInt3245 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "(Z)Z")
	public final boolean method2837() {
		return (this.anInt3245 & 0x8) != 0;
	}

	@OriginalMember(owner = "client!gk", name = "c", descriptor = "(Z)Z")
	public final boolean method2838() {
		return (this.anInt3245 & 0x2) != 0;
	}
}
