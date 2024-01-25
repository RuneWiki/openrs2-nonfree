import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public abstract class Class256 {

	@OriginalMember(owner = "client!nj", name = "g", descriptor = "I")
	public int anInt7704;

	@OriginalMember(owner = "client!nj", name = "e", descriptor = "I")
	public int anInt7706;

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "I")
	public int anInt7707;

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)Z")
	public final boolean method6533() {
		return (this.anInt7704 & 0x8) != 0;
	}

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "(I)Z")
	public final boolean method6534() {
		return (this.anInt7704 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!nj", name = "c", descriptor = "(B)Z")
	public final boolean method6536() {
		return (this.anInt7704 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "(B)Z")
	public final boolean method6537() {
		return (this.anInt7704 & 0x1) != 0;
	}
}
