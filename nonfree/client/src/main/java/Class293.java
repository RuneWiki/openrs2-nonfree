import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rv")
public final class Class293 {

	@OriginalMember(owner = "client!rv", name = "c", descriptor = "Z")
	public boolean aBoolean565;

	@OriginalMember(owner = "client!rv", name = "h", descriptor = "Lclient!og;")
	public Interface15 anInterface15_12;

	@OriginalMember(owner = "client!rv", name = "k", descriptor = "Lclient!og;")
	public Interface15 anInterface15_13;

	@OriginalMember(owner = "client!rv", name = "f", descriptor = "Z")
	public boolean aBoolean566;

	@OriginalMember(owner = "client!rv", name = "<init>", descriptor = "(Z)V")
	public Class293(@OriginalArg(0) boolean arg0) {
		this.aBoolean566 = arg0;
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(B)Z")
	public boolean method6449() {
		return this.aBoolean565 && !this.aBoolean566;
	}

	@OriginalMember(owner = "client!rv", name = "b", descriptor = "(B)V")
	public void method6451() {
		if (this.anInterface15_13 != null) {
			this.anInterface15_13.method7285();
		}
		this.aBoolean565 = false;
	}
}
