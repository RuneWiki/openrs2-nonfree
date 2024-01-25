import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public final class Class369 {

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "Z")
	public boolean aBoolean715;

	@OriginalMember(owner = "client!vb", name = "d", descriptor = "Lclient!ta;")
	public Interface22 anInterface22_7;

	@OriginalMember(owner = "client!vb", name = "h", descriptor = "Lclient!ta;")
	public Interface22 anInterface22_8;

	@OriginalMember(owner = "client!vb", name = "g", descriptor = "Z")
	public boolean aBoolean716;

	@OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(Z)V")
	public Class369(@OriginalArg(0) boolean arg0) {
		this.aBoolean716 = arg0;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(B)V")
	public void method8253() {
		if (this.anInterface22_7 != null) {
			this.anInterface22_7.method7731();
		}
		this.aBoolean715 = false;
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(B)Z")
	public boolean method8256() {
		return this.aBoolean715 && !this.aBoolean716;
	}
}
