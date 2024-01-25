import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public final class Class354 implements Interface21 {

	@OriginalMember(owner = "client!wc", name = "g", descriptor = "Ljava/lang/String;")
	private final String aString98;

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "Lclient!pu;")
	private final Class270 aClass270_118;

	@OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(Lclient!pu;Ljava/lang/String;)V")
	public Class354(@OriginalArg(0) Class270 arg0, @OriginalArg(1) String arg1) {
		this.aString98 = arg1;
		this.aClass270_118 = arg0;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(B)Lclient!vj;")
	@Override
	public Class344 method7689() {
		return Static558.aClass344_3;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)I")
	@Override
	public int method7690() {
		return this.aClass270_118.method5703(this.aString98) ? 100 : 0;
	}
}
