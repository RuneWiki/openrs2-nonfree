import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oca")
public final class Class227 {

	@OriginalMember(owner = "client!oca", name = "b", descriptor = "Lclient!iq;")
	public Interface8 anInterface8_11;

	@OriginalMember(owner = "client!oca", name = "g", descriptor = "Z")
	public boolean aBoolean464;

	@OriginalMember(owner = "client!oca", name = "i", descriptor = "Lclient!iq;")
	public Interface8 anInterface8_12;

	@OriginalMember(owner = "client!oca", name = "j", descriptor = "Z")
	public boolean aBoolean465;

	@OriginalMember(owner = "client!oca", name = "<init>", descriptor = "(Z)V")
	public Class227(@OriginalArg(0) boolean arg0) {
		this.aBoolean465 = arg0;
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(I)Z")
	public boolean method5392() {
		return this.aBoolean464 && !this.aBoolean465;
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(Z)V")
	public void method5393() {
		if (this.anInterface8_11 != null) {
			this.anInterface8_11.method6461();
		}
		this.aBoolean464 = false;
	}
}
