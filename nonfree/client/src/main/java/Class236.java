import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public final class Class236 {

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "Lclient!af;")
	public Interface1 anInterface1_4;

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "Lclient!af;")
	public Interface1 anInterface1_5;

	@OriginalMember(owner = "client!qc", name = "h", descriptor = "Z")
	public boolean aBoolean447;

	@OriginalMember(owner = "client!qc", name = "e", descriptor = "Z")
	public boolean aBoolean446;

	@OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(Z)V")
	public Class236(@OriginalArg(0) boolean arg0) {
		this.aBoolean446 = arg0;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Z)V")
	public void method5823() {
		if (this.anInterface1_4 != null) {
			this.anInterface1_4.method7527();
		}
		this.aBoolean447 = false;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)Z")
	public boolean method5824() {
		return this.aBoolean447 && !this.aBoolean446;
	}
}
