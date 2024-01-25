import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public final class Class205 {

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "Lclient!jf;")
	public Interface11 anInterface11_5;

	@OriginalMember(owner = "client!mg", name = "c", descriptor = "Z")
	public boolean aBoolean425;

	@OriginalMember(owner = "client!mg", name = "f", descriptor = "Lclient!jf;")
	public Interface11 anInterface11_6;

	@OriginalMember(owner = "client!mg", name = "j", descriptor = "Z")
	public boolean aBoolean426;

	@OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(Z)V")
	public Class205(@OriginalArg(0) boolean arg0) {
		this.aBoolean426 = arg0;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(B)Z")
	public boolean method5557() {
		return this.aBoolean425 && !this.aBoolean426;
	}

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "(I)V")
	public void method5560() {
		if (this.anInterface11_5 != null) {
			this.anInterface11_5.method8431();
		}
		this.aBoolean425 = false;
	}
}
