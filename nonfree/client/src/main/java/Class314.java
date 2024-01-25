import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public final class Class314 {

	@OriginalMember(owner = "client!rb", name = "i", descriptor = "Ljava/lang/String;")
	public String aString117;

	@OriginalMember(owner = "client!rb", name = "e", descriptor = "I")
	public int anInt9072;

	@OriginalMember(owner = "client!rb", name = "d", descriptor = "Z")
	private boolean aBoolean666 = false;

	@OriginalMember(owner = "client!rb", name = "j", descriptor = "Z")
	private boolean aBoolean667 = true;

	@OriginalMember(owner = "client!rb", name = "f", descriptor = "I")
	public int anInt9071 = 43594;

	@OriginalMember(owner = "client!rb", name = "k", descriptor = "I")
	public int anInt9073 = 443;

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)V")
	public void method7592() {
		if (!this.aBoolean667) {
			this.aBoolean667 = true;
			this.aBoolean666 = true;
		} else if (this.aBoolean666) {
			this.aBoolean666 = false;
		} else {
			this.aBoolean667 = false;
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(ILclient!rb;)Z")
	public boolean method7594(@OriginalArg(1) Class314 arg0) {
		if (arg0 == null) {
			return false;
		} else {
			return this.anInt9072 == arg0.anInt9072 && this.aString117.equals(arg0.aString117);
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(ZLclient!cea;)Lclient!ke;")
	public Class201 method7595(@OriginalArg(1) Class47 arg0) {
		return arg0.method947(this.aString117, this.aBoolean667 ? this.anInt9073 : this.anInt9071, this.aBoolean666);
	}
}
