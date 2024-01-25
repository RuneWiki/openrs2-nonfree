import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ffa")
public final class Class96 {

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "Lclient!ru;")
	public Interface23 anInterface23_5;

	@OriginalMember(owner = "client!ffa", name = "b", descriptor = "Lclient!ru;")
	public Interface23 anInterface23_6;

	@OriginalMember(owner = "client!ffa", name = "g", descriptor = "Z")
	public boolean aBoolean319;

	@OriginalMember(owner = "client!ffa", name = "c", descriptor = "Z")
	public boolean aBoolean318;

	@OriginalMember(owner = "client!ffa", name = "<init>", descriptor = "(Z)V")
	public Class96(@OriginalArg(0) boolean arg0) {
		this.aBoolean318 = arg0;
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(I)Z")
	public boolean method3254() {
		return this.aBoolean319 && !this.aBoolean318;
	}

	@OriginalMember(owner = "client!ffa", name = "b", descriptor = "(I)V")
	public void method3255() {
		if (this.anInterface23_5 != null) {
			this.anInterface23_5.method7627();
		}
		this.aBoolean319 = false;
	}
}
