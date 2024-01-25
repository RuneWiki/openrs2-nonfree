import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hia")
public final class Class149 {

	@OriginalMember(owner = "client!hia", name = "g", descriptor = "J")
	public final long aLong98;

	@OriginalMember(owner = "client!hia", name = "b", descriptor = "Lclient!jc;")
	private final Class65_Sub2_Sub2 aClass65_Sub2_Sub2_4;

	@OriginalMember(owner = "client!hia", name = "<init>", descriptor = "(Lclient!jc;J[Lclient!kga;)V")
	public Class149(@OriginalArg(0) Class65_Sub2_Sub2 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class195[] arg2) {
		this.aLong98 = arg1;
		this.aClass65_Sub2_Sub2_4 = arg0;
	}

	@OriginalMember(owner = "client!hia", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass65_Sub2_Sub2_4.method4486(this.aLong98);
		super.finalize();
	}
}
