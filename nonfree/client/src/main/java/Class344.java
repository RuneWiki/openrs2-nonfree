import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vq")
public final class Class344 {

	@OriginalMember(owner = "client!vq", name = "c", descriptor = "Z")
	public boolean aBoolean833;

	@OriginalMember(owner = "client!vq", name = "e", descriptor = "Lclient!cu;")
	public Interface2 anInterface2_11;

	@OriginalMember(owner = "client!vq", name = "h", descriptor = "Lclient!cu;")
	public Interface2 anInterface2_12;

	@OriginalMember(owner = "client!vq", name = "g", descriptor = "Z")
	public boolean aBoolean834;

	@OriginalMember(owner = "client!vq", name = "<init>", descriptor = "(Z)V")
	public Class344(@OriginalArg(0) boolean arg0) {
		this.aBoolean834 = arg0;
	}

	@OriginalMember(owner = "client!vq", name = "b", descriptor = "(I)V")
	public void method8134() {
		if (this.anInterface2_11 != null) {
			this.anInterface2_11.method6239();
		}
		this.aBoolean833 = false;
	}

	@OriginalMember(owner = "client!vq", name = "c", descriptor = "(I)Z")
	public boolean method8135() {
		return this.aBoolean833 && !this.aBoolean834;
	}
}
