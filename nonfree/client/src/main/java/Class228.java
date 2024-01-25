import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public final class Class228 {

	@OriginalMember(owner = "client!ll", name = "b", descriptor = "I")
	public final int anInt6206;

	@OriginalMember(owner = "client!ll", name = "d", descriptor = "Lclient!oia;")
	private final Class16_Sub1_Sub2 aClass16_Sub1_Sub2_5;

	@OriginalMember(owner = "client!ll", name = "<init>", descriptor = "(Lclient!oia;II)V")
	public Class228(@OriginalArg(0) Class16_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt6206 = arg2;
		this.aClass16_Sub1_Sub2_5 = arg0;
	}

	@OriginalMember(owner = "client!ll", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass16_Sub1_Sub2_5.method6334(this.anInt6206);
		super.finalize();
	}
}
