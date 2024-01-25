import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public final class Class357 {

	@OriginalMember(owner = "client!u", name = "k", descriptor = "Ljava/lang/String;")
	public String aString110;

	@OriginalMember(owner = "client!u", name = "b", descriptor = "I")
	public int anInt9936;

	@OriginalMember(owner = "client!u", name = "f", descriptor = "I")
	public int anInt9929 = 43594;

	@OriginalMember(owner = "client!u", name = "i", descriptor = "I")
	public int anInt9932 = 443;

	@OriginalMember(owner = "client!u", name = "h", descriptor = "Z")
	private boolean aBoolean687 = false;

	@OriginalMember(owner = "client!u", name = "l", descriptor = "Z")
	private boolean aBoolean686 = true;

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(I)V")
	public void method8506() {
		if (!this.aBoolean686) {
			this.aBoolean687 = true;
			this.aBoolean686 = true;
		} else if (this.aBoolean687) {
			this.aBoolean687 = false;
		} else {
			this.aBoolean686 = false;
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Lclient!iha;B)Lclient!mba;")
	public Class230 method8511(@OriginalArg(0) Class173 arg0) {
		return arg0.method4236(this.aBoolean686 ? this.anInt9932 : this.anInt9929, this.aString110, this.aBoolean687);
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Lclient!u;B)Z")
	public boolean method8512(@OriginalArg(0) Class357 arg0) {
		if (arg0 == null) {
			return false;
		} else {
			return arg0.anInt9936 == this.anInt9936 && this.aString110.equals(arg0.aString110);
		}
	}
}
