import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nba")
public final class Class233 {

	@OriginalMember(owner = "client!nba", name = "d", descriptor = "J")
	public final long aLong160;

	@OriginalMember(owner = "client!nba", name = "g", descriptor = "Lclient!uca;")
	private final Class162_Sub3 aClass162_Sub3_27;

	@OriginalMember(owner = "client!nba", name = "<init>", descriptor = "(Lclient!uca;J[Lclient!g;)V")
	public Class233(@OriginalArg(0) Class162_Sub3 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class118[] arg2) {
		this.aLong160 = arg1;
		this.aClass162_Sub3_27 = arg0;
	}

	@OriginalMember(owner = "client!nba", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass162_Sub3_27.method6959(this.aLong160);
		super.finalize();
	}
}
