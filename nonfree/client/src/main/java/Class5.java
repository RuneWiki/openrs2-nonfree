import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public final class Class5 {

	@OriginalMember(owner = "client!ae", name = "h", descriptor = "I")
	public final int anInt21;

	@OriginalMember(owner = "client!ae", name = "i", descriptor = "Lclient!vd;")
	private final Class51_Sub2 aClass51_Sub2_2;

	@OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(Lclient!vd;II)V")
	public Class5(@OriginalArg(0) Class51_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt21 = arg2;
		this.aClass51_Sub2_2 = arg0;
	}

	@OriginalMember(owner = "client!ae", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass51_Sub2_2.method5377(this.anInt21);
		super.finalize();
	}
}
