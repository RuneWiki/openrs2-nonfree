import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public final class Class219 {

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "Lclient!ks;")
	private final Class63_Sub1 aClass63_Sub1_42;

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "I")
	public final int anInt6855;

	@OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(Lclient!ks;I[Lclient!qg;)V")
	public Class219(@OriginalArg(0) Class63_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class170[] arg2) {
		this.aClass63_Sub1_42 = arg0;
		this.anInt6855 = arg1;
	}

	@OriginalMember(owner = "client!wg", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass63_Sub1_42.method3348(this.anInt6855);
		super.finalize();
	}
}
