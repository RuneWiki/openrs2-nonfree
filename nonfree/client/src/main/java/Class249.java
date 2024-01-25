import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oha")
public final class Class249 {

	@OriginalMember(owner = "client!oha", name = "c", descriptor = "I")
	public final int anInt6326;

	@OriginalMember(owner = "client!oha", name = "d", descriptor = "Lclient!sb;")
	private final Class95_Sub3_Sub2 aClass95_Sub3_Sub2_9;

	@OriginalMember(owner = "client!oha", name = "<init>", descriptor = "(Lclient!sb;II)V")
	public Class249(@OriginalArg(0) Class95_Sub3_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt6326 = arg2;
		this.aClass95_Sub3_Sub2_9 = arg0;
	}

	@OriginalMember(owner = "client!oha", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass95_Sub3_Sub2_9.method7150(this.anInt6326);
		super.finalize();
	}
}
