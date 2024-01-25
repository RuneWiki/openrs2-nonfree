import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ida")
public final class Class174 {

	@OriginalMember(owner = "client!ida", name = "g", descriptor = "Z")
	public boolean aBoolean280;

	@OriginalMember(owner = "client!ida", name = "j", descriptor = "Lclient!kl;")
	public Interface11 anInterface11_2;

	@OriginalMember(owner = "client!ida", name = "c", descriptor = "Lclient!kl;")
	public Interface11 anInterface11_3;

	@OriginalMember(owner = "client!ida", name = "i", descriptor = "Z")
	public boolean aBoolean279;

	@OriginalMember(owner = "client!ida", name = "<init>", descriptor = "(Z)V")
	public Class174(@OriginalArg(0) boolean arg0) {
		this.aBoolean279 = arg0;
	}

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(B)Z")
	public boolean method3821() {
		return this.aBoolean280 && !this.aBoolean279;
	}

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(I)V")
	public void method3822() {
		if (this.anInterface11_3 != null) {
			this.anInterface11_3.method6754();
		}
		this.aBoolean280 = false;
	}
}
