import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public final class Class132 {

	@OriginalMember(owner = "client!hh", name = "d", descriptor = "Lclient!ll;")
	public Interface17 anInterface17_10;

	@OriginalMember(owner = "client!hh", name = "e", descriptor = "Lclient!ll;")
	public Interface17 anInterface17_11;

	@OriginalMember(owner = "client!hh", name = "h", descriptor = "Z")
	public boolean aBoolean294;

	@OriginalMember(owner = "client!hh", name = "c", descriptor = "Z")
	public boolean aBoolean293;

	@OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(Z)V")
	public Class132(@OriginalArg(0) boolean arg0) {
		this.aBoolean293 = arg0;
	}

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(I)V")
	public void method3606() {
		if (this.anInterface17_11 != null) {
			this.anInterface17_11.method8431();
		}
		this.aBoolean294 = false;
	}

	@OriginalMember(owner = "client!hh", name = "c", descriptor = "(I)Z")
	public boolean method3607() {
		return this.aBoolean294 && !this.aBoolean293;
	}
}
