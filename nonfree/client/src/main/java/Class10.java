import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!afa")
public final class Class10 {

	@OriginalMember(owner = "client!afa", name = "d", descriptor = "I")
	public final int anInt142;

	@OriginalMember(owner = "client!afa", name = "b", descriptor = "Lclient!en;")
	private final Class90_Sub1 aClass90_Sub1_3;

	@OriginalMember(owner = "client!afa", name = "<init>", descriptor = "(Lclient!en;II)V")
	public Class10(@OriginalArg(0) Class90_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt142 = arg2;
		this.aClass90_Sub1_3 = arg0;
	}

	@OriginalMember(owner = "client!afa", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass90_Sub1_3.method2115(this.anInt142);
		super.finalize();
	}
}
