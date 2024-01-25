import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public final class Class149 {

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "Lclient!sq;")
	private final Class46_Sub2 aClass46_Sub2_26;

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "I")
	public final int anInt4221;

	@OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(Lclient!sq;II)V")
	public Class149(@OriginalArg(0) Class46_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass46_Sub2_26 = arg0;
		this.anInt4221 = arg2;
	}

	@OriginalMember(owner = "client!nh", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass46_Sub2_26.method5257(this.anInt4221);
		super.finalize();
	}
}
