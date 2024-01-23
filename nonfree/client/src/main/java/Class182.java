import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public abstract class Class182 {

	@OriginalMember(owner = "client!wb", name = "d", descriptor = "I")
	public int anInt5529;

	@OriginalMember(owner = "client!wb", name = "f", descriptor = "I")
	public int anInt5530;

	@OriginalMember(owner = "client!wb", name = "i", descriptor = "I")
	public int anInt5533;

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)Z")
	public final boolean method4340() {
		return (this.anInt5530 & 0x8) != 0;
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(I)Z")
	public final boolean method4341() {
		return (this.anInt5530 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)Z")
	public final boolean method4342() {
		return (this.anInt5530 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Z)Z")
	public final boolean method4344() {
		return (this.anInt5530 & 0x1) != 0;
	}
}
