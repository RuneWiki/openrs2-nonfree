import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sq")
public final class Class185 {

	@OriginalMember(owner = "client!sq", name = "c", descriptor = "Lclient!tb;")
	private final Class129_Sub2 aClass129_Sub2_36;

	@OriginalMember(owner = "client!sq", name = "b", descriptor = "I")
	public final int anInt5819;

	@OriginalMember(owner = "client!sq", name = "<init>", descriptor = "(Lclient!tb;II)V")
	public Class185(@OriginalArg(0) Class129_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass129_Sub2_36 = arg0;
		this.anInt5819 = arg2;
	}

	@OriginalMember(owner = "client!sq", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass129_Sub2_36.method5071(this.anInt5819);
		super.finalize();
	}
}
