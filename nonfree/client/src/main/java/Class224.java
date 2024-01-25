import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mo")
public final class Class224 implements Interface11 {

	@OriginalMember(owner = "client!mo", name = "f", descriptor = "Ljava/lang/String;")
	private final String aString47;

	@OriginalMember(owner = "client!mo", name = "e", descriptor = "Lclient!uu;")
	private final Class343 aClass343_174;

	@OriginalMember(owner = "client!mo", name = "<init>", descriptor = "(Lclient!uu;Ljava/lang/String;)V")
	public Class224(@OriginalArg(0) Class343 arg0, @OriginalArg(1) String arg1) {
		this.aString47 = arg1;
		this.aClass343_174 = arg0;
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(B)I")
	@Override
	public int method8097() {
		return this.aClass343_174.method8140(this.aString47) ? 100 : this.aClass343_174.method8163(this.aString47);
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(I)Lclient!cca;")
	@Override
	public Class44 method8096() {
		return Static61.aClass44_3;
	}
}
