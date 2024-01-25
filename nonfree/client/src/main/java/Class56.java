import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public abstract class Class56 {

	@OriginalMember(owner = "client!dk", name = "b", descriptor = "I")
	public int anInt4652;

	@OriginalMember(owner = "client!dk", name = "e", descriptor = "I")
	public int anInt4655;

	@OriginalMember(owner = "client!dk", name = "h", descriptor = "I")
	public int anInt4658;

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(Z)Z")
	public final boolean method3763() {
		return (this.anInt4658 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(B)Z")
	public final boolean method3765() {
		return (this.anInt4658 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!dk", name = "b", descriptor = "(I)Z")
	public final boolean method3766() {
		return (this.anInt4658 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!dk", name = "b", descriptor = "(B)Z")
	public final boolean method3767() {
		return (this.anInt4658 & 0x8) != 0;
	}
}
