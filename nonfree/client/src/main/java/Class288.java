import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public final class Class288 {

	@OriginalMember(owner = "client!rj", name = "b", descriptor = "Lclient!vl;")
	public Interface23 anInterface23_6;

	@OriginalMember(owner = "client!rj", name = "d", descriptor = "Lclient!vl;")
	public Interface23 anInterface23_7;

	@OriginalMember(owner = "client!rj", name = "g", descriptor = "Z")
	public boolean aBoolean552;

	@OriginalMember(owner = "client!rj", name = "c", descriptor = "Z")
	public boolean aBoolean551;

	@OriginalMember(owner = "client!rj", name = "<init>", descriptor = "(Z)V")
	public Class288(@OriginalArg(0) boolean arg0) {
		this.aBoolean551 = arg0;
	}

	@OriginalMember(owner = "client!rj", name = "b", descriptor = "(B)Z")
	public boolean method6407() {
		return this.aBoolean552 && !this.aBoolean551;
	}

	@OriginalMember(owner = "client!rj", name = "c", descriptor = "(B)V")
	public void method6408() {
		if (this.anInterface23_6 != null) {
			this.anInterface23_6.method4091();
		}
		this.aBoolean552 = false;
	}
}
