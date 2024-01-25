import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ov")
public final class Class261 {

	@OriginalMember(owner = "client!ov", name = "i", descriptor = "Ljava/lang/String;")
	public String aString81;

	@OriginalMember(owner = "client!ov", name = "l", descriptor = "I")
	public int anInt6921;

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "I")
	public int anInt6913 = 43594;

	@OriginalMember(owner = "client!ov", name = "j", descriptor = "Z")
	private boolean aBoolean531 = false;

	@OriginalMember(owner = "client!ov", name = "d", descriptor = "Z")
	private boolean aBoolean530 = false;

	@OriginalMember(owner = "client!ov", name = "p", descriptor = "I")
	public int anInt6923 = 443;

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(Lclient!ov;B)Z")
	public boolean method5579(@OriginalArg(0) Class261 arg0) {
		if (arg0 == null) {
			return false;
		} else {
			return this.anInt6921 == arg0.anInt6921 && this.aString81.equals(arg0.aString81);
		}
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(Lclient!laa;I)Lclient!kl;")
	public Class191 method5582(@OriginalArg(0) Class198 arg0) {
		return arg0.method4289(this.aBoolean531, this.aString81, this.aBoolean530 ? this.anInt6923 : this.anInt6913);
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(I)V")
	public void method5585() {
		if (!this.aBoolean530) {
			this.aBoolean531 = true;
			this.aBoolean530 = true;
		} else if (this.aBoolean531) {
			this.aBoolean531 = false;
		} else {
			this.aBoolean530 = false;
		}
	}
}
