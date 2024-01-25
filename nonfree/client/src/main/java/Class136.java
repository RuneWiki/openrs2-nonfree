import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hga")
public final class Class136 {

	@OriginalMember(owner = "client!hga", name = "b", descriptor = "Z")
	public boolean aBoolean327;

	@OriginalMember(owner = "client!hga", name = "g", descriptor = "Lclient!wr;")
	public Interface24 anInterface24_5;

	@OriginalMember(owner = "client!hga", name = "i", descriptor = "Lclient!wr;")
	public Interface24 anInterface24_6;

	@OriginalMember(owner = "client!hga", name = "h", descriptor = "Z")
	public boolean aBoolean329;

	@OriginalMember(owner = "client!hga", name = "<init>", descriptor = "(Z)V")
	public Class136(@OriginalArg(0) boolean arg0) {
		this.aBoolean329 = arg0;
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(Z)Z")
	public boolean method3387() {
		return this.aBoolean327 && !this.aBoolean329;
	}

	@OriginalMember(owner = "client!hga", name = "b", descriptor = "(Z)V")
	public void method3388() {
		if (this.anInterface24_5 != null) {
			this.anInterface24_5.method7651();
		}
		this.aBoolean327 = false;
	}
}
