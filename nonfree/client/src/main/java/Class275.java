import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public final class Class275 {

	@OriginalMember(owner = "client!pb", name = "f", descriptor = "I")
	public int anInt7235;

	@OriginalMember(owner = "client!pb", name = "h", descriptor = "Ljava/lang/String;")
	public String aString91;

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "Z")
	private boolean aBoolean515 = true;

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "I")
	public int anInt7232 = 443;

	@OriginalMember(owner = "client!pb", name = "g", descriptor = "Z")
	private boolean aBoolean516 = false;

	@OriginalMember(owner = "client!pb", name = "i", descriptor = "I")
	public int anInt7236 = 43594;

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)V")
	public void method6084() {
		if (!this.aBoolean515) {
			this.aBoolean515 = true;
			this.aBoolean516 = true;
		} else if (this.aBoolean516) {
			this.aBoolean516 = false;
		} else {
			this.aBoolean515 = false;
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lclient!ec;B)Lclient!th;")
	public Class338 method6086(@OriginalArg(0) Class92 arg0) {
		return arg0.method1873(this.aBoolean516, this.aBoolean515 ? this.anInt7232 : this.anInt7236, this.aString91);
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(ILclient!pb;)Z")
	public boolean method6088(@OriginalArg(1) Class275 arg0) {
		if (arg0 == null) {
			return false;
		} else {
			return arg0.anInt7235 == this.anInt7235 && this.aString91.equals(arg0.aString91);
		}
	}
}
