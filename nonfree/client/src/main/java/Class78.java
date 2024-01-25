import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dr")
public final class Class78 implements Interface2 {

	@OriginalMember(owner = "client!dr", name = "d", descriptor = "Ljava/lang/String;")
	private final String aString18;

	@OriginalMember(owner = "client!dr", name = "i", descriptor = "Lclient!wu;")
	private final Class380 aClass380_35;

	@OriginalMember(owner = "client!dr", name = "<init>", descriptor = "(Lclient!wu;Ljava/lang/String;)V")
	public Class78(@OriginalArg(0) Class380 arg0, @OriginalArg(1) String arg1) {
		this.aString18 = arg1;
		this.aClass380_35 = arg0;
	}

	@OriginalMember(owner = "client!dr", name = "b", descriptor = "(I)I")
	@Override
	public int method7205() {
		return this.aClass380_35.method8641(this.aString18) ? 100 : this.aClass380_35.method8606(this.aString18);
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(I)Lclient!vm;")
	@Override
	public Class365 method7204() {
		return Static605.aClass365_4;
	}
}
