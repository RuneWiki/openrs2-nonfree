import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qu")
public abstract class Class208 {

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "I")
	public int anInt5554;

	@OriginalMember(owner = "client!qu", name = "b", descriptor = "I")
	public int anInt5555;

	@OriginalMember(owner = "client!qu", name = "g", descriptor = "I")
	public int anInt5559;

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(I)Z")
	public final boolean method4734() {
		return (this.anInt5554 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(B)Z")
	public final boolean method4735() {
		return (this.anInt5554 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!qu", name = "b", descriptor = "(I)Z")
	public final boolean method4736() {
		return (this.anInt5554 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!qu", name = "d", descriptor = "(I)Z")
	public final boolean method4738() {
		return (this.anInt5554 & 0x8) != 0;
	}
}
