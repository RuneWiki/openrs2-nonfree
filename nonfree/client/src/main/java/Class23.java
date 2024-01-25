import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public abstract class Class23 {

	@OriginalMember(owner = "client!bj", name = "c", descriptor = "I")
	public int anInt3266;

	@OriginalMember(owner = "client!bj", name = "d", descriptor = "I")
	public int anInt3267;

	@OriginalMember(owner = "client!bj", name = "f", descriptor = "I")
	public int anInt3268;

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)Z")
	public final boolean method2629() {
		return (this.anInt3268 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(B)Z")
	public final boolean method2630() {
		return (this.anInt3268 & 0x8) != 0;
	}

	@OriginalMember(owner = "client!bj", name = "b", descriptor = "(I)Z")
	public final boolean method2632() {
		return (this.anInt3268 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(Z)Z")
	public final boolean method2634() {
		return (this.anInt3268 & 0x2) != 0;
	}
}
