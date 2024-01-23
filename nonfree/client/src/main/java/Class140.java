import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public abstract class Class140 {

	@OriginalMember(owner = "client!rk", name = "b", descriptor = "I")
	public int anInt5446;

	@OriginalMember(owner = "client!rk", name = "g", descriptor = "I")
	public int anInt5451;

	@OriginalMember(owner = "client!rk", name = "n", descriptor = "I")
	public int anInt5454;

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(B)Z")
	public final boolean method4266() {
		return (this.anInt5451 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!rk", name = "b", descriptor = "(I)Z")
	public final boolean method4268() {
		return (this.anInt5451 & 0x8) != 0;
	}

	@OriginalMember(owner = "client!rk", name = "c", descriptor = "(I)Z")
	public final boolean method4269() {
		return (this.anInt5451 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!rk", name = "b", descriptor = "(B)Z")
	public final boolean method4270() {
		return (this.anInt5451 & 0x2) != 0;
	}
}
