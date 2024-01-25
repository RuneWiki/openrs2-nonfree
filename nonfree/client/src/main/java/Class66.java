import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dda")
public final class Class66 {

	@OriginalMember(owner = "client!dda", name = "b", descriptor = "Ljava/lang/String;")
	public String aString22;

	@OriginalMember(owner = "client!dda", name = "e", descriptor = "I")
	public int anInt1756;

	@OriginalMember(owner = "client!dda", name = "d", descriptor = "I")
	public int anInt1755 = 43594;

	@OriginalMember(owner = "client!dda", name = "f", descriptor = "I")
	public int anInt1757 = 443;

	@OriginalMember(owner = "client!dda", name = "g", descriptor = "Z")
	private boolean aBoolean124 = true;

	@OriginalMember(owner = "client!dda", name = "j", descriptor = "Z")
	private boolean aBoolean125 = false;

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(I)V")
	public void method1681() {
		if (!this.aBoolean124) {
			this.aBoolean124 = true;
			this.aBoolean125 = true;
		} else if (this.aBoolean125) {
			this.aBoolean125 = false;
		} else {
			this.aBoolean124 = false;
		}
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(Lclient!dda;I)Z")
	public boolean method1683(@OriginalArg(0) Class66 arg0) {
		if (arg0 == null) {
			return false;
		} else {
			return this.anInt1756 == arg0.anInt1756 && this.aString22.equals(arg0.aString22);
		}
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(Lclient!cea;B)Lclient!ot;")
	public Class268 method1684(@OriginalArg(0) Class48 arg0) {
		return arg0.method1316(this.aString22, this.aBoolean124 ? this.anInt1757 : this.anInt1755, this.aBoolean125);
	}
}
