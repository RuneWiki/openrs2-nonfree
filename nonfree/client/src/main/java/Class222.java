import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public final class Class222 {

	@OriginalMember(owner = "client!nm", name = "g", descriptor = "Lclient!el;")
	private final Class14_Sub2_Sub1 aClass14_Sub2_Sub1_8;

	@OriginalMember(owner = "client!nm", name = "b", descriptor = "I")
	public final int anInt6207;

	@OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(Lclient!el;II)V")
	public Class222(@OriginalArg(0) Class14_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass14_Sub2_Sub1_8 = arg0;
		this.anInt6207 = arg2;
	}

	@OriginalMember(owner = "client!nm", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass14_Sub2_Sub1_8.method2481(this.anInt6207);
		super.finalize();
	}
}
