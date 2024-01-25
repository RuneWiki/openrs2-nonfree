import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bda")
public final class Class27 implements Interface21 {

	@OriginalMember(owner = "client!bda", name = "c", descriptor = "Lclient!pu;")
	private final Class270 aClass270_9;

	@OriginalMember(owner = "client!bda", name = "f", descriptor = "Ljava/lang/String;")
	private final String aString8;

	@OriginalMember(owner = "client!bda", name = "<init>", descriptor = "(Lclient!pu;Ljava/lang/String;)V")
	public Class27(@OriginalArg(0) Class270 arg0, @OriginalArg(1) String arg1) {
		this.aClass270_9 = arg0;
		this.aString8 = arg1;
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(B)Lclient!vj;")
	@Override
	public Class344 method7689() {
		return Static558.aClass344_4;
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(I)I")
	@Override
	public int method7690() {
		return this.aClass270_9.method5698(this.aString8) ? 100 : this.aClass270_9.method5693(this.aString8);
	}
}
