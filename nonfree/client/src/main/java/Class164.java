import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public final class Class164 {

	@OriginalMember(owner = "client!hn", name = "j", descriptor = "Z")
	public boolean aBoolean344;

	@OriginalMember(owner = "client!hn", name = "l", descriptor = "Lclient!uh;")
	public Interface24 anInterface24_4;

	@OriginalMember(owner = "client!hn", name = "h", descriptor = "Lclient!uh;")
	public Interface24 anInterface24_5;

	@OriginalMember(owner = "client!hn", name = "i", descriptor = "Z")
	public boolean aBoolean345;

	@OriginalMember(owner = "client!hn", name = "<init>", descriptor = "(Z)V")
	public Class164(@OriginalArg(0) boolean arg0) {
		this.aBoolean345 = arg0;
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(Z)V")
	public void method3460() {
		if (this.anInterface24_5 != null) {
			this.anInterface24_5.method9218();
		}
		this.aBoolean344 = false;
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(I)Z")
	public boolean method3463() {
		return this.aBoolean344 && !this.aBoolean345;
	}
}
