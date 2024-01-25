import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qs")
public final class Class311 {

	@OriginalMember(owner = "client!qs", name = "g", descriptor = "Lclient!fh;")
	public Interface5 anInterface5_6;

	@OriginalMember(owner = "client!qs", name = "b", descriptor = "Z")
	public boolean aBoolean662;

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "Lclient!fh;")
	public Interface5 anInterface5_7;

	@OriginalMember(owner = "client!qs", name = "d", descriptor = "Z")
	public boolean aBoolean663;

	@OriginalMember(owner = "client!qs", name = "<init>", descriptor = "(Z)V")
	public Class311(@OriginalArg(0) boolean arg0) {
		this.aBoolean663 = arg0;
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(I)V")
	public void method7512() {
		if (this.anInterface5_6 != null) {
			this.anInterface5_6.method9249();
		}
		this.aBoolean662 = false;
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(Z)Z")
	public boolean method7514() {
		return this.aBoolean662 && !this.aBoolean663;
	}
}
