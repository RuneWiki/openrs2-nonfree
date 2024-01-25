import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rba")
public final class Class292 {

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "I")
	public int anInt7261;

	@OriginalMember(owner = "client!rba", name = "f", descriptor = "Ljava/lang/String;")
	public String aString111;

	@OriginalMember(owner = "client!rba", name = "e", descriptor = "I")
	public int anInt7263 = 43594;

	@OriginalMember(owner = "client!rba", name = "g", descriptor = "I")
	public int anInt7264 = 443;

	@OriginalMember(owner = "client!rba", name = "l", descriptor = "Z")
	private boolean aBoolean608 = false;

	@OriginalMember(owner = "client!rba", name = "b", descriptor = "Z")
	private boolean aBoolean607 = false;

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(I)V")
	public void method5908() {
		if (!this.aBoolean608) {
			this.aBoolean607 = true;
			this.aBoolean608 = true;
		} else if (this.aBoolean607) {
			this.aBoolean607 = false;
		} else {
			this.aBoolean608 = false;
		}
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(Lclient!rba;B)Z")
	public boolean method5909(@OriginalArg(0) Class292 arg0) {
		if (arg0 == null) {
			return false;
		} else {
			return this.anInt7261 == arg0.anInt7261 && this.aString111.equals(arg0.aString111);
		}
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(ILclient!ew;)Lclient!ae;")
	public Class5 method5912(@OriginalArg(1) Class99 arg0) {
		return arg0.method1791(this.aBoolean608 ? this.anInt7264 : this.anInt7263, this.aBoolean607, this.aString111);
	}
}
