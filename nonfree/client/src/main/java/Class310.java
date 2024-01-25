import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ru")
public final class Class310 {

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "I")
	public final int anInt8815;

	@OriginalMember(owner = "client!ru", name = "b", descriptor = "Lclient!pa;")
	private final Class13_Sub1_Sub1 aClass13_Sub1_Sub1_10;

	@OriginalMember(owner = "client!ru", name = "<init>", descriptor = "(Lclient!pa;II)V")
	public Class310(@OriginalArg(0) Class13_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt8815 = arg2;
		this.aClass13_Sub1_Sub1_10 = arg0;
	}

	@OriginalMember(owner = "client!ru", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass13_Sub1_Sub1_10.method6529(this.anInt8815);
		super.finalize();
	}
}
