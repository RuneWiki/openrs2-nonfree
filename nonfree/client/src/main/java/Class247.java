import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public final class Class247 {

	@OriginalMember(owner = "client!wi", name = "c", descriptor = "Lclient!mi;")
	private final Class155_Sub1 aClass155_Sub1_41;

	@OriginalMember(owner = "client!wi", name = "b", descriptor = "I")
	public final int anInt6436;

	@OriginalMember(owner = "client!wi", name = "<init>", descriptor = "(Lclient!mi;II)V")
	public Class247(@OriginalArg(0) Class155_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass155_Sub1_41 = arg0;
		this.anInt6436 = arg1;
	}

	@OriginalMember(owner = "client!wi", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass155_Sub1_41.method3623(this.anInt6436);
		super.finalize();
	}
}
