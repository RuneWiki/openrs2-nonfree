import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public final class Class255 {

	@OriginalMember(owner = "client!pc", name = "f", descriptor = "I")
	public int anInt7912;

	@OriginalMember(owner = "client!pc", name = "j", descriptor = "Ljava/lang/String;")
	public String aString89;

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "Z")
	private boolean aBoolean566 = false;

	@OriginalMember(owner = "client!pc", name = "i", descriptor = "Z")
	private boolean aBoolean567 = true;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "I")
	public int anInt7908 = 443;

	@OriginalMember(owner = "client!pc", name = "k", descriptor = "I")
	public int anInt7914 = 43594;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)V")
	public void method6754() {
		if (!this.aBoolean567) {
			this.aBoolean566 = true;
			this.aBoolean567 = true;
		} else if (this.aBoolean566) {
			this.aBoolean566 = false;
		} else {
			this.aBoolean567 = false;
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!wea;B)Lclient!of;")
	public Class240 method6757(@OriginalArg(0) Class370 arg0) {
		return arg0.method9070(this.aBoolean566, this.aBoolean567 ? this.anInt7908 : this.anInt7914, this.aString89);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(BLclient!pc;)Z")
	public boolean method6759(@OriginalArg(1) Class255 arg0) {
		if (arg0 == null) {
			return false;
		} else {
			return this.anInt7912 == arg0.anInt7912 && this.aString89.equals(arg0.aString89);
		}
	}
}
