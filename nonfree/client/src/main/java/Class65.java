import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public final class Class65 {

	@OriginalMember(owner = "client!dh", name = "f", descriptor = "I")
	public int anInt2279;

	@OriginalMember(owner = "client!dh", name = "l", descriptor = "Ljava/lang/String;")
	public String aString31;

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "I")
	public int anInt2274 = 43594;

	@OriginalMember(owner = "client!dh", name = "e", descriptor = "I")
	public int anInt2278 = 443;

	@OriginalMember(owner = "client!dh", name = "k", descriptor = "Z")
	private boolean aBoolean189 = false;

	@OriginalMember(owner = "client!dh", name = "n", descriptor = "Z")
	private boolean aBoolean190 = false;

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(Lclient!n;I)Lclient!kp;")
	public Class192 method2044(@OriginalArg(0) Class221 arg0) {
		return arg0.method5194(this.aString31, this.aBoolean190, this.aBoolean189 ? this.anInt2278 : this.anInt2274);
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(Lclient!dh;I)Z")
	public boolean method2045(@OriginalArg(0) Class65 arg0) {
		if (arg0 == null) {
			return false;
		} else {
			return arg0.anInt2279 == this.anInt2279 && this.aString31.equals(arg0.aString31);
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(B)V")
	public void method2046() {
		if (!this.aBoolean189) {
			this.aBoolean190 = true;
			this.aBoolean189 = true;
		} else if (this.aBoolean190) {
			this.aBoolean190 = false;
		} else {
			this.aBoolean189 = false;
		}
	}
}
