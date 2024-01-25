import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public final class Class142 {

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "Z")
	public boolean aBoolean354;

	@OriginalMember(owner = "client!hh", name = "d", descriptor = "Lclient!vv;")
	public Interface24 anInterface24_4;

	@OriginalMember(owner = "client!hh", name = "f", descriptor = "Lclient!vv;")
	public Interface24 anInterface24_5;

	@OriginalMember(owner = "client!hh", name = "e", descriptor = "Z")
	public boolean aBoolean355;

	@OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(Z)V")
	public Class142(@OriginalArg(0) boolean arg0) {
		this.aBoolean355 = arg0;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)Z")
	public boolean method4084() {
		return this.aBoolean354 && !this.aBoolean355;
	}

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(I)V")
	public void method4085() {
		if (this.anInterface24_5 != null) {
			this.anInterface24_5.method9037();
		}
		this.aBoolean354 = false;
	}
}
