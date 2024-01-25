import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bca")
public final class Class28 implements Interface26 {

	@OriginalMember(owner = "client!bca", name = "g", descriptor = "Lclient!oh;")
	private final Class237 aClass237_11;

	@OriginalMember(owner = "client!bca", name = "l", descriptor = "Ljava/lang/String;")
	private final String aString10;

	@OriginalMember(owner = "client!bca", name = "<init>", descriptor = "(Lclient!oh;Ljava/lang/String;)V")
	public Class28(@OriginalArg(0) Class237 arg0, @OriginalArg(1) String arg1) {
		this.aClass237_11 = arg0;
		this.aString10 = arg1;
	}

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(B)Lclient!vca;")
	@Override
	public Class353 method8362() {
		return Static592.aClass353_4;
	}

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(Z)I")
	@Override
	public int method8361() {
		return this.aClass237_11.method6299(this.aString10) ? 100 : this.aClass237_11.method6309(this.aString10);
	}
}
