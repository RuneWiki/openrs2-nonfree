import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public final class Class382 {

	@OriginalMember(owner = "client!wb", name = "d", descriptor = "Ljava/lang/String;")
	public String aString122;

	@OriginalMember(owner = "client!wb", name = "g", descriptor = "I")
	public int anInt10282;

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "I")
	public int anInt10279 = 443;

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "I")
	public int anInt10280 = 43594;

	@OriginalMember(owner = "client!wb", name = "f", descriptor = "Z")
	private boolean aBoolean789 = true;

	@OriginalMember(owner = "client!wb", name = "j", descriptor = "Z")
	private boolean aBoolean790 = false;

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lclient!lc;Z)Lclient!pga;")
	public Class281 method8694(@OriginalArg(0) Class207 arg0) {
		return arg0.method4572(this.aString122, this.aBoolean789 ? this.anInt10279 : this.anInt10280, this.aBoolean790);
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)V")
	public void method8696() {
		if (!this.aBoolean789) {
			this.aBoolean789 = true;
			this.aBoolean790 = true;
		} else if (this.aBoolean790) {
			this.aBoolean790 = false;
		} else {
			this.aBoolean789 = false;
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(ILclient!wb;)Z")
	public boolean method8697(@OriginalArg(1) Class382 arg0) {
		if (arg0 == null) {
			return false;
		} else {
			return arg0.anInt10282 == this.anInt10282 && this.aString122.equals(arg0.aString122);
		}
	}
}
