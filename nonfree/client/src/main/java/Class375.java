import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public final class Class375 {

	@OriginalMember(owner = "client!wj", name = "c", descriptor = "Lclient!wh;")
	private final Class100_Sub3 aClass100_Sub3_43;

	@OriginalMember(owner = "client!wj", name = "g", descriptor = "J")
	public final long aLong276;

	@OriginalMember(owner = "client!wj", name = "<init>", descriptor = "(Lclient!wh;JI)V")
	public Class375(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		this.aClass100_Sub3_43 = arg0;
		this.aLong276 = arg1;
	}

	@OriginalMember(owner = "client!wj", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass100_Sub3_43.method8914(this.aLong276);
		super.finalize();
	}
}
