import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public final class Class66 implements Interface5 {

	@OriginalMember(owner = "client!dk", name = "c", descriptor = "Lclient!jn;")
	private final Class176 aClass176_32;

	@OriginalMember(owner = "client!dk", name = "<init>", descriptor = "(Lclient!jn;)V")
	public Class66(@OriginalArg(0) Class176 arg0) {
		this.aClass176_32 = arg0;
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)I")
	@Override
	public int method7372() {
		return this.aClass176_32.method3975() ? 100 : this.aClass176_32.method4003();
	}

	@OriginalMember(owner = "client!dk", name = "b", descriptor = "(I)Lclient!uv;")
	@Override
	public Class334 method7373() {
		return Static546.aClass334_2;
	}
}
