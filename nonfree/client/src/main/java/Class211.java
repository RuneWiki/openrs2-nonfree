import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public final class Class211 implements Interface8 {

	@OriginalMember(owner = "client!ln", name = "c", descriptor = "Lclient!ae;")
	private final Class8 aClass8_94;

	@OriginalMember(owner = "client!ln", name = "<init>", descriptor = "(Lclient!ae;)V")
	public Class211(@OriginalArg(0) Class8 arg0) {
		this.aClass8_94 = arg0;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(B)I")
	@Override
	public int method9105() {
		return this.aClass8_94.method264() ? 100 : this.aClass8_94.method266();
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(I)Lclient!jea;")
	@Override
	public Class173 method9104() {
		return Static268.aClass173_1;
	}
}
