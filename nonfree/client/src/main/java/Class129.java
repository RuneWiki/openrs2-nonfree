import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gga")
public final class Class129 implements Interface24 {

	@OriginalMember(owner = "client!gga", name = "b", descriptor = "Ljava/lang/String;")
	private final String aString30;

	@OriginalMember(owner = "client!gga", name = "c", descriptor = "Lclient!cb;")
	private final Class50 aClass50_48;

	@OriginalMember(owner = "client!gga", name = "<init>", descriptor = "(Lclient!cb;Ljava/lang/String;)V")
	public Class129(@OriginalArg(0) Class50 arg0, @OriginalArg(1) String arg1) {
		this.aString30 = arg1;
		this.aClass50_48 = arg0;
	}

	@OriginalMember(owner = "client!gga", name = "b", descriptor = "(I)Lclient!bja;")
	@Override
	public Class39 method7365() {
		return Static46.aClass39_2;
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(I)I")
	@Override
	public int method7364() {
		return this.aClass50_48.method896(this.aString30) ? 100 : 0;
	}
}
