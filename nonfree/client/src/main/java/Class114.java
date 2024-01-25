import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public abstract class Class114 {

	@OriginalMember(owner = "client!in", name = "a", descriptor = "I")
	public int anInt2752;

	@OriginalMember(owner = "client!in", name = "c", descriptor = "I")
	public int anInt2754;

	@OriginalMember(owner = "client!in", name = "i", descriptor = "I")
	public int anInt2758;

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(I)Z")
	public final boolean method2291() {
		return (this.anInt2752 & 0x8) != 0;
	}

	@OriginalMember(owner = "client!in", name = "b", descriptor = "(I)Z")
	public final boolean method2292() {
		return (this.anInt2752 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!in", name = "c", descriptor = "(I)Z")
	public final boolean method2293() {
		return (this.anInt2752 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!in", name = "b", descriptor = "(B)Z")
	public final boolean method2295() {
		return (this.anInt2752 & 0x4) != 0;
	}
}
