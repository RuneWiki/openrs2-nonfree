import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ms")
public final class Class233 {

	@OriginalMember(owner = "client!ms", name = "g", descriptor = "Lclient!eu;")
	public Interface4 anInterface4_11;

	@OriginalMember(owner = "client!ms", name = "h", descriptor = "Lclient!eu;")
	public Interface4 anInterface4_12;

	@OriginalMember(owner = "client!ms", name = "i", descriptor = "Z")
	public boolean aBoolean445;

	@OriginalMember(owner = "client!ms", name = "c", descriptor = "Z")
	public boolean aBoolean444;

	@OriginalMember(owner = "client!ms", name = "<init>", descriptor = "(Z)V")
	public Class233(@OriginalArg(0) boolean arg0) {
		this.aBoolean444 = arg0;
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(Z)V")
	public void method5030() {
		if (this.anInterface4_12 != null) {
			this.anInterface4_12.method7146();
		}
		this.aBoolean445 = false;
	}

	@OriginalMember(owner = "client!ms", name = "b", descriptor = "(Z)Z")
	public boolean method5031() {
		return this.aBoolean445 && !this.aBoolean444;
	}
}
