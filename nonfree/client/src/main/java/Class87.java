import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public final class Class87 implements Interface14 {

	@OriginalMember(owner = "client!ed", name = "e", descriptor = "Lclient!wu;")
	private final Class384 aClass384_34;

	@OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(Lclient!wu;)V")
	public Class87(@OriginalArg(0) Class384 arg0) {
		this.aClass384_34 = arg0;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(B)Lclient!saa;")
	@Override
	public Class309 method3687() {
		return Static508.aClass309_2;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)I")
	@Override
	public int method3686() {
		return this.aClass384_34.method8877() ? 100 : this.aClass384_34.method8896();
	}
}
