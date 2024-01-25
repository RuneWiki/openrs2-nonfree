import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lw")
public abstract class Class202 {

	@OriginalMember(owner = "client!lw", name = "b", descriptor = "I")
	public int anInt5716;

	@OriginalMember(owner = "client!lw", name = "f", descriptor = "I")
	public int anInt5719;

	@OriginalMember(owner = "client!lw", name = "i", descriptor = "I")
	public int anInt5722;

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(I)Z")
	public final boolean method4770() {
		return (this.anInt5716 & 0x8) != 0;
	}

	@OriginalMember(owner = "client!lw", name = "b", descriptor = "(I)Z")
	public final boolean method4772() {
		return (this.anInt5716 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!lw", name = "c", descriptor = "(I)Z")
	public final boolean method4773() {
		return (this.anInt5716 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!lw", name = "d", descriptor = "(I)Z")
	public final boolean method4775() {
		return (this.anInt5716 & 0x4) != 0;
	}
}
