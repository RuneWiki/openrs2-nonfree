import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public final class Class293 {

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "Z")
	public boolean aBoolean621;

	@OriginalMember(owner = "client!rh", name = "c", descriptor = "Lclient!caa;")
	public Interface3 anInterface3_17;

	@OriginalMember(owner = "client!rh", name = "i", descriptor = "Lclient!caa;")
	public Interface3 anInterface3_18;

	@OriginalMember(owner = "client!rh", name = "k", descriptor = "Z")
	public boolean aBoolean622;

	@OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(Z)V")
	public Class293(@OriginalArg(0) boolean arg0) {
		this.aBoolean622 = arg0;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)V")
	public void method6973() {
		if (this.anInterface3_18 != null) {
			this.anInterface3_18.method7671();
		}
		this.aBoolean621 = false;
	}

	@OriginalMember(owner = "client!rh", name = "d", descriptor = "(I)Z")
	public boolean method6979() {
		return this.aBoolean621 && !this.aBoolean622;
	}
}
