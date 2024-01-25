import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public final class Class81 {

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "Lclient!hd;")
	private final Class89_Sub1 aClass89_Sub1_17;

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "I")
	public final int anInt2398;

	@OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(Lclient!hd;I[Lclient!ln;)V")
	public Class81(@OriginalArg(0) Class89_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class132[] arg2) {
		this.aClass89_Sub1_17 = arg0;
		this.anInt2398 = arg1;
	}

	@OriginalMember(owner = "client!ge", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass89_Sub1_17.method2411(this.anInt2398);
		super.finalize();
	}
}
