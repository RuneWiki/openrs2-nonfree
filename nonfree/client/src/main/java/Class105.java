import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gca")
public final class Class105 {

	@OriginalMember(owner = "client!gca", name = "e", descriptor = "I")
	public int anInt3307;

	@OriginalMember(owner = "client!gca", name = "j", descriptor = "Ljava/lang/String;")
	public String aString26;

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "Z")
	private boolean aBoolean243 = false;

	@OriginalMember(owner = "client!gca", name = "l", descriptor = "I")
	public int anInt3312 = 443;

	@OriginalMember(owner = "client!gca", name = "f", descriptor = "I")
	public int anInt3308 = 43594;

	@OriginalMember(owner = "client!gca", name = "m", descriptor = "Z")
	private boolean aBoolean244 = false;

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(Lclient!qj;I)Lclient!ue;")
	public Class331 method2907(@OriginalArg(0) Class272 arg0) {
		return arg0.method6119(this.aBoolean243 ? this.anInt3312 : this.anInt3308, this.aString26, this.aBoolean244);
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(I)V")
	public void method2908() {
		if (!this.aBoolean243) {
			this.aBoolean244 = true;
			this.aBoolean243 = true;
		} else if (this.aBoolean244) {
			this.aBoolean244 = false;
		} else {
			this.aBoolean243 = false;
		}
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(Lclient!gca;B)Z")
	public boolean method2910(@OriginalArg(0) Class105 arg0) {
		if (arg0 == null) {
			return false;
		} else {
			return this.anInt3307 == arg0.anInt3307 && this.aString26.equals(arg0.aString26);
		}
	}
}
