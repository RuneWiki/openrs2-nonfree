import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public final class Class93 {

	@OriginalMember(owner = "client!hg", name = "b", descriptor = "Lclient!fu;")
	private final Class63_Sub2 aClass63_Sub2_18;

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "I")
	public final int anInt2614;

	@OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(Lclient!fu;II)V")
	public Class93(@OriginalArg(0) Class63_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass63_Sub2_18 = arg0;
		this.anInt2614 = arg2;
	}

	@OriginalMember(owner = "client!hg", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass63_Sub2_18.method2123(this.anInt2614);
		super.finalize();
	}
}
