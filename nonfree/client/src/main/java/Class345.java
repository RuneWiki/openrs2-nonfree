import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vs")
public final class Class345 implements Interface19 {

	@OriginalMember(owner = "client!vs", name = "k", descriptor = "Lclient!pe;")
	private final Class254 aClass254_135;

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "Ljava/lang/String;")
	private final String aString130;

	@OriginalMember(owner = "client!vs", name = "<init>", descriptor = "(Lclient!pe;Ljava/lang/String;)V")
	public Class345(@OriginalArg(0) Class254 arg0, @OriginalArg(1) String arg1) {
		this.aClass254_135 = arg0;
		this.aString130 = arg1;
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(I)Lclient!ev;")
	@Override
	public Class92 method8137() {
		return Static126.aClass92_3;
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(Z)I")
	@Override
	public int method8138() {
		return this.aClass254_135.method6425(this.aString130) ? 100 : this.aClass254_135.method6402(this.aString130);
	}
}
