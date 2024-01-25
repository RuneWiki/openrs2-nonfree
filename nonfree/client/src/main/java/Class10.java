import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vn")
public abstract class Class10 {

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "I")
	public int anInt258;

	@OriginalMember(owner = "client!vn", name = "h", descriptor = "I")
	public int anInt264;

	@OriginalMember(owner = "client!vn", name = "i", descriptor = "I")
	public int anInt265;

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(I)Z")
	public final boolean method233() {
		return (this.anInt258 & 0x8) != 0;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(Z)Z")
	public final boolean method234() {
		return (this.anInt258 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!vn", name = "d", descriptor = "(I)Z")
	public final boolean method238() {
		return (this.anInt258 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(B)Z")
	public final boolean method239() {
		return (this.anInt258 & 0x1) != 0;
	}
}
