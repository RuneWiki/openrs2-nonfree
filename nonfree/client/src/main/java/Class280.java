import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qv")
public final class Class280 {

	@OriginalMember(owner = "client!qv", name = "c", descriptor = "Ljava/lang/String;")
	public String aString87;

	@OriginalMember(owner = "client!qv", name = "h", descriptor = "I")
	public int anInt8497;

	@OriginalMember(owner = "client!qv", name = "d", descriptor = "I")
	public int anInt8493 = 443;

	@OriginalMember(owner = "client!qv", name = "j", descriptor = "Z")
	private boolean aBoolean602 = true;

	@OriginalMember(owner = "client!qv", name = "m", descriptor = "Z")
	private boolean aBoolean603 = false;

	@OriginalMember(owner = "client!qv", name = "n", descriptor = "I")
	public int anInt8501 = 43594;

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(Lclient!qv;I)Z")
	public boolean method7023(@OriginalArg(0) Class280 arg0) {
		if (arg0 == null) {
			return false;
		} else {
			return arg0.anInt8497 == this.anInt8497 && this.aString87.equals(arg0.aString87);
		}
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(ILclient!gh;)Lclient!sb;")
	public Class301 method7026(@OriginalArg(1) Class118 arg0) {
		return arg0.method3402(this.aBoolean602 ? this.anInt8493 : this.anInt8501, this.aString87, this.aBoolean603);
	}

	@OriginalMember(owner = "client!qv", name = "b", descriptor = "(B)V")
	public void method7028() {
		if (!this.aBoolean602) {
			this.aBoolean602 = true;
			this.aBoolean603 = true;
		} else if (this.aBoolean603) {
			this.aBoolean603 = false;
		} else {
			this.aBoolean602 = false;
		}
	}
}
