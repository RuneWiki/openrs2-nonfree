import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nw")
public final class Class255 {

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "J")
	public final long aLong209;

	@OriginalMember(owner = "client!nw", name = "g", descriptor = "Lclient!fc;")
	private final Class101_Sub1_Sub1 aClass101_Sub1_Sub1_9;

	@OriginalMember(owner = "client!nw", name = "<init>", descriptor = "(Lclient!fc;J[Lclient!fo;)V")
	public Class255(@OriginalArg(0) Class101_Sub1_Sub1 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class110[] arg2) {
		this.aLong209 = arg1;
		this.aClass101_Sub1_Sub1_9 = arg0;
	}

	@OriginalMember(owner = "client!nw", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass101_Sub1_Sub1_9.method3146(this.aLong209);
		super.finalize();
	}
}
