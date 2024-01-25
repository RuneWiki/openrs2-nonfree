import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public final class Class89 {

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "Z")
	public boolean aBoolean162;

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "Lclient!oq;")
	public Interface14 anInterface14_2;

	@OriginalMember(owner = "client!ef", name = "f", descriptor = "Lclient!oq;")
	public Interface14 anInterface14_3;

	@OriginalMember(owner = "client!ef", name = "e", descriptor = "Z")
	public boolean aBoolean163;

	@OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(Z)V")
	public Class89(@OriginalArg(0) boolean arg0) {
		this.aBoolean163 = arg0;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Z)V")
	public void method1845() {
		if (this.anInterface14_2 != null) {
			this.anInterface14_2.method6765();
		}
		this.aBoolean162 = false;
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(I)Z")
	public boolean method1846() {
		return this.aBoolean162 && !this.aBoolean163;
	}
}
