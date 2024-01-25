import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public final class Class99 {

	@OriginalMember(owner = "client!i", name = "c", descriptor = "Lclient!tb;")
	private final Class129_Sub2 aClass129_Sub2_16;

	@OriginalMember(owner = "client!i", name = "a", descriptor = "I")
	public final int anInt2289;

	@OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Lclient!tb;II)V")
	public Class99(@OriginalArg(0) Class129_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass129_Sub2_16 = arg0;
		this.anInt2289 = arg1;
	}

	@OriginalMember(owner = "client!i", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass129_Sub2_16.method5101(this.anInt2289);
		super.finalize();
	}
}
