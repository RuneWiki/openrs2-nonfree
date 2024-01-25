import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!np")
public final class Class258 {

	@OriginalMember(owner = "client!np", name = "b", descriptor = "Ljava/lang/String;")
	public String aString78;

	@OriginalMember(owner = "client!np", name = "j", descriptor = "I")
	public int anInt6748;

	@OriginalMember(owner = "client!np", name = "d", descriptor = "I")
	public int anInt6746 = 443;

	@OriginalMember(owner = "client!np", name = "e", descriptor = "Z")
	private boolean aBoolean445 = false;

	@OriginalMember(owner = "client!np", name = "c", descriptor = "I")
	public int anInt6747 = 43594;

	@OriginalMember(owner = "client!np", name = "h", descriptor = "Z")
	private boolean aBoolean446 = true;

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(Z)V")
	public void method5843() {
		if (!this.aBoolean446) {
			this.aBoolean446 = true;
			this.aBoolean445 = true;
		} else if (this.aBoolean445) {
			this.aBoolean445 = false;
		} else {
			this.aBoolean446 = false;
		}
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(Lclient!np;B)Z")
	public boolean method5845(@OriginalArg(0) Class258 arg0) {
		if (arg0 == null) {
			return false;
		} else {
			return this.anInt6748 == arg0.anInt6748 && this.aString78.equals(arg0.aString78);
		}
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(Lclient!tga;I)Lclient!uga;")
	public Class361 method5846(@OriginalArg(0) Class349 arg0) {
		return arg0.method7742(this.aString78, this.aBoolean445, this.aBoolean446 ? this.anInt6746 : this.anInt6747);
	}
}
