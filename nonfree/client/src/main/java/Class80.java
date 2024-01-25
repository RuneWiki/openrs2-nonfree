import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public final class Class80 implements Interface14 {

	@OriginalMember(owner = "client!eb", name = "h", descriptor = "Ljava/lang/String;")
	private final String aString22;

	@OriginalMember(owner = "client!eb", name = "g", descriptor = "Lclient!aj;")
	private final Class15 aClass15_38;

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(Lclient!aj;Ljava/lang/String;)V")
	public Class80(@OriginalArg(0) Class15 arg0, @OriginalArg(1) String arg1) {
		this.aString22 = arg1;
		this.aClass15_38 = arg0;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(B)I")
	@Override
	public int method8681() {
		return this.aClass15_38.method537(this.aString22) ? 100 : 0;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)Lclient!jq;")
	@Override
	public Class174 method8680() {
		return Static286.aClass174_3;
	}
}
