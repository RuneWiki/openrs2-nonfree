import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public final class Class65 {

	@OriginalMember(owner = "client!dc", name = "g", descriptor = "J")
	public final long aLong42;

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "Lclient!kw;")
	private final Class5_Sub2 aClass5_Sub2_8;

	@OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(Lclient!kw;J[Lclient!tn;)V")
	public Class65(@OriginalArg(0) Class5_Sub2 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class324[] arg2) {
		this.aLong42 = arg1;
		this.aClass5_Sub2_8 = arg0;
	}

	@OriginalMember(owner = "client!dc", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass5_Sub2_8.method4951(this.aLong42);
		super.finalize();
	}
}
