import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public final class Class112 {

	@OriginalMember(owner = "client!ik", name = "e", descriptor = "Lclient!ur;")
	private final Class34_Sub2 aClass34_Sub2_20;

	@OriginalMember(owner = "client!ik", name = "d", descriptor = "I")
	public final int anInt2818;

	@OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(Lclient!ur;II)V")
	public Class112(@OriginalArg(0) Class34_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass34_Sub2_20 = arg0;
		this.anInt2818 = arg2;
	}

	@OriginalMember(owner = "client!ik", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass34_Sub2_20.method5510(this.anInt2818);
		super.finalize();
	}
}
