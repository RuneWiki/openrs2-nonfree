import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public final class Class113 {

	@OriginalMember(owner = "client!fm", name = "b", descriptor = "Lclient!rh;")
	public Interface21 anInterface21_2;

	@OriginalMember(owner = "client!fm", name = "c", descriptor = "Z")
	public boolean aBoolean247;

	@OriginalMember(owner = "client!fm", name = "g", descriptor = "Lclient!rh;")
	public Interface21 anInterface21_3;

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "Z")
	public boolean aBoolean246;

	@OriginalMember(owner = "client!fm", name = "<init>", descriptor = "(Z)V")
	public Class113(@OriginalArg(0) boolean arg0) {
		this.aBoolean246 = arg0;
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(Z)Z")
	public boolean method2426() {
		return this.aBoolean247 && !this.aBoolean246;
	}

	@OriginalMember(owner = "client!fm", name = "b", descriptor = "(B)V")
	public void method2428() {
		if (this.anInterface21_2 != null) {
			this.anInterface21_2.method7716();
		}
		this.aBoolean247 = false;
	}
}
