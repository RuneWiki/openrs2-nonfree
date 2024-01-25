import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public final class Class233 implements Interface15 {

	@OriginalMember(owner = "client!od", name = "b", descriptor = "Lclient!pfa;")
	private final Class251 aClass251_85;

	@OriginalMember(owner = "client!od", name = "<init>", descriptor = "(Lclient!pfa;)V")
	public Class233(@OriginalArg(0) Class251 arg0) {
		this.aClass251_85 = arg0;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(I)I")
	@Override
	public int method6482() {
		return this.aClass251_85.method5758() ? 100 : this.aClass251_85.method5771();
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(B)Lclient!dda;")
	@Override
	public Class64 method6481() {
		return Static84.aClass64_1;
	}
}
