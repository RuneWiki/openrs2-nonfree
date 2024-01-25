import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public abstract class Class31 {

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "I")
	public int anInt10054;

	@OriginalMember(owner = "client!bc", name = "f", descriptor = "I")
	public int anInt10058;

	@OriginalMember(owner = "client!bc", name = "i", descriptor = "I")
	public int anInt10060;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(B)Z")
	public final boolean method8549() {
		return (this.anInt10058 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(I)Z")
	public final boolean method8550() {
		return (this.anInt10058 & 0x8) != 0;
	}

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "(I)Z")
	public final boolean method8551() {
		return (this.anInt10058 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!bc", name = "d", descriptor = "(I)Z")
	public final boolean method8552() {
		return (this.anInt10058 & 0x2) != 0;
	}
}
