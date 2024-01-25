import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ps")
public final class Class236 {

	@OriginalMember(owner = "client!ps", name = "d", descriptor = "Lclient!nq;")
	public Interface14 anInterface14_5;

	@OriginalMember(owner = "client!ps", name = "f", descriptor = "Lclient!nq;")
	public Interface14 anInterface14_6;

	@OriginalMember(owner = "client!ps", name = "g", descriptor = "Z")
	public boolean aBoolean459;

	@OriginalMember(owner = "client!ps", name = "e", descriptor = "Z")
	public boolean aBoolean458;

	@OriginalMember(owner = "client!ps", name = "<init>", descriptor = "(Z)V")
	public Class236(@OriginalArg(0) boolean arg0) {
		this.aBoolean458 = arg0;
	}

	@OriginalMember(owner = "client!ps", name = "b", descriptor = "(I)V")
	public void method5922() {
		if (this.anInterface14_5 != null) {
			this.anInterface14_5.method3138();
		}
		this.aBoolean459 = false;
	}

	@OriginalMember(owner = "client!ps", name = "c", descriptor = "(I)Z")
	public boolean method5923() {
		return this.aBoolean459 && !this.aBoolean458;
	}
}
