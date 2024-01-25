import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ow")
public final class Class266 {

	@OriginalMember(owner = "client!ow", name = "c", descriptor = "Lclient!laa;")
	private final Class126_Sub2_Sub1 aClass126_Sub2_Sub1_10;

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "I")
	public final int anInt7168;

	@OriginalMember(owner = "client!ow", name = "<init>", descriptor = "(Lclient!laa;II)V")
	public Class266(@OriginalArg(0) Class126_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass126_Sub2_Sub1_10 = arg0;
		this.anInt7168 = arg2;
	}

	@OriginalMember(owner = "client!ow", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass126_Sub2_Sub1_10.method4916(this.anInt7168);
		super.finalize();
	}
}
