import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public abstract class Class152 {

	@OriginalMember(owner = "client!le", name = "d", descriptor = "I")
	public int anInt5620;

	@OriginalMember(owner = "client!le", name = "g", descriptor = "I")
	public int anInt5622;

	@OriginalMember(owner = "client!le", name = "o", descriptor = "I")
	public int anInt5629;

	@OriginalMember(owner = "client!le", name = "b", descriptor = "(I)Z")
	public final boolean method4721() {
		return (this.anInt5620 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(B)Z")
	public final boolean method4722() {
		return (this.anInt5620 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Z)Z")
	public final boolean method4725() {
		return (this.anInt5620 & 0x8) != 0;
	}

	@OriginalMember(owner = "client!le", name = "d", descriptor = "(I)Z")
	public final boolean method4726() {
		return (this.anInt5620 & 0x1) != 0;
	}
}
