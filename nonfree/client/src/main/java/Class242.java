import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public final class Class242 {

	@OriginalMember(owner = "client!w", name = "c", descriptor = "Lclient!ic;")
	private final Class48_Sub2 aClass48_Sub2_40;

	@OriginalMember(owner = "client!w", name = "b", descriptor = "I")
	public final int anInt6903;

	@OriginalMember(owner = "client!w", name = "<init>", descriptor = "(Lclient!ic;I[Lclient!hr;)V")
	public Class242(@OriginalArg(0) Class48_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class101[] arg2) {
		this.aClass48_Sub2_40 = arg0;
		this.anInt6903 = arg1;
	}

	@OriginalMember(owner = "client!w", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass48_Sub2_40.method2572(this.anInt6903);
		super.finalize();
	}
}
