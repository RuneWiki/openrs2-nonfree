import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public final class Class316 implements Interface2 {

	@OriginalMember(owner = "client!sf", name = "d", descriptor = "Ljava/lang/String;")
	private final String aString100;

	@OriginalMember(owner = "client!sf", name = "e", descriptor = "Lclient!wu;")
	private final Class380 aClass380_115;

	@OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(Lclient!wu;Ljava/lang/String;)V")
	public Class316(@OriginalArg(0) Class380 arg0, @OriginalArg(1) String arg1) {
		this.aString100 = arg1;
		this.aClass380_115 = arg0;
	}

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(I)I")
	@Override
	public int method7205() {
		return this.aClass380_115.method8624(this.aString100) ? 100 : 0;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)Lclient!vm;")
	@Override
	public Class365 method7204() {
		return Static605.aClass365_3;
	}
}
