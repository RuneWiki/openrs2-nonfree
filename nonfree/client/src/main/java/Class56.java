import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cr")
public final class Class56 {

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "I")
	public int anInt1712;

	@OriginalMember(owner = "client!cr", name = "h", descriptor = "Ljava/lang/String;")
	public String aString17;

	@OriginalMember(owner = "client!cr", name = "b", descriptor = "Z")
	private boolean aBoolean117 = true;

	@OriginalMember(owner = "client!cr", name = "i", descriptor = "I")
	public int anInt1717 = 443;

	@OriginalMember(owner = "client!cr", name = "f", descriptor = "I")
	public int anInt1715 = 43594;

	@OriginalMember(owner = "client!cr", name = "n", descriptor = "Z")
	private boolean aBoolean119 = false;

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(I)V")
	public void method1429() {
		if (!this.aBoolean117) {
			this.aBoolean119 = true;
			this.aBoolean117 = true;
		} else if (this.aBoolean119) {
			this.aBoolean119 = false;
		} else {
			this.aBoolean117 = false;
		}
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(Lclient!ge;Z)Lclient!tj;")
	public Class328 method1431(@OriginalArg(0) Class112 arg0) {
		return arg0.method3228(this.aString17, this.aBoolean119, this.aBoolean117 ? this.anInt1717 : this.anInt1715);
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(ILclient!cr;)Z")
	public boolean method1432(@OriginalArg(1) Class56 arg0) {
		if (arg0 == null) {
			return false;
		} else {
			return arg0.anInt1712 == this.anInt1712 && this.aString17.equals(arg0.aString17);
		}
	}
}
