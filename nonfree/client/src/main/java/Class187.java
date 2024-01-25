import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ss")
public abstract class Class187 {

	@OriginalMember(owner = "client!ss", name = "d", descriptor = "I")
	public int anInt5938;

	@OriginalMember(owner = "client!ss", name = "i", descriptor = "I")
	public int anInt5942;

	@OriginalMember(owner = "client!ss", name = "o", descriptor = "I")
	public int anInt5948;

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(B)Z")
	public final boolean method5029() {
		return (this.anInt5938 & 0x8) != 0;
	}

	@OriginalMember(owner = "client!ss", name = "b", descriptor = "(I)Z")
	public final boolean method5031() {
		return (this.anInt5938 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ss", name = "d", descriptor = "(I)Z")
	public final boolean method5036() {
		return (this.anInt5938 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!ss", name = "e", descriptor = "(I)Z")
	public final boolean method5037() {
		return (this.anInt5938 & 0x2) != 0;
	}
}
