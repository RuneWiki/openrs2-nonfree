import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tr")
public final class Class241 {

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "I")
	public int anInt6624;

	@OriginalMember(owner = "client!tr", name = "b", descriptor = "Ljava/lang/String;")
	public String aString61;

	@OriginalMember(owner = "client!tr", name = "e", descriptor = "I")
	public int anInt6626 = 43594;

	@OriginalMember(owner = "client!tr", name = "g", descriptor = "Z")
	public boolean aBoolean448 = false;

	@OriginalMember(owner = "client!tr", name = "j", descriptor = "I")
	public int anInt6630 = 443;

	@OriginalMember(owner = "client!tr", name = "b", descriptor = "(I)I")
	public int method5486() {
		return this.aBoolean448 ? this.anInt6630 : this.anInt6626;
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(ILclient!tr;)Z")
	public boolean method5488(@OriginalArg(1) Class241 arg0) {
		if (arg0 == null) {
			return false;
		} else {
			return arg0.anInt6624 == this.anInt6624 && this.aString61.equals(arg0.aString61);
		}
	}
}
