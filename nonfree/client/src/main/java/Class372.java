import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public final class Class372 implements Interface19 {

	@OriginalMember(owner = "client!vf", name = "i", descriptor = "Lclient!gga;")
	private final Class124 aClass124_128;

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "Ljava/lang/String;")
	private final String aString127;

	@OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(Lclient!gga;Ljava/lang/String;)V")
	public Class372(@OriginalArg(0) Class124 arg0, @OriginalArg(1) String arg1) {
		this.aClass124_128 = arg0;
		this.aString127 = arg1;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(B)Lclient!pw;")
	@Override
	public Class290 method9335() {
		return Static472.aClass290_4;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)I")
	@Override
	public int method9334() {
		return this.aClass124_128.method3612(this.aString127) ? 100 : this.aClass124_128.method3642(this.aString127);
	}
}
