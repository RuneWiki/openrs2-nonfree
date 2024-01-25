import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public final class Class275 {

	@OriginalMember(owner = "client!rd", name = "e", descriptor = "I")
	public int anInt7968;

	@OriginalMember(owner = "client!rd", name = "k", descriptor = "Ljava/lang/String;")
	public String aString100;

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "Z")
	private boolean aBoolean589 = false;

	@OriginalMember(owner = "client!rd", name = "i", descriptor = "Z")
	private boolean aBoolean590 = false;

	@OriginalMember(owner = "client!rd", name = "j", descriptor = "I")
	public int anInt7972 = 43594;

	@OriginalMember(owner = "client!rd", name = "h", descriptor = "I")
	public int anInt7971 = 443;

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(BLclient!pe;)Lclient!sba;")
	public Class280 method6662(@OriginalArg(1) Class246 arg0) {
		return arg0.method6145(this.aBoolean589 ? this.anInt7971 : this.anInt7972, this.aString100, this.aBoolean590);
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(ILclient!rd;)Z")
	public boolean method6664(@OriginalArg(1) Class275 arg0) {
		if (arg0 == null) {
			return false;
		} else {
			return this.anInt7968 == arg0.anInt7968 && this.aString100.equals(arg0.aString100);
		}
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(I)V")
	public void method6665() {
		if (!this.aBoolean589) {
			this.aBoolean589 = true;
			this.aBoolean590 = true;
		} else if (this.aBoolean590) {
			this.aBoolean590 = false;
		} else {
			this.aBoolean589 = false;
		}
	}
}
