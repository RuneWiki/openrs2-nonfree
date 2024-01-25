import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public final class Class174 {

	@OriginalMember(owner = "client!jm", name = "i", descriptor = "I")
	public int anInt4666;

	@OriginalMember(owner = "client!jm", name = "l", descriptor = "Ljava/lang/String;")
	public String aString46;

	@OriginalMember(owner = "client!jm", name = "d", descriptor = "I")
	public int anInt4662 = 443;

	@OriginalMember(owner = "client!jm", name = "j", descriptor = "Z")
	private boolean aBoolean364 = false;

	@OriginalMember(owner = "client!jm", name = "f", descriptor = "Z")
	private boolean aBoolean363 = false;

	@OriginalMember(owner = "client!jm", name = "m", descriptor = "I")
	public int anInt4668 = 43594;

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(ILclient!gba;)Lclient!ba;")
	public Class23 method3998(@OriginalArg(1) Class114 arg0) {
		return arg0.method2513(this.aBoolean364, this.aBoolean363 ? this.anInt4662 : this.anInt4668, this.aString46);
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(Lclient!jm;I)Z")
	public boolean method4001(@OriginalArg(0) Class174 arg0) {
		if (arg0 == null) {
			return false;
		} else {
			return this.anInt4666 == arg0.anInt4666 && this.aString46.equals(arg0.aString46);
		}
	}

	@OriginalMember(owner = "client!jm", name = "b", descriptor = "(I)V")
	public void method4003() {
		if (!this.aBoolean363) {
			this.aBoolean363 = true;
			this.aBoolean364 = true;
		} else if (this.aBoolean364) {
			this.aBoolean364 = false;
		} else {
			this.aBoolean363 = false;
		}
	}
}
