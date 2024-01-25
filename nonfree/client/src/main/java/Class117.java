import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!io")
public abstract class Class117 {

	@OriginalMember(owner = "client!io", name = "b", descriptor = "I")
	public int anInt7348;

	@OriginalMember(owner = "client!io", name = "e", descriptor = "I")
	public int anInt7350;

	@OriginalMember(owner = "client!io", name = "h", descriptor = "I")
	public int anInt7353;

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(I)Z")
	public final boolean method5717() {
		return (this.anInt7350 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!io", name = "b", descriptor = "(I)Z")
	public final boolean method5718() {
		return (this.anInt7350 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(Z)Z")
	public final boolean method5719() {
		return (this.anInt7350 & 0x8) != 0;
	}

	@OriginalMember(owner = "client!io", name = "d", descriptor = "(I)Z")
	public final boolean method5721() {
		return (this.anInt7350 & 0x1) != 0;
	}
}
