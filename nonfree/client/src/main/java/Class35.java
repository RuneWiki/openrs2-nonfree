import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public final class Class35 {

	@OriginalMember(owner = "client!bj", name = "d", descriptor = "Lclient!qj;")
	private final Class100_Sub3 aClass100_Sub3_7;

	@OriginalMember(owner = "client!bj", name = "c", descriptor = "I")
	public final int anInt1013;

	@OriginalMember(owner = "client!bj", name = "<init>", descriptor = "(Lclient!qj;II)V")
	public Class35(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass100_Sub3_7 = arg0;
		this.anInt1013 = arg2;
	}

	@OriginalMember(owner = "client!bj", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass100_Sub3_7.method6263(this.anInt1013);
		super.finalize();
	}
}
