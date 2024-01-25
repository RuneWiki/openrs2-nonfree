import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public final class Class265 {

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "Ljava/lang/String;")
	public String aString199;

	@OriginalMember(owner = "client!wg", name = "g", descriptor = "I")
	public int anInt7137;

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "I")
	public int anInt7133 = 43594;

	@OriginalMember(owner = "client!wg", name = "k", descriptor = "Z")
	public boolean aBoolean518 = false;

	@OriginalMember(owner = "client!wg", name = "c", descriptor = "I")
	public int anInt7134 = 443;

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "(I)I")
	public int method5616() {
		return this.aBoolean518 ? this.anInt7134 : this.anInt7133;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lclient!wg;B)Z")
	public boolean method5617(@OriginalArg(0) Class265 arg0) {
		if (arg0 == null) {
			return false;
		} else {
			return this.anInt7137 == arg0.anInt7137 && this.aString199.equals(arg0.aString199);
		}
	}
}
