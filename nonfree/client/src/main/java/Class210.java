import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public final class Class210 {

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "Lclient!uca;")
	private final Class162_Sub3 aClass162_Sub3_24;

	@OriginalMember(owner = "client!lk", name = "e", descriptor = "I")
	public final int anInt5074;

	@OriginalMember(owner = "client!lk", name = "<init>", descriptor = "(Lclient!uca;II)V")
	public Class210(@OriginalArg(0) Class162_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass162_Sub3_24 = arg0;
		this.anInt5074 = arg2;
	}

	@OriginalMember(owner = "client!lk", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass162_Sub3_24.method6960(this.anInt5074);
		super.finalize();
	}
}
