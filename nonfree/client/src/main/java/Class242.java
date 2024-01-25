import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public final class Class242 {

	@OriginalMember(owner = "client!ud", name = "f", descriptor = "I")
	public final int anInt6561;

	@OriginalMember(owner = "client!ud", name = "h", descriptor = "Lclient!pg;")
	private final Class163_Sub2 aClass163_Sub2_39;

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Lclient!pg;II)V")
	public Class242(@OriginalArg(0) Class163_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt6561 = arg2;
		this.aClass163_Sub2_39 = arg0;
	}

	@OriginalMember(owner = "client!ud", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass163_Sub2_39.method4127(this.anInt6561);
		super.finalize();
	}
}
