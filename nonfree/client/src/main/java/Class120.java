import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public abstract class Class120 {

	@OriginalMember(owner = "client!kl", name = "e", descriptor = "I")
	public int anInt5085;

	@OriginalMember(owner = "client!kl", name = "g", descriptor = "I")
	public int anInt5087;

	@OriginalMember(owner = "client!kl", name = "h", descriptor = "I")
	public int anInt5088;

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(B)Z")
	public final boolean method4319() {
		return (this.anInt5085 & 0x8) != 0;
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(I)Z")
	public final boolean method4321() {
		return (this.anInt5085 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!kl", name = "b", descriptor = "(B)Z")
	public final boolean method4322() {
		return (this.anInt5085 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!kl", name = "b", descriptor = "(I)Z")
	public final boolean method4323() {
		return (this.anInt5085 & 0x4) != 0;
	}
}
