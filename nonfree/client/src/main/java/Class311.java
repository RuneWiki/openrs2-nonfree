import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vt")
public final class Class311 {

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "Z")
	public boolean aBoolean615;

	@OriginalMember(owner = "client!vt", name = "b", descriptor = "Lclient!ql;")
	public Interface15 anInterface15_11;

	@OriginalMember(owner = "client!vt", name = "f", descriptor = "Lclient!ql;")
	public Interface15 anInterface15_12;

	@OriginalMember(owner = "client!vt", name = "h", descriptor = "Z")
	public boolean aBoolean616;

	@OriginalMember(owner = "client!vt", name = "<init>", descriptor = "(Z)V")
	public Class311(@OriginalArg(0) boolean arg0) {
		this.aBoolean616 = arg0;
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(I)V")
	public void method7437() {
		if (this.anInterface15_12 != null) {
			this.anInterface15_12.method7527();
		}
		this.aBoolean615 = false;
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(B)Z")
	public boolean method7440() {
		return this.aBoolean615 && !this.aBoolean616;
	}
}
