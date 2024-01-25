import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public final class Class29 {

	@OriginalMember(owner = "client!bh", name = "d", descriptor = "Z")
	public boolean aBoolean35;

	@OriginalMember(owner = "client!bh", name = "g", descriptor = "Lclient!sp;")
	public Interface13 anInterface13_2;

	@OriginalMember(owner = "client!bh", name = "j", descriptor = "Lclient!sp;")
	public Interface13 anInterface13_3;

	@OriginalMember(owner = "client!bh", name = "k", descriptor = "Z")
	public boolean aBoolean36;

	@OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(Z)V")
	public Class29(@OriginalArg(0) boolean arg0) {
		this.aBoolean36 = arg0;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(I)Z")
	public boolean method837() {
		return this.aBoolean35 && !this.aBoolean36;
	}

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "(B)V")
	public void method839() {
		if (this.anInterface13_2 != null) {
			this.anInterface13_2.method3493();
		}
		this.aBoolean35 = false;
	}
}
