import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public abstract class Class362 {

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "I")
	public int anInt10274;

	@OriginalMember(owner = "client!vf", name = "g", descriptor = "I")
	public int anInt10277;

	@OriginalMember(owner = "client!vf", name = "h", descriptor = "I")
	public int anInt10278;

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "(I)Z")
	public final boolean method8738() {
		return (this.anInt10278 & 0x8) != 0;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(B)Z")
	public final boolean method8739() {
		return (this.anInt10278 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!vf", name = "c", descriptor = "(I)Z")
	public final boolean method8740() {
		return (this.anInt10278 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!vf", name = "d", descriptor = "(I)Z")
	public final boolean method8741() {
		return (this.anInt10278 & 0x2) != 0;
	}
}
