import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sv")
public final class Class326 {

	@OriginalMember(owner = "client!sv", name = "d", descriptor = "I")
	public int anInt8758;

	@OriginalMember(owner = "client!sv", name = "e", descriptor = "Ljava/lang/String;")
	public String aString102;

	@OriginalMember(owner = "client!sv", name = "b", descriptor = "Z")
	private boolean aBoolean660 = false;

	@OriginalMember(owner = "client!sv", name = "h", descriptor = "Z")
	private boolean aBoolean661 = true;

	@OriginalMember(owner = "client!sv", name = "g", descriptor = "I")
	public int anInt8760 = 443;

	@OriginalMember(owner = "client!sv", name = "l", descriptor = "I")
	public int anInt8764 = 43594;

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(B)V")
	public void method7370() {
		if (!this.aBoolean661) {
			this.aBoolean661 = true;
			this.aBoolean660 = true;
		} else if (this.aBoolean660) {
			this.aBoolean660 = false;
		} else {
			this.aBoolean661 = false;
		}
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(Lclient!sv;B)Z")
	public boolean method7371(@OriginalArg(0) Class326 arg0) {
		if (arg0 == null) {
			return false;
		} else {
			return arg0.anInt8758 == this.anInt8758 && this.aString102.equals(arg0.aString102);
		}
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(ZLclient!mr;)Lclient!fg;")
	public Class108 method7373(@OriginalArg(1) Class226 arg0) {
		return arg0.method4841(this.aString102, this.aBoolean661 ? this.anInt8760 : this.anInt8764, this.aBoolean660);
	}
}
