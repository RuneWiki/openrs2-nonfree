import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public final class Class233 {

	@OriginalMember(owner = "client!th", name = "d", descriptor = "Lclient!rl;")
	private final Class66_Sub2 aClass66_Sub2_37;

	@OriginalMember(owner = "client!th", name = "c", descriptor = "I")
	public final int anInt6787;

	@OriginalMember(owner = "client!th", name = "<init>", descriptor = "(Lclient!rl;II)V")
	public Class233(@OriginalArg(0) Class66_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass66_Sub2_37 = arg0;
		this.anInt6787 = arg2;
	}

	@OriginalMember(owner = "client!th", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass66_Sub2_37.method5100(this.anInt6787);
		super.finalize();
	}
}
