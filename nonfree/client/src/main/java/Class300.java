import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sba")
public final class Class300 {

	@OriginalMember(owner = "client!sba", name = "g", descriptor = "I")
	public int anInt7993;

	@OriginalMember(owner = "client!sba", name = "i", descriptor = "Ljava/lang/String;")
	public String aString89;

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "Z")
	private boolean aBoolean552 = false;

	@OriginalMember(owner = "client!sba", name = "d", descriptor = "Z")
	private boolean aBoolean553 = false;

	@OriginalMember(owner = "client!sba", name = "h", descriptor = "I")
	public int anInt7994 = 443;

	@OriginalMember(owner = "client!sba", name = "j", descriptor = "I")
	public int anInt7995 = 43594;

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(Lclient!sba;I)Z")
	public boolean method6605(@OriginalArg(0) Class300 arg0) {
		if (arg0 == null) {
			return false;
		} else {
			return this.anInt7993 == arg0.anInt7993 && this.aString89.equals(arg0.aString89);
		}
	}

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(BLclient!ii;)Lclient!sa;")
	public Class299 method6606(@OriginalArg(1) Class161 arg0) {
		return arg0.method3820(this.aBoolean552 ? this.anInt7994 : this.anInt7995, this.aString89, this.aBoolean553);
	}

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(Z)V")
	public void method6607() {
		if (!this.aBoolean552) {
			this.aBoolean553 = true;
			this.aBoolean552 = true;
		} else if (this.aBoolean553) {
			this.aBoolean553 = false;
		} else {
			this.aBoolean552 = false;
		}
	}
}
