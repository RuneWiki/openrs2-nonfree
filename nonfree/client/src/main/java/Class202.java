import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public final class Class202 implements Interface19 {

	@OriginalMember(owner = "client!ln", name = "h", descriptor = "Lclient!pe;")
	private final Class254 aClass254_87;

	@OriginalMember(owner = "client!ln", name = "d", descriptor = "Ljava/lang/String;")
	private final String aString65;

	@OriginalMember(owner = "client!ln", name = "<init>", descriptor = "(Lclient!pe;Ljava/lang/String;)V")
	public Class202(@OriginalArg(0) Class254 arg0, @OriginalArg(1) String arg1) {
		this.aClass254_87 = arg0;
		this.aString65 = arg1;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(Z)I")
	@Override
	public int method8138() {
		return this.aClass254_87.method6407(this.aString65) ? 100 : 0;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(I)Lclient!ev;")
	@Override
	public Class92 method8137() {
		return Static126.aClass92_2;
	}
}
