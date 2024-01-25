import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bba")
public final class Class21 implements Interface14 {

	@OriginalMember(owner = "client!bba", name = "f", descriptor = "I")
	public final int anInt716;

	@OriginalMember(owner = "client!bba", name = "<init>", descriptor = "(I)V")
	public Class21(@OriginalArg(0) int arg0) {
		this.anInt716 = arg0;
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(I)Lclient!ph;")
	@Override
	public Class260 method6943() {
		return Static501.aClass260_11;
	}
}
