import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iu")
public final class Class173 {

	@OriginalMember(owner = "client!iu", name = "b", descriptor = "I")
	public final int anInt4121;

	@OriginalMember(owner = "client!iu", name = "d", descriptor = "Lclient!kv;")
	private final Class143_Sub2 aClass143_Sub2_25;

	@OriginalMember(owner = "client!iu", name = "<init>", descriptor = "(Lclient!kv;II)V")
	public Class173(@OriginalArg(0) Class143_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt4121 = arg2;
		this.aClass143_Sub2_25 = arg0;
	}

	@OriginalMember(owner = "client!iu", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass143_Sub2_25.method4958(this.anInt4121);
		super.finalize();
	}
}
