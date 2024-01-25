import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sca")
public final class Class303 {

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "Lclient!kga;")
	public Interface13 anInterface13_7;

	@OriginalMember(owner = "client!sca", name = "f", descriptor = "Z")
	public boolean aBoolean638;

	@OriginalMember(owner = "client!sca", name = "j", descriptor = "Lclient!kga;")
	public Interface13 anInterface13_8;

	@OriginalMember(owner = "client!sca", name = "b", descriptor = "Z")
	public boolean aBoolean637;

	@OriginalMember(owner = "client!sca", name = "<init>", descriptor = "(Z)V")
	public Class303(@OriginalArg(0) boolean arg0) {
		this.aBoolean637 = arg0;
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(B)Z")
	public boolean method7333() {
		return this.aBoolean638 && !this.aBoolean637;
	}

	@OriginalMember(owner = "client!sca", name = "b", descriptor = "(I)V")
	public void method7334() {
		if (this.anInterface13_7 != null) {
			this.anInterface13_7.method6496();
		}
		this.aBoolean638 = false;
	}
}
