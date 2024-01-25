import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public final class Class9 {

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "Ljava/lang/String;")
	public String aString1;

	@OriginalMember(owner = "client!ah", name = "l", descriptor = "I")
	public int anInt84;

	@OriginalMember(owner = "client!ah", name = "f", descriptor = "I")
	public int anInt80 = 443;

	@OriginalMember(owner = "client!ah", name = "g", descriptor = "Z")
	public boolean aBoolean2 = false;

	@OriginalMember(owner = "client!ah", name = "e", descriptor = "I")
	public int anInt79 = 43594;

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(BLclient!ah;)Z")
	public boolean method73(@OriginalArg(1) Class9 arg0) {
		if (arg0 == null) {
			return false;
		} else {
			return arg0.anInt84 == this.anInt84 && this.aString1.equals(arg0.aString1);
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(B)I")
	public int method74() {
		return this.aBoolean2 ? this.anInt80 : this.anInt79;
	}
}
