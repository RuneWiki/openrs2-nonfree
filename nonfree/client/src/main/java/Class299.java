import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tv")
public abstract class Class299 {

	@OriginalMember(owner = "client!tv", name = "e", descriptor = "I")
	public int anInt8025;

	@OriginalMember(owner = "client!tv", name = "f", descriptor = "I")
	public int anInt8026;

	@OriginalMember(owner = "client!tv", name = "h", descriptor = "I")
	public int anInt8028;

	@OriginalMember(owner = "client!tv", name = "b", descriptor = "(I)Z")
	public final boolean method6530() {
		return (this.anInt8025 & 0x8) != 0;
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(Z)Z")
	public final boolean method6531() {
		return (this.anInt8025 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!tv", name = "c", descriptor = "(I)Z")
	public final boolean method6534() {
		return (this.anInt8025 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!tv", name = "b", descriptor = "(Z)Z")
	public final boolean method6535() {
		return (this.anInt8025 & 0x2) != 0;
	}
}
