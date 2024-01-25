import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!es")
public abstract class Class96 {

	@OriginalMember(owner = "client!es", name = "c", descriptor = "I")
	public int anInt3292;

	@OriginalMember(owner = "client!es", name = "d", descriptor = "I")
	public int anInt3293;

	@OriginalMember(owner = "client!es", name = "h", descriptor = "I")
	public int anInt3297;

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(I)Z")
	public final boolean method2969() {
		return (this.anInt3293 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(B)Z")
	public final boolean method2970() {
		return (this.anInt3293 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!es", name = "b", descriptor = "(B)Z")
	public final boolean method2971() {
		return (this.anInt3293 & 0x8) != 0;
	}

	@OriginalMember(owner = "client!es", name = "c", descriptor = "(B)Z")
	public final boolean method2972() {
		return (this.anInt3293 & 0x2) != 0;
	}
}
