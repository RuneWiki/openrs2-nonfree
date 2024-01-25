import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aw")
public final class Class25 implements Interface12 {

	@OriginalMember(owner = "client!aw", name = "f", descriptor = "Lclient!tf;")
	private final Class322 aClass322_8;

	@OriginalMember(owner = "client!aw", name = "<init>", descriptor = "(Lclient!tf;)V")
	public Class25(@OriginalArg(0) Class322 arg0) {
		this.aClass322_8 = arg0;
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(I)I")
	@Override
	public int method6883() {
		return this.aClass322_8.method6809() ? 100 : this.aClass322_8.method6826();
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(B)Lclient!dea;")
	@Override
	public Class68 method6882() {
		return Static90.aClass68_1;
	}
}
