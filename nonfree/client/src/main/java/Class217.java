import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public final class Class217 {

	@OriginalMember(owner = "client!l", name = "a", descriptor = "Ljava/lang/String;")
	public String aString60;

	@OriginalMember(owner = "client!l", name = "n", descriptor = "I")
	public int anInt5392;

	@OriginalMember(owner = "client!l", name = "f", descriptor = "I")
	public int anInt5393;

	@OriginalMember(owner = "client!l", name = "c", descriptor = "I")
	public int anInt5395;

	@OriginalMember(owner = "client!l", name = "g", descriptor = "I")
	public int anInt5401;

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(B)I")
	public int method4844() {
		return this.anInt5401;
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(B)I")
	public int method4846() {
		return this.anInt5393;
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(I)I")
	public int method4848() {
		return this.anInt5392;
	}

	@OriginalMember(owner = "client!l", name = "d", descriptor = "(I)I")
	public int method4849() {
		return this.anInt5395;
	}

	@OriginalMember(owner = "client!l", name = "c", descriptor = "(I)Ljava/lang/String;")
	public String method4850() {
		return this.aString60;
	}
}
