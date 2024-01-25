import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rt")
public final class Class294 implements Interface15 {

	@OriginalMember(owner = "client!rt", name = "c", descriptor = "Lclient!pfa;")
	private final Class251 aClass251_109;

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "Ljava/lang/String;")
	private final String aString80;

	@OriginalMember(owner = "client!rt", name = "<init>", descriptor = "(Lclient!pfa;Ljava/lang/String;)V")
	public Class294(@OriginalArg(0) Class251 arg0, @OriginalArg(1) String arg1) {
		this.aClass251_109 = arg0;
		this.aString80 = arg1;
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(I)I")
	@Override
	public int method6482() {
		return this.aClass251_109.method5753(this.aString80) ? 100 : this.aClass251_109.method5756(this.aString80);
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(B)Lclient!dda;")
	@Override
	public Class64 method6481() {
		return Static84.aClass64_3;
	}
}
