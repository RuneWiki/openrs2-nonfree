import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public final class Class193 {

	@OriginalMember(owner = "client!li", name = "d", descriptor = "Z")
	public boolean aBoolean380;

	@OriginalMember(owner = "client!li", name = "g", descriptor = "Lclient!mda;")
	public Interface13 anInterface13_5;

	@OriginalMember(owner = "client!li", name = "i", descriptor = "Lclient!mda;")
	public Interface13 anInterface13_6;

	@OriginalMember(owner = "client!li", name = "b", descriptor = "Z")
	public boolean aBoolean379;

	@OriginalMember(owner = "client!li", name = "<init>", descriptor = "(Z)V")
	public Class193(@OriginalArg(0) boolean arg0) {
		this.aBoolean379 = arg0;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(Z)V")
	public void method4455() {
		if (this.anInterface13_6 != null) {
			this.anInterface13_6.method6436();
		}
		this.aBoolean380 = false;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(I)Z")
	public boolean method4457() {
		return this.aBoolean380 && !this.aBoolean379;
	}
}
