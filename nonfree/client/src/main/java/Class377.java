import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vw")
public final class Class377 implements Interface18 {

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "Lclient!wia;")
	private final Class386 aClass386_137;

	@OriginalMember(owner = "client!vw", name = "<init>", descriptor = "(Lclient!wia;)V")
	public Class377(@OriginalArg(0) Class386 arg0) {
		this.aClass386_137 = arg0;
	}

	@OriginalMember(owner = "client!vw", name = "b", descriptor = "(I)I")
	@Override
	public int method9016() {
		return this.aClass386_137.method9207() ? 100 : this.aClass386_137.method9204();
	}

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(I)Lclient!lj;")
	@Override
	public Class214 method9015() {
		return Static336.aClass214_1;
	}
}
