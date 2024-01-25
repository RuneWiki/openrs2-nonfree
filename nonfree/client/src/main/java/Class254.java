import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public final class Class254 {

	@OriginalMember(owner = "client!vl", name = "d", descriptor = "I")
	public final int anInt7126;

	@OriginalMember(owner = "client!vl", name = "c", descriptor = "Lclient!bv;")
	private final Class30_Sub1 aClass30_Sub1_43;

	@OriginalMember(owner = "client!vl", name = "<init>", descriptor = "(Lclient!bv;II)V")
	public Class254(@OriginalArg(0) Class30_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt7126 = arg2;
		this.aClass30_Sub1_43 = arg0;
	}

	@OriginalMember(owner = "client!vl", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass30_Sub1_43.method947(this.anInt7126);
		super.finalize();
	}
}
