import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public final class Class262 implements Interface17 {

	@OriginalMember(owner = "client!pl", name = "c", descriptor = "Ljava/lang/String;")
	private final String aString84;

	@OriginalMember(owner = "client!pl", name = "e", descriptor = "Lclient!la;")
	private final Class196 aClass196_91;

	@OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(Lclient!la;Ljava/lang/String;)V")
	public Class262(@OriginalArg(0) Class196 arg0, @OriginalArg(1) String arg1) {
		this.aString84 = arg1;
		this.aClass196_91 = arg0;
	}

	@OriginalMember(owner = "client!pl", name = "b", descriptor = "(I)Lclient!wea;")
	@Override
	public Class370 method6809() {
		return Static623.aClass370_4;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(I)I")
	@Override
	public int method6808() {
		return this.aClass196_91.method5106(this.aString84) ? 100 : this.aClass196_91.method5105(this.aString84);
	}
}
