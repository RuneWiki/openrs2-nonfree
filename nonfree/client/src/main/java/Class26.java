import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public final class Class26 {

	@OriginalMember(owner = "client!bh", name = "f", descriptor = "Lclient!ih;")
	private final Class106_Sub2 aClass106_Sub2_8;

	@OriginalMember(owner = "client!bh", name = "e", descriptor = "I")
	public final int anInt663;

	@OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(Lclient!ih;II)V")
	public Class26(@OriginalArg(0) Class106_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass106_Sub2_8 = arg0;
		this.anInt663 = arg2;
	}

	@OriginalMember(owner = "client!bh", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass106_Sub2_8.method2892(this.anInt663);
		super.finalize();
	}
}
