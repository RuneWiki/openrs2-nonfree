import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public abstract class Class354 {

	@OriginalMember(owner = "client!wk", name = "f", descriptor = "I")
	public int anInt9770;

	@OriginalMember(owner = "client!wk", name = "j", descriptor = "I")
	public int anInt9771;

	@OriginalMember(owner = "client!wk", name = "m", descriptor = "I")
	public int anInt9772;

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(B)Z")
	public final boolean method8305() {
		return (this.anInt9771 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(I)Z")
	public final boolean method8306() {
		return (this.anInt9771 & 0x8) != 0;
	}

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "(I)Z")
	public final boolean method8307() {
		return (this.anInt9771 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(Z)Z")
	public final boolean method8308() {
		return (this.anInt9771 & 0x2) != 0;
	}
}
