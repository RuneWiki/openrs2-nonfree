import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hr")
public final class Class97 {

	@OriginalMember(owner = "client!hr", name = "c", descriptor = "Lclient!cg;")
	private final Class37_Sub1 aClass37_Sub1_15;

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "I")
	public final int anInt2807;

	@OriginalMember(owner = "client!hr", name = "<init>", descriptor = "(Lclient!cg;II)V")
	public Class97(@OriginalArg(0) Class37_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass37_Sub1_15 = arg0;
		this.anInt2807 = arg2;
	}

	@OriginalMember(owner = "client!hr", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass37_Sub1_15.method762(this.anInt2807);
		super.finalize();
	}
}
