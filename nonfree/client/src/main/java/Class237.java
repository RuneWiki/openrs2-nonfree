import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public final class Class237 {

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "Lclient!ic;")
	private final Class48_Sub2 aClass48_Sub2_38;

	@OriginalMember(owner = "client!vc", name = "c", descriptor = "I")
	public final int anInt6612;

	@OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(Lclient!ic;II)V")
	public Class237(@OriginalArg(0) Class48_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass48_Sub2_38 = arg0;
		this.anInt6612 = arg2;
	}

	@OriginalMember(owner = "client!vc", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass48_Sub2_38.method2574(this.anInt6612);
		super.finalize();
	}
}
