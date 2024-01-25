import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public abstract class Class78 {

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "I")
	public int anInt3874;

	@OriginalMember(owner = "client!gb", name = "d", descriptor = "I")
	public int anInt3877;

	@OriginalMember(owner = "client!gb", name = "e", descriptor = "I")
	public int anInt3878;

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Z)Z")
	public final boolean method3171() {
		return (this.anInt3874 & 0x8) != 0;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)Z")
	public final boolean method3172() {
		return (this.anInt3874 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(B)Z")
	public final boolean method3173() {
		return (this.anInt3874 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(I)Z")
	public final boolean method3174() {
		return (this.anInt3874 & 0x4) != 0;
	}
}
