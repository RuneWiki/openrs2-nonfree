import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pda")
public final class Class265 implements Interface13 {

	@OriginalMember(owner = "client!pda", name = "e", descriptor = "Ljava/lang/String;")
	private final String aString81;

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "Lclient!bi;")
	private final Class31 aClass31_87;

	@OriginalMember(owner = "client!pda", name = "<init>", descriptor = "(Lclient!bi;Ljava/lang/String;)V")
	public Class265(@OriginalArg(0) Class31 arg0, @OriginalArg(1) String arg1) {
		this.aString81 = arg1;
		this.aClass31_87 = arg0;
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(B)Lclient!iaa;")
	@Override
	public Class153 method5812() {
		return Static211.aClass153_3;
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(I)I")
	@Override
	public int method5811() {
		return this.aClass31_87.method652(this.aString81) ? 100 : this.aClass31_87.method676(this.aString81);
	}
}
