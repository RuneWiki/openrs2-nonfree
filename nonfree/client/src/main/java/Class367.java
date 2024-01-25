import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public final class Class367 {

	@OriginalMember(owner = "client!ul", name = "g", descriptor = "Lclient!fm;")
	public Interface8 anInterface8_7;

	@OriginalMember(owner = "client!ul", name = "h", descriptor = "Z")
	public boolean aBoolean711;

	@OriginalMember(owner = "client!ul", name = "e", descriptor = "Lclient!fm;")
	public Interface8 anInterface8_8;

	@OriginalMember(owner = "client!ul", name = "b", descriptor = "Z")
	public boolean aBoolean712;

	@OriginalMember(owner = "client!ul", name = "<init>", descriptor = "(Z)V")
	public Class367(@OriginalArg(0) boolean arg0) {
		this.aBoolean712 = arg0;
	}

	@OriginalMember(owner = "client!ul", name = "c", descriptor = "(I)V")
	public void method8724() {
		if (this.anInterface8_7 != null) {
			this.anInterface8_7.method5842();
		}
		this.aBoolean711 = false;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(I)Z")
	public boolean method8725() {
		return this.aBoolean711 && !this.aBoolean712;
	}
}
