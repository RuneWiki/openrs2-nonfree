import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ss")
public abstract class Class135 {

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "I")
	public int anInt4027;

	@OriginalMember(owner = "client!ss", name = "d", descriptor = "I")
	public int anInt4030;

	@OriginalMember(owner = "client!ss", name = "k", descriptor = "I")
	public int anInt4035;

	@OriginalMember(owner = "client!ss", name = "b", descriptor = "(I)Z")
	public final boolean method3728() {
		return (this.anInt4035 & 0x8) != 0;
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(Z)Z")
	public final boolean method3729() {
		return (this.anInt4035 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(B)Z")
	public final boolean method3730() {
		return (this.anInt4035 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!ss", name = "b", descriptor = "(B)Z")
	public final boolean method3731() {
		return (this.anInt4035 & 0x1) != 0;
	}
}
