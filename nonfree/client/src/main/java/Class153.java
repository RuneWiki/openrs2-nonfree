import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public abstract class Class153 {

	@OriginalMember(owner = "client!lk", name = "f", descriptor = "I")
	public int anInt5570;

	@OriginalMember(owner = "client!lk", name = "j", descriptor = "I")
	public int anInt5573;

	@OriginalMember(owner = "client!lk", name = "l", descriptor = "I")
	public int anInt5574;

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(Z)Z")
	public final boolean method4753() {
		return (this.anInt5570 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!lk", name = "b", descriptor = "(I)Z")
	public final boolean method4754() {
		return (this.anInt5570 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!lk", name = "c", descriptor = "(I)Z")
	public final boolean method4755() {
		return (this.anInt5570 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(B)Z")
	public final boolean method4757() {
		return (this.anInt5570 & 0x8) != 0;
	}
}
