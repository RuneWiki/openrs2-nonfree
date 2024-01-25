import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bu")
public abstract class Class38 {

	@OriginalMember(owner = "client!bu", name = "d", descriptor = "I")
	public int anInt5565;

	@OriginalMember(owner = "client!bu", name = "g", descriptor = "I")
	public int anInt5568;

	@OriginalMember(owner = "client!bu", name = "j", descriptor = "I")
	public int anInt5571;

	@OriginalMember(owner = "client!bu", name = "b", descriptor = "(I)Z")
	public final boolean method5110() {
		return (this.anInt5571 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(Z)Z")
	public final boolean method5112() {
		return (this.anInt5571 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(B)Z")
	public final boolean method5113() {
		return (this.anInt5571 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!bu", name = "d", descriptor = "(I)Z")
	public final boolean method5117() {
		return (this.anInt5571 & 0x8) != 0;
	}
}
