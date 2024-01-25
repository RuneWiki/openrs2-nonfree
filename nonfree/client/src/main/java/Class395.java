import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wv")
public final class Class395 {

	@OriginalMember(owner = "client!wv", name = "f", descriptor = "I")
	public int anInt10873;

	@OriginalMember(owner = "client!wv", name = "i", descriptor = "Ljava/lang/String;")
	public String aString122;

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "I")
	public int anInt10870 = 443;

	@OriginalMember(owner = "client!wv", name = "b", descriptor = "Z")
	private boolean aBoolean923 = false;

	@OriginalMember(owner = "client!wv", name = "h", descriptor = "Z")
	private boolean aBoolean924 = true;

	@OriginalMember(owner = "client!wv", name = "n", descriptor = "I")
	public int anInt10879 = 43594;

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(I)V")
	public void method9035() {
		if (!this.aBoolean924) {
			this.aBoolean924 = true;
			this.aBoolean923 = true;
		} else if (this.aBoolean923) {
			this.aBoolean923 = false;
		} else {
			this.aBoolean924 = false;
		}
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(Lclient!wv;I)Z")
	public boolean method9036(@OriginalArg(0) Class395 arg0) {
		if (arg0 == null) {
			return false;
		} else {
			return this.anInt10873 == arg0.anInt10873 && this.aString122.equals(arg0.aString122);
		}
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(BLclient!oq;)Lclient!tba;")
	public Class331 method9037(@OriginalArg(1) Class268 arg0) {
		return arg0.method6331(this.aBoolean923, this.aBoolean924 ? this.anInt10870 : this.anInt10879, this.aString122);
	}
}
