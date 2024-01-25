import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dp")
public abstract class Class88 {

	@OriginalMember(owner = "client!dp", name = "e", descriptor = "I")
	public int anInt2140;

	@OriginalMember(owner = "client!dp", name = "c", descriptor = "I")
	public int anInt2143;

	@OriginalMember(owner = "client!dp", name = "f", descriptor = "I")
	public int anInt2146;

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(I)Z")
	public final boolean method1886() {
		return (this.anInt2140 & 0x8) != 0;
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(B)Z")
	public final boolean method1887() {
		return (this.anInt2140 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!dp", name = "b", descriptor = "(I)Z")
	public final boolean method1888() {
		return (this.anInt2140 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!dp", name = "b", descriptor = "(B)Z")
	public final boolean method1891() {
		return (this.anInt2140 & 0x2) != 0;
	}
}
