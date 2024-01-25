import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public final class Class384 {

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "Lclient!dk;")
	public Interface4 anInterface4_7;

	@OriginalMember(owner = "client!wh", name = "c", descriptor = "Lclient!dk;")
	public Interface4 anInterface4_8;

	@OriginalMember(owner = "client!wh", name = "i", descriptor = "Z")
	public boolean aBoolean754;

	@OriginalMember(owner = "client!wh", name = "k", descriptor = "Z")
	public boolean aBoolean755;

	@OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(Z)V")
	public Class384(@OriginalArg(0) boolean arg0) {
		this.aBoolean755 = arg0;
	}

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "(I)Z")
	public boolean method9131() {
		return this.aBoolean754 && !this.aBoolean755;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(B)V")
	public void method9133() {
		if (this.anInterface4_7 != null) {
			this.anInterface4_7.method5675();
		}
		this.aBoolean754 = false;
	}
}
