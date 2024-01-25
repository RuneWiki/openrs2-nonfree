import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rv")
public final class Class300 {

	@OriginalMember(owner = "client!rv", name = "b", descriptor = "J")
	public final long aLong224;

	@OriginalMember(owner = "client!rv", name = "e", descriptor = "Lclient!wh;")
	private final Class100_Sub3 aClass100_Sub3_38;

	@OriginalMember(owner = "client!rv", name = "<init>", descriptor = "(Lclient!wh;J[Lclient!wj;)V")
	public Class300(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class375[] arg2) {
		this.aLong224 = arg1;
		this.aClass100_Sub3_38 = arg0;
	}

	@OriginalMember(owner = "client!rv", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass100_Sub3_38.method8914(this.aLong224);
		super.finalize();
	}
}
