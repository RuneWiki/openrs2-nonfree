import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public final class Class63 {

	@OriginalMember(owner = "client!ej", name = "b", descriptor = "Lclient!bt;")
	private final Class30_Sub1 aClass30_Sub1_9;

	@OriginalMember(owner = "client!ej", name = "e", descriptor = "J")
	public final long aLong62;

	@OriginalMember(owner = "client!ej", name = "<init>", descriptor = "(Lclient!bt;J[Lclient!bn;)V")
	public Class63(@OriginalArg(0) Class30_Sub1 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class27[] arg2) {
		this.aClass30_Sub1_9 = arg0;
		this.aLong62 = arg1;
	}

	@OriginalMember(owner = "client!ej", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass30_Sub1_9.method712(this.aLong62);
		super.finalize();
	}
}
