import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public final class Class37 {

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "Lclient!mi;")
	private final Class155_Sub1 aClass155_Sub1_9;

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "I")
	public final int anInt731;

	@OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(Lclient!mi;I[Lclient!wi;)V")
	public Class37(@OriginalArg(0) Class155_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class247[] arg2) {
		this.aClass155_Sub1_9 = arg0;
		this.anInt731 = arg1;
	}

	@OriginalMember(owner = "client!cd", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass155_Sub1_9.method3623(this.anInt731);
		super.finalize();
	}
}
