import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public abstract class Class74 {

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "I")
	public int anInt2254;

	@OriginalMember(owner = "client!wb", name = "d", descriptor = "I")
	public int anInt2255;

	@OriginalMember(owner = "client!wb", name = "j", descriptor = "I")
	public int anInt2260;

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)Z")
	public final boolean method2061() {
		return (this.anInt2255 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)Z")
	public final boolean method2062() {
		return (this.anInt2255 & 0x8) != 0;
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(B)Z")
	public final boolean method2063() {
		return (this.anInt2255 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "(I)Z")
	public final boolean method2065() {
		return (this.anInt2255 & 0x1) != 0;
	}
}
