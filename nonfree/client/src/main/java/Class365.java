import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public final class Class365 implements Interface17 {

	@OriginalMember(owner = "client!w", name = "h", descriptor = "Lclient!in;")
	private final Class157 aClass157_302;

	@OriginalMember(owner = "client!w", name = "<init>", descriptor = "(Lclient!in;)V")
	public Class365(@OriginalArg(0) Class157 arg0) {
		this.aClass157_302 = arg0;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(I)I")
	@Override
	public int method8981() {
		return this.aClass157_302.method4555() ? 100 : this.aClass157_302.method4552();
	}

	@OriginalMember(owner = "client!w", name = "b", descriptor = "(I)Lclient!kea;")
	@Override
	public Class176 method8982() {
		return Static288.aClass176_1;
	}
}
