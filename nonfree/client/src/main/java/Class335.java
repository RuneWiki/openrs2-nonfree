import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public final class Class335 {

	@OriginalMember(owner = "client!vl", name = "d", descriptor = "I")
	public final int anInt9209;

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "Lclient!pea;")
	private final Class121_Sub3 aClass121_Sub3_42;

	@OriginalMember(owner = "client!vl", name = "<init>", descriptor = "(Lclient!pea;II)V")
	public Class335(@OriginalArg(0) Class121_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt9209 = arg2;
		this.aClass121_Sub3_42 = arg0;
	}

	@OriginalMember(owner = "client!vl", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass121_Sub3_42.method5661(this.anInt9209);
		super.finalize();
	}
}
