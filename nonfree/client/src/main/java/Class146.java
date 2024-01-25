import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public final class Class146 {

	@OriginalMember(owner = "client!oj", name = "b", descriptor = "Lclient!ql;")
	private final Class92_Sub2 aClass92_Sub2_25;

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "I")
	public final int anInt4765;

	@OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(Lclient!ql;II)V")
	public Class146(@OriginalArg(0) Class92_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass92_Sub2_25 = arg0;
		this.anInt4765 = arg1;
	}

	@OriginalMember(owner = "client!oj", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass92_Sub2_25.method4609(this.anInt4765);
		super.finalize();
	}
}
