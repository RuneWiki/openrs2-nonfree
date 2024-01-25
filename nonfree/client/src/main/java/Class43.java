import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bma")
public final class Class43 {

	@OriginalMember(owner = "client!bma", name = "c", descriptor = "Ljava/lang/String;")
	public String aString20;

	@OriginalMember(owner = "client!bma", name = "j", descriptor = "I")
	public int anInt1402;

	@OriginalMember(owner = "client!bma", name = "a", descriptor = "Z")
	private boolean aBoolean97 = false;

	@OriginalMember(owner = "client!bma", name = "b", descriptor = "I")
	public int anInt1400 = 43594;

	@OriginalMember(owner = "client!bma", name = "m", descriptor = "Z")
	private boolean aBoolean98 = true;

	@OriginalMember(owner = "client!bma", name = "g", descriptor = "I")
	public int anInt1404 = 443;

	@OriginalMember(owner = "client!bma", name = "a", descriptor = "(I)V")
	public void method1304() {
		if (!this.aBoolean98) {
			this.aBoolean98 = true;
			this.aBoolean97 = true;
		} else if (this.aBoolean97) {
			this.aBoolean97 = false;
		} else {
			this.aBoolean98 = false;
		}
	}

	@OriginalMember(owner = "client!bma", name = "a", descriptor = "(BLclient!br;)Lclient!sfa;")
	public Class338 method1307(@OriginalArg(1) Class47 arg0) {
		return arg0.method1397(this.aBoolean97, this.aBoolean98 ? this.anInt1404 : this.anInt1400, this.aString20);
	}

	@OriginalMember(owner = "client!bma", name = "a", descriptor = "(ILclient!bma;)Z")
	public boolean method1308(@OriginalArg(1) Class43 arg0) {
		if (arg0 == null) {
			return false;
		} else {
			return this.anInt1402 == arg0.anInt1402 && this.aString20.equals(arg0.aString20);
		}
	}
}
