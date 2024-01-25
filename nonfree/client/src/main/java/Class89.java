import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public final class Class89 {

	@OriginalMember(owner = "client!hc", name = "c", descriptor = "Lclient!ge;")
	private final Class81_Sub1 aClass81_Sub1_20;

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "I")
	public final int anInt2085;

	@OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(Lclient!ge;II)V")
	public Class89(@OriginalArg(0) Class81_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass81_Sub1_20 = arg0;
		this.anInt2085 = arg1;
	}

	@OriginalMember(owner = "client!hc", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass81_Sub1_20.method1977(this.anInt2085);
		super.finalize();
	}
}
