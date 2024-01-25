import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public final class Class147 {

	@OriginalMember(owner = "client!im", name = "b", descriptor = "I")
	public int anInt3691;

	@OriginalMember(owner = "client!im", name = "d", descriptor = "Ljava/lang/String;")
	public String aString55;

	@OriginalMember(owner = "client!im", name = "f", descriptor = "Z")
	private boolean aBoolean244 = false;

	@OriginalMember(owner = "client!im", name = "g", descriptor = "Z")
	private boolean aBoolean245 = false;

	@OriginalMember(owner = "client!im", name = "j", descriptor = "I")
	public int anInt3696 = 443;

	@OriginalMember(owner = "client!im", name = "e", descriptor = "I")
	public int anInt3693 = 43594;

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(I)V")
	public void method3179() {
		if (!this.aBoolean245) {
			this.aBoolean245 = true;
			this.aBoolean244 = true;
		} else if (this.aBoolean244) {
			this.aBoolean244 = false;
		} else {
			this.aBoolean245 = false;
		}
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(ILclient!im;)Z")
	public boolean method3180(@OriginalArg(1) Class147 arg0) {
		if (arg0 == null) {
			return false;
		} else {
			return arg0.anInt3691 == this.anInt3691 && this.aString55.equals(arg0.aString55);
		}
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(ILclient!cr;)Lclient!rp;")
	public Class278 method3182(@OriginalArg(1) Class57 arg0) {
		return arg0.method921(this.aBoolean244, this.aBoolean245 ? this.anInt3696 : this.anInt3693, this.aString55);
	}
}
