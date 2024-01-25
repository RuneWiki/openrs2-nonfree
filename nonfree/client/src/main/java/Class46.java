import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dr")
public final class Class46 {

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "Lclient!h;")
	private final Class32_Sub2 aClass32_Sub2_11;

	@OriginalMember(owner = "client!dr", name = "b", descriptor = "I")
	public final int anInt1753;

	@OriginalMember(owner = "client!dr", name = "<init>", descriptor = "(Lclient!h;II)V")
	public Class46(@OriginalArg(0) Class32_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass32_Sub2_11 = arg0;
		this.anInt1753 = arg1;
	}

	@OriginalMember(owner = "client!dr", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass32_Sub2_11.method2296(this.anInt1753);
		super.finalize();
	}
}
