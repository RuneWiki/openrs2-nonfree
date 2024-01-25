import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public final class Class328 implements Interface12 {

	@OriginalMember(owner = "client!tl", name = "f", descriptor = "Ljava/lang/String;")
	private final String aString79;

	@OriginalMember(owner = "client!tl", name = "c", descriptor = "Lclient!tf;")
	private final Class322 aClass322_140;

	@OriginalMember(owner = "client!tl", name = "<init>", descriptor = "(Lclient!tf;Ljava/lang/String;)V")
	public Class328(@OriginalArg(0) Class322 arg0, @OriginalArg(1) String arg1) {
		this.aString79 = arg1;
		this.aClass322_140 = arg0;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(B)Lclient!dea;")
	@Override
	public Class68 method6882() {
		return Static90.aClass68_3;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(I)I")
	@Override
	public int method6883() {
		return this.aClass322_140.method6818(this.aString79) ? 100 : this.aClass322_140.method6828(this.aString79);
	}
}
