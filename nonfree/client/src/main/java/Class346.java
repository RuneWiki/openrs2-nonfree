import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ut")
public final class Class346 implements Interface26 {

	@OriginalMember(owner = "client!ut", name = "b", descriptor = "Lclient!oh;")
	private final Class237 aClass237_140;

	@OriginalMember(owner = "client!ut", name = "<init>", descriptor = "(Lclient!oh;)V")
	public Class346(@OriginalArg(0) Class237 arg0) {
		this.aClass237_140 = arg0;
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(Z)I")
	@Override
	public int method8361() {
		return this.aClass237_140.method6312() ? 100 : this.aClass237_140.method6320();
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(B)Lclient!vca;")
	@Override
	public Class353 method8362() {
		return Static592.aClass353_2;
	}
}
