import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lp")
public abstract class Class185 {

	@OriginalMember(owner = "client!lp", name = "b", descriptor = "I")
	public int anInt7758;

	@OriginalMember(owner = "client!lp", name = "e", descriptor = "I")
	public int anInt7761;

	@OriginalMember(owner = "client!lp", name = "h", descriptor = "I")
	public int anInt7763;

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(I)Z")
	public final boolean method6463() {
		return (this.anInt7761 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!lp", name = "b", descriptor = "(I)Z")
	public final boolean method6466() {
		return (this.anInt7761 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!lp", name = "c", descriptor = "(I)Z")
	public final boolean method6467() {
		return (this.anInt7761 & 0x8) != 0;
	}

	@OriginalMember(owner = "client!lp", name = "d", descriptor = "(I)Z")
	public final boolean method6468() {
		return (this.anInt7761 & 0x1) != 0;
	}
}
