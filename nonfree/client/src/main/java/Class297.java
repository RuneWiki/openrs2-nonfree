import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!st")
public final class Class297 {

	@OriginalMember(owner = "client!st", name = "f", descriptor = "Ljava/lang/String;")
	public String aString70;

	@OriginalMember(owner = "client!st", name = "l", descriptor = "I")
	public int anInt8579;

	@OriginalMember(owner = "client!st", name = "c", descriptor = "Z")
	private boolean aBoolean556 = false;

	@OriginalMember(owner = "client!st", name = "a", descriptor = "Z")
	private boolean aBoolean555 = false;

	@OriginalMember(owner = "client!st", name = "e", descriptor = "I")
	public int anInt8574 = 443;

	@OriginalMember(owner = "client!st", name = "k", descriptor = "I")
	public int anInt8578 = 43594;

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(ILclient!tt;)Lclient!oaa;")
	public Class224 method6800(@OriginalArg(1) Class313 arg0) {
		return arg0.method6982(this.aString70, this.aBoolean555 ? this.anInt8574 : this.anInt8578, this.aBoolean556);
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(Lclient!st;B)Z")
	public boolean method6802(@OriginalArg(0) Class297 arg0) {
		if (arg0 == null) {
			return false;
		} else {
			return this.anInt8579 == arg0.anInt8579 && this.aString70.equals(arg0.aString70);
		}
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(B)V")
	public void method6804() {
		if (!this.aBoolean555) {
			this.aBoolean556 = true;
			this.aBoolean555 = true;
		} else if (this.aBoolean556) {
			this.aBoolean556 = false;
		} else {
			this.aBoolean555 = false;
		}
	}
}
