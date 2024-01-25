import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qv")
public abstract class Class133 {

	@OriginalMember(owner = "client!qv", name = "b", descriptor = "I")
	public int anInt4090;

	@OriginalMember(owner = "client!qv", name = "i", descriptor = "I")
	public int anInt4096;

	@OriginalMember(owner = "client!qv", name = "j", descriptor = "I")
	public int anInt4097;

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(I)Z")
	public final boolean method3641() {
		return (this.anInt4097 & 0x8) != 0;
	}

	@OriginalMember(owner = "client!qv", name = "b", descriptor = "(I)Z")
	public final boolean method3642() {
		return (this.anInt4097 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!qv", name = "c", descriptor = "(I)Z")
	public final boolean method3645() {
		return (this.anInt4097 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(Z)Z")
	public final boolean method3646() {
		return (this.anInt4097 & 0x1) != 0;
	}
}
