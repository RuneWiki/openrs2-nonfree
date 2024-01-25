import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public final class Class227 {

	@OriginalMember(owner = "client!mn", name = "g", descriptor = "I")
	public int anInt5547;

	@OriginalMember(owner = "client!mn", name = "q", descriptor = "Ljava/lang/String;")
	public String aString53;

	@OriginalMember(owner = "client!mn", name = "f", descriptor = "I")
	public int anInt5546 = 43594;

	@OriginalMember(owner = "client!mn", name = "j", descriptor = "I")
	public int anInt5548 = 443;

	@OriginalMember(owner = "client!mn", name = "h", descriptor = "Z")
	private boolean aBoolean446 = false;

	@OriginalMember(owner = "client!mn", name = "i", descriptor = "Z")
	private boolean aBoolean447 = false;

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(ILclient!mn;)Z")
	public boolean method4532(@OriginalArg(1) Class227 arg0) {
		if (arg0 == null) {
			return false;
		} else {
			return arg0.anInt5547 == this.anInt5547 && this.aString53.equals(arg0.aString53);
		}
	}

	@OriginalMember(owner = "client!mn", name = "c", descriptor = "(I)V")
	public void method4534() {
		if (!this.aBoolean446) {
			this.aBoolean447 = true;
			this.aBoolean446 = true;
		} else if (this.aBoolean447) {
			this.aBoolean447 = false;
		} else {
			this.aBoolean446 = false;
		}
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(ILclient!ft;)Lclient!pga;")
	public Class260 method4535(@OriginalArg(1) Class109 arg0) {
		return arg0.method2175(this.aString53, this.aBoolean446 ? this.anInt5548 : this.anInt5546, this.aBoolean447);
	}
}
