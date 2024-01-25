import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qaa")
public final class Class264 {

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "Lclient!qi;")
	private final Class12_Sub2_Sub2 aClass12_Sub2_Sub2_9;

	@OriginalMember(owner = "client!qaa", name = "f", descriptor = "I")
	public final int anInt7124;

	@OriginalMember(owner = "client!qaa", name = "<init>", descriptor = "(Lclient!qi;II)V")
	public Class264(@OriginalArg(0) Class12_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass12_Sub2_Sub2_9 = arg0;
		this.anInt7124 = arg2;
	}

	@OriginalMember(owner = "client!qaa", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass12_Sub2_Sub2_9.method6288(this.anInt7124);
		super.finalize();
	}
}
