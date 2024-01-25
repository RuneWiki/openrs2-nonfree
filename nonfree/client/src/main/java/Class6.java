import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public abstract class Class6 {

	@OriginalMember(owner = "client!jd", name = "d", descriptor = "I")
	public int anInt76;

	@OriginalMember(owner = "client!jd", name = "i", descriptor = "I")
	public int anInt81;

	@OriginalMember(owner = "client!jd", name = "j", descriptor = "I")
	public int anInt82;

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(B)Z")
	public final boolean method81() {
		return (this.anInt81 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(I)Z")
	public final boolean method84() {
		return (this.anInt81 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!jd", name = "c", descriptor = "(B)Z")
	public final boolean method85() {
		return (this.anInt81 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Z)Z")
	public final boolean method86() {
		return (this.anInt81 & 0x8) != 0;
	}
}
