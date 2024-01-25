import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public final class Class199 implements Interface13 {

	@OriginalMember(owner = "client!km", name = "a", descriptor = "Lclient!bi;")
	private final Class31 aClass31_61;

	@OriginalMember(owner = "client!km", name = "<init>", descriptor = "(Lclient!bi;)V")
	public Class199(@OriginalArg(0) Class31 arg0) {
		this.aClass31_61 = arg0;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(I)I")
	@Override
	public int method5811() {
		return this.aClass31_61.method663() ? 100 : this.aClass31_61.method656();
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(B)Lclient!iaa;")
	@Override
	public Class153 method5812() {
		return Static211.aClass153_1;
	}
}
