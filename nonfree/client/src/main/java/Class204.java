import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public final class Class204 implements Interface13 {

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "Ljava/lang/String;")
	private final String aString69;

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "Lclient!bi;")
	private final Class31 aClass31_64;

	@OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(Lclient!bi;Ljava/lang/String;)V")
	public Class204(@OriginalArg(0) Class31 arg0, @OriginalArg(1) String arg1) {
		this.aString69 = arg1;
		this.aClass31_64 = arg0;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)I")
	@Override
	public int method5811() {
		return this.aClass31_64.method680(this.aString69) ? 100 : 0;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)Lclient!iaa;")
	@Override
	public Class153 method5812() {
		return Static211.aClass153_2;
	}
}
