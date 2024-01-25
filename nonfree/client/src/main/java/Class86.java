import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!go")
public final class Class86 {

	@OriginalMember(owner = "client!go", name = "a", descriptor = "Lclient!gk;")
	private final Class75_Sub2 aClass75_Sub2_16;

	@OriginalMember(owner = "client!go", name = "b", descriptor = "J")
	public final long aLong89;

	@OriginalMember(owner = "client!go", name = "<init>", descriptor = "(Lclient!gk;JI)V")
	public Class86(@OriginalArg(0) Class75_Sub2 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		this.aClass75_Sub2_16 = arg0;
		this.aLong89 = arg1;
	}

	@OriginalMember(owner = "client!go", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass75_Sub2_16.method2474(this.aLong89);
		super.finalize();
	}
}
