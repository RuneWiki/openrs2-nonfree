import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public final class Class180 {

	@OriginalMember(owner = "client!k", name = "f", descriptor = "Z")
	public boolean aBoolean349;

	@OriginalMember(owner = "client!k", name = "g", descriptor = "Lclient!rn;")
	public Interface20 anInterface20_5;

	@OriginalMember(owner = "client!k", name = "h", descriptor = "Lclient!rn;")
	public Interface20 anInterface20_6;

	@OriginalMember(owner = "client!k", name = "e", descriptor = "Z")
	public boolean aBoolean348;

	@OriginalMember(owner = "client!k", name = "<init>", descriptor = "(Z)V")
	public Class180(@OriginalArg(0) boolean arg0) {
		this.aBoolean348 = arg0;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(Z)Z")
	public boolean method3754() {
		return this.aBoolean349 && !this.aBoolean348;
	}

	@OriginalMember(owner = "client!k", name = "b", descriptor = "(Z)V")
	public void method3755() {
		if (this.anInterface20_5 != null) {
			this.anInterface20_5.method7384();
		}
		this.aBoolean349 = false;
	}
}
