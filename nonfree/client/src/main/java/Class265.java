import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public final class Class265 {

	@OriginalMember(owner = "client!wf", name = "h", descriptor = "Lclient!vj;")
	private final Class172_Sub2 aClass172_Sub2_42;

	@OriginalMember(owner = "client!wf", name = "e", descriptor = "J")
	public final long aLong224;

	@OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(Lclient!vj;J[Lclient!hq;)V")
	public Class265(@OriginalArg(0) Class172_Sub2 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class104[] arg2) {
		this.aClass172_Sub2_42 = arg0;
		this.aLong224 = arg1;
	}

	@OriginalMember(owner = "client!wf", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass172_Sub2_42.method5612(this.aLong224);
		super.finalize();
	}
}
