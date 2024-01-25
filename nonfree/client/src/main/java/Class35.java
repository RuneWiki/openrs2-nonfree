import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public abstract class Class35 {

	@OriginalMember(owner = "client!ce", name = "f", descriptor = "I")
	public int anInt5022;

	@OriginalMember(owner = "client!ce", name = "h", descriptor = "I")
	public int anInt5023;

	@OriginalMember(owner = "client!ce", name = "k", descriptor = "I")
	public int anInt5026;

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Z)Z")
	public final boolean method4501() {
		return (this.anInt5023 & 0x8) != 0;
	}

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "(I)Z")
	public final boolean method4505() {
		return (this.anInt5023 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)Z")
	public final boolean method4506() {
		return (this.anInt5023 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!ce", name = "d", descriptor = "(I)Z")
	public final boolean method4507() {
		return (this.anInt5023 & 0x1) != 0;
	}
}
