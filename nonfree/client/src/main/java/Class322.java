import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public final class Class322 {

	@OriginalMember(owner = "client!th", name = "g", descriptor = "Ljava/lang/String;")
	public String aString83;

	@OriginalMember(owner = "client!th", name = "j", descriptor = "I")
	public int anInt9045;

	@OriginalMember(owner = "client!th", name = "c", descriptor = "I")
	public int anInt9041 = 43594;

	@OriginalMember(owner = "client!th", name = "i", descriptor = "I")
	public int anInt9044 = 443;

	@OriginalMember(owner = "client!th", name = "e", descriptor = "Z")
	private boolean aBoolean662 = false;

	@OriginalMember(owner = "client!th", name = "h", descriptor = "Z")
	private boolean aBoolean663 = true;

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(Lclient!th;B)Z")
	public boolean method7605(@OriginalArg(0) Class322 arg0) {
		if (arg0 == null) {
			return false;
		} else {
			return arg0.anInt9045 == this.anInt9045 && this.aString83.equals(arg0.aString83);
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(I)V")
	public void method7606() {
		if (!this.aBoolean663) {
			this.aBoolean663 = true;
			this.aBoolean662 = true;
		} else if (this.aBoolean662) {
			this.aBoolean662 = false;
		} else {
			this.aBoolean663 = false;
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(BLclient!vk;)Lclient!av;")
	public Class26 method7607(@OriginalArg(1) Class359 arg0) {
		return arg0.method8263(this.aBoolean662, this.aString83, this.aBoolean663 ? this.anInt9044 : this.anInt9041);
	}
}
