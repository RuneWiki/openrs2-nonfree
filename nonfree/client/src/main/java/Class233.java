import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ut")
public final class Class233 {

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "Lclient!qi;")
	private final Class82_Sub2 aClass82_Sub2_41;

	@OriginalMember(owner = "client!ut", name = "c", descriptor = "I")
	public final int anInt6351;

	@OriginalMember(owner = "client!ut", name = "<init>", descriptor = "(Lclient!qi;II)V")
	public Class233(@OriginalArg(0) Class82_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass82_Sub2_41 = arg0;
		this.anInt6351 = arg2;
	}

	@OriginalMember(owner = "client!ut", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass82_Sub2_41.method4589(this.anInt6351);
		super.finalize();
	}
}
