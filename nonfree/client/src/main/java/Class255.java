import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public final class Class255 {

	@OriginalMember(owner = "client!nl", name = "g", descriptor = "I")
	public final int anInt6730;

	@OriginalMember(owner = "client!nl", name = "c", descriptor = "Lclient!vf;")
	private final Class100_Sub3 aClass100_Sub3_30;

	@OriginalMember(owner = "client!nl", name = "<init>", descriptor = "(Lclient!vf;II)V")
	public Class255(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt6730 = arg2;
		this.aClass100_Sub3_30 = arg0;
	}

	@OriginalMember(owner = "client!nl", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass100_Sub3_30.method8688(this.anInt6730);
		super.finalize();
	}
}
