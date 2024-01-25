import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public final class Class98 {

	@OriginalMember(owner = "client!fg", name = "e", descriptor = "J")
	public final long aLong93;

	@OriginalMember(owner = "client!fg", name = "c", descriptor = "Lclient!hl;")
	private final Class5_Sub2_Sub2 aClass5_Sub2_Sub2_4;

	@OriginalMember(owner = "client!fg", name = "<init>", descriptor = "(Lclient!hl;J[Lclient!on;)V")
	public Class98(@OriginalArg(0) Class5_Sub2_Sub2 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class246[] arg2) {
		this.aLong93 = arg1;
		this.aClass5_Sub2_Sub2_4 = arg0;
	}

	@OriginalMember(owner = "client!fg", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass5_Sub2_Sub2_4.method4072(this.aLong93);
		super.finalize();
	}
}
