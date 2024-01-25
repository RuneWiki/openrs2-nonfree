import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public final class Class256 {

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "Z")
	public boolean aBoolean503;

	@OriginalMember(owner = "client!ok", name = "f", descriptor = "Lclient!ip;")
	public Interface13 anInterface13_5;

	@OriginalMember(owner = "client!ok", name = "g", descriptor = "Lclient!ip;")
	public Interface13 anInterface13_6;

	@OriginalMember(owner = "client!ok", name = "m", descriptor = "Z")
	public boolean aBoolean504;

	@OriginalMember(owner = "client!ok", name = "<init>", descriptor = "(Z)V")
	public Class256(@OriginalArg(0) boolean arg0) {
		this.aBoolean504 = arg0;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(B)V")
	public void method5350() {
		if (this.anInterface13_6 != null) {
			this.anInterface13_6.method7032();
		}
		this.aBoolean503 = false;
	}

	@OriginalMember(owner = "client!ok", name = "c", descriptor = "(B)Z")
	public boolean method5354() {
		return this.aBoolean503 && !this.aBoolean504;
	}
}
