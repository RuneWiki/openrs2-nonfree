import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hca")
public final class Class132 {

	@OriginalMember(owner = "client!hca", name = "c", descriptor = "Lclient!ok;")
	private final Class134_Sub2 aClass134_Sub2_15;

	@OriginalMember(owner = "client!hca", name = "b", descriptor = "J")
	public final long aLong105;

	@OriginalMember(owner = "client!hca", name = "<init>", descriptor = "(Lclient!ok;J[Lclient!kfa;)V")
	public Class132(@OriginalArg(0) Class134_Sub2 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class189[] arg2) {
		this.aClass134_Sub2_15 = arg0;
		this.aLong105 = arg1;
	}

	@OriginalMember(owner = "client!hca", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass134_Sub2_15.method5248(this.aLong105);
		super.finalize();
	}
}
