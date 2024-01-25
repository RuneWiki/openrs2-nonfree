import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tga")
public final class Class337 {

	@OriginalMember(owner = "client!tga", name = "f", descriptor = "Ljava/lang/String;")
	public String aString103;

	@OriginalMember(owner = "client!tga", name = "i", descriptor = "I")
	public int anInt9843;

	@OriginalMember(owner = "client!tga", name = "k", descriptor = "Z")
	private boolean aBoolean696 = false;

	@OriginalMember(owner = "client!tga", name = "l", descriptor = "I")
	public int anInt9845 = 443;

	@OriginalMember(owner = "client!tga", name = "m", descriptor = "I")
	public int anInt9846 = 43594;

	@OriginalMember(owner = "client!tga", name = "n", descriptor = "Z")
	private boolean aBoolean697 = true;

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(Lclient!td;Z)Lclient!hu;")
	public Class150 method8198(@OriginalArg(0) Class333 arg0) {
		return arg0.method8143(this.aBoolean697 ? this.anInt9845 : this.anInt9846, this.aString103, this.aBoolean696);
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(B)V")
	public void method8199() {
		if (!this.aBoolean697) {
			this.aBoolean696 = true;
			this.aBoolean697 = true;
		} else if (this.aBoolean696) {
			this.aBoolean696 = false;
		} else {
			this.aBoolean697 = false;
		}
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(ILclient!tga;)Z")
	public boolean method8203(@OriginalArg(1) Class337 arg0) {
		if (arg0 == null) {
			return false;
		} else {
			return arg0.anInt9843 == this.anInt9843 && this.aString103.equals(arg0.aString103);
		}
	}
}
