import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public final class Class342 {

	@OriginalMember(owner = "client!u", name = "c", descriptor = "Ljava/lang/String;")
	public String aString113;

	@OriginalMember(owner = "client!u", name = "j", descriptor = "I")
	public int anInt9498;

	@OriginalMember(owner = "client!u", name = "b", descriptor = "Z")
	private boolean aBoolean729 = true;

	@OriginalMember(owner = "client!u", name = "e", descriptor = "I")
	public int anInt9494 = 443;

	@OriginalMember(owner = "client!u", name = "a", descriptor = "I")
	public int anInt9493 = 43594;

	@OriginalMember(owner = "client!u", name = "d", descriptor = "Z")
	private boolean aBoolean730 = false;

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(BLclient!qn;)Lclient!eba;")
	public Class81 method8306(@OriginalArg(1) Class291 arg0) {
		return arg0.method7137(this.aString113, this.aBoolean729 ? this.anInt9494 : this.anInt9493, this.aBoolean730);
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Lclient!u;I)Z")
	public boolean method8308(@OriginalArg(0) Class342 arg0) {
		if (arg0 == null) {
			return false;
		} else {
			return arg0.anInt9498 == this.anInt9498 && this.aString113.equals(arg0.aString113);
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(I)V")
	public void method8309() {
		if (!this.aBoolean729) {
			this.aBoolean729 = true;
			this.aBoolean730 = true;
		} else if (this.aBoolean730) {
			this.aBoolean730 = false;
		} else {
			this.aBoolean729 = false;
		}
	}
}
