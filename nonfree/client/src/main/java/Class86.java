import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gt")
public final class Class86 {

	@OriginalMember(owner = "client!gt", name = "b", descriptor = "Lclient!cg;")
	private final Class37_Sub1 aClass37_Sub1_14;

	@OriginalMember(owner = "client!gt", name = "c", descriptor = "I")
	public final int anInt2468;

	@OriginalMember(owner = "client!gt", name = "<init>", descriptor = "(Lclient!cg;II)V")
	public Class86(@OriginalArg(0) Class37_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass37_Sub1_14 = arg0;
		this.anInt2468 = arg1;
	}

	@OriginalMember(owner = "client!gt", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass37_Sub1_14.method799(this.anInt2468);
		super.finalize();
	}
}
