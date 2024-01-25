import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vaa")
public final class Class365 {

	@OriginalMember(owner = "client!vaa", name = "h", descriptor = "Ljava/lang/String;")
	public String aString112;

	@OriginalMember(owner = "client!vaa", name = "j", descriptor = "I")
	public int anInt9973;

	@OriginalMember(owner = "client!vaa", name = "e", descriptor = "I")
	public int anInt9970 = 443;

	@OriginalMember(owner = "client!vaa", name = "b", descriptor = "Z")
	private boolean aBoolean729 = false;

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "I")
	public int anInt9967 = 43594;

	@OriginalMember(owner = "client!vaa", name = "k", descriptor = "Z")
	private boolean aBoolean730 = true;

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(Lclient!vaa;I)Z")
	public boolean method8289(@OriginalArg(0) Class365 arg0) {
		if (arg0 == null) {
			return false;
		} else {
			return arg0.anInt9973 == this.anInt9973 && this.aString112.equals(arg0.aString112);
		}
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(ILclient!kj;)Lclient!rb;")
	public Class297 method8291(@OriginalArg(1) Class202 arg0) {
		return arg0.method4730(this.aBoolean729, this.aBoolean730 ? this.anInt9970 : this.anInt9967, this.aString112);
	}

	@OriginalMember(owner = "client!vaa", name = "b", descriptor = "(I)V")
	public void method8293() {
		if (!this.aBoolean730) {
			this.aBoolean730 = true;
			this.aBoolean729 = true;
		} else if (this.aBoolean729) {
			this.aBoolean729 = false;
		} else {
			this.aBoolean730 = false;
		}
	}
}
