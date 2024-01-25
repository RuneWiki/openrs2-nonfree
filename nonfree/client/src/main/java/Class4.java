import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aba")
public final class Class4 {

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "Z")
	public boolean aBoolean3;

	@OriginalMember(owner = "client!aba", name = "c", descriptor = "Lclient!sfa;")
	public Interface25 anInterface25_1;

	@OriginalMember(owner = "client!aba", name = "d", descriptor = "Lclient!sfa;")
	public Interface25 anInterface25_2;

	@OriginalMember(owner = "client!aba", name = "h", descriptor = "Z")
	public boolean aBoolean4;

	@OriginalMember(owner = "client!aba", name = "<init>", descriptor = "(Z)V")
	public Class4(@OriginalArg(0) boolean arg0) {
		this.aBoolean4 = arg0;
	}

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(Z)Z")
	public boolean method34() {
		return this.aBoolean3 && !this.aBoolean4;
	}

	@OriginalMember(owner = "client!aba", name = "b", descriptor = "(I)V")
	public void method37() {
		if (this.anInterface25_2 != null) {
			this.anInterface25_2.method2921();
		}
		this.aBoolean3 = false;
	}
}
