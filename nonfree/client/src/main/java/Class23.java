import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public abstract class Class23 {

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "I")
	public int anInt319;

	@OriginalMember(owner = "client!lm", name = "o", descriptor = "I")
	public int anInt328;

	@OriginalMember(owner = "client!lm", name = "p", descriptor = "I")
	public int anInt329;

	static {
		new Class57("Invalid name", "Unzulässiger Name!", "Nom incorrect", "Nome inválido");
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(Z)Z")
	public final boolean method301() {
		return (this.anInt319 & 0x8) != 0;
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(I)Z")
	public final boolean method303() {
		return (this.anInt319 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!lm", name = "c", descriptor = "(I)Z")
	public final boolean method307() {
		return (this.anInt319 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!lm", name = "d", descriptor = "(I)Z")
	public final boolean method308() {
		return (this.anInt319 & 0x2) != 0;
	}
}
