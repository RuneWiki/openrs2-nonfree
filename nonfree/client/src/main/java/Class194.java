import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public final class Class194 {

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "Lclient!ql;")
	private final Class92_Sub2 aClass92_Sub2_37;

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "I")
	public final int anInt6038;

	@OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(Lclient!ql;I[Lclient!oj;)V")
	public Class194(@OriginalArg(0) Class92_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class146[] arg2) {
		this.aClass92_Sub2_37 = arg0;
		this.anInt6038 = arg1;
	}

	@OriginalMember(owner = "client!ta", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass92_Sub2_37.method4609(this.anInt6038);
		super.finalize();
	}
}
