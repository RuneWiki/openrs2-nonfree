import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jr")
public abstract class Class124 {

	@OriginalMember(owner = "client!jr", name = "d", descriptor = "I")
	public int anInt5496;

	@OriginalMember(owner = "client!jr", name = "h", descriptor = "I")
	public int anInt5499;

	@OriginalMember(owner = "client!jr", name = "k", descriptor = "I")
	public int anInt5502;

	static {
		new Class169(null, "bevor du die Option 'Regelverstoß melden' benutzt.", null, null);
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(I)Z")
	public final boolean method4748() {
		return (this.anInt5499 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!jr", name = "b", descriptor = "(I)Z")
	public final boolean method4749() {
		return (this.anInt5499 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!jr", name = "b", descriptor = "(B)Z")
	public final boolean method4750() {
		return (this.anInt5499 & 0x8) != 0;
	}

	@OriginalMember(owner = "client!jr", name = "d", descriptor = "(B)Z")
	public final boolean method4754() {
		return (this.anInt5499 & 0x1) != 0;
	}
}
