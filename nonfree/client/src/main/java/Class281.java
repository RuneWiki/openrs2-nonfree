import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public final class Class281 {

	@OriginalMember(owner = "client!qn", name = "g", descriptor = "Lclient!kfa;")
	private final Class7_Sub2 aClass7_Sub2_36;

	@OriginalMember(owner = "client!qn", name = "f", descriptor = "J")
	public final long aLong222;

	@OriginalMember(owner = "client!qn", name = "<init>", descriptor = "(Lclient!kfa;J[Lclient!afa;)V")
	public Class281(@OriginalArg(0) Class7_Sub2 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class11[] arg2) {
		this.aClass7_Sub2_36 = arg0;
		this.aLong222 = arg1;
	}

	@OriginalMember(owner = "client!qn", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass7_Sub2_36.method4351(this.aLong222);
		super.finalize();
	}
}
