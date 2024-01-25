import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hr")
public final class Class101 {

	@OriginalMember(owner = "client!hr", name = "b", descriptor = "Lclient!ic;")
	private final Class48_Sub2 aClass48_Sub2_13;

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "I")
	public final int anInt2948;

	@OriginalMember(owner = "client!hr", name = "<init>", descriptor = "(Lclient!ic;II)V")
	public Class101(@OriginalArg(0) Class48_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass48_Sub2_13 = arg0;
		this.anInt2948 = arg1;
	}

	@OriginalMember(owner = "client!hr", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass48_Sub2_13.method2572(this.anInt2948);
		super.finalize();
	}
}
