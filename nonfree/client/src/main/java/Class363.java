import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vs")
public final class Class363 {

	@OriginalMember(owner = "client!vs", name = "i", descriptor = "Ljava/lang/String;")
	public String aString109;

	@OriginalMember(owner = "client!vs", name = "m", descriptor = "I")
	public int anInt9891;

	@OriginalMember(owner = "client!vs", name = "b", descriptor = "Z")
	private boolean aBoolean713 = false;

	@OriginalMember(owner = "client!vs", name = "e", descriptor = "I")
	public int anInt9884 = 43594;

	@OriginalMember(owner = "client!vs", name = "d", descriptor = "Z")
	private boolean aBoolean714 = true;

	@OriginalMember(owner = "client!vs", name = "l", descriptor = "I")
	public int anInt9890 = 443;

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(Lclient!vs;I)Z")
	public boolean method8467(@OriginalArg(0) Class363 arg0) {
		if (arg0 == null) {
			return false;
		} else {
			return this.anInt9891 == arg0.anInt9891 && this.aString109.equals(arg0.aString109);
		}
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(B)V")
	public void method8469() {
		if (!this.aBoolean714) {
			this.aBoolean714 = true;
			this.aBoolean713 = true;
		} else if (this.aBoolean713) {
			this.aBoolean713 = false;
		} else {
			this.aBoolean714 = false;
		}
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(Lclient!hga;B)Lclient!sca;")
	public Class304 method8471(@OriginalArg(0) Class138 arg0) {
		return arg0.method3588(this.aBoolean713, this.aString109, this.aBoolean714 ? this.anInt9890 : this.anInt9884);
	}
}
