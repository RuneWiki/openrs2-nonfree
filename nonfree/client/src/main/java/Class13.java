import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public abstract class Class13 {

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "I")
	public int anInt3515;

	@OriginalMember(owner = "client!ba", name = "d", descriptor = "I")
	public int anInt3517;

	@OriginalMember(owner = "client!ba", name = "g", descriptor = "I")
	public int anInt3520;

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(B)Z")
	public final boolean method2744() {
		return (this.anInt3515 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "(I)Z")
	public final boolean method2746() {
		return (this.anInt3515 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!ba", name = "c", descriptor = "(I)Z")
	public final boolean method2747() {
		return (this.anInt3515 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "(B)Z")
	public final boolean method2748() {
		return (this.anInt3515 & 0x8) != 0;
	}
}
