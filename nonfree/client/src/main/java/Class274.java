import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ps")
public final class Class274 implements Interface2 {

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "Lclient!wu;")
	private final Class380 aClass380_103;

	@OriginalMember(owner = "client!ps", name = "<init>", descriptor = "(Lclient!wu;)V")
	public Class274(@OriginalArg(0) Class380 arg0) {
		this.aClass380_103 = arg0;
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(I)Lclient!vm;")
	@Override
	public Class365 method7204() {
		return Static605.aClass365_2;
	}

	@OriginalMember(owner = "client!ps", name = "b", descriptor = "(I)I")
	@Override
	public int method7205() {
		return this.aClass380_103.method8618() ? 100 : this.aClass380_103.method8613();
	}
}
