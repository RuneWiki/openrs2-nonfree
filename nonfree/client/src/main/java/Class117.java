import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public final class Class117 {

	@OriginalMember(owner = "client!j", name = "b", descriptor = "I")
	public final int anInt3679;

	@OriginalMember(owner = "client!j", name = "a", descriptor = "Lclient!bt;")
	private final Class30_Sub1 aClass30_Sub1_18;

	@OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Lclient!bt;II)V")
	public Class117(@OriginalArg(0) Class30_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt3679 = arg2;
		this.aClass30_Sub1_18 = arg0;
	}

	@OriginalMember(owner = "client!j", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass30_Sub1_18.method742(this.anInt3679);
		super.finalize();
	}
}
