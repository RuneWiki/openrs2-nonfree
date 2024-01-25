import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public final class Class129 {

	@OriginalMember(owner = "client!hl", name = "d", descriptor = "Lclient!iaa;")
	public Interface9 anInterface9_4;

	@OriginalMember(owner = "client!hl", name = "f", descriptor = "Lclient!iaa;")
	public Interface9 anInterface9_5;

	@OriginalMember(owner = "client!hl", name = "g", descriptor = "Z")
	public boolean aBoolean309;

	@OriginalMember(owner = "client!hl", name = "l", descriptor = "Z")
	public boolean aBoolean311;

	@OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(Z)V")
	public Class129(@OriginalArg(0) boolean arg0) {
		this.aBoolean311 = arg0;
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(I)Z")
	public boolean method3532() {
		return this.aBoolean309 && !this.aBoolean311;
	}

	@OriginalMember(owner = "client!hl", name = "b", descriptor = "(B)V")
	public void method3535() {
		if (this.anInterface9_5 != null) {
			this.anInterface9_5.method7609();
		}
		this.aBoolean309 = false;
	}
}
