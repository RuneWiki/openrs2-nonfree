import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oq")
public final class Class243 implements Interface8 {

	@OriginalMember(owner = "client!oq", name = "b", descriptor = "Lclient!ri;")
	private final Class284 aClass284_114;

	@OriginalMember(owner = "client!oq", name = "<init>", descriptor = "(Lclient!ri;)V")
	public Class243(@OriginalArg(0) Class284 arg0) {
		this.aClass284_114 = arg0;
	}

	@OriginalMember(owner = "client!oq", name = "b", descriptor = "(I)Lclient!cj;")
	@Override
	public Class56 method7898() {
		return Static67.aClass56_1;
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(I)I")
	@Override
	public int method7897() {
		return this.aClass284_114.method6321() ? 100 : this.aClass284_114.method6350();
	}
}
