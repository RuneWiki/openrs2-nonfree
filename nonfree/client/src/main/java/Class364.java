import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public final class Class364 {

	@OriginalMember(owner = "client!vc", name = "i", descriptor = "Lclient!ffa;")
	private final Class57_Sub2 aClass57_Sub2_39;

	@OriginalMember(owner = "client!vc", name = "f", descriptor = "J")
	public final long aLong292;

	@OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(Lclient!ffa;J[Lclient!wj;)V")
	public Class364(@OriginalArg(0) Class57_Sub2 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class388[] arg2) {
		this.aClass57_Sub2_39 = arg0;
		this.aLong292 = arg1;
	}

	@OriginalMember(owner = "client!vc", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass57_Sub2_39.method2371(this.aLong292);
		super.finalize();
	}
}
