import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public abstract class Class103 {

	@OriginalMember(owner = "client!oc", name = "c", descriptor = "I")
	public int anInt3184;

	@OriginalMember(owner = "client!oc", name = "d", descriptor = "I")
	public int anInt3185;

	@OriginalMember(owner = "client!oc", name = "g", descriptor = "I")
	public int anInt3188;

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(B)Z")
	public final boolean method2359() {
		return (this.anInt3184 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)Z")
	public final boolean method2360() {
		return (this.anInt3184 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Z)Z")
	public final boolean method2361() {
		return (this.anInt3184 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!oc", name = "c", descriptor = "(I)Z")
	public final boolean method2364() {
		return (this.anInt3184 & 0x8) != 0;
	}
}
