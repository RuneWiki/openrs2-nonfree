import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fba")
public final class Class95 implements Interface5 {

	@OriginalMember(owner = "client!fba", name = "i", descriptor = "Lclient!jn;")
	private final Class176 aClass176_39;

	@OriginalMember(owner = "client!fba", name = "c", descriptor = "Ljava/lang/String;")
	private final String aString20;

	@OriginalMember(owner = "client!fba", name = "<init>", descriptor = "(Lclient!jn;Ljava/lang/String;)V")
	public Class95(@OriginalArg(0) Class176 arg0, @OriginalArg(1) String arg1) {
		this.aClass176_39 = arg0;
		this.aString20 = arg1;
	}

	@OriginalMember(owner = "client!fba", name = "b", descriptor = "(I)Lclient!uv;")
	@Override
	public Class334 method7373() {
		return Static546.aClass334_3;
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(I)I")
	@Override
	public int method7372() {
		return this.aClass176_39.method3989(this.aString20) ? 100 : 0;
	}
}
