import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public abstract class Class116 {

	@OriginalMember(owner = "client!id", name = "e", descriptor = "I")
	public int anInt3890;

	@OriginalMember(owner = "client!id", name = "g", descriptor = "I")
	public int anInt3892;

	@OriginalMember(owner = "client!id", name = "h", descriptor = "I")
	public int anInt3893;

	@OriginalMember(owner = "client!id", name = "b", descriptor = "(I)Z")
	public final boolean method3467() {
		return (this.anInt3892 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!id", name = "c", descriptor = "(I)Z")
	public final boolean method3469() {
		return (this.anInt3892 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(B)Z")
	public final boolean method3470() {
		return (this.anInt3892 & 0x8) != 0;
	}

	@OriginalMember(owner = "client!id", name = "d", descriptor = "(I)Z")
	public final boolean method3471() {
		return (this.anInt3892 & 0x1) != 0;
	}
}
