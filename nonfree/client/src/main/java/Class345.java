import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public final class Class345 {

	@OriginalMember(owner = "client!td", name = "f", descriptor = "Z")
	public boolean aBoolean594;

	@OriginalMember(owner = "client!td", name = "h", descriptor = "Lclient!lp;")
	public Interface20 anInterface20_6;

	@OriginalMember(owner = "client!td", name = "k", descriptor = "Lclient!lp;")
	public Interface20 anInterface20_7;

	@OriginalMember(owner = "client!td", name = "e", descriptor = "Z")
	public boolean aBoolean595;

	@OriginalMember(owner = "client!td", name = "<init>", descriptor = "(Z)V")
	public Class345(@OriginalArg(0) boolean arg0) {
		this.aBoolean595 = arg0;
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(I)Z")
	public boolean method7682() {
		return this.aBoolean594 && !this.aBoolean595;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(B)V")
	public void method7686() {
		if (this.anInterface20_7 != null) {
			this.anInterface20_7.method7351();
		}
		this.aBoolean594 = false;
	}
}
