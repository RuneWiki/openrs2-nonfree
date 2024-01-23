import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!co")
public abstract class Class29 {

	@OriginalMember(owner = "client!co", name = "d", descriptor = "I")
	public int anInt5326;

	@OriginalMember(owner = "client!co", name = "j", descriptor = "I")
	public int anInt5331;

	@OriginalMember(owner = "client!co", name = "o", descriptor = "I")
	public int anInt5336;

	@OriginalMember(owner = "client!co", name = "b", descriptor = "(I)Z")
	public final boolean method4538() {
		return (this.anInt5331 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!co", name = "c", descriptor = "(I)Z")
	public final boolean method4539() {
		return (this.anInt5331 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!co", name = "d", descriptor = "(I)Z")
	public final boolean method4541() {
		return (this.anInt5331 & 0x8) != 0;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(Z)Z")
	public final boolean method4542() {
		return (this.anInt5331 & 0x1) != 0;
	}
}
