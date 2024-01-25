import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cr")
public final class Class57 implements Interface12 {

	@OriginalMember(owner = "client!cr", name = "c", descriptor = "Lclient!tf;")
	private final Class322 aClass322_28;

	@OriginalMember(owner = "client!cr", name = "b", descriptor = "Ljava/lang/String;")
	private final String aString9;

	@OriginalMember(owner = "client!cr", name = "<init>", descriptor = "(Lclient!tf;Ljava/lang/String;)V")
	public Class57(@OriginalArg(0) Class322 arg0, @OriginalArg(1) String arg1) {
		this.aClass322_28 = arg0;
		this.aString9 = arg1;
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(B)Lclient!dea;")
	@Override
	public Class68 method6882() {
		return Static90.aClass68_2;
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(I)I")
	@Override
	public int method6883() {
		return this.aClass322_28.method6814(this.aString9) ? 100 : 0;
	}
}
