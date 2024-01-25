import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public abstract class Class23 {

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "I")
	public int anInt5189;

	@OriginalMember(owner = "client!ba", name = "c", descriptor = "I")
	public int anInt5190;

	@OriginalMember(owner = "client!ba", name = "e", descriptor = "I")
	public int anInt5192;

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(B)Z")
	public final boolean method4349() {
		return (this.anInt5192 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)Z")
	public final boolean method4350() {
		return (this.anInt5192 & 0x8) != 0;
	}

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "(I)Z")
	public final boolean method4351() {
		return (this.anInt5192 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Z)Z")
	public final boolean method4352() {
		return (this.anInt5192 & 0x4) != 0;
	}
}
