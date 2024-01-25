import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public final class Class124 {

	@OriginalMember(owner = "client!jm", name = "b", descriptor = "Ljava/lang/String;")
	public String aString37;

	@OriginalMember(owner = "client!jm", name = "d", descriptor = "I")
	public int anInt3453;

	@OriginalMember(owner = "client!jm", name = "e", descriptor = "Z")
	public boolean aBoolean208 = false;

	@OriginalMember(owner = "client!jm", name = "g", descriptor = "I")
	public int anInt3455 = 43594;

	@OriginalMember(owner = "client!jm", name = "f", descriptor = "I")
	public int anInt3454 = 443;

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(I)I")
	public int method2807() {
		return this.aBoolean208 ? this.anInt3454 : this.anInt3455;
	}
}
