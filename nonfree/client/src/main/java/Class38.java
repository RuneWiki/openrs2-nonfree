import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bw")
public final class Class38 implements Interface15 {

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "Lclient!pfa;")
	private final Class251 aClass251_15;

	@OriginalMember(owner = "client!bw", name = "d", descriptor = "Ljava/lang/String;")
	private final String aString10;

	@OriginalMember(owner = "client!bw", name = "<init>", descriptor = "(Lclient!pfa;Ljava/lang/String;)V")
	public Class38(@OriginalArg(0) Class251 arg0, @OriginalArg(1) String arg1) {
		this.aClass251_15 = arg0;
		this.aString10 = arg1;
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(I)I")
	@Override
	public int method6482() {
		return this.aClass251_15.method5751(this.aString10) ? 100 : 0;
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(B)Lclient!dda;")
	@Override
	public Class64 method6481() {
		return Static84.aClass64_2;
	}
}
