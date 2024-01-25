import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public abstract class Class91 {

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "I")
	public int anInt2651;

	@OriginalMember(owner = "client!lg", name = "e", descriptor = "I")
	public int anInt2654;

	@OriginalMember(owner = "client!lg", name = "i", descriptor = "I")
	public int anInt2658;

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)Z")
	public final boolean method2299() {
		return (this.anInt2651 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "(I)Z")
	public final boolean method2302() {
		return (this.anInt2651 & 0x8) != 0;
	}

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "(B)Z")
	public final boolean method2303() {
		return (this.anInt2651 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(Z)Z")
	public final boolean method2305() {
		return (this.anInt2651 & 0x1) != 0;
	}
}
