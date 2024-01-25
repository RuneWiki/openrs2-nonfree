import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kfa")
public final class Class199 implements Interface24 {

	@OriginalMember(owner = "client!kfa", name = "f", descriptor = "Lclient!cb;")
	private final Class50 aClass50_84;

	@OriginalMember(owner = "client!kfa", name = "<init>", descriptor = "(Lclient!cb;)V")
	public Class199(@OriginalArg(0) Class50 arg0) {
		this.aClass50_84 = arg0;
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(I)I")
	@Override
	public int method7364() {
		return this.aClass50_84.method898() ? 100 : this.aClass50_84.method921();
	}

	@OriginalMember(owner = "client!kfa", name = "b", descriptor = "(I)Lclient!bja;")
	@Override
	public Class39 method7365() {
		return Static46.aClass39_1;
	}
}
