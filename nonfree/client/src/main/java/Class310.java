import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sfa")
public final class Class310 implements Interface2 {

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "Ljava/lang/String;")
	private final String aString120;

	@OriginalMember(owner = "client!sfa", name = "d", descriptor = "Lclient!mv;")
	private final Class229 aClass229_116;

	@OriginalMember(owner = "client!sfa", name = "<init>", descriptor = "(Lclient!mv;Ljava/lang/String;)V")
	public Class310(@OriginalArg(0) Class229 arg0, @OriginalArg(1) String arg1) {
		this.aString120 = arg1;
		this.aClass229_116 = arg0;
	}

	@OriginalMember(owner = "client!sfa", name = "b", descriptor = "(B)Lclient!bl;")
	@Override
	public Class36 method6248() {
		return Static43.aClass36_4;
	}

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "(B)I")
	@Override
	public int method6247() {
		return this.aClass229_116.method4959(this.aString120) ? 100 : this.aClass229_116.method4950(this.aString120);
	}
}
