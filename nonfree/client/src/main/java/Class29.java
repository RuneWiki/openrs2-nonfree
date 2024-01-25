import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bea")
public final class Class29 implements Interface5 {

	@OriginalMember(owner = "client!bea", name = "c", descriptor = "Ljava/lang/String;")
	private final String aString2;

	@OriginalMember(owner = "client!bea", name = "d", descriptor = "Lclient!jn;")
	private final Class176 aClass176_12;

	@OriginalMember(owner = "client!bea", name = "<init>", descriptor = "(Lclient!jn;Ljava/lang/String;)V")
	public Class29(@OriginalArg(0) Class176 arg0, @OriginalArg(1) String arg1) {
		this.aString2 = arg1;
		this.aClass176_12 = arg0;
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(I)I")
	@Override
	public int method7372() {
		return this.aClass176_12.method4004(this.aString2) ? 100 : this.aClass176_12.method3983(this.aString2);
	}

	@OriginalMember(owner = "client!bea", name = "b", descriptor = "(I)Lclient!uv;")
	@Override
	public Class334 method7373() {
		return Static546.aClass334_4;
	}
}
