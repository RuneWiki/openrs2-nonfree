import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mv")
public final class Class209 {

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "Lclient!gi;")
	private final Class42_Sub3 aClass42_Sub3_21;

	@OriginalMember(owner = "client!mv", name = "g", descriptor = "I")
	public final int anInt6038;

	@OriginalMember(owner = "client!mv", name = "<init>", descriptor = "(Lclient!gi;II)V")
	public Class209(@OriginalArg(0) Class42_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass42_Sub3_21 = arg0;
		this.anInt6038 = arg2;
	}

	@OriginalMember(owner = "client!mv", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass42_Sub3_21.method3212(this.anInt6038);
		super.finalize();
	}
}
