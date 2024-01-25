import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public final class Class153 {

	@OriginalMember(owner = "client!mc", name = "i", descriptor = "I")
	public final int anInt4346;

	@OriginalMember(owner = "client!mc", name = "g", descriptor = "Lclient!ht;")
	private final Class109_Sub1 aClass109_Sub1_32;

	@OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(Lclient!ht;II)V")
	public Class153(@OriginalArg(0) Class109_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt4346 = arg2;
		this.aClass109_Sub1_32 = arg0;
	}

	@OriginalMember(owner = "client!mc", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass109_Sub1_32.method2542(this.anInt4346);
		super.finalize();
	}
}
