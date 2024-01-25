import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public final class Class337 implements Interface11 {

	@OriginalMember(owner = "client!uj", name = "h", descriptor = "Lclient!uu;")
	private final Class343 aClass343_256;

	@OriginalMember(owner = "client!uj", name = "i", descriptor = "Ljava/lang/String;")
	private final String aString89;

	@OriginalMember(owner = "client!uj", name = "<init>", descriptor = "(Lclient!uu;Ljava/lang/String;)V")
	public Class337(@OriginalArg(0) Class343 arg0, @OriginalArg(1) String arg1) {
		this.aClass343_256 = arg0;
		this.aString89 = arg1;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(B)I")
	@Override
	public int method8097() {
		return this.aClass343_256.method8150(this.aString89) ? 100 : 0;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(I)Lclient!cca;")
	@Override
	public Class44 method8096() {
		return Static61.aClass44_2;
	}
}
