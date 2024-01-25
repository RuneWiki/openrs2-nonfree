import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!su")
public final class Class230 {

	@OriginalMember(owner = "client!su", name = "e", descriptor = "Lclient!nq;")
	private final Class167_Sub1 aClass167_Sub1_40;

	@OriginalMember(owner = "client!su", name = "f", descriptor = "J")
	public final long aLong217;

	@OriginalMember(owner = "client!su", name = "<init>", descriptor = "(Lclient!nq;J[Lclient!pb;)V")
	public Class230(@OriginalArg(0) Class167_Sub1 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class184[] arg2) {
		this.aClass167_Sub1_40 = arg0;
		this.aLong217 = arg1;
	}

	@OriginalMember(owner = "client!su", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass167_Sub1_40.method4007(this.aLong217);
		super.finalize();
	}
}
