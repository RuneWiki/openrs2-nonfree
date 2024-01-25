import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fs")
public final class Class118 {

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "Z")
	public boolean aBoolean250;

	@OriginalMember(owner = "client!fs", name = "c", descriptor = "Lclient!hh;")
	public Interface11 anInterface11_2;

	@OriginalMember(owner = "client!fs", name = "e", descriptor = "Lclient!hh;")
	public Interface11 anInterface11_3;

	@OriginalMember(owner = "client!fs", name = "f", descriptor = "Z")
	public boolean aBoolean251;

	@OriginalMember(owner = "client!fs", name = "<init>", descriptor = "(Z)V")
	public Class118(@OriginalArg(0) boolean arg0) {
		this.aBoolean251 = arg0;
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(I)Z")
	public boolean method2487() {
		return this.aBoolean250 && !this.aBoolean251;
	}

	@OriginalMember(owner = "client!fs", name = "b", descriptor = "(I)V")
	public void method2488() {
		if (this.anInterface11_3 != null) {
			this.anInterface11_3.method5772();
		}
		this.aBoolean250 = false;
	}
}
