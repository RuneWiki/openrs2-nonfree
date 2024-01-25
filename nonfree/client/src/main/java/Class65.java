import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public abstract class Class65 {

	@OriginalMember(owner = "client!ue", name = "c", descriptor = "I")
	public int anInt1472;

	@OriginalMember(owner = "client!ue", name = "h", descriptor = "I")
	public int anInt1477;

	@OriginalMember(owner = "client!ue", name = "l", descriptor = "I")
	public int anInt1480;

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(B)Z")
	public final boolean method1352() {
		return (this.anInt1477 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)Z")
	public final boolean method1358() {
		return (this.anInt1477 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!ue", name = "c", descriptor = "(B)Z")
	public final boolean method1360() {
		return (this.anInt1477 & 0x8) != 0;
	}

	@OriginalMember(owner = "client!ue", name = "d", descriptor = "(B)Z")
	public final boolean method1362() {
		return (this.anInt1477 & 0x1) != 0;
	}
}
