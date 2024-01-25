import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nr")
public final class Class204 {

	@OriginalMember(owner = "client!nr", name = "f", descriptor = "Z")
	public boolean aBoolean465;

	@OriginalMember(owner = "client!nr", name = "g", descriptor = "Lclient!rq;")
	public Interface16 anInterface16_8;

	@OriginalMember(owner = "client!nr", name = "i", descriptor = "Lclient!rq;")
	public Interface16 anInterface16_9;

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "Z")
	public boolean aBoolean464;

	@OriginalMember(owner = "client!nr", name = "<init>", descriptor = "(Z)V")
	public Class204(@OriginalArg(0) boolean arg0) {
		this.aBoolean464 = arg0;
	}

	@OriginalMember(owner = "client!nr", name = "c", descriptor = "(I)V")
	public void method5627() {
		if (this.anInterface16_8 != null) {
			this.anInterface16_8.method7609();
		}
		this.aBoolean465 = false;
	}

	@OriginalMember(owner = "client!nr", name = "d", descriptor = "(I)Z")
	public boolean method5628() {
		return this.aBoolean465 && !this.aBoolean464;
	}
}
