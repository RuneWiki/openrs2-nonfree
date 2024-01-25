import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dw")
public final class Class77 {

	@OriginalMember(owner = "client!dw", name = "d", descriptor = "Z")
	public boolean aBoolean169;

	@OriginalMember(owner = "client!dw", name = "e", descriptor = "Lclient!su;")
	public Interface19 anInterface19_5;

	@OriginalMember(owner = "client!dw", name = "j", descriptor = "Lclient!su;")
	public Interface19 anInterface19_6;

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "Z")
	public boolean aBoolean168;

	@OriginalMember(owner = "client!dw", name = "<init>", descriptor = "(Z)V")
	public Class77(@OriginalArg(0) boolean arg0) {
		this.aBoolean168 = arg0;
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(B)V")
	public void method1897() {
		if (this.anInterface19_5 != null) {
			this.anInterface19_5.method6436();
		}
		this.aBoolean169 = false;
	}

	@OriginalMember(owner = "client!dw", name = "c", descriptor = "(B)Z")
	public boolean method1899() {
		return this.aBoolean169 && !this.aBoolean168;
	}
}
