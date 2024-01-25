import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oaa")
public abstract class Class248 {

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "I")
	public int anInt8293;

	@OriginalMember(owner = "client!oaa", name = "d", descriptor = "I")
	public int anInt8296;

	@OriginalMember(owner = "client!oaa", name = "e", descriptor = "I")
	public int anInt8297;

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(B)Z")
	public final boolean method6704() {
		return (this.anInt8296 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(I)Z")
	public final boolean method6705() {
		return (this.anInt8296 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!oaa", name = "b", descriptor = "(I)Z")
	public final boolean method6706() {
		return (this.anInt8296 & 0x8) != 0;
	}

	@OriginalMember(owner = "client!oaa", name = "c", descriptor = "(I)Z")
	public final boolean method6708() {
		return (this.anInt8296 & 0x4) != 0;
	}
}
