import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public final class Class152 {

	@OriginalMember(owner = "client!hd", name = "d", descriptor = "Z")
	public boolean aBoolean235;

	@OriginalMember(owner = "client!hd", name = "i", descriptor = "Lclient!lq;")
	public Interface14 anInterface14_2;

	@OriginalMember(owner = "client!hd", name = "e", descriptor = "Lclient!lq;")
	public Interface14 anInterface14_3;

	@OriginalMember(owner = "client!hd", name = "m", descriptor = "Z")
	public boolean aBoolean234;

	@OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(Z)V")
	public Class152(@OriginalArg(0) boolean arg0) {
		this.aBoolean234 = arg0;
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(I)V")
	public void method3390() {
		if (this.anInterface14_3 != null) {
			this.anInterface14_3.method6754();
		}
		this.aBoolean235 = false;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(B)Z")
	public boolean method3393() {
		return this.aBoolean235 && !this.aBoolean234;
	}
}
