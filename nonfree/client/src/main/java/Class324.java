import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public final class Class324 {

	@OriginalMember(owner = "client!tn", name = "e", descriptor = "J")
	public final long aLong248;

	@OriginalMember(owner = "client!tn", name = "c", descriptor = "Lclient!kw;")
	private final Class5_Sub2 aClass5_Sub2_38;

	@OriginalMember(owner = "client!tn", name = "<init>", descriptor = "(Lclient!kw;JI)V")
	public Class324(@OriginalArg(0) Class5_Sub2 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		this.aLong248 = arg1;
		this.aClass5_Sub2_38 = arg0;
	}

	@OriginalMember(owner = "client!tn", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass5_Sub2_38.method4951(this.aLong248);
		super.finalize();
	}
}
