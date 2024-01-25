import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public final class Class329 {

	@OriginalMember(owner = "client!uk", name = "f", descriptor = "Ljava/lang/String;")
	public String aString124;

	@OriginalMember(owner = "client!uk", name = "q", descriptor = "I")
	public int anInt9698;

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "I")
	public int anInt9687 = 43594;

	@OriginalMember(owner = "client!uk", name = "d", descriptor = "I")
	public int anInt9689 = 443;

	@OriginalMember(owner = "client!uk", name = "g", descriptor = "Z")
	private boolean aBoolean810 = false;

	@OriginalMember(owner = "client!uk", name = "m", descriptor = "Z")
	private boolean aBoolean811 = false;

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(Lclient!uk;I)Z")
	public boolean method7874(@OriginalArg(0) Class329 arg0) {
		if (arg0 == null) {
			return false;
		} else {
			return arg0.anInt9698 == this.anInt9698 && this.aString124.equals(arg0.aString124);
		}
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(I)V")
	public void method7876() {
		if (!this.aBoolean810) {
			this.aBoolean811 = true;
			this.aBoolean810 = true;
		} else if (this.aBoolean811) {
			this.aBoolean811 = false;
		} else {
			this.aBoolean810 = false;
		}
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(ZLclient!ufa;)Lclient!dn;")
	public Class66 method7877(@OriginalArg(1) Class326 arg0) {
		return arg0.method7792(this.aBoolean811, this.aString124, this.aBoolean810 ? this.anInt9689 : this.anInt9687);
	}
}
