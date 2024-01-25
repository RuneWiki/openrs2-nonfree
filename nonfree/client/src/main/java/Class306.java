import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ro")
public final class Class306 {

	@OriginalMember(owner = "client!ro", name = "d", descriptor = "Ljava/lang/String;")
	public String aString95;

	@OriginalMember(owner = "client!ro", name = "k", descriptor = "I")
	public int anInt8300;

	@OriginalMember(owner = "client!ro", name = "b", descriptor = "I")
	public int anInt8294 = 443;

	@OriginalMember(owner = "client!ro", name = "e", descriptor = "Z")
	private boolean aBoolean603 = true;

	@OriginalMember(owner = "client!ro", name = "h", descriptor = "Z")
	private boolean aBoolean604 = false;

	@OriginalMember(owner = "client!ro", name = "f", descriptor = "I")
	public int anInt8296 = 43594;

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(I)V")
	public void method7223() {
		if (!this.aBoolean603) {
			this.aBoolean603 = true;
			this.aBoolean604 = true;
		} else if (this.aBoolean604) {
			this.aBoolean604 = false;
		} else {
			this.aBoolean603 = false;
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(Lclient!fc;I)Lclient!eha;")
	public Class91 method7224(@OriginalArg(0) Class100 arg0) {
		return arg0.method2082(this.aString95, this.aBoolean603 ? this.anInt8294 : this.anInt8296, this.aBoolean604);
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(BLclient!ro;)Z")
	public boolean method7226(@OriginalArg(1) Class306 arg0) {
		if (arg0 == null) {
			return false;
		} else {
			return arg0.anInt8300 == this.anInt8300 && this.aString95.equals(arg0.aString95);
		}
	}
}
