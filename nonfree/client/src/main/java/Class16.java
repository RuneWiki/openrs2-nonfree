import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public final class Class16 {

	@OriginalMember(owner = "client!b", name = "b", descriptor = "Lclient!po;")
	private final Class59_Sub1 aClass59_Sub1_5;

	@OriginalMember(owner = "client!b", name = "a", descriptor = "I")
	public final int anInt469;

	@OriginalMember(owner = "client!b", name = "<init>", descriptor = "(Lclient!po;II)V")
	public Class16(@OriginalArg(0) Class59_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass59_Sub1_5 = arg0;
		this.anInt469 = arg1;
	}

	@OriginalMember(owner = "client!b", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass59_Sub1_5.method4270(this.anInt469);
		super.finalize();
	}
}
