import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public final class Class261 {

	@OriginalMember(owner = "client!rg", name = "c", descriptor = "Z")
	public boolean aBoolean549;

	@OriginalMember(owner = "client!rg", name = "d", descriptor = "Lclient!lu;")
	public Interface10 anInterface10_10;

	@OriginalMember(owner = "client!rg", name = "j", descriptor = "Lclient!lu;")
	public Interface10 anInterface10_11;

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "Z")
	public boolean aBoolean548;

	@OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(Z)V")
	public Class261(@OriginalArg(0) boolean arg0) {
		this.aBoolean548 = arg0;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(B)V")
	public void method6546() {
		if (this.anInterface10_11 != null) {
			this.anInterface10_11.method7898();
		}
		this.aBoolean549 = false;
	}

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "(I)Z")
	public boolean method6547() {
		return this.aBoolean549 && !this.aBoolean548;
	}
}
